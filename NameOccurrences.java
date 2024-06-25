import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
    
        public static void main(String[] args) {
            List<String> names = Arrays.asList( "Rajitha", "gopi", "san", "bhar", "mohi", "chinni", "panu", "puuu", "putty", "kutty" );
    
            Map<String, Integer> nameCounts = new HashMap<>();
    
            // Count occurrences of each name
            for (String name : names) {
                if (nameCounts.containsKey(name)) {
                    nameCounts.put(name, nameCounts.get(name) + 1);
                } else {
                    nameCounts.put(name, 1);
                }
            }
    
            // Print the occurrences
            for (Map.Entry<String, Integer> entry : nameCounts.entrySet()) {
                System.out.println(entry.getKey() + " : " + entry.getValue() + " occurrences");
            }       
        
    

}

    
        