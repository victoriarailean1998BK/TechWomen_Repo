import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class Ex5 {
    public static void main(String [] args){
        List<Integer> list=new ArrayList<>();
        List<Integer> list1=new ArrayList<>();
        List<Integer> list2=new ArrayList<>();

        list.add(1); list.add(1); list.add(2); list.add(3); list.add(4); list.add(1); list.add(2); list.add(3);
        list1.add(7); list1.add(5); list1.add(3); list1.add(1);
        list2.add(1); list2.add(1); list2.add(1); list2.add(1);

        System.out.println("First list: " + list);
        System.out.println(removeDuplicates(list));

        System.out.println("Second list: " +list1);
        System.out.println(removeDuplicates(list1));

        System.out.println("List:" + list2);
        System.out.println(removeDuplicates(list2));
    }

    public static List<Integer> removeDuplicates(List<Integer> list){
        LinkedHashSet<Integer> hashSet = new LinkedHashSet<>(list);

        ArrayList<Integer> listWithoutDuplicates = new ArrayList<>(hashSet);

        return listWithoutDuplicates;
    }
}
