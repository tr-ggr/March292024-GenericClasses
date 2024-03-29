import Arithmetic.Arithmetic;
import Map.MyMap;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
//        Arithmetic<Double, Integer> haha = new Arithmetic<>(50.100, 100);
//        System.out.println(haha.add());
//        System.out.println(haha.subtract());
//        System.out.println(haha.multiply());
//        System.out.println(haha.divide());
//        System.out.println(haha.getMin());
//        System.out.println(haha.getMax());

        MyMap<String, Integer> mp = new MyMap<>();
        mp.put("Ungart", 100);
        mp.put("HAHA!", 500);
        System.out.println(mp.get("HAHA!"));
        System.out.println("Remove: " + mp.remove("HAHA!"));
        mp.put("HAHA!", 100312);
        System.out.println("Retry: " + mp.get("HAHA!"));

    }
}