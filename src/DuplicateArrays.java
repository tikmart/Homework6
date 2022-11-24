public class DuplicateArrays {

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 1, 6, 9, 12, 81};
        int[] arr2 = {2, 15, 14, 4, 12, 8};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr[i] == arr2[j]){
                    System.out.print(arr[i]);
                    System.out.println(" With indexes: " + i + " and " + j);
                }
            }
        }

    }




}
