import java.util.*;

/**
 * Created by priyankananna on 5/6/19.
 */
public class AirportDFS {

    Map<String, PriorityQueue<String>> targets = new HashMap<>();
    List<String> route = new LinkedList();

    public List<String> findItinerary(String[][] tickets) {
        for (String[] ticket : tickets)
            targets.computeIfAbsent(ticket[0], k -> new PriorityQueue()).add(ticket[1]);
        visit("JFK");
        return route;
    }

    void visit(String airport) {
        while(targets.containsKey(airport) && !targets.get(airport).isEmpty())
            visit(targets.get(airport).poll());
        route.add(0, airport);
    }
    public static void main(String args[]){
        AirportDFS airport = new AirportDFS();
        String[][] arr = { {"JFK","SFO"}, {"JFK","ATL"},{"SFO","ATL"},{"ATL","JFK"},{"ATL","SFO"}};

        List<String> res = airport.findItinerary(arr);
         res.forEach(System.out::println);
    }
}
