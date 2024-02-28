package com.dopamine.bithumb.trade.model.ask_price;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
@JsonIgnoreProperties
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

  public AskPriceDetail getCoinAskPrice(String coinName) {
    Map<String, AskPriceDetail> askPriceDetailMap = new HashMap<>();
    askPriceDetailMap.put("BTC", BTC);
    askPriceDetailMap.put("ETH", ETH);
    askPriceDetailMap.put("ETC", ETC);
    askPriceDetailMap.put("XRP", XRP);
    askPriceDetailMap.put("BCH", BCH);
    askPriceDetailMap.put("QTUM", QTUM);
    askPriceDetailMap.put("BTG", BTG);
    askPriceDetailMap.put("EOS", EOS);
    askPriceDetailMap.put("ICX", ICX);
    askPriceDetailMap.put("TRX", TRX);
    askPriceDetailMap.put("ELF", ELF);
    askPriceDetailMap.put("KNC", KNC);
    askPriceDetailMap.put("GLM", GLM);
    askPriceDetailMap.put("ZIL", ZIL);
    askPriceDetailMap.put("WAXP", WAXP);
    askPriceDetailMap.put("POWR", POWR);
    askPriceDetailMap.put("LRC", LRC);
    askPriceDetailMap.put("STEEM", STEEM);
    askPriceDetailMap.put("STRAX", STRAX);
    askPriceDetailMap.put("ZRX", ZRX);
    askPriceDetailMap.put("SNT", SNT);
    askPriceDetailMap.put("ADA", ADA);
    askPriceDetailMap.put("CTXC", CTXC);
    askPriceDetailMap.put("BAT", BAT);
    askPriceDetailMap.put("THETA", THETA);
    askPriceDetailMap.put("LOOM", LOOM);
    askPriceDetailMap.put("WAVES", WAVES);
    askPriceDetailMap.put("LINK", LINK);
    askPriceDetailMap.put("ENJ", ENJ);
    askPriceDetailMap.put("VET", VET);
    askPriceDetailMap.put("MTL", MTL);
    askPriceDetailMap.put("IOST", IOST);
    askPriceDetailMap.put("AMO", AMO);
    askPriceDetailMap.put("BSV", BSV);
    askPriceDetailMap.put("ORBS", ORBS);
    askPriceDetailMap.put("TFUEL", TFUEL);
    askPriceDetailMap.put("VALOR", VALOR);
    askPriceDetailMap.put("CON", CON);
    askPriceDetailMap.put("ANKR", ANKR);
    askPriceDetailMap.put("MIX", MIX);
    askPriceDetailMap.put("CRO", CRO);
    askPriceDetailMap.put("FX", FX);
    askPriceDetailMap.put("CHR", CHR);
    askPriceDetailMap.put("MBL", MBL);
    askPriceDetailMap.put("MXC", MXC);
    askPriceDetailMap.put("FCT2", FCT2);
    askPriceDetailMap.put("WOM", WOM);
    askPriceDetailMap.put("BOA", BOA);
    askPriceDetailMap.put("MEV", MEV);
    askPriceDetailMap.put("SXP", SXP);
    askPriceDetailMap.put("COS", COS);
    askPriceDetailMap.put("EL", EL);
    askPriceDetailMap.put("HIVE", HIVE);
    askPriceDetailMap.put("XPR", XPR);
    askPriceDetailMap.put("VRA", VRA);
    askPriceDetailMap.put("FIT", FIT);
    askPriceDetailMap.put("EGG", EGG);
    askPriceDetailMap.put("BORA", BORA);
    askPriceDetailMap.put("ARPA", ARPA);
    askPriceDetailMap.put("CTC", CTC);
    askPriceDetailMap.put("APM", APM);
    askPriceDetailMap.put("CKB", CKB);
    askPriceDetailMap.put("AERGO", AERGO);
    askPriceDetailMap.put("EVZ", EVZ);
    askPriceDetailMap.put("QTCON", QTCON);
    askPriceDetailMap.put("UNI", UNI);
    askPriceDetailMap.put("YFI", YFI);
    askPriceDetailMap.put("UMA", UMA);
    askPriceDetailMap.put("AAVE", AAVE);
    askPriceDetailMap.put("COMP", COMP);
    askPriceDetailMap.put("BAL", BAL);
    askPriceDetailMap.put("RSR", RSR);
    askPriceDetailMap.put("NMR", NMR);
    askPriceDetailMap.put("RLC", RLC);
    askPriceDetailMap.put("UOS", UOS);
    askPriceDetailMap.put("SAND", SAND);
    askPriceDetailMap.put("STPT", STPT);
    askPriceDetailMap.put("BEL", BEL);
    askPriceDetailMap.put("OBSR", OBSR);
    askPriceDetailMap.put("ORC", ORC);
    askPriceDetailMap.put("POLA", POLA);
    askPriceDetailMap.put("ADP", ADP);
    askPriceDetailMap.put("DVI", DVI);
    askPriceDetailMap.put("GHX", GHX);
    askPriceDetailMap.put("MVC", MVC);
    askPriceDetailMap.put("BLY", BLY);
    askPriceDetailMap.put("GRT", GRT);
    askPriceDetailMap.put("BIOT", BIOT);
    askPriceDetailMap.put("SNX", SNX);
    askPriceDetailMap.put("SOFI", SOFI);
    askPriceDetailMap.put("GRACY", GRACY);
    askPriceDetailMap.put("OXT", OXT);
    askPriceDetailMap.put("MAP", MAP);
    askPriceDetailMap.put("AQT", AQT);
    askPriceDetailMap.put("PLA", PLA);
    askPriceDetailMap.put("WIKEN", WIKEN);
    askPriceDetailMap.put("CTSI", CTSI);
    askPriceDetailMap.put("MANA", MANA);
    askPriceDetailMap.put("LPT", LPT);
    askPriceDetailMap.put("MKR", MKR);
    askPriceDetailMap.put("SUSHI", SUSHI);
    askPriceDetailMap.put("ASM", ASM);
    askPriceDetailMap.put("PUNDIX", PUNDIX);
    askPriceDetailMap.put("CELR", CELR);
    askPriceDetailMap.put("FRONT", FRONT);
    askPriceDetailMap.put("RLY", RLY);
    askPriceDetailMap.put("OCEAN", OCEAN);
    askPriceDetailMap.put("BFC", BFC);
    askPriceDetailMap.put("ALICE", ALICE);
    askPriceDetailMap.put("OGN", OGN);
    askPriceDetailMap.put("COTI", COTI);
    askPriceDetailMap.put("CAKE", CAKE);
    askPriceDetailMap.put("BNT", BNT);
    askPriceDetailMap.put("XVS", XVS);
    askPriceDetailMap.put("SWAP", SWAP);
    askPriceDetailMap.put("CHZ", CHZ);
    askPriceDetailMap.put("AXS", AXS);
    askPriceDetailMap.put("DAO", DAO);
    askPriceDetailMap.put("SIX", SIX);
    askPriceDetailMap.put("DAI", DAI);
    askPriceDetailMap.put("SHIB", SHIB);
    askPriceDetailMap.put("MATIC", MATIC);
    askPriceDetailMap.put("WOO", WOO);
    askPriceDetailMap.put("ACH", ACH);
    askPriceDetailMap.put("VELO", VELO);
    askPriceDetailMap.put("XLM", XLM);
    askPriceDetailMap.put("ONT", ONT);
    askPriceDetailMap.put("META", META);
    askPriceDetailMap.put("KLAY", KLAY);
    askPriceDetailMap.put("ONG", ONG);
    askPriceDetailMap.put("ALGO", ALGO);
    askPriceDetailMap.put("JST", JST);
    askPriceDetailMap.put("XTZ", XTZ);
    askPriceDetailMap.put("MLK", MLK);
    askPriceDetailMap.put("DOT", DOT);
    askPriceDetailMap.put("ATOM", ATOM);
    askPriceDetailMap.put("SSX", SSX);
    askPriceDetailMap.put("TEMCO", TEMCO);
    askPriceDetailMap.put("DOGE", DOGE);
    askPriceDetailMap.put("KSM", KSM);
    askPriceDetailMap.put("CTK", CTK);
    askPriceDetailMap.put("BNB", BNB);
    askPriceDetailMap.put("NFT", NFT);
    askPriceDetailMap.put("SUN", SUN);
    askPriceDetailMap.put("XEC", XEC);
    askPriceDetailMap.put("AGIX", AGIX);
    askPriceDetailMap.put("SOL", SOL);
    askPriceDetailMap.put("FNSA", FNSA);
    askPriceDetailMap.put("EGLD", EGLD);
    askPriceDetailMap.put("MASK", MASK);
    askPriceDetailMap.put("C98", C98);
    askPriceDetailMap.put("MED", MED);
    askPriceDetailMap.put("ONEINCH", ONEINCH);
    askPriceDetailMap.put("CRV", CRV);
    askPriceDetailMap.put("BOBA", BOBA);
    askPriceDetailMap.put("DYDX", DYDX);
    askPriceDetailMap.put("MINA", MINA);
    askPriceDetailMap.put("FLOW", FLOW);
    askPriceDetailMap.put("JOE", JOE);
    askPriceDetailMap.put("GALA", GALA);
    askPriceDetailMap.put("BTT", BTT);
    askPriceDetailMap.put("JASMY", JASMY);
    askPriceDetailMap.put("REQ", REQ);
    askPriceDetailMap.put("CSPR", CSPR);
    askPriceDetailMap.put("AVAX", AVAX);
    askPriceDetailMap.put("TDROP", TDROP);
    askPriceDetailMap.put("HBAR", HBAR);
    askPriceDetailMap.put("FANC", FANC);
    askPriceDetailMap.put("NPT", NPT);
    askPriceDetailMap.put("REI", REI);
    askPriceDetailMap.put("T", T);
    askPriceDetailMap.put("MBX", MBX);
    askPriceDetailMap.put("GMT", GMT);
    askPriceDetailMap.put("TAVA", TAVA);
    askPriceDetailMap.put("DAR", DAR);
    askPriceDetailMap.put("APE", APE);
    askPriceDetailMap.put("WNCG", WNCG);
    askPriceDetailMap.put("ALT", ALT);
    askPriceDetailMap.put("XCN", XCN);
    askPriceDetailMap.put("AZIT", AZIT);
    askPriceDetailMap.put("FLR", FLR);
    askPriceDetailMap.put("SFP", SFP);
    askPriceDetailMap.put("FITFI", FITFI);
    askPriceDetailMap.put("STAT", STAT);
    askPriceDetailMap.put("CRTS", CRTS);
    askPriceDetailMap.put("VIX", VIX);
    askPriceDetailMap.put("LBL", LBL);
    askPriceDetailMap.put("FLZ", FLZ);
    askPriceDetailMap.put("LM", LM);
    askPriceDetailMap.put("GRND", GRND);
    askPriceDetailMap.put("APT", APT);
    askPriceDetailMap.put("BLUR", BLUR);
    askPriceDetailMap.put("WEMIX", WEMIX);
    askPriceDetailMap.put("OAS", OAS);
    askPriceDetailMap.put("HOOK", HOOK);
    askPriceDetailMap.put("ENTC", ENTC);
    askPriceDetailMap.put("ONIT", ONIT);
    askPriceDetailMap.put("OP", OP);
    askPriceDetailMap.put("ROA", ROA);
    askPriceDetailMap.put("GMX", GMX);
    askPriceDetailMap.put("STX", STX);
    askPriceDetailMap.put("XPLA", XPLA);
    askPriceDetailMap.put("ARB", ARB);
    askPriceDetailMap.put("INJ", INJ);
    askPriceDetailMap.put("HFT", HFT);
    askPriceDetailMap.put("RPL", RPL);
    askPriceDetailMap.put("IMX", IMX);
    askPriceDetailMap.put("CFX", CFX);
    askPriceDetailMap.put("ACS", ACS);
    askPriceDetailMap.put("FXS", FXS);
    askPriceDetailMap.put("CELO", CELO);
    askPriceDetailMap.put("LDO", LDO);
    askPriceDetailMap.put("FTM", FTM);
    askPriceDetailMap.put("FET", FET);
    askPriceDetailMap.put("SUI", SUI);
    askPriceDetailMap.put("NCT", NCT);
    askPriceDetailMap.put("FLOKI", FLOKI);
    askPriceDetailMap.put("ALEX", ALEX);
    askPriceDetailMap.put("ID", ID);
    askPriceDetailMap.put("RNDR", RNDR);
    askPriceDetailMap.put("STG", STG);
    askPriceDetailMap.put("OSMO", OSMO);
    askPriceDetailMap.put("GAL", GAL);
    askPriceDetailMap.put("ILV", ILV);
    askPriceDetailMap.put("MAV", MAV);
    askPriceDetailMap.put("RSS3", RSS3);
    askPriceDetailMap.put("AUDIO", AUDIO);
    askPriceDetailMap.put("AGI", AGI);
    askPriceDetailMap.put("RDNT", RDNT);
    askPriceDetailMap.put("ASTR", ASTR);
    askPriceDetailMap.put("WLD", WLD);
    askPriceDetailMap.put("FLUX", FLUX);
    askPriceDetailMap.put("RVN", RVN);
    askPriceDetailMap.put("LEVER", LEVER);
    askPriceDetailMap.put("EDU", EDU);
    askPriceDetailMap.put("SEI", SEI);
    askPriceDetailMap.put("WAXL", WAXL);
    askPriceDetailMap.put("MOC", MOC);
    askPriceDetailMap.put("PEPE", PEPE);
    askPriceDetailMap.put("CYBER", CYBER);
    askPriceDetailMap.put("ARKM", ARKM);
    askPriceDetailMap.put("PYR", PYR);
    askPriceDetailMap.put("IOTX", IOTX);
    askPriceDetailMap.put("HIGH", HIGH);
    askPriceDetailMap.put("PENDLE", PENDLE);
    askPriceDetailMap.put("STORJ", STORJ);
    askPriceDetailMap.put("API3", API3);
    askPriceDetailMap.put("ZTX", ZTX);
    askPriceDetailMap.put("MNT", MNT);
    askPriceDetailMap.put("GTC", GTC);
    askPriceDetailMap.put("TIA", TIA);
    askPriceDetailMap.put("ZBC", ZBC);
    askPriceDetailMap.put("SPURS", SPURS);
    askPriceDetailMap.put("NEO", NEO);
    askPriceDetailMap.put("GAS", GAS);
    askPriceDetailMap.put("HIFI", HIFI);
    askPriceDetailMap.put("BIGTIME", BIGTIME);
    askPriceDetailMap.put("ARK", ARK);
    askPriceDetailMap.put("YGG", YGG);
    askPriceDetailMap.put("KAVA", KAVA);
    askPriceDetailMap.put("STMX", STMX);
    askPriceDetailMap.put("MAGIC", MAGIC);
    askPriceDetailMap.put("USDT", USDT);
    askPriceDetailMap.put("USDC", USDC);
    askPriceDetailMap.put("RAD", RAD);
    askPriceDetailMap.put("LSK", LSK);
    askPriceDetailMap.put("TT", TT);
    askPriceDetailMap.put("ACE", ACE);
    askPriceDetailMap.put("MANTA", MANTA);
    askPriceDetailMap.put("JUP", JUP);
    askPriceDetailMap.put("STRK", STRK);

    return askPriceDetailMap.get(coinName);
  }

}