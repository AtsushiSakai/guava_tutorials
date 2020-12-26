import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.Multiset;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class MultiMapSample {
    public static void main(String[] args) {

        Multimap<String,String> multimap = ArrayListMultimap.create();

        multimap.put("lower", "a");
        multimap.put("lower", "b");
        multimap.put("lower", "c");

        multimap.put("upper", "A");
        multimap.put("upper", "B");
        System.out.println(multimap);// {lower=[a, b, c, d, e], upper=[A, B, C, D]}

        // すべて置き換え
        multimap.replaceValues("upper", Arrays.asList("C", "D", "E") );
        System.out.println(multimap);// {lower=[a, b, c], upper=[C, D, E]}

        // ある要素を削除
        multimap.remove("upper", "C");
        System.out.println(multimap);// {lower=[a, b, c], upper=[D, E]}

        // あるキーのリストを取得(参照を返すので注意)
        List<String> lowerList = (List<String>) multimap.get("lower");
        System.out.println(lowerList);// [a, b, c]
        lowerList.add("d");
        System.out.println(lowerList);// [a, b, c, d]
        System.out.println(multimap);// {lower=[a, b, c, d], upper=[D, E]}

        // キーを取得 (Multisetとして、重複した値が返ってくる)
        Multiset<String> keys = multimap.keys();
        System.out.println(keys); // [lower x 4, upper x 2]

        // 全要素に個別にアクセス
        for (Map.Entry<String, String> entry : multimap.entries()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
//            lower -> a
//            lower -> b
//            lower -> c
//            lower -> d
//            upper -> D
//            upper -> E
        }

        //ある特定のValueが存在するか？
        System.out.println(multimap.containsValue("D"));// true

        //ある特定のKeyとValueが存在するか？
        System.out.println(multimap.containsEntry("upper", "A"));// false

    }
}
