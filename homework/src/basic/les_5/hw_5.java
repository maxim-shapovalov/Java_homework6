package basic.les_5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

    public class hw_5 {
        public static Map<String, ArrayList<String>> phonebook = new HashMap<>();

        public static void add_record(String name, String phone) {
            if (phonebook.containsKey(name)) {
                phonebook.get(name).add(phone);
            }
            else {
                phonebook.put(name, new ArrayList<String>(Arrays.asList(phone.split("\n"))));
            }
        }


        public static List<Map.Entry<String, ArrayList<String>>> sortByPhones2(Map<String, ArrayList<String>> map) {
            List<Map.Entry<String, ArrayList<String>>> entries = new ArrayList<>(map.entrySet());
            entries.sort((e1, e2) -> e2.getValue().size() - e1.getValue().size());
            return entries;
        }

        public static void print_records(Map<String, ArrayList<String>> map) {
            map.forEach((key, value) -> System.out.println(key + " " + value));
        }

        public static void print_records(List<Map.Entry<String, ArrayList<String>>> entries) {
            for (Map.Entry<String, ArrayList<String>> entry : entries) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        }
        public static void main(String[] args) {
            add_record("Иванов Иван Иванович", "+71235664545");
            add_record("Петров Петр Петрович", "+75671239898");
            add_record("Иванов Иван Иванович", "+73219152020");
            print_records(sortByPhones2(phonebook));
        }
    }

