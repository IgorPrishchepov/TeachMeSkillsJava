public class BufferAndBuilder {
    public static void main(String[] args) {

        StringBuilder stringBuilder = new StringBuilder("Hello Java");
        //   StringBuffer stringBuffer = new StringBuffer("Android");

        char c = stringBuilder.charAt(0);
        System.out.println(c);
        // stringBuilder.setCharAt(0, 'C');
        System.out.println(stringBuilder);

        char[] buffer = new char[6];
        stringBuilder.getChars(0, 3, buffer, 0);
        String s = null;

        System.out.println(stringBuilder.append(" ").append(1.8));

      /*  System.out.println(stringBuilder.delete(4,6));
        System.out.println(stringBuilder.deleteCharAt(4));*/

        String str1 = stringBuilder.substring(6, 9);
        System.out.println(str1);
        stringBuilder.replace(0, 5, "?").toString();
        System.out.println(stringBuilder);

        System.out.println(stringBuilder.reverse());

        System.out.println(isPalindrome("madame"));
        System.out.println(isPalindromeLoop("madame"));
    }

    static boolean isPalindrome(String candidate) {
        String reversedString = new StringBuilder(candidate).reverse().toString();
        return reversedString.equals(candidate);
    }

    static boolean isPalindromeLoop(String candidate) {
        for (int i = 0; i < candidate.length(); i++ ){
            if (candidate.charAt(i) != candidate.charAt(candidate.length() - 1 - i)){
                return false;
            }
        }
        return true;
    }

}
