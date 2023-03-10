import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Outline {


  public static String[] getAnimals () {
      String[] animals = {"Dog","Cat","Bird","Frog","Crocodile","Billy goat gruff"};
      return animals;
  }


    public static void Q1_1() {
        String[] animals = getAnimals();
        Arrays.sort(animals, (String a, String b) -> Integer.compare(a.length(), b.length()));
        System.out.println(Arrays.asList(animals));
    }

    public static void Q1_2() {
        String[] animals = getAnimals();
        Arrays.sort(animals, (String a, String b) -> Integer.compare(b.length(), a.length()));
        System.out.println(Arrays.asList(animals));
    }

    public static void Q1_3() {
        String[] animals = getAnimals();
        Arrays.sort(animals, (String a, String b) -> Character.compare(a.charAt(0), b.charAt(0)));
        System.out.println(Arrays.asList(animals));
    }

    public static void Q1_4() {
        String[] animals = getAnimals();
        Arrays.sort(animals, (String a, String b) -> {
            if (a.contains("e") && !b.contains("e")) {
                return -1;
            } else if (!a.contains("e") && b.contains("e")){
                return 1;
            } else {
                return 0;
            }
        });
        System.out.println(Arrays.asList(animals));
    }

    public static void Q2() {
        String[] animals = getAnimals();
        Arrays.sort(animals, StringUtils::echecker);
        System.out.println(Arrays.asList(animals));
    }


    public static void Q3() {
        String s1 = "Adam";
        String s2 = "Bob";
        System.out.println(StringUtils.betterString(s1,s2,(a,b) -> a.length() < b.length() ));

    }

    public static void Q4() {
        String s1 = "Adam";
        String s2 = "Bob";
        System.out.println(StringUtils.betterElement(s1,s2,(a,b) -> a.length() < b.length() ));

        Integer n1 = 50;
        Integer n2 = 100;
        System.out.println(StringUtils.betterElement(n1,n2,(a,b) -> a > b));
    }

    public static void Q5() {
        List<String> animals = List.of(getAnimals());
        List<String> shortWords = StringUtils.allMatches(animals, s -> s.length() < 4);
        System.out.println(shortWords.toString());

        List<String> wordsWithB = StringUtils.allMatches(animals, s -> s.contains("Billy"));
        System.out.println(wordsWithB.toString());
    }

    public static void main(String[] args) {
        Q1_1();
        Q1_2();
        Q1_3();
        Q1_4();
        Q2();
        Q3();
        Q4();
        Q5();
    }




}
