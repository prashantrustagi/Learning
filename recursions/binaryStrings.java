package recursions;

public class binaryStrings {

    public static void printBinaryStrings(String sb, int i, int lastdigit){
        if (i==0){
            System.out.println(sb.toString());
            return;
        }

        if (lastdigit == 0){
            printBinaryStrings(sb+"1", i-1, 1);
        }
        printBinaryStrings(sb+"0", i-1, 0);


    }
    public static void main(String args[]){
        String sb = new String();
        printBinaryStrings(sb, 5, 0);

    }    
}
