package collection;
import java.util.LinkedList;
import java.util.List;

public class Linked_list2 {
    public static List<Integer> findCommonElements(List<Integer> listOne, List<Integer> listTwo) {
        List<Integer> commonElements = new LinkedList<Integer>();

        for (Integer element : listOne) {
            if (listTwo.contains(element)) {
                commonElements.add(element);
            }
        }

        return commonElements;
    }

    public static void main(String args[]) {

        List<Integer> listOne = new LinkedList<Integer>();
        listOne.add(10);
        listOne.add(12);
        listOne.add(21);
        listOne.add(1);
        listOne.add(53);

        List<Integer> listTwo = new LinkedList<Integer>();
        listTwo.add(11);
        listTwo.add(21);
        listTwo.add(25);
        listTwo.add(53);
        listTwo.add(47);

        List<Integer> commonElements = findCommonElements(listOne, listTwo);

        System.out.println("The common elements between the two lists are:");
        for (Integer element : commonElements) {
            System.out.println(element);
        }
    }

}

