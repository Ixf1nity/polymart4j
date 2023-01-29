package me.infinity.polymart4j.responce.search;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import me.infinity.polymart4j.Polymart4J;
import me.infinity.polymart4j.responce.RequestInfo;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SearchResponse {

  private RequestInfo request;
  private SearchResult response;

  public String toJson() {
    return Polymart4J.GSON.toJson(this);
  }

}
