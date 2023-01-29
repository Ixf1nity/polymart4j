package me.infinity.polymart4j.request.search;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SearchRequest {

  private String query;

  @Builder.Default
  private SearchSort sort = SearchSort.UPDATED;

  @Builder.Default
  private SearchPremium premium = SearchPremium.UNRESTRICTED;

  private String referrer;

  @Builder.Default
  private int start = 0;

  @Builder.Default
  private int limit = 25;

  private String token;

}
