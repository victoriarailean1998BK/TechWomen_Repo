import java.util.HashMap;
import java.util.Map;

public class Ex6 {
    public static void main(String [] args){

        Map<String, Map<String, String>> name  = new HashMap<>();
        Map<String, String>  details = new HashMap<>();

        details.put("1", "22"); details.put("2", "TV");
        details.put("1", "48"); details.put("3", "Java, Movies, Cycles");
        details.put("4", "2019"); details.put("5", "ch open Zurich, Oracle Code One SF");
        details.put("6", "2019"); details.put("7", "JAX London");
        details.put("8", "2019"); details.put("9", " W-JAX Munich");

        name.put("Petter", details);
        name.put("Mike", details);
        name.put("September", details);
        name.put("October", details);
        name.put("November", details);

        System.out.println("Compound key (name, age) - Hobbies:");

        String rezult = getValue(name, "Petter", "2");
        System.out.println("Result_2: " + rezult);

        String rezult1 = getValue(name, "Mike", "3");
        System.out.println("Result_1 : " + rezult1);

        System.out.println("Compound key (month, year)  - Conferences:");

        String rezult2 = getValue(name, "September", "5");
        System.out.println("Result_3: " + rezult2);

        String rezult3 = getValue(name, "October", "7");
        System.out.println("Rezult_4: " + rezult3);

        String rezult4 = getValue(name, "November", "9");
        System.out.println("Rezult_4: " + rezult4);
    }

    public static String getValue(Map<String, Map <String, String>> map, String key1, String key2)
    {
        return map.get(key1).get(key2);
    }
}
