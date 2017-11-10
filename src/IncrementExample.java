/**
 * @author bvanchuhov
 */
public class IncrementExample {

    public static void main(String[] args) {
        int x = 10;

        System.out.println(x++); // 10
        System.out.println(x); // 11
        System.out.println();

        System.out.println(x);
        x++;

        int y = 10;

        System.out.println(++y); // 11
        System.out.println(y); // 11

        int z = 10;
        z = z + 20;
        z += 20;

    }
}
