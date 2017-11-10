/**
 * @author bvanchuhov
 */
public class StringExample {

    public static void main(String[] args) {
        String s = "Java is a general-purpose computer programming language that is concurrent, class-based, object-oriented,[15] and specifically designed to have as few implementation dependencies as possible. It is intended to let application developers \"write once, run anywhere\" (WORA),[16] meaning that compiled Java code can run on all platforms that support Java without the need for recompilation.[17] Java applications are typically compiled to bytecode that can run on any Java virtual machine (JVM) regardless of computer architecture.";

        int length = s.length();
        System.out.println("length = " + length); // 4

        char c = s.charAt(2);
        System.out.println("c = " + c);

        char lastChar = s.charAt(s.length()-1);
        System.out.println("lastChar = " + lastChar);

        int indexOfLanguage = s.indexOf("language");
        System.out.println("indexOfLanguage = " + indexOfLanguage);

        int lastIndexOfLanguage = s.lastIndexOf("Java");
        System.out.println("lastIndexOfLanguage = " + lastIndexOfLanguage);

        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        System.out.println(s.startsWith("Java"));
        System.out.println(s.startsWith("Kotlin"));
        System.out.println(s.equals("Java"));

        String reversedString = new StringBuilder(s).reverse().toString();
        System.out.println("reversedString = " + reversedString);
    }
}
