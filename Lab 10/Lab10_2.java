import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Lab10_2 {
    public static void main(String[] args) {
        String inputFile = "file1.txt";
        String outputFile = "file2.txt";
        String wordToReplace = "Rajvi";
        String replacementWord = "Vritti";

        int replacements = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(inputFile));
             FileWriter fw = new FileWriter(outputFile)) {

            String line;
            while ((line = br.readLine()) != null) {
                String modifiedLine = line.replaceAll(wordToReplace, replacementWord);
                fw.write(modifiedLine + "\n");

                // Count the number of replacements
                replacements += (line.length() - modifiedLine.length()) / (wordToReplace.length());
            }

            System.out.println("Replacements done: " + replacements);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
