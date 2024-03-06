package divideConquer;

public class mergeSort {

    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
    }

    public static void mergeSortFun(int arr[], int si, int ei){
        if (si>=ei){
            return;
        }
        int mid = si + (ei-si)/2;

        mergeSortFun(arr, si, mid);
        mergeSortFun(arr, mid+1, ei);
        merge(arr,si,mid,ei);
        
    }
    
        public static void merge(int arr[], int si, int mid, int ei){
            int temp[] = new int[ei-si+1];
            int i = si;
            int j = mid+1;
            int k = 0;

            while(i<=mid && j<=ei){
                if(arr[i] < arr[j]){
                    temp[k] = arr[i];
                    i++;
                }else{
                    temp[k] = arr[j];
                    j++;
                }
                k++;
            }

            while(i<=mid){
                temp[k] = arr[i];
                k++;
                i++;
            }
            while(j<=ei){
                temp[k] = arr[j];
                k++;
                j++;
            }

            for(k=0,i=si; k<temp.length;i++,k++){
                arr[i] = temp[k];
            }
            

        }
    public static void main(String args[]){
        int arr[] = {4,7,2,1};
        mergeSortFun(arr, 0,arr.length-1);
        printArray(arr);
    }
}
