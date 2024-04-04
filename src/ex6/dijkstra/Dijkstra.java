package ex6.dijkstra;

import java.util.*;

class City {
    String name;
    List<Neighbor> neighbors;

    public City(String name) {
        this.name = name;
        this.neighbors = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                '}';
    }
}

class Neighbor {
    City city;
    int distance;

    public Neighbor(City city, int distance) {
        this.city = city;
        this.distance = distance;
    }
}

public class Dijkstra {
    public static List<String> findShortestRoad(City start, City end) {
        System.out.println("Start city: " + start.name + " end city: " + end.name);
        Map<City, Integer> distances = new HashMap<>();
        Map<City, City> previousCities = new HashMap<>();
        PriorityQueue<City> unvisitedCities = new PriorityQueue<>(Comparator.comparingInt(distances::get));

        distances.put(start, 0);
        unvisitedCities.offer(start);

        while (!unvisitedCities.isEmpty()) {
            System.out.println(unvisitedCities);
            City current = unvisitedCities.poll();
            if (current == end) {
                return getPath(current, previousCities);
            }

            for (Neighbor neighbor : current.neighbors) {
                City nextCity = neighbor.city;
                int newDistance = distances.get(current) + neighbor.distance;

                if (newDistance < distances.getOrDefault(nextCity, Integer.MAX_VALUE)) {
                    distances.put(nextCity, newDistance);
                    previousCities.put(nextCity, current);
                    unvisitedCities.offer(nextCity);
                    System.out.println(nextCity.name + " -> " + newDistance);
                }
            }
        }

        return Collections.emptyList(); // No path found
    }

    public static List<String> getPath(City end, Map<City, City> previousCities) {
        List<String> path = new ArrayList<>();
        City current = end;
        while (current != null) {
            path.add(current.name);
            current = previousCities.get(current);
        }
        Collections.reverse(path);
        return path;
    }

    public static void main(String[] args) {
        // Example usage:
        City a = new City("0");
        City b = new City("1");
        City c = new City("2");
        City d = new City("3");
        City e = new City("4");
        City f = new City("5");
        City g = new City("6");

        a.neighbors.add(new Neighbor(b, 2));
        a.neighbors.add(new Neighbor(c, 6));
        b.neighbors.add(new Neighbor(d, 5));
        b.neighbors.add(new Neighbor(a, 2));
        c.neighbors.add(new Neighbor(d, 8));
        d.neighbors.add(new Neighbor(e, 5));
        d.neighbors.add(new Neighbor(f, 10));
        f.neighbors.add(new Neighbor(e, 6));
        f.neighbors.add(new Neighbor(g, 2));
        g.neighbors.add(new Neighbor(f, 6));

        List<String> shortestPath = findShortestRoad(a, f);
        System.out.println("Shortest path from A to C: " + shortestPath);
    }
}