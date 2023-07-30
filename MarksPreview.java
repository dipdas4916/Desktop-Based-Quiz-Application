import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MarksPreview extends JFrame implements ActionListener {

    JLabel qno, question1, question2, question3, question4, question5, question6, question7, question8, question9,
            question10, opt1, opt2, opt3, opt4, opt5, opt6, opt7, opt8, opt9, opt10;

    String name;
    int marks;
    public String questions[][] = new String[10][5];
    public String answers[][] = new String[10][2];
    public String userans[][] = new String[10][1];
    JButton close;

    MarksPreview(String name, int marks, String questions[][], String answers[][], String userans[][]) {
        this.name = name;
        this.marks = marks;
        this.questions = questions;
        this.answers = answers;
        this.userans = userans;

        getContentPane().setBackground(Color.CYAN);
        setLayout(null);

        JLabel score = new JLabel("You Have Score = " + marks + " /10"); // To write
        // anything on
        // JFrame used
        // JLabel class

        score.setBounds(1250, 0, 200, 70); // To set heading on JFrame setBounds(Loc_left,Loc_Top,length,width)

        score.setFont(new Font("Monotype Corsiva", Font.BOLD, 20)); // Set font style using setFont(and pass
                                                                    // Font(arguement))

        score.setForeground(Color.BLACK); // Font Color

        add(score);

        opt1 = new JLabel();
        opt1.setBounds(7, 50, 690, 50);
        opt1.setFont(new Font("Tahoma", Font.PLAIN, 15));
        // opt1.setText("a. ");
        add(opt1);

        opt2 = new JLabel();
        opt2.setBounds(7, 120, 690, 50);
        opt2.setFont(new Font("Tahoma", Font.PLAIN, 15));
        // opt2.setText("b. ");
        add(opt2);

        opt3 = new JLabel();
        opt3.setBounds(7, 190, 690, 50);
        opt3.setFont(new Font("Tahoma", Font.PLAIN, 15));
        // opt3.setText("c. ");
        add(opt3);

        opt4 = new JLabel();
        opt4.setBounds(7, 260, 690, 50);
        opt4.setFont(new Font("Tahoma", Font.PLAIN, 15));
        // opt4.setText("b. ");
        add(opt4);

        opt5 = new JLabel();
        opt5.setBounds(7, 330, 690, 50);
        opt5.setFont(new Font("Tahoma", Font.PLAIN, 15));
        // opt4.setText("b. ");
        add(opt5);

        opt6 = new JLabel();
        opt6.setBounds(7, 400, 690, 50);
        opt6.setFont(new Font("Tahoma", Font.PLAIN, 15));
        // opt4.setText("b. ");
        add(opt6);

        opt7 = new JLabel();
        opt7.setBounds(7, 470, 690, 50);
        opt7.setFont(new Font("Tahoma", Font.PLAIN, 15));
        // opt4.setText("b. ");
        add(opt7);

        opt8 = new JLabel();
        opt8.setBounds(7, 540, 690, 50);
        opt8.setFont(new Font("Tahoma", Font.PLAIN, 15));
        // opt4.setText("b. ");
        add(opt8);

        opt9 = new JLabel();
        opt9.setBounds(7, 610, 690, 50);
        opt9.setFont(new Font("Tahoma", Font.PLAIN, 15));
        // opt4.setText("b. ");
        add(opt9);

        opt10 = new JLabel();
        opt10.setBounds(7, 680, 950, 50);
        opt10.setFont(new Font("Tahoma", Font.PLAIN, 15));
        // opt4.setText("b. ");
        add(opt10);

        question1 = new JLabel();
        question1.setBounds(40, 15, 600, 50);
        question1.setFont(new Font("Tahoma", Font.PLAIN, 15)); // Question
        question1.setForeground(Color.BLACK);
        add(question1);

        question2 = new JLabel();
        question2.setBounds(40, 85, 600, 50);
        question2.setFont(new Font("Tahoma", Font.PLAIN, 15)); // Question
        question2.setForeground(Color.BLACK);
        add(question2);

        question3 = new JLabel();
        question3.setBounds(40, 155, 600, 50);
        question3.setFont(new Font("Tahoma", Font.PLAIN, 15)); // Question
        question3.setForeground(Color.BLACK);
        add(question3);

        question4 = new JLabel();
        question4.setBounds(40, 215, 600, 50);
        question4.setFont(new Font("Tahoma", Font.PLAIN, 15)); // Question
        question4.setForeground(Color.BLACK);
        add(question4);

        question5 = new JLabel();
        question5.setBounds(40, 285, 600, 50);
        question5.setFont(new Font("Tahoma", Font.PLAIN, 15)); // Question
        question5.setForeground(Color.BLACK);
        add(question5);

        question6 = new JLabel();
        question6.setBounds(40, 355, 600, 50);
        question6.setFont(new Font("Tahoma", Font.PLAIN, 15)); // Question
        question6.setForeground(Color.BLACK);
        add(question6);

        question7 = new JLabel();
        question7.setBounds(40, 425, 600, 50);
        question7.setFont(new Font("Tahoma", Font.PLAIN, 15)); // Question
        question7.setForeground(Color.BLACK);
        add(question7);

        question8 = new JLabel();
        question8.setBounds(40, 495, 600, 50);
        question8.setFont(new Font("Tahoma", Font.PLAIN, 15)); // Question
        question8.setForeground(Color.BLACK);
        add(question8);

        question9 = new JLabel();
        question9.setBounds(40, 565, 600, 50);
        question9.setFont(new Font("Tahoma", Font.PLAIN, 15)); // Question
        question9.setForeground(Color.BLACK);
        add(question9);

        question10 = new JLabel();
        question10.setBounds(40, 635, 600, 50);
        question10.setFont(new Font("Tahoma", Font.PLAIN, 15)); // Question
        question10.setForeground(Color.BLACK);
        add(question10);

        question1.setText(1 + ". " + questions[0][0]);
        if (userans[0][0].equals(answers[0][1])) {
            opt1.setText("Correct: " + answers[0][1]);
            opt1.setForeground(Color.GREEN);

        } else {
            opt1.setText(userans[0][0] + ": Wrong Answer\n Here Correct Answer is: " + answers[0][1]);
            opt1.setForeground(Color.RED);
        }

        question2.setText(2 + ". " + questions[1][0]);
        if (userans[1][0].equals(answers[1][1])) {
            opt2.setText("Correct: " + answers[1][1]);
            opt2.setForeground(Color.GREEN);

        } else {
            opt2.setText(userans[1][0] + ": Wrong Answer\n Here Correct Answer is: " + answers[1][1]);
            opt2.setForeground(Color.RED);
        }
        question3.setText(3 + ". " + questions[2][0]);
        if (userans[2][0].equals(answers[2][1])) {
            opt3.setText("Correct: " + answers[2][1]);
            opt3.setForeground(Color.GREEN);

        } else {
            opt3.setText(userans[2][0] + ": Wrong Answer\n Here Correct Answer is: " + answers[2][1]);
            opt3.setForeground(Color.RED);
        }
        question4.setText(4 + ". " + questions[3][0]);
        if (userans[3][0].equals(answers[3][1])) {
            opt4.setText("Correct: " + answers[3][1]);
            opt4.setForeground(Color.GREEN);

        } else {
            opt4.setText(userans[3][0] + ": Wrong Answer\n Here Correct Answer is: " + answers[3][1]);
            opt4.setForeground(Color.RED);
        }
        question5.setText(5 + ". " + questions[4][0]);
        if (userans[4][0].equals(answers[4][1])) {
            opt5.setText("Correct: " + answers[4][1]);
            opt5.setForeground(Color.GREEN);

        } else {
            opt5.setText(userans[4][0] + ": Wrong Answer\n Here Correct Answer is: " + answers[4][1]);
            opt5.setForeground(Color.RED);
        }
        question6.setText(6 + ". " + questions[5][0]);
        if (userans[5][0].equals(answers[5][1])) {
            opt6.setText("Correct: " + answers[5][1]);
            opt6.setForeground(Color.GREEN);

        } else {
            opt6.setText(userans[5][0] + ": Wrong Answer\n Here Correct Answer is: " + answers[5][1]);
            opt6.setForeground(Color.RED);
        }
        question7.setText(7 + ". " + questions[6][0]);
        if (userans[6][0].equals(answers[6][1])) {
            opt7.setText("Correct: " + answers[6][1]);
            opt7.setForeground(Color.GREEN);

        } else {
            opt7.setText(userans[6][0] + ": Wrong Answer\n Here Correct Answer is: " + answers[6][1]);
            opt7.setForeground(Color.RED);
        }

        question8.setText(8 + ". " + questions[7][0]);
        if (userans[6][0].equals(answers[6][1])) {
            opt8.setText("Correct: " + answers[7][1]);
            opt8.setForeground(Color.GREEN);

        } else {
            opt8.setText(userans[7][0] + ": Wrong Answer\n Here Correct Answer is: " + answers[7][1]);
            opt8.setForeground(Color.RED);
        }

        question9.setText(9 + ". " + questions[8][0]);
        if (userans[8][0].equals(answers[8][1])) {
            opt9.setText("Correct: " + answers[8][1]);
            opt9.setForeground(Color.GREEN);

        } else {
            opt9.setText(userans[8][0] + ": Wrong Answer\n Here Correct Answer is: " + answers[8][1]);
            opt9.setForeground(Color.RED);
        }

        question10.setText(10 + ". " + questions[6][0]);
        if (userans[9][0].equals(answers[9][1])) {
            opt10.setText("Correct: " + answers[9][1]);
            opt10.setForeground(Color.GREEN);

        } else {
            opt10.setText(userans[9][0] + ": Wrong Answer\n Here Correct Answer is: " + answers[9][1]);
            opt10.setForeground(Color.RED);
        }

        close = new JButton("CLOSE");
        close.setBounds(640, 730, 200, 40);
        close.setBackground(Color.yellow);
        close.setForeground(Color.black);
        close.setFont(new Font("Tahoma", Font.BOLD, 22));
        close.addActionListener(this);
        add(close);

        setBounds(20, 0, 1500, 1000);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == close)
            setVisible(false);
    }

    public static void main(String[] args) {
        String t1[][] = new String[10][5];
        String t2[][] = new String[10][2];
        String t3[][] = new String[10][2];
        new MarksPreview("user", 0, t1, t2, t3);
    }
}
