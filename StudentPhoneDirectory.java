import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class StudentPhoneDirectory {
    public static void main(String[] args) {
        Map<String, String> nameToPhone = new HashMap<>();
        Map<String, String> phoneToName = new HashMap<>();
        String filePath = "contacts.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split("\t");
                if (parts.length >= 2) {
                    String name = parts[0].trim();
                    String phone = parts[1].trim();
                    nameToPhone.put(name, phone);
                    phoneToName.put(phone, name);
                }
            }
            System.out.println("Directory loaded successfully from " + filePath + "\n");
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
            return;
        }
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Name or Phone Number to search: ");
        String query = scanner.nextLine().trim();
        if (nameToPhone.containsKey(query)) {
            System.out.println("Result Phone Number for " + query + ": " + nameToPhone.get(query));
        } else if (phoneToName.containsKey(query)) {
            System.out.println("Result  Name for " + query + ": " + phoneToName.get(query));
        }else {
            System.out.println("Result No matching record found for: " + query);
        }
    }
}