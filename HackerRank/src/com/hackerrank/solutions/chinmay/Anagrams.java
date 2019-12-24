import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Anagrams {

    // Complete the makeAnagram function below.
    static int makeAnagram(String a, String b) {
        int[] charachtersOfA = new int[200];
        int[] charachtersOfB = new int[200];
        int count = 0;        
        int sizeA = a.length();
        int sizeB= b.length();

        int largeSize = sizeA > sizeB ? sizeA : sizeB;


        for (int i = 0; i < largeSize; i++) {
            if (i < sizeA) {
                if(charachtersOfB[a.charAt(i)]==0)
                {
                    charachtersOfA[a.charAt(i)]++;
                    count++;
                }
                else if(charachtersOfB[a.charAt(i)]>0){
                    count--;
                    charachtersOfB[a.charAt(i)]--;
                }
            }
            if (i < sizeB) {

                if(charachtersOfA[b.charAt(i)]==0)
                {
                    charachtersOfB[b.charAt(i)]++;
                    count++;
                }
                else if(charachtersOfA[b.charAt(i)]>0){
                    count--;
                    charachtersOfA[b.charAt(i)]--;
                }
            }
        }
        return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String a = scanner.nextLine();

        String b = scanner.nextLine();

        int res = makeAnagram(a, b);

        bufferedWriter.write(String.valueOf(res));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
