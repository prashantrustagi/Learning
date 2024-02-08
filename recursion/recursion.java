package recursion;

public class recursion {
    public static void printDec(int n){
        
        System.out.print(n + " ");
        if (n==1){
            return;
        }
        else{
            printDec(n-1);
        }
        
    }

    public static void printInc(int n){
        if (n==1){
            System.out.print(n + " ");
            return;
        }
        else{
            printInc(n-1);
            
        }
        System.out.print(n + " ");
        
    }

    public static int factorial(int n){
        int fact = 0;
        if (n!=0){
            fact = (n * factorial(n-1));
        }
        else{
            fact = 1 ;
        }
        return fact;
    }

    public static int nFibonnaci(int n){
        int fib = 0;

        if (n==0){
            fib = 0;
        }else if(n==1){
            fib = 1;
        }
        else{
            fib = nFibonnaci(n-1) + nFibonnaci(n-2);
        } 
        return fib;
    }
    public static void main(String args[]){
        int n = 4;
        System.out.println(nFibonnaci(n));

    }
}
