/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matchup.generator;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


/**
 *
 * @author 1786
 */
class ChampInfo{
    String matchUp;
    String winningChance;
    String build;
    String difficulty;
    String comment;
  
   public ChampInfo(String matchUp, String winningChance, String build, String difficulty, String comment) {
       this.matchUp = matchUp;
       this.winningChance = winningChance;
       this.build = build;
       this. difficulty = difficulty;
       this.comment = comment;
    
    }

}
    
public class MatchUpGen {
    
          public void ChampNames(String[] arr){
              
       String []data = {"Aatrox","Akali", "Camille", "Cassiopeia", "Cho'Gath", 
            "Darius","Diana", "Dr. Mundo", "Fiora","Gangplank", "Garen", "Gnar", "Hemerdinger",
            "Illaoi", "Irelia", "Jax", "Jayce", "Kalista","Karma", "Kayle", "Kennen", "Kled", "Lucian",
            "Malphite","Maokai", "Mordekaiser", "Nasus", "Neeko","Olaf","Ornn", "Pantheon", "Poppy",
            "Quinn", "Renekton","Riven", "Rumble", "Ryze", "Sett", "Shen","Singed",
                "Swain", "Sylas", "Teemo", "Tryndamere", "Urgot","Vayne", "Volibear", "Vladimir",
                "Wukong", "Yasuo","Yorick", "Zac","Yone"};
       
   }
    public static void main(String[] args) throws FileNotFoundException, IOException, ArrayIndexOutOfBoundsException {
        
     
        ArrayList<ChampInfo> CpI = new ArrayList<>();;


        String path = "D:\\Destop\\College\\Java\\Final Project things\\SION MATCHUP SHEET Edit.csv";
        String line = "";
        BufferedReader br = new BufferedReader(new FileReader(path));
        while((line = br.readLine()) != null) {
            String[] curLine = br.readLine().split(",");
            //matchUp, winningChance, build, difficulty, comment
            CpI.add(new ChampInfo(curLine[0],curLine[1],
            curLine[2],curLine[3],curLine[4]));
        }
            
                String data[] = new String[CpI.size()];
                for(int i = 0; i < CpI.size(); i++){
                data[0] = CpI.get(i).matchUp;
                data[1] = CpI.get(i).winningChance;
                data[2] = CpI.get(i).build;
                data[3] = CpI.get(i).difficulty;
                data[4] = CpI.get(i).comment;
                    String enemyChamps = data[0], winningChance = data[1],
                build = data[2], difficulty = data[3], comment = data[4];

                    System.out.println(comment);
                }
                    
            //String[] values = line.split(",");
           //System.out.println(values[1]);
       
    }

}

                

    
    
     
   
   
