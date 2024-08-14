package ListInterface;

import java.util.ArrayList;
import java.util.List;

public class ArrayListClass {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        // Add elements to the list
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        System.out.println("List: " + numbers);

        numbers.set(1, 5);
        System.out.println("Modified List:" + numbers);

       // Access element from the list
        int number = numbers.get(2);
        System.out.println("Accessed Element: " + number);


        // Remove element from the list
        int removedNumber = numbers.remove(1);
        System.out.println("Removed Element: " + removedNumber);


        //Iterate element from the List
        for(int eachNumber: numbers){
            System.out.print("Iterate From List: " + eachNumber);
            System.out.println(", ");
        }


        ArrayList<String> languages = new ArrayList<>();

        // add elements in the ArrayList
        languages.add("Java");
        languages.add("Python");
        languages.add("Kotlin");
        System.out.println("ArrayList: " + languages);

        String str = languages.toString();
        System.out.println("String: " + str);


        numbers.clear();
        System.out.println("Clear: " +numbers);

    }
    
}
