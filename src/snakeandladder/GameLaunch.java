
package snakeandladder;

import java.awt.Color;





public class GameLaunch {
   
	public GameLaunch(){
		super();	
	}
	
	
    public static void main(String[] args) { 
    	
    	try {
    		
            setLookAndFeel(); 
            GameMenu mainMenu = new GameMenu();  
            CustomizeBoard cus = new CustomizeBoard();
            Player player = new Player();
            
            mainMenu.setClasses(cus,player); 
            cus.setClasses(player,null, null);
            mainMenu.setVisibility(true);
            mainMenu.printHighScores(); 

    	} catch (Exception e){
    		e.printStackTrace();
    	}
    	
    }
  
    public static void setLookAndFeel(){
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) { 
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GameMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GameMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GameMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GameMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }
}
