/**
 * @author bvanchuhov
 */
public class CharExample {

    public static void main(String[] args) {
        char c1 = 'a';
        char c2 = '\n';
        char c3 = '\u2764';

        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);
        System.out.println("c3 = " + c3);

        // "D:\\"
        System.out.println("\"D:\\\\\"");

        System.out.println("\uD83D\uDC8B");
        System.out.println("\uD83D\uDE0B");

        System.out.println("\uF8FF");
        System.out.println("⛄");
    }
}
