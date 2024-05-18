package Chuong4;
import java.util.LinkedList;

public class slide38{
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("Cho");
        list.add("Ga");
        list.add("Lon");
        System.out.println("Initial LinkedList: " + list);

        list.addFirst("Bo");
        list.addLast("Ca");
        System.out.println("After adding first and last: " + list);

        System.out.println("First element: " + list.getFirst());
        System.out.println("Last element: " + list.getLast());
        System.out.println("Element at index 2: " + list.get(2));

        list.removeFirst();
        list.removeLast();
        System.out.println("After removing first and last: " + list);

        list.remove(1);
        System.out.println("After removing element at index 1: " + list);

        System.out.println("Size of LinkedList: " + list.size());

        boolean containsCherry = list.contains("Cherry");
        System.out.println("Does the list contain 'Cherry'? " + containsCherry);

        list.clear();
        System.out.println("LinkedList after clear: " + list);
    }
}
