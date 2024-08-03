import java.util.Arrays;

public class Make_two_arrays_equal_1460 {
    public static void main(String[] args) {
        int []target={1,2,3,4};
        int [] arr={4,2,3,1};
//        Arrays.sort(target);
//        Arrays.sort(arr);
//        System.out.println(Arrays.equals(target,arr));
//        This is my solution using Array functions
        if(target.length!=arr.length){
            System.out.println("false");
            return;
        }
        int []map=new int[1001];
        for(int i=0;i<target.length;i++){
            map[target[i]]++;
            map[arr[i]]--;
        }
        for(int i=0;i<target.length;i++){
            if(map[target[i]]!=0 || map[arr[i]]!=0){
                System.out.println("false");
                return;
            }
        }
        System.out.println("true");
        return;
    }
}
