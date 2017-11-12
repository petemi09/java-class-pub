package exercise6;

import java.util.Scanner;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

/*
 * Class FrogArmy
 * @author yasiro01
 */
public class FrogArmy {
        private ArrayList<Frog> list;
        
        
    public int size(){
         return list.size();
     }
    
     public FrogArmy(String FilePath) {
        this.list = new ArrayList<Frog>();
        try {
            Scanner scan = new Scanner(new File(FilePath));
            ArrayList<String> line;
            Frog frog;
            while(scan.hasNextLine()){
                line = new ArrayList<String>(Arrays.asList(scan.nextLine().split(",")));
                if(line.contains("Frog")){
                    Integer num = Integer.parseInt(line.get(1));
                    frog = new Frog(line.get(0),num);
                    list.add(frog);
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CrowMurder.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     
     
     public Frog getChief(){
        int index = -1;
        int min = Integer.MIN_VALUE;
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).getAge() > min){
                index = i;
                min = list.get(i).getAge();
            }
        }
        return list.get(index);
    
     }
    
}

