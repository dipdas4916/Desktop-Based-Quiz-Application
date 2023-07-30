import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//import java.awt.event.ActionEvent;
public class ShowScore extends JFrame implements ActionListener {
    String name;
    int marks;
    public String questions[][] = new String[10][5];
    public String answers[][] = new String[10][2];
    public String userans[][] = new String[10][1];
    JButton close, preview;

    ShowScore(String name, int marks, String questions[][], String answers[][], String userans[][]) {
        this.name = name;
        this.marks = marks;
        this.questions = questions;
        this.answers = answers;
        this.userans = userans;

        getContentPane().setBackground(Color.CYAN);
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("images/marks.jpeg"));
        JLabel image = new JLabel(i1);
        image.setBounds(0, 0, 725, 402); // Our image layout we set using setBounds(Loc_left,Loc_Top,length,width)
        add(image);

        JLabel heading = new JLabel(" Thank You " + name + " For Successfully Completing The Quiz..."); // To write
                                                                                                        // anything on
                                                                                                        // JFrame used
        // JLabel class

        heading.setBounds(23, 400, 700, 100); // To set heading on JFrame setBounds(Loc_left,Loc_Top,length,width)

        heading.setFont(new Font("Monotype Corsiva", Font.BOLD, 30)); // Set font style using setFont(and pass
                                                                      // Font(arguement))

        heading.setForeground(Color.BLACK); // Font Color

        add(heading);

        JLabel score = new JLabel("Your Score : " + marks); // To write
        // anything on
        // JFrame used
        // JLabel class

        score.setBounds(190, 580, 325, 50); // To set heading on JFrame setBounds(Loc_left,Loc_Top,length,width)

        score.setFont(new Font("Algerian", Font.BOLD, 37)); // Set font style using setFont(and pass
                                                            // Font(arguement))

        score.setForeground(Color.BLACK); // Font Color

        add(score);

        setBounds(355, 0, 740, 860);
        setVisible(true);

        preview = new JButton("PREVIEW");
        preview.setBounds(560, 730, 150, 40);
        preview.setBackground(Color.yellow);
        preview.setForeground(Color.black);
        preview.setFont(new Font("Tahoma", Font.BOLD, 22));
        preview.addActionListener(this);
        add(preview);

        close = new JButton("CLOSE");
        close.setBounds(40, 730, 150, 40);
        close.setBackground(Color.yellow);
        close.setForeground(Color.black);
        close.setFont(new Font("Tahoma", Font.BOLD, 22));
        close.addActionListener(this);
        add(close);

        JLabel question = new JLabel();
        question.setBounds(40, 685, 900, 50);
        question.setFont(new Font("Tahoma", Font.PLAIN, 22)); // Question
        question.setForeground(Color.BLACK);
        add(question);

        // question.setText("1" + questions[0][0]);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == close)
            setVisible(false);
        else {
            setVisible(false);
            new MarksPreview(name, marks, questions, answers, userans);
        }
    }

    public static void main(String[] args) {
        String t1[][] = new String[10][5];
        String t2[][] = new String[10][2];
        String t3[][] = new String[10][2];
        new ShowScore("user", 0, t1, t2, t3);
    }
}
