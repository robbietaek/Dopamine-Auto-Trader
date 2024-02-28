package com.dopamine.bithumb.trade.auto.model.account;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serial;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Getter
@RequiredArgsConstructor
@JsonIgnoreProperties
public class AccountData implements Serializable {

  @Serial
  private static final long serialVersionUID = 5391986458605010616L;

  @JsonProperty("total_pyth")
  private String totalPyth;

  @JsonProperty("in_use_pyth")
  private String inUsePyth;

  @JsonProperty("available_pyth")
  private String availablePyth;

  @JsonProperty("xcoin_last_pyth")
  private String xcoinLastPyth;

  @JsonProperty("total_p")
  private String totalP;
  @JsonProperty("in_use_p")
  private String inUseP;
  @JsonProperty("available_p")
  private String availableP;
  @JsonProperty("xcoin_last_p")
  private String xcoinLastP;
  @JsonProperty("total_bm")
  private String totalBm;
  @JsonProperty("in_use_bm")
  private String inUseBm;
  @JsonProperty("available_bm")
  private String availableBm;
  @JsonProperty("xcoin_last_bm")
  private String xcoinLastBm;
  @JsonProperty("total_krw")
  private String totalKrw;
  @JsonProperty("in_use_krw")
  private String inUseKrw;
  @JsonProperty("available_krw")
  private String availableKrw;
  @JsonProperty("total_btc")
  private String totalBtc;
  @JsonProperty("in_use_btc")
  private String inUseBtc;
  @JsonProperty("available_btc")
  private String availableBtc;
  @JsonProperty("xcoin_last_btc")
  private String xcoinLastBtc;
  @JsonProperty("total_eth")
  private String totalEth;
  @JsonProperty("in_use_eth")
  private String inUseEth;
  @JsonProperty("available_eth")
  private String availableEth;
  @JsonProperty("xcoin_last_eth")
  private String xcoinLastEth;
  @JsonProperty("total_dash")
  private String totalDash;
  @JsonProperty("in_use_dash")
  private String inUseDash;
  @JsonProperty("available_dash")
  private String availableDash;
  @JsonProperty("xcoin_last_dash")
  private String xcoinLastDash;
  @JsonProperty("total_ltc")
  private String totalLtc;
  @JsonProperty("in_use_ltc")
  private String inUseLtc;
  @JsonProperty("available_ltc")
  private String availableLtc;
  @JsonProperty("xcoin_last_ltc")
  private String xcoinLastLtc;
  @JsonProperty("total_etc")
  private String totalEtc;
  @JsonProperty("in_use_etc")
  private String inUseEtc;
  @JsonProperty("available_etc")
  private String availableEtc;
  @JsonProperty("xcoin_last_etc")
  private String xcoinLastEtc;
  @JsonProperty("total_xrp")
  private String totalXrp;
  @JsonProperty("in_use_xrp")
  private String inUseXrp;
  @JsonProperty("available_xrp")
  private String availableXrp;
  @JsonProperty("xcoin_last_xrp")
  private String xcoinLastXrp;
  @JsonProperty("total_bch")
  private String totalBch;
  @JsonProperty("in_use_bch")
  private String inUseBch;
  @JsonProperty("available_bch")
  private String availableBch;
  @JsonProperty("xcoin_last_bch")
  private String xcoinLastBch;
  @JsonProperty("total_xmr")
  private String totalXmr;
  @JsonProperty("in_use_xmr")
  private String inUseXmr;
  @JsonProperty("available_xmr")
  private String availableXmr;
  @JsonProperty("xcoin_last_xmr")
  private String xcoinLastXmr;
  @JsonProperty("total_zec")
  private String totalZec;
  @JsonProperty("in_use_zec")
  private String inUseZec;
  @JsonProperty("available_zec")
  private String availableZec;
  @JsonProperty("xcoin_last_zec")
  private String xcoinLastZec;
  @JsonProperty("total_qtum")
  private String totalQtum;
  @JsonProperty("in_use_qtum")
  private String inUseQtum;
  @JsonProperty("available_qtum")
  private String availableQtum;
  @JsonProperty("xcoin_last_qtum")
  private String xcoinLastQtum;
  @JsonProperty("total_btg")
  private String totalBtg;
  @JsonProperty("in_use_btg")
  private String inUseBtg;
  @JsonProperty("available_btg")
  private String availableBtg;
  @JsonProperty("xcoin_last_btg")
  private String xcoinLastBtg;
  @JsonProperty("total_eos")
  private String totalEos;
  @JsonProperty("in_use_eos")
  private String inUseEos;
  @JsonProperty("available_eos")
  private String availableEos;
  @JsonProperty("xcoin_last_eos")
  private String xcoinLastEos;
  @JsonProperty("total_icx")
  private String totalIcx;
  @JsonProperty("in_use_icx")
  private String inUseIcx;
  @JsonProperty("available_icx")
  private String availableIcx;
  @JsonProperty("xcoin_last_icx")
  private String xcoinLastIcx;
  @JsonProperty("total_ven")
  private String totalVen;
  @JsonProperty("in_use_ven")
  private String inUseVen;
  @JsonProperty("available_ven")
  private String availableVen;
  @JsonProperty("xcoin_last_ven")
  private String xcoinLastVen;
  @JsonProperty("total_trx")
  private String totalTrx;
  @JsonProperty("in_use_trx")
  private String inUseTrx;
  @JsonProperty("available_trx")
  private String availableTrx;
  @JsonProperty("xcoin_last_trx")
  private String xcoinLastTrx;
  @JsonProperty("total_elf")
  private String totalElf;
  @JsonProperty("in_use_elf")
  private String inUseElf;
  @JsonProperty("available_elf")
  private String availableElf;
  @JsonProperty("xcoin_last_elf")
  private String xcoinLastElf;
  @JsonProperty("total_mith")
  private String totalMith;
  @JsonProperty("in_use_mith")
  private String inUseMith;
  @JsonProperty("available_mith")
  private String availableMith;
  @JsonProperty("xcoin_last_mith")
  private String xcoinLastMith;
  @JsonProperty("total_mco")
  private String totalMco;
  @JsonProperty("in_use_mco")
  private String inUseMco;
  @JsonProperty("available_mco")
  private String availableMco;
  @JsonProperty("xcoin_last_mco")
  private String xcoinLastMco;
  @JsonProperty("total_omg")
  private String totalOmg;
  @JsonProperty("in_use_omg")
  private String inUseOmg;
  @JsonProperty("available_omg")
  private String availableOmg;
  @JsonProperty("xcoin_last_omg")
  private String xcoinLastOmg;
  @JsonProperty("total_knc")
  private String totalKnc;
  @JsonProperty("in_use_knc")
  private String inUseKnc;
  @JsonProperty("available_knc")
  private String availableKnc;
  @JsonProperty("xcoin_last_knc")
  private String xcoinLastKnc;
  @JsonProperty("total_glm")
  private String totalGlm;
  @JsonProperty("in_use_glm")
  private String inUseGlm;
  @JsonProperty("available_glm")
  private String availableGlm;
  @JsonProperty("xcoin_last_glm")
  private String xcoinLastGlm;
  @JsonProperty("total_hsr")
  private String totalHsr;
  @JsonProperty("in_use_hsr")
  private String inUseHsr;
  @JsonProperty("available_hsr")
  private String availableHsr;
  @JsonProperty("xcoin_last_hsr")
  private String xcoinLastHsr;
  @JsonProperty("total_zil")
  private String totalZil;
  @JsonProperty("in_use_zil")
  private String inUseZil;
  @JsonProperty("available_zil")
  private String availableZil;
  @JsonProperty("xcoin_last_zil")
  private String xcoinLastZil;
  @JsonProperty("total_ethos")
  private String totalEthos;
  @JsonProperty("in_use_ethos")
  private String inUseEthos;
  @JsonProperty("available_ethos")
  private String availableEthos;
  @JsonProperty("xcoin_last_ethos")
  private String xcoinLastEthos;
  @JsonProperty("total_pay")
  private String totalPay;
  @JsonProperty("in_use_pay")
  private String inUsePay;
  @JsonProperty("available_pay")
  private String availablePay;
  @JsonProperty("xcoin_last_pay")
  private String xcoinLastPay;
  @JsonProperty("total_waxp")
  private String totalWaxp;
  @JsonProperty("in_use_waxp")
  private String inUseWaxp;
  @JsonProperty("available_waxp")
  private String availableWaxp;
  @JsonProperty("xcoin_last_waxp")
  private String xcoinLastWaxp;
  @JsonProperty("total_powr")
  private String totalPowr;
  @JsonProperty("in_use_powr")
  private String inUsePowr;
  @JsonProperty("available_powr")
  private String availablePowr;
  @JsonProperty("xcoin_last_powr")
  private String xcoinLastPowr;
  @JsonProperty("total_lrc")
  private String totalLrc;
  @JsonProperty("in_use_lrc")
  private String inUseLrc;
  @JsonProperty("available_lrc")
  private String availableLrc;
  @JsonProperty("xcoin_last_lrc")
  private String xcoinLastLrc;
  @JsonProperty("total_gto")
  private String totalGto;
  @JsonProperty("in_use_gto")
  private String inUseGto;
  @JsonProperty("available_gto")
  private String availableGto;
  @JsonProperty("xcoin_last_gto")
  private String xcoinLastGto;
  @JsonProperty("total_pch")
  private String totalPch;
  @JsonProperty("in_use_pch")
  private String inUsePch;
  @JsonProperty("available_pch")
  private String availablePch;
  @JsonProperty("xcoin_last_pch")
  private String xcoinLastPch;
  @JsonProperty("total_eosdac")
  private String totalEosdac;
  @JsonProperty("in_use_eosdac")
  private String inUseEosdac;
  @JsonProperty("available_eosdac")
  private String availableEosdac;
  @JsonProperty("xcoin_last_eosdac")
  private String xcoinLastEosdac;
  @JsonProperty("total_steem")
  private String totalSteem;
  @JsonProperty("in_use_steem")
  private String inUseSteem;
  @JsonProperty("available_steem")
  private String availableSteem;
  @JsonProperty("xcoin_last_steem")
  private String xcoinLastSteem;
  @JsonProperty("total_strax")
  private String totalStrax;
  @JsonProperty("in_use_strax")
  private String inUseStrax;
  @JsonProperty("available_strax")
  private String availableStrax;
  @JsonProperty("xcoin_last_strax")
  private String xcoinLastStrax;
  @JsonProperty("total_ae")
  private String totalAe;
  @JsonProperty("in_use_ae")
  private String inUseAe;
  @JsonProperty("available_ae")
  private String availableAe;
  @JsonProperty("xcoin_last_ae")
  private String xcoinLastAe;
  @JsonProperty("total_zrx")
  private String totalZrx;
  @JsonProperty("in_use_zrx")
  private String inUseZrx;
  @JsonProperty("available_zrx")
  private String availableZrx;
  @JsonProperty("xcoin_last_zrx")
  private String xcoinLastZrx;
  @JsonProperty("total_rep")
  private String totalRep;
  @JsonProperty("in_use_rep")
  private String inUseRep;
  @JsonProperty("available_rep")
  private String availableRep;
  @JsonProperty("xcoin_last_rep")
  private String xcoinLastRep;
  @JsonProperty("total_xem")
  private String totalXem;
  @JsonProperty("in_use_xem")
  private String inUseXem;
  @JsonProperty("available_xem")
  private String availableXem;
  @JsonProperty("xcoin_last_xem")
  private String xcoinLastXem;
  @JsonProperty("total_snt")
  private String totalSnt;
  @JsonProperty("in_use_snt")
  private String inUseSnt;
  @JsonProperty("available_snt")
  private String availableSnt;
  @JsonProperty("xcoin_last_snt")
  private String xcoinLastSnt;
  @JsonProperty("total_ada")
  private String totalAda;
  @JsonProperty("in_use_ada")
  private String inUseAda;
  @JsonProperty("available_ada")
  private String availableAda;
  @JsonProperty("xcoin_last_ada")
  private String xcoinLastAda;
  @JsonProperty("total_ppt")
  private String totalPpt;
  @JsonProperty("in_use_ppt")
  private String inUsePpt;
  @JsonProperty("available_ppt")
  private String availablePpt;
  @JsonProperty("xcoin_last_ppt")
  private String xcoinLastPpt;
  @JsonProperty("total_ctxc")
  private String totalCtxc;
  @JsonProperty("in_use_ctxc")
  private String inUseCtxc;
  @JsonProperty("available_ctxc")
  private String availableCtxc;
  @JsonProperty("xcoin_last_ctxc")
  private String xcoinLastCtxc;
  @JsonProperty("total_bat")
  private String totalBat;
  @JsonProperty("in_use_bat")
  private String inUseBat;
  @JsonProperty("available_bat")
  private String availableBat;
  @JsonProperty("xcoin_last_bat")
  private String xcoinLastBat;
  @JsonProperty("total_wtc")
  private String totalWtc;
  @JsonProperty("in_use_wtc")
  private String inUseWtc;
  @JsonProperty("available_wtc")
  private String availableWtc;
  @JsonProperty("xcoin_last_wtc")
  private String xcoinLastWtc;
  @JsonProperty("total_cmt")
  private String totalCmt;
  @JsonProperty("in_use_cmt")
  private String inUseCmt;
  @JsonProperty("available_cmt")
  private String availableCmt;
  @JsonProperty("xcoin_last_cmt")
  private String xcoinLastCmt;
  @JsonProperty("total_theta")
  private String totalTheta;
  @JsonProperty("in_use_theta")
  private String inUseTheta;
  @JsonProperty("available_theta")
  private String availableTheta;
  @JsonProperty("xcoin_last_theta")
  private String xcoinLastTheta;
  @JsonProperty("total_poly")
  private String totalPoly;
  @JsonProperty("in_use_poly")
  private String inUsePoly;
  @JsonProperty("available_poly")
  private String availablePoly;
  @JsonProperty("xcoin_last_poly")
  private String xcoinLastPoly;
  @JsonProperty("total_loom")
  private String totalLoom;
  @JsonProperty("in_use_loom")
  private String inUseLoom;
  @JsonProperty("available_loom")
  private String availableLoom;
  @JsonProperty("xcoin_last_loom")
  private String xcoinLastLoom;
  @JsonProperty("total_cvc")
  private String totalCvc;
  @JsonProperty("in_use_cvc")
  private String inUseCvc;
  @JsonProperty("available_cvc")
  private String availableCvc;
  @JsonProperty("xcoin_last_cvc")
  private String xcoinLastCvc;
  @JsonProperty("total_man")
  private String totalMan;
  @JsonProperty("in_use_man")
  private String inUseMan;
  @JsonProperty("available_man")
  private String availableMan;
  @JsonProperty("xcoin_last_man")
  private String xcoinLastMan;
  @JsonProperty("total_waves")
  private String totalWaves;
  @JsonProperty("in_use_waves")
  private String inUseWaves;
  @JsonProperty("available_waves")
  private String availableWaves;
  @JsonProperty("xcoin_last_waves")
  private String xcoinLastWaves;
  @JsonProperty("total_itc")
  private String totalItc;
  @JsonProperty("in_use_itc")
  private String inUseItc;
  @JsonProperty("available_itc")
  private String availableItc;
  @JsonProperty("xcoin_last_itc")
  private String xcoinLastItc;
  @JsonProperty("total_true")
  private String totalTrue;
  @JsonProperty("in_use_true")
  private String inUseTrue;
  @JsonProperty("available_true")
  private String availableTrue;
  @JsonProperty("xcoin_last_true")
  private String xcoinLastTrue;
  @JsonProperty("total_abt")
  private String totalAbt;
  @JsonProperty("in_use_abt")
  private String inUseAbt;
  @JsonProperty("available_abt")
  private String availableAbt;
  @JsonProperty("xcoin_last_abt")
  private String xcoinLastAbt;
  @JsonProperty("total_link")
  private String totalLink;
  @JsonProperty("in_use_link")
  private String inUseLink;
  @JsonProperty("available_link")
  private String availableLink;
  @JsonProperty("xcoin_last_link")
  private String xcoinLastLink;
  @JsonProperty("total_meetone")
  private String totalMeetone;
  @JsonProperty("in_use_meetone")
  private String inUseMeetone;
  @JsonProperty("available_meetone")
  private String availableMeetone;
  @JsonProperty("xcoin_last_meetone")
  private String xcoinLastMeetone;
  @JsonProperty("total_horus")
  private String totalHorus;
  @JsonProperty("in_use_horus")
  private String inUseHorus;
  @JsonProperty("available_horus")
  private String availableHorus;
  @JsonProperty("xcoin_last_horus")
  private String xcoinLastHorus;
  @JsonProperty("total_add")
  private String totalAdd;
  @JsonProperty("in_use_add")
  private String inUseAdd;
  @JsonProperty("available_add")
  private String availableAdd;
  @JsonProperty("xcoin_last_add")
  private String xcoinLastAdd;
  @JsonProperty("total_salt")
  private String totalSalt;
  @JsonProperty("in_use_salt")
  private String inUseSalt;
  @JsonProperty("available_salt")
  private String availableSalt;
  @JsonProperty("xcoin_last_salt")
  private String xcoinLastSalt;
  @JsonProperty("total_pst")
  private String totalPst;
  @JsonProperty("in_use_pst")
  private String inUsePst;
  @JsonProperty("available_pst")
  private String availablePst;
  @JsonProperty("xcoin_last_pst")
  private String xcoinLastPst;
  @JsonProperty("total_bhpc")
  private String totalBhpc;
  @JsonProperty("in_use_bhpc")
  private String inUseBhpc;
  @JsonProperty("available_bhpc")
  private String availableBhpc;
  @JsonProperty("xcoin_last_bhpc")
  private String xcoinLastBhpc;
  @JsonProperty("total_rnt")
  private String totalRnt;
  @JsonProperty("in_use_rnt")
  private String inUseRnt;
  @JsonProperty("available_rnt")
  private String availableRnt;
  @JsonProperty("xcoin_last_rnt")
  private String xcoinLastRnt;
  @JsonProperty("total_enj")
  private String totalEnj;
  @JsonProperty("in_use_enj")
  private String inUseEnj;
  @JsonProperty("available_enj")
  private String availableEnj;
  @JsonProperty("xcoin_last_enj")
  private String xcoinLastEnj;
  @JsonProperty("total_plx")
  private String totalPlx;
  @JsonProperty("in_use_plx")
  private String inUsePlx;
  @JsonProperty("available_plx")
  private String availablePlx;
  @JsonProperty("xcoin_last_plx")
  private String xcoinLastPlx;
  @JsonProperty("total_vet")
  private String totalVet;
  @JsonProperty("in_use_vet")
  private String inUseVet;
  @JsonProperty("available_vet")
  private String availableVet;
  @JsonProperty("xcoin_last_vet")
  private String xcoinLastVet;
  @JsonProperty("total_mtl")
  private String totalMtl;
  @JsonProperty("in_use_mtl")
  private String inUseMtl;
  @JsonProperty("available_mtl")
  private String availableMtl;
  @JsonProperty("xcoin_last_mtl")
  private String xcoinLastMtl;
  @JsonProperty("total_rdn")
  private String totalRdn;
  @JsonProperty("in_use_rdn")
  private String inUseRdn;
  @JsonProperty("available_rdn")
  private String availableRdn;
  @JsonProperty("xcoin_last_rdn")
  private String xcoinLastRdn;
  @JsonProperty("total_ins")
  private String totalIns;
  @JsonProperty("in_use_ins")
  private String inUseIns;
  @JsonProperty("available_ins")
  private String availableIns;
  @JsonProperty("xcoin_last_ins")
  private String xcoinLastIns;
  @JsonProperty("total_chl")
  private String totalChl;
  @JsonProperty("in_use_chl")
  private String inUseChl;
  @JsonProperty("available_chl")
  private String availableChl;
  @JsonProperty("xcoin_last_chl")
  private String xcoinLastChl;
  @JsonProperty("total_black")
  private String totalBlack;
  @JsonProperty("in_use_black")
  private String inUseBlack;
  @JsonProperty("available_black")
  private String availableBlack;
  @JsonProperty("xcoin_last_black")
  private String xcoinLastBlack;
  @JsonProperty("total_atd")
  private String totalAtd;
  @JsonProperty("in_use_atd")
  private String inUseAtd;
  @JsonProperty("available_atd")
  private String availableAtd;
  @JsonProperty("xcoin_last_atd")
  private String xcoinLastAtd;
  @JsonProperty("total_iost")
  private String totalIost;
  @JsonProperty("in_use_iost")
  private String inUseIost;
  @JsonProperty("available_iost")
  private String availableIost;
  @JsonProperty("xcoin_last_iost")
  private String xcoinLastIost;
  @JsonProperty("total_ocn")
  private String totalOcn;
  @JsonProperty("in_use_ocn")
  private String inUseOcn;
  @JsonProperty("available_ocn")
  private String availableOcn;
  @JsonProperty("xcoin_last_ocn")
  private String xcoinLastOcn;
  @JsonProperty("total_tmtg")
  private String totalTmtg;
  @JsonProperty("in_use_tmtg")
  private String inUseTmtg;
  @JsonProperty("available_tmtg")
  private String availableTmtg;
  @JsonProperty("xcoin_last_tmtg")
  private String xcoinLastTmtg;
  @JsonProperty("total_qkc")
  private String totalQkc;
  @JsonProperty("in_use_qkc")
  private String inUseQkc;
  @JsonProperty("available_qkc")
  private String availableQkc;
  @JsonProperty("xcoin_last_qkc")
  private String xcoinLastQkc;
  @JsonProperty("total_bznt")
  private String totalBznt;
  @JsonProperty("in_use_bznt")
  private String inUseBznt;
  @JsonProperty("available_bznt")
  private String availableBznt;
  @JsonProperty("xcoin_last_bznt")
  private String xcoinLastBznt;
  @JsonProperty("total_arn")
  private String totalArn;
  @JsonProperty("in_use_arn")
  private String inUseArn;
  @JsonProperty("available_arn")
  private String availableArn;
  @JsonProperty("xcoin_last_arn")
  private String xcoinLastArn;
  @JsonProperty("total_atolo")
  private String totalAtolo;
  @JsonProperty("in_use_atolo")
  private String inUseAtolo;
  @JsonProperty("available_atolo")
  private String availableAtolo;
  @JsonProperty("xcoin_last_atolo")
  private String xcoinLastAtolo;
  @JsonProperty("total_npxs")
  private String totalNpxs;
  @JsonProperty("in_use_npxs")
  private String inUseNpxs;
  @JsonProperty("available_npxs")
  private String availableNpxs;
  @JsonProperty("xcoin_last_npxs")
  private String xcoinLastNpxs;
  @JsonProperty("total_lba")
  private String totalLba;
  @JsonProperty("in_use_lba")
  private String inUseLba;
  @JsonProperty("available_lba")
  private String availableLba;
  @JsonProperty("xcoin_last_lba")
  private String xcoinLastLba;
  @JsonProperty("total_wet")
  private String totalWet;
  @JsonProperty("in_use_wet")
  private String inUseWet;
  @JsonProperty("available_wet")
  private String availableWet;
  @JsonProperty("xcoin_last_wet")
  private String xcoinLastWet;
  @JsonProperty("total_amo")
  private String totalAmo;
  @JsonProperty("in_use_amo")
  private String inUseAmo;
  @JsonProperty("available_amo")
  private String availableAmo;
  @JsonProperty("xcoin_last_amo")
  private String xcoinLastAmo;
  @JsonProperty("total_bsv")
  private String totalBsv;
  @JsonProperty("in_use_bsv")
  private String inUseBsv;
  @JsonProperty("available_bsv")
  private String availableBsv;
  @JsonProperty("xcoin_last_bsv")
  private String xcoinLastBsv;
  @JsonProperty("total_keos")
  private String totalKeos;
  @JsonProperty("in_use_keos")
  private String inUseKeos;
  @JsonProperty("available_keos")
  private String availableKeos;
  @JsonProperty("xcoin_last_keos")
  private String xcoinLastKeos;
  @JsonProperty("total_rom")
  private String totalRom;
  @JsonProperty("in_use_rom")
  private String inUseRom;
  @JsonProperty("available_rom")
  private String availableRom;
  @JsonProperty("xcoin_last_rom")
  private String xcoinLastRom;
  @JsonProperty("total_bxa")
  private String totalBxa;
  @JsonProperty("in_use_bxa")
  private String inUseBxa;
  @JsonProperty("available_bxa")
  private String availableBxa;
  @JsonProperty("xcoin_last_bxa")
  private String xcoinLastBxa;
  @JsonProperty("total_apis")
  private String totalApis;
  @JsonProperty("in_use_apis")
  private String inUseApis;
  @JsonProperty("available_apis")
  private String availableApis;
  @JsonProperty("xcoin_last_apis")
  private String xcoinLastApis;
  @JsonProperty("total_dac")
  private String totalDac;
  @JsonProperty("in_use_dac")
  private String inUseDac;
  @JsonProperty("available_dac")
  private String availableDac;
  @JsonProperty("xcoin_last_dac")
  private String xcoinLastDac;
  @JsonProperty("total_dacc")
  private String totalDacc;
  @JsonProperty("in_use_dacc")
  private String inUseDacc;
  @JsonProperty("available_dacc")
  private String availableDacc;
  @JsonProperty("xcoin_last_dacc")
  private String xcoinLastDacc;
  @JsonProperty("total_auto")
  private String totalAuto;
  @JsonProperty("in_use_auto")
  private String inUseAuto;
  @JsonProperty("available_auto")
  private String availableAuto;
  @JsonProperty("xcoin_last_auto")
  private String xcoinLastAuto;
  @JsonProperty("total_orbs")
  private String totalOrbs;
  @JsonProperty("in_use_orbs")
  private String inUseOrbs;
  @JsonProperty("available_orbs")
  private String availableOrbs;
  @JsonProperty("xcoin_last_orbs")
  private String xcoinLastOrbs;
  @JsonProperty("total_tfuel")
  private String totalTfuel;
  @JsonProperty("in_use_tfuel")
  private String inUseTfuel;
  @JsonProperty("available_tfuel")
  private String availableTfuel;
  @JsonProperty("xcoin_last_tfuel")
  private String xcoinLastTfuel;
  @JsonProperty("total_valor")
  private String totalValor;
  @JsonProperty("in_use_valor")
  private String inUseValor;
  @JsonProperty("available_valor")
  private String availableValor;
  @JsonProperty("xcoin_last_valor")
  private String xcoinLastValor;
  @JsonProperty("total_con")
  private String totalCon;
  @JsonProperty("in_use_con")
  private String inUseCon;
  @JsonProperty("available_con")
  private String availableCon;
  @JsonProperty("xcoin_last_con")
  private String xcoinLastCon;
  @JsonProperty("total_ankr")
  private String totalAnkr;
  @JsonProperty("in_use_ankr")
  private String inUseAnkr;
  @JsonProperty("available_ankr")
  private String availableAnkr;
  @JsonProperty("xcoin_last_ankr")
  private String xcoinLastAnkr;
  @JsonProperty("total_mix")
  private String totalMix;
  @JsonProperty("in_use_mix")
  private String inUseMix;
  @JsonProperty("available_mix")
  private String availableMix;
  @JsonProperty("xcoin_last_mix")
  private String xcoinLastMix;
  @JsonProperty("total_vtho")
  private String totalVtho;
  @JsonProperty("in_use_vtho")
  private String inUseVtho;
  @JsonProperty("available_vtho")
  private String availableVtho;
  @JsonProperty("xcoin_last_vtho")
  private String xcoinLastVtho;
  @JsonProperty("total_lamb")
  private String totalLamb;
  @JsonProperty("in_use_lamb")
  private String inUseLamb;
  @JsonProperty("available_lamb")
  private String availableLamb;
  @JsonProperty("xcoin_last_lamb")
  private String xcoinLastLamb;
  @JsonProperty("total_cro")
  private String totalCro;
  @JsonProperty("in_use_cro")
  private String inUseCro;
  @JsonProperty("available_cro")
  private String availableCro;
  @JsonProperty("xcoin_last_cro")
  private String xcoinLastCro;
  @JsonProperty("total_fx")
  private String totalFx;
  @JsonProperty("in_use_fx")
  private String inUseFx;
  @JsonProperty("available_fx")
  private String availableFx;
  @JsonProperty("xcoin_last_fx")
  private String xcoinLastFx;
  @JsonProperty("total_chr")
  private String totalChr;
  @JsonProperty("in_use_chr")
  private String inUseChr;
  @JsonProperty("available_chr")
  private String availableChr;
  @JsonProperty("xcoin_last_chr")
  private String xcoinLastChr;
  @JsonProperty("total_mbl")
  private String totalMbl;
  @JsonProperty("in_use_mbl")
  private String inUseMbl;
  @JsonProperty("available_mbl")
  private String availableMbl;
  @JsonProperty("xcoin_last_mbl")
  private String xcoinLastMbl;
  @JsonProperty("total_mxc")
  private String totalMxc;
  @JsonProperty("in_use_mxc")
  private String inUseMxc;
  @JsonProperty("available_mxc")
  private String availableMxc;
  @JsonProperty("xcoin_last_mxc")
  private String xcoinLastMxc;
  @JsonProperty("total_fab")
  private String totalFab;
  @JsonProperty("in_use_fab")
  private String inUseFab;
  @JsonProperty("available_fab")
  private String availableFab;
  @JsonProperty("xcoin_last_fab")
  private String xcoinLastFab;
  @JsonProperty("total_ogo")
  private String totalOgo;
  @JsonProperty("in_use_ogo")
  private String inUseOgo;
  @JsonProperty("available_ogo")
  private String availableOgo;
  @JsonProperty("xcoin_last_ogo")
  private String xcoinLastOgo;
  @JsonProperty("total_win")
  private String totalWin;
  @JsonProperty("in_use_win")
  private String inUseWin;
  @JsonProperty("available_win")
  private String availableWin;
  @JsonProperty("xcoin_last_win")
  private String xcoinLastWin;
  @JsonProperty("total_dvp")
  private String totalDvp;
  @JsonProperty("in_use_dvp")
  private String inUseDvp;
  @JsonProperty("available_dvp")
  private String availableDvp;
  @JsonProperty("xcoin_last_dvp")
  private String xcoinLastDvp;
  @JsonProperty("total_fct2")
  private String totalFct2;
  @JsonProperty("in_use_fct2")
  private String inUseFct2;
  @JsonProperty("available_fct2")
  private String availableFct2;
  @JsonProperty("xcoin_last_fct2")
  private String xcoinLastFct2;
  @JsonProperty("total_fnb")
  private String totalFnb;
  @JsonProperty("in_use_fnb")
  private String inUseFnb;
  @JsonProperty("available_fnb")
  private String availableFnb;
  @JsonProperty("xcoin_last_fnb")
  private String xcoinLastFnb;
  @JsonProperty("total_fzz")
  private String totalFzz;
  @JsonProperty("in_use_fzz")
  private String inUseFzz;
  @JsonProperty("available_fzz")
  private String availableFzz;
  @JsonProperty("xcoin_last_fzz")
  private String xcoinLastFzz;
  @JsonProperty("total_trv")
  private String totalTrv;
  @JsonProperty("in_use_trv")
  private String inUseTrv;
  @JsonProperty("available_trv")
  private String availableTrv;
  @JsonProperty("xcoin_last_trv")
  private String xcoinLastTrv;
  @JsonProperty("total_pcm")
  private String totalPcm;
  @JsonProperty("in_use_pcm")
  private String inUsePcm;
  @JsonProperty("available_pcm")
  private String availablePcm;
  @JsonProperty("xcoin_last_pcm")
  private String xcoinLastPcm;
  @JsonProperty("total_dad")
  private String totalDad;
  @JsonProperty("in_use_dad")
  private String inUseDad;
  @JsonProperty("available_dad")
  private String availableDad;
  @JsonProperty("xcoin_last_dad")
  private String xcoinLastDad;
  @JsonProperty("total_aoa")
  private String totalAoa;
  @JsonProperty("in_use_aoa")
  private String inUseAoa;
  @JsonProperty("available_aoa")
  private String availableAoa;
  @JsonProperty("xcoin_last_aoa")
  private String xcoinLastAoa;
  @JsonProperty("total_xsr")
  private String totalXsr;
  @JsonProperty("in_use_xsr")
  private String inUseXsr;
  @JsonProperty("available_xsr")
  private String availableXsr;
  @JsonProperty("xcoin_last_xsr")
  private String xcoinLastXsr;
  @JsonProperty("total_wom")
  private String totalWom;
  @JsonProperty("in_use_wom")
  private String inUseWom;
  @JsonProperty("available_wom")
  private String availableWom;
  @JsonProperty("xcoin_last_wom")
  private String xcoinLastWom;
  @JsonProperty("total_soc")
  private String totalSoc;
  @JsonProperty("in_use_soc")
  private String inUseSoc;
  @JsonProperty("available_soc")
  private String availableSoc;
  @JsonProperty("xcoin_last_soc")
  private String xcoinLastSoc;
  @JsonProperty("total_em")
  private String totalEm;
  @JsonProperty("in_use_em")
  private String inUseEm;
  @JsonProperty("available_em")
  private String availableEm;
  @JsonProperty("xcoin_last_em")
  private String xcoinLastEm;
  @JsonProperty("total_qbz")
  private String totalQbz;
  @JsonProperty("in_use_qbz")
  private String inUseQbz;
  @JsonProperty("available_qbz")
  private String availableQbz;
  @JsonProperty("xcoin_last_qbz")
  private String xcoinLastQbz;
  @JsonProperty("total_boa")
  private String totalBoa;
  @JsonProperty("in_use_boa")
  private String inUseBoa;
  @JsonProperty("available_boa")
  private String availableBoa;
  @JsonProperty("xcoin_last_boa")
  private String xcoinLastBoa;
  @JsonProperty("total_wpx")
  private String totalWpx;
  @JsonProperty("in_use_wpx")
  private String inUseWpx;
  @JsonProperty("available_wpx")
  private String availableWpx;
  @JsonProperty("xcoin_last_wpx")
  private String xcoinLastWpx;
  @JsonProperty("total_mev")
  private String totalMev;
  @JsonProperty("in_use_mev")
  private String inUseMev;
  @JsonProperty("available_mev")
  private String availableMev;
  @JsonProperty("xcoin_last_mev")
  private String xcoinLastMev;
  @JsonProperty("total_bnp")
  private String totalBnp;
  @JsonProperty("in_use_bnp")
  private String inUseBnp;
  @JsonProperty("available_bnp")
  private String availableBnp;
  @JsonProperty("xcoin_last_bnp")
  private String xcoinLastBnp;
  @JsonProperty("total_sxp")
  private String totalSxp;
  @JsonProperty("in_use_sxp")
  private String inUseSxp;
  @JsonProperty("available_sxp")
  private String availableSxp;
  @JsonProperty("xcoin_last_sxp")
  private String xcoinLastSxp;
  @JsonProperty("total_cos")
  private String totalCos;
  @JsonProperty("in_use_cos")
  private String inUseCos;
  @JsonProperty("available_cos")
  private String availableCos;
  @JsonProperty("xcoin_last_cos")
  private String xcoinLastCos;
  @JsonProperty("total_apix")
  private String totalApix;
  @JsonProperty("in_use_apix")
  private String inUseApix;
  @JsonProperty("available_apix")
  private String availableApix;
  @JsonProperty("xcoin_last_apix")
  private String xcoinLastApix;
  @JsonProperty("total_el")
  private String totalEl;
  @JsonProperty("in_use_el")
  private String inUseEl;
  @JsonProperty("available_el")
  private String availableEl;
  @JsonProperty("xcoin_last_el")
  private String xcoinLastEl;
  @JsonProperty("total_basic")
  private String totalBasic;
  @JsonProperty("in_use_basic")
  private String inUseBasic;
  @JsonProperty("available_basic")
  private String availableBasic;
  @JsonProperty("xcoin_last_basic")
  private String xcoinLastBasic;
  @JsonProperty("total_hive")
  private String totalHive;
  @JsonProperty("in_use_hive")
  private String inUseHive;
  @JsonProperty("available_hive")
  private String availableHive;
  @JsonProperty("xcoin_last_hive")
  private String xcoinLastHive;
  @JsonProperty("total_xpr")
  private String totalXpr;
  @JsonProperty("in_use_xpr")
  private String inUseXpr;
  @JsonProperty("available_xpr")
  private String availableXpr;
  @JsonProperty("xcoin_last_xpr")
  private String xcoinLastXpr;
  @JsonProperty("total_vra")
  private String totalVra;
  @JsonProperty("in_use_vra")
  private String inUseVra;
  @JsonProperty("available_vra")
  private String availableVra;
  @JsonProperty("xcoin_last_vra")
  private String xcoinLastVra;
  @JsonProperty("total_fit")
  private String totalFit;
  @JsonProperty("in_use_fit")
  private String inUseFit;
  @JsonProperty("available_fit")
  private String availableFit;
  @JsonProperty("xcoin_last_fit")
  private String xcoinLastFit;
  @JsonProperty("total_egg")
  private String totalEgg;
  @JsonProperty("in_use_egg")
  private String inUseEgg;
  @JsonProperty("available_egg")
  private String availableEgg;
  @JsonProperty("xcoin_last_egg")
  private String xcoinLastEgg;
  @JsonProperty("total_bora")
  private String totalBora;
  @JsonProperty("in_use_bora")
  private String inUseBora;
  @JsonProperty("available_bora")
  private String availableBora;
  @JsonProperty("xcoin_last_bora")
  private String xcoinLastBora;
  @JsonProperty("total_arpa")
  private String totalArpa;
  @JsonProperty("in_use_arpa")
  private String inUseArpa;
  @JsonProperty("available_arpa")
  private String availableArpa;
  @JsonProperty("xcoin_last_arpa")
  private String xcoinLastArpa;
  @JsonProperty("total_ctc")
  private String totalCtc;
  @JsonProperty("in_use_ctc")
  private String inUseCtc;
  @JsonProperty("available_ctc")
  private String availableCtc;
  @JsonProperty("xcoin_last_ctc")
  private String xcoinLastCtc;
  @JsonProperty("total_apm")
  private String totalApm;
  @JsonProperty("in_use_apm")
  private String inUseApm;
  @JsonProperty("available_apm")
  private String availableApm;
  @JsonProperty("xcoin_last_apm")
  private String xcoinLastApm;
  @JsonProperty("total_ckb")
  private String totalCkb;
  @JsonProperty("in_use_ckb")
  private String inUseCkb;
  @JsonProperty("available_ckb")
  private String availableCkb;
  @JsonProperty("xcoin_last_ckb")
  private String xcoinLastCkb;
  @JsonProperty("total_aergo")
  private String totalAergo;
  @JsonProperty("in_use_aergo")
  private String inUseAergo;
  @JsonProperty("available_aergo")
  private String availableAergo;
  @JsonProperty("xcoin_last_aergo")
  private String xcoinLastAergo;
  @JsonProperty("total_anw")
  private String totalAnw;
  @JsonProperty("in_use_anw")
  private String inUseAnw;
  @JsonProperty("available_anw")
  private String availableAnw;
  @JsonProperty("xcoin_last_anw")
  private String xcoinLastAnw;
  @JsonProperty("total_cennz")
  private String totalCennz;
  @JsonProperty("in_use_cennz")
  private String inUseCennz;
  @JsonProperty("available_cennz")
  private String availableCennz;
  @JsonProperty("xcoin_last_cennz")
  private String xcoinLastCennz;
  @JsonProperty("total_evz")
  private String totalEvz;
  @JsonProperty("in_use_evz")
  private String inUseEvz;
  @JsonProperty("available_evz")
  private String availableEvz;
  @JsonProperty("xcoin_last_evz")
  private String xcoinLastEvz;
  @JsonProperty("total_cyclub")
  private String totalCyclub;
  @JsonProperty("in_use_cyclub")
  private String inUseCyclub;
  @JsonProperty("available_cyclub")
  private String availableCyclub;
  @JsonProperty("xcoin_last_cyclub")
  private String xcoinLastCyclub;
  @JsonProperty("total_srm")
  private String totalSrm;
  @JsonProperty("in_use_srm")
  private String inUseSrm;
  @JsonProperty("available_srm")
  private String availableSrm;
  @JsonProperty("xcoin_last_srm")
  private String xcoinLastSrm;
  @JsonProperty("total_qtcon")
  private String totalQtcon;
  @JsonProperty("in_use_qtcon")
  private String inUseQtcon;
  @JsonProperty("available_qtcon")
  private String availableQtcon;
  @JsonProperty("xcoin_last_qtcon")
  private String xcoinLastQtcon;
  @JsonProperty("total_uni")
  private String totalUni;
  @JsonProperty("in_use_uni")
  private String inUseUni;
  @JsonProperty("available_uni")
  private String availableUni;
  @JsonProperty("xcoin_last_uni")
  private String xcoinLastUni;
  @JsonProperty("total_yfi")
  private String totalYfi;
  @JsonProperty("in_use_yfi")
  private String inUseYfi;
  @JsonProperty("available_yfi")
  private String availableYfi;
  @JsonProperty("xcoin_last_yfi")
  private String xcoinLastYfi;
  @JsonProperty("total_uma")
  private String totalUma;
  @JsonProperty("in_use_uma")
  private String inUseUma;
  @JsonProperty("available_uma")
  private String availableUma;
  @JsonProperty("xcoin_last_uma")
  private String xcoinLastUma;
  @JsonProperty("total_aave")
  private String totalAave;
  @JsonProperty("in_use_aave")
  private String inUseAave;
  @JsonProperty("available_aave")
  private String availableAave;
  @JsonProperty("xcoin_last_aave")
  private String xcoinLastAave;
  @JsonProperty("total_comp")
  private String totalComp;
  @JsonProperty("in_use_comp")
  private String inUseComp;
  @JsonProperty("available_comp")
  private String availableComp;
  @JsonProperty("xcoin_last_comp")
  private String xcoinLastComp;
  @JsonProperty("total_ren")
  private String totalRen;
  @JsonProperty("in_use_ren")
  private String inUseRen;
  @JsonProperty("available_ren")
  private String availableRen;
  @JsonProperty("xcoin_last_ren")
  private String xcoinLastRen;
  @JsonProperty("total_bal")
  private String totalBal;
  @JsonProperty("in_use_bal")
  private String inUseBal;
  @JsonProperty("available_bal")
  private String availableBal;
  @JsonProperty("xcoin_last_bal")
  private String xcoinLastBal;
  @JsonProperty("total_rsr")
  private String totalRsr;
  @JsonProperty("in_use_rsr")
  private String inUseRsr;
  @JsonProperty("available_rsr")
  private String availableRsr;
  @JsonProperty("xcoin_last_rsr")
  private String xcoinLastRsr;
  @JsonProperty("total_nmr")
  private String totalNmr;
  @JsonProperty("in_use_nmr")
  private String inUseNmr;
  @JsonProperty("available_nmr")
  private String availableNmr;
  @JsonProperty("xcoin_last_nmr")
  private String xcoinLastNmr;
  @JsonProperty("total_rlc")
  private String totalRlc;
  @JsonProperty("in_use_rlc")
  private String inUseRlc;
  @JsonProperty("available_rlc")
  private String availableRlc;
  @JsonProperty("xcoin_last_rlc")
  private String xcoinLastRlc;
  @JsonProperty("total_uos")
  private String totalUos;
  @JsonProperty("in_use_uos")
  private String inUseUos;
  @JsonProperty("available_uos")
  private String availableUos;
  @JsonProperty("xcoin_last_uos")
  private String xcoinLastUos;
  @JsonProperty("total_sand")
  private String totalSand;
  @JsonProperty("in_use_sand")
  private String inUseSand;
  @JsonProperty("available_sand")
  private String availableSand;
  @JsonProperty("xcoin_last_sand")
  private String xcoinLastSand;
  @JsonProperty("total_cvt")
  private String totalCvt;
  @JsonProperty("in_use_cvt")
  private String inUseCvt;
  @JsonProperty("available_cvt")
  private String availableCvt;
  @JsonProperty("xcoin_last_cvt")
  private String xcoinLastCvt;
  @JsonProperty("total_stpt")
  private String totalStpt;
  @JsonProperty("in_use_stpt")
  private String inUseStpt;
  @JsonProperty("available_stpt")
  private String availableStpt;
  @JsonProperty("xcoin_last_stpt")
  private String xcoinLastStpt;
  @JsonProperty("total_gom2")
  private String totalGom2;
  @JsonProperty("in_use_gom2")
  private String inUseGom2;
  @JsonProperty("available_gom2")
  private String availableGom2;
  @JsonProperty("xcoin_last_gom2")
  private String xcoinLastGom2;
  @JsonProperty("total_ringx")
  private String totalRingx;
  @JsonProperty("in_use_ringx")
  private String inUseRingx;
  @JsonProperty("available_ringx")
  private String availableRingx;
  @JsonProperty("xcoin_last_ringx")
  private String xcoinLastRingx;
  @JsonProperty("total_bel")
  private String totalBel;
  @JsonProperty("in_use_bel")
  private String inUseBel;
  @JsonProperty("available_bel")
  private String availableBel;
  @JsonProperty("xcoin_last_bel")
  private String xcoinLastBel;
  @JsonProperty("total_dvc")
  private String totalDvc;
  @JsonProperty("in_use_dvc")
  private String inUseDvc;
  @JsonProperty("available_dvc")
  private String availableDvc;
  @JsonProperty("xcoin_last_dvc")
  private String xcoinLastDvc;
  @JsonProperty("total_obsr")
  private String totalObsr;
  @JsonProperty("in_use_obsr")
  private String inUseObsr;
  @JsonProperty("available_obsr")
  private String availableObsr;
  @JsonProperty("xcoin_last_obsr")
  private String xcoinLastObsr;
  @JsonProperty("total_orc")
  private String totalOrc;
  @JsonProperty("in_use_orc")
  private String inUseOrc;
  @JsonProperty("available_orc")
  private String availableOrc;
  @JsonProperty("xcoin_last_orc")
  private String xcoinLastOrc;
  @JsonProperty("total_pola")
  private String totalPola;
  @JsonProperty("in_use_pola")
  private String inUsePola;
  @JsonProperty("available_pola")
  private String availablePola;
  @JsonProperty("xcoin_last_pola")
  private String xcoinLastPola;
  @JsonProperty("total_awo")
  private String totalAwo;
  @JsonProperty("in_use_awo")
  private String inUseAwo;
  @JsonProperty("available_awo")
  private String availableAwo;
  @JsonProperty("xcoin_last_awo")
  private String xcoinLastAwo;
  @JsonProperty("total_adp")
  private String totalAdp;
  @JsonProperty("in_use_adp")
  private String inUseAdp;
  @JsonProperty("available_adp")
  private String availableAdp;
  @JsonProperty("xcoin_last_adp")
  private String xcoinLastAdp;
  @JsonProperty("total_dvi")
  private String totalDvi;
  @JsonProperty("in_use_dvi")
  private String inUseDvi;
  @JsonProperty("available_dvi")
  private String availableDvi;
  @JsonProperty("xcoin_last_dvi")
  private String xcoinLastDvi;
  @JsonProperty("total_drm")
  private String totalDrm;
  @JsonProperty("in_use_drm")
  private String inUseDrm;
  @JsonProperty("available_drm")
  private String availableDrm;
  @JsonProperty("xcoin_last_drm")
  private String xcoinLastDrm;
  @JsonProperty("total_ibp")
  private String totalIbp;
  @JsonProperty("in_use_ibp")
  private String inUseIbp;
  @JsonProperty("available_ibp")
  private String availableIbp;
  @JsonProperty("xcoin_last_ibp")
  private String xcoinLastIbp;
  @JsonProperty("total_ghx")
  private String totalGhx;
  @JsonProperty("in_use_ghx")
  private String inUseGhx;
  @JsonProperty("available_ghx")
  private String availableGhx;
  @JsonProperty("xcoin_last_ghx")
  private String xcoinLastGhx;
  @JsonProperty("total_mir")
  private String totalMir;
  @JsonProperty("in_use_mir")
  private String inUseMir;
  @JsonProperty("available_mir")
  private String availableMir;
  @JsonProperty("xcoin_last_mir")
  private String xcoinLastMir;
  @JsonProperty("total_cbk")
  private String totalCbk;
  @JsonProperty("in_use_cbk")
  private String inUseCbk;
  @JsonProperty("available_cbk")
  private String availableCbk;
  @JsonProperty("xcoin_last_cbk")
  private String xcoinLastCbk;
  @JsonProperty("total_onx")
  private String totalOnx;
  @JsonProperty("in_use_onx")
  private String inUseOnx;
  @JsonProperty("available_onx")
  private String availableOnx;
  @JsonProperty("xcoin_last_onx")
  private String xcoinLastOnx;
  @JsonProperty("total_mvc")
  private String totalMvc;
  @JsonProperty("in_use_mvc")
  private String inUseMvc;
  @JsonProperty("available_mvc")
  private String availableMvc;
  @JsonProperty("xcoin_last_mvc")
  private String xcoinLastMvc;
  @JsonProperty("total_bly")
  private String totalBly;
  @JsonProperty("in_use_bly")
  private String inUseBly;
  @JsonProperty("available_bly")
  private String availableBly;
  @JsonProperty("xcoin_last_bly")
  private String xcoinLastBly;
  @JsonProperty("total_wozx")
  private String totalWozx;
  @JsonProperty("in_use_wozx")
  private String inUseWozx;
  @JsonProperty("available_wozx")
  private String availableWozx;
  @JsonProperty("xcoin_last_wozx")
  private String xcoinLastWozx;
  @JsonProperty("total_anv")
  private String totalAnv;
  @JsonProperty("in_use_anv")
  private String inUseAnv;
  @JsonProperty("available_anv")
  private String availableAnv;
  @JsonProperty("xcoin_last_anv")
  private String xcoinLastAnv;
  @JsonProperty("total_grt")
  private String totalGrt;
  @JsonProperty("in_use_grt")
  private String inUseGrt;
  @JsonProperty("available_grt")
  private String availableGrt;
  @JsonProperty("xcoin_last_grt")
  private String xcoinLastGrt;
  @JsonProperty("total_mm")
  private String totalMm;
  @JsonProperty("in_use_mm")
  private String inUseMm;
  @JsonProperty("available_mm")
  private String availableMm;
  @JsonProperty("xcoin_last_mm")
  private String xcoinLastMm;
  @JsonProperty("total_biot")
  private String totalBiot;
  @JsonProperty("in_use_biot")
  private String inUseBiot;
  @JsonProperty("available_biot")
  private String availableBiot;
  @JsonProperty("xcoin_last_biot")
  private String xcoinLastBiot;
  @JsonProperty("total_xno")
  private String totalXno;
  @JsonProperty("in_use_xno")
  private String inUseXno;
  @JsonProperty("available_xno")
  private String availableXno;
  @JsonProperty("xcoin_last_xno")
  private String xcoinLastXno;
  @JsonProperty("total_snx")
  private String totalSnx;
  @JsonProperty("in_use_snx")
  private String inUseSnx;
  @JsonProperty("available_snx")
  private String availableSnx;
  @JsonProperty("xcoin_last_snx")
  private String xcoinLastSnx;
  @JsonProperty("total_sofi")
  private String totalSofi;
  @JsonProperty("in_use_sofi")
  private String inUseSofi;
  @JsonProperty("available_sofi")
  private String availableSofi;
  @JsonProperty("xcoin_last_sofi")
  private String xcoinLastSofi;
  @JsonProperty("total_gracy")
  private String totalGracy;
  @JsonProperty("in_use_gracy")
  private String inUseGracy;
  @JsonProperty("available_gracy")
  private String availableGracy;
  @JsonProperty("xcoin_last_gracy")
  private String xcoinLastGracy;
  @JsonProperty("total_nu")
  private String totalNu;
  @JsonProperty("in_use_nu")
  private String inUseNu;
  @JsonProperty("available_nu")
  private String availableNu;
  @JsonProperty("xcoin_last_nu")
  private String xcoinLastNu;
  @JsonProperty("total_oxt")
  private String totalOxt;
  @JsonProperty("in_use_oxt")
  private String inUseOxt;
  @JsonProperty("available_oxt")
  private String availableOxt;
  @JsonProperty("xcoin_last_oxt")
  private String xcoinLastOxt;
  @JsonProperty("total_lina")
  private String totalLina;
  @JsonProperty("in_use_lina")
  private String inUseLina;
  @JsonProperty("available_lina")
  private String availableLina;
  @JsonProperty("xcoin_last_lina")
  private String xcoinLastLina;
  @JsonProperty("total_asta")
  private String totalAsta;
  @JsonProperty("in_use_asta")
  private String inUseAsta;
  @JsonProperty("available_asta")
  private String availableAsta;
  @JsonProperty("xcoin_last_asta")
  private String xcoinLastAsta;
  @JsonProperty("total_map")
  private String totalMap;
  @JsonProperty("in_use_map")
  private String inUseMap;
  @JsonProperty("available_map")
  private String availableMap;
  @JsonProperty("xcoin_last_map")
  private String xcoinLastMap;
  @JsonProperty("total_aqt")
  private String totalAqt;
  @JsonProperty("in_use_aqt")
  private String inUseAqt;
  @JsonProperty("available_aqt")
  private String availableAqt;
  @JsonProperty("xcoin_last_aqt")
  private String xcoinLastAqt;
  @JsonProperty("total_pla")
  private String totalPla;
  @JsonProperty("in_use_pla")
  private String inUsePla;
  @JsonProperty("available_pla")
  private String availablePla;
  @JsonProperty("xcoin_last_pla")
  private String xcoinLastPla;
  @JsonProperty("total_wiken")
  private String totalWiken;
  @JsonProperty("in_use_wiken")
  private String inUseWiken;
  @JsonProperty("available_wiken")
  private String availableWiken;
  @JsonProperty("xcoin_last_wiken")
  private String xcoinLastWiken;
  @JsonProperty("total_ctsi")
  private String totalCtsi;
  @JsonProperty("in_use_ctsi")
  private String inUseCtsi;
  @JsonProperty("available_ctsi")
  private String availableCtsi;
  @JsonProperty("xcoin_last_ctsi")
  private String xcoinLastCtsi;
  @JsonProperty("total_mana")
  private String totalMana;
  @JsonProperty("in_use_mana")
  private String inUseMana;
  @JsonProperty("available_mana")
  private String availableMana;
  @JsonProperty("xcoin_last_mana")
  private String xcoinLastMana;
  @JsonProperty("total_lpt")
  private String totalLpt;
  @JsonProperty("in_use_lpt")
  private String inUseLpt;
  @JsonProperty("available_lpt")
  private String availableLpt;
  @JsonProperty("xcoin_last_lpt")
  private String xcoinLastLpt;
  @JsonProperty("total_mkr")
  private String totalMkr;
  @JsonProperty("in_use_mkr")
  private String inUseMkr;
  @JsonProperty("available_mkr")
  private String availableMkr;
  @JsonProperty("xcoin_last_mkr")
  private String xcoinLastMkr;
  @JsonProperty("total_srt")
  private String totalSrt;
  @JsonProperty("in_use_srt")
  private String inUseSrt;
  @JsonProperty("available_srt")
  private String availableSrt;
  @JsonProperty("xcoin_last_srt")
  private String xcoinLastSrt;
  @JsonProperty("total_sushi")
  private String totalSushi;
  @JsonProperty("in_use_sushi")
  private String inUseSushi;
  @JsonProperty("available_sushi")
  private String availableSushi;
  @JsonProperty("xcoin_last_sushi")
  private String xcoinLastSushi;
  @JsonProperty("total_nsbt")
  private String totalNsbt;
  @JsonProperty("in_use_nsbt")
  private String inUseNsbt;
  @JsonProperty("available_nsbt")
  private String availableNsbt;
  @JsonProperty("xcoin_last_nsbt")
  private String xcoinLastNsbt;
  @JsonProperty("total_don")
  private String totalDon;
  @JsonProperty("in_use_don")
  private String inUseDon;
  @JsonProperty("available_don")
  private String availableDon;
  @JsonProperty("xcoin_last_don")
  private String xcoinLastDon;
  @JsonProperty("total_asm")
  private String totalAsm;
  @JsonProperty("in_use_asm")
  private String inUseAsm;
  @JsonProperty("available_asm")
  private String availableAsm;
  @JsonProperty("xcoin_last_asm")
  private String xcoinLastAsm;
  @JsonProperty("total_pundix")
  private String totalPundix;
  @JsonProperty("in_use_pundix")
  private String inUsePundix;
  @JsonProperty("available_pundix")
  private String availablePundix;
  @JsonProperty("xcoin_last_pundix")
  private String xcoinLastPundix;
  @JsonProperty("total_celr")
  private String totalCelr;
  @JsonProperty("in_use_celr")
  private String inUseCelr;
  @JsonProperty("available_celr")
  private String availableCelr;
  @JsonProperty("xcoin_last_celr")
  private String xcoinLastCelr;
  @JsonProperty("total_cwd")
  private String totalCwd;
  @JsonProperty("in_use_cwd")
  private String inUseCwd;
  @JsonProperty("available_cwd")
  private String availableCwd;
  @JsonProperty("xcoin_last_cwd")
  private String xcoinLastCwd;
  @JsonProperty("total_arw")
  private String totalArw;
  @JsonProperty("in_use_arw")
  private String inUseArw;
  @JsonProperty("available_arw")
  private String availableArw;
  @JsonProperty("xcoin_last_arw")
  private String xcoinLastArw;
  @JsonProperty("total_beth")
  private String totalBeth;
  @JsonProperty("in_use_beth")
  private String inUseBeth;
  @JsonProperty("available_beth")
  private String availableBeth;
  @JsonProperty("xcoin_last_beth")
  private String xcoinLastBeth;
  @JsonProperty("total_bcdc")
  private String totalBcdc;
  @JsonProperty("in_use_bcdc")
  private String inUseBcdc;
  @JsonProperty("available_bcdc")
  private String availableBcdc;
  @JsonProperty("xcoin_last_bcdc")
  private String xcoinLastBcdc;
  @JsonProperty("total_front")
  private String totalFront;
  @JsonProperty("in_use_front")
  private String inUseFront;
  @JsonProperty("available_front")
  private String availableFront;
  @JsonProperty("xcoin_last_front")
  private String xcoinLastFront;
  @JsonProperty("total_msb")
  private String totalMsb;
  @JsonProperty("in_use_msb")
  private String inUseMsb;
  @JsonProperty("available_msb")
  private String availableMsb;
  @JsonProperty("xcoin_last_msb")
  private String xcoinLastMsb;
  @JsonProperty("total_rly")
  private String totalRly;
  @JsonProperty("in_use_rly")
  private String inUseRly;
  @JsonProperty("available_rly")
  private String availableRly;
  @JsonProperty("xcoin_last_rly")
  private String xcoinLastRly;
  @JsonProperty("total_ocean")
  private String totalOcean;
  @JsonProperty("in_use_ocean")
  private String inUseOcean;
  @JsonProperty("available_ocean")
  private String availableOcean;
  @JsonProperty("xcoin_last_ocean")
  private String xcoinLastOcean;
  @JsonProperty("total_bfc")
  private String totalBfc;
  @JsonProperty("in_use_bfc")
  private String inUseBfc;
  @JsonProperty("available_bfc")
  private String availableBfc;
  @JsonProperty("xcoin_last_bfc")
  private String xcoinLastBfc;
  @JsonProperty("total_alice")
  private String totalAlice;
  @JsonProperty("in_use_alice")
  private String inUseAlice;
  @JsonProperty("available_alice")
  private String availableAlice;
  @JsonProperty("xcoin_last_alice")
  private String xcoinLastAlice;
  @JsonProperty("total_ogn")
  private String totalOgn;
  @JsonProperty("in_use_ogn")
  private String inUseOgn;
  @JsonProperty("available_ogn")
  private String availableOgn;
  @JsonProperty("xcoin_last_ogn")
  private String xcoinLastOgn;
  @JsonProperty("total_coti")
  private String totalCoti;
  @JsonProperty("in_use_coti")
  private String inUseCoti;
  @JsonProperty("available_coti")
  private String availableCoti;
  @JsonProperty("xcoin_last_coti")
  private String xcoinLastCoti;
  @JsonProperty("total_cake")
  private String totalCake;
  @JsonProperty("in_use_cake")
  private String inUseCake;
  @JsonProperty("available_cake")
  private String availableCake;
  @JsonProperty("xcoin_last_cake")
  private String xcoinLastCake;
  @JsonProperty("total_bnt")
  private String totalBnt;
  @JsonProperty("in_use_bnt")
  private String inUseBnt;
  @JsonProperty("available_bnt")
  private String availableBnt;
  @JsonProperty("xcoin_last_bnt")
  private String xcoinLastBnt;
  @JsonProperty("total_xvs")
  private String totalXvs;
  @JsonProperty("in_use_xvs")
  private String inUseXvs;
  @JsonProperty("available_xvs")
  private String availableXvs;
  @JsonProperty("xcoin_last_xvs")
  private String xcoinLastXvs;
  @JsonProperty("total_swap")
  private String totalSwap;
  @JsonProperty("in_use_swap")
  private String inUseSwap;
  @JsonProperty("available_swap")
  private String availableSwap;
  @JsonProperty("xcoin_last_swap")
  private String xcoinLastSwap;
  @JsonProperty("total_chz")
  private String totalChz;
  @JsonProperty("in_use_chz")
  private String inUseChz;
  @JsonProperty("available_chz")
  private String availableChz;
  @JsonProperty("xcoin_last_chz")
  private String xcoinLastChz;
  @JsonProperty("total_axs")
  private String totalAxs;
  @JsonProperty("in_use_axs")
  private String inUseAxs;
  @JsonProperty("available_axs")
  private String availableAxs;
  @JsonProperty("xcoin_last_axs")
  private String xcoinLastAxs;
  @JsonProperty("total_dao")
  private String totalDao;
  @JsonProperty("in_use_dao")
  private String inUseDao;
  @JsonProperty("available_dao")
  private String availableDao;
  @JsonProperty("xcoin_last_dao")
  private String xcoinLastDao;
  @JsonProperty("total_six")
  private String totalSix;
  @JsonProperty("in_use_six")
  private String inUseSix;
  @JsonProperty("available_six")
  private String availableSix;
  @JsonProperty("xcoin_last_six")
  private String xcoinLastSix;
  @JsonProperty("total_dai")
  private String totalDai;
  @JsonProperty("in_use_dai")
  private String inUseDai;
  @JsonProperty("available_dai")
  private String availableDai;
  @JsonProperty("xcoin_last_dai")
  private String xcoinLastDai;
  @JsonProperty("total_shib")
  private String totalShib;
  @JsonProperty("in_use_shib")
  private String inUseShib;
  @JsonProperty("available_shib")
  private String availableShib;
  @JsonProperty("xcoin_last_shib")
  private String xcoinLastShib;
  @JsonProperty("total_matic")
  private String totalMatic;
  @JsonProperty("in_use_matic")
  private String inUseMatic;
  @JsonProperty("available_matic")
  private String availableMatic;
  @JsonProperty("xcoin_last_matic")
  private String xcoinLastMatic;
  @JsonProperty("total_woo")
  private String totalWoo;
  @JsonProperty("in_use_woo")
  private String inUseWoo;
  @JsonProperty("available_woo")
  private String availableWoo;
  @JsonProperty("xcoin_last_woo")
  private String xcoinLastWoo;
  @JsonProperty("total_ach")
  private String totalAch;
  @JsonProperty("in_use_ach")
  private String inUseAch;
  @JsonProperty("available_ach")
  private String availableAch;
  @JsonProperty("xcoin_last_ach")
  private String xcoinLastAch;
  @JsonProperty("total_bake")
  private String totalBake;
  @JsonProperty("in_use_bake")
  private String inUseBake;
  @JsonProperty("available_bake")
  private String availableBake;
  @JsonProperty("xcoin_last_bake")
  private String xcoinLastBake;
  @JsonProperty("total_velo")
  private String totalVelo;
  @JsonProperty("in_use_velo")
  private String inUseVelo;
  @JsonProperty("available_velo")
  private String availableVelo;
  @JsonProperty("xcoin_last_velo")
  private String xcoinLastVelo;
  @JsonProperty("total_anc")
  private String totalAnc;
  @JsonProperty("in_use_anc")
  private String inUseAnc;
  @JsonProperty("available_anc")
  private String availableAnc;
  @JsonProperty("xcoin_last_anc")
  private String xcoinLastAnc;
  @JsonProperty("total_hc")
  private String totalHc;
  @JsonProperty("in_use_hc")
  private String inUseHc;
  @JsonProperty("available_hc")
  private String availableHc;
  @JsonProperty("xcoin_last_hc")
  private String xcoinLastHc;
  @JsonProperty("total_bcd")
  private String totalBcd;
  @JsonProperty("in_use_bcd")
  private String inUseBcd;
  @JsonProperty("available_bcd")
  private String availableBcd;
  @JsonProperty("xcoin_last_bcd")
  private String xcoinLastBcd;
  @JsonProperty("total_xvg")
  private String totalXvg;
  @JsonProperty("in_use_xvg")
  private String inUseXvg;
  @JsonProperty("available_xvg")
  private String availableXvg;
  @JsonProperty("xcoin_last_xvg")
  private String xcoinLastXvg;
  @JsonProperty("total_xlm")
  private String totalXlm;
  @JsonProperty("in_use_xlm")
  private String inUseXlm;
  @JsonProperty("available_xlm")
  private String availableXlm;
  @JsonProperty("xcoin_last_xlm")
  private String xcoinLastXlm;
  @JsonProperty("total_pivx")
  private String totalPivx;
  @JsonProperty("in_use_pivx")
  private String inUsePivx;
  @JsonProperty("available_pivx")
  private String availablePivx;
  @JsonProperty("xcoin_last_pivx")
  private String xcoinLastPivx;
  @JsonProperty("total_etz")
  private String totalEtz;
  @JsonProperty("in_use_etz")
  private String inUseEtz;
  @JsonProperty("available_etz")
  private String availableEtz;
  @JsonProperty("xcoin_last_etz")
  private String xcoinLastEtz;
  @JsonProperty("total_gxc")
  private String totalGxc;
  @JsonProperty("in_use_gxc")
  private String inUseGxc;
  @JsonProperty("available_gxc")
  private String availableGxc;
  @JsonProperty("xcoin_last_gxc")
  private String xcoinLastGxc;
  @JsonProperty("total_bhp")
  private String totalBhp;
  @JsonProperty("in_use_bhp")
  private String inUseBhp;
  @JsonProperty("available_bhp")
  private String availableBhp;
  @JsonProperty("xcoin_last_bhp")
  private String xcoinLastBhp;
  @JsonProperty("total_bttold")
  private String totalBttold;
  @JsonProperty("in_use_bttold")
  private String inUseBttold;
  @JsonProperty("available_bttold")
  private String availableBttold;
  @JsonProperty("xcoin_last_bttold")
  private String xcoinLastBttold;
  @JsonProperty("total_hyc")
  private String totalHyc;
  @JsonProperty("in_use_hyc")
  private String inUseHyc;
  @JsonProperty("available_hyc")
  private String availableHyc;
  @JsonProperty("xcoin_last_hyc")
  private String xcoinLastHyc;
  @JsonProperty("total_vsys")
  private String totalVsys;
  @JsonProperty("in_use_vsys")
  private String inUseVsys;
  @JsonProperty("available_vsys")
  private String availableVsys;
  @JsonProperty("xcoin_last_vsys")
  private String xcoinLastVsys;
  @JsonProperty("total_ipx")
  private String totalIpx;
  @JsonProperty("in_use_ipx")
  private String inUseIpx;
  @JsonProperty("available_ipx")
  private String availableIpx;
  @JsonProperty("xcoin_last_ipx")
  private String xcoinLastIpx;
  @JsonProperty("total_wicc")
  private String totalWicc;
  @JsonProperty("in_use_wicc")
  private String inUseWicc;
  @JsonProperty("available_wicc")
  private String availableWicc;
  @JsonProperty("xcoin_last_wicc")
  private String xcoinLastWicc;
  @JsonProperty("total_ont")
  private String totalOnt;
  @JsonProperty("in_use_ont")
  private String inUseOnt;
  @JsonProperty("available_ont")
  private String availableOnt;
  @JsonProperty("xcoin_last_ont")
  private String xcoinLastOnt;
  @JsonProperty("total_lunc")
  private String totalLunc;
  @JsonProperty("in_use_lunc")
  private String inUseLunc;
  @JsonProperty("available_lunc")
  private String availableLunc;
  @JsonProperty("xcoin_last_lunc")
  private String xcoinLastLunc;
  @JsonProperty("total_news2")
  private String totalNews2;
  @JsonProperty("in_use_news2")
  private String inUseNews2;
  @JsonProperty("available_news2")
  private String availableNews2;
  @JsonProperty("xcoin_last_news2")
  private String xcoinLastNews2;
  @JsonProperty("total_aion")
  private String totalAion;
  @JsonProperty("in_use_aion")
  private String inUseAion;
  @JsonProperty("available_aion")
  private String availableAion;
  @JsonProperty("xcoin_last_aion")
  private String xcoinLastAion;
  @JsonProperty("total_meta")
  private String totalMeta;
  @JsonProperty("in_use_meta")
  private String inUseMeta;
  @JsonProperty("available_meta")
  private String availableMeta;
  @JsonProperty("xcoin_last_meta")
  private String xcoinLastMeta;
  @JsonProperty("total_klay")
  private String totalKlay;
  @JsonProperty("in_use_klay")
  private String inUseKlay;
  @JsonProperty("available_klay")
  private String availableKlay;
  @JsonProperty("xcoin_last_klay")
  private String xcoinLastKlay;
  @JsonProperty("total_cosm")
  private String totalCosm;
  @JsonProperty("in_use_cosm")
  private String inUseCosm;
  @JsonProperty("available_cosm")
  private String availableCosm;
  @JsonProperty("xcoin_last_cosm")
  private String xcoinLastCosm;
  @JsonProperty("total_ong")
  private String totalOng;
  @JsonProperty("in_use_ong")
  private String inUseOng;
  @JsonProperty("available_ong")
  private String availableOng;
  @JsonProperty("xcoin_last_ong")
  private String xcoinLastOng;
  @JsonProperty("total_algo")
  private String totalAlgo;
  @JsonProperty("in_use_algo")
  private String inUseAlgo;
  @JsonProperty("available_algo")
  private String availableAlgo;
  @JsonProperty("xcoin_last_algo")
  private String xcoinLastAlgo;
  @JsonProperty("total_jst")
  private String totalJst;
  @JsonProperty("in_use_jst")
  private String inUseJst;
  @JsonProperty("available_jst")
  private String availableJst;
  @JsonProperty("xcoin_last_jst")
  private String xcoinLastJst;
  @JsonProperty("total_xtz")
  private String totalXtz;
  @JsonProperty("in_use_xtz")
  private String inUseXtz;
  @JsonProperty("available_xtz")
  private String availableXtz;
  @JsonProperty("xcoin_last_xtz")
  private String xcoinLastXtz;
  @JsonProperty("total_itg")
  private String totalItg;
  @JsonProperty("in_use_itg")
  private String inUseItg;
  @JsonProperty("available_itg")
  private String availableItg;
  @JsonProperty("xcoin_last_itg")
  private String xcoinLastItg;
  @JsonProperty("total_luk")
  private String totalLuk;
  @JsonProperty("in_use_luk")
  private String inUseLuk;
  @JsonProperty("available_luk")
  private String availableLuk;
  @JsonProperty("xcoin_last_luk")
  private String xcoinLastLuk;
  @JsonProperty("total_mlk")
  private String totalMlk;
  @JsonProperty("in_use_mlk")
  private String inUseMlk;
  @JsonProperty("available_mlk")
  private String availableMlk;
  @JsonProperty("xcoin_last_mlk")
  private String xcoinLastMlk;
  @JsonProperty("total_wemixc")
  private String totalWemixc;
  @JsonProperty("in_use_wemixc")
  private String inUseWemixc;
  @JsonProperty("available_wemixc")
  private String availableWemixc;
  @JsonProperty("xcoin_last_wemixc")
  private String xcoinLastWemixc;
  @JsonProperty("total_dot")
  private String totalDot;
  @JsonProperty("in_use_dot")
  private String inUseDot;
  @JsonProperty("available_dot")
  private String availableDot;
  @JsonProperty("xcoin_last_dot")
  private String xcoinLastDot;
  @JsonProperty("total_sun_old")
  private String totalSunOld;
  @JsonProperty("in_use_sun_old")
  private String inUseSunOld;
  @JsonProperty("available_sun_old")
  private String availableSunOld;
  @JsonProperty("xcoin_last_sun_old")
  private String xcoinLastSunOld;
  @JsonProperty("total_atom")
  private String totalAtom;
  @JsonProperty("in_use_atom")
  private String inUseAtom;
  @JsonProperty("available_atom")
  private String availableAtom;
  @JsonProperty("xcoin_last_atom")
  private String xcoinLastAtom;
  @JsonProperty("total_ssx")
  private String totalSsx;
  @JsonProperty("in_use_ssx")
  private String inUseSsx;
  @JsonProperty("available_ssx")
  private String availableSsx;
  @JsonProperty("xcoin_last_ssx")
  private String xcoinLastSsx;
  @JsonProperty("total_bcha")
  private String totalBcha;
  @JsonProperty("in_use_bcha")
  private String inUseBcha;
  @JsonProperty("available_bcha")
  private String availableBcha;
  @JsonProperty("xcoin_last_bcha")
  private String xcoinLastBcha;
  @JsonProperty("total_temco")
  private String totalTemco;
  @JsonProperty("in_use_temco")
  private String inUseTemco;
  @JsonProperty("available_temco")
  private String availableTemco;
  @JsonProperty("xcoin_last_temco")
  private String xcoinLastTemco;
  @JsonProperty("total_ksp")
  private String totalKsp;
  @JsonProperty("in_use_ksp")
  private String inUseKsp;
  @JsonProperty("available_ksp")
  private String availableKsp;
  @JsonProperty("xcoin_last_ksp")
  private String xcoinLastKsp;
  @JsonProperty("total_lzm")
  private String totalLzm;
  @JsonProperty("in_use_lzm")
  private String inUseLzm;
  @JsonProperty("available_lzm")
  private String availableLzm;
  @JsonProperty("xcoin_last_lzm")
  private String xcoinLastLzm;
  @JsonProperty("total_hibs")
  private String totalHibs;
  @JsonProperty("in_use_hibs")
  private String inUseHibs;
  @JsonProperty("available_hibs")
  private String availableHibs;
  @JsonProperty("xcoin_last_hibs")
  private String xcoinLastHibs;
  @JsonProperty("total_cpay")
  private String totalCpay;
  @JsonProperty("in_use_cpay")
  private String inUseCpay;
  @JsonProperty("available_cpay")
  private String availableCpay;
  @JsonProperty("xcoin_last_cpay")
  private String xcoinLastCpay;
  @JsonProperty("total_qi")
  private String totalQi;
  @JsonProperty("in_use_qi")
  private String inUseQi;
  @JsonProperty("available_qi")
  private String availableQi;
  @JsonProperty("xcoin_last_qi")
  private String xcoinLastQi;
  @JsonProperty("total_bsc_bnb")
  private String totalBscBnb;
  @JsonProperty("in_use_bsc_bnb")
  private String inUseBscBnb;
  @JsonProperty("available_bsc_bnb")
  private String availableBscBnb;
  @JsonProperty("xcoin_last_bsc_bnb")
  private String xcoinLastBscBnb;
  @JsonProperty("total_burger")
  private String totalBurger;
  @JsonProperty("in_use_burger")
  private String inUseBurger;
  @JsonProperty("available_burger")
  private String availableBurger;
  @JsonProperty("xcoin_last_burger")
  private String xcoinLastBurger;
  @JsonProperty("total_doge")
  private String totalDoge;
  @JsonProperty("in_use_doge")
  private String inUseDoge;
  @JsonProperty("available_doge")
  private String availableDoge;
  @JsonProperty("xcoin_last_doge")
  private String xcoinLastDoge;
  @JsonProperty("total_ksm")
  private String totalKsm;
  @JsonProperty("in_use_ksm")
  private String inUseKsm;
  @JsonProperty("available_ksm")
  private String availableKsm;
  @JsonProperty("xcoin_last_ksm")
  private String xcoinLastKsm;
  @JsonProperty("total_ctk")
  private String totalCtk;
  @JsonProperty("in_use_ctk")
  private String inUseCtk;
  @JsonProperty("available_ctk")
  private String availableCtk;
  @JsonProperty("xcoin_last_ctk")
  private String xcoinLastCtk;
  @JsonProperty("total_xym")
  private String totalXym;
  @JsonProperty("in_use_xym")
  private String inUseXym;
  @JsonProperty("available_xym")
  private String availableXym;
  @JsonProperty("xcoin_last_xym")
  private String xcoinLastXym;
  @JsonProperty("total_bnb")
  private String totalBnb;
  @JsonProperty("in_use_bnb")
  private String inUseBnb;
  @JsonProperty("available_bnb")
  private String availableBnb;
  @JsonProperty("xcoin_last_bnb")
  private String xcoinLastBnb;
  @JsonProperty("total_nft")
  private String totalNft;
  @JsonProperty("in_use_nft")
  private String inUseNft;
  @JsonProperty("available_nft")
  private String availableNft;
  @JsonProperty("xcoin_last_nft")
  private String xcoinLastNft;
  @JsonProperty("total_sun")
  private String totalSun;
  @JsonProperty("in_use_sun")
  private String inUseSun;
  @JsonProperty("available_sun")
  private String availableSun;
  @JsonProperty("xcoin_last_sun")
  private String xcoinLastSun;
  @JsonProperty("total_xec")
  private String totalXec;
  @JsonProperty("in_use_xec")
  private String inUseXec;
  @JsonProperty("available_xec")
  private String availableXec;
  @JsonProperty("xcoin_last_xec")
  private String xcoinLastXec;
  @JsonProperty("total_agix")
  private String totalAgix;
  @JsonProperty("in_use_agix")
  private String inUseAgix;
  @JsonProperty("available_agix")
  private String availableAgix;
  @JsonProperty("xcoin_last_agix")
  private String xcoinLastAgix;
  @JsonProperty("total_pci")
  private String totalPci;
  @JsonProperty("in_use_pci")
  private String inUsePci;
  @JsonProperty("available_pci")
  private String availablePci;
  @JsonProperty("xcoin_last_pci")
  private String xcoinLastPci;
  @JsonProperty("total_sol")
  private String totalSol;
  @JsonProperty("in_use_sol")
  private String inUseSol;
  @JsonProperty("available_sol")
  private String availableSol;
  @JsonProperty("xcoin_last_sol")
  private String xcoinLastSol;
  @JsonProperty("total_fnsa")
  private String totalFnsa;
  @JsonProperty("in_use_fnsa")
  private String inUseFnsa;
  @JsonProperty("available_fnsa")
  private String availableFnsa;
  @JsonProperty("xcoin_last_fnsa")
  private String xcoinLastFnsa;
  @JsonProperty("total_egld")
  private String totalEgld;
  @JsonProperty("in_use_egld")
  private String inUseEgld;
  @JsonProperty("available_egld")
  private String availableEgld;
  @JsonProperty("xcoin_last_egld")
  private String xcoinLastEgld;
  @JsonProperty("total_go")
  private String totalGo;
  @JsonProperty("in_use_go")
  private String inUseGo;
  @JsonProperty("available_go")
  private String availableGo;
  @JsonProperty("xcoin_last_go")
  private String xcoinLastGo;
  @JsonProperty("total_mask")
  private String totalMask;
  @JsonProperty("in_use_mask")
  private String inUseMask;
  @JsonProperty("available_mask")
  private String availableMask;
  @JsonProperty("xcoin_last_mask")
  private String xcoinLastMask;
  @JsonProperty("total_dfa")
  private String totalDfa;
  @JsonProperty("in_use_dfa")
  private String inUseDfa;
  @JsonProperty("available_dfa")
  private String availableDfa;
  @JsonProperty("xcoin_last_dfa")
  private String xcoinLastDfa;
  @JsonProperty("total_c98")
  private String totalC98;
  @JsonProperty("in_use_c98")
  private String inUseC98;
  @JsonProperty("available_c98")
  private String availableC98;
  @JsonProperty("xcoin_last_c98")
  private String xcoinLastC98;
  @JsonProperty("total_med")
  private String totalMed;
  @JsonProperty("in_use_med")
  private String inUseMed;
  @JsonProperty("available_med")
  private String availableMed;
  @JsonProperty("xcoin_last_med")
  private String xcoinLastMed;
  @JsonProperty("total_sgb")
  private String totalSgb;
  @JsonProperty("in_use_sgb")
  private String inUseSgb;
  @JsonProperty("available_sgb")
  private String availableSgb;
  @JsonProperty("xcoin_last_sgb")
  private String xcoinLastSgb;
  @JsonProperty("total_1inch")
  private String total1inch;
  @JsonProperty("in_use_1inch")
  private String inUse1inch;
  @JsonProperty("available_1inch")
  private String available1inch;
  @JsonProperty("xcoin_last_1inch")
  private String xcoinLast1inch;
  @JsonProperty("total_crv")
  private String totalCrv;
  @JsonProperty("in_use_crv")
  private String inUseCrv;
  @JsonProperty("available_crv")
  private String availableCrv;
  @JsonProperty("xcoin_last_crv")
  private String xcoinLastCrv;
  @JsonProperty("total_boba")
  private String totalBoba;
  @JsonProperty("in_use_boba")
  private String inUseBoba;
  @JsonProperty("available_boba")
  private String availableBoba;
  @JsonProperty("xcoin_last_boba")
  private String xcoinLastBoba;
  @JsonProperty("total_rpg")
  private String totalRpg;
  @JsonProperty("in_use_rpg")
  private String inUseRpg;
  @JsonProperty("available_rpg")
  private String availableRpg;
  @JsonProperty("xcoin_last_rpg")
  private String xcoinLastRpg;
  @JsonProperty("total_dydx")
  private String totalDydx;
  @JsonProperty("in_use_dydx")
  private String inUseDydx;
  @JsonProperty("available_dydx")
  private String availableDydx;
  @JsonProperty("xcoin_last_dydx")
  private String xcoinLastDydx;
  @JsonProperty("total_mina")
  private String totalMina;
  @JsonProperty("in_use_mina")
  private String inUseMina;
  @JsonProperty("available_mina")
  private String availableMina;
  @JsonProperty("xcoin_last_mina")
  private String xcoinLastMina;
  @JsonProperty("total_flow")
  private String totalFlow;
  @JsonProperty("in_use_flow")
  private String inUseFlow;
  @JsonProperty("available_flow")
  private String availableFlow;
  @JsonProperty("xcoin_last_flow")
  private String xcoinLastFlow;
  @JsonProperty("total_joe")
  private String totalJoe;
  @JsonProperty("in_use_joe")
  private String inUseJoe;
  @JsonProperty("available_joe")
  private String availableJoe;
  @JsonProperty("xcoin_last_joe")
  private String xcoinLastJoe;
  @JsonProperty("total_gala")
  private String totalGala;
  @JsonProperty("in_use_gala")
  private String inUseGala;
  @JsonProperty("available_gala")
  private String availableGala;
  @JsonProperty("xcoin_last_gala")
  private String xcoinLastGala;
  @JsonProperty("total_ens")
  private String totalEns;
  @JsonProperty("in_use_ens")
  private String inUseEns;
  @JsonProperty("available_ens")
  private String availableEns;
  @JsonProperty("xcoin_last_ens")
  private String xcoinLastEns;
  @JsonProperty("total_purse")
  private String totalPurse;
  @JsonProperty("in_use_purse")
  private String inUsePurse;
  @JsonProperty("available_purse")
  private String availablePurse;
  @JsonProperty("xcoin_last_purse")
  private String xcoinLastPurse;
  @JsonProperty("total_btt")
  private String totalBtt;
  @JsonProperty("in_use_btt")
  private String inUseBtt;
  @JsonProperty("available_btt")
  private String availableBtt;
  @JsonProperty("xcoin_last_btt")
  private String xcoinLastBtt;
  @JsonProperty("total_efi")
  private String totalEfi;
  @JsonProperty("in_use_efi")
  private String inUseEfi;
  @JsonProperty("available_efi")
  private String availableEfi;
  @JsonProperty("xcoin_last_efi")
  private String xcoinLastEfi;
  @JsonProperty("total_jasmy")
  private String totalJasmy;
  @JsonProperty("in_use_jasmy")
  private String inUseJasmy;
  @JsonProperty("available_jasmy")
  private String availableJasmy;
  @JsonProperty("xcoin_last_jasmy")
  private String xcoinLastJasmy;
  @JsonProperty("total_titan")
  private String totalTitan;
  @JsonProperty("in_use_titan")
  private String inUseTitan;
  @JsonProperty("available_titan")
  private String availableTitan;
  @JsonProperty("xcoin_last_titan")
  private String xcoinLastTitan;
  @JsonProperty("total_req")
  private String totalReq;
  @JsonProperty("in_use_req")
  private String inUseReq;
  @JsonProperty("available_req")
  private String availableReq;
  @JsonProperty("xcoin_last_req")
  private String xcoinLastReq;
  @JsonProperty("total_cspr")
  private String totalCspr;
  @JsonProperty("in_use_cspr")
  private String inUseCspr;
  @JsonProperty("available_cspr")
  private String availableCspr;
  @JsonProperty("xcoin_last_cspr")
  private String xcoinLastCspr;
  @JsonProperty("total_solo")
  private String totalSolo;
  @JsonProperty("in_use_solo")
  private String inUseSolo;
  @JsonProperty("available_solo")
  private String availableSolo;
  @JsonProperty("xcoin_last_solo")
  private String xcoinLastSolo;
  @JsonProperty("total_avax")
  private String totalAvax;
  @JsonProperty("in_use_avax")
  private String inUseAvax;
  @JsonProperty("available_avax")
  private String availableAvax;
  @JsonProperty("xcoin_last_avax")
  private String xcoinLastAvax;
  @JsonProperty("total_tdrop")
  private String totalTdrop;
  @JsonProperty("in_use_tdrop")
  private String inUseTdrop;
  @JsonProperty("available_tdrop")
  private String availableTdrop;
  @JsonProperty("xcoin_last_tdrop")
  private String xcoinLastTdrop;
  @JsonProperty("total_hbar")
  private String totalHbar;
  @JsonProperty("in_use_hbar")
  private String inUseHbar;
  @JsonProperty("available_hbar")
  private String availableHbar;
  @JsonProperty("xcoin_last_hbar")
  private String xcoinLastHbar;
  @JsonProperty("total_fanc")
  private String totalFanc;
  @JsonProperty("in_use_fanc")
  private String inUseFanc;
  @JsonProperty("available_fanc")
  private String availableFanc;
  @JsonProperty("xcoin_last_fanc")
  private String xcoinLastFanc;
  @JsonProperty("total_sprt")
  private String totalSprt;
  @JsonProperty("in_use_sprt")
  private String inUseSprt;
  @JsonProperty("available_sprt")
  private String availableSprt;
  @JsonProperty("xcoin_last_sprt")
  private String xcoinLastSprt;
  @JsonProperty("total_npt")
  private String totalNpt;
  @JsonProperty("in_use_npt")
  private String inUseNpt;
  @JsonProperty("available_npt")
  private String availableNpt;
  @JsonProperty("xcoin_last_npt")
  private String xcoinLastNpt;
  @JsonProperty("total_witch")
  private String totalWitch;
  @JsonProperty("in_use_witch")
  private String inUseWitch;
  @JsonProperty("available_witch")
  private String availableWitch;
  @JsonProperty("xcoin_last_witch")
  private String xcoinLastWitch;
  @JsonProperty("total_rei")
  private String totalRei;
  @JsonProperty("in_use_rei")
  private String inUseRei;
  @JsonProperty("available_rei")
  private String availableRei;
  @JsonProperty("xcoin_last_rei")
  private String xcoinLastRei;
  @JsonProperty("total_t")
  private String totalT;
  @JsonProperty("in_use_t")
  private String inUseT;
  @JsonProperty("available_t")
  private String availableT;
  @JsonProperty("xcoin_last_t")
  private String xcoinLastT;
  @JsonProperty("total_aqua")
  private String totalAqua;
  @JsonProperty("in_use_aqua")
  private String inUseAqua;
  @JsonProperty("available_aqua")
  private String availableAqua;
  @JsonProperty("xcoin_last_aqua")
  private String xcoinLastAqua;
  @JsonProperty("total_mbx")
  private String totalMbx;
  @JsonProperty("in_use_mbx")
  private String inUseMbx;
  @JsonProperty("available_mbx")
  private String availableMbx;
  @JsonProperty("xcoin_last_mbx")
  private String xcoinLastMbx;
  @JsonProperty("total_gmt")
  private String totalGmt;
  @JsonProperty("in_use_gmt")
  private String inUseGmt;
  @JsonProperty("available_gmt")
  private String availableGmt;
  @JsonProperty("xcoin_last_gmt")
  private String xcoinLastGmt;
  @JsonProperty("total_tava")
  private String totalTava;
  @JsonProperty("in_use_tava")
  private String inUseTava;
  @JsonProperty("available_tava")
  private String availableTava;
  @JsonProperty("xcoin_last_tava")
  private String xcoinLastTava;
  @JsonProperty("total_dar")
  private String totalDar;
  @JsonProperty("in_use_dar")
  private String inUseDar;
  @JsonProperty("available_dar")
  private String availableDar;
  @JsonProperty("xcoin_last_dar")
  private String xcoinLastDar;
  @JsonProperty("total_ape")
  private String totalApe;
  @JsonProperty("in_use_ape")
  private String inUseApe;
  @JsonProperty("available_ape")
  private String availableApe;
  @JsonProperty("xcoin_last_ape")
  private String xcoinLastApe;
  @JsonProperty("total_wncg")
  private String totalWncg;
  @JsonProperty("in_use_wncg")
  private String inUseWncg;
  @JsonProperty("available_wncg")
  private String availableWncg;
  @JsonProperty("xcoin_last_wncg")
  private String xcoinLastWncg;
  @JsonProperty("total_alt")
  private String totalAlt;
  @JsonProperty("in_use_alt")
  private String inUseAlt;
  @JsonProperty("available_alt")
  private String availableAlt;
  @JsonProperty("xcoin_last_alt")
  private String xcoinLastAlt;
  @JsonProperty("total_xcn")
  private String totalXcn;
  @JsonProperty("in_use_xcn")
  private String inUseXcn;
  @JsonProperty("available_xcn")
  private String availableXcn;
  @JsonProperty("xcoin_last_xcn")
  private String xcoinLastXcn;
  @JsonProperty("total_gxa")
  private String totalGxa;
  @JsonProperty("in_use_gxa")
  private String inUseGxa;
  @JsonProperty("available_gxa")
  private String availableGxa;
  @JsonProperty("xcoin_last_gxa")
  private String xcoinLastGxa;
  @JsonProperty("total_luna2")
  private String totalLuna2;
  @JsonProperty("in_use_luna2")
  private String inUseLuna2;
  @JsonProperty("available_luna2")
  private String availableLuna2;
  @JsonProperty("xcoin_last_luna2")
  private String xcoinLastLuna2;
  @JsonProperty("total_talk")
  private String totalTalk;
  @JsonProperty("in_use_talk")
  private String inUseTalk;
  @JsonProperty("available_talk")
  private String availableTalk;
  @JsonProperty("xcoin_last_talk")
  private String xcoinLastTalk;
  @JsonProperty("total_ogv")
  private String totalOgv;
  @JsonProperty("in_use_ogv")
  private String inUseOgv;
  @JsonProperty("available_ogv")
  private String availableOgv;
  @JsonProperty("xcoin_last_ogv")
  private String xcoinLastOgv;
  @JsonProperty("total_azit")
  private String totalAzit;
  @JsonProperty("in_use_azit")
  private String inUseAzit;
  @JsonProperty("available_azit")
  private String availableAzit;
  @JsonProperty("xcoin_last_azit")
  private String xcoinLastAzit;
  @JsonProperty("total_ethw")
  private String totalEthw;
  @JsonProperty("in_use_ethw")
  private String inUseEthw;
  @JsonProperty("available_ethw")
  private String availableEthw;
  @JsonProperty("xcoin_last_ethw")
  private String xcoinLastEthw;
  @JsonProperty("total_ethf")
  private String totalEthf;
  @JsonProperty("in_use_ethf")
  private String inUseEthf;
  @JsonProperty("available_ethf")
  private String availableEthf;
  @JsonProperty("xcoin_last_ethf")
  private String xcoinLastEthf;
  @JsonProperty("total_flr")
  private String totalFlr;
  @JsonProperty("in_use_flr")
  private String inUseFlr;
  @JsonProperty("available_flr")
  private String availableFlr;
  @JsonProperty("xcoin_last_flr")
  private String xcoinLastFlr;
  @JsonProperty("total_icz")
  private String totalIcz;
  @JsonProperty("in_use_icz")
  private String inUseIcz;
  @JsonProperty("available_icz")
  private String availableIcz;
  @JsonProperty("xcoin_last_icz")
  private String xcoinLastIcz;
  @JsonProperty("total_sfp")
  private String totalSfp;
  @JsonProperty("in_use_sfp")
  private String inUseSfp;
  @JsonProperty("available_sfp")
  private String availableSfp;
  @JsonProperty("xcoin_last_sfp")
  private String xcoinLastSfp;
  @JsonProperty("total_fitfi")
  private String totalFitfi;
  @JsonProperty("in_use_fitfi")
  private String inUseFitfi;
  @JsonProperty("available_fitfi")
  private String availableFitfi;
  @JsonProperty("xcoin_last_fitfi")
  private String xcoinLastFitfi;
  @JsonProperty("total_stat")
  private String totalStat;
  @JsonProperty("in_use_stat")
  private String inUseStat;
  @JsonProperty("available_stat")
  private String availableStat;
  @JsonProperty("xcoin_last_stat")
  private String xcoinLastStat;
  @JsonProperty("total_crts")
  private String totalCrts;
  @JsonProperty("in_use_crts")
  private String inUseCrts;
  @JsonProperty("available_crts")
  private String availableCrts;
  @JsonProperty("xcoin_last_crts")
  private String xcoinLastCrts;
  @JsonProperty("total_vix")
  private String totalVix;
  @JsonProperty("in_use_vix")
  private String inUseVix;
  @JsonProperty("available_vix")
  private String availableVix;
  @JsonProperty("xcoin_last_vix")
  private String xcoinLastVix;
  @JsonProperty("total_lbl")
  private String totalLbl;
  @JsonProperty("in_use_lbl")
  private String inUseLbl;
  @JsonProperty("available_lbl")
  private String availableLbl;
  @JsonProperty("xcoin_last_lbl")
  private String xcoinLastLbl;
  @JsonProperty("total_flz")
  private String totalFlz;
  @JsonProperty("in_use_flz")
  private String inUseFlz;
  @JsonProperty("available_flz")
  private String availableFlz;
  @JsonProperty("xcoin_last_flz")
  private String xcoinLastFlz;
  @JsonProperty("total_berry")
  private String totalBerry;
  @JsonProperty("in_use_berry")
  private String inUseBerry;
  @JsonProperty("available_berry")
  private String availableBerry;
  @JsonProperty("xcoin_last_berry")
  private String xcoinLastBerry;
  @JsonProperty("total_lm")
  private String totalLm;
  @JsonProperty("in_use_lm")
  private String inUseLm;
  @JsonProperty("available_lm")
  private String availableLm;
  @JsonProperty("xcoin_last_lm")
  private String xcoinLastLm;
  @JsonProperty("total_grnd")
  private String totalGrnd;
  @JsonProperty("in_use_grnd")
  private String inUseGrnd;
  @JsonProperty("available_grnd")
  private String availableGrnd;
  @JsonProperty("xcoin_last_grnd")
  private String xcoinLastGrnd;
  @JsonProperty("total_apt")
  private String totalApt;
  @JsonProperty("in_use_apt")
  private String inUseApt;
  @JsonProperty("available_apt")
  private String availableApt;
  @JsonProperty("xcoin_last_apt")
  private String xcoinLastApt;
  @JsonProperty("total_blur")
  private String totalBlur;
  @JsonProperty("in_use_blur")
  private String inUseBlur;
  @JsonProperty("available_blur")
  private String availableBlur;
  @JsonProperty("xcoin_last_blur")
  private String xcoinLastBlur;
  @JsonProperty("total_wemix")
  private String totalWemix;
  @JsonProperty("in_use_wemix")
  private String inUseWemix;
  @JsonProperty("available_wemix")
  private String availableWemix;
  @JsonProperty("xcoin_last_wemix")
  private String xcoinLastWemix;
  @JsonProperty("total_news")
  private String totalNews;
  @JsonProperty("in_use_news")
  private String inUseNews;
  @JsonProperty("available_news")
  private String availableNews;
  @JsonProperty("xcoin_last_news")
  private String xcoinLastNews;
  @JsonProperty("total_op_eth")
  private String totalOpEth;
  @JsonProperty("in_use_op_eth")
  private String inUseOpEth;
  @JsonProperty("available_op_eth")
  private String availableOpEth;
  @JsonProperty("xcoin_last_op_eth")
  private String xcoinLastOpEth;
  @JsonProperty("total_dice")
  private String totalDice;
  @JsonProperty("in_use_dice")
  private String inUseDice;
  @JsonProperty("available_dice")
  private String availableDice;
  @JsonProperty("xcoin_last_dice")
  private String xcoinLastDice;
  @JsonProperty("total_oas")
  private String totalOas;
  @JsonProperty("in_use_oas")
  private String inUseOas;
  @JsonProperty("available_oas")
  private String availableOas;
  @JsonProperty("xcoin_last_oas")
  private String xcoinLastOas;
  @JsonProperty("total_hook")
  private String totalHook;
  @JsonProperty("in_use_hook")
  private String inUseHook;
  @JsonProperty("available_hook")
  private String availableHook;
  @JsonProperty("xcoin_last_hook")
  private String xcoinLastHook;
  @JsonProperty("total_entc")
  private String totalEntc;
  @JsonProperty("in_use_entc")
  private String inUseEntc;
  @JsonProperty("available_entc")
  private String availableEntc;
  @JsonProperty("xcoin_last_entc")
  private String xcoinLastEntc;
  @JsonProperty("total_onit")
  private String totalOnit;
  @JsonProperty("in_use_onit")
  private String inUseOnit;
  @JsonProperty("available_onit")
  private String availableOnit;
  @JsonProperty("xcoin_last_onit")
  private String xcoinLastOnit;
  @JsonProperty("total_op")
  private String totalOp;
  @JsonProperty("in_use_op")
  private String inUseOp;
  @JsonProperty("available_op")
  private String availableOp;
  @JsonProperty("xcoin_last_op")
  private String xcoinLastOp;
  @JsonProperty("total_arb_eth")
  private String totalArbEth;
  @JsonProperty("in_use_arb_eth")
  private String inUseArbEth;
  @JsonProperty("available_arb_eth")
  private String availableArbEth;
  @JsonProperty("xcoin_last_arb_eth")
  private String xcoinLastArbEth;
  @JsonProperty("total_roa")
  private String totalRoa;
  @JsonProperty("in_use_roa")
  private String inUseRoa;
  @JsonProperty("available_roa")
  private String availableRoa;
  @JsonProperty("xcoin_last_roa")
  private String xcoinLastRoa;
  @JsonProperty("total_orb")
  private String totalOrb;
  @JsonProperty("in_use_orb")
  private String inUseOrb;
  @JsonProperty("available_orb")
  private String availableOrb;
  @JsonProperty("xcoin_last_orb")
  private String xcoinLastOrb;
  @JsonProperty("total_ever")
  private String totalEver;
  @JsonProperty("in_use_ever")
  private String inUseEver;
  @JsonProperty("available_ever")
  private String availableEver;
  @JsonProperty("xcoin_last_ever")
  private String xcoinLastEver;
  @JsonProperty("total_gmx")
  private String totalGmx;
  @JsonProperty("in_use_gmx")
  private String inUseGmx;
  @JsonProperty("available_gmx")
  private String availableGmx;
  @JsonProperty("xcoin_last_gmx")
  private String xcoinLastGmx;
  @JsonProperty("total_stx")
  private String totalStx;
  @JsonProperty("in_use_stx")
  private String inUseStx;
  @JsonProperty("available_stx")
  private String availableStx;
  @JsonProperty("xcoin_last_stx")
  private String xcoinLastStx;
  @JsonProperty("total_xpla")
  private String totalXpla;
  @JsonProperty("in_use_xpla")
  private String inUseXpla;
  @JsonProperty("available_xpla")
  private String availableXpla;
  @JsonProperty("xcoin_last_xpla")
  private String xcoinLastXpla;
  @JsonProperty("total_reap")
  private String totalReap;
  @JsonProperty("in_use_reap")
  private String inUseReap;
  @JsonProperty("available_reap")
  private String availableReap;
  @JsonProperty("xcoin_last_reap")
  private String xcoinLastReap;
  @JsonProperty("total_aht")
  private String totalAht;
  @JsonProperty("in_use_aht")
  private String inUseAht;
  @JsonProperty("available_aht")
  private String availableAht;
  @JsonProperty("xcoin_last_aht")
  private String xcoinLastAht;
  @JsonProperty("total_arb")
  private String totalArb;
  @JsonProperty("in_use_arb")
  private String inUseArb;
  @JsonProperty("available_arb")
  private String availableArb;
  @JsonProperty("xcoin_last_arb")
  private String xcoinLastArb;
  @JsonProperty("total_inj")
  private String totalInj;
  @JsonProperty("in_use_inj")
  private String inUseInj;
  @JsonProperty("available_inj")
  private String availableInj;
  @JsonProperty("xcoin_last_inj")
  private String xcoinLastInj;
  @JsonProperty("total_hft")
  private String totalHft;
  @JsonProperty("in_use_hft")
  private String inUseHft;
  @JsonProperty("available_hft")
  private String availableHft;
  @JsonProperty("xcoin_last_hft")
  private String xcoinLastHft;
  @JsonProperty("total_rpl")
  private String totalRpl;
  @JsonProperty("in_use_rpl")
  private String inUseRpl;
  @JsonProperty("available_rpl")
  private String availableRpl;
  @JsonProperty("xcoin_last_rpl")
  private String xcoinLastRpl;
  @JsonProperty("total_gpt")
  private String totalGpt;
  @JsonProperty("in_use_gpt")
  private String inUseGpt;
  @JsonProperty("available_gpt")
  private String availableGpt;
  @JsonProperty("xcoin_last_gpt")
  private String xcoinLastGpt;
  @JsonProperty("total_imx")
  private String totalImx;
  @JsonProperty("in_use_imx")
  private String inUseImx;
  @JsonProperty("available_imx")
  private String availableImx;
  @JsonProperty("xcoin_last_imx")
  private String xcoinLastImx;
  @JsonProperty("total_cfx")
  private String totalCfx;
  @JsonProperty("in_use_cfx")
  private String inUseCfx;
  @JsonProperty("available_cfx")
  private String availableCfx;
  @JsonProperty("xcoin_last_cfx")
  private String xcoinLastCfx;
  @JsonProperty("total_acs")
  private String totalAcs;
  @JsonProperty("in_use_acs")
  private String inUseAcs;
  @JsonProperty("available_acs")
  private String availableAcs;
  @JsonProperty("xcoin_last_acs")
  private String xcoinLastAcs;
  @JsonProperty("total_fxs")
  private String totalFxs;
  @JsonProperty("in_use_fxs")
  private String inUseFxs;
  @JsonProperty("available_fxs")
  private String availableFxs;
  @JsonProperty("xcoin_last_fxs")
  private String xcoinLastFxs;
  @JsonProperty("total_celo")
  private String totalCelo;
  @JsonProperty("in_use_celo")
  private String inUseCelo;
  @JsonProperty("available_celo")
  private String availableCelo;
  @JsonProperty("xcoin_last_celo")
  private String xcoinLastCelo;
  @JsonProperty("total_ldo")
  private String totalLdo;
  @JsonProperty("in_use_ldo")
  private String inUseLdo;
  @JsonProperty("available_ldo")
  private String availableLdo;
  @JsonProperty("xcoin_last_ldo")
  private String xcoinLastLdo;
  @JsonProperty("total_ftm")
  private String totalFtm;
  @JsonProperty("in_use_ftm")
  private String inUseFtm;
  @JsonProperty("available_ftm")
  private String availableFtm;
  @JsonProperty("xcoin_last_ftm")
  private String xcoinLastFtm;
  @JsonProperty("total_fet")
  private String totalFet;
  @JsonProperty("in_use_fet")
  private String inUseFet;
  @JsonProperty("available_fet")
  private String availableFet;
  @JsonProperty("xcoin_last_fet")
  private String xcoinLastFet;
  @JsonProperty("total_sui")
  private String totalSui;
  @JsonProperty("in_use_sui")
  private String inUseSui;
  @JsonProperty("available_sui")
  private String availableSui;
  @JsonProperty("xcoin_last_sui")
  private String xcoinLastSui;
  @JsonProperty("total_kwenta")
  private String totalKwenta;
  @JsonProperty("in_use_kwenta")
  private String inUseKwenta;
  @JsonProperty("available_kwenta")
  private String availableKwenta;
  @JsonProperty("xcoin_last_kwenta")
  private String xcoinLastKwenta;
  @JsonProperty("total_lazio")
  private String totalLazio;
  @JsonProperty("in_use_lazio")
  private String inUseLazio;
  @JsonProperty("available_lazio")
  private String availableLazio;
  @JsonProperty("xcoin_last_lazio")
  private String xcoinLastLazio;
  @JsonProperty("total_nct")
  private String totalNct;
  @JsonProperty("in_use_nct")
  private String inUseNct;
  @JsonProperty("available_nct")
  private String availableNct;
  @JsonProperty("xcoin_last_nct")
  private String xcoinLastNct;
  @JsonProperty("total_porto")
  private String totalPorto;
  @JsonProperty("in_use_porto")
  private String inUsePorto;
  @JsonProperty("available_porto")
  private String availablePorto;
  @JsonProperty("xcoin_last_porto")
  private String xcoinLastPorto;
  @JsonProperty("total_xcore")
  private String totalXcore;
  @JsonProperty("in_use_xcore")
  private String inUseXcore;
  @JsonProperty("available_xcore")
  private String availableXcore;
  @JsonProperty("xcoin_last_xcore")
  private String xcoinLastXcore;
  @JsonProperty("total_floki")
  private String totalFloki;
  @JsonProperty("in_use_floki")
  private String inUseFloki;
  @JsonProperty("available_floki")
  private String availableFloki;
  @JsonProperty("xcoin_last_floki")
  private String xcoinLastFloki;
  @JsonProperty("total_alex")
  private String totalAlex;
  @JsonProperty("in_use_alex")
  private String inUseAlex;
  @JsonProperty("available_alex")
  private String availableAlex;
  @JsonProperty("xcoin_last_alex")
  private String xcoinLastAlex;
  @JsonProperty("total_id")
  private String totalId;
  @JsonProperty("in_use_id")
  private String inUseId;
  @JsonProperty("available_id")
  private String availableId;
  @JsonProperty("xcoin_last_id")
  private String xcoinLastId;
  @JsonProperty("total_rndr")
  private String totalRndr;
  @JsonProperty("in_use_rndr")
  private String inUseRndr;
  @JsonProperty("available_rndr")
  private String availableRndr;
  @JsonProperty("xcoin_last_rndr")
  private String xcoinLastRndr;
  @JsonProperty("total_stg")
  private String totalStg;
  @JsonProperty("in_use_stg")
  private String inUseStg;
  @JsonProperty("available_stg")
  private String availableStg;
  @JsonProperty("xcoin_last_stg")
  private String xcoinLastStg;
  @JsonProperty("total_santos")
  private String totalSantos;
  @JsonProperty("in_use_santos")
  private String inUseSantos;
  @JsonProperty("available_santos")
  private String availableSantos;
  @JsonProperty("xcoin_last_santos")
  private String xcoinLastSantos;
  @JsonProperty("total_osmo")
  private String totalOsmo;
  @JsonProperty("in_use_osmo")
  private String inUseOsmo;
  @JsonProperty("available_osmo")
  private String availableOsmo;
  @JsonProperty("xcoin_last_osmo")
  private String xcoinLastOsmo;
  @JsonProperty("total_gal")
  private String totalGal;
  @JsonProperty("in_use_gal")
  private String inUseGal;
  @JsonProperty("available_gal")
  private String availableGal;
  @JsonProperty("xcoin_last_gal")
  private String xcoinLastGal;
  @JsonProperty("total_ilv")
  private String totalIlv;
  @JsonProperty("in_use_ilv")
  private String inUseIlv;
  @JsonProperty("available_ilv")
  private String availableIlv;
  @JsonProperty("xcoin_last_ilv")
  private String xcoinLastIlv;
  @JsonProperty("total_mav")
  private String totalMav;
  @JsonProperty("in_use_mav")
  private String inUseMav;
  @JsonProperty("available_mav")
  private String availableMav;
  @JsonProperty("xcoin_last_mav")
  private String xcoinLastMav;
  @JsonProperty("total_hvh")
  private String totalHvh;
  @JsonProperty("in_use_hvh")
  private String inUseHvh;
  @JsonProperty("available_hvh")
  private String availableHvh;
  @JsonProperty("xcoin_last_hvh")
  private String xcoinLastHvh;
  @JsonProperty("total_rss3")
  private String totalRss3;
  @JsonProperty("in_use_rss3")
  private String inUseRss3;
  @JsonProperty("available_rss3")
  private String availableRss3;
  @JsonProperty("xcoin_last_rss3")
  private String xcoinLastRss3;
  @JsonProperty("total_audio")
  private String totalAudio;
  @JsonProperty("in_use_audio")
  private String inUseAudio;
  @JsonProperty("available_audio")
  private String availableAudio;
  @JsonProperty("xcoin_last_audio")
  private String xcoinLastAudio;
  @JsonProperty("total_agi")
  private String totalAgi;
  @JsonProperty("in_use_agi")
  private String inUseAgi;
  @JsonProperty("available_agi")
  private String availableAgi;
  @JsonProperty("xcoin_last_agi")
  private String xcoinLastAgi;
  @JsonProperty("total_rdnt")
  private String totalRdnt;
  @JsonProperty("in_use_rdnt")
  private String inUseRdnt;
  @JsonProperty("available_rdnt")
  private String availableRdnt;
  @JsonProperty("xcoin_last_rdnt")
  private String xcoinLastRdnt;
  @JsonProperty("total_astr")
  private String totalAstr;
  @JsonProperty("in_use_astr")
  private String inUseAstr;
  @JsonProperty("available_astr")
  private String availableAstr;
  @JsonProperty("xcoin_last_astr")
  private String xcoinLastAstr;
  @JsonProperty("total_wld")
  private String totalWld;
  @JsonProperty("in_use_wld")
  private String inUseWld;
  @JsonProperty("available_wld")
  private String availableWld;
  @JsonProperty("xcoin_last_wld")
  private String xcoinLastWld;
  @JsonProperty("total_flux")
  private String totalFlux;
  @JsonProperty("in_use_flux")
  private String inUseFlux;
  @JsonProperty("available_flux")
  private String availableFlux;
  @JsonProperty("xcoin_last_flux")
  private String xcoinLastFlux;
  @JsonProperty("total_rvn")
  private String totalRvn;
  @JsonProperty("in_use_rvn")
  private String inUseRvn;
  @JsonProperty("available_rvn")
  private String availableRvn;
  @JsonProperty("xcoin_last_rvn")
  private String xcoinLastRvn;
  @JsonProperty("total_lever")
  private String totalLever;
  @JsonProperty("in_use_lever")
  private String inUseLever;
  @JsonProperty("available_lever")
  private String availableLever;
  @JsonProperty("xcoin_last_lever")
  private String xcoinLastLever;
  @JsonProperty("total_edu")
  private String totalEdu;
  @JsonProperty("in_use_edu")
  private String inUseEdu;
  @JsonProperty("available_edu")
  private String availableEdu;
  @JsonProperty("xcoin_last_edu")
  private String xcoinLastEdu;
  @JsonProperty("total_sei")
  private String totalSei;
  @JsonProperty("in_use_sei")
  private String inUseSei;
  @JsonProperty("available_sei")
  private String availableSei;
  @JsonProperty("xcoin_last_sei")
  private String xcoinLastSei;
  @JsonProperty("total_waxl")
  private String totalWaxl;
  @JsonProperty("in_use_waxl")
  private String inUseWaxl;
  @JsonProperty("available_waxl")
  private String availableWaxl;
  @JsonProperty("xcoin_last_waxl")
  private String xcoinLastWaxl;
  @JsonProperty("total_moc")
  private String totalMoc;
  @JsonProperty("in_use_moc")
  private String inUseMoc;
  @JsonProperty("available_moc")
  private String availableMoc;
  @JsonProperty("xcoin_last_moc")
  private String xcoinLastMoc;
  @JsonProperty("total_pepe")
  private String totalPepe;
  @JsonProperty("in_use_pepe")
  private String inUsePepe;
  @JsonProperty("available_pepe")
  private String availablePepe;
  @JsonProperty("xcoin_last_pepe")
  private String xcoinLastPepe;
  @JsonProperty("total_cyber")
  private String totalCyber;
  @JsonProperty("in_use_cyber")
  private String inUseCyber;
  @JsonProperty("available_cyber")
  private String availableCyber;
  @JsonProperty("xcoin_last_cyber")
  private String xcoinLastCyber;
  @JsonProperty("total_arkm")
  private String totalArkm;
  @JsonProperty("in_use_arkm")
  private String inUseArkm;
  @JsonProperty("available_arkm")
  private String availableArkm;
  @JsonProperty("xcoin_last_arkm")
  private String xcoinLastArkm;
  @JsonProperty("total_pyr")
  private String totalPyr;
  @JsonProperty("in_use_pyr")
  private String inUsePyr;
  @JsonProperty("available_pyr")
  private String availablePyr;
  @JsonProperty("xcoin_last_pyr")
  private String xcoinLastPyr;
  @JsonProperty("total_iotx")
  private String totalIotx;
  @JsonProperty("in_use_iotx")
  private String inUseIotx;
  @JsonProperty("available_iotx")
  private String availableIotx;
  @JsonProperty("xcoin_last_iotx")
  private String xcoinLastIotx;
  @JsonProperty("total_high")
  private String totalHigh;
  @JsonProperty("in_use_high")
  private String inUseHigh;
  @JsonProperty("available_high")
  private String availableHigh;
  @JsonProperty("xcoin_last_high")
  private String xcoinLastHigh;
  @JsonProperty("total_pendle")
  private String totalPendle;
  @JsonProperty("in_use_pendle")
  private String inUsePendle;
  @JsonProperty("available_pendle")
  private String availablePendle;
  @JsonProperty("xcoin_last_pendle")
  private String xcoinLastPendle;
  @JsonProperty("total_storj")
  private String totalStorj;
  @JsonProperty("in_use_storj")
  private String inUseStorj;
  @JsonProperty("available_storj")
  private String availableStorj;
  @JsonProperty("xcoin_last_storj")
  private String xcoinLastStorj;
  @JsonProperty("total_api3")
  private String totalApi3;
  @JsonProperty("in_use_api3")
  private String inUseApi3;
  @JsonProperty("available_api3")
  private String availableApi3;
  @JsonProperty("xcoin_last_api3")
  private String xcoinLastApi3;
  @JsonProperty("total_ztx")
  private String totalZtx;
  @JsonProperty("in_use_ztx")
  private String inUseZtx;
  @JsonProperty("available_ztx")
  private String availableZtx;
  @JsonProperty("xcoin_last_ztx")
  private String xcoinLastZtx;
  @JsonProperty("total_mnt")
  private String totalMnt;
  @JsonProperty("in_use_mnt")
  private String inUseMnt;
  @JsonProperty("available_mnt")
  private String availableMnt;
  @JsonProperty("xcoin_last_mnt")
  private String xcoinLastMnt;
  @JsonProperty("total_gtc")
  private String totalGtc;
  @JsonProperty("in_use_gtc")
  private String inUseGtc;
  @JsonProperty("available_gtc")
  private String availableGtc;
  @JsonProperty("xcoin_last_gtc")
  private String xcoinLastGtc;
  @JsonProperty("total_tia")
  private String totalTia;
  @JsonProperty("in_use_tia")
  private String inUseTia;
  @JsonProperty("available_tia")
  private String availableTia;
  @JsonProperty("xcoin_last_tia")
  private String xcoinLastTia;
  @JsonProperty("total_zbc")
  private String totalZbc;
  @JsonProperty("in_use_zbc")
  private String inUseZbc;
  @JsonProperty("available_zbc")
  private String availableZbc;
  @JsonProperty("xcoin_last_zbc")
  private String xcoinLastZbc;
  @JsonProperty("total_spurs")
  private String totalSpurs;
  @JsonProperty("in_use_spurs")
  private String inUseSpurs;
  @JsonProperty("available_spurs")
  private String availableSpurs;
  @JsonProperty("xcoin_last_spurs")
  private String xcoinLastSpurs;
  @JsonProperty("total_chz_m")
  private String totalChzM;
  @JsonProperty("in_use_chz_m")
  private String inUseChzM;
  @JsonProperty("available_chz_m")
  private String availableChzM;
  @JsonProperty("xcoin_last_chz_m")
  private String xcoinLastChzM;
  @JsonProperty("total_neo")
  private String totalNeo;
  @JsonProperty("in_use_neo")
  private String inUseNeo;
  @JsonProperty("available_neo")
  private String availableNeo;
  @JsonProperty("xcoin_last_neo")
  private String xcoinLastNeo;
  @JsonProperty("total_gas")
  private String totalGas;
  @JsonProperty("in_use_gas")
  private String inUseGas;
  @JsonProperty("available_gas")
  private String availableGas;
  @JsonProperty("xcoin_last_gas")
  private String xcoinLastGas;
  @JsonProperty("total_hifi")
  private String totalHifi;
  @JsonProperty("in_use_hifi")
  private String inUseHifi;
  @JsonProperty("available_hifi")
  private String availableHifi;
  @JsonProperty("xcoin_last_hifi")
  private String xcoinLastHifi;
  @JsonProperty("total_bigtime")
  private String totalBigtime;
  @JsonProperty("in_use_bigtime")
  private String inUseBigtime;
  @JsonProperty("available_bigtime")
  private String availableBigtime;
  @JsonProperty("xcoin_last_bigtime")
  private String xcoinLastBigtime;
  @JsonProperty("total_ark")
  private String totalArk;
  @JsonProperty("in_use_ark")
  private String inUseArk;
  @JsonProperty("available_ark")
  private String availableArk;
  @JsonProperty("xcoin_last_ark")
  private String xcoinLastArk;
  @JsonProperty("total_ygg")
  private String totalYgg;
  @JsonProperty("in_use_ygg")
  private String inUseYgg;
  @JsonProperty("available_ygg")
  private String availableYgg;
  @JsonProperty("xcoin_last_ygg")
  private String xcoinLastYgg;
  @JsonProperty("total_kava")
  private String totalKava;
  @JsonProperty("in_use_kava")
  private String inUseKava;
  @JsonProperty("available_kava")
  private String availableKava;
  @JsonProperty("xcoin_last_kava")
  private String xcoinLastKava;
  @JsonProperty("total_stmx")
  private String totalStmx;
  @JsonProperty("in_use_stmx")
  private String inUseStmx;
  @JsonProperty("available_stmx")
  private String availableStmx;
  @JsonProperty("xcoin_last_stmx")
  private String xcoinLastStmx;
  @JsonProperty("total_magic")
  private String totalMagic;
  @JsonProperty("in_use_magic")
  private String inUseMagic;
  @JsonProperty("available_magic")
  private String availableMagic;
  @JsonProperty("xcoin_last_magic")
  private String xcoinLastMagic;
  @JsonProperty("total_usdt")
  private String totalUsdt;
  @JsonProperty("in_use_usdt")
  private String inUseUsdt;
  @JsonProperty("available_usdt")
  private String availableUsdt;
  @JsonProperty("xcoin_last_usdt")
  private String xcoinLastUsdt;
  @JsonProperty("total_usdc")
  private String totalUsdc;
  @JsonProperty("in_use_usdc")
  private String inUseUsdc;
  @JsonProperty("available_usdc")
  private String availableUsdc;
  @JsonProperty("xcoin_last_usdc")
  private String xcoinLastUsdc;
  @JsonProperty("total_rad")
  private String totalRad;
  @JsonProperty("in_use_rad")
  private String inUseRad;
  @JsonProperty("available_rad")
  private String availableRad;
  @JsonProperty("xcoin_last_rad")
  private String xcoinLastRad;
  @JsonProperty("total_lsk")
  private String totalLsk;
  @JsonProperty("in_use_lsk")
  private String inUseLsk;
  @JsonProperty("available_lsk")
  private String availableLsk;
  @JsonProperty("xcoin_last_lsk")
  private String xcoinLastLsk;
  @JsonProperty("total_manta_eth")
  private String totalMantaEth;
  @JsonProperty("in_use_manta_eth")
  private String inUseMantaEth;
  @JsonProperty("available_manta_eth")
  private String availableMantaEth;
  @JsonProperty("xcoin_last_manta_eth")
  private String xcoinLastMantaEth;
  @JsonProperty("total_tt")
  private String totalTt;
  @JsonProperty("in_use_tt")
  private String inUseTt;
  @JsonProperty("available_tt")
  private String availableTt;
  @JsonProperty("xcoin_last_tt")
  private String xcoinLastTt;
  @JsonProperty("total_ace")
  private String totalAce;
  @JsonProperty("in_use_ace")
  private String inUseAce;
  @JsonProperty("available_ace")
  private String availableAce;
  @JsonProperty("xcoin_last_ace")
  private String xcoinLastAce;
  @JsonProperty("total_manta")
  private String totalManta;
  @JsonProperty("in_use_manta")
  private String inUseManta;
  @JsonProperty("available_manta")
  private String availableManta;
  @JsonProperty("xcoin_last_manta")
  private String xcoinLastManta;
  @JsonProperty("total_jup")
  private String totalJup;
  @JsonProperty("in_use_jup")
  private String inUseJup;
  @JsonProperty("available_jup")
  private String availableJup;
  @JsonProperty("xcoin_last_jup")
  private String xcoinLastJup;
  @JsonProperty("total_strk")
  private String totalStrk;
  @JsonProperty("in_use_strk")
  private String inUseStrk;
  @JsonProperty("available_strk")
  private String availableStrk;
  @JsonProperty("xcoin_last_strk")
  private String xcoinLastStrk;
  @JsonProperty("total_c9472")
  private String totalC9472;
  @JsonProperty("in_use_c9472")
  private String inUseC9472;
  @JsonProperty("available_c9472")
  private String availableC9472;
  @JsonProperty("xcoin_last_c9472")
  private String xcoinLastC9472;

