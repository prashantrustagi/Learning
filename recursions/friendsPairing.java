package recursions;

public class friendsPairing {
    public static int findPairing(int n){
        if (n==1||n==2){
            return n;
        }
        int single = findPairing(n-1);
        int pairs = (n-1) * findPairing(n-2);

        return single+pairs;
    }
    public static void main(String args[]){
        System.out.println(findPairing(3));
    }
    
}
