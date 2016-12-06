
package snakeandladder;

import java.awt.Color;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class CustomizeBoard implements Serializable{
    int setRows =5, setColumns=5;   
    ArrayList<SnakeSquare> snakes = new ArrayList<>();  
    ArrayList<LadderSquare> ladders = new ArrayList<>(); 
    Player player=null;   
    GridComp play2 = null;
    GameGrid play = null; 
    SnakeSquare tempSnake=null;
    LadderSquare tempLadder = null;
    
    

    public void setDimension(int r, int c){
        setRows=r;
        setColumns=c;
    }
 
    
    public int getColumns() {
        return setColumns;
    }

    public int getRows() {
        return setRows;
    }

    public CustomizeBoard() {
        customBoard(setRows, setColumns); 
    }
    
    public final void customBoard(int snake, int ladder){
        snakes.clear();
        ladders.clear();
        int noOfSnakes =snake; int noOfLadders=ladder;       
        int prevI=0;
        
        for(int i=0;i<noOfSnakes;i++){
            SnakeSquare newSnake = new SnakeSquare(); 
            Random randomGenerator = new Random();
            int randomFrom  = randomGenerator.nextInt(setRows*setColumns-5)+5;   
            int randomTo = randomGenerator.nextInt(setRows*setColumns-5)+5;
            
            prevI=i;
            if(randomFrom<=randomTo){
                i--;
                continue;
            }
            
            for(SnakeSquare findSnake : snakes){
                if(findSnake.from==randomFrom || findSnake.to==randomTo){
                    i--;
                    break;
                }
            }
            if(prevI!=i){
                continue;
            }    
            newSnake.setSnake(randomFrom, randomTo);
            snakes.add(newSnake); 
        } 
        prevI = 0;
        for(int i=0;i<noOfLadders;i++){ 

        	LadderSquare newLadder= new LadderSquare();  
            Random randomGenerator = new Random();
            int randomFrom  = randomGenerator.nextInt(setRows*setColumns-5)+5;
            int randomTo = randomGenerator.nextInt(setRows*setColumns-5)+5;
            if(randomFrom>=randomTo){
                i--;
                continue;
            }
            prevI=i;
            for(LadderSquare findlLadders : ladders){
                if(findlLadders.from==randomFrom || findlLadders.to==randomTo){
                    i--;
                    break;
                }
            }
            if(prevI!=i){
                continue;
            }
            for(SnakeSquare findSnake : snakes){
                if(findSnake.from==randomFrom || findSnake.from==randomTo){
                    i--;
                    break;
                }
                else if(findSnake.to==randomFrom || findSnake.to==randomTo){
                    i--;
                    break;
                }
            }
            if(prevI!=i){
                continue;
            }
            newLadder.setLadders(randomFrom, randomTo);
            ladders.add(newLadder); 
        }   
    }
   
    public int eatenBySnake(int random, int position){    
    	position = setColumns*setRows-position;
        for(SnakeSquare findSnake : snakes){
            if(findSnake.from==position){
                random+=findSnake.to-position;
                String message = "Snake at position : "+findSnake.from+" caught you. Go to location : "+findSnake.to;  
                String snake = "Snake for "+player.getPlayerName(player.turn);
                JOptionPane.showMessageDialog(new JFrame(), message, snake, JOptionPane.INFORMATION_MESSAGE); 
                break;
            }
        }
        return random;
    }
   
    public int climbLadder(int random, int pos){  
        pos = setColumns*setRows-pos;  
        for(LadderSquare findLadders : ladders){
            if(findLadders.from==pos){
                random+=findLadders.to-pos;
                String message = "Ladder found at : "+findLadders.from+". Go to location : "+findLadders.to;   
                String ladder = "Ladder for "+player.getPlayerName(player.turn);
                JOptionPane.showMessageDialog(new JFrame(), message, ladder, JOptionPane.INFORMATION_MESSAGE);
                break;
            }
        }
        return random;
    }
    
    public void setClasses(Player players,GameGrid grid, GridComp comp){  
        player=players; 
        play = grid;  
        play2 = comp;
    }
    
  
    public void createSnakesAndLadder(){
    	GameImages image = new GameImages();
        int pos = setColumns*setRows;  
        for(SnakeSquare createSnake : snakes){ 
            int from=setColumns*setRows-createSnake.from;
            
            int to=setColumns*setRows-createSnake.to;
            
            play.grid[from].setIcon(image.getSnake().getIcon());  
           
            play.grid[from].setForeground(new Color(20, 200, 20));
            play.grid[from].setText("Go to : "+(pos-to));
        }
        for(LadderSquare createLadder : ladders){
            
            int from=setColumns*setRows-createLadder.from;      
            int to=setColumns*setRows-createLadder.to; 
            play.grid[from].setIcon(image.getLadder().getIcon());  
            play.grid[from].setForeground(new Color(20, 200, 20));  
            play.grid[from].setText("Go to : "+(pos-to));
            
        } 
    }
    
   
    public void computerSnakesAndLadder(){
    	
    	GameImages image = new GameImages();
        int position = setColumns*setRows;  
        for(SnakeSquare createSnake : snakes){ 
            int from=setColumns*setRows-createSnake.from;
            int to=setColumns*setRows-createSnake.to;
            play2.grid[from].setIcon(image.getSnake2().getIcon());  
            play2.grid[from].setForeground(new Color(20, 200, 20));  
            play2.grid[from].setText("Go to : "+(position-to));
        }
        for(LadderSquare createLadder : ladders){
            
            int from=setColumns*setRows-createLadder.from;      
            int to=setColumns*setRows-createLadder.to; 
            play2.grid[from].setIcon(image.getLadder2().getIcon());  
            play2.grid[from].setForeground(new Color(20, 200, 20));
            play2.grid[from].setText("Go to : "+(position-to));
            
        } 
    }
}
