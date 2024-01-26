import java.util.Scanner;

public class firstProgram {
    public static void main (String[] args){
        System.out.println("Enter the number of lines: ");
        Scanner sc =  new Scanner(System.in);
        int lines = 6;

        for (int i=0; i<lines; i++){
            if ((i == 0) || (i == lines-1)){
                for(int j=0; j<=lines;j++){
                    System.out.print("*");
                }
            }
            else {
                for (int j=0; j<=lines; j++){
                    if ((j == 0) || (j == lines)){
                        System.out.print("*");
                    }
                    else {
                        System.out.print(" ");
                    }
                }
                    
            }

            System.out.println();
            
        }

    } 
}


//3! = 3-0 * 3-1 * 3-2 * 3-3 