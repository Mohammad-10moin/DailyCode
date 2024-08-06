import java.util.*;

public class Min_no_of_Pushes_word_3016 {
    public static void main(String[] args) {
        String word="aabbccddeeffgghhiiiiii";
                char[] ch= word.toCharArray();
                Map<Character,Integer> map=new HashMap<>();
                for (int i=0;i<ch.length ;i++ ){
                    map.put(ch[i], map.getOrDefault(ch[i],0)+1);
                }

                int []counts=new int[map.size()];
                int index = 0;
                for (Map.Entry<Character, Integer> me : map.entrySet()) {
                    counts[index++] = me.getValue();
                }
                Arrays.sort(counts);


                int sum=0,count=0;
                for(int i=0;i<counts.length;i++){
                    if(i%8==0){
                        count++;
                    }
                    sum=sum+count*counts[counts.length-i-1];
                }
        System.out.println(sum);
    }
}
