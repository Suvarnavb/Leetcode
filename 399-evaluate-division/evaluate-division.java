import java.util.*;

class Solution {

    public double[] calcEquation(
        List<List<String>> equations,
        double[] values,
        List<List<String>> queries) {

        Map<String, Map<String, Double>> graph = new HashMap<>();

        // Build the graph
        for (int i = 0; i < equations.size(); i++) {

            String a = equations.get(i).get(0);
            String b = equations.get(i).get(1);

            double value = values[i];

            graph.putIfAbsent(a, new HashMap<>());
            graph.putIfAbsent(b, new HashMap<>());

            graph.get(a).put(b, value);
            graph.get(b).put(a, 1.0 / value);
        }

        double[] result = new double[queries.size()];

        // Process each query
        for (int i = 0; i < queries.size(); i++) {

            String start = queries.get(i).get(0);
            String end = queries.get(i).get(1);

            if (!graph.containsKey(start) ||
                !graph.containsKey(end)) {

                result[i] = -1.0;
            } 
            else {
                Set<String> visited = new HashSet<>();

                result[i] = dfs(graph, start, end, visited);
            }
        }

        return result;
    }

    double dfs(
        Map<String, Map<String, Double>> graph,
        String start,
        String end,
        Set<String> visited) {

        if (start.equals(end)) {
            return 1.0;
        }

        visited.add(start);

        for (String neighbour : graph.get(start).keySet()) {

            if (!visited.contains(neighbour)) {

                double value = dfs(
                    graph, neighbour, end, visited);

                if (value != -1.0) {
                    return graph.get(start).get(neighbour) * value;
                }
            }
        }

        return -1.0;
    }
}