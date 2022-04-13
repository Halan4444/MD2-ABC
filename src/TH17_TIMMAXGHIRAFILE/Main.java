package TH17_TIMMAXGHIRAFILE;

import com.sun.org.apache.xpath.internal.objects.XNumber;

import java.util.List;

import static TH17_TIMMAXGHIRAFILE.FindMaxValue.findMax;

public class Main {
    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<Integer> numbers = readAndWriteFile.readFile("numbers.txt");
        int maxValue = findMax(numbers);
        readAndWriteFile.writeFile("result.txt",maxValue);
    }

}
