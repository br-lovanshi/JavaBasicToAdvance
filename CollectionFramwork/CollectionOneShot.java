import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.TreeSet;

public class CollectionOneShot {
    public static void main(String[] args) {
        CollectionOneShot cf = new CollectionOneShot();
        // cf.collectionInterface();
        cf.listInterface();

    }


    public void collectionInterface(){
        Collection<String> collection1 = new ArrayList<>();
        boolean added = collection1.add("10");
        boolean isEmpty = collection1.isEmpty();
        int size = collection1.size();
        boolean contains = collection1.contains(20);
        boolean remove = collection1.remove(20);
        System.out.println(collection1);
        // Collection<Integer> collection2 = new HashSet();
        // Collection<Integer> collection3 = new LinkedList<>();
        // Collection<Integer> collection4 = new TreeSet<>();
    }

    public void listInterface(){
        List<Integer> arrayList = new ArrayList<>();
        Stack stack = new Stack<>();
        List<Integer> LinkedList = new LinkedList<>();
        
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(40);
        int value1 = arrayList.get(1);
        arrayList.add(1, 2323);
        System.out.println(arrayList.remove(1));
        System.out.println(arrayList);
    }
}
