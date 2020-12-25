import com.google.common.base.Preconditions;

public class PreconditionSample {
    public static void main(String[] args) {

        try {
            System.out.println(sqrt(-4.0));
        } catch(IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(sum(4, null));
        } catch(NullPointerException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(sum(4, null));
        } catch(NullPointerException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(getValue(6));
        } catch(IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(getValue(-1));
        } catch(IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

    }

    public static double sqrt(double input) throws IllegalArgumentException {
        Preconditions.checkArgument(input > 0.0,
                "Illegal Argument passed: Negative value %s.", input);
        return Math.sqrt(input);
    }

    public static int sum(Integer a, Integer b) {
        a = Preconditions.checkNotNull(a, "Illegal Argument passed: First parameter is Null.");
        b = Preconditions.checkNotNull(b, "Illegal Argument passed: Second parameter is Null.");

        return a+b;
    }

    public static int getValue(int input) {
        int[] data = {1,2,3,4,5};
        Preconditions.checkElementIndex(input, data.length, "Illegal Argument passed: Invalid index.");
        return 0;
    }
}
