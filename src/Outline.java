import java.util.Arrays;
import java.util.Collections;

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




    public static void main(String[] args) {
        Q1_1();
        Q1_2();
        Q1_3();
        Q1_4();
        Q2();
    }




}
