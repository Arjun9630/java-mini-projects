import java.util.Scanner;
public class PandC{
    public static float combination(int n, int r){  // calculate combination
        int fact_n = fact(n);
        int fact_d = fact(n-r);
        int fact_r = fact(r);
        float ans = fact_n / (fact_d * fact_r);
        return ans;
    }

    public static float permutation(int n, int r){    // calculate permutation
        int fact_n = fact(n);
        int fact_d = fact(n-r);
        float ans = fact_n / fact_d;
        return ans;
    }

    public static int fact(int k){  //calculates factorial of a number
        int f = 1;
        for(int i = 1; i<=k; i++){
            f = f*i;
        }
        return f;
    }

    public static void main(String args[]){ //main method
        Scanner in = new Scanner(System.in);
        int n, r;
        float ncr, npr;
        System.out.println("Permutation and Combination Calculator =");
        System.out.println();
        System.out.println("1. Permutation\n2. Combination");
        int choice;
        System.out.print("Enter your choice: ");  //user's choice
        choice = in.nextInt();
        System.out.println();

        switch(choice){
            case 1 : System.out.print("Enter the value of n = "); //inputs
                     n = in.nextInt();
                     System.out.print("Enter the value of r = ");
                     r = in.nextInt();
                     //Condition
                     if(r<=n){
                        ncr = combination(n,r);
                        }
                        else{
                           System.out.println("Value of r should be less than or equal to the value of n!");
                           break;
                        }
                     npr = permutation(n,r);
                     System.out.println("Permutation = " + npr);
                     break;

            case 2 : System.out.print("Enter the value of n = "); //inputs
                     n = in.nextInt();
                     System.out.print("Enter the value of r = ");
                     r = in.nextInt();
                     //condition
                     if(r<=n){
                     ncr = combination(n,r);
                     }
                     else{
                        System.out.println("Value of r should be less than or equal to the value of n!");
                        break;
                     }
                     System.out.println("Combination = " + ncr);
                     break;

            default : System.out.println("Invalid choice!");
        }
        in.close();
    }
}