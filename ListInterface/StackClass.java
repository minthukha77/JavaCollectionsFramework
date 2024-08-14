package ListInterface;

import java.util.Stack;

public class StackClass {
    public static void main(String[] args) {
        Stack<String> animals= new Stack<>();

        // Add elements to Stack
        animals.push("Dog");
        animals.push("Horse");
        animals.push("Cat");

        System.out.println("Stack: " + animals);


        // Remove element stacks
        String element = animals.pop();
        System.out.println("Removed Element: " + element);


        // Access element from the top
        String element2 = animals.peek();
        System.out.println("Element at top: " + element2);


        // Search an element
        int position = animals.search("Horse");
        System.out.println("Position of Horse: " + position);

        

    }
    
}
