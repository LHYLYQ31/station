/**
 * Copyright 2018 SinoSoft. All Rights Reserved.
 */
package com.sinosoft.station.modules.station.model;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * <B>系统名称：</B><BR>
 * <B>模块名称：</B><BR>
 * <B>中文类名：</B><BR>
 * <B>概要说明：</B><BR>
 * 
 * @author 中科软科技 lihaiyi
 * @since 2018年8月6日
 */
//@Entity
//@Table(name = "MOBILE_PDF")
public class Station implements Serializable {
    /**  */
    private static final long serialVersionUID = 7609300414148405265L;
    private String CVEHICLECODE;
    private String CVEHICLEKIND;
    private String CNUMBERPLATE;
    private String CPLATETYPE;
    private String CVIN;

    private Timestamp DREGISTER;
    private String CUSER;
    private String CADDRESS;
    private String CPHONE;
    private String CVEHICLEICARDD;

    private String CENGINENO;
    private Long NODOMETER;
    private String NVEHICLEMODELID;
    private String CNAME;
    private String NSTANDARDID;

    private String CVEHICLESTYLE;
    private Long NMAXWEIGHT;
    private Long NSTDWEIGHT;
    private String CDRIVEFORM;
    private String CGEARBOXTYPE;

    private String CFUELTYPE;
    private String CSUPPLYMODE;
    private String BHASODB;
    private String BHASPURGE;
    private String BISDIANPEN;

    private String COGRMODEL;
    private String CCARORTRUCK;
    private Long NSEATORTONNAGE;
    private String CPURGEMODEL1;
    private String CPURGEMODEL2;

    private String COSENSORMODEL1;
    private String COSENSORMODEL2;
    private String CSPURTPUMP;
    private String CSPURTSET;
    private String CSUPERCHARGER;

    private String CENGINEMODEL;
    private Long NORDAINREV;
    private Long NLETOUT;
    private Long NORDAINPOWER;
    private Long NCYLINDER;

    private String CADMISSION;
    private Long NBIGPOWER24;
    private Long NSMALLPOWER24;
    private Long NBIGPOWER40;
    private Long NSMALLPOWER40;

    private Long NPOWERSCANSCOPE;
    private String CPURPOSEID;
    private String BISREBUILD;
    private String BWORKCAR;
    private String BISSPECIALTIES;

    private String BISSPECIALTIESSETTINGS;
    private String NSPECIALSIGNTYPEID;
    private String BISSTAYREPEAL;
    private String BISAVOIDCHECK;
    private String CREPEALYEAR;

    private String NSUPREPEALYEAR;
    private Long NNOCHECKOUTTIMES;
    private String BISCHECKOUT;
    private String BISSENDSIGN;
    private Timestamp DSIGNDATE;

    private String CVALIDDATE;
    private String CCHECKPERSONCODE;
    private String CUNITCODE;
    private String CNEARUNITCODE;
    private String CRFIDUNITCODE;

    private String CSIMPLEMORE;
    private String CJGVEHICLEKIND;
    private String BJGWORKCAR;
    private Long NLIMITVALUEID;
    private String CPURPOSEID2;

    private String CPURPOSEID3;
    private String CENGINEMADEFACTORY;
    private String CVEHICLEMADEFACTORY;
    private String CCHFACENO;
    private Long NWEIGHT;

    private String NSPECIALCHECKPERIODID;
    private String ISSPECIALCARREASON;
    private String EXT_COL1;
    private String EXT_COL2;
    private String EXT_COL3;

    private Long EXT_COL4;
    private String COUNTRY;
    private String ORIGINAL_SIGNCODE;
    private Timestamp DWQCHECKDATE;
    private String EXT_COL5;

    private String EXT_COL6;
    private String EXT_COL7;
    private String EXT_COL8;
    private String EXT_COL9;
    private String EXT_COL10;

    private String NSIGNTYPEFB;
    private Long PERIODCHECKS;
    private Long PERIODCHECKTIMES;
    private String ISORIGINALISCHECKOUT;
    private String TECHNOLOGYPSNCODE;

