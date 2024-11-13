import java.util.Arrays;

public class test01 {
    public static void main(String[] args) {
        Array array = new Array(3);
        array.print();
        array.insert(10);
        array.insert(20);
        array.insert(30);
        array.insert(40);
        array.insert(50);
        array.removeAt(3);
        array.insert(100);
        array.insert(500);
        System.out.println();
        //array.print();
        System.out.println();
        System.out.println(array.indexOf(100));
        System.out.println(array.max());
        System.out.println();
        /*array.reverse();
        array.print();*/

        array.print();
        System.out.println("\n");
        System.out.println("insert");
        array.insertAt(100,1);
        array.insertAt(100,3);
        array.printf();
    }
}
