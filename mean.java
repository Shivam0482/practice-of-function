import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MeanCalculator {
    public static void main(String[] args) {
        String fileName = "numbers.txt"; // Replace with your file name

        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            int sum = 0;
            int count = 0;

            while ((line = bufferedReader.readLine()) != null) {
                int number = Integer.parseInt(line.trim());
                sum += number;
                count++;
            }

            bufferedReader.close();

            if (count > 0) {
                double mean = (double) sum / count;
                System.out.println("Mean of the numbers: " + mean);
            } else {
                System.out.println("No numbers found in the file.");
            }

        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
    }
}
