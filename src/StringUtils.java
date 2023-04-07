public class StringUtils {

    public static int eChecker(String s1, String s2){
        if(s1.contains("e") && !s2.contains("e")) return -1;
        if(s2.contains("e") && !s1.contains("e")) return 1;
        return 0;
    }

    public static String betterString(String s1, String s2, TwoStringPredicate pred){
        return pred.test(s1,s2) ? s1 : s2;
    }

    public static <T> T betterEntry(T t1, T t2, TwoElementPredicate<T> pred){
        return pred.test(t1,t2) ? t1 : t2;
    }


}
