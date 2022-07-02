// Java Program to Demonstrate Binary Search
// Using Collections.binarySearch()

// Importing required classes
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Main class
// BinarySearchOnACollection
public class GFG9 {

    // Main driver method
    public static void main(String[] args)
    {
        // Creating a List
        // Declaring object of string type
        List<String> items = new ArrayList<>();

        // Adding elements to object
        // using add() method
        items.add("Shoes");
        items.add("Toys");
        items.add("Horse");
        items.add("Ball");
        items.add("Grapes");

        // Sort the List
        Collections.sort(items);

        // BinarySearch on the List
        System.out.println(
                "The index of Horse is "
                        + Collections.binarySearch(items, "Horse"));

        // BinarySearch on the List
        System.out.println(
                "The index of Dog is "
                        + Collections.binarySearch(items, "Dog"));
    }
}
