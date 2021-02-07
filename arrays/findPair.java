
class findPair{

    public static void Pair(int[]a, int sum){
        for(int i = 0; i<a.length-1; i++){
            for(int j = i + 1; j<a.length; j++){
                if(a[i]+a[j] == sum){
                    System.out.println("The pair of integers found in the "+i+ " and "+j);
                }
            }
        }
    }
    public static void main(String[]args){
        int[] array = {4,3,5,6,7,8,9};
        int sum = 11;
        
        Pair(array, sum);
    }
}