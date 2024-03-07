package Opgave2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Cafe {

    ArrayList<String> coffeeMenu;

    public Cafe(){
        coffeeMenu = new ArrayList<>();

    }

    //Method for 2.c
   public void loadMenuData(){
      File file = new File("C:\\Users\\rfwma\\IdeaProjects\\TorsdagsOpgave5\\src\\Opgave2\\coffees.txt"); //Man skal bruge den præcise sti og dobbelt backslash

      try {
          Scanner scan = new Scanner(file);
          while(scan.hasNextLine()){
              coffeeMenu.add(scan.nextLine());
          }
      }catch(FileNotFoundException e){
          System.out.println("File not found. Check path and filename.");

      }
    }

}