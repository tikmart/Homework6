import java.util.Arrays;

public class InsertValue {
    public static void main(String[] args) {
        int[] arr = {7, 68, 53, 45};
        int n = 54; //number to insert
        int p = 2;  //position


        for (int i = 0; i < arr.length; i++) {
            if (i == p){
                arr[i + 1] = arr[i];
                arr[i] = n;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
