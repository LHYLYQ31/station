/**
 * Copyright 2018 SinoSoft. All Rights Reserved.
 */
package com.sinosoft.station.common.datasource;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * <B>系统名称：</B><BR>
 * <B>模块名称：</B><BR>
 * <B>中文类名：</B><BR>
 * <B>概要说明：</B><BR>
 * 
 * @author 中科软科技 lihaiyi
 * @since 2018年8月8日
 */
@Aspect

@Order(-10) //保证该AOP在@Transactional之前执行

@Component

public class DynamicDataSourceAspect {

    /*
     * @Before("@annotation(ds)")
     * 的意思是：
     * @Before：在方法执行之前进行执行：
     * @annotation(targetDataSource)：
     * 会拦截注解targetDataSource的方法，否则不拦截;
     */

    @Before("@annotation(targetDataSource)")

    public void changeDataSource(JoinPoint point, TargetDataSource targetDataSource) throws Throwable {

        //获取当前的指定的数据源;

        String dsId = targetDataSource.value();

        //如果不在我们注入的所有的数据源范围之内，那么输出警告信息，系统自动使用默认的数据源。

        if (!DynamicDataSourceContextHolder.containsDataSource(dsId)) {

            System.err.println("数据源[{}]不存在，使用默认数据源 > {}" + targetDataSource.value() + point.getSignature());

        }
        else {

            System.out.println("Use DataSource : {} > {}" + targetDataSource.value() + point.getSignature());

            //找到的话，那么设置到动态数据源上下文中。

            DynamicDataSourceContextHolder.setDataSourceType(targetDataSource.value());

        }

    }

    @After("@annotation(targetDataSource)")

    public void restoreDataSource(JoinPoint point, TargetDataSource targetDataSource) {

        System.out.println("Revert DataSource : {} > {}" + targetDataSource.value() + point.getSignature());

        //方法执行完毕之后，销毁当前数据源信息，进行垃圾回收。

        DynamicDataSourceContextHolder.clearDataSourceType();

    }

}