    private String ISCHANGESIGN;
    private String SIGNSTATUS;
    private String VEHICLECLASSIFICATION;
    private Timestamp EXCHANGE;
    private Timestamp DMANUFACTUREDATE;

    private String ZMFS;

    public String getCVEHICLECODE() {
        return CVEHICLECODE;
    }

    public String getCVEHICLEKIND() {
        return CVEHICLEKIND;
    }

    public String getCNUMBERPLATE() {
        return CNUMBERPLATE;
    }

    public String getCPLATETYPE() {
        return CPLATETYPE;
    }

    public String getCVIN() {
        return CVIN;
    }

    public Timestamp getDREGISTER() {
        return DREGISTER;
    }

    public String getCUSER() {
        return CUSER;
    }

    public String getCADDRESS() {
        return CADDRESS;
    }

    public String getCPHONE() {
        return CPHONE;
    }

    public String getCVEHICLEICARDD() {
        return CVEHICLEICARDD;
    }

    public String getCENGINENO() {
        return CENGINENO;
    }

    public Long getNODOMETER() {
        return NODOMETER;
    }

    public String getNVEHICLEMODELID() {
        return NVEHICLEMODELID;
    }

    public String getCNAME() {
        return CNAME;
    }

    public String getNSTANDARDID() {
        return NSTANDARDID;
    }

    public String getCVEHICLESTYLE() {
        return CVEHICLESTYLE;
    }

    public Long getNMAXWEIGHT() {
        return NMAXWEIGHT;
    }

    public Long getNSTDWEIGHT() {
        return NSTDWEIGHT;
    }

    public String getCDRIVEFORM() {
        return CDRIVEFORM;
    }

    public String getCGEARBOXTYPE() {
        return CGEARBOXTYPE;
    }

    public String getCFUELTYPE() {
        return CFUELTYPE;
    }

    public String getCSUPPLYMODE() {
        return CSUPPLYMODE;
    }

    public String getBHASODB() {
        return BHASODB;
    }

    public String getBHASPURGE() {
        return BHASPURGE;
    }

    public String getBISDIANPEN() {
        return BISDIANPEN;
    }

    public String getCOGRMODEL() {
        return COGRMODEL;
    }

    public String getCCARORTRUCK() {
        return CCARORTRUCK;
    }

    public Long getNSEATORTONNAGE() {
        return NSEATORTONNAGE;
    }

    public String getCPURGEMODEL1() {
        return CPURGEMODEL1;
    }

    public String getCPURGEMODEL2() {
        return CPURGEMODEL2;
    }

    public String getCOSENSORMODEL1() {
        return COSENSORMODEL1;
    }

    public String getCOSENSORMODEL2() {
        return COSENSORMODEL2;
    }

    public String getCSPURTPUMP() {
        return CSPURTPUMP;
    }

    public String getCSPURTSET() {
        return CSPURTSET;
    }

    public String getCSUPERCHARGER() {
        return CSUPERCHARGER;
    }

    public String getCENGINEMODEL() {
        return CENGINEMODEL;
    }

    public Long getNORDAINREV() {
        return NORDAINREV;
    }

    public Long getNLETOUT() {
        return NLETOUT;
    }

    public Long getNORDAINPOWER() {
        return NORDAINPOWER;
    }

    public Long getNCYLINDER() {
        return NCYLINDER;
    }

    public String getCADMISSION() {
        return CADMISSION;
    }

    public Long getNBIGPOWER24() {
        return NBIGPOWER24;
    }

    public Long getNSMALLPOWER24() {
        return NSMALLPOWER24;
    }

    public Long getNBIGPOWER40() {
        return NBIGPOWER40;
    }

    public Long getNSMALLPOWER40() {
        return NSMALLPOWER40;
    }

    public Long getNPOWERSCANSCOPE() {
        return NPOWERSCANSCOPE;
    }

    public String getCPURPOSEID() {
        return CPURPOSEID;
    }

    public String getBISREBUILD() {
        return BISREBUILD;
    }

    public String getBWORKCAR() {
        return BWORKCAR;
    }

