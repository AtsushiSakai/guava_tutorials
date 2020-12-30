import com.google.common.primitives.UnsignedInteger;

public class UnsignedSample {

    public static void main(String[] args) {
        int a = 0;
        a-=1;
        System.out.println(a);// -1

        UnsignedInteger ua = UnsignedInteger.valueOf(1);
        ua = ua.minus(UnsignedInteger.valueOf(1));
        System.out.println(ua);// 0
        ua = ua.minus(UnsignedInteger.valueOf(1));
        System.out.println(ua);// 4294967295 (underflow)

        a = Integer.MAX_VALUE;
        System.out.println(a);// 2147483647
        a+=1;
        System.out.println(a);//-2147483648 (overflow)

    }
}
