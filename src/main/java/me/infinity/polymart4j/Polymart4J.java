package me.infinity.polymart4j;

import com.google.gson.Gson;
import lombok.SneakyThrows;
import me.infinity.polymart4j.request.search.SearchRequest;
import me.infinity.polymart4j.responce.search.SearchResponse;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;

public class Polymart4J {

  public static final Gson GSON = new Gson();
  public static final String URL = "https://api.polymart.org/";

  public static final String SEARCH_SUFFIX = "v1/search";

  private final String API_KEY;

  private final MediaType JSON = MediaType.get("application/json; charset=utf-8");
  private final OkHttpClient client;

  public Polymart4J(String API_KEY) {
    this.API_KEY = API_KEY;
    this.client = new OkHttpClient();
  }

  @SneakyThrows
  public SearchResponse search(SearchRequest searchRequest) {
    String json = GSON.toJson(searchRequest);
    RequestBody requestBody = RequestBody.create(json, JSON);
    Request request = new Request.Builder()
        .url(URL + SEARCH_SUFFIX)
        .post(requestBody)
        .build();
    String responseJson = this.client.newCall(request).execute().body().string();
    return GSON.fromJson(responseJson, SearchResponse.class);
  }

}
