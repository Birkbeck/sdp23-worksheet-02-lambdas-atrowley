import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;

public class Outline {
  public static void main(String... args) { // varargs alternative to String[]
    Integer[] intArray = {1,7,3,4,8,2};
    System.out.println(Arrays.asList(intArray));
    // Arrays.sort(intArray,.......)
    q1_1();
    q1_2();
    q1_3();
    q1_4();
    q2_1();
    q3_1();
    q4_1();
  }

  public static String[] getWords() {
    return new String[] {
            "fly",
            "ants",
            "bats",
            "piglets",
            "gorillas",
            "cat",
            "hamster",
            "emus",
            "tiger" };
  }

  public static void q1_1(){
    String[] words = getWords();
    Arrays.sort(words, (a,b) -> Integer.compare(a.length(), b.length()));
    System.out.println(Arrays.asList(words));
  }

  public static void q1_2(){
    String[] words = getWords();
    Arrays.sort(words, (a,b) -> Integer.compare(b.length(), a.length()));
    System.out.println(Arrays.asList(words));
  }

  public static void q1_3(){
    String[] words = getWords();
    Arrays.sort(words, (a,b) -> Character.compare(a.charAt(0), b.charAt(0)));
    System.out.println(Arrays.asList(words));

  }

  public static void q1_4(){
    String[] words = getWords();
    Arrays.sort(words, (a,b) -> {
      if(a.contains("e") && !b.contains("e")) return -1;
      if(b.contains("e") && !a.contains("e")) return 1;
      return 0;
    });
    System.out.println(Arrays.asList(words));

  }

  public static void q2_1(){
    String[] words = getWords();
    Arrays.sort(words, StringUtils::eChecker);
    System.out.println(Arrays.asList(words));

  }

  public static void q3_1(){
    System.out.println(StringUtils.betterString("Adam","Yog", (s1, s2) -> s1.length() > s2.length() ));
  }

  public static void q4_1(){
    System.out.println(StringUtils.betterEntry("Adam","Yog", (s1, s2) -> s1.length() > s2.length() ));
  }





}
