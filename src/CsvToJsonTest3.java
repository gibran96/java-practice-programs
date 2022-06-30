/*
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class CsvToJsonTest3 {

    public static void  main(String[] args) {

        File input = new File("C:/Users/gibra/Documents/Agatsu/csv-to-json/CognitoUsers.csv");

        try (InputStream in = new FileInputStream(input);) {
            sample.CSV csv = new sample.CSV(true, ',', in );
            List< String > fieldNames = null;
            if (csv.hasNext()) fieldNames = new ArrayList< >(csv.next());

            List < String > x = null;//csv.next();
            if (csv.hasNext()) x = new ArrayList< >(csv.next());

            List<Map<String, Map<String, Map<String, Map>>>> list = new ArrayList<>();

            while (csv.hasNext()) {
                Map obj1 = new LinkedHashMap< >();
                Map< String, Map > obj2 = new LinkedHashMap< >();
                Map<String, Map<String, Map>> obj3 = new LinkedHashMap<>();
                Map<String, Map<String, Map<String, Map>>> obj4 = new LinkedHashMap<>();

                for (int i = 0; i <= fieldNames.size(); i++) {
                    System.out.println(fieldNames.get(i)+":"+x.get(i));
                    if (fieldNames.get(i).contains("(S)")) {
                        obj1 = new LinkedHashMap();
                        obj1.put("S", x.get(i));
                        obj2.put(fieldNames.get(i).replace("(S)", "").trim(), obj1);
                    } else if (fieldNames.get(i).contains("(BOOL)")) {
                        obj1 = new LinkedHashMap();
                        obj1.put("BOOL", x.get(i).equalsIgnoreCase("TRUE"));
                        obj2.put(fieldNames.get(i).replace("(BOOL)", "").trim(), obj1);
                    }

                }
                obj3.put("Item", obj2);
                obj4.put("PutRequest", obj3);
                list.add(obj4);
            }
            ObjectMapper mapper = new ObjectMapper();
            mapper.enable(SerializationFeature.INDENT_OUTPUT);
            mapper.writeValue(System.out, list);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
*/
