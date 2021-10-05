package com.company.lab1;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Lab1main {
    public static void main(String[] args) throws IOException {
        fileReaderWriter fRW = new fileReaderWriter();
        fRW.readFile();
    }
}
