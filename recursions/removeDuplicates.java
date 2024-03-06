package recursions;


public class removeDuplicates {
    public static void removedup(String str, StringBuilder sb, int i, boolean arr[]){
        if (i==str.length()){
            System.out.println(sb.toString());
            return;
        }
        char ch = str.charAt(i);
        if (arr[ch-'a'] == false){
            sb.append(ch);
            arr[ch-'a'] = true;
        }
        removedup(str, sb, i+1, arr);

    }
    public static void main(String args[]){
        String str = "prrapsshhassnt";
        StringBuilder sb = new StringBuilder();
        boolean arr[] = new boolean[26];
        removedup(str, sb, 0, arr);

        
    }
    


}
