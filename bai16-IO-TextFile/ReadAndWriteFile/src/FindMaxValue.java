import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FindMaxValue {
    public static int findMax(List<Integer> number) {
        int max = number.get(0);
        for (int i = 0; i < number.size(); i++) {
            if (number.get(i) > max) {
                max = number.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        ReadAndWriteFile rw = new ReadAndWriteFile();
        List<Integer> numbers = rw.readFile("bai16-IO-TextFile/SumFileText/src/numbers.txt");
        int max = findMax(numbers);
        rw.writeFile("bai16-IO-TextFile/SumFileText/src/numbers.txt", max);
    }
}
