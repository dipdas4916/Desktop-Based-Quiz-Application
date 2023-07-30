import javax.swing.*; //JFrame class present inside javax.swing package
import java.awt.*; //Color class available on java.awt package
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener; //For Button Action used package java.awt.event

public class Login extends JFrame implements ActionListener { // For using swing we have to extends JFrame class
                                                              // For Button Action used Interface ActionListner

    /**
     * 
     */
    JButton rules, starts, close;
    JTextField tfname;
    String name;

    Login() {

        getContentPane().setBackground(Color.PINK); // To set the background color First we have to bring the
                                                    // JFrame
        // using getContentPane () method and set the background color using
        // .setBackground(Color.COLORNAME)

        setLayout(null); // Here we are providing our own Layout

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("images/quizlogo.png"));
        JLabel image = new JLabel(i1);
        image.setBounds(0, 0, 500, 500); // Our image layout we set using setBounds(Loc_left,Loc_Top,length,width)
        add(image);

        JLabel heading = new JLabel("Test Your Skills.."); // To write anything on JFrame used JLabel class

        heading.setBounds(640, 0, 400, 100); // To set heading on JFrame setBounds(Loc_left,Loc_Top,length,width)

        heading.setFont(new Font("Monotype Corsiva", Font.BOLD, 52)); // Set font style using setFont(and pass
                                                                      // Font(arguement))
        heading.setForeground(Color.BLUE); // Font Color

        add(heading); // Add this components to JFRAME

        JLabel name1 = new JLabel("Enter Your Name :");
        name1.setBounds(515, 80, 300, 100);
        name1.setFont(new Font("Times New Roman", Font.BOLD, 22));
        name1.setForeground(Color.BLACK);
        add(name1);

        rules = new JButton("RULES");
        rules.setBounds(550, 250, 100, 35);
        rules.setFont(new Font("Times New Roman", Font.BOLD, 18)); // JButton used for Rules Button
        rules.setBackground(Color.yellow);
        rules.setForeground(Color.red);
        rules.addActionListener(this); // To specify the action of rules
        add(rules);

        starts = new JButton("START QUIZ");
        starts.setBounds(950, 250, 200, 35);
        starts.setFont(new Font("Times New Roman", Font.BOLD, 18)); // JButton used for Enter Quiz Button
        starts.setBackground(Color.yellow);
        starts.setForeground(Color.red);
        starts.addActionListener(this); // To specify the action of Enter Quiz button
        add(starts);

        close = new JButton("CLOSE");
        close.setBounds(755, 415, 100, 35);
        close.setFont(new Font("Times New Roman", Font.BOLD, 18)); // JButton used for CLOSE Button
        close.setBackground(Color.yellow);
        close.setForeground(Color.red);
        close.addActionListener(this); //// To specify the action of Close
        add(close);

        tfname = new JTextField();
        tfname.setBounds(730, 121, 300, 30); // For get the Name from User used JTextField
        tfname.setFont(new Font("Times New Roman", Font.LAYOUT_LEFT_TO_RIGHT, 18));
        add(tfname);

        setSize(1200, 500); // Fixed the frame size by using setSize(length,width)

        setLocation(200, 150); // bydefault set head is origin is top left, so bring it middle used
                               // setLocation(left,top)

        setVisible(true); // JFrame visibility by-fault hiiden, so to make it visible used
                          // setVisible(boolean)

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == rules) { // For Display Rules
            setVisible(false);
            name = tfname.getText();
            new Rules(name);

        } else if (ae.getSource() == starts) { // For Start Quiz
            setVisible(false);
            name = tfname.getText();
            new Quiz(name);
        } else {
            setVisible(false); // For Close
        }
    }

    public static void main(String[] args) {
        new Login();
    }
}
