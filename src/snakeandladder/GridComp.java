package snakeandladder;



import java.awt.Color;
import java.awt.Dimension;
import java.util.Random;

import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;


public class GridComp extends javax.swing.JFrame{
	
	
	private javax.swing.JLabel bluePlayerLabel;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JLabel greenPlayerLabel;
    private javax.swing.JLabel imageLabelPlayer1;
    private javax.swing.JLabel imageLabelPlayer2;

    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JMenuItem newGameMenuItem;
    private javax.swing.JLabel playersTurnLabel;
    private javax.swing.JButton rollDiceButton;
    private javax.swing.JButton Restart;
    private javax.swing.JMenuItem scoreCardMenuItem;
    private javax.swing.JLabel pinkPlayerLabel;
    private javax.swing.JLabel diceString;


	
    public GridComp() {
        setRows=5; 
        setColumns=5;
        grid = new JLabel[setColumns*setRows]; 
        GUI(); 
    }
    public GridComp(CustomizeBoard cus) { 
        this.cus=cus;
        setRows=cus.getRows(); 
        setColumns=cus.getColumns();  
        grid = new JLabel[setColumns*setRows]; 
        for(int i=0;i<setColumns*setRows;i++){
            grid[i] = new JLabel();
        }
        GUI(); 
      
    }

    
    @SuppressWarnings("unchecked")
    public void GUI() {

        jPanel1 = new javax.swing.JPanel();
        rollDiceButton = new javax.swing.JButton();
        imageLabelPlayer1 = new javax.swing.JLabel();
        imageLabelPlayer2 = new javax.swing.JLabel();
  
        playersTurnLabel = new javax.swing.JLabel();
        greenPlayerLabel = new javax.swing.JLabel();
        pinkPlayerLabel = new javax.swing.JLabel();
        bluePlayerLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        newGameMenuItem = new javax.swing.JMenuItem();
        scoreCardMenuItem = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        Restart = new javax.swing.JButton();
        diceString = new javax.swing.JLabel();
        Icon dice1;
        

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1500, 1500));

       
        rollDiceButton.setText("Roll Dice"); 
        rollDiceButton.setBackground(new java.awt.Color(240,128,128));
        rollDiceButton.addActionListener(new java.awt.event.ActionListener() { 
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	
            	try {
            	    rollDiceButton(evt); 
            	    rollDiceButton(evt); 
            	    Thread.sleep(1000);
            	
            	} catch (InterruptedException e) {
            	    e.printStackTrace();
            	}
            	
            }
        });
        
        Restart.setText("Restart Game"); 
        Restart.setBackground(new java.awt.Color(124,252,0));
        Restart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) { 
            	newGameMenuItem(evt);
           
            }
        });

        
     

        imageLabelPlayer1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/snakeandladder/images/button1s.png"))); 
        imageLabelPlayer2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/snakeandladder/images/button2.png")));
     


        playersTurnLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        greenPlayerLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        pinkPlayerLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        bluePlayerLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        jPanel1.setBackground(Color.YELLOW); 
        
        

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
        	
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
               
                .addComponent(rollDiceButton, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)       
               .addComponent(diceString, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Restart, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)               
                .addComponent(playersTurnLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(imageLabelPlayer1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(greenPlayerLabel)
                .addGap(18, 18, 18)
                .addComponent(imageLabelPlayer2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pinkPlayerLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
     
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bluePlayerLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
        		
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(greenPlayerLabel) 
                    .addComponent(pinkPlayerLabel) )
            
                )
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(playersTurnLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rollDiceButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Restart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(diceString, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(imageLabelPlayer2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
           
                    .addComponent(imageLabelPlayer1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setLayout(new java.awt.GridLayout(setRows, setColumns));

       
        jMenu1.setBackground(new java.awt.Color(176,196,222));
        jMenu1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 255, 102), new java.awt.Color(102, 255, 0), null, null));
        jMenu1.setForeground(new java.awt.Color(153, 0, 153));
        jMenu1.setText("File");   
        
       

        newGameMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        newGameMenuItem.setText("New Game");  
        newGameMenuItem.setBackground(new java.awt.Color(0,255,127));
        newGameMenuItem.addActionListener(new java.awt.event.ActionListener() { 
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	newGameMenuItem(evt);         
            }
        });
        jMenu1.add(newGameMenuItem);

        scoreCardMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        scoreCardMenuItem.setText("Score Card");
        scoreCardMenuItem.setBackground(new java.awt.Color(250,128,114));
        scoreCardMenuItem.addActionListener(new java.awt.event.ActionListener() { 
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	scoreCardMenuItem(evt); 
           
            }
        });
        jMenu1.add(scoreCardMenuItem);

        exitMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        exitMenuItem.setText("Exit"); 
        exitMenuItem.setBackground(new java.awt.Color(245,245,220));
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() { 
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	exitMenuItem(evt); 
            
            }
        });
        
        jMenu1.add(exitMenuItem);
        jMenuBar1.add(jMenu1);
        setJMenuBar(jMenuBar1);

     
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup( 
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
           
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        layout.setVerticalGroup( 
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)));
        pack(); 
        
    }
    
    
    
    

    public void rollDiceButton(java.awt.event.ActionEvent evt) {
        
        if(player.won==1){
            return;
        }
        
        Random randomGenerator = new Random(); 
        int random = randomGenerator.nextInt(6)+1; 
        System.out.println(random); 
        
       
 
        if(random == 1){
        	diceString.setIcon(getImage(30));
        }
        if(random ==2){
        	diceString.setIcon(getImage(31));
        }
        if(random ==3){
        	diceString.setIcon(getImage(32));
        }
        if(random ==4){
        	diceString.setIcon(getImage(33));
        	
        }
        if(random ==5){
        	diceString.setIcon(getImage(34));
        }
        if(random ==6){
        	diceString.setIcon(getImage(35));
        }
        
    
        diceString.setBounds(0, 170, 1000, 400);
        
        if(player.checkValidity(player.turn, random)==0){
            player.setMoves(player.turn); 
            player.setTurn();
            return;
        }
   
     
        random = cus.eatenBySnake(random,player.getLocation(player.turn)-random); 
      
        random = cus.climbLadder(random,player.getLocation(player.turn)-random);
        if(player.checkValidity(player.turn, random)==0){
            player.setMoves(player.turn);
            player.setTurn(); 
            return;
        }  
        
        
        if(grid[player.getLocation(player.turn)].getIcon()==getImage(6)){
            if(player.turn==0){
               grid[player.getLocation(player.turn)].setIcon(getImage(23));
            }
            if(player.turn==1){
               grid[player.getLocation(player.turn)].setIcon(getImage(13));
            }
            if(player.turn==2){
               grid[player.getLocation(player.turn)].setIcon(getImage(12));
            }
        }
        else if(grid[player.getLocation(player.turn)].getIcon()==getImage(3)){
            if(player.turn==0){
                grid[player.getLocation(player.turn)].setIcon(getImage(1));
            }
            else{
                grid[player.getLocation(player.turn)].setIcon(getImage(0));
            }
        }
        
        else if(grid[player.getLocation(player.turn)].getIcon()==getImage(4)){
            if(player.turn==1){
                grid[player.getLocation(player.turn)].setIcon(getImage(2));
            }
            else{
                grid[player.getLocation(player.turn)].setIcon(getImage(1));
            }
        }
        else if(grid[player.getLocation(player.turn)].getIcon()==getImage(5)){
            if(player.turn==0){
                grid[player.getLocation(player.turn)].setIcon(getImage(2));
            }
            else{
                grid[player.getLocation(player.turn)].setIcon(getImage(0));
            }
        }
        else{
            grid[player.getLocation(player.turn)].setIcon(null);
        }  

        player.setLocation(player.turn, random);
        
        if(grid[player.getLocation(player.turn)].getIcon()!=null){
            checkTheButtons();
        }
        else{
            grid[player.getLocation(player.turn)].setIcon(getImage(player.turn));
        }
        player.setMoves(player.turn);
        player.setTurn();
        playersTurnLabel.setText(player.getPlayerName(player.turn) +" its your turn now");}
  


    public void scoreCardMenuItem(java.awt.event.ActionEvent evt) {
        menu.printHighScores(); 
        menu.setScoreCardFrameVisible(true); 
    }

    public void exitMenuItem(java.awt.event.ActionEvent evt) {
        System.exit(0);   
    }

   
    private void newGameMenuItem(java.awt.event.ActionEvent evt) {
        setVisibility(false);        
        menu = new GameMenu(); 
        cus = new CustomizeBoard();
        player = new Player(); 
        menu.setClasses(cus, player);
        cus.setClasses(player, null, null);
        menu.setVisibility(true);
        menu.printHighScores();
    }
    
    CustomizeBoard cus =null;
    GameMenu menu = null;    
    Player player = new Player();
    int setRows, setColumns;
    javax.swing.JLabel[] grid;
    Icon previousIcon=null;
    int twoSame=0,threeSame=0;
    GameImages t =new GameImages();
    
   
    public void showGrids(){
        
       setRows=cus.getRows(); setColumns=cus.getColumns();
       if(cus.getRows()>=4){ 
           setSize(1500+setRows*20, 1000); 
           
       }
       else{
           setSize(500+setRows*44, 350+setColumns*40);  
       }
       
       for(int i=0;i<setColumns*setRows;i++){
           
           
           grid[i].setBackground(Color.ORANGE);
           
           grid[i].setOpaque(true);
           grid[i].setBorder(BorderFactory.createLineBorder(Color.BLUE));
           
           grid[i].setHorizontalAlignment(SwingConstants.RIGHT);
           grid[i].setVerticalAlignment(SwingConstants.BOTTOM);
           grid[i].setText(setColumns*setRows-i+"");
           jPanel2.add(grid[i]); 
       }       
    }
    
   
    public void setVisibility(boolean s){
        if(s==true){
            showGrids();
            setVisible(true);      
        }
        else{
            setVisible(false); 
        }
    }
    
   
    public void setClasses(CustomizeBoard c, GameMenu m, Player p){
        cus=c;
        menu=m;
        player=p;
        player.setClasses(cus,menu);
    }
    
    public void setButton3Visible(boolean b){
        imageLabelPlayer1.setVisible(true);
        imageLabelPlayer2.setVisible(true);

        if(b==false){
            grid[cus.setColumns*cus.setRows-1].setIcon(getImage(3));
        }
        else{
            grid[cus.setColumns*cus.setRows-1].setIcon(getImage(6));
        }
    }
   
    public Icon getImage(int i){
        switch(i){
            case 0 : 
                return imageLabelPlayer1.getIcon();                
            case 1 :
                return imageLabelPlayer2.getIcon();
      
            case 3 :
                return t.getTwoLabel().getIcon();
            case 4 :
                return t.get23Button().getIcon();
            case 5 :
                return t.get13Button().getIcon();
            case 6 :
                return t.getThreeLabel().getIcon();   
            case 12 :
                return t.getTwoLabel().getIcon();
            case 23 :
                return t.get23Button().getIcon();
            case 13 :
                return t.get13Button().getIcon();
      
            	
        }
        return null;
    }
   
    public void checkTheButtons(){
        if(grid[player.getLocation(player.turn)].getIcon()==getImage(0)){
            if(player.turn==1){
                grid[player.getLocation(player.turn)].setIcon(getImage(12));
            }
            else{
                grid[player.getLocation(player.turn)].setIcon(getImage(13));
            }
        }
        
        else if(grid[player.getLocation(player.turn)].getIcon()==getImage(1)){
            if(player.turn==0){
                grid[player.getLocation(player.turn)].setIcon(getImage(12));
            }
            else{
                grid[player.getLocation(player.turn)].setIcon(getImage(23));
            }
        }
        else if(grid[player.getLocation(player.turn)].getIcon()==getImage(2)){
            if(player.turn==0){
                grid[player.getLocation(player.turn)].setIcon(getImage(13));
            }
            else{
                grid[player.getLocation(player.turn)].setIcon(getImage(23));
            }
        }
        else if(grid[player.getLocation(player.turn)].getIcon()==getImage(3)){
            grid[player.getLocation(player.turn)].setIcon(getImage(6));
        }
        else if(grid[player.getLocation(player.turn)].getIcon()==getImage(4)){
            grid[player.getLocation(player.turn)].setIcon(getImage(6));
        }
        else if(grid[player.getLocation(player.turn)].getIcon()==getImage(5)){
            grid[player.getLocation(player.turn)].setIcon(getImage(6));
        }
        else{
            grid[player.getLocation(player.turn)].setIcon(null);
        }
    }
    
    
    public void setNamesInTextField(String p1, String p2){
        if(player.getNoOfPlayers()==2){
            greenPlayerLabel.setText(p1);
            pinkPlayerLabel.setText(p2);
           
            
        }
    
        else if(player.getNoOfPlayers()==2){
            greenPlayerLabel.setText(p1);
         
          
        }
    }
 
    
}