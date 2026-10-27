import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;

public class CollectionsDemonstration {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Apple");
        System.out.println("ArrayList elements: " + fruits);
        System.out.println("Element at index 1: " + fruits.get(1));
        fruits.remove("Apple");
        System.out.println("ArrayList after removing 'Apple': " + fruits);
        System.out.println();
        HashSet<String> uniqueLanguages = new HashSet<>();
        uniqueLanguages.add("Java");
        uniqueLanguages.add("Python");
        uniqueLanguages.add("C++");
        uniqueLanguages.add("Java");
        System.out.println("HashSet elements (Unordered & Unique): " + uniqueLanguages);
        System.out.println("Contains 'Python'?: " + uniqueLanguages.contains("Python"));
        uniqueLanguages.remove("C++");
        System.out.println("HashSet after removing 'C++': " + uniqueLanguages);
        System.out.println();
        HashMap<Integer, String> employeeMap = new HashMap<>();
        employeeMap.put(101, "Alice");
        employeeMap.put(102, "Bob");
        employeeMap.put(103, "Charlie");
        System.out.println("HashMap: " + employeeMap);
        System.out.println("Employee with ID 102: " + employeeMap.get(102));
        System.out.println("Contains Key 104?: " + employeeMap.containsKey(104));
        System.out.println("Contains Value 'Alice'?: " + employeeMap.containsValue("Alice"));
        employeeMap.remove(101);
        System.out.println("HashMap after removing ID 101: " + employeeMap);
    }
}