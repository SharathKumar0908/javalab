package first;

/*
1.a Develop a Java program for adding elements [Apple, Banana, Orange] into an ArrayList and a
LinkedList to perform the following operations with different functions directed as follows:
1. Adding elements
2. Adding element at specific index
3. Adding multiple elements
4. Accessing elements
5. Updating elements
6. Removing elements
7. Searching elements
8. List size
9. Iterating over list
10. Using Iterator
11. Sorting
12. Sublist
13. Clearing the list
*/

import java.util.*;

public class _1a {

    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();

        System.out.println("----- ArrayList Operations -----");
        performOperations(arrayList);

        System.out.println("\n----- LinkedList Operations -----");
        performOperations(linkedList);
    }

    public static void performOperations(List<String> list) {

        addElements(list);
        addAtIndex(list);
        addMultiple(list);
        accessElements(list);
        updateElements(list);
        removeElements(list);
        searchElements(list);
        listSize(list);
        iterateList(list);
        useIterator(list);
        sortList(list);
        subListExample(list);
        clearList(list);
    }

    // 1. Adding elements
    public static void addElements(List<String> list) {
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        System.out.println("After adding elements: " + list);
    }

    // 2. Adding element at specific index
    public static void addAtIndex(List<String> list) {
        list.add(1, "Mango");
        System.out.println("After adding at index: " + list);
    }

    // 3. Adding multiple elements
    public static void addMultiple(List<String> list) {
        List<String> more = Arrays.asList("Grapes", "Pineapple");
        list.addAll(more);
        System.out.println("After adding multiple elements: " + list);
    }

    // 4. Accessing elements
    public static void accessElements(List<String> list) {
        System.out.println("Element at index 2: " + list.get(2));
    }

    // 5. Updating elements
    public static void updateElements(List<String> list) {
        list.set(0, "Green Apple");
        System.out.println("After updating: " + list);
    }

    // 6. Removing elements
    public static void removeElements(List<String> list) {
        list.remove("Banana");
        System.out.println("After removing Banana: " + list);
    }

    // 7. Searching elements
    public static void searchElements(List<String> list) {
        System.out.println("Contains Orange? " + list.contains("Orange"));
    }

    // 8. List size
    public static void listSize(List<String> list) {
        System.out.println("List size: " + list.size());
    }

    // 9. Iterating over list
    public static void iterateList(List<String> list) {
        System.out.print("Iterating (for-each): ");
        for (String item : list) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    // 10. Using Iterator
    public static void useIterator(List<String> list) {
        System.out.print("Using Iterator: ");
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();
    }

    // 11. Sorting
    public static void sortList(List<String> list) {
        Collections.sort(list);
        System.out.println("After sorting: " + list);
    }

    // 12. Sublist
    public static void subListExample(List<String> list) {
        List<String> sub = list.subList(0, Math.min(3, list.size()));
        System.out.println("Sublist: " + sub);
    }

    // 13. Clearing the list
    public static void clearList(List<String> list) {
        list.clear();
        System.out.println("After clearing: " + list);
    }
}