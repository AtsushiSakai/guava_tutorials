import com.google.common.collect.Range;

public class RangeSample {
    public static void main(String[] args) {
        // Int range
        Range<Integer> range1 = Range.closed(1, 4);
        System.out.println(range1.contains(1));//true

        // Double range
        Range<Double> range2 = Range.closed(1.0, 4.0);
        System.out.println(range2.contains(3.0));//true
        System.out.println(range2.contains(-1.0));//false

        // gap range
        System.out.println(range2.gap(Range.closed(-1.0, 0.0))); // (0.0..1.0)

    }
}
