package me.infinity.polymart4j.responce.search;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import me.infinity.polymart4j.responce.search.resource.SearchResource;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SearchResult {

  private boolean success;
  private int result_count;
  private boolean more;
  private int next_start;
  private int total;
  private int remaining;
  private List<SearchResource> result;

}