    public String getBISSPECIALTIES() {
        return BISSPECIALTIES;
    }

    public String getBISSPECIALTIESSETTINGS() {
        return BISSPECIALTIESSETTINGS;
    }

    public String getNSPECIALSIGNTYPEID() {
        return NSPECIALSIGNTYPEID;
    }

    public String getBISSTAYREPEAL() {
        return BISSTAYREPEAL;
    }

    public String getBISAVOIDCHECK() {
        return BISAVOIDCHECK;
    }

    public String getCREPEALYEAR() {
        return CREPEALYEAR;
    }

    public String getNSUPREPEALYEAR() {
        return NSUPREPEALYEAR;
    }

    public Long getNNOCHECKOUTTIMES() {
        return NNOCHECKOUTTIMES;
    }

    public String getBISCHECKOUT() {
        return BISCHECKOUT;
    }

    public String getBISSENDSIGN() {
        return BISSENDSIGN;
    }

    public Timestamp getDSIGNDATE() {
        return DSIGNDATE;
    }

    public String getCVALIDDATE() {
        return CVALIDDATE;
    }

    public String getCCHECKPERSONCODE() {
        return CCHECKPERSONCODE;
    }

    public String getCUNITCODE() {
        return CUNITCODE;
    }

    public String getCNEARUNITCODE() {
        return CNEARUNITCODE;
    }

    public String getCRFIDUNITCODE() {
        return CRFIDUNITCODE;
    }

    public String getCSIMPLEMORE() {
        return CSIMPLEMORE;
    }

    public String getCJGVEHICLEKIND() {
        return CJGVEHICLEKIND;
    }

    public String getBJGWORKCAR() {
        return BJGWORKCAR;
    }

    public Long getNLIMITVALUEID() {
        return NLIMITVALUEID;
    }

    public String getCPURPOSEID2() {
        return CPURPOSEID2;
    }

    public String getCPURPOSEID3() {
        return CPURPOSEID3;
    }

    public String getCENGINEMADEFACTORY() {
        return CENGINEMADEFACTORY;
    }

    public String getCVEHICLEMADEFACTORY() {
        return CVEHICLEMADEFACTORY;
    }

    public String getCCHFACENO() {
        return CCHFACENO;
    }

    public Long getNWEIGHT() {
        return NWEIGHT;
    }

    public String getNSPECIALCHECKPERIODID() {
        return NSPECIALCHECKPERIODID;
    }

    public String getISSPECIALCARREASON() {
        return ISSPECIALCARREASON;
    }

    public String getEXT_COL1() {
        return EXT_COL1;
    }

    public String getEXT_COL2() {
        return EXT_COL2;
    }

    public String getEXT_COL3() {
        return EXT_COL3;
    }

    public Long getEXT_COL4() {
        return EXT_COL4;
    }

    public String getCOUNTRY() {
        return COUNTRY;
    }

    public String getORIGINAL_SIGNCODE() {
        return ORIGINAL_SIGNCODE;
    }

    public Timestamp getDWQCHECKDATE() {
        return DWQCHECKDATE;
    }

    public String getEXT_COL5() {
        return EXT_COL5;
    }

    public String getEXT_COL6() {
        return EXT_COL6;
    }

    public String getEXT_COL7() {
        return EXT_COL7;
    }

    public String getEXT_COL8() {
        return EXT_COL8;
    }

    public String getEXT_COL9() {
        return EXT_COL9;
    }

    public String getEXT_COL10() {
        return EXT_COL10;
    }

    public String getNSIGNTYPEFB() {
        return NSIGNTYPEFB;
    }

    public Long getPERIODCHECKS() {
        return PERIODCHECKS;
    }

    public Long getPERIODCHECKTIMES() {
        return PERIODCHECKTIMES;
    }

    public String getISORIGINALISCHECKOUT() {
        return ISORIGINALISCHECKOUT;
    }

    public String getTECHNOLOGYPSNCODE() {
        return TECHNOLOGYPSNCODE;
    }

    public String getISCHANGESIGN() {
        return ISCHANGESIGN;
    }

    public String getSIGNSTATUS() {
        return SIGNSTATUS;
    }

