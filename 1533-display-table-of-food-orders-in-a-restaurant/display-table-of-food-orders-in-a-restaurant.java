
import java.util.*;

class Solution {
    public List<List<String>> displayTable(List<List<String>> orders) {

        TreeSet<String> food = new TreeSet<>();
        TreeMap<Integer, Map<String, Integer>> map = new TreeMap<>();

        // Store food names and count orders
        for (List<String> order : orders) {

            int table = Integer.parseInt(order.get(1));
            String item = order.get(2);

            food.add(item);

            map.putIfAbsent(table, new HashMap<>());

            Map<String, Integer> temp = map.get(table);

            temp.put(item, temp.getOrDefault(item, 0) + 1);
        }

        List<List<String>> ans = new ArrayList<>();

        // Create header
        List<String> header = new ArrayList<>();
        header.add("Table");

        for (String item : food) {
            header.add(item);
        }

        ans.add(header);

        // Create table rows
        for (int table : map.keySet()) {

            List<String> row = new ArrayList<>();
            row.add(String.valueOf(table));

            Map<String, Integer> temp = map.get(table);

            for (String item : food) {
                row.add(String.valueOf(temp.getOrDefault(item, 0)));
            }

            ans.add(row);
        }

        return ans;
    }
}
