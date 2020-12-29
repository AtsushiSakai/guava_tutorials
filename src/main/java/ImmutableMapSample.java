import com.google.common.collect.ImmutableMap;

import java.util.Map;

public class ImmutableMapSample {
    public static void main(String[] args) {
        Map<Integer, String> immutableMap = ImmutableMap.of(1, "1", 2, "2", 3, "3");
        System.out.println(immutableMap);// {1=1, 2=2, 3=3}

        try {
            immutableMap.put(4, "4");//追加不可
        } catch (UnsupportedOperationException e) {
            System.out.println(e);
        }
        try {
            immutableMap.replace(1, "2");//変更不可
        } catch (UnsupportedOperationException e) {
            System.out.println(e);
        }
        try {
            immutableMap.remove(1);//削除不可
        } catch (UnsupportedOperationException e) {
            System.out.println(e);
        }

        // 取得
        System.out.println(immutableMap.get(1));// 1

        //Chain methodによる初期化
        ImmutableMap<String, Integer> immutableMap2 = new ImmutableMap.Builder<String, Integer>()
                .put("four", 4)
                .put("eight", 8)
                .put("fifteen", 15)
                .put("sixteen", 16)
                .put("twenty-three", 23)
                .put("forty-two", 42)
                .build();
        System.out.println(immutableMap2);//{four=4, eight=8, fifteen=15, sixteen=16, twenty-three=23, forty-two=42}

    }
}
