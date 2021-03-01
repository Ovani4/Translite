package main.java.com.ovani4.translite;

import java.io.*;
import java.util.Map;
import java.util.TreeMap;

public class Base {

    public Base() throws IOException {
        Map<String,String> base = new TreeMap<>();
        BufferedReader br = new BufferedReader(new FileReader("src/main/java/com/ovani4/translite/abc.txt"));
        String s;
        while ((s = br.readLine())!= null) {

        String [] a = s.split(" ");
            base.put(a[0], a[1]);
        }
        for (Map.Entry entry :
                base.entrySet()) {
            System.out.println(entry.getKey());
        }
    }
}
