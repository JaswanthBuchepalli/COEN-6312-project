package snakeandladder;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;

public class GameMenu extends javax.swing.JFrame{
	
	
	 public javax.swing.JButton backMainMenuButton;
	 private javax.swing.JButton computer;
     private javax.swing.JButton customizeBoardButton;
     private javax.swing.JButton exitButton;
     private javax.swing.JButton helpButton;
     private javax.swing.JButton aboutButton;
     private javax.swing.JButton returnaboutButton;
     private javax.swing.JButton highScoresButton;
     public javax.swing.JFrame helpFrame; 
     public javax.swing.JLabel scoreCard;
     private javax.swing.JLabel howToPlay;
     private javax.swing.JLayeredPane howToPlayPane1;
     private javax.swing.JScrollPane scoreScrollPanel;
     private javax.swing.JLabel mainMenuLabel;
     private javax.swing.JButton newGameButton;
     private javax.swing.JFrame playersFrame;
     private javax.swing.JFrame aboutFrame;
     private javax.swing.JFrame HighscoreFrame;
     public javax.swing.JTable scoreTable;
     private javax.swing.JButton threePlayersButton;
     private javax.swing.JButton twoPlayersButton;
	 private javax.swing.JLayeredPane diceSnakePanel;
	 private javax.swing.JLayeredPane developerPane3;
	 private javax.swing.JLayeredPane featurePane4;
	 private javax.swing.JLayeredPane sentencePlayerPane5;
	 private javax.swing.JLayeredPane grid1Pane8;
	 private javax.swing.JLayeredPane dice1Pane7;
	 private javax.swing.JLayeredPane cusgamePane8;
	 private javax.swing.JLayeredPane scoresentence2Pane19;
	 private javax.swing.JLayeredPane sentencePlayer2Pane6;

	 private javax.swing.JLayeredPane grid2Pane9;
	 private javax.swing.JLayeredPane grid3Pane10;
	 private javax.swing.JLayeredPane scoresentencePane24;
	 private javax.swing.JLayeredPane dice2Pane25;
	 private javax.swing.JLayeredPane cusgamePane26;
	 private javax.swing.JLayeredPane cusgame3Pane27;
	 private javax.swing.JLayeredPane cusgame4Pane28;
	 private javax.swing.JLayeredPane scoresentence3Pane29;
	 private javax.swing.JLayeredPane scoresentence4Pane30;
	 private javax.swing.JLabel diceSnakepic;
	 private javax.swing.JLabel developer;
	 private javax.swing.JLabel feature;
	 private javax.swing.JLabel sentencePlayer;
	 private javax.swing.JLabel grid1;
	 private javax.swing.JLabel dice1;
	 private javax.swing.JLabel cusgame;
	 private javax.swing.JLabel scoresentence2;
	 private javax.swing.JLabel sentencePlayer2;

	 private javax.swing.JLabel grid2;
	 private javax.swing.JLabel grid3;
	 private javax.swing.JLabel scoresentence;
	 private javax.swing.JLabel dice2;
	 private javax.swing.JLabel cusgame2;
	 private javax.swing.JLabel cusgame3;
	 private javax.swing.JLabel cusgame4;
	 private javax.swing.JLabel scoresentence3;
	 private javax.swing.JLabel scoresentence4;
	
