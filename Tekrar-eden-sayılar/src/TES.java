import java.util.Arrays;

public class TES {
    static  boolean isSame(int[]arr,int value){
        for(int i : arr){
            if (i == value){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int [] list = {1,3,5,3,4,2,4,6,4,5,33,3436,2345,112,45,};
        int [] duplicate = new int[list.length];
        int startIndex = 0;
        for (int i = 0;i < list.length;i++){
            for (int j = 0;j < list.length;j++){
                if (i != j && (list[i] == list[j]) ){
                    if (!isSame(duplicate,list[i]) && list[j] % 2 == 0) {
                        duplicate[startIndex++] = list[i];
                    }
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(duplicate));
    }
}
