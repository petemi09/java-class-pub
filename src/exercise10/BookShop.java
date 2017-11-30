package exercise10;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Class BookShop
 * @author yasiro01
 */
public class BookShop {
   protected ArrayList<Book> catalog;
   
  public BookShop() {
     catalog = new ArrayList<Book>();
  }
  
  public BookShop(String filename) throws FileNotFoundException {
      this();
      BufferedReader read = new BufferedReader(new FileReader(filename));
      String[] line;
      Double price;
      Integer year;
       try {
           //if(read.ready()){
           
           while(read.ready()){
               line = read.readLine().split(",");
               catalog.add(new Book(line[0], line[1], Double.parseDouble(line[2]), Integer.parseInt(line[3])));
           }
           
       } catch (IOException ex) {
           Logger.getLogger(BookShop.class.getName()).log(Level.SEVERE, null, ex);
           System.out.println("Error");
       }
      
  }
  
  
  public BookShop(BookShop anotherBookShop) {
      this();
      for(int i = 0; i < anotherBookShop.catalog.size(); i++){
          catalog.add(new Book(anotherBookShop.catalog.get(i)));
      }
  }
  
  public void addNewTitle(Book book) {
      catalog.add(book);
  }
  
  public int size() {
      return catalog.size();
  }
  
  public void discountAll(Double discountPercent) {
     for(Book book: catalog){
         book.setPrice((1-(discountPercent / 100.0)) * book.getPrice());
     }
     //(1-(discountPercent / 100.0)) * book.getPrice())
     
  }
  
  public void printCatalog() {
      for(Book book: catalog){
          System.out.println(book);
      }
      
  }
  
  public void order(Comparator<Book> comp) {
      Collections.sort(catalog, comp);  
  }
  
  public ArrayList<Book> getCatalog() {
      return catalog;
  }
  
  

}
