import java.util.*;

public class Kth_Distinct_String_Array_2053 {
    public static void main(String[] args) {
        String [] arr={"d","b","c","b","c","a"};
        int k=2;
        int count=0;
        Map<String,Integer> map= new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        for(int j=0;j<arr.length;j++){
            if(map.get(arr[j])==1){
                count++;
            }if(count==k){
                System.out.println(arr[j]);
            }
            if(count!=k && j==arr.length-1){
                System.out.println("\"\"");
            }
        }
    }
}
