import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main extends JFrame {

    private JPanel contentPane;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Main frame = new Main();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public Main() {
        setTitle("Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 306, 696);
        contentPane = new JPanel();
        contentPane.setBackground(Color.WHITE);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblResult = new JLabel("");
        lblResult.setFont(new Font("Tahoma", Font.PLAIN, 33));
        lblResult.setForeground(Color.RED);
        lblResult.setBackground(Color.GRAY);
        lblResult.setBounds(4, 7, 286, 97);
        contentPane.add(lblResult);

        JButton btnOne = new JButton("1");
        btnOne.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                String getData = lblResult.getText();
                getData = getData.concat("1");
                lblResult.setText(getData);
            }
        });
        btnOne.setBounds(9, 149, 61, 65);
        contentPane.add(btnOne);

        JButton btnTwo = new JButton("2");
        btnTwo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String getData = lblResult.getText();
                getData = getData.concat("2");
                lblResult.setText(getData);
            }
        });
        btnTwo.setBounds(116, 149, 61, 65);
        contentPane.add(btnTwo);

        JButton btnThree = new JButton("3");
        btnThree.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String getData = lblResult.getText();
                getData = getData.concat("3");
                lblResult.setText(getData);
            }
        });
        btnThree.setBounds(218, 149, 61, 65);
        contentPane.add(btnThree);

        JButton btnFour = new JButton("4");
        btnFour.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String getData = lblResult.getText();
                getData = getData.concat("4");
                lblResult.setText(getData);
            }
        });
        btnFour.setBounds(9, 243, 61, 65);
        contentPane.add(btnFour);

        JButton btnFive = new JButton("5");
        btnFive.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String getData = lblResult.getText();
                getData = getData.concat("5");
                lblResult.setText(getData);
            }
        });
        btnFive.setBounds(116, 243, 61, 65);
        contentPane.add(btnFive);

        JButton btnSix = new JButton("6");
        btnSix.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String getData = lblResult.getText();
                getData = getData.concat("6");
                lblResult.setText(getData);
            }
        });
        btnSix.setBounds(218, 243, 61, 65);
        contentPane.add(btnSix);

        JButton btnSeven = new JButton("7");
        btnSeven.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String getData = lblResult.getText();
                getData = getData.concat("7");
                lblResult.setText(getData);
            }
        });
        btnSeven.setBounds(9, 339, 61, 65);
        contentPane.add(btnSeven);

        JButton btnEight = new JButton("8");
        btnEight.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String getData = lblResult.getText();
                getData = getData.concat("8");
                lblResult.setText(getData);
            }
        });
        btnEight.setBounds(116, 339, 61, 65);
        contentPane.add(btnEight);

        JButton btnNine = new JButton("9");
        btnNine.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String getData = lblResult.getText();
                getData = getData.concat("9");
                lblResult.setText(getData);
            }
        });
        btnNine.setBounds(218, 339, 61, 65);
        contentPane.add(btnNine);

        JButton btnPlus = new JButton("+");
        btnPlus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String getData = lblResult.getText();
                if (alreadyContainsSymbol(getData)) {
                    getData = Integer.toString(doTheMathAndReturnTheNumberAsInteger(getData));
                }
                getData = getData.concat("+");
                lblResult.setText(getData);


            }
        });
        btnPlus.setBounds(9, 429, 61, 65);
        contentPane.add(btnPlus);

        JButton btnMinus = new JButton("-");
        btnMinus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String getData = lblResult.getText();
                if (alreadyContainsSymbol(getData)) {
                    getData = Integer.toString(doTheMathAndReturnTheNumberAsInteger(getData));
                }
                getData = getData.concat("-");
                lblResult.setText(getData);
            }
        });
        btnMinus.setBounds(116, 429, 61, 65);
        contentPane.add(btnMinus);

        JButton btnDivide = new JButton("/");
        btnDivide.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String getData = lblResult.getText();
                if (alreadyContainsSymbol(getData)) {
                    getData = Integer.toString(doTheMathAndReturnTheNumberAsInteger(getData));
                }
                getData = getData.concat("/");
                lblResult.setText(getData);

            }
        });
        btnDivide.setBounds(218, 429, 61, 65);
        contentPane.add(btnDivide);

        JButton btnMultiply = new JButton("*");
        btnMultiply.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String getData = lblResult.getText();
                if (alreadyContainsSymbol(getData)) {
                    getData = Integer.toString(doTheMathAndReturnTheNumberAsInteger(getData));
                }
                getData = getData.concat("*");
                lblResult.setText(getData);

            }
        });
        btnMultiply.setBounds(9, 517, 61, 65);
        contentPane.add(btnMultiply);

        JButton btnEnter = new JButton("Done");
        btnEnter.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String getData = lblResult.getText();
                getData = Integer.toString(doTheMathAndReturnTheNumberAsInteger(getData));
                lblResult.setText(getData);

            }
        });
        btnEnter.setBounds(116, 517, 61, 65);
        contentPane.add(btnEnter);

        JButton btnBackSpace = new JButton("<");
        btnBackSpace.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String getData = lblResult.getText();
                getData = getData.substring(0, getData.length() - 1);
                lblResult.setText(getData);
            }
        });
        btnBackSpace.setBounds(218, 517, 61, 65);
        contentPane.add(btnBackSpace);
        
        JButton btnZero = new JButton("0");
        btnZero.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		String getData = lblResult.getText();
                getData = getData.concat("0");
                lblResult.setText(getData);
        	}
        });
        btnZero.setBounds(104, 593, 96, 54);
        contentPane.add(btnZero);
    }

    public int returnFirstNumber(String getData) {
        int firstNumber = 0;
        if (getData.contains("+")) {
            firstNumber = Integer.parseInt(getData.substring(0, getData.indexOf("+")));
        } else if (getData.contains("-")) {
            firstNumber = Integer.parseInt(getData.substring(0, getData.indexOf("-")));
        } else if (getData.contains("*")) {
            firstNumber = Integer.parseInt(getData.substring(0, getData.indexOf("*")));
        } else if (getData.contains("/")) {
            firstNumber = Integer.parseInt(getData.substring(0, getData.indexOf("/")));
        }
        return firstNumber;
    }

    public int returnSecondNumber(String getData) {
        int secondNumber = 0;
        if (getData.contains("+")) {
            secondNumber = Integer.parseInt(getData.substring(getData.indexOf("+") + 1, getData.length()));
        } else if (getData.contains("-")) {
            secondNumber = Integer.parseInt(getData.substring(getData.indexOf("-") + 1, getData.length()));
        } else if (getData.contains("*")) {
            secondNumber = Integer.parseInt(getData.substring(getData.indexOf("*") + 1, getData.length()));
        } else if (getData.contains("/")) {
            secondNumber = Integer.parseInt(getData.substring(getData.indexOf("/") + 1, getData.length()));
        }
        return secondNumber;
    }

    public int doTheMathAndReturnTheNumberAsInteger(String getData) {
        int result;

        if (getData.contains("+")) {
            result = returnFirstNumber(getData) + returnSecondNumber(getData);
        } else if (getData.contains("-")) {
            result = returnFirstNumber(getData) - returnSecondNumber(getData);
        } else if (getData.contains("*")) {
            result = returnFirstNumber(getData) * returnSecondNumber(getData);
        } else if (getData.contains("/")) {
            result = returnFirstNumber(getData) / returnSecondNumber(getData);
        } else {
            result = 0;
        }
        return result;

    }

    public boolean alreadyContainsSymbol(String getData) {

        if (getData.contains("+")) {
            return true;
        } else if (getData.contains("-")) {
            return true;
        } else if (getData.contains("*")) {
            return true;
        } else if (getData.contains("/")) {
            return true;
        } else {
            return false;
        }
    }
}
