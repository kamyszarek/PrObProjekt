 /**
 * pakiet zawierający klasy i metody odpowiedzialne za wizualizację ruchu planet i interakcję z użytkwonikiem
 */
package graficzne;

import java.awt.List;
import java.awt.Point;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import probprojekt.Planet;

/**
 * klasa do wizualizacji ruchu planet i interakcji z użytkownikiem
 * @author Arek
 * @author Jakub
 * @author Karol
 */
public class Uklad extends javax.swing.JFrame {
    
    /**
     * zmienna określająca czy planety znajdują sie w danej chwili w ruchu
     */
    boolean is_move=true;
    /**
     * zmienna pomocnicza określająca czy planety są w ruchu
     */
    boolean startstop = false;

    
    /**
     * zmienna określająca prędkość planety Merkury
     */
    int speed_mercury; 
    /**
     * zmienna określająca prędkość planety Wenus
     */
    int speed_venus;
    /**
     * zmienna określająca prędkość planety Ziemia
     */
    int speed_earth;
    /**
     * zmienna określająca prędkość planety Mars
     */
    int speed_mars;
    /**
     * zmienna określająca prędkość planety Jowisz
     */
    int speed_jupiter;
    /**
     * zmienna określająca prędkość planety Saturn
     */
    int speed_saturn;
    /**
     * zmienna określająca prędkość planety Uran
     */
    int speed_uranus;
    /**
     * zmienna określająca prędkość planety Neptun
     */
    int speed_neptun;
    
    Planet p_mercury = Planet.builder()
                    .promien(100) 
                    .speed(1)                                 
                    .degrees(0.5f)
                    .masa(1000)
                    .build();
    Planet p_venus = Planet.builder()
                    .promien(150) 
                    .speed(1)                                 
                    .degrees(0.5f)
                    .masa(2200)
                    .build();
    Planet p_earth = Planet.builder()
                    .promien(200) 
                    .speed(1)                                 
                    .degrees(0.5f)
                    .masa(2000)
                    .build();
    Planet p_mars = Planet.builder()
                    .promien(250) 
                    .speed(1)                                 
                    .degrees(0.5f)
                    .masa(1800)
                    .build();
    Planet p_jupiter = Planet.builder()
                    .promien(300) 
                    .speed(1)                                 
                    .degrees(0.5f)
                    .masa(3000)
                    .build();
    Planet p_saturn = Planet.builder()
                    .promien(350) 
                    .speed(1)                                 
                    .degrees(0.5f)
                    .masa(2500)
                    .build();
    Planet p_uranus = Planet.builder()
                    .promien(400) 
                    .speed(1)                                 
                    .degrees(0.5f)
                    .masa(1300)
                    .build();
    Planet p_neptun = Planet.builder()
                    .promien(450) 
                    .speed(1)                                 
                    .degrees(0.5f)
                    .masa(1200)
                    .build();

    /**
     * Wątek w którym realizowany jest ruch planet
     */
    Thread animationThread;


