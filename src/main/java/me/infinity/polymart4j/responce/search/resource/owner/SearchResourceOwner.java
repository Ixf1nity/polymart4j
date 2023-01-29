package me.infinity.polymart4j.responce.search.resource.owner;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SearchResourceOwner {

  private SearchResourceOwnerType type;
  private String id;
  private String name;
  private String url;

}
