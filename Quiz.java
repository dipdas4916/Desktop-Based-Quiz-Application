import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener; //For Button Action used package java.awt.event

public class Quiz extends JFrame implements ActionListener {

    public String questions[][] = new String[10][5];
    public String answers[][] = new String[10][2];
    public String userans[][] = new String[10][1];

    JLabel qno, question;
    JRadioButton opt1, opt2, opt3, opt4;
    JButton next, lifeline, submit;
    int arr[][] = new int[10][3];

    ButtonGroup grpopt;

    public static int ans_given = 0;
    public static int timer = 10;
    public static int count = 0;
    public static int marks = 0;

    /**
     * 
     */

    String name;

    Quiz(String name) {
        this.name = name; // store the user name

        getContentPane().setBackground(Color.PINK);
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("images/quiz.jpg"));
        JLabel image = new JLabel(i1);
        image.setBounds(0, 0, 1200, 392); // Our image layout we set using setBounds(Loc_left,Loc_Top,length,width)
        add(image);

        JLabel heading = new JLabel("Candidate Name: " + name); // To write anything on JFrame used
                                                                // JLabel class

        heading.setBounds(380, 380, 950, 100); // To set heading on JFrame setBounds(Loc_left,Loc_Top,length,width)

        heading.setFont(new Font("Monotype Corsiva", Font.BOLD, 30)); // Set font style using setFont(and pass
                                                                      // Font(arguement))

        heading.setForeground(Color.BLUE); // Font Color

        add(heading);

        qno = new JLabel();
        qno.setBounds(100, 450, 50, 50); // Question No
        qno.setFont(new Font("Tahoma", Font.PLAIN, 22));
        add(qno);

        question = new JLabel();
        question.setBounds(170, 450, 900, 50);
        question.setFont(new Font("Tahoma", Font.PLAIN, 22)); // Question
        add(question);

        questions[0][0] = "Which is used to find and fix bugs in the Java programs.?";
        questions[0][1] = "JVM";
        questions[0][2] = "JDB";
        questions[0][3] = "JDK";
        questions[0][4] = "JRE";

        questions[1][0] = "What is the return type of the hashCode() method in the Object class?";
        questions[1][1] = "int";
        questions[1][2] = "Object";
        questions[1][3] = "long";
        questions[1][4] = "void";

        questions[2][0] = "Which package contains the Random class?";
        questions[2][1] = "java.util package"; // Quiz Question
        questions[2][2] = "java.lang package";
        questions[2][3] = "java.awt package";
        questions[2][4] = "java.io package";

        questions[3][0] = "An interface with no fields or methods is known as?";
        questions[3][1] = "Runnable Interface";
        questions[3][2] = "Abstract Interface";
        questions[3][3] = "Marker Interface";
        questions[3][4] = "CharSequence Interface";

        questions[4][0] = "In which memory a String is stored, when we create a string using new operator?";
        questions[4][1] = "Stack";
        questions[4][2] = "String memory";
        questions[4][3] = "Random storage space";
        questions[4][4] = "Heap memory";

        questions[5][0] = "Which of the following is a marker interface?";
        questions[5][1] = "Runnable interface";
        questions[5][2] = "Remote interface";
        questions[5][3] = "Readable interface";
        questions[5][4] = "Result interface";

        questions[6][0] = "Which keyword is used for accessing the features of a package?";
        questions[6][1] = "import";
        questions[6][2] = "package";
        questions[6][3] = "extends";
        questions[6][4] = "export";

        questions[7][0] = "In java, jar stands for?";
        questions[7][1] = "Java Archive Runner";
        questions[7][2] = "Java Archive";
        questions[7][3] = "Java Application Resource";
        questions[7][4] = "Java Application Runner";

        questions[8][0] = "Which of the following is a mutable class in java?";
        questions[8][1] = "java.lang.StringBuilder";
        questions[8][2] = "java.lang.Short";
        questions[8][3] = "java.lang.Byte";
        questions[8][4] = "java.lang.String";

        questions[9][0] = "Which of the following option leads to the portability and security of Java?";
        questions[9][1] = "Bytecode is executed by JVM";
        questions[9][2] = "The applet makes the Java code secure and portable";
        questions[9][3] = "Use of exception handling";
        questions[9][4] = "Dynamic binding between objects";

        answers[0][1] = "JDB";
        answers[1][1] = "int";
        answers[2][1] = "java.util package";
        answers[3][1] = "Marker Interface";
        answers[4][1] = "Heap memory";
        answers[5][1] = "Remote interface"; // Quiz Answer
        answers[6][1] = "import";
        answers[7][1] = "Java Archive";
        answers[8][1] = "java.lang.StringBuilder";
        answers[9][1] = "Bytecode is executed by JVM";

        opt1 = new JRadioButton();
        opt1.setBounds(240, 550, 700, 30);
        opt1.setBackground(Color.PINK);
        opt1.setFont(new Font("Tahoma", Font.PLAIN, 18)); // Options Buttons
        add(opt1);

        opt2 = new JRadioButton();
        opt2.setBounds(240, 590, 700, 30);
        opt2.setBackground(Color.PINK);
        opt2.setFont(new Font("Tahoma", Font.PLAIN, 18));
        add(opt2);

        opt3 = new JRadioButton();
        opt3.setBounds(240, 630, 700, 30);
        opt3.setBackground(Color.PINK);
        opt3.setFont(new Font("Tahoma", Font.PLAIN, 18));
        add(opt3);

        opt4 = new JRadioButton();
        opt4.setBounds(240, 670, 700, 30);
        opt4.setBackground(Color.PINK);
        opt4.setFont(new Font("Tahoma", Font.PLAIN, 18));
        add(opt4);

