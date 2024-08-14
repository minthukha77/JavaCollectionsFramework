package ListInterface;

import java.util.LinkedList;

public class LinkedInListClass {

    public static void main(String[] args) {
        // create linkedlist
    LinkedList<String> animals = new LinkedList<>();

    // Add elements to LinkedList
    animals.add("Dog");
    animals.add("Cat");
    animals.add("Cow");
    System.out.println("LinkedList: " + animals);

    animals.add(1,"Horse");
    System.out.println("Updated LinkedList: " + animals);
    System.out.println();

     // access the element from the linked list
     String str = animals.get(1);
     System.out.print("Element at index 1: " + str);
     System.out.println();


     //change Elements
     animals.set(0,  "Cow");
     System.out.println("Updated LinkedList: " + animals);


    

    }


   

    

    
}
