package HomeWork_11.CustomArrayList;
import java.util.Arrays;


public class MyMain {
    public static void main(String[] args) {

            CustomArrayList<String> list = new CustomArrayList<>();
            list.add("Maksim");
            list.add("Aleakseichyk");
            System.out.println(list.get(0));
            System.out.println(list.contains("World"));
            System.out.println(list.contains("Aleakseichyk"));
            list.remove(1);
            System.out.println(list.get(0));
            list.clear();
            System.out.println(list.size());
    }

    }



