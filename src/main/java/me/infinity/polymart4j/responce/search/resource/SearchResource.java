package me.infinity.polymart4j.responce.search.resource;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import me.infinity.polymart4j.responce.search.resource.owner.SearchResourceOwner;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SearchResource {

  private String id;
  private String url;
  private SearchResourceOwner owner;
  private long price;
  private String currency;
  private String title;
  private String subtitle;
  private String version;
  private long creationTime;
  private long lastUpdateTime;
  private String supportedServerSoftware;
  private String supportedLanguages;
  private String supportedMinecraftVersions;
  private String donationLink;
  private String thumbnailURL;
  private String headerURL;
  private boolean canDownload;

}

