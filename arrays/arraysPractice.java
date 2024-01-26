package arrays;

public class arraysPractice {

    public static void printArray(int arr[]){
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static int linearSearch(int arr[], int num){
        int index = Integer.MIN_VALUE;
        
        for(int i=0;i<arr.length;i++){
            if (num == arr[i]){
                index = i;
            }
        }

        return index;

    }

    public static int linearSearch(String arr[], String word){
        int index = Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++){
            if (word.equals(arr[i])){
                index = i;
            }

        }
        return index;
    }

    public static int binarySearch(int arr[],int num){
        int mid = 0;
        int start = 0;
        int end = arr.length -1;

        while (start <= end){
            mid = (start+end)/2;

            if (num == arr[mid]){
                return mid;
            }else if (num > arr[mid]){
                start = mid +1;
            }else{
                end = mid -1;
            }
        }
        return -1;
    }

    public static void reverseArray (int arr[]){
        int start = 0;
        int end = arr.length-1;

        while (start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start ++;
            end --;
        }
    }

    public static void printPairs(int arr[]){
        for(int i=0; i<arr.length-1;i++){
            for (int j=i+1;j<arr.length;j++){
                System.out.print("(" + arr[i] + "," + arr[j] + ")");
            }
            System.out.println();
        }
    }
// 1 2 3 4
    public static void printSubArray(int arr[]){
        for (int i=0; i<arr.length;i++){ // i = 1
            for (int k=i;k<arr.length;k++){  // j = 2
                for (int j=i;j<=k;j++){ // 1    12 
                    System.out.print(arr[j]);
                }
                System.out.println();
            }
            //System.out.println();
        }
    }

    public static int subArrayMaxSum(int arr[]){
        int max = Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++){
            for (int j=i;j<arr.length;j++){
                int curr = 0;
                for (int k=i;k<=j;k++){
                    curr = curr + arr[k];
                }
                System.out.println(curr);
                if (max < curr){
                    max = curr;
                }
            }
        }

        return max;
    }

    public static int kadanes(int arr[]){
        int max = Integer.MIN_VALUE;
        int curr = 0;

        for (int i=0;i<arr.length;i++){ //-1
            curr = curr + arr[i]; // -1
            curr = curr < arr[i] ? arr[i] : curr; 
            max = max < curr ? curr : max; 

        }

        return max;
    }


    public static int trappingRainWater(int arr[]){
        int rainwater = 0;
        int n = arr.length;
        int leftmax[] = new int[n];
        int rightmax[] = new int[n];
        leftmax[0] = arr[0];
        for (int i=1;i<n;i++){
            if (arr[i] > leftmax[i-1]){
                leftmax[i] = arr[i];
            }else{
                leftmax[i] = leftmax[i-1];
            }
        }

        rightmax[n-1] = arr[n-1];
        for (int i=n-2;i>=0;i--){
            if (arr[i]>rightmax[i+1]){
                rightmax[i] = arr[i];
            }else{
                rightmax[i] = rightmax[i+1];
            }

        }

        for (int i=0;i<arr.length;i++){
            int waterheight = Math.min(leftmax[i],rightmax[i]);
            rainwater = rainwater + waterheight - arr[i];
        }


        return rainwater;
    }
    public static void main (String[] args){
        int numbers[] = {4,2,0,3,2,5};

        System.out.println(trappingRainWater(numbers));

    }
}
