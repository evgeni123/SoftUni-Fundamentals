package java_fundamentals;

import java.util.Scanner;

public class ExtractFile {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String path = s.nextLine();

        int slashIndex = path.lastIndexOf("\\");
        int pointIndex = path.lastIndexOf('.');

        String fileName = path.substring(slashIndex + 1, pointIndex);
        String extension = path.substring(pointIndex + 1);

        System.out.println(String.format("File name: %s", fileName));
        System.out.println(String.format("File extension: %s", extension))
        ;
    }
}
