package snakeandladder;


import java.io.Serializable;
import javax.swing.ImageIcon;
import javax.swing.JLabel;


public class GameImages extends javax.swing.JFrame implements Serializable{
	
	
    public javax.swing.JLabel blueAndGreen;
    public javax.swing.JLabel player2;
    public javax.swing.JLabel pinkGreen;
    public javax.swing.JLabel pinkAndBlue;
    public javax.swing.JLabel ladderImage;
    public javax.swing.JLabel ladderImage2;
    public javax.swing.JLabel snakePic;
    public javax.swing.JLabel snakePic2;
    
    
    public GameImages() {
    	GUI();
    }

  
    @SuppressWarnings("unchecked")
    public void GUI() {

    	
    	pinkAndBlue = new javax.swing.JLabel();
        pinkGreen = new javax.swing.JLabel();
        blueAndGreen = new javax.swing.JLabel();
        player2 = new javax.swing.JLabel();
        ladderImage = new javax.swing.JLabel();
        ladderImage2 = new javax.swing.JLabel();
		snakePic = new javax.swing.JLabel();
		snakePic2 = new javax.swing.JLabel();
		
		
	
        snakePic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/snakeandladder/images/snake.jpg"))); 
        ladderImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/snakeandladder/images/ladder.jpg"))); 
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        pinkAndBlue.setIcon(new javax.swing.ImageIcon(getClass().getResource("/snakeandladder/images/twobuttons.png"))); 
 
        blueAndGreen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/snakeandladder/images/button13.png"))); 
        player2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/snakeandladder/images/button23.png"))); 

        
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(blueAndGreen))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 226, Short.MAX_VALUE)
                                        .addComponent(player2)
                                        .addGap(124, 124, 124))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(154, 154, 154)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(pinkGreen)))))
                .addGap(30, 30, 30))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(170, 170, 170)
                    .addComponent(pinkAndBlue)
                    .addContainerGap(351, Short.MAX_VALUE))));
        
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(pinkGreen)))
                .addGap(45, 45, 45)
                .addComponent(blueAndGreen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(player2)
                        .addGap(13, 13, 13)
                .addGap(36, 36, 36))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(121, 121, 121)
                    .addComponent(pinkAndBlue, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                    .addGap(122, 122, 122))))));
        		pack();
    }

 


    public JLabel getSnake(){
        return snakePic;
    }
    public JLabel getSnake2(){
        return snakePic2;
    }
    public JLabel getLadder(){
        return ladderImage;
    }
    public JLabel getLadder2(){
        return ladderImage2;
    }
    public JLabel getTwoLabel(){
        return pinkAndBlue;
    }
    public JLabel getThreeLabel(){
        return pinkGreen;
    }
    public JLabel get13Button(){
        return blueAndGreen;
    }
    public JLabel get23Button(){
        return player2;
    } 
   

}
