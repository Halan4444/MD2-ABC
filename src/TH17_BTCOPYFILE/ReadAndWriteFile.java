package TH17_BTCOPYFILE;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    public List<String> readFile (String filePath) {
        List<String> list = new ArrayList<>();
        try {
            File file = new File(filePath);
        if (!file.exists()) {
            throw new FileNotFoundException();
        }
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line;
        while ((line = br.readLine()) != null){
            list.add(line);
        }
            br. close();
        } catch (Exception e) {
            System.out.println("File không tồn tại hoặc nội dung có sẵn ");
        }
        return list;
    }

    public void writeFile (String filePath, String str) {
        try {
            FileWriter writer = new FileWriter(filePath, true);
            BufferedWriter bwr = new BufferedWriter(writer);
            bwr.write(str);
            bwr.newLine();
            bwr.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
