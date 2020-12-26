import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;

public class MultiSet {
    public static void main(String[] args) {
        Multiset<String> multiset = HashMultiset.create();
        multiset.add("a");
        multiset.add("b");
        multiset.add("b");
        multiset.add("x");

        System.out.println(multiset); // [a, b x 2, x]
        System.out.println(multiset.count("b")); // 2
        System.out.println(multiset.size());// 4
        System.out.println(multiset.elementSet()); // [a, b, x]
        multiset.remove("b",2);
        System.out.println(multiset); // [a, x]

    }
}
