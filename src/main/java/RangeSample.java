import com.google.common.collect.Range;

import java.time.LocalDate;

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

        //Time range sample
        LocalDate date1 = LocalDate.of(2013, 12, 31);
        LocalDate date2 = LocalDate.of(2014, 1, 10);
        Range<LocalDate> timeRange = Range.closedOpen(date1, date2);
        System.out.println(timeRange);

        System.out.println(timeRange.contains(LocalDate.of(2014, 1, 1))); // true
        System.out.println(timeRange.contains(LocalDate.of(2014, 1, 11)));// false

    }
}