  public Map<String, Double> getMyCoinMap() {
    Map<String, String> coinMap = new HashMap<>();
    coinMap.put("P", getTotalP());
    coinMap.put("BM", getTotalBm());
    coinMap.put("KRW", getTotalKrw());
    coinMap.put("BTC", getTotalBtc());
    coinMap.put("ETH", getTotalEth());
    coinMap.put("DASH", getTotalDash());
    coinMap.put("LTC", getTotalLtc());
    coinMap.put("ETC", getTotalEtc());
    coinMap.put("XRP", getTotalXrp());
    coinMap.put("BCH", getTotalBch());
    coinMap.put("XMR", getTotalXmr());
    coinMap.put("ZEC", getTotalZec());
    coinMap.put("QTUM", getTotalQtum());
    coinMap.put("BTG", getTotalBtg());
    coinMap.put("EOS", getTotalEos());
    coinMap.put("ICX", getTotalIcx());
    coinMap.put("VEN", getTotalVen());
    coinMap.put("TRX", getTotalTrx());
    coinMap.put("ELF", getTotalElf());
    coinMap.put("MITH", getTotalMith());
    coinMap.put("MCO", getTotalMco());
    coinMap.put("OMG", getTotalOmg());
    coinMap.put("KNC", getTotalKnc());
    coinMap.put("GLM", getTotalGlm());
    coinMap.put("HSR", getTotalHsr());
    coinMap.put("ZIL", getTotalZil());
    coinMap.put("ETHOS", getTotalEthos());
    coinMap.put("PAY", getTotalPay());
    coinMap.put("WAXP", getTotalWaxp());
    coinMap.put("POWR", getTotalPowr());
    coinMap.put("LRC", getTotalLrc());
    coinMap.put("GTO", getTotalGto());
    coinMap.put("PCH", getTotalPch());
    coinMap.put("EOSDAC", getTotalEosdac());
    coinMap.put("STEEM", getTotalSteem());
    coinMap.put("STRAX", getTotalStrax());
    coinMap.put("AE", getTotalAe());
    coinMap.put("ZRX", getTotalZrx());
    coinMap.put("REP", getTotalRep());
    coinMap.put("XEM", getTotalXem());
    coinMap.put("SNT", getTotalSnt());
    coinMap.put("ADA", getTotalAda());
    coinMap.put("PPT", getTotalPpt());
    coinMap.put("CTXC", getTotalCtxc());
    coinMap.put("BAT", getTotalBat());
    coinMap.put("WTC", getTotalWtc());
    coinMap.put("CMT", getTotalCmt());
    coinMap.put("THETA", getTotalTheta());
    coinMap.put("POLY", getTotalPoly());
    coinMap.put("LOOM", getTotalLoom());
    coinMap.put("CVC", getTotalCvc());
    coinMap.put("MAN", getTotalMan());
    coinMap.put("WAVES", getTotalWaves());
    coinMap.put("ITC", getTotalItc());
    coinMap.put("TRUE", getTotalTrue());
    coinMap.put("ABT", getTotalAbt());
    coinMap.put("LINK", getTotalLink());
    coinMap.put("MEETONE", getTotalMeetone());
    coinMap.put("HORUS", getTotalHorus());
    coinMap.put("ADD", getTotalAdd());
    coinMap.put("SALT", getTotalSalt());
    coinMap.put("PST", getTotalPst());
    coinMap.put("BHPC", getTotalBhpc());
    coinMap.put("RNT", getTotalRnt());
    coinMap.put("ENJ", getTotalEnj());
    coinMap.put("PLX", getTotalPlx());
    coinMap.put("VET", getTotalVet());
    coinMap.put("MTL", getTotalMtl());
    coinMap.put("RDN", getTotalRdn());
    coinMap.put("INS", getTotalIns());
    coinMap.put("CHL", getTotalChl());
    coinMap.put("BLACK", getTotalBlack());
    coinMap.put("ATD", getTotalAtd());
    coinMap.put("IOST", getTotalIost());
    coinMap.put("OCN", getTotalOcn());
    coinMap.put("TMTG", getTotalTmtg());
    coinMap.put("QKC", getTotalQkc());
    coinMap.put("BZNT", getTotalBznt());
    coinMap.put("ARN", getTotalArn());
    coinMap.put("ATOLO", getTotalAtolo());
    coinMap.put("NPXS", getTotalNpxs());
    coinMap.put("LBA", getTotalLba());
    coinMap.put("WET", getTotalWet());
    coinMap.put("AMO", getTotalAmo());
    coinMap.put("BSV", getTotalBsv());
    coinMap.put("KEOS", getTotalKeos());
    coinMap.put("ROM", getTotalRom());
    coinMap.put("BXA", getTotalBxa());
    coinMap.put("APIS", getTotalApis());
    coinMap.put("DAC", getTotalDac());
    coinMap.put("DACC", getTotalDacc());
    coinMap.put("AUTO", getTotalAuto());
    coinMap.put("ORBS", getTotalOrbs());
    coinMap.put("TFUEL", getTotalTfuel());
    coinMap.put("VALOR", getTotalValor());
    coinMap.put("CON", getTotalCon());
    coinMap.put("ANKR", getTotalAnkr());
    coinMap.put("MIX", getTotalMix());
    coinMap.put("VTHO", getTotalVtho());
    coinMap.put("LAMB", getTotalLamb());
    coinMap.put("CRO", getTotalCro());
    coinMap.put("FX", getTotalFx());
    coinMap.put("CHR", getTotalChr());
    coinMap.put("MBL", getTotalMbl());
    coinMap.put("MXC", getTotalMxc());
    coinMap.put("FAB", getTotalFab());
    coinMap.put("OGO", getTotalOgo());
    coinMap.put("WIN", getTotalWin());
    coinMap.put("DVP", getTotalDvp());
    coinMap.put("FCT2", getTotalFct2());
    coinMap.put("FNB", getTotalFnb());
    coinMap.put("FZZ", getTotalFzz());
    coinMap.put("TRV", getTotalTrv());
    coinMap.put("PCM", getTotalPcm());
    coinMap.put("DAD", getTotalDad());
    coinMap.put("AOA", getTotalAoa());
    coinMap.put("XSR", getTotalXsr());
    coinMap.put("WOM", getTotalWom());
    coinMap.put("SOC", getTotalSoc());
    coinMap.put("EM", getTotalEm());
    coinMap.put("QBZ", getTotalQbz());
    coinMap.put("BOA", getTotalBoa());
    coinMap.put("WPX", getTotalWpx());
    coinMap.put("MEV", getTotalMev());
    coinMap.put("BNP", getTotalBnp());
    coinMap.put("SXP", getTotalSxp());
    coinMap.put("COS", getTotalCos());
    coinMap.put("APIX", getTotalApix());
    coinMap.put("EL", getTotalEl());
    coinMap.put("BASIC", getTotalBasic());
    coinMap.put("HIVE", getTotalHive());
    coinMap.put("XPR", getTotalXpr());
    coinMap.put("VRA", getTotalVra());
    coinMap.put("FIT", getTotalFit());
    coinMap.put("EGG", getTotalEgg());
    coinMap.put("BORA", getTotalBora());
    coinMap.put("ARPA", getTotalArpa());
    coinMap.put("CTC", getTotalCtc());
    coinMap.put("APM", getTotalApm());
    coinMap.put("CKB", getTotalCkb());
    coinMap.put("AERGO", getTotalAergo());
    coinMap.put("ANW", getTotalAnw());
    coinMap.put("CENNZ", getTotalCennz());
    coinMap.put("EVZ", getTotalEvz());
    coinMap.put("CYCLUB", getTotalCyclub());
    coinMap.put("SRM", getTotalSrm());
    coinMap.put("QTCON", getTotalQtcon());
    coinMap.put("UNI", getTotalUni());
    coinMap.put("YFI", getTotalYfi());
    coinMap.put("UMA", getTotalUma());
    coinMap.put("AAVE", getTotalAave());
    coinMap.put("COMP", getTotalComp());
    coinMap.put("REN", getTotalRen());
    coinMap.put("BAL", getTotalBal());
    coinMap.put("RSR", getTotalRsr());
    coinMap.put("NMR", getTotalNmr());
    coinMap.put("RLC", getTotalRlc());
    coinMap.put("UOS", getTotalUos());
    coinMap.put("SAND", getTotalSand());
    coinMap.put("CVT", getTotalCvt());
    coinMap.put("STPT", getTotalStpt());
    coinMap.put("GOM2", getTotalGom2());
    coinMap.put("RINGX", getTotalRingx());
    coinMap.put("BEL", getTotalBel());
    coinMap.put("DVC", getTotalDvc());
    coinMap.put("OBSR", getTotalObsr());
    coinMap.put("ORC", getTotalOrc());
    coinMap.put("POLA", getTotalPola());
    coinMap.put("AWO", getTotalAwo());
    coinMap.put("ADP", getTotalAdp());
    coinMap.put("DVI", getTotalDvi());
    coinMap.put("DRM", getTotalDrm());
    coinMap.put("IBP", getTotalIbp());
    coinMap.put("GHX", getTotalGhx());
    coinMap.put("MIR", getTotalMir());
    coinMap.put("CBK", getTotalCbk());
    coinMap.put("ONX", getTotalOnx());
    coinMap.put("MVC", getTotalMvc());
    coinMap.put("BLY", getTotalBly());
    coinMap.put("WOZX", getTotalWozx());
    coinMap.put("ANV", getTotalAnv());
    coinMap.put("GRT", getTotalGrt());
    coinMap.put("MM", getTotalMm());
    coinMap.put("BIOT", getTotalBiot());
    coinMap.put("XNO", getTotalXno());
    coinMap.put("SNX", getTotalSnx());
    coinMap.put("SOFI", getTotalSofi());
    coinMap.put("GRACY", getTotalGracy());
    coinMap.put("NU", getTotalNu());
    coinMap.put("OXT", getTotalOxt());
    coinMap.put("LINA", getTotalLina());
    coinMap.put("ASTA", getTotalAsta());
    coinMap.put("MAP", getTotalMap());
    coinMap.put("AQT", getTotalAqt());
    coinMap.put("PLA", getTotalPla());
    coinMap.put("WIKEN", getTotalWiken());
    coinMap.put("CTSI", getTotalCtsi());
    coinMap.put("MANA", getTotalMana());
    coinMap.put("LPT", getTotalLpt());
    coinMap.put("MKR", getTotalMkr());
    coinMap.put("SRT", getTotalSrt());
    coinMap.put("SUSHI", getTotalSushi());
    coinMap.put("NSBT", getTotalNsbt());
    coinMap.put("DON", getTotalDon());
    coinMap.put("ASM", getTotalAsm());
    coinMap.put("PUNDIX", getTotalPundix());
    coinMap.put("CELR", getTotalCelr());
    coinMap.put("CWD", getTotalCwd());
    coinMap.put("ARW", getTotalArw());
    coinMap.put("BETH", getTotalBeth());
    coinMap.put("BCDC", getTotalBcdc());
    coinMap.put("FRONT", getTotalFront());
    coinMap.put("MSB", getTotalMsb());
    coinMap.put("RLY", getTotalRly());
    coinMap.put("OCEAN", getTotalOcean());
    coinMap.put("BFC", getTotalBfc());
    coinMap.put("ALICE", getTotalAlice());
    coinMap.put("OGN", getTotalOgn());
    coinMap.put("COTI", getTotalCoti());
    coinMap.put("CAKE", getTotalCake());
    coinMap.put("BNT", getTotalBnt());
    coinMap.put("XVS", getTotalXvs());
    coinMap.put("SWAP", getTotalSwap());
    coinMap.put("CHZ", getTotalChz());
    coinMap.put("AXS", getTotalAxs());
    coinMap.put("DAO", getTotalDao());
    coinMap.put("SIX", getTotalSix());
    coinMap.put("DAI", getTotalDai());
    coinMap.put("SHIB", getTotalShib());
    coinMap.put("MATIC", getTotalMatic());
    coinMap.put("WOO", getTotalWoo());
    coinMap.put("ACH", getTotalAch());
    coinMap.put("BAKE", getTotalBake());
    coinMap.put("VELO", getTotalVelo());
    coinMap.put("ANC", getTotalAnc());
    coinMap.put("HC", getTotalHc());
    coinMap.put("BCD", getTotalBcd());
    coinMap.put("XVG", getTotalXvg());
    coinMap.put("XLM", getTotalXlm());
    coinMap.put("PIVX", getTotalPivx());
    coinMap.put("ETZ", getTotalEtz());
    coinMap.put("GXC", getTotalGxc());
    coinMap.put("BHP", getTotalBhp());
    coinMap.put("BTTOLD", getTotalBttold());
    coinMap.put("HYC", getTotalHyc());
    coinMap.put("VSYS", getTotalVsys());
    coinMap.put("IPX", getTotalIpx());
    coinMap.put("WICC", getTotalWicc());
    coinMap.put("ONT", getTotalOnt());
    coinMap.put("LUNC", getTotalLunc());
    coinMap.put("NEWS2", getTotalNews2());
    coinMap.put("AION", getTotalAion());
    coinMap.put("META", getTotalMeta());
    coinMap.put("KLAY", getTotalKlay());
    coinMap.put("COSM", getTotalCosm());
    coinMap.put("ONG", getTotalOng());
    coinMap.put("ALGO", getTotalAlgo());
    coinMap.put("JST", getTotalJst());
    coinMap.put("XTZ", getTotalXtz());
    coinMap.put("ITG", getTotalItg());
    coinMap.put("LUK", getTotalLuk());
    coinMap.put("MLK", getTotalMlk());
    coinMap.put("WEMIXC", getTotalWemixc());
    coinMap.put("DOT", getTotalDot());
    coinMap.put("SUNOLD", getTotalSunOld());
    coinMap.put("ATOM", getTotalAtom());
    coinMap.put("SSX", getTotalSsx());
    coinMap.put("BCHA", getTotalBcha());
    coinMap.put("TEMCO", getTotalTemco());
    coinMap.put("KSP", getTotalKsp());
    coinMap.put("LZM", getTotalLzm());
    coinMap.put("HIBS", getTotalHibs());
    coinMap.put("CPAY", getTotalCpay());
    coinMap.put("QI", getTotalQi());
    coinMap.put("BSCBNB", getTotalBscBnb());
    coinMap.put("BURGER", getTotalBurger());
    coinMap.put("DOGE", getTotalDoge());
    coinMap.put("KSM", getTotalKsm());
    coinMap.put("CTK", getTotalCtk());
    coinMap.put("XYM", getTotalXym());
    coinMap.put("BNB", getTotalBnb());
    coinMap.put("NFT", getTotalNft());
    coinMap.put("SUN", getTotalSun());
    coinMap.put("XEC", getTotalXec());
    coinMap.put("AGIX", getTotalAgix());
    coinMap.put("PCI", getTotalPci());
    coinMap.put("SOL", getTotalSol());
    coinMap.put("FNSA", getTotalFnsa());
    coinMap.put("EGLD", getTotalEgld());
    coinMap.put("GO", getTotalGo());
    coinMap.put("MASK", getTotalMask());
    coinMap.put("DFA", getTotalDfa());
    coinMap.put("C98", getTotalC98());
    coinMap.put("MED", getTotalMed());
    coinMap.put("SGB", getTotalSgb());
    coinMap.put("1INCH", getTotal1inch());
    coinMap.put("CRV", getTotalCrv());
    coinMap.put("BOBA", getTotalBoba());
    coinMap.put("RPG", getTotalRpg());
    coinMap.put("DYDX", getTotalDydx());
    coinMap.put("MINA", getTotalMina());
    coinMap.put("FLOW", getTotalFlow());
    coinMap.put("JOE", getTotalJoe());
    coinMap.put("GALA", getTotalGala());
    coinMap.put("ENS", getTotalEns());
    coinMap.put("PURSE", getTotalPurse());
    coinMap.put("BTT", getTotalBtt());
    coinMap.put("EFI", getTotalEfi());
    coinMap.put("JASMY", getTotalJasmy());
    coinMap.put("TITAN", getTotalTitan());
    coinMap.put("REQ", getTotalReq());
    coinMap.put("CSPR", getTotalCspr());
    coinMap.put("SOLO", getTotalSolo());
    coinMap.put("AVAX", getTotalAvax());
    coinMap.put("TDROP", getTotalTdrop());
    coinMap.put("HBAR", getTotalHbar());
    coinMap.put("FANC", getTotalFanc());
    coinMap.put("SPRT", getTotalSprt());
    coinMap.put("NPT", getTotalNpt());
    coinMap.put("WITCH", getTotalWitch());
    coinMap.put("REI", getTotalRei());
    coinMap.put("T", getTotalT());
    coinMap.put("AQUA", getTotalAqua());
    coinMap.put("MBX", getTotalMbx());
    coinMap.put("GMT", getTotalGmt());
    coinMap.put("TAVA", getTotalTava());
    coinMap.put("DAR", getTotalDar());
    coinMap.put("APE", getTotalApe());
    coinMap.put("WNCG", getTotalWncg());
    coinMap.put("ALT", getTotalAlt());
    coinMap.put("XCN", getTotalXcn());
    coinMap.put("GXA", getTotalGxa());
    coinMap.put("LUNA2", getTotalLuna2());
    coinMap.put("TALK", getTotalTalk());
    coinMap.put("OGV", getTotalOgv());
    coinMap.put("AZIT", getTotalAzit());
    coinMap.put("ETHW", getTotalEthw());
    coinMap.put("ETHF", getTotalEthf());
    coinMap.put("FLR", getTotalFlr());
    coinMap.put("ICZ", getTotalIcz());
    coinMap.put("SFP", getTotalSfp());
    coinMap.put("FITFI", getTotalFitfi());
    coinMap.put("STAT", getTotalStat());
    coinMap.put("CRTS", getTotalCrts());
    coinMap.put("VIX", getTotalVix());
    coinMap.put("LBL", getTotalLbl());
    coinMap.put("FLZ", getTotalFlz());
    coinMap.put("BERRY", getTotalBerry());
    coinMap.put("LM", getTotalLm());
    coinMap.put("GRND", getTotalGrnd());
    coinMap.put("APT", getTotalApt());
    coinMap.put("BLUR", getTotalBlur());
    coinMap.put("WEMIX", getTotalWemix());
    coinMap.put("NEWS", getTotalNews());
    coinMap.put("OPETH", getTotalOpEth());
    coinMap.put("DICE", getTotalDice());
    coinMap.put("OAS", getTotalOas());
    coinMap.put("HOOK", getTotalHook());
    coinMap.put("ENTC", getTotalEntc());
    coinMap.put("ONIT", getTotalOnit());
    coinMap.put("OP", getTotalOp());
    coinMap.put("ARBETH", getTotalArbEth());
    coinMap.put("ROA", getTotalRoa());
    coinMap.put("ORB", getTotalOrb());
    coinMap.put("EVER", getTotalEver());
    coinMap.put("GMX", getTotalGmx());
    coinMap.put("STX", getTotalStx());
    coinMap.put("XPLA", getTotalXpla());
    coinMap.put("REAP", getTotalReap());
    coinMap.put("AHT", getTotalAht());
    coinMap.put("ARB", getTotalArb());
    coinMap.put("INJ", getTotalInj());
    coinMap.put("HFT", getTotalHft());
    coinMap.put("RPL", getTotalRpl());
    coinMap.put("GPT", getTotalGpt());
    coinMap.put("IMX", getTotalImx());
    coinMap.put("CFX", getTotalCfx());
    coinMap.put("ACS", getTotalAcs());
    coinMap.put("FXS", getTotalFxs());
    coinMap.put("CELO", getTotalCelo());
    coinMap.put("LDO", getTotalLdo());
    coinMap.put("FTM", getTotalFtm());
    coinMap.put("FET", getTotalFet());
    coinMap.put("SUI", getTotalSui());
    coinMap.put("KWENTA", getTotalKwenta());
    coinMap.put("LAZIO", getTotalLazio());
    coinMap.put("NCT", getTotalNct());
    coinMap.put("PORTO", getTotalPorto());
    coinMap.put("XCORE", getTotalXcore());
    coinMap.put("FLOKI", getTotalFloki());
    coinMap.put("ALEX", getTotalAlex());
    coinMap.put("ID", getTotalId());
    coinMap.put("RNDR", getTotalRndr());
    coinMap.put("STG", getTotalStg());
    coinMap.put("SANTOS", getTotalSantos());
    coinMap.put("OSMO", getTotalOsmo());
    coinMap.put("GAL", getTotalGal());
    coinMap.put("ILV", getTotalIlv());
    coinMap.put("MAV", getTotalMav());
    coinMap.put("HVH", getTotalHvh());
    coinMap.put("RSS3", getTotalRss3());
    coinMap.put("AUDIO", getTotalAudio());
    coinMap.put("AGI", getTotalAgi());
    coinMap.put("RDNT", getTotalRdnt());
    coinMap.put("ASTR", getTotalAstr());
    coinMap.put("WLD", getTotalWld());
    coinMap.put("FLUX", getTotalFlux());
    coinMap.put("RVN", getTotalRvn());
    coinMap.put("LEVER", getTotalLever());
    coinMap.put("EDU", getTotalEdu());
    coinMap.put("SEI", getTotalSei());
    coinMap.put("WAXL", getTotalWaxl());
    coinMap.put("MOC", getTotalMoc());
    coinMap.put("PEPE", getTotalPepe());
    coinMap.put("CYBER", getTotalCyber());
    coinMap.put("ARKM", getTotalArkm());
    coinMap.put("PYR", getTotalPyr());
    coinMap.put("IOTX", getTotalIotx());
    coinMap.put("HIGH", getTotalHigh());
    coinMap.put("PENDLE", getTotalPendle());
    coinMap.put("STORJ", getTotalStorj());
    coinMap.put("API3", getTotalApi3());
    coinMap.put("ZTX", getTotalZtx());
    coinMap.put("MNT", getTotalMnt());
    coinMap.put("GTC", getTotalGtc());
    coinMap.put("TIA", getTotalTia());
    coinMap.put("ZBC", getTotalZbc());
    coinMap.put("SPURS", getTotalSpurs());
    coinMap.put("CHZM", getTotalChzM());
    coinMap.put("NEO", getTotalNeo());
    coinMap.put("GAS", getTotalGas());
    coinMap.put("HIFI", getTotalHifi());
    coinMap.put("BIGTIME", getTotalBigtime());
    coinMap.put("ARK", getTotalArk());
    coinMap.put("YGG", getTotalYgg());
    coinMap.put("KAVA", getTotalKava());
    coinMap.put("STMX", getTotalStmx());
    coinMap.put("MAGIC", getTotalMagic());
    coinMap.put("USDT", getTotalUsdt());
    coinMap.put("USDC", getTotalUsdc());
    coinMap.put("RAD", getTotalRad());
    coinMap.put("LSK", getTotalLsk());
    coinMap.put("MANTAETH", getTotalMantaEth());
    coinMap.put("TT", getTotalTt());
    coinMap.put("ACE", getTotalAce());
    coinMap.put("MANTA", getTotalManta());
    coinMap.put("JUP", getTotalJup());
    coinMap.put("STRK", getTotalStrk());
    coinMap.put("C9472", getTotalC9472());

    Map<String, Double> existsCoinMap = new HashMap<>();
    for (String coin : coinMap.keySet()) {

      double coinValue = Double.parseDouble(coinMap.get(coin));

      if (coin.equals("KRW")) {
        existsCoinMap.put(coin, coinValue);
        continue;
      }

      if (coinValue > (double) 30) {
        existsCoinMap.put(coin, coinValue);
      }
    }

    return existsCoinMap;
  }

