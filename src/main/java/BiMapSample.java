import com.google.common.collect.HashBiMap;
import com.google.common.collect.BiMap;

public class BiMapSample {
    public static void main(String[] args) {

        BiMap<Integer, String> bimap = HashBiMap.create();

        bimap.put(1, "A");
        bimap.put(2, "B");
        bimap.put(3, "C");

        System.out.println(bimap);// {1=A, 2=B, 3=C}

        //通常検索
        System.out.println(bimap.get(2));// B

        //逆検索
        System.out.println(bimap.inverse().get("B"));// 2

    }
}
