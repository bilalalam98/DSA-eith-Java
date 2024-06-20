import java.util.Scanner;

public class Calculations {
    public static int binomialCoficient(int n, int r){
       //formula //nCr= n!/r!(n-r)!
        int nFac = factorial(n);
        int rFac = factorial(r);
        int nrFact = factorial(n-r);
        int binomialCof = nFac/(rFac*nrFact);
        return binomialCof;
    }
    public static int factorial(int a){
        int fact = a;
        //5x4x3x2x1
        for(int i=fact-1; i>0; i--){
            fact = fact * i;
        }
        return fact;
    }
    public static int product(int a, int b){
        int c = a*b;
        return c;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Before swap: a = " + a + ", b = " + b);
        int multipliedValue = product(a, b);
        System.out.println("multipliedValue" + multipliedValue);
        int fact = factorial(a);
        System.out.println("first value factorial" + fact);
        int binomialCoficient = binomialCoficient(a, b);
        System.out.println("binomialCoficient if a= n and b=r:  " + binomialCoficient);

    }
}
