package Les5;

import java.util.HashMap;
import java.util.Map;

public class Passports {
    private Map<String, String> map = new HashMap<>();

    public void add(String numbPass, String lastname) {
        map.put(numbPass, lastname);
    }

    public String getByNumbPass(String numbPass) {
        return numbPass + " : " + map.get(numbPass);
    }

    public String getByLastname(String lastname) {
        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getValue().equals(lastname)) {
                stringBuilder.append(entry.getKey());
                stringBuilder.append(" : ");
                stringBuilder.append(lastname);
                stringBuilder.append("\n");
            }
        }
        return stringBuilder.toString();
    }

    String getAll(){
        return map.toString();
    }
}
