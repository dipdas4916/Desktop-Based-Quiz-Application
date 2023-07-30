import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener; //For Button Action used package java.awt.event

public class Rules extends JFrame implements ActionListener {
    JButton back, starts;
    String name;

    Rules(String name) {
        this.name = name;
        getContentPane().setBackground(Color.PINK);
        setLayout(null);

        JLabel heading = new JLabel(name + " Please Read The Rules Carefully"); // To write anything on JFrame used
                                                                                // JLabel class

        heading.setBounds(180, 0, 950, 100); // To set heading on JFrame setBounds(Loc_left,Loc_Top,length,width)

        heading.setFont(new Font("Monotype Corsiva", Font.BOLD, 30)); // Set font style using setFont(and pass
                                                                      // Font(arguement))

        heading.setForeground(Color.BLUE); // Font Color

        add(heading);

        JLabel rule = new JLabel(); // To write anything on JFrame used
                                    // JLabel class

        rule.setBounds(180, 50, 1000, 450); // To set heading on JFrame setBounds(Loc_left,Loc_Top,length,width)

        rule.setFont(new Font("Tahoma", Font.BOLD, 15)); // Set font style using setFont(and pass
                                                         // Font(arguement))

        // rule.setForeground(Color.BLUE); // Font Color

        rule.setText(
                "<html>" +
                        "1: Total 10 Questions are there." + "<br><br>" +
                        "2: Each Questions carry 1 Marks , So 'FULL MARKS=>10'" + "<br><br>" +
                        "3: No Negative Marking is There" + "<br><br>" +
                        "4: For giving the answer of each question you will get 10 seconds" + "<br><br>" +
                        "5: After 10 Seconds if you dont's press submit button then the question automatically Saved and go to next Question"
                        + "<br><br>" +
                        "6: If You Give answer of any Question You can not Move Back" + "<br><br>" +
                        "7: 50-50 LifeLine Option is there, which you can use Only one Time. If you apply it two wrong answer has been Removed"
                        + "<br><br>" +
                        "<html>"

        );

        add(rule);

        back = new JButton("CLOSE");
        back.setBounds(100, 415, 200, 35);
        back.setFont(new Font("Times New Roman", Font.BOLD, 18)); // JButton used for CLOSE Button
        back.setBackground(Color.yellow);
        back.setForeground(Color.red);
        back.addActionListener(this); //// To specify the action of Close
        add(back);

        starts = new JButton("START QUIZ");
        starts.setBounds(755, 415, 300, 35);
        starts.setFont(new Font("Times New Roman", Font.BOLD, 18)); // JButton used for Enter Quiz Button
        starts.setBackground(Color.yellow);
        starts.setForeground(Color.red);
        starts.addActionListener(this); // To specify the action of Enter Quiz button
        add(starts);

        setSize(1200, 550);
        setLocation(250, 120);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == back) {
            setVisible(false);
            new Login();
        } else {
            setVisible(false);
            new Quiz(name);
        }
    }

    public static void main(String[] args) {
        new Rules("User");
    }
}