    public GameMenu() {
    	GUI(); 
        setLocation(500, 250);
    }
    
    
    @SuppressWarnings("unchecked")
    public void GUI() {	
    
       HighscoreFrame = new javax.swing.JFrame();
       scoreCard = new javax.swing.JLabel();
       scoreScrollPanel = new javax.swing.JScrollPane();
       scoreTable = new javax.swing.JTable();
       helpFrame = new javax.swing.JFrame();
       howToPlayPane1 = new javax.swing.JLayeredPane();
       howToPlay = new javax.swing.JLabel();
       playersFrame = new javax.swing.JFrame();
       twoPlayersButton = new javax.swing.JButton();
       computer = new javax.swing.JButton();
       aboutButton = new javax.swing.JButton();
       returnaboutButton = new javax.swing.JButton();
       threePlayersButton = new javax.swing.JButton();
       backMainMenuButton = new javax.swing.JButton();
       newGameButton = new javax.swing.JButton();
       customizeBoardButton = new javax.swing.JButton();
       highScoresButton = new javax.swing.JButton();
       helpButton = new javax.swing.JButton();
       exitButton = new javax.swing.JButton();
       mainMenuLabel = new javax.swing.JLabel();
       aboutFrame = new javax.swing.JFrame(); 
       diceSnakepic = new javax.swing.JLabel();
       developer = new javax.swing.JLabel();
       feature = new javax.swing.JLabel();
       sentencePlayer = new javax.swing.JLabel();
       grid1 = new javax.swing.JLabel();
       dice1 = new javax.swing.JLabel();
       cusgame = new javax.swing.JLabel();
       scoresentence2 = new javax.swing.JLabel();
       sentencePlayer2 = new javax.swing.JLabel();

       grid2 = new javax.swing.JLabel();
       grid3 = new javax.swing.JLabel();
       scoresentence = new javax.swing.JLabel();
       dice2 = new javax.swing.JLabel();
       cusgame2 = new javax.swing.JLabel();
       cusgame3 = new javax.swing.JLabel();
       cusgame4 = new javax.swing.JLabel();
       scoresentence3 = new javax.swing.JLabel();
       scoresentence4 = new javax.swing.JLabel();
       diceSnakePanel = new javax.swing.JLayeredPane();
       developerPane3 = new javax.swing.JLayeredPane();
       featurePane4 = new javax.swing.JLayeredPane();
       sentencePlayerPane5 = new javax.swing.JLayeredPane();
       grid1Pane8 = new javax.swing.JLayeredPane();
       dice1Pane7 = new javax.swing.JLayeredPane();
       cusgamePane8 = new javax.swing.JLayeredPane();
       scoresentence2Pane19 = new javax.swing.JLayeredPane();
       sentencePlayer2Pane6 = new javax.swing.JLayeredPane();

       grid2Pane9 = new javax.swing.JLayeredPane();
       grid3Pane10 = new javax.swing.JLayeredPane();
       scoresentencePane24 = new javax.swing.JLayeredPane();
       dice2Pane25 = new javax.swing.JLayeredPane();
       cusgamePane26 = new javax.swing.JLayeredPane();
       cusgame3Pane27 = new javax.swing.JLayeredPane();
       cusgame4Pane28 = new javax.swing.JLayeredPane();
       scoresentence3Pane29 = new javax.swing.JLayeredPane();
       scoresentence4Pane30 = new javax.swing.JLayeredPane();
		  
      
        scoreCard.setFont(new java.awt.Font("Tahoma", 1, 18));
        scoreCard.setHorizontalAlignment(javax.swing.SwingConstants.CENTER); 
        scoreCard.setText("Score Card");  
        scoreCard.setForeground(Color.RED);
        scoreTable.setModel(new javax.swing.table.DefaultTableModel( 
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},  
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "  S. No.", "  Name", "  Score", "  Dimension"  
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class 
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        scoreTable.setGridColor(new java.awt.Color(147,112,219));  
        scoreTable.setRowHeight(18);
        scoreScrollPanel.setViewportView(scoreTable); 
        scoreScrollPanel.setBackground(new java.awt.Color(255, 48, 48));
        
        
      
        javax.swing.GroupLayout scoreCardFrameLayout = new javax.swing.GroupLayout(HighscoreFrame.getContentPane());
        HighscoreFrame.getContentPane().setLayout(scoreCardFrameLayout);
        scoreCardFrameLayout.setHorizontalGroup(
            scoreCardFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, scoreCardFrameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scoreScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE) 
                .addContainerGap())
            .addGroup(scoreCardFrameLayout.createSequentialGroup()
                .addGap(98, 98, 98) 
                .addComponent(scoreCard, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE) 
                .addContainerGap(168, Short.MAX_VALUE)));
          scoreCardFrameLayout.setVerticalGroup(
            scoreCardFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(scoreCardFrameLayout.createSequentialGroup()
                .addGap(43, 43, 43) 
                .addComponent(scoreCard, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(scoreScrollPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                .addContainerGap()));
        
        helpFrame.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE); 
       


        
        
       
        howToPlay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/snakeandladder/images/help.png"))); 
        howToPlay.setBounds(0, 0, 1000, 650); 
        howToPlayPane1.add(howToPlay, javax.swing.JLayeredPane.DEFAULT_LAYER); 
        
        diceSnakepic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/snakeandladder/images/diceSnake.jpg")));
        diceSnakepic.setBounds(0, 0, 1000, 400); 
        diceSnakePanel.add(diceSnakepic, javax.swing.JLayeredPane.DEFAULT_LAYER); 
        
        
    	 developer.setFont(new java.awt.Font("Tahoma", 0, 20)); 
		 developer.setText("The Snake and Ladders game was designed by YOGIS for COEN 6312"); 
		 developer.setBounds(0, 170, 1000, 400); 
		 developer.setForeground(Color.CYAN);
		 developerPane3.add(developer, javax.swing.JLayeredPane.DEFAULT_LAYER); 
		 
		 feature.setFont(new java.awt.Font("Tahoma", 0, 20)); 
		 feature.setText("The game has several features;");
		 feature.setBounds(0, 200, 1000, 400);  
		 feature.setForeground(Color.CYAN); 
		 featurePane4.add(feature, javax.swing.JLayeredPane.DEFAULT_LAYER); 
		 
		 sentencePlayer.setFont(new java.awt.Font("Tahoma", 0, 18)); 
		 sentencePlayer.setForeground(Color.CYAN); 
		 sentencePlayer.setText("The maximum players in this game is 2 players.");
		 sentencePlayer.setBounds(0, 230, 1000, 400); 
		 sentencePlayerPane5.add(sentencePlayer, javax.swing.JLayeredPane.DEFAULT_LAYER); 
		 sentencePlayer2.setFont(new java.awt.Font("Tahoma", 0, 18)); 
		 sentencePlayer2.setForeground(Color.CYAN);
		 sentencePlayer2.setText("This game also let you to write down your name. "); 
		 sentencePlayer2.setBounds(0, 260, 1000, 400);
		 sentencePlayer2Pane6.add(sentencePlayer2, javax.swing.JLayeredPane.DEFAULT_LAYER); 
		  
		 grid1.setFont(new java.awt.Font("Tahoma", 0, 18)); 
		 grid1.setForeground(Color.CYAN);
		 grid1.setText("It will randamly generate a new game with different snakes and ladders position. "); 
		 grid1.setBounds(0, 320, 1000, 400); 
		 grid1Pane8.add(grid1, javax.swing.JLayeredPane.DEFAULT_LAYER);
		 
		 grid2.setFont(new java.awt.Font("Tahoma", 0, 18)); 
		 grid2.setForeground(Color.CYAN);
		 grid2.setText("This means everytime you start a new game, it will display the snakes and ladder in different grid numbers.");
		 grid2.setBounds(0, 350, 1000, 400); 
		 grid2Pane9.add(grid2, javax.swing.JLayeredPane.DEFAULT_LAYER); 
		 
		 grid3.setFont(new java.awt.Font("Tahoma", 0, 18));
		 grid3.setForeground(Color.CYAN); 
		 grid3.setText("The maximum numbers of snakes and ladder within the game is 5."); 
		 grid3.setBounds(0, 390, 1000, 400); 
		 grid3Pane10.add(grid3, javax.swing.JLayeredPane.DEFAULT_LAYER);  
		 
		 scoresentence.setFont(new java.awt.Font("Tahoma", 0, 18));
		 scoresentence.setForeground(Color.CYAN); 
		 scoresentence.setText("It can also record your score and place it in a score table.");
		 scoresentence.setBounds(0, 420, 1000, 400);  
		 scoresentencePane24.add(scoresentence, javax.swing.JLayeredPane.DEFAULT_LAYER); 
		 
		 dice1.setFont(new java.awt.Font("Tahoma", 0, 18));  
		 dice1.setForeground(Color.CYAN); 
		 dice1.setText("In the game, when you press the Roll Dice button, it will display a dice image unlike text."); 
		 dice1.setBounds(0, 450, 1000, 400); 
		 dice1Pane7.add(dice1, javax.swing.JLayeredPane.DEFAULT_LAYER); 
		 
		 dice2.setFont(new java.awt.Font("Tahoma", 0, 18));  
		 dice2.setForeground(Color.CYAN); 
		 dice2.setText("This is used using the random method.");  
		 dice2.setBounds(0, 490, 1000, 400);  
		 dice2Pane25.add(dice2, javax.swing.JLayeredPane.DEFAULT_LAYER);  
		 
		 cusgame.setFont(new java.awt.Font("Tahoma", 0, 18)); 
		 cusgame.setForeground(Color.CYAN); 
		 cusgame.setText("You can customise your own snake and ladder grid. This is done by pressing the customise button in the main menu.");  
		 cusgame.setBounds(0, 520, 1000, 400); 
		 cusgamePane8.add(cusgame, javax.swing.JLayeredPane.DEFAULT_LAYER); 
		 
		 cusgame2.setFont(new java.awt.Font("Tahoma", 0, 18));  
		 cusgame2.setForeground(Color.CYAN); 
		 cusgame2.setText("when the button pressed, you must set the dimensions (e.g 4, 4 rows, 4 colums).");  
		 cusgame2.setBounds(0, 550, 1000, 400);  
		 cusgamePane26.add(cusgame2, javax.swing.JLayeredPane.DEFAULT_LAYER); 
		 
		 cusgame3.setFont(new java.awt.Font("Tahoma", 0, 18));  
		 cusgame3.setForeground(Color.CYAN); 
		 cusgame3.setText("You then can select the amount of snake and ladders needed for your game."); 
		 cusgame3.setBounds(0, 590, 1000, 400); 
		 cusgame3Pane27.add(cusgame3, javax.swing.JLayeredPane.DEFAULT_LAYER); 
		 
		 cusgame4.setFont(new java.awt.Font("Tahoma", 0, 18)); 
		 cusgame4.setForeground(Color.CYAN); 
		 cusgame4.setText("Then finally set which grid number you want the snake and ladder starting and ending.");  
		 cusgame4.setBounds(0, 620, 1000, 400);
		 cusgame4Pane28.add(cusgame4, javax.swing.JLayeredPane.DEFAULT_LAYER); 
		 
		 scoresentence2.setFont(new java.awt.Font("Tahoma", 0, 18)); 
		 scoresentence2.setForeground(Color.CYAN); 
		 scoresentence2.setText("It can also record your score and place it in a score table. The score system is only recorded when the person win the match."); 
		 scoresentence2.setBounds(0, 650, 1000, 400);  
		 scoresentence2Pane19.add(scoresentence2, javax.swing.JLayeredPane.DEFAULT_LAYER); 
		 
		 scoresentence3.setFont(new java.awt.Font("Tahoma", 0, 18)); 
		 scoresentence3.setForeground(Color.CYAN); 
		 scoresentence3.setText("It will display how many turns it took you to win the game.");  
		 scoresentence3.setBounds(0, 690, 1000, 400); 
		 scoresentence3Pane29.add(scoresentence3, javax.swing.JLayeredPane.DEFAULT_LAYER); 
		 
		 scoresentence4.setFont(new java.awt.Font("Tahoma", 0, 18));  
		 scoresentence4.setForeground(Color.CYAN); 
		 scoresentence4.setText("Followed by your name and rank your score with other members within the score table.");  
		 scoresentence4.setBounds(0, 720, 1000, 400);  
		 scoresentence4Pane30.add(scoresentence4, javax.swing.JLayeredPane.DEFAULT_LAYER);  
        

		 
		 javax.swing.GroupLayout aboutFrameLayout = new javax.swing.GroupLayout(aboutFrame.getContentPane());
	        aboutFrame.getContentPane().setLayout(aboutFrameLayout);
	        aboutFrameLayout.setHorizontalGroup(
	        		
	        		aboutFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	        		.addComponent(developerPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 431, Short.MAX_VALUE)  
	        	.addComponent(diceSnakePanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 431, Short.MAX_VALUE)  
	            .addComponent(featurePane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 431, Short.MAX_VALUE)
	            .addComponent(sentencePlayerPane5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 431, Short.MAX_VALUE)
	            .addComponent(grid1Pane8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 431, Short.MAX_VALUE)
	            .addComponent(dice1Pane7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 431, Short.MAX_VALUE)
	            .addComponent(cusgamePane8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 431, Short.MAX_VALUE)
	            .addComponent(scoresentence2Pane19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 431, Short.MAX_VALUE)
	            .addComponent(sentencePlayer2Pane6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 431, Short.MAX_VALUE)

	            .addComponent(grid2Pane9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 431, Short.MAX_VALUE)
	            .addComponent(grid3Pane10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 431, Short.MAX_VALUE)
	            .addComponent(scoresentencePane24, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 431, Short.MAX_VALUE)
	            .addComponent(dice2Pane25, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 431, Short.MAX_VALUE)
	            .addComponent(cusgamePane26, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 431, Short.MAX_VALUE)
	            .addComponent(cusgame3Pane27, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 431, Short.MAX_VALUE)
	            .addComponent(cusgame4Pane28, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 431, Short.MAX_VALUE)
	            .addComponent(scoresentence3Pane29, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 431, Short.MAX_VALUE)
	            .addComponent(scoresentence4Pane30, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 431, Short.MAX_VALUE)
	                .addComponent(returnaboutButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	            
	        );
	        aboutFrameLayout.setVerticalGroup(
	        		
	        		aboutFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	        		.addComponent(developerPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE)
	        	.addComponent(diceSnakePanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE)
	            .addComponent(featurePane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE)
	            .addComponent(sentencePlayerPane5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE)
	            .addComponent(grid1Pane8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE)
	            .addComponent(dice1Pane7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE)
	            .addComponent(cusgamePane8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE)
	            .addComponent(scoresentence2Pane19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE)
	             .addComponent(sentencePlayer2Pane6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE)

	             .addComponent(grid2Pane9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE)
	              .addComponent(grid3Pane10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE)
	              .addComponent(scoresentencePane24, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE)
	              .addComponent(dice2Pane25, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE)
	              .addComponent(cusgamePane26, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE)
	            .addComponent(cusgame3Pane27, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE)
	            .addComponent(cusgame4Pane28, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE)
	      .addComponent(scoresentence3Pane29, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE)
	              .addComponent(scoresentence4Pane30, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE)
	               .addGap(18, 18, 18) 
                .addComponent(returnaboutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE));
		 
		 
	     
        javax.swing.GroupLayout howToPlayLayout = new javax.swing.GroupLayout(helpFrame.getContentPane());
        helpFrame.getContentPane().setLayout(howToPlayLayout);  
        howToPlayLayout.setHorizontalGroup( 
        		howToPlayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        		.addComponent(howToPlayPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 431, Short.MAX_VALUE)); 
        howToPlayLayout.setVerticalGroup( 
        		howToPlayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        		.addComponent(howToPlayPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE));   
        

        aboutFrame.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE); 
        aboutFrame.setBackground(new java.awt.Color(255, 48, 48));  
        
        playersFrame.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);   
        playersFrame.setBackground(new java.awt.Color(202, 255, 112));   
        
        
    
