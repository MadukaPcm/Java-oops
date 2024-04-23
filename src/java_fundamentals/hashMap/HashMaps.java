package java_fundamentals.hashMap;
import java.util.HashMap;

public class HashMaps {

    public static void main(String[] args){
        HashMap<String, String> mapList = new HashMap<String, String>();

        mapList.put("Noma","Noma");
        mapList.put("Mambo","Mambo");
        System.out.println(mapList.size());

        for (String ml : mapList.keySet()){
            System.out.println(ml);
        }

        System.out.println(mapList);
        System.out.println(mapList.get("Noma"));
        mapList.clear();
        System.out.println(mapList.remove("Mambo"));
    }
}
