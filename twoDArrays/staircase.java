package twoDArrays;

public class staircase {

    public static boolean staircaseSearch(int arr[][], int key){
        int r = 0,c=arr[0].length-1;

        while (r<arr.length && c>=0){
            if (key == arr[r][c]){
                System.out.println(r+" "+c);
                return true;
            }else if(key > arr[r][c]){
                r++;
            }else if(key < arr[r][c]){
                c--;
            }
        }

        return false;


    }
    public static void main(String args[]){
        int [][] arr = {{10,20,30,40},
                        {13,24,36,44},
                        {17,27,38,48},
                        {19,29,39,50}};
        System.out.println(staircaseSearch(arr, 39));
    }
}