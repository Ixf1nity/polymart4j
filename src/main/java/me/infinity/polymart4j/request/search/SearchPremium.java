package me.infinity.polymart4j.request.search;

import com.google.gson.annotations.SerializedName;

public enum SearchPremium {

  @SerializedName("0")
  ONLY_FREE,

  @SerializedName("1")
  ONLY_PREMIUM,

  @SerializedName("2")
  UNRESTRICTED

}
