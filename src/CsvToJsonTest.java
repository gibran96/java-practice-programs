import java.io.File;
import java.io.IOException;
import java.util.*;

import com.fasterxml.jackson.databind.MappingIterator;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;

public class CsvToJsonTest {

    public static void main(String[] args) throws Exception {
        File input = new File("C:/Users/gibra/Documents/Agatsu/csv-to-json/CognitoUsers 2.csv"); // location of the csv file
        File output = new File("C:/Users/gibra/Documents/Agatsu/csv-to-json/users-json-output-3.json"); // location of where you want to output file to be generated

        List<Map<?, ?>> data = readObjectsFromCsv(input);
        writeAsJson(data, output);
    }

    public static List<Map<?, ?>> readObjectsFromCsv(File file) throws IOException {
        CsvSchema bootstrap = CsvSchema.emptySchema().withHeader();
        CsvMapper csvMapper = new CsvMapper();
        MappingIterator<Map<?, ?>> mappingIterator = csvMapper.reader(Map.class).with(bootstrap).readValues(file);

        return mappingIterator.readAll();
    }

    public static void writeAsJson(List<Map<?, ?>> data, File file) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        List<Map<String, Map<String, Map<String, Map>>>> list = new ArrayList<>();
        for (int i=0; i<data.size(); i++) {
            Map<?, ?> map = data.get(i);
            Collection values = map.values();
            Set keys = map.keySet();

            List<String> fieldNames = new ArrayList<>();
            List<String> x = new ArrayList<>();
            fieldNames.addAll(keys);
            x.addAll(values);

            Map obj1 = new LinkedHashMap< >();
            Map< String, Map > obj2 = new LinkedHashMap< >();
            Map<String, Map<String, Map>> obj3 = new LinkedHashMap<>();
            Map<String, Map<String, Map<String, Map>>> obj4 = new LinkedHashMap<>();

            for (int j = 0; j < fieldNames.size(); j++) {
                System.out.println(fieldNames.get(j)+":"+x.get(j));
                if (fieldNames.get(j).contains("(S)")) {
                    obj1 = new LinkedHashMap();
                    obj1.put("S", x.get(j));
                    obj2.put(fieldNames.get(j).replace("(S)", "").trim(), obj1);
                } else if (fieldNames.get(j).contains("(BOOL)")) {
                    obj1 = new LinkedHashMap();
                    obj1.put("BOOL", x.get(j).equalsIgnoreCase("TRUE"));
                    obj2.put(fieldNames.get(j).replace("(BOOL)", "").trim(), obj1);
                }

            }
            obj3.put("Item", obj2);
            obj4.put("PutRequest", obj3);
            list.add(obj4);
        }
        mapper.writeValue(file, list);
    }
}
