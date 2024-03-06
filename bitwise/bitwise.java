package bitwise;

public class bitwise{
    public static void isOdd(int bit){
        int res = bit & 1;
        if(res==1){
            System.out.println("Bit is odd");
        }
        else{
            System.out.println("Bit is even");
        }
    }

    public static int getIthBit(int bit, int i){
        int bitmask = 1 << i;
        int result = bit & bitmask;
        if(result == 0){
            return 0;
        }
        else{
            return 1;
        }
    }

    public static void setbit(int bit, int i){
        int bitmask = 1 << i;
        int result = bit | bitmask;

        System.out.println(result);
    }
    public static void main (String args[]){
        int bit = 5;
        //setbit(bit, 3);
        //System.out.println(getIthBit(bit, 3));
        System.out.println( 13 & (~(1<<3)));
    }
}