    public String getVEHICLECLASSIFICATION() {
        return VEHICLECLASSIFICATION;
    }

    public Timestamp getEXCHANGE() {
        return EXCHANGE;
    }

    public Timestamp getDMANUFACTUREDATE() {
        return DMANUFACTUREDATE;
    }

    public String getZMFS() {
        return ZMFS;
    }

    public void setCVEHICLECODE(String cVEHICLECODE) {
        CVEHICLECODE = cVEHICLECODE;
    }

    public void setCVEHICLEKIND(String cVEHICLEKIND) {
        CVEHICLEKIND = cVEHICLEKIND;
    }

    public void setCNUMBERPLATE(String cNUMBERPLATE) {
        CNUMBERPLATE = cNUMBERPLATE;
    }

    public void setCPLATETYPE(String cPLATETYPE) {
        CPLATETYPE = cPLATETYPE;
    }

    public void setCVIN(String cVIN) {
        CVIN = cVIN;
    }

    public void setDREGISTER(Timestamp dREGISTER) {
        DREGISTER = dREGISTER;
    }

    public void setCUSER(String cUSER) {
        CUSER = cUSER;
    }

    public void setCADDRESS(String cADDRESS) {
        CADDRESS = cADDRESS;
    }

    public void setCPHONE(String cPHONE) {
        CPHONE = cPHONE;
    }

    public void setCVEHICLEICARDD(String cVEHICLEICARDD) {
        CVEHICLEICARDD = cVEHICLEICARDD;
    }

    public void setCENGINENO(String cENGINENO) {
        CENGINENO = cENGINENO;
    }

    public void setNODOMETER(Long nODOMETER) {
        NODOMETER = nODOMETER;
    }

    public void setNVEHICLEMODELID(String nVEHICLEMODELID) {
        NVEHICLEMODELID = nVEHICLEMODELID;
    }

    public void setCNAME(String cNAME) {
        CNAME = cNAME;
    }

    public void setNSTANDARDID(String nSTANDARDID) {
        NSTANDARDID = nSTANDARDID;
    }

    public void setCVEHICLESTYLE(String cVEHICLESTYLE) {
        CVEHICLESTYLE = cVEHICLESTYLE;
    }

    public void setNMAXWEIGHT(Long nMAXWEIGHT) {
        NMAXWEIGHT = nMAXWEIGHT;
    }

    public void setNSTDWEIGHT(Long nSTDWEIGHT) {
        NSTDWEIGHT = nSTDWEIGHT;
    }

    public void setCDRIVEFORM(String cDRIVEFORM) {
        CDRIVEFORM = cDRIVEFORM;
    }

    public void setCGEARBOXTYPE(String cGEARBOXTYPE) {
        CGEARBOXTYPE = cGEARBOXTYPE;
    }

    public void setCFUELTYPE(String cFUELTYPE) {
        CFUELTYPE = cFUELTYPE;
    }

    public void setCSUPPLYMODE(String cSUPPLYMODE) {
        CSUPPLYMODE = cSUPPLYMODE;
    }

    public void setBHASODB(String bHASODB) {
        BHASODB = bHASODB;
    }

    public void setBHASPURGE(String bHASPURGE) {
        BHASPURGE = bHASPURGE;
    }

    public void setBISDIANPEN(String bISDIANPEN) {
        BISDIANPEN = bISDIANPEN;
    }

    public void setCOGRMODEL(String cOGRMODEL) {
        COGRMODEL = cOGRMODEL;
    }

    public void setCCARORTRUCK(String cCARORTRUCK) {
        CCARORTRUCK = cCARORTRUCK;
    }

    public void setNSEATORTONNAGE(Long nSEATORTONNAGE) {
        NSEATORTONNAGE = nSEATORTONNAGE;
    }

    public void setCPURGEMODEL1(String cPURGEMODEL1) {
        CPURGEMODEL1 = cPURGEMODEL1;
    }

    public void setCPURGEMODEL2(String cPURGEMODEL2) {
        CPURGEMODEL2 = cPURGEMODEL2;
    }

