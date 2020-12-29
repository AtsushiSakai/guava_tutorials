import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;

import java.util.Collection;
import java.util.List;

public class ImmutableListSample {
    public static void main(String[] args) {
        List<String> alist = ImmutableList.of("one", "two");

        try {
            alist.add("Three");//追加不可
        } catch (UnsupportedOperationException e) {
            System.out.println(e);
        }

        try {
            alist.set(0, "Three");//変更不可
        } catch (UnsupportedOperationException e) {
            System.out.println(e);
        }

        try {
            alist.remove(0);//削除不可
        } catch (UnsupportedOperationException e) {
            System.out.println(e);
        }

        // 取得
        System.out.println(alist.get(1));// two

        //　通常のリストからImmutableListへの変換
        Collection<Integer> list = Lists.newArrayList(1, 2, 3);
        Collection<Integer> immutableList = ImmutableList.copyOf(list);
        System.out.println(immutableList);//[1, 2, 3]
    }
}
