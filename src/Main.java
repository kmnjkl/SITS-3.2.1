import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("First file path: ");
        String firstFilePath = sc.next();
        System.out.println("Second file path: ");
        String secondFilePath = sc.next();
        File firstFile = new File(firstFilePath);
        File secondFile = new File(secondFilePath);
        try {
            Scanner firstScanner = new Scanner(firstFile);
            String firstText = "";
            Scanner secondScanner = new Scanner(secondFile);
            String secondText = "";
            while (firstScanner.hasNext()) {

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
//        File inFile = new File(firstFilePath);
//        File outFile = new File(secondFilePath);
//        try {
//            Scanner fsc = new Scanner(inFile);
//            fsc.next();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
    }
}
