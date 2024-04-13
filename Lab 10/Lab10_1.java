import java.io.*;


public class Lab10_1 {
    public static void main(String[] args){
      String filename = "file1.txt";
    

    try {
        FileWriter fileWriter = new FileWriter("file1.txt");
        PrintWriter pw = new PrintWriter(fileWriter);
        pw.write("Drashti Rathod \n");
        pw.write("Darshan Raval\n");
        pw.close();
        FileReader fileReader = new FileReader(filename);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        int numLines = 0;
        int numWords = 0;
        int numChars = 0;

        String line;
        while ((line = bufferedReader.readLine()) != null) {
            numLines++;
            String[] words = line.split("\\s+");
            numWords += words.length;
            numChars += line.length();
        }

        System.out.println("Number of lines in the file: " + numLines);
        System.out.println("Number of words in the file: " + numWords);
        System.out.println("Number of characters in the file: " + numChars);

        bufferedReader.close();
    } catch (FileNotFoundException e) {
        System.err.println("File '" + filename + "' not found.");
    } catch (IOException e) {
        System.err.println("Error reading the file: " + e.getMessage());
    }
}
}
    