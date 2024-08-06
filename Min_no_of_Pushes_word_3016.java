import java.util.*;

public class Min_no_of_Pushes_word_3016 {
    public static void main(String[] args) {
            String word="aabbccddeeffgghhiiiiii";
                int[] arr = new int[26];
                for(int i=0;i<word.length();i++){
                    arr[word.charAt(i) - 'a']++;
                }
                Arrays.sort(arr);
                int i=25;
                int count = 0;
                int start = 1;
                int ans =0;
                while( i >= 0 && arr[i] != 0){
                    ans+=(start * arr[i]);
                    count++;
                    if(count == 8){
                        start++;
                        count = 0;
                    }
                    i--;
                }
        System.out.println(ans);

    }
}
