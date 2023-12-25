package com.SirmaAcademy.SharedProjectsFinder.ReadWrite;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CSVReader implements Reader {


  public void read(String path){
      try (
              Scanner scanner = new Scanner(new File(path))) {

        while (scanner.hasNextLine()) {
        }
      } catch (
              FileNotFoundException e) {
        throw new RuntimeException(e);
      }
    }
  }
