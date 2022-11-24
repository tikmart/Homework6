public class DuplicateStrings {
    public static void main(String[] args) {
        String[] str = {"byte", "float", "short", "boolean", "long"};
        String[] str2 = {"float", "double", "char", "short", "byte"};

        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < str.length; j++) {
                if (str[i].equals(str2[j])) {
                    System.out.print(str[i]);
                    System.out.println(" With indexes: " + i + " and " + j);
                }
            }
        }
    }
}