        twoPlayersButton.setFont(new java.awt.Font("Tahoma", 0, 14)); 
        twoPlayersButton.setText("2 Players"); 
        twoPlayersButton.setForeground(Color.CYAN); 
        twoPlayersButton.setBackground(Color.BLUE); 
        twoPlayersButton.addActionListener(new java.awt.event.ActionListener() {  
            public void actionPerformed(java.awt.event.ActionEvent evt) {
          
            	twoPlayersButton(evt); 
            }
        });
        
     
        backMainMenuButton.setFont(new java.awt.Font("Tahoma", 0, 14));
        backMainMenuButton.setText("Back To Main Menu");
        backMainMenuButton.setForeground(Color.CYAN); 
        backMainMenuButton.setBackground(Color.BLUE); 
        backMainMenuButton.addActionListener(new java.awt.event.ActionListener() { 
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backMainMenuButton(evt);  
            
            }
        });
        
        
      
        javax.swing.GroupLayout playersFrameLayout = new javax.swing.GroupLayout(playersFrame.getContentPane());
        playersFrame.getContentPane().setLayout(playersFrameLayout); 
        playersFrameLayout.setHorizontalGroup( 
            playersFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(playersFrameLayout.createSequentialGroup()
                .addGap(0, 60, Short.MAX_VALUE)
                .addGroup(playersFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
        	         .addComponent(backMainMenuButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)  
                    .addComponent(twoPlayersButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)) 
                
             .addContainerGap(74, Short.MAX_VALUE)
                )); 
        playersFrameLayout.setVerticalGroup(
            playersFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(playersFrameLayout.createSequentialGroup()
    	       
                .addGap(30, 30, 30) 
                .addComponent(twoPlayersButton)
                .addGap(18, 18, 18)
                .addComponent(backMainMenuButton)
                .addContainerGap(30, Short.MAX_VALUE)));
        	setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);  

        newGameButton.setFont(new java.awt.Font("Tahoma", 0, 14));
        newGameButton.setText("Play Game");
        newGameButton.setForeground(Color.GREEN); 
        newGameButton.setBackground(Color.BLUE);
        newGameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
         
            	newGameButton(evt); 
            
            }
        });
        
        
       
        customizeBoardButton.setFont(new java.awt.Font("Tahoma", 0, 14));
        customizeBoardButton.setText("Customize Board"); 
        customizeBoardButton.setForeground(Color.GREEN); 
        customizeBoardButton.setBackground(Color.BLUE); 
        customizeBoardButton.addActionListener(new java.awt.event.ActionListener() { 
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	
            	try {
            
                	customizeBoardButton(evt);  
              	    Thread.sleep(1500);   
            	} catch (InterruptedException e) {
            	    e.printStackTrace();
            	    System.out.println("The Action Performed has been interuptted");
            	    JOptionPane.showMessageDialog(null, "Interruption occurred");
            	}
            }
            
        });
        
       
        aboutButton.setFont(new java.awt.Font("Tahoma", 0, 14)); 
        aboutButton.setText("About"); 
        aboutButton.setForeground(Color.GREEN); 
        aboutButton.setBackground(Color.BLUE);
        aboutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
          
            	aboutButton(evt);  
           
            }
        });
        
        
        returnaboutButton.setFont(new java.awt.Font("Tahoma", 0, 14)); 
        returnaboutButton.setText("Return"); 
        returnaboutButton.setBackground(new java.awt.Color(240,230,140));
        returnaboutButton.setForeground(Color.blue); 
        returnaboutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	returnaboutButton(evt); 
         
            }
        });

       

        highScoresButton.setFont(new java.awt.Font("Tahoma", 0, 14)); 
        highScoresButton.setText("Game score"); 
        highScoresButton.setForeground(Color.GREEN); 
        highScoresButton.setBackground(Color.BLUE); 
        highScoresButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	highScoresButton(evt);  
           
            }
        });
        

      
        helpButton.setFont(new java.awt.Font("Tahoma", 0, 14));
        helpButton.setText("Need Help?"); 
        helpButton.setForeground(Color.GREEN); 
        helpButton.setBackground(Color.BLUE); 
        helpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) { 
            	helpButton(evt);  
            	
            }
        });

        
        exitButton.setFont(new java.awt.Font("Tahoma", 0, 14)); 
        exitButton.setText("Close"); 
        exitButton.setForeground(Color.GREEN); 
        exitButton.setBackground(Color.BLUE); 
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) { 
            	
            	try {
            		
            	    Thread.sleep(1500);
            	    exitButton(evt); 
            	} catch (InterruptedException e) {
            	    e.printStackTrace();
            	    System.out.println("The Action has interuptted");
            	    JOptionPane.showMessageDialog(null, "Interruption occurred"); 
            	}
            }
        });

       
        mainMenuLabel.setFont(new java.awt.Font("Tahoma", 0, 20)); 
        mainMenuLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER); 
        mainMenuLabel.setForeground(Color.BLUE);
        mainMenuLabel.setText("Snakes And Ladders"); 
        getContentPane().setBackground(Color.WHITE); 

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 60, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
        	        .addComponent(highScoresButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE) 
                    .addComponent(customizeBoardButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)  
                    .addComponent(newGameButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE) 
                    .addComponent(helpButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)  
                    .addComponent(exitButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)  
                    .addComponent(aboutButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE) 
                    .addComponent(mainMenuLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))  
                .addGap(60, 60, 60)));
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap() 
	         
                .addComponent(mainMenuLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE) 
                .addGap(18, 18, 18)
                .addComponent(newGameButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE) 
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(customizeBoardButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE) 
                .addGap(18, 18, 18)
                .addComponent(highScoresButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)  
                .addComponent(helpButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18) 
                .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE) 
                .addGap(18, 18, 18)
                .addComponent(aboutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE) 
                .addContainerGap(31, Short.MAX_VALUE))); 
        		pack();
    }

   
    private void exitButton(java.awt.event.ActionEvent evt) {
        System.exit(0); 
    }

    
    private void newGameButton(java.awt.event.ActionEvent evt) {
        setVisible(false);

        playersFrame.setSize(450, 350);  
        playersFrame.setLocation(200, 200); 

        playersFrame.setVisible(true); 
        playersFrame.getContentPane().setBackground(Color.WHITE);
    }
    
  
    private void aboutButton(java.awt.event.ActionEvent evt) {
        setVisible(false);
        aboutFrame.setSize(1000, 1000); 
        aboutFrame.setLocation(50, 50); 
        aboutFrame.setVisible(true); 
        aboutFrame.getContentPane().setBackground(Color.RED); 
    }
    
    
    public void returnaboutButton(java.awt.event.ActionEvent evt) {
    	playersFrame.setVisible(false);
        setVisible(true);
        aboutFrame.setVisible(false);
       
    }
    

    
   
    public void customizeBoardButton(java.awt.event.ActionEvent evt) {
    
    		try {
  
    		int dimension =0;
			String  stringD = JOptionPane.showInputDialog(
	        new JFrame(),
	        "Please Enter the dimension : ","");  
	        if(stringD == null)
	        {
	        	return;
	        }
	        dimension = Integer.parseInt(stringD);
	        if(dimension<4 || dimension>8){
	            dimension=6;
	            String error = "Dimensions must be between 5 and 12!!!";
	            JOptionPane.showMessageDialog(new JFrame(), error, "Error Message", JOptionPane.ERROR_MESSAGE); 
	            cus.setDimension(dimension,dimension);
	            cus.customBoard(4, 4);	
	            return;   
	        } 
	        cus.setDimension(dimension,dimension);

	       
	         
	        if (JOptionPane.showConfirmDialog(new JFrame(),
	        "Do you want to Change the position of Snakes and Ladders ?", "Customize", 
	        JOptionPane.YES_NO_OPTION) == JOptionPane.NO_OPTION){  
	            if(dimension<=6){
	                cus.customBoard(6, 6); 
	            }
	            else{
	                cus.customBoard(4, 4);
	            }
	            return;
	        }
	        
	       
	        
	      
	        int noOfSnakes =0;
	        String stringsnake  = JOptionPane.showInputDialog(
	        new JFrame(),
	        "Please Enter the number of Snakes : ",""); 
	        if(stringsnake == null)
	        {
	        	return;
	        }
	        noOfSnakes = Integer.parseInt(stringsnake);
	        
	        
	        
	        int noOfLadders =0;
	        String stringladder = JOptionPane.showInputDialog(
	        new JFrame(),
	        "Please Enter the number of Ladders : ","");
	        
	        if(stringladder == null)
	        {
	        	return;
	        }
	        noOfLadders = Integer.parseInt(stringladder);
	        
	        if(noOfSnakes>(cus.setRows/2+2)||noOfLadders>(cus.setRows/2+2)){
	            JOptionPane.showMessageDialog(new JFrame(),"Number of Snakes or Ladders is too high!!!", "Error Message", JOptionPane.ERROR_MESSAGE);  
	            cus.customBoard(cus.setRows/2, cus.setRows/2);
	            return;
	        }
	        
	        
	       
	        if (JOptionPane.showConfirmDialog(new JFrame(),
	        "Do you want to set new positions of Snakes and Ladders ?", "Customize",
	        JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
	          
	            cus.snakes.clear();
	            cus.ladders.clear();
	            for(int q=0; q<noOfSnakes; q++){
	                cus.tempSnake = (new SnakeSquare());
	                int snakeFrom=0;
	                String stringSnakeFrom = JOptionPane.showInputDialog(
	                new JFrame(),
	                "Please Enter the starting position of snake "+q+" : ",""); 
	                if(stringSnakeFrom == null)
	    	        {
	    	        	return;
	    	        }
	                snakeFrom = Integer.parseInt(stringSnakeFrom);
	                
	                
	                int snakeTo=0;
	                String stringSnakeTo = JOptionPane.showInputDialog(
	                new JFrame(),
	                "Please Enter the end position of snake "+q+" : ","");
	                if(stringSnakeTo == null)
	    	        {
	    	        	return;
	    	        }
	                snakeTo = Integer.parseInt(stringSnakeTo);
	                cus.tempSnake.setSnake(snakeFrom, snakeTo);
	                cus.snakes.add(cus.tempSnake);
	                
	            }
	         
	            for(int q=0;q<noOfLadders;q++){
	                cus.tempLadder = (new LadderSquare());
	                
	                
	                int ladderFrom =0;
	                String StringLadderFrom = JOptionPane.showInputDialog(
	                new JFrame(),
	                "Please Enter the starting position of ladder "+q+" : ","");
	                if(StringLadderFrom == null)
	    	        {
	    	        	return;
	    	        }
	                ladderFrom = Integer.parseInt(StringLadderFrom);
	                
	                int ladderTo = 0;
	                String stringLadderTo = JOptionPane.showInputDialog(
	                new JFrame(),
	                "Please Enter the end position of ladder "+q+" : ","");
	                if(stringLadderTo == null)
	    	        {
	    	        	return;
	    	        }
	                ladderTo = Integer.parseInt(stringLadderTo);
	                cus.tempLadder.setLadders(ladderFrom, ladderTo);
	                cus.ladders.add(cus.tempLadder);
	                
	            }
	        }
	        else{
	            cus.customBoard(noOfSnakes, noOfLadders); 
	       
	           
	        }	
		}
		   catch (NumberFormatException  IME) {
			   IME.printStackTrace();
			   JOptionPane.showMessageDialog(null, "Numbers Only!");
			   
		   }
    }
    
    
   
    public void highScoresButton(java.awt.event.ActionEvent evt) {
    	HighscoreFrame.setSize(450, 400);
    	HighscoreFrame.setVisible(true);  
    	HighscoreFrame.getContentPane().setBackground(Color.BLUE);
    	printHighScores();  
    }

   
    public void helpButton(java.awt.event.ActionEvent evt) {
    	helpFrame.getContentPane().setBackground(Color.BLUE);
    	helpFrame.setSize(870, 700);  
    	helpFrame.setVisible(true); 
    }

    
    public void twoPlayersButton(java.awt.event.ActionEvent evt) {
        player.setNoOfPlayers(2); 
        player.setPlayer1(JOptionPane.showInputDialog(
        new JFrame(),"Please Enter the name of Player 1 : ","")); 
        player.setPlayer2(JOptionPane.showInputDialog(
        new JFrame(),"Please Enter the name of Player 2 : ","")); 
        startPlay(2); 
    }

   
    public void backMainMenuButton(java.awt.event.ActionEvent evt) {
        playersFrame.setVisible(false); 
        setVisible(true);
    }

    CustomizeBoard cus = null; 
    GridComp comp = null;
    GameGrid play = null; 
    Player player=null;   
    int highScoreValue=0;
    
    public void setVisibility(boolean s){
        setVisible(s); 
    }
    
    public void setClasses(CustomizeBoard customise, Player players){
        cus=customise;  
        player=players; 
        
    }
    
    
    public void startPlay(int HumanPlayers){
        playersFrame.setVisible(false); 
        play = new GameGrid(cus);  
        play.setVisibility(true); 
        play.setClasses(cus, this,player);
        if(HumanPlayers==2){ 
        	play.setNamesInTextField(player.getPlayerName(0),player.getPlayerName(1));
            play.setButton3Visible(false);
        }
        
        cus.setClasses(player, play, null);
        cus.createSnakesAndLadder();
        String message = "Start the Game!!!\n"+player.getPlayerName(0)+" begins the game.";
        JOptionPane.showMessageDialog(new JFrame(), message, "Start", JOptionPane.INFORMATION_MESSAGE); 
        
    }
    
   
    public void setScoreCardFrameVisible(boolean b){
        if(b==false){
            return;
        }
        HighscoreFrame.setSize(450, 400);
        HighscoreFrame.setVisible(true); 
    }
    
    
   
    public void printHighScores(){
        
        ArrayList<GameScore> oldScores = new ArrayList<>();      
       
        try {
            FileInputStream fileStream = new FileInputStream("HighScoreList.ser");
            try (ObjectInputStream os = new ObjectInputStream(fileStream)) {
                Object one = os.readObject();
                oldScores = (ArrayList<GameScore>)one;
            }
        } catch (IOException ex) {
            
        	try {
                FileOutputStream fileStream = new FileOutputStream("HighScoreList.ser");
                ObjectOutputStream os = new ObjectOutputStream(fileStream);
                os.writeObject(oldScores);            
                os.close();
            } catch (IOException ef) {
                System.out.println("\nFile Not Found!!!");
                ef.printStackTrace();
            }
        }catch(ClassNotFoundException ec){
            System.out.println("\nClass Not Found!!!");
            ec.printStackTrace(); 
        }
        Collections.sort(oldScores);
        int i=0;
        int size=oldScores.size();
        for(int k=0;k<size;k++){  
            if(i>=10){
               oldScores.remove(i);
               size--;
            }
            i++;
        }
        i=0;
        for(GameScore score : oldScores){
            if(i==9){
                highScoreValue = score.playerMoves;
            }
            if(i>=10){
                break; 
            }
            scoreTable.getModel().setValueAt(i+1, i, 0);  
            scoreTable.getModel().setValueAt(score.name+" ", i, 1); 
            scoreTable.getModel().setValueAt(score.playerMoves, i, 2);
            scoreTable.getModel().setValueAt(score.dimension, i, 3);
            i++;
        }
       
        try {
            FileOutputStream fileStream = new FileOutputStream("HighScoreList.ser");
            ObjectOutputStream os = new ObjectOutputStream(fileStream);
            os.writeObject(oldScores);            
            os.close();
        } catch (IOException ex) {
            System.out.println("\nFile Not Found!!!"); 
            ex.printStackTrace(); 
        }      
    }
    
    
    
    
}
