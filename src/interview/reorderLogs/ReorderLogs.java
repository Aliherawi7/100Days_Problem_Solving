package interview.reorderLogs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class ReorderLogs {
    public static void main(String[] args) {
        String[] logs = { "dig1 8 1 5 1", "let1 art can", "dig2 3 6", "let2 own kit dig", "let3 art zero"};
        logsReorder(logs);
        logs = logsReorder(logs);
        System.out.println(Arrays.toString(logs));
    }

    public static String[] logsReorder(String[] logs){
        Map<String, Integer> stringMap = new HashMap<>();
        Map<String, Integer> numMap = new LinkedHashMap<>();
        String[] reordered = new String[logs.length];


        /*
        * iterate over the logs array and each iteration
        * we split the current element with " " space and then
        * concatenate them together from index 1 in a string var called holder
        * then if the holder contains string we added the indentifier at the end
        * of holder var and then put it in the stringMap as key and corresponding i index as
        * value. the same story also if holder contains integer but we add it in the
        * numMap
        * */
        for(int i = 0; i < logs.length; i++){
            String[] str = logs[i].split(" ");
            StringBuilder holder = new StringBuilder();
            for(int j = 1; j < str.length; j++){
                holder.append(str[j]);
            }
            holder.append(str[0]);
            try{
                Integer.parseInt(str[1]);
                numMap.put(holder.toString(), i);
            }catch (Exception ex){
                stringMap.put(holder.toString(), i);
            }
        }

        /*
        * in here now we get the stringMap all keys and then sort them
        * and then for each one of the keys we get the value and because the value
        * is the log index in the original logs array so we add the logs from
        * logs array into the reordered array with regards of their order in the
        * stringMap
        * */
        AtomicInteger counter = new AtomicInteger();
        stringMap
                .keySet()
                .stream()
                .sorted()
                .forEach(item -> {
                    reordered[counter.getAndIncrement()] = logs[stringMap.get(item)];
                });
        /*
        * in here we set the atomic integer to the
        * */
        counter.set(logs.length-numMap.size());
        numMap.keySet().forEach(item -> {
            reordered[counter.getAndIncrement()] = logs[numMap.get(item)];
        });
        return reordered;
    }
}
