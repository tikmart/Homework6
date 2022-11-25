import java.util.Arrays;

public class EvenOddForeach {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 1, 6, 9, 12, 81};
        int evenCount = 0;
        for(int n : arr){
            if (n % 2 == 0){
                evenCount++;
            }
        }

        int[] evenArr = new int[evenCount];
        int[] oddArr = new int[arr.length - evenCount];

        int i = 0; //index for even
        int k = 0; //index for odd
        for (int n : arr) {
            if (n % 2 == 0) {
                evenArr[i++] = n;
            } else{
                oddArr[k++] = n;
            }
        }
        System.out.println(Arrays.toString(evenArr));
        System.out.println(Arrays.toString(oddArr));

    }
}
