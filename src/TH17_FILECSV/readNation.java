package TH17_FILECSV;

import sun.font.CreatedFontTracker;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class readNation {

    public static List<National> readNationFromCSV (String pathFile) {
        List<National> nationalList = new ArrayList<>();
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            File file = new File(pathFile);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line;
            String[] nationalString = null;
            int id = -1;
            String code = null;
            String nationalName = null;
            while ((line=bufferedReader.readLine())!=null) {
                nationalString = line.split(",");
                id = Integer.parseInt(nationalString[0]);
                code = nationalString[1];
                nationalName = nationalString [2];

                National national = new National(id,code,nationalName);
                nationalList.add(national);
            }
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }return nationalList;
        
    }

}
