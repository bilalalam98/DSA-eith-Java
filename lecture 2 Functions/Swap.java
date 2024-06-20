import java.util.Scanner;

public class Swap {
    public static void swap(int a, int b){
        int c = a;
        a=b;
        b=c;
        System.out.println("after swap: a = " + a + ", b = " + b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Before swap: a = " + a + ", b = " + b);
        swap(a, b);
        System.out.println("after swap in main function no changes wwill be observed: a = " + a + ", b = " + b);

    }
}