  public Double getAvailableCoinCount(String coinName) {
    Map<String, String> coinMap = new HashMap<>();
    coinMap.put("P", getAvailableP());
    coinMap.put("BM", getAvailableBm());
    coinMap.put("KRW", getAvailableKrw());
    coinMap.put("BTC", getAvailableBtc());
    coinMap.put("ETH", getAvailableEth());
    coinMap.put("DASH", getAvailableDash());
    coinMap.put("LTC", getAvailableLtc());
    coinMap.put("ETC", getAvailableEtc());
    coinMap.put("XRP", getAvailableXrp());
    coinMap.put("BCH", getAvailableBch());
    coinMap.put("XMR", getAvailableXmr());
    coinMap.put("ZEC", getAvailableZec());
    coinMap.put("QTUM", getAvailableQtum());
    coinMap.put("BTG", getAvailableBtg());
    coinMap.put("EOS", getAvailableEos());
    coinMap.put("ICX", getAvailableIcx());
    coinMap.put("VEN", getAvailableVen());
    coinMap.put("TRX", getAvailableTrx());
    coinMap.put("ELF", getAvailableElf());
    coinMap.put("MITH", getAvailableMith());
    coinMap.put("MCO", getAvailableMco());
    coinMap.put("OMG", getAvailableOmg());
    coinMap.put("KNC", getAvailableKnc());
    coinMap.put("GLM", getAvailableGlm());
    coinMap.put("HSR", getAvailableHsr());
    coinMap.put("ZIL", getAvailableZil());
    coinMap.put("ETHOS", getAvailableEthos());
    coinMap.put("PAY", getAvailablePay());
    coinMap.put("WAXP", getAvailableWaxp());
    coinMap.put("POWR", getAvailablePowr());
    coinMap.put("LRC", getAvailableLrc());
    coinMap.put("GTO", getAvailableGto());
    coinMap.put("PCH", getAvailablePch());
    coinMap.put("EOSDAC", getAvailableEosdac());
    coinMap.put("STEEM", getAvailableSteem());
    coinMap.put("STRAX", getAvailableStrax());
    coinMap.put("AE", getAvailableAe());
    coinMap.put("ZRX", getAvailableZrx());
    coinMap.put("REP", getAvailableRep());
    coinMap.put("XEM", getAvailableXem());
    coinMap.put("SNT", getAvailableSnt());
    coinMap.put("ADA", getAvailableAda());
    coinMap.put("PPT", getAvailablePpt());
    coinMap.put("CTXC", getAvailableCtxc());
    coinMap.put("BAT", getAvailableBat());
    coinMap.put("WTC", getAvailableWtc());
    coinMap.put("CMT", getAvailableCmt());
    coinMap.put("THETA", getAvailableTheta());
    coinMap.put("POLY", getAvailablePoly());
    coinMap.put("LOOM", getAvailableLoom());
    coinMap.put("CVC", getAvailableCvc());
    coinMap.put("MAN", getAvailableMan());
    coinMap.put("WAVES", getAvailableWaves());
    coinMap.put("ITC", getAvailableItc());
    coinMap.put("TRUE", getAvailableTrue());
    coinMap.put("ABT", getAvailableAbt());
    coinMap.put("LINK", getAvailableLink());
    coinMap.put("MEETONE", getAvailableMeetone());
    coinMap.put("HORUS", getAvailableHorus());
    coinMap.put("ADD", getAvailableAdd());
    coinMap.put("SALT", getAvailableSalt());
    coinMap.put("PST", getAvailablePst());
    coinMap.put("BHPC", getAvailableBhpc());
    coinMap.put("RNT", getAvailableRnt());
    coinMap.put("ENJ", getAvailableEnj());
    coinMap.put("PLX", getAvailablePlx());
    coinMap.put("VET", getAvailableVet());
    coinMap.put("MTL", getAvailableMtl());
    coinMap.put("RDN", getAvailableRdn());
    coinMap.put("INS", getAvailableIns());
    coinMap.put("CHL", getAvailableChl());
    coinMap.put("BLACK", getAvailableBlack());
    coinMap.put("ATD", getAvailableAtd());
    coinMap.put("IOST", getAvailableIost());
    coinMap.put("OCN", getAvailableOcn());
    coinMap.put("TMTG", getAvailableTmtg());
    coinMap.put("QKC", getAvailableQkc());
    coinMap.put("BZNT", getAvailableBznt());
    coinMap.put("ARN", getAvailableArn());
    coinMap.put("ATOLO", getAvailableAtolo());
    coinMap.put("NPXS", getAvailableNpxs());
    coinMap.put("LBA", getAvailableLba());
    coinMap.put("WET", getAvailableWet());
    coinMap.put("AMO", getAvailableAmo());
    coinMap.put("BSV", getAvailableBsv());
    coinMap.put("KEOS", getAvailableKeos());
    coinMap.put("ROM", getAvailableRom());
    coinMap.put("BXA", getAvailableBxa());
    coinMap.put("APIS", getAvailableApis());
    coinMap.put("DAC", getAvailableDac());
    coinMap.put("DACC", getAvailableDacc());
    coinMap.put("AUTO", getAvailableAuto());
    coinMap.put("ORBS", getAvailableOrbs());
    coinMap.put("TFUEL", getAvailableTfuel());
    coinMap.put("VALOR", getAvailableValor());
    coinMap.put("CON", getAvailableCon());
    coinMap.put("ANKR", getAvailableAnkr());
    coinMap.put("MIX", getAvailableMix());
    coinMap.put("VTHO", getAvailableVtho());
    coinMap.put("LAMB", getAvailableLamb());
    coinMap.put("CRO", getAvailableCro());
    coinMap.put("FX", getAvailableFx());
    coinMap.put("CHR", getAvailableChr());
    coinMap.put("MBL", getAvailableMbl());
    coinMap.put("MXC", getAvailableMxc());
    coinMap.put("FAB", getAvailableFab());
    coinMap.put("OGO", getAvailableOgo());
    coinMap.put("WIN", getAvailableWin());
    coinMap.put("DVP", getAvailableDvp());
    coinMap.put("FCT2", getAvailableFct2());
    coinMap.put("FNB", getAvailableFnb());
    coinMap.put("FZZ", getAvailableFzz());
    coinMap.put("TRV", getAvailableTrv());
    coinMap.put("PCM", getAvailablePcm());
    coinMap.put("DAD", getAvailableDad());
    coinMap.put("AOA", getAvailableAoa());
    coinMap.put("XSR", getAvailableXsr());
    coinMap.put("WOM", getAvailableWom());
    coinMap.put("SOC", getAvailableSoc());
    coinMap.put("EM", getAvailableEm());
    coinMap.put("QBZ", getAvailableQbz());
    coinMap.put("BOA", getAvailableBoa());
    coinMap.put("WPX", getAvailableWpx());
    coinMap.put("MEV", getAvailableMev());
    coinMap.put("BNP", getAvailableBnp());
    coinMap.put("SXP", getAvailableSxp());
    coinMap.put("COS", getAvailableCos());
    coinMap.put("APIX", getAvailableApix());
    coinMap.put("EL", getAvailableEl());
    coinMap.put("BASIC", getAvailableBasic());
    coinMap.put("HIVE", getAvailableHive());
    coinMap.put("XPR", getAvailableXpr());
    coinMap.put("VRA", getAvailableVra());
    coinMap.put("FIT", getAvailableFit());
    coinMap.put("EGG", getAvailableEgg());
    coinMap.put("BORA", getAvailableBora());
    coinMap.put("ARPA", getAvailableArpa());
    coinMap.put("CTC", getAvailableCtc());
    coinMap.put("APM", getAvailableApm());
    coinMap.put("CKB", getAvailableCkb());
    coinMap.put("AERGO", getAvailableAergo());
    coinMap.put("ANW", getAvailableAnw());
    coinMap.put("CENNZ", getAvailableCennz());
    coinMap.put("EVZ", getAvailableEvz());
    coinMap.put("CYCLUB", getAvailableCyclub());
    coinMap.put("SRM", getAvailableSrm());
    coinMap.put("QTCON", getAvailableQtcon());
    coinMap.put("UNI", getAvailableUni());
    coinMap.put("YFI", getAvailableYfi());
    coinMap.put("UMA", getAvailableUma());
    coinMap.put("AAVE", getAvailableAave());
    coinMap.put("COMP", getAvailableComp());
    coinMap.put("REN", getAvailableRen());
    coinMap.put("BAL", getAvailableBal());
    coinMap.put("RSR", getAvailableRsr());
    coinMap.put("NMR", getAvailableNmr());
    coinMap.put("RLC", getAvailableRlc());
    coinMap.put("UOS", getAvailableUos());
    coinMap.put("SAND", getAvailableSand());
    coinMap.put("CVT", getAvailableCvt());
    coinMap.put("STPT", getAvailableStpt());
    coinMap.put("GOM2", getAvailableGom2());
    coinMap.put("RINGX", getAvailableRingx());
    coinMap.put("BEL", getAvailableBel());
    coinMap.put("DVC", getAvailableDvc());
    coinMap.put("OBSR", getAvailableObsr());
    coinMap.put("ORC", getAvailableOrc());
    coinMap.put("POLA", getAvailablePola());
    coinMap.put("AWO", getAvailableAwo());
    coinMap.put("ADP", getAvailableAdp());
    coinMap.put("DVI", getAvailableDvi());
    coinMap.put("DRM", getAvailableDrm());
    coinMap.put("IBP", getAvailableIbp());
    coinMap.put("GHX", getAvailableGhx());
    coinMap.put("MIR", getAvailableMir());
    coinMap.put("CBK", getAvailableCbk());
    coinMap.put("ONX", getAvailableOnx());
    coinMap.put("MVC", getAvailableMvc());
    coinMap.put("BLY", getAvailableBly());
    coinMap.put("WOZX", getAvailableWozx());
    coinMap.put("ANV", getAvailableAnv());
    coinMap.put("GRT", getAvailableGrt());
    coinMap.put("MM", getAvailableMm());
    coinMap.put("BIOT", getAvailableBiot());
    coinMap.put("XNO", getAvailableXno());
    coinMap.put("SNX", getAvailableSnx());
    coinMap.put("SOFI", getAvailableSofi());
    coinMap.put("GRACY", getAvailableGracy());
    coinMap.put("NU", getAvailableNu());
    coinMap.put("OXT", getAvailableOxt());
    coinMap.put("LINA", getAvailableLina());
    coinMap.put("ASTA", getAvailableAsta());
    coinMap.put("MAP", getAvailableMap());
    coinMap.put("AQT", getAvailableAqt());
    coinMap.put("PLA", getAvailablePla());
    coinMap.put("WIKEN", getAvailableWiken());
    coinMap.put("CTSI", getAvailableCtsi());
    coinMap.put("MANA", getAvailableMana());
    coinMap.put("LPT", getAvailableLpt());
    coinMap.put("MKR", getAvailableMkr());
    coinMap.put("SRT", getAvailableSrt());
    coinMap.put("SUSHI", getAvailableSushi());
    coinMap.put("NSBT", getAvailableNsbt());
    coinMap.put("DON", getAvailableDon());
    coinMap.put("ASM", getAvailableAsm());
    coinMap.put("PUNDIX", getAvailablePundix());
    coinMap.put("CELR", getAvailableCelr());
    coinMap.put("CWD", getAvailableCwd());
    coinMap.put("ARW", getAvailableArw());
    coinMap.put("BETH", getAvailableBeth());
    coinMap.put("BCDC", getAvailableBcdc());
    coinMap.put("FRONT", getAvailableFront());
    coinMap.put("MSB", getAvailableMsb());
    coinMap.put("RLY", getAvailableRly());
    coinMap.put("OCEAN", getAvailableOcean());
    coinMap.put("BFC", getAvailableBfc());
    coinMap.put("ALICE", getAvailableAlice());
    coinMap.put("OGN", getAvailableOgn());
    coinMap.put("COTI", getAvailableCoti());
    coinMap.put("CAKE", getAvailableCake());
    coinMap.put("BNT", getAvailableBnt());
    coinMap.put("XVS", getAvailableXvs());
    coinMap.put("SWAP", getAvailableSwap());
    coinMap.put("CHZ", getAvailableChz());
    coinMap.put("AXS", getAvailableAxs());
    coinMap.put("DAO", getAvailableDao());
    coinMap.put("SIX", getAvailableSix());
    coinMap.put("DAI", getAvailableDai());
    coinMap.put("SHIB", getAvailableShib());
    coinMap.put("MATIC", getAvailableMatic());
    coinMap.put("WOO", getAvailableWoo());
    coinMap.put("ACH", getAvailableAch());
    coinMap.put("BAKE", getAvailableBake());
    coinMap.put("VELO", getAvailableVelo());
    coinMap.put("ANC", getAvailableAnc());
    coinMap.put("HC", getAvailableHc());
    coinMap.put("BCD", getAvailableBcd());
    coinMap.put("XVG", getAvailableXvg());
    coinMap.put("XLM", getAvailableXlm());
    coinMap.put("PIVX", getAvailablePivx());
    coinMap.put("ETZ", getAvailableEtz());
    coinMap.put("GXC", getAvailableGxc());
    coinMap.put("BHP", getAvailableBhp());
    coinMap.put("BTTOLD", getAvailableBttold());
    coinMap.put("HYC", getAvailableHyc());
    coinMap.put("VSYS", getAvailableVsys());
    coinMap.put("IPX", getAvailableIpx());
    coinMap.put("WICC", getAvailableWicc());
    coinMap.put("ONT", getAvailableOnt());
    coinMap.put("LUNC", getAvailableLunc());
    coinMap.put("NEWS2", getAvailableNews2());
    coinMap.put("AION", getAvailableAion());
    coinMap.put("META", getAvailableMeta());
    coinMap.put("KLAY", getAvailableKlay());
    coinMap.put("COSM", getAvailableCosm());
    coinMap.put("ONG", getAvailableOng());
    coinMap.put("ALGO", getAvailableAlgo());
    coinMap.put("JST", getAvailableJst());
    coinMap.put("XTZ", getAvailableXtz());
    coinMap.put("ITG", getAvailableItg());
    coinMap.put("LUK", getAvailableLuk());
    coinMap.put("MLK", getAvailableMlk());
    coinMap.put("WEMIXC", getAvailableWemixc());
    coinMap.put("DOT", getAvailableDot());
    coinMap.put("SUN_OLD", getAvailableSunOld());
    coinMap.put("ATOM", getAvailableAtom());
    coinMap.put("SSX", getAvailableSsx());
    coinMap.put("BCHA", getAvailableBcha());
    coinMap.put("TEMCO", getAvailableTemco());
    coinMap.put("KSP", getAvailableKsp());
    coinMap.put("LZM", getAvailableLzm());
    coinMap.put("HIBS", getAvailableHibs());
    coinMap.put("CPAY", getAvailableCpay());
    coinMap.put("QI", getAvailableQi());
    coinMap.put("BSC_BNB", getAvailableBscBnb());
    coinMap.put("BURGER", getAvailableBurger());
    coinMap.put("DOGE", getAvailableDoge());
    coinMap.put("KSM", getAvailableKsm());
    coinMap.put("CTK", getAvailableCtk());
    coinMap.put("XYM", getAvailableXym());
    coinMap.put("BNB", getAvailableBnb());
    coinMap.put("NFT", getAvailableNft());
    coinMap.put("SUN", getAvailableSun());
    coinMap.put("XEC", getAvailableXec());
    coinMap.put("AGIX", getAvailableAgix());
    coinMap.put("PCI", getAvailablePci());
    coinMap.put("SOL", getAvailableSol());
    coinMap.put("FNSA", getAvailableFnsa());
    coinMap.put("EGLD", getAvailableEgld());
    coinMap.put("GO", getAvailableGo());
    coinMap.put("MASK", getAvailableMask());
    coinMap.put("DFA", getAvailableDfa());
    coinMap.put("C98", getAvailableC98());
    coinMap.put("MED", getAvailableMed());
    coinMap.put("SGB", getAvailableSgb());
    coinMap.put("1INCH", getAvailable1inch());
    coinMap.put("CRV", getAvailableCrv());
    coinMap.put("BOBA", getAvailableBoba());
    coinMap.put("RPG", getAvailableRpg());
    coinMap.put("DYDX", getAvailableDydx());
    coinMap.put("MINA", getAvailableMina());
    coinMap.put("FLOW", getAvailableFlow());
    coinMap.put("JOE", getAvailableJoe());
    coinMap.put("GALA", getAvailableGala());
    coinMap.put("ENS", getAvailableEns());
    coinMap.put("PURSE", getAvailablePurse());
    coinMap.put("BTT", getAvailableBtt());
    coinMap.put("EFI", getAvailableEfi());
    coinMap.put("JASMY", getAvailableJasmy());
    coinMap.put("TITAN", getAvailableTitan());
    coinMap.put("REQ", getAvailableReq());
    coinMap.put("CSPR", getAvailableCspr());
    coinMap.put("SOLO", getAvailableSolo());
    coinMap.put("AVAX", getAvailableAvax());
    coinMap.put("TDROP", getAvailableTdrop());
    coinMap.put("HBAR", getAvailableHbar());
    coinMap.put("FANC", getAvailableFanc());
    coinMap.put("SPRT", getAvailableSprt());
    coinMap.put("NPT", getAvailableNpt());
    coinMap.put("WITCH", getAvailableWitch());
    coinMap.put("REI", getAvailableRei());
    coinMap.put("T", getAvailableT());
    coinMap.put("AQUA", getAvailableAqua());
    coinMap.put("MBX", getAvailableMbx());
    coinMap.put("GMT", getAvailableGmt());
    coinMap.put("TAVA", getAvailableTava());
    coinMap.put("DAR", getAvailableDar());
    coinMap.put("APE", getAvailableApe());
    coinMap.put("WNCG", getAvailableWncg());
    coinMap.put("ALT", getAvailableAlt());
    coinMap.put("XCN", getAvailableXcn());
    coinMap.put("GXA", getAvailableGxa());
    coinMap.put("LUNA2", getAvailableLuna2());
    coinMap.put("TALK", getAvailableTalk());
    coinMap.put("OGV", getAvailableOgv());
    coinMap.put("AZIT", getAvailableAzit());
    coinMap.put("ETHW", getAvailableEthw());
    coinMap.put("ETHF", getAvailableEthf());
    coinMap.put("FLR", getAvailableFlr());
    coinMap.put("ICZ", getAvailableIcz());
    coinMap.put("SFP", getAvailableSfp());
    coinMap.put("FITFI", getAvailableFitfi());
    coinMap.put("STAT", getAvailableStat());
    coinMap.put("CRTS", getAvailableCrts());
    coinMap.put("VIX", getAvailableVix());
    coinMap.put("LBL", getAvailableLbl());
    coinMap.put("FLZ", getAvailableFlz());
    coinMap.put("BERRY", getAvailableBerry());
    coinMap.put("LM", getAvailableLm());
    coinMap.put("GRND", getAvailableGrnd());
    coinMap.put("APT", getAvailableApt());
    coinMap.put("BLUR", getAvailableBlur());
    coinMap.put("WEMIX", getAvailableWemix());
    coinMap.put("NEWS", getAvailableNews());
    coinMap.put("OP_ETH", getAvailableOpEth());
    coinMap.put("DICE", getAvailableDice());
    coinMap.put("OAS", getAvailableOas());
    coinMap.put("HOOK", getAvailableHook());
    coinMap.put("ENTC", getAvailableEntc());
    coinMap.put("ONIT", getAvailableOnit());
    coinMap.put("OP", getAvailableOp());
    coinMap.put("ARB_ETH", getAvailableArbEth());
    coinMap.put("ROA", getAvailableRoa());
    coinMap.put("ORB", getAvailableOrb());
    coinMap.put("EVER", getAvailableEver());
    coinMap.put("GMX", getAvailableGmx());
    coinMap.put("STX", getAvailableStx());
    coinMap.put("XPLA", getAvailableXpla());
    coinMap.put("REAP", getAvailableReap());
    coinMap.put("AHT", getAvailableAht());
    coinMap.put("ARB", getAvailableArb());
    coinMap.put("INJ", getAvailableInj());
    coinMap.put("HFT", getAvailableHft());
    coinMap.put("RPL", getAvailableRpl());
    coinMap.put("GPT", getAvailableGpt());
    coinMap.put("IMX", getAvailableImx());
    coinMap.put("CFX", getAvailableCfx());
    coinMap.put("ACS", getAvailableAcs());
    coinMap.put("FXS", getAvailableFxs());
    coinMap.put("CELO", getAvailableCelo());
    coinMap.put("LDO", getAvailableLdo());
    coinMap.put("FTM", getAvailableFtm());
    coinMap.put("FET", getAvailableFet());
    coinMap.put("SUI", getAvailableSui());
    coinMap.put("KWENTA", getAvailableKwenta());
    coinMap.put("LAZIO", getAvailableLazio());
    coinMap.put("NCT", getAvailableNct());
    coinMap.put("PORTO", getAvailablePorto());
    coinMap.put("XCORE", getAvailableXcore());
    coinMap.put("FLOKI", getAvailableFloki());
    coinMap.put("ALEX", getAvailableAlex());
    coinMap.put("ID", getAvailableId());
    coinMap.put("RNDR", getAvailableRndr());
    coinMap.put("STG", getAvailableStg());
    coinMap.put("SANTOS", getAvailableSantos());
    coinMap.put("OSMO", getAvailableOsmo());
    coinMap.put("GAL", getAvailableGal());
    coinMap.put("ILV", getAvailableIlv());
    coinMap.put("MAV", getAvailableMav());
    coinMap.put("HVH", getAvailableHvh());
    coinMap.put("RSS3", getAvailableRss3());
    coinMap.put("AUDIO", getAvailableAudio());
    coinMap.put("AGI", getAvailableAgi());
    coinMap.put("RDNT", getAvailableRdnt());
    coinMap.put("ASTR", getAvailableAstr());
    coinMap.put("WLD", getAvailableWld());
    coinMap.put("FLUX", getAvailableFlux());
    coinMap.put("RVN", getAvailableRvn());
    coinMap.put("LEVER", getAvailableLever());
    coinMap.put("EDU", getAvailableEdu());
    coinMap.put("SEI", getAvailableSei());
    coinMap.put("WAXL", getAvailableWaxl());
    coinMap.put("MOC", getAvailableMoc());
    coinMap.put("PEPE", getAvailablePepe());
    coinMap.put("CYBER", getAvailableCyber());
    coinMap.put("ARKM", getAvailableArkm());
    coinMap.put("PYR", getAvailablePyr());
    coinMap.put("IOTX", getAvailableIotx());
    coinMap.put("HIGH", getAvailableHigh());
    coinMap.put("PENDLE", getAvailablePendle());
    coinMap.put("STORJ", getAvailableStorj());
    coinMap.put("API3", getAvailableApi3());
    coinMap.put("ZTX", getAvailableZtx());
    coinMap.put("MNT", getAvailableMnt());
    coinMap.put("GTC", getAvailableGtc());
    coinMap.put("TIA", getAvailableTia());
    coinMap.put("ZBC", getAvailableZbc());
    coinMap.put("SPURS", getAvailableSpurs());
    coinMap.put("CHZ_M", getAvailableChzM());
    coinMap.put("NEO", getAvailableNeo());
    coinMap.put("GAS", getAvailableGas());
    coinMap.put("HIFI", getAvailableHifi());
    coinMap.put("BIGTIME", getAvailableBigtime());
    coinMap.put("ARK", getAvailableArk());
    coinMap.put("YGG", getAvailableYgg());
    coinMap.put("KAVA", getAvailableKava());
    coinMap.put("STMX", getAvailableStmx());
    coinMap.put("MAGIC", getAvailableMagic());
    coinMap.put("USDT", getAvailableUsdt());
    coinMap.put("USDC", getAvailableUsdc());
    coinMap.put("RAD", getAvailableRad());
    coinMap.put("LSK", getAvailableLsk());
    coinMap.put("MANTA_ETH", getAvailableMantaEth());
    coinMap.put("TT", getAvailableTt());
    coinMap.put("ACE", getAvailableAce());
    coinMap.put("MANTA", getAvailableManta());
    coinMap.put("JUP", getAvailableJup());
    coinMap.put("STRK", getAvailableStrk());
    coinMap.put("C9472", getAvailableC9472());

    return Double.parseDouble(coinMap.get(coinName));
  }

}
