// Day 3 of 100 - question 2
//https://neetcode.io/problems/string-encode-and-decode
//Design an algorithm to encode a list of strings to a single string. The encoded string is then decoded back to the original list of strings.
//Please implement encode and decode
import java.util.*;

public class StringEncodeandDecode {
    public static String encode(List<String> input){
        String res = new String();
        for(String s : input){
            res += String.valueOf(s.length())+"#"+s;
        }
        return res;
    }
    public static List<String> decode(String input){
        List<String> ans = new ArrayList<>();
        int i=0;
        while(i<input.length()){
            int j=i;
            while(input.charAt(j)!='#'){
                j++;
            }
            int length = Integer.valueOf(input.substring(i,j));
            i=j+1+length;
            ans.add(input.substring(j+1,i));
        }
        return ans;
    }
    public static void main(String[] args) {
        List<String> input = new ArrayList<>();

        input.add("neet");
        input.add("code");
        input.add("love");
        input.add("you");
        List<String> output = StringEncodeandDecode.decode(encode(input));
        System.out.println(output);



    }
}
