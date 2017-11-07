/**
 * @author bvanchuhov
 */
public class TypeCasting {

    public static void main(String[] args) {
        int x = 200;
        long l = x;
        byte b = (byte) x; // BAD CODE

        System.out.println("x = " + x);
        System.out.println("l = " + l);
        System.out.println("b = " + b);
    }
}
