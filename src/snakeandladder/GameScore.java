
package snakeandladder;

import java.io.Serializable;


public class GameScore implements Comparable<GameScore>,Serializable {
    String name; 
    int playerMoves;  
    int dimension;

  
    @Override
    public int compareTo(GameScore score) {
        GameScore gameScore = (GameScore)score;
        if(playerMoves>gameScore.playerMoves){ 
            return 1;
        }
        else{
            return -1;
        }
    }
}
