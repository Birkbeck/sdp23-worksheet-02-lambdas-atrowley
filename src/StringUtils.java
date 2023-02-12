import java.util.function.BinaryOperator;

public class StringUtils {

    public static int echecker(String s1, String s2) {
        if (s1.contains("e") && !s2.contains("e")) return -1;
        if (!s1.contains("e") && s2.contains("e")) return 1;
        return 0;
    }

    public static String betterString(String s1, String s2, TwoStringPredicate func) {
       if(func.check(s1,s2)) return s1;
       return s2;
    }

    public static <T> T betterElement(T t1, T t2, TwoElementPredicate<T> func) {
        if(func.check(t1,t2)) return t1;
        return t2;
    }
}