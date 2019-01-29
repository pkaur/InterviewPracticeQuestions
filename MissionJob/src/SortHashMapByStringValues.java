import java.util.*;

public class SortHashMapByStringValues {

    // 2*O(nlogn) + O(n^2) == O(n^2)
    public static LinkedHashMap<Integer, String> sortHashMapByValues(HashMap<Integer, String> passedMap) {
        List<Integer> mapKeys = new ArrayList<>(passedMap.keySet());
        List<String> mapValues = new ArrayList<>(passedMap.values());
        Collections.sort(mapValues); //(nlogn)
        Collections.sort(mapKeys); // (nlogn)

        LinkedHashMap<Integer, String> sortedMap = new LinkedHashMap<>();

        Iterator<String> valueIt = mapValues.iterator();

        while (valueIt.hasNext()) { //O(n)
            String val = valueIt.next();
            Iterator<Integer> keyIt = mapKeys.iterator();

            while (keyIt.hasNext()) { //(O(n)
                Integer key = keyIt.next();
                String comp1 = passedMap.get(key);
                String comp2 = val;

                if (comp1.equals(comp2)) {
                    keyIt.remove();
                    sortedMap.put(key, val);
                    break;
                }
            }
        }
        return sortedMap;
    }

    public static void main(String[] args){
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"froyo");
        map.put(2,"abby");
        map.put(3,"denver");
        map.put(4,"frost");
        map.put(5,"daisy");

        System.out.println(sortHashMapByValues(sortHashMapByValues(map)));
    }
}
