import java.util.*;

class CollectionsDemo {
    public static void main(String args[]) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Ravi");
        list.add("Sai");
        list.add("Ravi");
        System.out.println("ArrayList: " + list);
        HashSet<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Apple");
        System.out.println("HashSet: " + set);
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "cheekar");
        map.put(2, "Sai");
        map.put(3, "Purna");
        System.out.println("HashMap: " + map);
        System.out.println("Value for key 2: " + map.get(2));
    }
}
