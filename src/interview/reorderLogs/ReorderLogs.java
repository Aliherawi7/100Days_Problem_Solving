package interview.reorderLogs;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class ReorderLogs {
    public static void main(String[] args) {
        String[] logs = { "dig1 8 1 5 1", "let1 art can", "dig2 3 6", "let2 own kit dig", "let3 art zero"};
        logsReorder(logs);
        logs = logsReorder(logs);
        for(String str : logs){
            System.out.println(str);
        }
    }

    public static String[] logsReorder(String[] logs){
        Map<String, Integer> stringMap = new HashMap<>();
        Map<String, Integer> numMap = new LinkedHashMap<>();
        String[] reordered = new String[logs.length];

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
        AtomicInteger counter = new AtomicInteger();
        stringMap
                .keySet()
                .stream()
                .sorted()
                .forEach(item -> {
                    reordered[counter.getAndIncrement()] = logs[stringMap.get(item)];
                });
        counter.set(logs.length-numMap.size());
        numMap.keySet().forEach(item -> {
            reordered[counter.getAndIncrement()] = logs[numMap.get(item)];
        });
        return reordered;
    }
}
