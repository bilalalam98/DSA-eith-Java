public class Pattern {
    public static void main(String args[]){
    //QWuestion 1
    //     int n = 8;
    //    for(int i=0; i<=n; i++){
    //      for(int j=i; j<=n; j++){
    //         System.out.print("*");
    //      }
    //      System.out.println();
    //    }
    //    // Output:
    //   // *****
    //   // ****
    //   // ***
    //   // **
    //   // *

    //Question 2
    // *
    // **
    // ***
    // ****
    int n = 8;
    for(int i=0; i<=n; i++){
      for(int j=0; j<=i; j++){
         System.out.print("*");
      }
      System.out.println();
    }
    }
}