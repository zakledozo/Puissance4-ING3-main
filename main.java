import java.awt.*;
import javax.swing.*;
import javax.swing.BoxLayout.*;

public class main {
    public static void main(String[] args) {

        JButton newGame;  //bouton nouvelle partie
        JButton Exit;     //bouton pour sortir

        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame ("Puissance 4"); // fenetre d'accueil du jeu
        newGame = new JButton ("Begin a new Game");
        Exit = new JButton("Exit");


        Container contentPane = frame.getContentPane(); //Container pour pouvoir utiliser bouton
        contentPane.setLayout(new FlowLayout());


        contentPane.add(newGame);
        contentPane.add(Exit);
        //contentPane.setLayout(new BoxLayout(frame, BoxLayout.Y_AXIS));  *pour que les boutons soit affichés à la verticale mais ca fait bugger
        frame.setSize(600, 550);
        frame.setVisible(true);
        Exit.addActionListener(e ->{frame.dispose();});
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(new FlowLayout());
        /* Pour créer une fenetre graphique avec 2 boutons, 1 pour lancer une partie et le 2e pour sortir de la fenetre quand on clique dessus */
    }
}
