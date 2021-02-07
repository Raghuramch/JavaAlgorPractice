import java.util.Set;
import java.util.HashSet; 

public class SubArrayZero{
    public static boolean methodSub(int[]a){
        Set<Integer> set = new HashSet<>();

        set.add(0);
        int sum = 0;
        for(int value: a){
            sum = sum + value;
            if (set.contains(sum)){
                return true;
            }else{
                set.add(sum);
            }
        }
        return false;
    }


    public static void main(String[]args){
        int[] a = {1,2,3,4,5,6,7,8};
        if(methodSub(a)){
            System.out.println("A sub array exists in the given array");
        }
        else{
            System.out.println("A sub array does not exists in the given array");
        }

    }
}