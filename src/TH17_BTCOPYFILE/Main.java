package TH17_BTCOPYFILE;

import java.util.List;

import static TH17_BTCOPYFILE.StringNumber.num;

public class Main {
    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<  String > list = readAndWriteFile.readFile("Source1.txt");
        int num = num(String.valueOf(list));
        for (int i=0; i<list.size(); i++){
            readAndWriteFile.writeFile("TargetFile.txt", String.valueOf(list.get(i)));
        }
        System.out.println("Số ký tự trong File là: "+list.size());
    }

}
