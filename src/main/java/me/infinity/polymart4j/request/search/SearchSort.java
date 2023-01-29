package me.infinity.polymart4j.request.search;

import com.google.gson.annotations.SerializedName;

public enum SearchSort {

  @SerializedName("updated")
  UPDATED,

  @SerializedName("created")
  CREATED,

  @SerializedName("downloads")
  DOWNLOADS,

  @SerializedName("random")
  RANDOM,

  @SerializedName("relevant")
  RELEVANT

}
