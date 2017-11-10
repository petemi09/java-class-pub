package exercise5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Class Chart
 * Task 8: Create a class Chart that contains a private data member HashMap<Integer, Song> (reuse class Song from task 7). Its constructor must take file name as a parameter, read data from the file (sample top40pop.csv is provided), create a new Song object from each line, and put that object into a HashMap using a song position as a key. Implement method getSong that takes an integer position as a parameter and returns a Song at that position. 
 * 
 * @author yasiro01
 */
public class Chart {
    private HashMap<Integer, Song> chart;

public Chart(String filePath){
        chart = new HashMap<Integer, Song>();
        Song m;
        try {
            BufferedReader file = new BufferedReader(new FileReader(filePath));
            String[] line;
            for(int i = 1; i < 41; i++){
                line = file.readLine().split(",");
                m = new Song(line[1], line[2]);
                chart.put(i, m);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Chart.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Chart.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public Song getSong(Integer i){
        return chart.get(i);
    }
    
}