    public void setCOSENSORMODEL1(String cOSENSORMODEL1) {
        COSENSORMODEL1 = cOSENSORMODEL1;
    }

    public void setCOSENSORMODEL2(String cOSENSORMODEL2) {
        COSENSORMODEL2 = cOSENSORMODEL2;
    }

    public void setCSPURTPUMP(String cSPURTPUMP) {
        CSPURTPUMP = cSPURTPUMP;
    }

    public void setCSPURTSET(String cSPURTSET) {
        CSPURTSET = cSPURTSET;
    }

    public void setCSUPERCHARGER(String cSUPERCHARGER) {
        CSUPERCHARGER = cSUPERCHARGER;
    }

    public void setCENGINEMODEL(String cENGINEMODEL) {
        CENGINEMODEL = cENGINEMODEL;
    }

    public void setNORDAINREV(Long nORDAINREV) {
        NORDAINREV = nORDAINREV;
    }

    public void setNLETOUT(Long nLETOUT) {
        NLETOUT = nLETOUT;
    }

    public void setNORDAINPOWER(Long nORDAINPOWER) {
        NORDAINPOWER = nORDAINPOWER;
    }

    public void setNCYLINDER(Long nCYLINDER) {
        NCYLINDER = nCYLINDER;
    }

    public void setCADMISSION(String cADMISSION) {
        CADMISSION = cADMISSION;
    }

    public void setNBIGPOWER24(Long nBIGPOWER24) {
        NBIGPOWER24 = nBIGPOWER24;
    }

    public void setNSMALLPOWER24(Long nSMALLPOWER24) {
        NSMALLPOWER24 = nSMALLPOWER24;
    }

    public void setNBIGPOWER40(Long nBIGPOWER40) {
        NBIGPOWER40 = nBIGPOWER40;
    }

    public void setNSMALLPOWER40(Long nSMALLPOWER40) {
        NSMALLPOWER40 = nSMALLPOWER40;
    }

    public void setNPOWERSCANSCOPE(Long nPOWERSCANSCOPE) {
        NPOWERSCANSCOPE = nPOWERSCANSCOPE;
    }

    public void setCPURPOSEID(String cPURPOSEID) {
        CPURPOSEID = cPURPOSEID;
    }

    public void setBISREBUILD(String bISREBUILD) {
        BISREBUILD = bISREBUILD;
    }

    public void setBWORKCAR(String bWORKCAR) {
        BWORKCAR = bWORKCAR;
    }

    public void setBISSPECIALTIES(String bISSPECIALTIES) {
        BISSPECIALTIES = bISSPECIALTIES;
    }

    public void setBISSPECIALTIESSETTINGS(String bISSPECIALTIESSETTINGS) {
        BISSPECIALTIESSETTINGS = bISSPECIALTIESSETTINGS;
    }

    public void setNSPECIALSIGNTYPEID(String nSPECIALSIGNTYPEID) {
        NSPECIALSIGNTYPEID = nSPECIALSIGNTYPEID;
    }

    public void setBISSTAYREPEAL(String bISSTAYREPEAL) {
        BISSTAYREPEAL = bISSTAYREPEAL;
    }

    public void setBISAVOIDCHECK(String bISAVOIDCHECK) {
        BISAVOIDCHECK = bISAVOIDCHECK;
    }

    public void setCREPEALYEAR(String cREPEALYEAR) {
        CREPEALYEAR = cREPEALYEAR;
    }

    public void setNSUPREPEALYEAR(String nSUPREPEALYEAR) {
        NSUPREPEALYEAR = nSUPREPEALYEAR;
    }

    public void setNNOCHECKOUTTIMES(Long nNOCHECKOUTTIMES) {
        NNOCHECKOUTTIMES = nNOCHECKOUTTIMES;
    }

    public void setBISCHECKOUT(String bISCHECKOUT) {
        BISCHECKOUT = bISCHECKOUT;
    }

    public void setBISSENDSIGN(String bISSENDSIGN) {
        BISSENDSIGN = bISSENDSIGN;
    }

    public void setDSIGNDATE(Timestamp dSIGNDATE) {
        DSIGNDATE = dSIGNDATE;
    }

