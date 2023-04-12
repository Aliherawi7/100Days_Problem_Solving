package topGoogleQuestions.number4;

public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        String test = "c";
        // System.out.println(Arrays.toString(test.split("b")));

        System.out.println(getLongestPalindromicSubstring(test));
    }


    public static String getLongestPalindromicSubstring(String str) {
        if (str.length() <= 0) return str;
        String plindtrome = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String[] pl = str.split(ch + "");
            for (int j = 1; j < pl.length - 1; j++) {
                pl[j] = ch + pl[j] + ch;
                if (new StringBuilder(pl[j])
                        .reverse()
                        .toString()
                        .equals(pl[j]) && pl[j].length() >= plindtrome.length()) {
                    plindtrome = pl[j];
                }
            }
        }
        return plindtrome;
    }
}
