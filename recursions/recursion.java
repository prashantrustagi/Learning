package recursions;
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

    public static boolean isSorted(int arr[], int i){
        if (i == arr.length-1){
            return true;
        }
        if (arr[i]>arr[i+1]){
            return false;
        }

        return isSorted(arr,i+1);
    }

    public static int firstOccurance(int arr[], int i, int n){
        if (i==arr.length){
            return -1;
        }
        if (arr[i] == n){
            return i;
        }
        return firstOccurance(arr, i+1, n);
    }

    public static int lastOccurance(int arr[], int n, int i){
        if (i==arr.length){
            return -1;
        }
        int isFound = lastOccurance(arr, n, i+1);
        if (isFound == -1 && arr[i] == n){
            return i;
        }else{
            return isFound;
        }
    }

    public static int printPower(int x, int n){
        if (n == 0){
            return 1;
        }
        int power = x * printPower(x, n-1);

        return power;

    }

    public static int printPowerOp(int x, int n){
        if (n<=0){
            return 1;
        }
        int power = 0;
        if (n%2==0){
            power = printPower(x, n/2) * printPower(x, n/2);
        }else{
            power  = printPower(x, 1) * printPower(x, (n-1)/2) * printPower(x, (n-1)/2) ;
        }

        return power;
    }

    public static int tiling_problem(int n){
        if (n==0 || n==1){
            return 1;
        }
        //vertical placing
        int v = tiling_problem(n-1);
        int h = tiling_problem(n-2);

        return v+h;
    }
    public static void main(String args[]){
        System.out.println(tiling_problem(3));

    }
}