    public void setCVALIDDATE(String cVALIDDATE) {
        CVALIDDATE = cVALIDDATE;
    }

    public void setCCHECKPERSONCODE(String cCHECKPERSONCODE) {
        CCHECKPERSONCODE = cCHECKPERSONCODE;
    }

    public void setCUNITCODE(String cUNITCODE) {
        CUNITCODE = cUNITCODE;
    }

    public void setCNEARUNITCODE(String cNEARUNITCODE) {
        CNEARUNITCODE = cNEARUNITCODE;
    }

    public void setCRFIDUNITCODE(String cRFIDUNITCODE) {
        CRFIDUNITCODE = cRFIDUNITCODE;
    }

    public void setCSIMPLEMORE(String cSIMPLEMORE) {
        CSIMPLEMORE = cSIMPLEMORE;
    }

    public void setCJGVEHICLEKIND(String cJGVEHICLEKIND) {
        CJGVEHICLEKIND = cJGVEHICLEKIND;
    }

    public void setBJGWORKCAR(String bJGWORKCAR) {
        BJGWORKCAR = bJGWORKCAR;
    }

    public void setNLIMITVALUEID(Long nLIMITVALUEID) {
        NLIMITVALUEID = nLIMITVALUEID;
    }

    public void setCPURPOSEID2(String cPURPOSEID2) {
        CPURPOSEID2 = cPURPOSEID2;
    }

    public void setCPURPOSEID3(String cPURPOSEID3) {
        CPURPOSEID3 = cPURPOSEID3;
    }

    public void setCENGINEMADEFACTORY(String cENGINEMADEFACTORY) {
        CENGINEMADEFACTORY = cENGINEMADEFACTORY;
    }

    public void setCVEHICLEMADEFACTORY(String cVEHICLEMADEFACTORY) {
        CVEHICLEMADEFACTORY = cVEHICLEMADEFACTORY;
    }

    public void setCCHFACENO(String cCHFACENO) {
        CCHFACENO = cCHFACENO;
    }

    public void setNWEIGHT(Long nWEIGHT) {
        NWEIGHT = nWEIGHT;
    }

    public void setNSPECIALCHECKPERIODID(String nSPECIALCHECKPERIODID) {
        NSPECIALCHECKPERIODID = nSPECIALCHECKPERIODID;
    }

    public void setISSPECIALCARREASON(String iSSPECIALCARREASON) {
        ISSPECIALCARREASON = iSSPECIALCARREASON;
    }

    public void setEXT_COL1(String eXT_COL1) {
        EXT_COL1 = eXT_COL1;
    }

    public void setEXT_COL2(String eXT_COL2) {
        EXT_COL2 = eXT_COL2;
    }

    public void setEXT_COL3(String eXT_COL3) {
        EXT_COL3 = eXT_COL3;
    }

    public void setEXT_COL4(Long eXT_COL4) {
        EXT_COL4 = eXT_COL4;
    }

    public void setCOUNTRY(String cOUNTRY) {
        COUNTRY = cOUNTRY;
    }

    public void setORIGINAL_SIGNCODE(String oRIGINAL_SIGNCODE) {
        ORIGINAL_SIGNCODE = oRIGINAL_SIGNCODE;
    }

    public void setDWQCHECKDATE(Timestamp dWQCHECKDATE) {
        DWQCHECKDATE = dWQCHECKDATE;
    }

    public void setEXT_COL5(String eXT_COL5) {
        EXT_COL5 = eXT_COL5;
    }

    public void setEXT_COL6(String eXT_COL6) {
        EXT_COL6 = eXT_COL6;
    }

    public void setEXT_COL7(String eXT_COL7) {
        EXT_COL7 = eXT_COL7;
    }

    public void setEXT_COL8(String eXT_COL8) {
        EXT_COL8 = eXT_COL8;
    }

    public void setEXT_COL9(String eXT_COL9) {
        EXT_COL9 = eXT_COL9;
    }

    public void setEXT_COL10(String eXT_COL10) {
        EXT_COL10 = eXT_COL10;
    }

