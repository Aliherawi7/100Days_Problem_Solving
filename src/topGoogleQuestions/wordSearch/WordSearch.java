package topGoogleQuestions.wordSearch;

public class WordSearch {
    public static void main(String[] args) {
        char[][] board = {
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}
        };
        StringBuilder str = new StringBuilder(322);

        System.out.println(wordSearchInMatrix(board,"ABCB"));
    }

    public static boolean wordSearchInMatrix(char[][] board, String word) {
        int lastRowIndex = 0;
        int lastColIndex = 0;
        StringBuilder holder = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            char currentChar = word.charAt(i);
            for (int a = lastRowIndex; a < board.length; a++) {
                boolean isFind = false;
                for (int j = lastColIndex; j < board[a].length; j++) {
                    if (board[a][j] == currentChar) {
                        System.out.println("i " + a + " j "+j + " char : "+ currentChar);
                        holder.append(currentChar);
                        lastColIndex = j;
                        lastRowIndex = a;
                        isFind = true;
                        break;
                    }
                }
                if (isFind)
                    break;
            }
        }

        return holder.toString().equals(word);
    }
}
