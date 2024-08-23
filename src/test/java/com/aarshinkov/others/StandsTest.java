package com.aarshinkov.others;

import com.aarshinkov.others.stands.Stands;
import com.aarshinkov.others.stands.StandsLBBG;
import com.aarshinkov.others.stands.StandsLBSF;
import com.aarshinkov.others.stands.StandsLBWN;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

public class StandsTest {

    @Test
    public void testLBSF() {
        print(new StandsLBSF());
    }

    @Test
    public void testLBBG() {
        print(new StandsLBBG());
    }

    @Test
    public void testLBWN() {
        print(new StandsLBWN());
    }

    @Test
    public void test3() {
        String t = "1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 20, 21, 22, 23, 24, 25";
        String[] split = t.split(", ");

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < split.length; i++) {
            builder.append("\"").append(split[i]).append("\"");

            if (i < split.length - 1) {
                builder.append(", ");
            }
        }

        System.out.println(String.valueOf(builder));
    }

    private void print(Stands s) {
        //        System.out.println("--- POSITIVE ---");
//        s.getCalculatedStands().forEach((key, value) -> System.out.println(key + ": " + value));
        System.out.println("--- NEGATIVE ---");
        for (Map.Entry<String, List<String>> entry : s.getCalculatedStandsNegative().entrySet()) {
            String key = entry.getKey();
            List<String> values = entry.getValue();

            StringBuilder result = new StringBuilder();

            for (int i = 0; i < values.size(); i++) {
                result.append(values.get(i));
                if (i < values.size() - 1) {
                    result.append(",");
                }
            }
            System.out.println("Stand " + key + ": " + result);
        }
//        System.out.println(Arrays.toString(s.getStands().toArray()));
//        System.out.println(s.getStands().size());
    }
}