    public void setNSIGNTYPEFB(String nSIGNTYPEFB) {
        NSIGNTYPEFB = nSIGNTYPEFB;
    }

    public void setPERIODCHECKS(Long pERIODCHECKS) {
        PERIODCHECKS = pERIODCHECKS;
    }

    public void setPERIODCHECKTIMES(Long pERIODCHECKTIMES) {
        PERIODCHECKTIMES = pERIODCHECKTIMES;
    }

    public void setISORIGINALISCHECKOUT(String iSORIGINALISCHECKOUT) {
        ISORIGINALISCHECKOUT = iSORIGINALISCHECKOUT;
    }

    public void setTECHNOLOGYPSNCODE(String tECHNOLOGYPSNCODE) {
        TECHNOLOGYPSNCODE = tECHNOLOGYPSNCODE;
    }

    public void setISCHANGESIGN(String iSCHANGESIGN) {
        ISCHANGESIGN = iSCHANGESIGN;
    }

    public void setSIGNSTATUS(String sIGNSTATUS) {
        SIGNSTATUS = sIGNSTATUS;
    }

    public void setVEHICLECLASSIFICATION(String vEHICLECLASSIFICATION) {
        VEHICLECLASSIFICATION = vEHICLECLASSIFICATION;
    }

    public void setEXCHANGE(Timestamp eXCHANGE) {
        EXCHANGE = eXCHANGE;
    }

    public void setDMANUFACTUREDATE(Timestamp dMANUFACTUREDATE) {
        DMANUFACTUREDATE = dMANUFACTUREDATE;
    }

    public void setZMFS(String zMFS) {
        ZMFS = zMFS;
    }

