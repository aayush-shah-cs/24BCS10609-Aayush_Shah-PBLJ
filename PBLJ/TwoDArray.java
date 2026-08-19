import java.util.ArrayList;
import java.util.LinkedList;

public class TwoDArray {

    public static void main(String[] args) {
        
        ArrayList<ArrayList<Integer>> inventory = new ArrayList<>();
        
        ArrayList<Integer> section0 = new ArrayList<>();
        section0.add(10);
        section0.add(3);
        section0.add(7);

        ArrayList<Integer> section1 = new ArrayList<>();
        section1.add(1);
        section1.add(15);
        section1.add(2);

        ArrayList<Integer> section2 = new ArrayList<>();
        section2.add(4);
        section2.add(5);
        section2.add(0);

        inventory.add(section0);
        inventory.add(section1);
        inventory.add(section2);

        LinkedList<Integer> reorderList = new LinkedList<>();

        for (ArrayList<Integer> section : inventory) {
            for (int stock : section) {
                if (stock < 5) {
                    reorderList.add(stock * 2);
                }
            }
        }
        System.out.println("Warehouse Inventory:");

        for (int i = 0; i < inventory.size(); i++) {
            System.out.println("Section " + i + ": " + inventory.get(i));
        }
 
        System.out.println("\nTarget Reorder Quantities:");
        System.out.println(reorderList);
    }
}