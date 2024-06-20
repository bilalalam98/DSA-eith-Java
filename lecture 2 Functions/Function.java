import java.util.*;
public class Function {

    public static void ownPrint(int sum) {
     System.out.println(sum);
    }

    public static void calculteSum(int num1, int num2){
    int sum = num1 + num2;
    System.out.println("Sum is :" + sum);
    ownPrint(sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        calculteSum(a, b);
    }
//    output:
//     3
//     5
//     Sum is :8
//     8
}