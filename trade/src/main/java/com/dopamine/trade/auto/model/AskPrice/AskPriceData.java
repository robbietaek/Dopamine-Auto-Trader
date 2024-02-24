package com.dopamine.trade.auto.model.AskPrice;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import lombok.Data;

@Data
public class AskPriceData implements Serializable {

  private String timestamp;
  @JsonProperty("payment_currency")
  private String paymentCurrency;
  @JsonProperty("BTC")
  private AskPriceDetail BTC;
  @JsonProperty("ETH")
  private AskPriceDetail ETH;
  @JsonProperty("ETC")
  private AskPriceDetail ETC;
  @JsonProperty("XRP")
  private AskPriceDetail XRP;
  @JsonProperty("BCH")
  private AskPriceDetail BCH;
  @JsonProperty("QTUM")
  private AskPriceDetail QTUM;
  @JsonProperty("BTG")
  private AskPriceDetail BTG;
  @JsonProperty("EOS")
  private AskPriceDetail EOS;
  @JsonProperty("ICX")
  private AskPriceDetail ICX;
  @JsonProperty("TRX")
  private AskPriceDetail TRX;
  @JsonProperty("ELF")
  private AskPriceDetail ELF;
  @JsonProperty("KNC")
  private AskPriceDetail KNC;
  @JsonProperty("GLM")
  private AskPriceDetail GLM;
  @JsonProperty("ZIL")
  private AskPriceDetail ZIL;
  @JsonProperty("WAXP")
  private AskPriceDetail WAXP;
  @JsonProperty("POWR")
  private AskPriceDetail POWR;
  @JsonProperty("LRC")
  private AskPriceDetail LRC;
  @JsonProperty("STEEM")
  private AskPriceDetail STEEM;
  @JsonProperty("STRAX")
  private AskPriceDetail STRAX;
  @JsonProperty("ZRX")
  private AskPriceDetail ZRX;
  @JsonProperty("SNT")
  private AskPriceDetail SNT;
  @JsonProperty("ADA")
  private AskPriceDetail ADA;
  @JsonProperty("CTXC")
  private AskPriceDetail CTXC;
  @JsonProperty("BAT")
  private AskPriceDetail BAT;
  @JsonProperty("THETA")
  private AskPriceDetail THETA;
  @JsonProperty("LOOM")
  private AskPriceDetail LOOM;
  @JsonProperty("WAVES")
  private AskPriceDetail WAVES;
  @JsonProperty("LINK")
  private AskPriceDetail LINK;
  @JsonProperty("ENJ")
  private AskPriceDetail ENJ;
  @JsonProperty("VET")
  private AskPriceDetail VET;
  @JsonProperty("MTL")
  private AskPriceDetail MTL;
  @JsonProperty("IOST")
  private AskPriceDetail IOST;
  @JsonProperty("AMO")
  private AskPriceDetail AMO;
  @JsonProperty("BSV")
  private AskPriceDetail BSV;
  @JsonProperty("ORBS")
  private AskPriceDetail ORBS;
  @JsonProperty("TFUEL")
  private AskPriceDetail TFUEL;
  @JsonProperty("VALOR")
  private AskPriceDetail VALOR;
  @JsonProperty("CON")
  private AskPriceDetail CON;
  @JsonProperty("ANKR")
  private AskPriceDetail ANKR;
  @JsonProperty("MIX")
  private AskPriceDetail MIX;
  @JsonProperty("CRO")
  private AskPriceDetail CRO;
  @JsonProperty("FX")
  private AskPriceDetail FX;
  @JsonProperty("CHR")
  private AskPriceDetail CHR;
  @JsonProperty("MBL")
  private AskPriceDetail MBL;
  @JsonProperty("MXC")
  private AskPriceDetail MXC;
  @JsonProperty("FCT2")
  private AskPriceDetail FCT2;
  @JsonProperty("WOM")
  private AskPriceDetail WOM;
  @JsonProperty("BOA")
  private AskPriceDetail BOA;
  @JsonProperty("MEV")
  private AskPriceDetail MEV;
  @JsonProperty("SXP")
  private AskPriceDetail SXP;
  @JsonProperty("COS")
  private AskPriceDetail COS;
  @JsonProperty("EL")
  private AskPriceDetail EL;
  @JsonProperty("HIVE")
  private AskPriceDetail HIVE;
  @JsonProperty("XPR")
  private AskPriceDetail XPR;
  @JsonProperty("VRA")
  private AskPriceDetail VRA;
  @JsonProperty("FIT")
  private AskPriceDetail FIT;
  @JsonProperty("EGG")
  private AskPriceDetail EGG;
  @JsonProperty("BORA")
  private AskPriceDetail BORA;
  @JsonProperty("ARPA")
  private AskPriceDetail ARPA;
  @JsonProperty("CTC")
  private AskPriceDetail CTC;
  @JsonProperty("APM")
  private AskPriceDetail APM;
  @JsonProperty("CKB")
  private AskPriceDetail CKB;
  @JsonProperty("AERGO")
  private AskPriceDetail AERGO;
  @JsonProperty("EVZ")
  private AskPriceDetail EVZ;
  @JsonProperty("QTCON")
  private AskPriceDetail QTCON;
  @JsonProperty("UNI")
  private AskPriceDetail UNI;
  @JsonProperty("YFI")
  private AskPriceDetail YFI;
  @JsonProperty("UMA")
  private AskPriceDetail UMA;
  @JsonProperty("AAVE")
  private AskPriceDetail AAVE;
  @JsonProperty("COMP")
  private AskPriceDetail COMP;
  @JsonProperty("BAL")
  private AskPriceDetail BAL;
  @JsonProperty("RSR")
  private AskPriceDetail RSR;
  @JsonProperty("NMR")
  private AskPriceDetail NMR;
  @JsonProperty("RLC")
  private AskPriceDetail RLC;
  @JsonProperty("UOS")
  private AskPriceDetail UOS;
  @JsonProperty("SAND")
  private AskPriceDetail SAND;
  @JsonProperty("STPT")
  private AskPriceDetail STPT;
  @JsonProperty("BEL")
  private AskPriceDetail BEL;
  @JsonProperty("OBSR")
  private AskPriceDetail OBSR;
  @JsonProperty("ORC")
  private AskPriceDetail ORC;
  @JsonProperty("POLA")
  private AskPriceDetail POLA;
  @JsonProperty("ADP")
  private AskPriceDetail ADP;
  @JsonProperty("DVI")
  private AskPriceDetail DVI;
  @JsonProperty("GHX")
  private AskPriceDetail GHX;
  @JsonProperty("MVC")
  private AskPriceDetail MVC;
  @JsonProperty("BLY")
  private AskPriceDetail BLY;
  @JsonProperty("GRT")
  private AskPriceDetail GRT;
  @JsonProperty("BIOT")
  private AskPriceDetail BIOT;
  @JsonProperty("SNX")
  private AskPriceDetail SNX;
  @JsonProperty("SOFI")
  private AskPriceDetail SOFI;
  @JsonProperty("GRACY")
  private AskPriceDetail GRACY;
  @JsonProperty("OXT")
  private AskPriceDetail OXT;
  @JsonProperty("MAP")
  private AskPriceDetail MAP;
  @JsonProperty("AQT")
  private AskPriceDetail AQT;
  @JsonProperty("PLA")
  private AskPriceDetail PLA;
  @JsonProperty("WIKEN")
  private AskPriceDetail WIKEN;
  @JsonProperty("CTSI")
  private AskPriceDetail CTSI;
  @JsonProperty("MANA")
  private AskPriceDetail MANA;
  @JsonProperty("LPT")
  private AskPriceDetail LPT;
  @JsonProperty("MKR")
  private AskPriceDetail MKR;
  @JsonProperty("SUSHI")
  private AskPriceDetail SUSHI;
  @JsonProperty("ASM")
  private AskPriceDetail ASM;
  @JsonProperty("PUNDIX")
  private AskPriceDetail PUNDIX;
  @JsonProperty("CELR")
  private AskPriceDetail CELR;
  @JsonProperty("FRONT")
  private AskPriceDetail FRONT;
  @JsonProperty("RLY")
  private AskPriceDetail RLY;
  @JsonProperty("OCEAN")
  private AskPriceDetail OCEAN;
  @JsonProperty("BFC")
  private AskPriceDetail BFC;
  @JsonProperty("ALICE")
  private AskPriceDetail ALICE;
  @JsonProperty("OGN")
  private AskPriceDetail OGN;
  @JsonProperty("COTI")
  private AskPriceDetail COTI;
  @JsonProperty("CAKE")
  private AskPriceDetail CAKE;
  @JsonProperty("BNT")
  private AskPriceDetail BNT;
  @JsonProperty("XVS")
  private AskPriceDetail XVS;
  @JsonProperty("SWAP")
  private AskPriceDetail SWAP;
  @JsonProperty("CHZ")
  private AskPriceDetail CHZ;
  @JsonProperty("AXS")
  private AskPriceDetail AXS;
  @JsonProperty("DAO")
  private AskPriceDetail DAO;
  @JsonProperty("SIX")
  private AskPriceDetail SIX;
  @JsonProperty("DAI")
  private AskPriceDetail DAI;
  @JsonProperty("SHIB")
  private AskPriceDetail SHIB;
  @JsonProperty("MATIC")
  private AskPriceDetail MATIC;
  @JsonProperty("WOO")
  private AskPriceDetail WOO;
  @JsonProperty("ACH")
  private AskPriceDetail ACH;
  @JsonProperty("VELO")
  private AskPriceDetail VELO;
  @JsonProperty("XLM")
  private AskPriceDetail XLM;
  @JsonProperty("ONT")
  private AskPriceDetail ONT;
  @JsonProperty("META")
  private AskPriceDetail META;
  @JsonProperty("KLAY")
  private AskPriceDetail KLAY;
  @JsonProperty("ONG")
  private AskPriceDetail ONG;
  @JsonProperty("ALGO")
  private AskPriceDetail ALGO;
  @JsonProperty("JST")
  private AskPriceDetail JST;
  @JsonProperty("XTZ")
  private AskPriceDetail XTZ;
  @JsonProperty("MLK")
  private AskPriceDetail MLK;
  @JsonProperty("DOT")
  private AskPriceDetail DOT;
  @JsonProperty("ATOM")
  private AskPriceDetail ATOM;
  @JsonProperty("SSX")
  private AskPriceDetail SSX;
  @JsonProperty("TEMCO")
  private AskPriceDetail TEMCO;
  @JsonProperty("DOGE")
  private AskPriceDetail DOGE;
  @JsonProperty("KSM")
  private AskPriceDetail KSM;
  @JsonProperty("CTK")
  private AskPriceDetail CTK;
  @JsonProperty("BNB")
  private AskPriceDetail BNB;
  @JsonProperty("NFT")
  private AskPriceDetail NFT;
  @JsonProperty("SUN")
  private AskPriceDetail SUN;
  @JsonProperty("XEC")
  private AskPriceDetail XEC;
  @JsonProperty("AGIX")
  private AskPriceDetail AGIX;
  @JsonProperty("SOL")
  private AskPriceDetail SOL;
  @JsonProperty("FNSA")
  private AskPriceDetail FNSA;
  @JsonProperty("EGLD")
  private AskPriceDetail EGLD;
  @JsonProperty("MASK")
  private AskPriceDetail MASK;
  @JsonProperty("C98")
  private AskPriceDetail C98;
  @JsonProperty("MED")
  private AskPriceDetail MED;
  @JsonProperty("1INCH")
  private AskPriceDetail ONEINCH;
  @JsonProperty("CRV")
  private AskPriceDetail CRV;
  @JsonProperty("BOBA")
  private AskPriceDetail BOBA;
  @JsonProperty("DYDX")
  private AskPriceDetail DYDX;
  @JsonProperty("MINA")
  private AskPriceDetail MINA;
  @JsonProperty("FLOW")
  private AskPriceDetail FLOW;
  @JsonProperty("JOE")
  private AskPriceDetail JOE;
  @JsonProperty("GALA")
  private AskPriceDetail GALA;
  @JsonProperty("BTT")
  private AskPriceDetail BTT;
  @JsonProperty("JASMY")
  private AskPriceDetail JASMY;
  @JsonProperty("REQ")
  private AskPriceDetail REQ;
  @JsonProperty("CSPR")
  private AskPriceDetail CSPR;
  @JsonProperty("AVAX")
  private AskPriceDetail AVAX;
  @JsonProperty("TDROP")
  private AskPriceDetail TDROP;
  @JsonProperty("HBAR")
  private AskPriceDetail HBAR;
  @JsonProperty("FANC")
  private AskPriceDetail FANC;
  @JsonProperty("NPT")
  private AskPriceDetail NPT;
  @JsonProperty("REI")
  private AskPriceDetail REI;
  @JsonProperty("T")
  private AskPriceDetail T;
  @JsonProperty("MBX")
  private AskPriceDetail MBX;
  @JsonProperty("GMT")
  private AskPriceDetail GMT;
  @JsonProperty("TAVA")
  private AskPriceDetail TAVA;
  @JsonProperty("DAR")
  private AskPriceDetail DAR;
  @JsonProperty("APE")
  private AskPriceDetail APE;
  @JsonProperty("WNCG")
  private AskPriceDetail WNCG;
  @JsonProperty("ALT")
  private AskPriceDetail ALT;
  @JsonProperty("XCN")
  private AskPriceDetail XCN;
  @JsonProperty("AZIT")
  private AskPriceDetail AZIT;
  @JsonProperty("FLR")
  private AskPriceDetail FLR;
  @JsonProperty("SFP")
  private AskPriceDetail SFP;
  @JsonProperty("FITFI")
  private AskPriceDetail FITFI;
  @JsonProperty("STAT")
  private AskPriceDetail STAT;
  @JsonProperty("CRTS")
  private AskPriceDetail CRTS;
  @JsonProperty("VIX")
  private AskPriceDetail VIX;
  @JsonProperty("LBL")
  private AskPriceDetail LBL;
  @JsonProperty("FLZ")
  private AskPriceDetail FLZ;
  @JsonProperty("LM")
  private AskPriceDetail LM;
  @JsonProperty("GRND")
  private AskPriceDetail GRND;
  @JsonProperty("APT")
  private AskPriceDetail APT;
  @JsonProperty("BLUR")
  private AskPriceDetail BLUR;
  @JsonProperty("WEMIX")
  private AskPriceDetail WEMIX;
  @JsonProperty("OAS")
  private AskPriceDetail OAS;
  @JsonProperty("HOOK")
  private AskPriceDetail HOOK;
  @JsonProperty("ENTC")
  private AskPriceDetail ENTC;
  @JsonProperty("ONIT")
  private AskPriceDetail ONIT;
  @JsonProperty("OP")
  private AskPriceDetail OP;
  @JsonProperty("ROA")
  private AskPriceDetail ROA;
  @JsonProperty("GMX")
  private AskPriceDetail GMX;
  @JsonProperty("STX")
  private AskPriceDetail STX;
  @JsonProperty("XPLA")
  private AskPriceDetail XPLA;
  @JsonProperty("ARB")
  private AskPriceDetail ARB;
  @JsonProperty("INJ")
  private AskPriceDetail INJ;
  @JsonProperty("HFT")
  private AskPriceDetail HFT;
  @JsonProperty("RPL")
  private AskPriceDetail RPL;
  @JsonProperty("IMX")
  private AskPriceDetail IMX;
  @JsonProperty("CFX")
  private AskPriceDetail CFX;
  @JsonProperty("ACS")
  private AskPriceDetail ACS;
  @JsonProperty("FXS")
  private AskPriceDetail FXS;
  @JsonProperty("CELO")
  private AskPriceDetail CELO;
  @JsonProperty("LDO")
  private AskPriceDetail LDO;
  @JsonProperty("FTM")
  private AskPriceDetail FTM;
  @JsonProperty("FET")
  private AskPriceDetail FET;
  @JsonProperty("SUI")
  private AskPriceDetail SUI;
  @JsonProperty("NCT")
  private AskPriceDetail NCT;
  @JsonProperty("FLOKI")
  private AskPriceDetail FLOKI;
  @JsonProperty("ALEX")
  private AskPriceDetail ALEX;
  @JsonProperty("ID")
  private AskPriceDetail ID;
  @JsonProperty("RNDR")
  private AskPriceDetail RNDR;
  @JsonProperty("STG")
  private AskPriceDetail STG;
  @JsonProperty("OSMO")
  private AskPriceDetail OSMO;
  @JsonProperty("GAL")
  private AskPriceDetail GAL;
  @JsonProperty("ILV")
  private AskPriceDetail ILV;
  @JsonProperty("MAV")
  private AskPriceDetail MAV;
  @JsonProperty("RSS3")
  private AskPriceDetail RSS3;
  @JsonProperty("AUDIO")
  private AskPriceDetail AUDIO;
  @JsonProperty("AGI")
  private AskPriceDetail AGI;
  @JsonProperty("RDNT")
  private AskPriceDetail RDNT;
  @JsonProperty("ASTR")
  private AskPriceDetail ASTR;
  @JsonProperty("WLD")
  private AskPriceDetail WLD;
  @JsonProperty("FLUX")
  private AskPriceDetail FLUX;
  @JsonProperty("RVN")
  private AskPriceDetail RVN;
  @JsonProperty("LEVER")
  private AskPriceDetail LEVER;
  @JsonProperty("EDU")
  private AskPriceDetail EDU;
  @JsonProperty("SEI")
  private AskPriceDetail SEI;
  @JsonProperty("WAXL")
  private AskPriceDetail WAXL;
  @JsonProperty("MOC")
  private AskPriceDetail MOC;
  @JsonProperty("PEPE")
  private AskPriceDetail PEPE;
  @JsonProperty("CYBER")
  private AskPriceDetail CYBER;
  @JsonProperty("ARKM")
  private AskPriceDetail ARKM;
  @JsonProperty("PYR")
  private AskPriceDetail PYR;
  @JsonProperty("IOTX")
  private AskPriceDetail IOTX;
  @JsonProperty("HIGH")
  private AskPriceDetail HIGH;
  @JsonProperty("PENDLE")
  private AskPriceDetail PENDLE;
  @JsonProperty("STORJ")
  private AskPriceDetail STORJ;
  @JsonProperty("API3")
  private AskPriceDetail API3;
  @JsonProperty("ZTX")
  private AskPriceDetail ZTX;
  @JsonProperty("MNT")
  private AskPriceDetail MNT;
  @JsonProperty("GTC")
  private AskPriceDetail GTC;
  @JsonProperty("TIA")
  private AskPriceDetail TIA;
  @JsonProperty("ZBC")
  private AskPriceDetail ZBC;
  @JsonProperty("SPURS")
  private AskPriceDetail SPURS;
  @JsonProperty("NEO")
  private AskPriceDetail NEO;
  @JsonProperty("GAS")
  private AskPriceDetail GAS;
  @JsonProperty("HIFI")
  private AskPriceDetail HIFI;
  @JsonProperty("BIGTIME")
  private AskPriceDetail BIGTIME;
  @JsonProperty("ARK")
  private AskPriceDetail ARK;
  @JsonProperty("YGG")
  private AskPriceDetail YGG;
  @JsonProperty("KAVA")
  private AskPriceDetail KAVA;
  @JsonProperty("STMX")
  private AskPriceDetail STMX;
  @JsonProperty("MAGIC")
  private AskPriceDetail MAGIC;
  @JsonProperty("USDT")
  private AskPriceDetail USDT;
  @JsonProperty("USDC")
  private AskPriceDetail USDC;
  @JsonProperty("RAD")
  private AskPriceDetail RAD;
  @JsonProperty("LSK")
  private AskPriceDetail LSK;
  @JsonProperty("TT")
  private AskPriceDetail TT;
  @JsonProperty("ACE")
  private AskPriceDetail ACE;
  @JsonProperty("MANTA")
  private AskPriceDetail MANTA;
  @JsonProperty("JUP")
  private AskPriceDetail JUP;
  @JsonProperty("STRK")
  private AskPriceDetail STRK;
}