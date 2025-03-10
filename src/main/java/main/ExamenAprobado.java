package main;

import java.awt.EventQueue;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ExamenAprobado {

    private JFrame frame;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    ExamenAprobado window = new ExamenAprobado();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public ExamenAprobado() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel panel = new JPanel();
        frame.getContentPane().add(panel);
        
        JButton btnMiguel = new JButton("Lo que me gustaría");
        btnMiguel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Miguel ha aprobado por sus propios medios");
            }
        });
        panel.add(btnMiguel);
        
        JButton btnOtro = new JButton("La triste realidad");
        btnOtro.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("He tenido que aprobarlo yo");
            }
        });
        panel.add(btnOtro);
    }
}
