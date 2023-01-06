package masterDSA.strings.number3;

import java.util.ArrayList;

public class AllAnagrams {
    public static void main(String[] args) {
        String p = "ab";
        String s = "abxeba";
        System.out.println(getAllAnagrams(p, s));
    }
    public static ArrayList<Integer> getAllAnagrams(String p , String s){
        ArrayList<Integer> indices = new ArrayList<>();
        String holder = s;
        int index = 0;
        // find all indices that contains string p
        while(index <= s.length()){
            if(holder.contains(p)){
                index = holder.indexOf(p);
                indices.add(index);
                holder = s.substring(index+p.length());
            }else{
                break;
            }
        }
        // find all index that contains the reverse of string p
        holder = s;
        p = new StringBuilder(p).reverse().toString();
        index = 0;
        while(index <= s.length()){
            if(holder.contains(p)){
                index = holder.indexOf(p);
                indices.add(index);
                holder = s.substring(index+p.length());
            }else {
                break;
            }
        }
        return indices;
    }
}