    /**
     * <B>方法名称：</B><BR>
     * <B>概要说明：</B><BR>
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Station [CVEHICLECODE=" + CVEHICLECODE + ", CVEHICLEKIND=" + CVEHICLEKIND + ", CNUMBERPLATE="
                + CNUMBERPLATE + ", CPLATETYPE=" + CPLATETYPE + ", CVIN=" + CVIN + ", DREGISTER=" + DREGISTER
                + ", CUSER=" + CUSER + ", CADDRESS=" + CADDRESS + ", CPHONE=" + CPHONE + ", CVEHICLEICARDD="
                + CVEHICLEICARDD + ", CENGINENO=" + CENGINENO + ", NODOMETER=" + NODOMETER + ", NVEHICLEMODELID="
                + NVEHICLEMODELID + ", CNAME=" + CNAME + ", NSTANDARDID=" + NSTANDARDID + ", CVEHICLESTYLE="
                + CVEHICLESTYLE + ", NMAXWEIGHT=" + NMAXWEIGHT + ", NSTDWEIGHT=" + NSTDWEIGHT + ", CDRIVEFORM="
                + CDRIVEFORM + ", CGEARBOXTYPE=" + CGEARBOXTYPE + ", CFUELTYPE=" + CFUELTYPE + ", CSUPPLYMODE="
                + CSUPPLYMODE + ", BHASODB=" + BHASODB + ", BHASPURGE=" + BHASPURGE + ", BISDIANPEN=" + BISDIANPEN
                + ", COGRMODEL=" + COGRMODEL + ", CCARORTRUCK=" + CCARORTRUCK + ", NSEATORTONNAGE=" + NSEATORTONNAGE
                + ", CPURGEMODEL1=" + CPURGEMODEL1 + ", CPURGEMODEL2=" + CPURGEMODEL2 + ", COSENSORMODEL1="
                + COSENSORMODEL1 + ", COSENSORMODEL2=" + COSENSORMODEL2 + ", CSPURTPUMP=" + CSPURTPUMP + ", CSPURTSET="
                + CSPURTSET + ", CSUPERCHARGER=" + CSUPERCHARGER + ", CENGINEMODEL=" + CENGINEMODEL + ", NORDAINREV="
                + NORDAINREV + ", NLETOUT=" + NLETOUT + ", NORDAINPOWER=" + NORDAINPOWER + ", NCYLINDER=" + NCYLINDER
                + ", CADMISSION=" + CADMISSION + ", NBIGPOWER24=" + NBIGPOWER24 + ", NSMALLPOWER24=" + NSMALLPOWER24
                + ", NBIGPOWER40=" + NBIGPOWER40 + ", NSMALLPOWER40=" + NSMALLPOWER40 + ", NPOWERSCANSCOPE="
                + NPOWERSCANSCOPE + ", CPURPOSEID=" + CPURPOSEID + ", BISREBUILD=" + BISREBUILD + ", BWORKCAR="
                + BWORKCAR + ", BISSPECIALTIES=" + BISSPECIALTIES + ", BISSPECIALTIESSETTINGS=" + BISSPECIALTIESSETTINGS
                + ", NSPECIALSIGNTYPEID=" + NSPECIALSIGNTYPEID + ", BISSTAYREPEAL=" + BISSTAYREPEAL + ", BISAVOIDCHECK="
                + BISAVOIDCHECK + ", CREPEALYEAR=" + CREPEALYEAR + ", NSUPREPEALYEAR=" + NSUPREPEALYEAR
                + ", NNOCHECKOUTTIMES=" + NNOCHECKOUTTIMES + ", BISCHECKOUT=" + BISCHECKOUT + ", BISSENDSIGN="
                + BISSENDSIGN + ", DSIGNDATE=" + DSIGNDATE + ", CVALIDDATE=" + CVALIDDATE + ", CCHECKPERSONCODE="
                + CCHECKPERSONCODE + ", CUNITCODE=" + CUNITCODE + ", CNEARUNITCODE=" + CNEARUNITCODE
                + ", CRFIDUNITCODE=" + CRFIDUNITCODE + ", CSIMPLEMORE=" + CSIMPLEMORE + ", CJGVEHICLEKIND="
                + CJGVEHICLEKIND + ", BJGWORKCAR=" + BJGWORKCAR + ", NLIMITVALUEID=" + NLIMITVALUEID + ", CPURPOSEID2="
                + CPURPOSEID2 + ", CPURPOSEID3=" + CPURPOSEID3 + ", CENGINEMADEFACTORY=" + CENGINEMADEFACTORY
                + ", CVEHICLEMADEFACTORY=" + CVEHICLEMADEFACTORY + ", CCHFACENO=" + CCHFACENO + ", NWEIGHT=" + NWEIGHT
                + ", NSPECIALCHECKPERIODID=" + NSPECIALCHECKPERIODID + ", ISSPECIALCARREASON=" + ISSPECIALCARREASON
                + ", EXT_COL1=" + EXT_COL1 + ", EXT_COL2=" + EXT_COL2 + ", EXT_COL3=" + EXT_COL3 + ", EXT_COL4="
                + EXT_COL4 + ", COUNTRY=" + COUNTRY + ", ORIGINAL_SIGNCODE=" + ORIGINAL_SIGNCODE + ", DWQCHECKDATE="
                + DWQCHECKDATE + ", EXT_COL5=" + EXT_COL5 + ", EXT_COL6=" + EXT_COL6 + ", EXT_COL7=" + EXT_COL7
                + ", EXT_COL8=" + EXT_COL8 + ", EXT_COL9=" + EXT_COL9 + ", EXT_COL10=" + EXT_COL10 + ", NSIGNTYPEFB="
                + NSIGNTYPEFB + ", PERIODCHECKS=" + PERIODCHECKS + ", PERIODCHECKTIMES=" + PERIODCHECKTIMES
                + ", ISORIGINALISCHECKOUT=" + ISORIGINALISCHECKOUT + ", TECHNOLOGYPSNCODE=" + TECHNOLOGYPSNCODE
                + ", ISCHANGESIGN=" + ISCHANGESIGN + ", SIGNSTATUS=" + SIGNSTATUS + ", VEHICLECLASSIFICATION="
                + VEHICLECLASSIFICATION + ", EXCHANGE=" + EXCHANGE + ", DMANUFACTUREDATE=" + DMANUFACTUREDATE
                + ", ZMFS=" + ZMFS + "]";
    }

}
