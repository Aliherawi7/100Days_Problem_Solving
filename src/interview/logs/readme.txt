

###  logs

descriptions:
You are given an array of logs. each log is a space-delimited string of words where the
first word is the identifier.
there are wo types of logs:
1: Letter-logs: All words (except the identifier) consist of lowercase English words
2: Digit-logs: All words (except the identifier) consist of digits

Recorder these logs so that:
1. The letter-logs come before all digit-logs.
2. the letter-logs are sorted lexicographically by their contents . if their contents are
the same then sort them lexicographically by their identifiers.
3. The digit-logs maintain their relative ordering
return the final order of logs

Ex 1:
input:
logs: [ "dig1 8 1 5 1", "let1 art can, "dig2 3 6", "let2 own kit dig", "let3 art zero"]

output: ["let1 rt can", "let3 art zero", "let2 own kit dig", "dig1 8 1 5 1", "dig2 3 6" ]
