public class Main {
    public static void main(String[] args) {
//        Duplicate strings

        String[] arr = {"int", "char", "double", "byte", "char", "int"};

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].equals(arr[j])){
                    System.out.println(arr[i] + ": index " + i);
                }
            }
        }
    }
}