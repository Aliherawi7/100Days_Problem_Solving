package topGoogleQuestions.number4;

public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        String test = "abb";
        // System.out.println(Arrays.toString(test.split("b")));

        System.out.println(getLongestPalindromicSubstring(test));
        int max = (int) (Math.pow(2, 31)-1);
        int min = (int) (Math.pow(-2, 31));

    }


    public static String getLongestPalindromicSubstring(String str) {
        if (new StringBuilder(str).reverse().toString().equals(str)) return str;
        if (str.length() <= 1) return str;
        if (str.length() == 2) return str.charAt(0) + "";

        String plindtrome = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            for (int j = i + 1; j <= str.lastIndexOf(ch); j++) {
                if (str.charAt(j) == ch) {
                    String sub = str.substring(i, j + 1);
                    System.out.println(sub);
                    if (new StringBuilder(sub).reverse().toString().equals(sub) && sub.length() >= plindtrome.length()) {
                        plindtrome = sub;
                    }
                }
            }

        }
        return plindtrome.isEmpty() ? str.charAt(0) + "" : plindtrome;
    }
}
