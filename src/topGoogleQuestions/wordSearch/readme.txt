

### 31. Word Search

descriptions:
Given a 2D board and a word, find if the word is exist in the grid.
The word can be constructed from letters of sequentially adjacent cell,
where "adjacent" cells are those horizontally or vertically neighboring.
the same letter cell may not be used more than once.

Example 1 :
board =
[
['A','B','C','E'],
['S','F','C','S'],
['A','D','E','E']
]

Given word = "ABCCD", return true
Given word = "SEE", return true
Given word = "ABCB", return false

Constraints:
board and word consists only of lowercase and uppercase English letters.

1 <= board.length <= 200
1 <= board[i].length <= 200
1 <= word.length <= 10^3