    /**
     * Creates new form uklad
     */
    public Uklad() {
        initComponents();
        moveThread();
        
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        mercury = new javax.swing.JLabel();
        venus = new javax.swing.JLabel();
        earth = new javax.swing.JLabel();
        mars = new javax.swing.JLabel();
        jupiter = new javax.swing.JLabel();
        saturn = new javax.swing.JLabel();
        uranus = new javax.swing.JLabel();
        neptun = new javax.swing.JLabel();
        start_move = new javax.swing.JButton();
        stop_move = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        pole_mercury = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        pole_venus = new javax.swing.JTextField();
        pole_earth = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        pole_mars = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        pole_jupiter = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        pole_saturn = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        pole_uranus = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        pole_neptun = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setPreferredSize(new java.awt.Dimension(1200, 1000));
        jPanel2.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graficzne/sun.png"))); // NOI18N
        jPanel2.add(jLabel1);
        jLabel1.setBounds(450, 450, 100, 100);

        mercury.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graficzne/mercury.PNG"))); // NOI18N
        mercury.setText("jLabel3");
        jPanel2.add(mercury);
        mercury.setBounds(480, 380, 40, 40);

        venus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graficzne/venus.PNG"))); // NOI18N
        jPanel2.add(venus);
        venus.setBounds(480, 330, 40, 40);

        earth.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graficzne/earth.png"))); // NOI18N
        jPanel2.add(earth);
        earth.setBounds(480, 280, 40, 40);

        mars.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graficzne/mars.png"))); // NOI18N
        jPanel2.add(mars);
        mars.setBounds(480, 230, 40, 40);

        jupiter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graficzne/jupiter.png"))); // NOI18N
        jPanel2.add(jupiter);
        jupiter.setBounds(480, 180, 40, 40);

        saturn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graficzne/saturn.png"))); // NOI18N
        jPanel2.add(saturn);
        saturn.setBounds(475, 130, 50, 50);

        uranus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graficzne/uranus.PNG"))); // NOI18N
        jPanel2.add(uranus);
        uranus.setBounds(480, 80, 40, 40);

        neptun.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graficzne/neptun.PNG"))); // NOI18N
        jPanel2.add(neptun);
        neptun.setBounds(480, 30, 40, 40);

        start_move.setText("START");
        start_move.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                start_moveMouseClicked(evt);
            }
        });
        jPanel2.add(start_move);
        start_move.setBounds(1040, 720, 120, 40);

        stop_move.setText("STOP");
        stop_move.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                stop_moveMouseClicked(evt);
            }
        });
        jPanel2.add(stop_move);
        stop_move.setBounds(1040, 780, 120, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graficzne/cosmos.jpg"))); // NOI18N
        jPanel2.add(jLabel2);
        jLabel2.setBounds(0, 0, 1000, 1000);

        jLabel3.setText("Merkury");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(1080, 50, 90, 16);

        pole_mercury.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        pole_mercury.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pole_mercuryKeyPressed(evt);
            }
        });
        jPanel2.add(pole_mercury);
        pole_mercury.setBounds(1060, 80, 90, 30);

        jLabel4.setText("Wenus");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(1080, 130, 90, 16);

        pole_venus.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        pole_venus.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pole_venusKeyPressed(evt);
            }
        });
        jPanel2.add(pole_venus);
        pole_venus.setBounds(1060, 160, 90, 30);

        pole_earth.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        pole_earth.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pole_earthKeyPressed(evt);
            }
        });
        jPanel2.add(pole_earth);
        pole_earth.setBounds(1060, 240, 90, 30);

        jLabel5.setText("Ziemia");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(1080, 210, 90, 16);

        pole_mars.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        pole_mars.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pole_marsKeyPressed(evt);
            }
        });
        jPanel2.add(pole_mars);
        pole_mars.setBounds(1060, 320, 90, 30);

        jLabel6.setText("Mars");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(1090, 290, 90, 16);

        pole_jupiter.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        pole_jupiter.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pole_jupiterKeyPressed(evt);
            }
        });
        jPanel2.add(pole_jupiter);
        pole_jupiter.setBounds(1060, 400, 90, 30);

        jLabel7.setText("Saturn");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(1080, 450, 90, 16);

        jLabel8.setText("Jowisz");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(1080, 370, 90, 16);

        pole_saturn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        pole_saturn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pole_saturnKeyPressed(evt);
            }
        });
        jPanel2.add(pole_saturn);
        pole_saturn.setBounds(1060, 480, 90, 30);

        jLabel9.setText("Uran");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(1090, 530, 90, 16);

        pole_uranus.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        pole_uranus.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pole_uranusKeyPressed(evt);
            }
        });
        jPanel2.add(pole_uranus);
        pole_uranus.setBounds(1060, 560, 90, 30);

        jLabel10.setText("Neptun");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(1080, 610, 90, 16);

        pole_neptun.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        pole_neptun.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pole_neptunKeyPressed(evt);
            }
        });
        jPanel2.add(pole_neptun);
        pole_neptun.setBounds(1060, 640, 90, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    /**
     * naciśnięcie przycisku START
     * @param evt kliknięcie myszą
     */
    private void start_moveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_start_moveMouseClicked

        preparePlanets();

        startstop=true;
       
     
        
    }//GEN-LAST:event_start_moveMouseClicked

    /**
     * wpisywanie w polu prędkości dla planety Merkury
     * @param evt wciśnięcie klawisza
     */
    private void pole_mercuryKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pole_mercuryKeyPressed
        char c = evt.getKeyChar();
        
        if(Character.isLetter(c) || Character.isWhitespace(c) ) {
            
            pole_mercury.setEditable(false);
        } else
        {
            pole_mercury.setEditable(true);
        }
    }//GEN-LAST:event_pole_mercuryKeyPressed

    /**
     * wpisywanie w polu prędkości dla planety Wenus
     * @param evt wciśnięcie klawisza
     */
    private void pole_venusKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pole_venusKeyPressed
        char c = evt.getKeyChar();
        
        if(Character.isLetter(c) || Character.isWhitespace(c) ) {
            
            pole_venus.setEditable(false);
        } else
        {
            pole_venus.setEditable(true);
        }
    }//GEN-LAST:event_pole_venusKeyPressed

    /**
     * wpisywanie w polu prędkości dla planety Ziemia
     * @param evt wciśnięcie klawisza
     */
    private void pole_earthKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pole_earthKeyPressed
        char c = evt.getKeyChar();
        
        if(Character.isLetter(c) || Character.isWhitespace(c) ) {
            
            pole_earth.setEditable(false);
        } else
        {
            pole_earth.setEditable(true);
        }
    }//GEN-LAST:event_pole_earthKeyPressed

    /**
     * wpisywanie w polu prędkości dla planety Mars
     * @param evt wciśnięcie klawisza
     */
    private void pole_marsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pole_marsKeyPressed
        char c = evt.getKeyChar();
        
        if(Character.isLetter(c) || Character.isWhitespace(c) ) {
            
            pole_mars.setEditable(false);
        } else
        {
            pole_mars.setEditable(true);
        }
    }//GEN-LAST:event_pole_marsKeyPressed

    /**
     * wpisywanie w polu prędkości dla planety Jowisz
     * @param evt wciśnięcie klawisza
     */
    private void pole_jupiterKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pole_jupiterKeyPressed
        char c = evt.getKeyChar();
        
        if(Character.isLetter(c) || Character.isWhitespace(c) ) {
            
            pole_jupiter.setEditable(false);
        } else
        {
            pole_jupiter.setEditable(true);
        }
    }//GEN-LAST:event_pole_jupiterKeyPressed

    /**
     * wpisywanie w polu prędkości dla planety Saturn
     * @param evt wciśnięcie klawisza
     */
    private void pole_saturnKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pole_saturnKeyPressed
        char c = evt.getKeyChar();
        
        if(Character.isLetter(c) || Character.isWhitespace(c) ) {
            
            pole_saturn.setEditable(false);
        } else
        {
            pole_saturn.setEditable(true);
        }
    }//GEN-LAST:event_pole_saturnKeyPressed

    /**
     * wpisywanie w polu prędkości dla planety Uran
     * @param evt wciśnięcie klawisza
     */
    private void pole_uranusKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pole_uranusKeyPressed
        char c = evt.getKeyChar();
        
        if(Character.isLetter(c) || Character.isWhitespace(c) ) {
            
            pole_uranus.setEditable(false);
        } else
        {
            pole_uranus.setEditable(true);
        }
    }//GEN-LAST:event_pole_uranusKeyPressed

    /**
     * wpisywanie w polu prędkości dla planety Neptun
     * @param evt wciśnięcie klawisza
     */
    private void pole_neptunKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pole_neptunKeyPressed
         char c = evt.getKeyChar();
        
        if(Character.isLetter(c) || Character.isWhitespace(c) ) {
            
            pole_neptun.setEditable(false);
        } else
        {
            pole_neptun.setEditable(true);
        }
    }//GEN-LAST:event_pole_neptunKeyPressed

    /**
     * naciśnięciu STOP przez użytkownika
     * @param evt kliknięcie myszą
     */
    private void stop_moveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stop_moveMouseClicked
   
        startstop=false;

    }//GEN-LAST:event_stop_moveMouseClicked

    /**
     * metoda main
     * @param args the command line arguments
     */

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Uklad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Uklad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Uklad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Uklad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Uklad().setVisible(true);
            }
        });
    }
    
    /**
     * metoda ustawiająca pozycję planet
     * @param radius zmienna stosowana we wzorze do ruchu po okręgu
     * @param degrees zmienna stosowana we wzorze do ruchu po okręgu
     * @return 0
     */
    public int move_planet(int radius, double degrees) {

            /**
             * zmienna pozwalająca wyliczać nowe pozycje planety
             */
            int x = Math.round(480);
            /**
             * zmienna pozwalająca wyliczać nowe pozycje planety
             */
            int y = Math.round(480);

            /**
             * zmienna określająca o ile stopni ma się zmienić pozycja planety w następnej iteracji
             */
            double rads = Math.toRadians(degrees - 90); 

            /**
             * zmienna określająca nową pozycję X planety
             */
            int xPosy = setXPos(radius, x, rads);
            /**
             * zmienna określająca nową pozycję Y planety
             */
            int yPosy = setYPos(radius, y, rads);

            switch(radius) {
                case 100: mercury.setBounds(xPosy, yPosy, 40, 40); break;
                case 150: venus.setBounds(xPosy, yPosy, 40, 40); break;
                case 200: earth.setBounds(xPosy, yPosy, 40, 40); break;
                case 250: mars.setBounds(xPosy, yPosy, 40, 40); break;
                case 300: jupiter.setBounds(xPosy, yPosy, 40, 40); break;
                case 350: saturn.setBounds(xPosy, yPosy, 50, 40); break;
                case 400: uranus.setBounds(xPosy, yPosy, 40, 40); break;
                case 450: neptun.setBounds(xPosy, yPosy, 40, 40); break;
                default :
            }        
         return y;
        }
    
    /**
     * metoda zwracająca nową pozycję X planety
     * @param radius promień orbity planety
     * @param x zakres zmiany
     * @param rads stopnie kątowe
     * @return pozycja X planety
     */
    public int setXPos(int radius, int x, double rads){
        
        int xPos = Math.round((float) (x + Math.cos(rads) * radius));
        
        return xPos;
    }
    
    /**
     * metoda zwracająca nową pozycję Y planety
     * @param radius promień orbity planety
     * @param y zakres zmiany
     * @param rads stopnie kątowe
     * @return pozycja Y planety
     */
    public int setYPos(int radius, int y, double rads){
        
        int yPos = Math.round((float) (y + Math.sin(rads) * radius));
        
        return yPos;
    }
    
    /**
    * metoda przygotowująca planety do ruchu po naciśnięciu przycisku START
    */
    public void preparePlanets() {
        /**
         * podana prędkość przez usera dla planety Merkury
         */
        String kat = pole_mercury.getText();    
       if(kat.length()==0){speed_mercury=1; pole_mercury.setText("1");}
       else speed_mercury = Integer.parseInt(kat);       
       p_mercury.setSpeed(speed_mercury);
       
        /**
         * podana prędkość przez usera dla planety Wenus
         */
       String kat_venus = pole_venus.getText();    
       if(kat_venus.length()==0){ speed_venus=1; pole_venus.setText("1");}
       else speed_venus = Integer.parseInt(kat_venus);     
       p_venus.setSpeed(speed_venus);
       
        /**
         * podana prędkość przez usera dla planety Ziemia
         */
       String kat_earth = pole_earth.getText();    
       if(kat_earth.length()==0){ speed_earth=1; pole_earth.setText("1");}
       else speed_earth = Integer.parseInt(kat_earth);      
       p_earth.setSpeed(speed_earth);
       
        /**
         * podana prędkość przez usera dla planety Mars
         */
       String kat_mars = pole_mars.getText();    
       if(kat_mars.length()==0){ speed_mars=1; pole_mars.setText("1");}
       else speed_mars = Integer.parseInt(kat_mars);      
       p_mars.setSpeed(speed_mars);
       
        /**
         * podana prędkość przez usera dla planety Jowisz
         */
       String kat_jupiter = pole_jupiter.getText();    
       if(kat_jupiter.length()==0){ speed_jupiter=1; pole_jupiter.setText("1"); }
       else speed_jupiter = Integer.parseInt(kat_jupiter);      
       p_jupiter.setSpeed(speed_jupiter);
       
        /**
         * podana prędkość przez usera dla planety Saturn
         */
       String kat_saturn = pole_saturn.getText();    
       if(kat_saturn.length()==0){ speed_saturn=1; pole_saturn.setText("1");}
       else speed_saturn = Integer.parseInt(kat_saturn);       
       p_saturn.setSpeed(speed_saturn);
       
        /**
         * podana prędkość przez usera dla planety Saturn
         */
       String kat_uranus = pole_uranus.getText();    
       if(kat_uranus.length()==0){ speed_uranus=1; pole_uranus.setText("1");}
       else speed_uranus = Integer.parseInt(kat_uranus);      
       p_uranus.setSpeed(speed_uranus);
       
        /**
         * podana prędkość przez usera dla planety Neptun
         */
       String kat_neptun = pole_neptun.getText();    
       if(kat_neptun.length()==0){ speed_neptun=1; pole_neptun.setText("1");}
       else speed_neptun = Integer.parseInt(kat_neptun);
       
       p_neptun.setSpeed(speed_neptun);
    }
    
    
    /**
     * Ruch planet realizowany w wątku co 20 milisekund
     */
    public void moveThread() {
                   
                animationThread = new Thread(new Runnable() {          
                    public void run() {                    
                        while(true) {
                            if(startstop){
                                try{
                                    is_move=false;

                                    Thread.sleep(20);

                                    move_planet(p_mercury.getPromien(), p_mercury.getDegrees()); 
                                    p_mercury.setDegrees(p_mercury.getDegrees() + p_mercury.getSpeed()*(1000 / (float)p_mercury.getMasa()));

                                    move_planet(p_venus.getPromien(), p_venus.getDegrees()); 
                                    p_venus.setDegrees(p_venus.getDegrees() + p_venus.getSpeed()*(1000 / (float)p_venus.getMasa()));

                                    move_planet(p_earth.getPromien(), p_earth.getDegrees()); 
                                    p_earth.setDegrees(p_earth.getDegrees() + p_earth.getSpeed()*(1000 / (float)p_earth.getMasa()));

                                    move_planet(p_mars.getPromien(), p_mars.getDegrees()); 
                                    p_mars.setDegrees(p_mars.getDegrees() + p_mars.getSpeed()*(1000 / (float)p_mars.getMasa()));

                                    move_planet(p_jupiter.getPromien(), p_jupiter.getDegrees()); 
                                    p_jupiter.setDegrees(p_jupiter.getDegrees() + p_jupiter.getSpeed()*(1000 / (float)p_jupiter.getMasa()));

                                    move_planet(p_saturn.getPromien(), p_saturn.getDegrees()); 
                                    p_saturn.setDegrees(p_saturn.getDegrees() + p_saturn.getSpeed()*(1000 / (float)p_saturn.getMasa()));

                                    move_planet(p_uranus.getPromien(), p_uranus.getDegrees()); 
                                    p_uranus.setDegrees(p_uranus.getDegrees() + p_uranus.getSpeed()*(1000 / (float)p_uranus.getMasa()));

                                    move_planet(p_neptun.getPromien(), p_neptun.getDegrees()); 
                                    p_neptun.setDegrees(p_neptun.getDegrees() + p_neptun.getSpeed()*(1000 / (float)p_neptun.getMasa()));

                                }catch(Exception e) {
                                    System.err.println(e);
                                }
                            } 
                            else {
                                try{
                                    is_move=false;

                                    Thread.sleep(20);

                                    move_planet(p_mercury.getPromien(), p_mercury.getDegrees()); 
                                    p_mercury.setDegrees(p_mercury.getDegrees() + p_mercury.getSpeed()*(0 / (float)p_mercury.getMasa()));

                                    move_planet(p_venus.getPromien(), p_venus.getDegrees()); 
                                    p_venus.setDegrees(p_venus.getDegrees() + p_venus.getSpeed()*(0 / (float)p_venus.getMasa()));

                                    move_planet(p_earth.getPromien(), p_earth.getDegrees()); 
                                    p_earth.setDegrees(p_earth.getDegrees() + p_earth.getSpeed()*(0 / (float)p_earth.getMasa()));

                                    move_planet(p_mars.getPromien(), p_mars.getDegrees()); 
                                    p_mars.setDegrees(p_mars.getDegrees() + p_mars.getSpeed()*(0 / (float)p_mars.getMasa()));

                                    move_planet(p_jupiter.getPromien(), p_jupiter.getDegrees()); 
                                    p_jupiter.setDegrees(p_jupiter.getDegrees() + p_jupiter.getSpeed()*(0 / (float)p_jupiter.getMasa()));

                                    move_planet(p_saturn.getPromien(), p_saturn.getDegrees()); 
                                    p_saturn.setDegrees(p_saturn.getDegrees() + p_saturn.getSpeed()*(0 / (float)p_saturn.getMasa()));

                                    move_planet(p_uranus.getPromien(), p_uranus.getDegrees()); 
                                    p_uranus.setDegrees(p_uranus.getDegrees() + p_uranus.getSpeed()*(0 / (float)p_uranus.getMasa()));

                                    move_planet(p_neptun.getPromien(), p_neptun.getDegrees()); 
                                    p_neptun.setDegrees(p_neptun.getDegrees() + p_neptun.getSpeed()*(0 / (float)p_neptun.getMasa()));

                                }catch(Exception e) {
                                    System.err.println(e);
                                }
                            }
                        }
                    }
                });
            
            
            if(is_move)animationThread.start();
            
    }

    

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel earth;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel jupiter;
    private javax.swing.JLabel mars;
    private javax.swing.JLabel mercury;
    private javax.swing.JLabel neptun;
    private javax.swing.JTextField pole_earth;
    private javax.swing.JTextField pole_jupiter;
    private javax.swing.JTextField pole_mars;
    private javax.swing.JTextField pole_mercury;
    private javax.swing.JTextField pole_neptun;
    private javax.swing.JTextField pole_saturn;
    private javax.swing.JTextField pole_uranus;
    private javax.swing.JTextField pole_venus;
    private javax.swing.JLabel saturn;
    private javax.swing.JButton start_move;
    private javax.swing.JButton stop_move;
    private javax.swing.JLabel uranus;
    private javax.swing.JLabel venus;
    // End of variables declaration//GEN-END:variables


}