        grpopt = new ButtonGroup();
        grpopt.add(opt1);
        grpopt.add(opt2);
        grpopt.add(opt3); // Group the Options, So that only one option select at a time
        grpopt.add(opt4);

        next = new JButton("NEXT");
        next.setBounds(950, 720, 100, 40);
        next.setBackground(Color.MAGENTA);
        next.setForeground(Color.black);
        next.setFont(new Font("Tahoma", Font.BOLD, 22));
        next.addActionListener(this);
        add(next);

        lifeline = new JButton("50 50 LifeLine");
        lifeline.setBounds(950, 540, 210, 40);
        lifeline.setBackground(Color.green);
        lifeline.setForeground(Color.BLACK);
        lifeline.setFont(new Font("Tahoma", Font.BOLD, 18));
        lifeline.addActionListener(this);
        add(lifeline);

        submit = new JButton("SUBMIT");
        submit.setBounds(950, 630, 150, 40);
        submit.setBackground(Color.yellow);
        submit.setForeground(Color.black);
        submit.setFont(new Font("Tahoma", Font.BOLD, 22));
        submit.addActionListener(this);
        submit.setEnabled(false);
        add(submit);

        start(count);

        setBounds(150, 0, 1200, 914);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == next) {

            ans_given = 1; // Select answer

            repaint(); // Timer start again

            opt1.setEnabled(true);
            opt2.setEnabled(true);
            opt3.setEnabled(true); // If Lifeline Applied on previous questions then set all options enable to the
                                   // next questions
            opt4.setEnabled(true);

            if (grpopt.getSelection() == null) {
                userans[count][0] = ""; // To track the answer
            } else {
                userans[count][0] = grpopt.getSelection().getActionCommand(); // Get the answer from the options
            }

            if (count == 8) {
                next.setEnabled(false); // 10th number questions Next Button disable and Submit button Enable
                submit.setEnabled(true);
            }

            count++; // Show the next Question
            start(count);

        } else if (ae.getSource() == lifeline) {
            // if (count == 2 || count == 4 || count == 6 || count == 8 || count == 9) {
            if (questions[count][1].equals(answers[count][1])) {
                opt2.setEnabled(false);
                opt3.setEnabled(false); // Two options have been disable by the basis of Count
            } else if (questions[count][2].equals(answers[count][1])) {
                opt1.setEnabled(false);
                opt4.setEnabled(false);
            } else if (questions[count][3].equals(answers[count][1])) {
                opt2.setEnabled(false);
                opt4.setEnabled(false);
            } else {
                opt1.setEnabled(false);
                opt3.setEnabled(false);
            }
            lifeline.setEnabled(false);
        } else { // For Pressing Submit Button before Times Upp
            ans_given = 1;

            if (grpopt.getSelection() == null) {
                userans[count][0] = ""; // Check which options select at last Questions
            } else {
                userans[count][0] = grpopt.getSelection().getActionCommand(); // Get the answer from the options
            }

            for (int i = 0; i < userans.length; i++) {
                if (userans[i][0].equals(answers[i][1])) {
                    marks++; // For right questions Students get 1 Marks
                }
            }
            setVisible(false); // Marks are Calculated
            new ShowScore(name, marks, questions, answers, userans); // Open the ShowScore Class
        }
    }

    public void paint(Graphics g) { // This method is called automatic
        super.paint(g);
        String time = "Time left - " + timer + " seconds"; // Timer=25
        g.setColor(Color.red);
        g.setFont(new Font("Times New Roman", Font.BOLD, 25));
        if (timer > 0) {
            g.drawString(time, 925, 500);
        } else {
            g.drawString("Times Up!!", 925, 500);
        }
        timer--; // Time Decrease
        try {
            Thread.sleep(1000);
            repaint();
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (ans_given == 1) {
            ans_given = 0;
            timer = 10; // For Timer used Thread
        } else if (timer < 0) {
            opt1.setEnabled(true);
            opt2.setEnabled(true);
            opt3.setEnabled(true); // If Lifeline Applied on previous questions then set all options enable to the
                                   // next questions
            opt4.setEnabled(true);

            timer = 10;

            if (count == 8) {
                next.setEnabled(false); // 10th number questions Next Button disable and Submit button Enable
                submit.setEnabled(true);
            }
            if (count == 9) { // If user don't press submit after times upp...
                if (grpopt.getSelection() == null) {
                    userans[count][0] = ""; // Check which options select at last Questions
                } else {
                    userans[count][0] = grpopt.getSelection().getActionCommand(); // Get the answer from the options
                }

                for (int i = 0; i < userans.length; i++) {
                    if (userans[i][0].equals(answers[i][1])) {
                        marks++; // For right questions Students get 1 Marks
                    }
                }
                setVisible(false); // Marks are Calculated
                new ShowScore(name, marks, questions, answers, userans); // Open the ShowScore Class

            } else { // for auto submit
                if (grpopt.getSelection() == null) { // Go to Next Question
                    userans[count][0] = ""; // To track the answer
                } else {
                    userans[count][0] = grpopt.getSelection().getActionCommand(); // Get the answer from the options
                }
                count++;
                start(count);
            }

        }

    }

    public void start(int c) {
        qno.setText("" + (c + 1) + ".");
        question.setText(questions[c][0]);
        opt1.setText(questions[c][1]);
        opt1.setActionCommand(questions[count][1]); // Set the answer to the options
        opt2.setText(questions[c][2]);
        opt2.setActionCommand(questions[count][2]);
        opt3.setText(questions[c][3]);
        opt3.setActionCommand(questions[count][3]);
        opt4.setText(questions[c][4]);
        opt4.setActionCommand(questions[count][4]);

        grpopt.clearSelection(); // Don't save the answer to the next questions
    }

    public static void main(String[] args) {
        new Quiz("user");
    }
}
