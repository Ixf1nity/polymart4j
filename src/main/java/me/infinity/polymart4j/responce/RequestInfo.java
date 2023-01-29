package me.infinity.polymart4j.responce;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RequestInfo {

  private int time;
  private Actions action;
  private int cacheMaxAge;
  private String timeElapsed;

}
