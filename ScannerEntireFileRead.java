package com.ScannerFileIO;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerEntireFileRead {
    public static void main(String[] args) throws FileNotFoundException {
                File file=new File("E:\\Projects\\Java-FileIO-Project G13\\tekletsadik.txt");
                Scanner sc=new Scanner(file);
                sc.useDelimiter("\\Z");
                System.out.println(sc.next());
    }
}
