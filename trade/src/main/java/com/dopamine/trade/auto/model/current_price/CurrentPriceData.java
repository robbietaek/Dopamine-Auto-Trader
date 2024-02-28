package com.dopamine.trade.auto.model.current_price;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serial;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
@JsonIgnoreProperties
public class CurrentPriceData implements Serializable {

  @Serial
  private static final long serialVersionUID = -8632831900717394241L;
  @JsonProperty("BTC")
  private CurrentPriceDetail BTC;
  @JsonProperty("ETH")
  private CurrentPriceDetail ETH;
  @JsonProperty("ETC")
  private CurrentPriceDetail ETC;
  @JsonProperty("XRP")
  private CurrentPriceDetail XRP;
  @JsonProperty("BCH")
  private CurrentPriceDetail BCH;
  @JsonProperty("QTUM")
  private CurrentPriceDetail QTUM;
  @JsonProperty("BTG")
  private CurrentPriceDetail BTG;
  @JsonProperty("EOS")
  private CurrentPriceDetail EOS;
  @JsonProperty("ICX")
  private CurrentPriceDetail ICX;
  @JsonProperty("TRX")
  private CurrentPriceDetail TRX;
  @JsonProperty("ELF")
  private CurrentPriceDetail ELF;
  @JsonProperty("KNC")
  private CurrentPriceDetail KNC;
  @JsonProperty("GLM")
  private CurrentPriceDetail GLM;
  @JsonProperty("ZIL")
  private CurrentPriceDetail ZIL;
  @JsonProperty("WAXP")
  private CurrentPriceDetail WAXP;
  @JsonProperty("POWR")
  private CurrentPriceDetail POWR;
  @JsonProperty("LRC")
  private CurrentPriceDetail LRC;
  @JsonProperty("STEEM")
  private CurrentPriceDetail STEEM;
  @JsonProperty("STRAX")
  private CurrentPriceDetail STRAX;
  @JsonProperty("ZRX")
  private CurrentPriceDetail ZRX;
  @JsonProperty("SNT")
  private CurrentPriceDetail SNT;
  @JsonProperty("ADA")
  private CurrentPriceDetail ADA;
  @JsonProperty("CTXC")
  private CurrentPriceDetail CTXC;
  @JsonProperty("BAT")
  private CurrentPriceDetail BAT;
  @JsonProperty("THETA")
  private CurrentPriceDetail THETA;
  @JsonProperty("LOOM")
  private CurrentPriceDetail LOOM;
  @JsonProperty("WAVES")
  private CurrentPriceDetail WAVES;
  @JsonProperty("LINK")
  private CurrentPriceDetail LINK;
  @JsonProperty("ENJ")
  private CurrentPriceDetail ENJ;
  @JsonProperty("VET")
  private CurrentPriceDetail VET;
  @JsonProperty("MTL")
  private CurrentPriceDetail MTL;
  @JsonProperty("IOST")
  private CurrentPriceDetail IOST;
  @JsonProperty("AMO")
  private CurrentPriceDetail AMO;
  @JsonProperty("BSV")
  private CurrentPriceDetail BSV;
  @JsonProperty("ORBS")
  private CurrentPriceDetail ORBS;
  @JsonProperty("TFUEL")
  private CurrentPriceDetail TFUEL;
  @JsonProperty("VALOR")
  private CurrentPriceDetail VALOR;
  @JsonProperty("CON")
  private CurrentPriceDetail CON;
  @JsonProperty("ANKR")
  private CurrentPriceDetail ANKR;
  @JsonProperty("MIX")
  private CurrentPriceDetail MIX;
  @JsonProperty("CRO")
  private CurrentPriceDetail CRO;
  @JsonProperty("FX")
  private CurrentPriceDetail FX;
  @JsonProperty("CHR")
  private CurrentPriceDetail CHR;
  @JsonProperty("MBL")
  private CurrentPriceDetail MBL;
  @JsonProperty("MXC")
  private CurrentPriceDetail MXC;
  @JsonProperty("FCT2")
  private CurrentPriceDetail FCT2;
  @JsonProperty("WOM")
  private CurrentPriceDetail WOM;
  @JsonProperty("BOA")
  private CurrentPriceDetail BOA;
  @JsonProperty("MEV")
  private CurrentPriceDetail MEV;
  @JsonProperty("SXP")
  private CurrentPriceDetail SXP;
  @JsonProperty("COS")
  private CurrentPriceDetail COS;
  @JsonProperty("EL")
  private CurrentPriceDetail EL;
  @JsonProperty("HIVE")
  private CurrentPriceDetail HIVE;
  @JsonProperty("XPR")
  private CurrentPriceDetail XPR;
  @JsonProperty("VRA")
  private CurrentPriceDetail VRA;
  @JsonProperty("FIT")
  private CurrentPriceDetail FIT;
  @JsonProperty("EGG")
  private CurrentPriceDetail EGG;
  @JsonProperty("BORA")
  private CurrentPriceDetail BORA;
  @JsonProperty("ARPA")
  private CurrentPriceDetail ARPA;
  @JsonProperty("CTC")
  private CurrentPriceDetail CTC;
  @JsonProperty("APM")
  private CurrentPriceDetail APM;
  @JsonProperty("CKB")
  private CurrentPriceDetail CKB;
  @JsonProperty("AERGO")
  private CurrentPriceDetail AERGO;
  @JsonProperty("EVZ")
  private CurrentPriceDetail EVZ;
  @JsonProperty("QTCON")
  private CurrentPriceDetail QTCON;
  @JsonProperty("UNI")
  private CurrentPriceDetail UNI;
  @JsonProperty("YFI")
  private CurrentPriceDetail YFI;
  @JsonProperty("UMA")
  private CurrentPriceDetail UMA;
  @JsonProperty("AAVE")
  private CurrentPriceDetail AAVE;
  @JsonProperty("COMP")
  private CurrentPriceDetail COMP;
  @JsonProperty("BAL")
  private CurrentPriceDetail BAL;
  @JsonProperty("RSR")
  private CurrentPriceDetail RSR;
  @JsonProperty("NMR")
  private CurrentPriceDetail NMR;
  @JsonProperty("RLC")
  private CurrentPriceDetail RLC;
  @JsonProperty("UOS")
  private CurrentPriceDetail UOS;
  @JsonProperty("SAND")
  private CurrentPriceDetail SAND;
  @JsonProperty("STPT")
  private CurrentPriceDetail STPT;
  @JsonProperty("BEL")
  private CurrentPriceDetail BEL;
  @JsonProperty("OBSR")
  private CurrentPriceDetail OBSR;
  @JsonProperty("ORC")
  private CurrentPriceDetail ORC;
  @JsonProperty("POLA")
  private CurrentPriceDetail POLA;
  @JsonProperty("ADP")
  private CurrentPriceDetail ADP;
  @JsonProperty("DVI")
  private CurrentPriceDetail DVI;
  @JsonProperty("GHX")
  private CurrentPriceDetail GHX;
  @JsonProperty("MVC")
  private CurrentPriceDetail MVC;
  @JsonProperty("BLY")
  private CurrentPriceDetail BLY;
  @JsonProperty("GRT")
  private CurrentPriceDetail GRT;
  @JsonProperty("BIOT")
  private CurrentPriceDetail BIOT;
  @JsonProperty("SNX")
  private CurrentPriceDetail SNX;
  @JsonProperty("SOFI")
  private CurrentPriceDetail SOFI;
  @JsonProperty("GRACY")
  private CurrentPriceDetail GRACY;
  @JsonProperty("OXT")
  private CurrentPriceDetail OXT;
  @JsonProperty("MAP")
  private CurrentPriceDetail MAP;
  @JsonProperty("AQT")
  private CurrentPriceDetail AQT;
  @JsonProperty("PLA")
  private CurrentPriceDetail PLA;
  @JsonProperty("WIKEN")
  private CurrentPriceDetail WIKEN;
  @JsonProperty("CTSI")
  private CurrentPriceDetail CTSI;
  @JsonProperty("MANA")
  private CurrentPriceDetail MANA;
  @JsonProperty("LPT")
  private CurrentPriceDetail LPT;
  @JsonProperty("MKR")
  private CurrentPriceDetail MKR;
  @JsonProperty("SUSHI")
  private CurrentPriceDetail SUSHI;
  @JsonProperty("ASM")
  private CurrentPriceDetail ASM;
  @JsonProperty("PUNDIX")
  private CurrentPriceDetail PUNDIX;
  @JsonProperty("CELR")
  private CurrentPriceDetail CELR;
  @JsonProperty("FRONT")
  private CurrentPriceDetail FRONT;
  @JsonProperty("RLY")
  private CurrentPriceDetail RLY;
  @JsonProperty("OCEAN")
  private CurrentPriceDetail OCEAN;
  @JsonProperty("BFC")
  private CurrentPriceDetail BFC;
  @JsonProperty("ALICE")
  private CurrentPriceDetail ALICE;
  @JsonProperty("OGN")
  private CurrentPriceDetail OGN;
  @JsonProperty("COTI")
  private CurrentPriceDetail COTI;
  @JsonProperty("CAKE")
  private CurrentPriceDetail CAKE;
  @JsonProperty("BNT")
  private CurrentPriceDetail BNT;
  @JsonProperty("XVS")
  private CurrentPriceDetail XVS;
  @JsonProperty("SWAP")
  private CurrentPriceDetail SWAP;
  @JsonProperty("CHZ")
  private CurrentPriceDetail CHZ;
  @JsonProperty("AXS")
  private CurrentPriceDetail AXS;
  @JsonProperty("DAO")
  private CurrentPriceDetail DAO;
  @JsonProperty("SIX")
  private CurrentPriceDetail SIX;
  @JsonProperty("DAI")
  private CurrentPriceDetail DAI;
  @JsonProperty("SHIB")
  private CurrentPriceDetail SHIB;
  @JsonProperty("MATIC")
  private CurrentPriceDetail MATIC;
  @JsonProperty("WOO")
  private CurrentPriceDetail WOO;
  @JsonProperty("ACH")
  private CurrentPriceDetail ACH;
  @JsonProperty("VELO")
  private CurrentPriceDetail VELO;
  @JsonProperty("XLM")
  private CurrentPriceDetail XLM;
  @JsonProperty("ONT")
  private CurrentPriceDetail ONT;
  @JsonProperty("META")
  private CurrentPriceDetail META;
  @JsonProperty("KLAY")
  private CurrentPriceDetail KLAY;
  @JsonProperty("ONG")
  private CurrentPriceDetail ONG;
  @JsonProperty("ALGO")
  private CurrentPriceDetail ALGO;
  @JsonProperty("JST")
  private CurrentPriceDetail JST;
  @JsonProperty("XTZ")
  private CurrentPriceDetail XTZ;
  @JsonProperty("MLK")
  private CurrentPriceDetail MLK;
  @JsonProperty("DOT")
  private CurrentPriceDetail DOT;
  @JsonProperty("ATOM")
  private CurrentPriceDetail ATOM;
  @JsonProperty("SSX")
  private CurrentPriceDetail SSX;
  @JsonProperty("TEMCO")
  private CurrentPriceDetail TEMCO;
  @JsonProperty("DOGE")
  private CurrentPriceDetail DOGE;
  @JsonProperty("KSM")
  private CurrentPriceDetail KSM;
  @JsonProperty("CTK")
  private CurrentPriceDetail CTK;
  @JsonProperty("BNB")
  private CurrentPriceDetail BNB;
  @JsonProperty("NFT")
  private CurrentPriceDetail NFT;
  @JsonProperty("SUN")
  private CurrentPriceDetail SUN;
  @JsonProperty("XEC")
  private CurrentPriceDetail XEC;
  @JsonProperty("AGIX")
  private CurrentPriceDetail AGIX;
  @JsonProperty("SOL")
  private CurrentPriceDetail SOL;
  @JsonProperty("FNSA")
  private CurrentPriceDetail FNSA;
  @JsonProperty("EGLD")
  private CurrentPriceDetail EGLD;
  @JsonProperty("MASK")
  private CurrentPriceDetail MASK;
  @JsonProperty("C98")
  private CurrentPriceDetail C98;
  @JsonProperty("MED")
  private CurrentPriceDetail MED;
  @JsonProperty("1INCH")
  private CurrentPriceDetail ONEINCH;
  @JsonProperty("CRV")
  private CurrentPriceDetail CRV;
  @JsonProperty("BOBA")
  private CurrentPriceDetail BOBA;
  @JsonProperty("DYDX")
  private CurrentPriceDetail DYDX;
  @JsonProperty("MINA")
  private CurrentPriceDetail MINA;
  @JsonProperty("FLOW")
  private CurrentPriceDetail FLOW;
  @JsonProperty("JOE")
  private CurrentPriceDetail JOE;
  @JsonProperty("GALA")
  private CurrentPriceDetail GALA;
  @JsonProperty("BTT")
  private CurrentPriceDetail BTT;
  @JsonProperty("JASMY")
  private CurrentPriceDetail JASMY;
  @JsonProperty("REQ")
  private CurrentPriceDetail REQ;
  @JsonProperty("CSPR")
  private CurrentPriceDetail CSPR;
  @JsonProperty("AVAX")
  private CurrentPriceDetail AVAX;
  @JsonProperty("TDROP")
  private CurrentPriceDetail TDROP;
  @JsonProperty("HBAR")
  private CurrentPriceDetail HBAR;
  @JsonProperty("FANC")
  private CurrentPriceDetail FANC;
  @JsonProperty("NPT")
  private CurrentPriceDetail NPT;
  @JsonProperty("REI")
  private CurrentPriceDetail REI;
  @JsonProperty("T")
  private CurrentPriceDetail T;
  @JsonProperty("MBX")
  private CurrentPriceDetail MBX;
  @JsonProperty("GMT")
  private CurrentPriceDetail GMT;
  @JsonProperty("TAVA")
  private CurrentPriceDetail TAVA;
  @JsonProperty("DAR")
  private CurrentPriceDetail DAR;
  @JsonProperty("APE")
  private CurrentPriceDetail APE;
  @JsonProperty("WNCG")
  private CurrentPriceDetail WNCG;
  @JsonProperty("ALT")
  private CurrentPriceDetail ALT;
  @JsonProperty("XCN")
  private CurrentPriceDetail XCN;
  @JsonProperty("AZIT")
  private CurrentPriceDetail AZIT;
  @JsonProperty("FLR")
  private CurrentPriceDetail FLR;
  @JsonProperty("SFP")
  private CurrentPriceDetail SFP;
  @JsonProperty("FITFI")
  private CurrentPriceDetail FITFI;
  @JsonProperty("STAT")
  private CurrentPriceDetail STAT;
  @JsonProperty("CRTS")
  private CurrentPriceDetail CRTS;
  @JsonProperty("VIX")
  private CurrentPriceDetail VIX;
  @JsonProperty("LBL")
  private CurrentPriceDetail LBL;
  @JsonProperty("FLZ")
  private CurrentPriceDetail FLZ;
  @JsonProperty("LM")
  private CurrentPriceDetail LM;
  @JsonProperty("GRND")
  private CurrentPriceDetail GRND;
  @JsonProperty("APT")
  private CurrentPriceDetail APT;
  @JsonProperty("BLUR")
  private CurrentPriceDetail BLUR;
  @JsonProperty("WEMIX")
  private CurrentPriceDetail WEMIX;
  @JsonProperty("OAS")
  private CurrentPriceDetail OAS;
  @JsonProperty("HOOK")
  private CurrentPriceDetail HOOK;
  @JsonProperty("ENTC")
  private CurrentPriceDetail ENTC;
  @JsonProperty("ONIT")
  private CurrentPriceDetail ONIT;
  @JsonProperty("OP")
  private CurrentPriceDetail OP;
  @JsonProperty("ROA")
  private CurrentPriceDetail ROA;
  @JsonProperty("GMX")
  private CurrentPriceDetail GMX;
  @JsonProperty("STX")
  private CurrentPriceDetail STX;
  @JsonProperty("XPLA")
  private CurrentPriceDetail XPLA;
  @JsonProperty("ARB")
  private CurrentPriceDetail ARB;
  @JsonProperty("INJ")
  private CurrentPriceDetail INJ;
  @JsonProperty("HFT")
  private CurrentPriceDetail HFT;
  @JsonProperty("RPL")
  private CurrentPriceDetail RPL;
  @JsonProperty("IMX")
  private CurrentPriceDetail IMX;
  @JsonProperty("CFX")
  private CurrentPriceDetail CFX;
  @JsonProperty("ACS")
  private CurrentPriceDetail ACS;
  @JsonProperty("FXS")
  private CurrentPriceDetail FXS;
  @JsonProperty("CELO")
  private CurrentPriceDetail CELO;
  @JsonProperty("LDO")
  private CurrentPriceDetail LDO;
  @JsonProperty("FTM")
  private CurrentPriceDetail FTM;
  @JsonProperty("FET")
  private CurrentPriceDetail FET;
  @JsonProperty("SUI")
  private CurrentPriceDetail SUI;
  @JsonProperty("NCT")
  private CurrentPriceDetail NCT;
  @JsonProperty("FLOKI")
  private CurrentPriceDetail FLOKI;
  @JsonProperty("ALEX")
  private CurrentPriceDetail ALEX;
  @JsonProperty("ID")
  private CurrentPriceDetail ID;
  @JsonProperty("RNDR")
  private CurrentPriceDetail RNDR;
  @JsonProperty("STG")
  private CurrentPriceDetail STG;
  @JsonProperty("OSMO")
  private CurrentPriceDetail OSMO;
  @JsonProperty("GAL")
  private CurrentPriceDetail GAL;
  @JsonProperty("ILV")
  private CurrentPriceDetail ILV;
  @JsonProperty("MAV")
  private CurrentPriceDetail MAV;
  @JsonProperty("RSS3")
  private CurrentPriceDetail RSS3;
  @JsonProperty("AUDIO")
  private CurrentPriceDetail AUDIO;
  @JsonProperty("AGI")
  private CurrentPriceDetail AGI;
  @JsonProperty("RDNT")
  private CurrentPriceDetail RDNT;
  @JsonProperty("ASTR")
  private CurrentPriceDetail ASTR;
  @JsonProperty("WLD")
  private CurrentPriceDetail WLD;
  @JsonProperty("FLUX")
  private CurrentPriceDetail FLUX;
  @JsonProperty("RVN")
  private CurrentPriceDetail RVN;
  @JsonProperty("LEVER")
  private CurrentPriceDetail LEVER;
  @JsonProperty("EDU")
  private CurrentPriceDetail EDU;
  @JsonProperty("SEI")
  private CurrentPriceDetail SEI;
  @JsonProperty("WAXL")
  private CurrentPriceDetail WAXL;
  @JsonProperty("MOC")
  private CurrentPriceDetail MOC;
  @JsonProperty("PEPE")
  private CurrentPriceDetail PEPE;
  @JsonProperty("CYBER")
  private CurrentPriceDetail CYBER;
  @JsonProperty("ARKM")
  private CurrentPriceDetail ARKM;
  @JsonProperty("PYR")
  private CurrentPriceDetail PYR;
  @JsonProperty("IOTX")
  private CurrentPriceDetail IOTX;
  @JsonProperty("HIGH")
  private CurrentPriceDetail HIGH;
  @JsonProperty("PENDLE")
  private CurrentPriceDetail PENDLE;
  @JsonProperty("STORJ")
  private CurrentPriceDetail STORJ;
  @JsonProperty("API3")
  private CurrentPriceDetail API3;
  @JsonProperty("ZTX")
  private CurrentPriceDetail ZTX;
  @JsonProperty("MNT")
  private CurrentPriceDetail MNT;
  @JsonProperty("GTC")
  private CurrentPriceDetail GTC;
  @JsonProperty("TIA")
  private CurrentPriceDetail TIA;
  @JsonProperty("ZBC")
  private CurrentPriceDetail ZBC;
  @JsonProperty("SPURS")
  private CurrentPriceDetail SPURS;
  @JsonProperty("NEO")
  private CurrentPriceDetail NEO;
  @JsonProperty("GAS")
  private CurrentPriceDetail GAS;
  @JsonProperty("HIFI")
  private CurrentPriceDetail HIFI;
  @JsonProperty("BIGTIME")
  private CurrentPriceDetail BIGTIME;
  @JsonProperty("ARK")
  private CurrentPriceDetail ARK;
  @JsonProperty("YGG")
  private CurrentPriceDetail YGG;
  @JsonProperty("KAVA")
  private CurrentPriceDetail KAVA;
  @JsonProperty("STMX")
  private CurrentPriceDetail STMX;
  @JsonProperty("MAGIC")
  private CurrentPriceDetail MAGIC;
  @JsonProperty("USDT")
  private CurrentPriceDetail USDT;
  @JsonProperty("USDC")
  private CurrentPriceDetail USDC;
  @JsonProperty("RAD")
  private CurrentPriceDetail RAD;
  @JsonProperty("LSK")
  private CurrentPriceDetail LSK;
  @JsonProperty("TT")
  private CurrentPriceDetail TT;
  @JsonProperty("ACE")
  private CurrentPriceDetail ACE;
  @JsonProperty("MANTA")
  private CurrentPriceDetail MANTA;
  @JsonProperty("JUP")
  private CurrentPriceDetail JUP;
  @JsonProperty("STRK")
  private CurrentPriceDetail STRK;
  private String date;

