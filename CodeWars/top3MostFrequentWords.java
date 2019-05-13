public static List<String> top3(String s) {
    String A = stringCleaner(s);
    String[] arr = A.split(" ");
    
    HashMap<String, Integer> map = new HashMap<>();
    List<String> keys = new ArrayList<>();

    for(int i = 0; i < arr.length; i++){
        if(map.containsKey(arr[i]))
            map.put(arr[i], map.get(arr[i]) + 1);
        else
            map.put(arr[i], 1);
    }

    int maxLoop = numberUnique(arr);
    if(maxLoop > 3)
        maxLoop = 3;
        
    int counter = 0;
    while(counter < maxLoop){
        int max = Collections.max(map.values());
        String delete = "";
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue()==max) {
                keys.add(entry.getKey());
                delete = entry.getKey();
            }
        }
        map.remove(delete);
        counter++;
    }
    keys.remove(" ");
    return keys;
}

public static String stringCleaner(String s){
    String A = s.replaceAll("[,./]", "").toLowerCase();
    A = A.replaceAll("  ", " ");
    A = A.trim();
    return A;
}

public static int numberUnique(String[] arr){
    HashSet<String> set = new HashSet<>();
    Collections.addAll(set, arr);
    return set.size();
}
