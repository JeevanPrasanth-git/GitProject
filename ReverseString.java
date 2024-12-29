public class ReverseString {
    public static void main(String[] args) {
        String value = "Welcome";
        String rev = "";

        char[] ch = value.toCharArray();
        int len = ch.length;

        for (int i = len - 1; i >= 0; i--) {
            rev = rev + ch[i];
        }
        System.out.println("Reverse String Char Array is -----> " + rev);

    }
}