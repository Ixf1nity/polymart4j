import me.infinity.polymart4j.Polymart4J;
import me.infinity.polymart4j.request.search.SearchRequest;
import me.infinity.polymart4j.responce.search.SearchResponse;

public class Test {

  public static void main(String[] args) {
    Polymart4J polymart4J = new Polymart4J("eyJpZCI6IjMzNyIsInZhbCI6ImNpQUdVdW9OeFFJZnkydW5hM1RhUkIzaVVvLWJjajZKY0JMeSIsInZlcnNpb24iOjF9");
    SearchResponse response = polymart4J.search(SearchRequest.builder().query("GroupStats").build());
    System.out.println(response.toJson());
  }
}
