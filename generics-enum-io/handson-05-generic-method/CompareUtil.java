public class CompareUtil {
    public static <T extends Comparable<T>> boolean isEqual(T a, T b) {
        return a.compareTo(b) == 0;
    }

    public static void main(String[] args) {
        System.out.println(isEqual(5, 5));             // Integer   -> true
        System.out.println(isEqual("Hello", "World")); // String    -> false
        System.out.println(isEqual(2.5, 2.5));         // Double    -> true
        System.out.println(isEqual(1.1, 2.2));         // Double    -> false
        System.out.println(isEqual('a', 'a'));         // Character -> true
        System.out.println(isEqual('a', 'b'));         // Character -> false
    }
}