  public Map<String, CurrentPriceDetail> getAllCoinCurrentPrice() {
    Map<String, CurrentPriceDetail> currentCoinPriceMap = new HashMap<>();
    currentCoinPriceMap.put("BTC", BTC);
    currentCoinPriceMap.put("ETH", ETH);
    currentCoinPriceMap.put("ETC", ETC);
    currentCoinPriceMap.put("XRP", XRP);
    currentCoinPriceMap.put("BCH", BCH);
    currentCoinPriceMap.put("QTUM", QTUM);
    currentCoinPriceMap.put("BTG", BTG);
    currentCoinPriceMap.put("EOS", EOS);
    currentCoinPriceMap.put("ICX", ICX);
    currentCoinPriceMap.put("TRX", TRX);
    currentCoinPriceMap.put("ELF", ELF);
    currentCoinPriceMap.put("KNC", KNC);
    currentCoinPriceMap.put("GLM", GLM);
    currentCoinPriceMap.put("ZIL", ZIL);
    currentCoinPriceMap.put("WAXP", WAXP);
    currentCoinPriceMap.put("POWR", POWR);
    currentCoinPriceMap.put("LRC", LRC);
    currentCoinPriceMap.put("STEEM", STEEM);
    currentCoinPriceMap.put("STRAX", STRAX);
    currentCoinPriceMap.put("ZRX", ZRX);
    currentCoinPriceMap.put("SNT", SNT);
    currentCoinPriceMap.put("ADA", ADA);
    currentCoinPriceMap.put("CTXC", CTXC);
    currentCoinPriceMap.put("BAT", BAT);
    currentCoinPriceMap.put("THETA", THETA);
    currentCoinPriceMap.put("LOOM", LOOM);
    currentCoinPriceMap.put("WAVES", WAVES);
    currentCoinPriceMap.put("LINK", LINK);
    currentCoinPriceMap.put("ENJ", ENJ);
    currentCoinPriceMap.put("VET", VET);
    currentCoinPriceMap.put("MTL", MTL);
    currentCoinPriceMap.put("IOST", IOST);
    currentCoinPriceMap.put("AMO", AMO);
    currentCoinPriceMap.put("BSV", BSV);
    currentCoinPriceMap.put("ORBS", ORBS);
    currentCoinPriceMap.put("TFUEL", TFUEL);
    currentCoinPriceMap.put("VALOR", VALOR);
    currentCoinPriceMap.put("CON", CON);
    currentCoinPriceMap.put("ANKR", ANKR);
    currentCoinPriceMap.put("MIX", MIX);
    currentCoinPriceMap.put("CRO", CRO);
    currentCoinPriceMap.put("FX", FX);
    currentCoinPriceMap.put("CHR", CHR);
    currentCoinPriceMap.put("MBL", MBL);
    currentCoinPriceMap.put("MXC", MXC);
    currentCoinPriceMap.put("FCT2", FCT2);
    currentCoinPriceMap.put("WOM", WOM);
    currentCoinPriceMap.put("BOA", BOA);
    currentCoinPriceMap.put("MEV", MEV);
    currentCoinPriceMap.put("SXP", SXP);
    currentCoinPriceMap.put("COS", COS);
    currentCoinPriceMap.put("EL", EL);
    currentCoinPriceMap.put("HIVE", HIVE);
    currentCoinPriceMap.put("XPR", XPR);
    currentCoinPriceMap.put("VRA", VRA);
    currentCoinPriceMap.put("FIT", FIT);
    currentCoinPriceMap.put("EGG", EGG);
    currentCoinPriceMap.put("BORA", BORA);
    currentCoinPriceMap.put("ARPA", ARPA);
    currentCoinPriceMap.put("CTC", CTC);
    currentCoinPriceMap.put("APM", APM);
    currentCoinPriceMap.put("CKB", CKB);
    currentCoinPriceMap.put("AERGO", AERGO);
    currentCoinPriceMap.put("EVZ", EVZ);
    currentCoinPriceMap.put("QTCON", QTCON);
    currentCoinPriceMap.put("UNI", UNI);
    currentCoinPriceMap.put("YFI", YFI);
    currentCoinPriceMap.put("UMA", UMA);
    currentCoinPriceMap.put("AAVE", AAVE);
    currentCoinPriceMap.put("COMP", COMP);
    currentCoinPriceMap.put("BAL", BAL);
    currentCoinPriceMap.put("RSR", RSR);
    currentCoinPriceMap.put("NMR", NMR);
    currentCoinPriceMap.put("RLC", RLC);
    currentCoinPriceMap.put("UOS", UOS);
    currentCoinPriceMap.put("SAND", SAND);
    currentCoinPriceMap.put("STPT", STPT);
    currentCoinPriceMap.put("BEL", BEL);
    currentCoinPriceMap.put("OBSR", OBSR);
    currentCoinPriceMap.put("ORC", ORC);
    currentCoinPriceMap.put("POLA", POLA);
    currentCoinPriceMap.put("ADP", ADP);
    currentCoinPriceMap.put("DVI", DVI);
    currentCoinPriceMap.put("GHX", GHX);
    currentCoinPriceMap.put("MVC", MVC);
    currentCoinPriceMap.put("BLY", BLY);
    currentCoinPriceMap.put("GRT", GRT);
    currentCoinPriceMap.put("BIOT", BIOT);
    currentCoinPriceMap.put("SNX", SNX);
    currentCoinPriceMap.put("SOFI", SOFI);
    currentCoinPriceMap.put("GRACY", GRACY);
    currentCoinPriceMap.put("OXT", OXT);
    currentCoinPriceMap.put("MAP", MAP);
    currentCoinPriceMap.put("AQT", AQT);
    currentCoinPriceMap.put("PLA", PLA);
    currentCoinPriceMap.put("WIKEN", WIKEN);
    currentCoinPriceMap.put("CTSI", CTSI);
    currentCoinPriceMap.put("MANA", MANA);
    currentCoinPriceMap.put("LPT", LPT);
    currentCoinPriceMap.put("MKR", MKR);
    currentCoinPriceMap.put("SUSHI", SUSHI);
    currentCoinPriceMap.put("ASM", ASM);
    currentCoinPriceMap.put("PUNDIX", PUNDIX);
    currentCoinPriceMap.put("CELR", CELR);
    currentCoinPriceMap.put("FRONT", FRONT);
    currentCoinPriceMap.put("RLY", RLY);
    currentCoinPriceMap.put("OCEAN", OCEAN);
    currentCoinPriceMap.put("BFC", BFC);
    currentCoinPriceMap.put("ALICE", ALICE);
    currentCoinPriceMap.put("OGN", OGN);
    currentCoinPriceMap.put("COTI", COTI);
    currentCoinPriceMap.put("CAKE", CAKE);
    currentCoinPriceMap.put("BNT", BNT);
    currentCoinPriceMap.put("XVS", XVS);
    currentCoinPriceMap.put("SWAP", SWAP);
    currentCoinPriceMap.put("CHZ", CHZ);
    currentCoinPriceMap.put("AXS", AXS);
    currentCoinPriceMap.put("DAO", DAO);
    currentCoinPriceMap.put("SIX", SIX);
    currentCoinPriceMap.put("DAI", DAI);
    currentCoinPriceMap.put("SHIB", SHIB);
    currentCoinPriceMap.put("MATIC", MATIC);
    currentCoinPriceMap.put("WOO", WOO);
    currentCoinPriceMap.put("ACH", ACH);
    currentCoinPriceMap.put("VELO", VELO);
    currentCoinPriceMap.put("XLM", XLM);
    currentCoinPriceMap.put("ONT", ONT);
    currentCoinPriceMap.put("META", META);
    currentCoinPriceMap.put("KLAY", KLAY);
    currentCoinPriceMap.put("ONG", ONG);
    currentCoinPriceMap.put("ALGO", ALGO);
    currentCoinPriceMap.put("JST", JST);
    currentCoinPriceMap.put("XTZ", XTZ);
    currentCoinPriceMap.put("MLK", MLK);
    currentCoinPriceMap.put("DOT", DOT);
    currentCoinPriceMap.put("ATOM", ATOM);
    currentCoinPriceMap.put("SSX", SSX);
    currentCoinPriceMap.put("TEMCO", TEMCO);
    currentCoinPriceMap.put("DOGE", DOGE);
    currentCoinPriceMap.put("KSM", KSM);
    currentCoinPriceMap.put("CTK", CTK);
    currentCoinPriceMap.put("BNB", BNB);
    currentCoinPriceMap.put("NFT", NFT);
    currentCoinPriceMap.put("SUN", SUN);
    currentCoinPriceMap.put("XEC", XEC);
    currentCoinPriceMap.put("AGIX", AGIX);
    currentCoinPriceMap.put("SOL", SOL);
    currentCoinPriceMap.put("FNSA", FNSA);
    currentCoinPriceMap.put("EGLD", EGLD);
    currentCoinPriceMap.put("MASK", MASK);
    currentCoinPriceMap.put("C98", C98);
    currentCoinPriceMap.put("MED", MED);
    currentCoinPriceMap.put("ONEINCH", ONEINCH);
    currentCoinPriceMap.put("CRV", CRV);
    currentCoinPriceMap.put("BOBA", BOBA);
    currentCoinPriceMap.put("DYDX", DYDX);
    currentCoinPriceMap.put("MINA", MINA);
    currentCoinPriceMap.put("FLOW", FLOW);
    currentCoinPriceMap.put("JOE", JOE);
    currentCoinPriceMap.put("GALA", GALA);
    currentCoinPriceMap.put("BTT", BTT);
    currentCoinPriceMap.put("JASMY", JASMY);
    currentCoinPriceMap.put("REQ", REQ);
    currentCoinPriceMap.put("CSPR", CSPR);
    currentCoinPriceMap.put("AVAX", AVAX);
    currentCoinPriceMap.put("TDROP", TDROP);
    currentCoinPriceMap.put("HBAR", HBAR);
    currentCoinPriceMap.put("FANC", FANC);
    currentCoinPriceMap.put("NPT", NPT);
    currentCoinPriceMap.put("REI", REI);
    currentCoinPriceMap.put("T", T);
    currentCoinPriceMap.put("MBX", MBX);
    currentCoinPriceMap.put("GMT", GMT);
    currentCoinPriceMap.put("TAVA", TAVA);
    currentCoinPriceMap.put("DAR", DAR);
    currentCoinPriceMap.put("APE", APE);
    currentCoinPriceMap.put("WNCG", WNCG);
    currentCoinPriceMap.put("ALT", ALT);
    currentCoinPriceMap.put("XCN", XCN);
    currentCoinPriceMap.put("AZIT", AZIT);
    currentCoinPriceMap.put("FLR", FLR);
    currentCoinPriceMap.put("SFP", SFP);
    currentCoinPriceMap.put("FITFI", FITFI);
    currentCoinPriceMap.put("STAT", STAT);
    currentCoinPriceMap.put("CRTS", CRTS);
    currentCoinPriceMap.put("VIX", VIX);
    currentCoinPriceMap.put("LBL", LBL);
    currentCoinPriceMap.put("FLZ", FLZ);
    currentCoinPriceMap.put("LM", LM);
    currentCoinPriceMap.put("GRND", GRND);
    currentCoinPriceMap.put("APT", APT);
    currentCoinPriceMap.put("BLUR", BLUR);
    currentCoinPriceMap.put("WEMIX", WEMIX);
    currentCoinPriceMap.put("OAS", OAS);
    currentCoinPriceMap.put("HOOK", HOOK);
    currentCoinPriceMap.put("ENTC", ENTC);
    currentCoinPriceMap.put("ONIT", ONIT);
    currentCoinPriceMap.put("OP", OP);
    currentCoinPriceMap.put("ROA", ROA);
    currentCoinPriceMap.put("GMX", GMX);
    currentCoinPriceMap.put("STX", STX);
    currentCoinPriceMap.put("XPLA", XPLA);
    currentCoinPriceMap.put("ARB", ARB);
    currentCoinPriceMap.put("INJ", INJ);
    currentCoinPriceMap.put("HFT", HFT);
    currentCoinPriceMap.put("RPL", RPL);
    currentCoinPriceMap.put("IMX", IMX);
    currentCoinPriceMap.put("CFX", CFX);
    currentCoinPriceMap.put("ACS", ACS);
    currentCoinPriceMap.put("FXS", FXS);
    currentCoinPriceMap.put("CELO", CELO);
    currentCoinPriceMap.put("LDO", LDO);
    currentCoinPriceMap.put("FTM", FTM);
    currentCoinPriceMap.put("FET", FET);
    currentCoinPriceMap.put("SUI", SUI);
    currentCoinPriceMap.put("NCT", NCT);
    currentCoinPriceMap.put("FLOKI", FLOKI);
    currentCoinPriceMap.put("ALEX", ALEX);
    currentCoinPriceMap.put("ID", ID);
    currentCoinPriceMap.put("RNDR", RNDR);
    currentCoinPriceMap.put("STG", STG);
    currentCoinPriceMap.put("OSMO", OSMO);
    currentCoinPriceMap.put("GAL", GAL);
    currentCoinPriceMap.put("ILV", ILV);
    currentCoinPriceMap.put("MAV", MAV);
    currentCoinPriceMap.put("RSS3", RSS3);
    currentCoinPriceMap.put("AUDIO", AUDIO);
    currentCoinPriceMap.put("AGI", AGI);
    currentCoinPriceMap.put("RDNT", RDNT);
    currentCoinPriceMap.put("ASTR", ASTR);
    currentCoinPriceMap.put("WLD", WLD);
    currentCoinPriceMap.put("FLUX", FLUX);
    currentCoinPriceMap.put("RVN", RVN);
    currentCoinPriceMap.put("LEVER", LEVER);
    currentCoinPriceMap.put("EDU", EDU);
    currentCoinPriceMap.put("SEI", SEI);
    currentCoinPriceMap.put("WAXL", WAXL);
    currentCoinPriceMap.put("MOC", MOC);
    currentCoinPriceMap.put("PEPE", PEPE);
    currentCoinPriceMap.put("CYBER", CYBER);
    currentCoinPriceMap.put("ARKM", ARKM);
    currentCoinPriceMap.put("PYR", PYR);
    currentCoinPriceMap.put("IOTX", IOTX);
    currentCoinPriceMap.put("HIGH", HIGH);
    currentCoinPriceMap.put("PENDLE", PENDLE);
    currentCoinPriceMap.put("STORJ", STORJ);
    currentCoinPriceMap.put("API3", API3);
    currentCoinPriceMap.put("ZTX", ZTX);
    currentCoinPriceMap.put("MNT", MNT);
    currentCoinPriceMap.put("GTC", GTC);
    currentCoinPriceMap.put("TIA", TIA);
    currentCoinPriceMap.put("ZBC", ZBC);
    currentCoinPriceMap.put("SPURS", SPURS);
    currentCoinPriceMap.put("NEO", NEO);
    currentCoinPriceMap.put("GAS", GAS);
    currentCoinPriceMap.put("HIFI", HIFI);
    currentCoinPriceMap.put("BIGTIME", BIGTIME);
    currentCoinPriceMap.put("ARK", ARK);
    currentCoinPriceMap.put("YGG", YGG);
    currentCoinPriceMap.put("KAVA", KAVA);
    currentCoinPriceMap.put("STMX", STMX);
    currentCoinPriceMap.put("MAGIC", MAGIC);
    currentCoinPriceMap.put("USDT", USDT);
    currentCoinPriceMap.put("USDC", USDC);
    currentCoinPriceMap.put("RAD", RAD);
    currentCoinPriceMap.put("LSK", LSK);
    currentCoinPriceMap.put("TT", TT);
    currentCoinPriceMap.put("ACE", ACE);
    currentCoinPriceMap.put("MANTA", MANTA);
    currentCoinPriceMap.put("JUP", JUP);
    currentCoinPriceMap.put("STRK", STRK);

    return currentCoinPriceMap;
  }

}
