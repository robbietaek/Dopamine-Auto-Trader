package com.dopamine.api_call.model.response.statistics.fear_greed;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serial;
import java.io.Serializable;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@EqualsAndHashCode
@JsonIgnoreProperties(ignoreUnknown = true)
public class Today implements Serializable {

  @Serial
  private static final long serialVersionUID = -6136998278365288865L;

  private String date;

  private Double score;

  private Double diff;

  @JsonProperty("cls_prc_ubmi")
  private Double clsPrcUbmi;

  @JsonProperty("diff_ubmi")
  private Double diffUbmi;

  @JsonProperty("cls_prc_ubai")
  private Double clsPrcUbai;

  @JsonProperty("diff_ubai")
  private Double diffUbai;

  private String stage;

  @JsonProperty("stage_en")
  private String stageEn;

  private String comment;

}
