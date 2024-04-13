import java.util.Scanner;

public class Lab5_3 {
    public static void main(String[] args) {
        VowelCounter counter = new VowelCounter();
        Scanner sc = new Scanner(System.in);
        String input;
        do {
            System.out.print("Enter a sentence (or type 'quit' to stop): ");
            //"quit" not counted while counting the vowels
            input = sc.nextLine();
            if (!input.equalsIgnoreCase("quit")) {
                counter.countVowels(input);
            }
        } while (!input.equalsIgnoreCase("quit"));
        counter.printCounts();
    }
}

class VowelCounter {
     int aCount;
     int eCount;
     int iCount;
     int oCount;
     int uCount;

    public VowelCounter() {
        aCount = 0;
        eCount = 0;
        iCount = 0;
        oCount = 0;
        uCount = 0;
    }

    public void countVowels(String sentence) {
        for (char c : sentence.toLowerCase().toCharArray()) {
            if (c == 'a') {
                aCount++;
            } else if (c == 'e') {
                eCount++;
            } else if (c == 'i') {
                iCount++;
            } else if (c == 'o') {
                oCount++;
            } else if (c == 'u') {
                uCount++;
            }
        }
    }

    public void printCounts() {
        System.out.println("Total Counts:");
        System.out.println("Vowels: " + (aCount + eCount + iCount + oCount + uCount));
        System.out.println("A: " + aCount);
        System.out.println("E: " + eCount);
        System.out.println("I: " + iCount);
        System.out.println("O: " + oCount);
        System.out.println("U: " + uCount);
    }
}
