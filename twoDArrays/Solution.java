package twoDArrays;
class Solution {
    public static int compress(char[] chars) {
        char arr[] = new char[256];
        StringBuilder str = new StringBuilder();
        for (int i=0; i<chars.length; i++){
            arr[chars[i]-'0'] ++;
        }

        for (int i=0; i<arr.length; i++){
            if (arr[i]==1){
                str.append((char)i);
            }
            else if(arr[i]>1){
                str.append((char)i);
                str.append(arr[i]);
            }
        }

        return str.length();
    }

    public static void main(String args[]){
        char[] ab = {'a','a','b','b','c','c','c'};
        System.out.println(compress(ab));
    }
}