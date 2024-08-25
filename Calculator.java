import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Stack;
public class Calculator implements ActionListener
{
    JFrame frame;
    JTextField textField;
    JPanel panel;
    JButton B1,B2,B3,B4,B5,B6,B7,B8,B9,B10,B11,B12,B13,B14,B15,B16;
    String s1,s2,s3;
    Calculator()
    {
        frame=new JFrame("calculator");
        frame.setLayout(null);
        frame.setSize(400,400);
        frame.setVisible(true);
        textField =new JTextField();
        textField.setBounds(10,10,300,100);
        frame.add(textField);
        panel=new JPanel();
        panel.setLayout(new GridLayout(4,4));
        panel.setBounds(10,120,300,200);
        panel.setVisible(true);
        
        B1=new JButton("0");
        B1.setBounds(10,10,200,200);
        B1.addActionListener(this);
        panel.add(B1);
        B2=new JButton("1");
        B2.setBounds(20,10,200,200);
        B2.addActionListener(this);
        panel.add(B2);
        B3=new JButton("2");
        B3.setBounds(30,10,200,200);
        B3.addActionListener(this);
        panel.add(B3);
        B4=new JButton("3");
        B4.setBounds(40,10,200,200);
        B4.addActionListener(this);
        panel.add(B4);
        B5=new JButton("4");
        B5.setBounds(10,20,200,200);
        B5.addActionListener(this);
        panel.add(B5);
        B6=new JButton("5");
        B6.setBounds(20,20,200,200);
        B6.addActionListener(this);
        panel.add(B6);
        B7=new JButton("6");
        B7.setBounds(30,20,200,200);
        B7.addActionListener(this);
        panel.add(B7);
        B8=new JButton("7");
        B8.setBounds(40,20,200,200);
        B8.addActionListener(this);
        panel.add(B8);
        B9=new JButton("8");
        B9.setBounds(10,30,200,200);
        B9.addActionListener(this);
        panel.add(B9);
        B10=new JButton("9");
        B10.setBounds(20,30,200,200);
        B10.addActionListener(this);
        panel.add(B10);
        B11=new JButton("+");
        B11.setBounds(30,30,200,200);
        B11.addActionListener(this);
        panel.add(B11);
        B12=new JButton("-");
        B12.setBounds(40,30,200,200);
        B12.addActionListener(this);
        panel.add(B12);
        B13=new JButton("*");
        B13.setBounds(10,40,200,200);
        B13.addActionListener(this);
        panel.add(B13);
        B14=new JButton("/");
        B14.setBounds(20,40,200,200);
        B14.addActionListener(this);
        panel.add(B14);
        B15=new JButton("=");
        B15.setBounds(30,40,200,200);
        B15.addActionListener(this);
        panel.add(B15);
        B16=new JButton("C");
        B16.setBounds(40,40,200,200);
        B16.addActionListener(this);
        panel.add(B16);
        frame.add(panel);

    }


    public static String evaluate(String expression) {
        Stack<Integer> values = new Stack<>();
        Stack<Character> ops = new Stack<>();
        
        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);

            
            if (Character.isDigit(ch)) {
                int num = 0;
                while (i < expression.length() && Character.isDigit(expression.charAt(i))) {
                    num = num * 10 + (expression.charAt(i) - '0');
                    i++;
                }
                values.push(num);
                i--; 
            }
            
            else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                ops.push(ch);
            }
        }
        
        
        while (!ops.isEmpty()) {
            char op = ops.remove(0);
            int a = values.remove(0);
            int b = values.remove(0);
            int result = applyOperation(op, a, b);
            values.add(0, result); 
        }
        
        
        return String.valueOf(values.pop());
    }

    
    public static int applyOperation(char op, int a, int b) {
        switch (op) {
            case '+': return a + b;
            case '-': return a - b;
            case '*': return a * b;
            case '/': 
                if (b == 0) {
                    throw new UnsupportedOperationException("Cannot divide by zero");
                }
                return a / b;
        }
        return 0;
    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==B1)
        {
            s1=textField.getText();
            s2=s1+"0";
            textField.setText(s2);
        }
        else if(e.getSource()==B2)
        {s1=textField.getText();
            s2=s1+"1";
            textField.setText(s2);
        }
        else if(e.getSource()==B3)
        {
            s1=textField.getText();
            s2=s1+"2";
            textField.setText(s2);
        }
        else if(e.getSource()==B4)
        {
            s1=textField.getText();
            s2=s1+"3";
            textField.setText(s2);
        }
        else if(e.getSource()==B5)
        {s1=textField.getText();
            s2=s1+"4";
            textField.setText(s2);
        }
        else if(e.getSource()==B6)
        {s1=textField.getText();
            s2=s1+"5";
            textField.setText(s2);
        }
        else if(e.getSource()==B7)
        {s1=textField.getText();
            s2=s1+"6";
            textField.setText(s2);
        }
        else if(e.getSource()==B8)
        {s1=textField.getText();
            s2=s1+"7";
            textField.setText(s2);
        }
        else if(e.getSource()==B9)
        {s1=textField.getText();
            s2=s1+"8";
            textField.setText(s2);
        }
        else if(e.getSource()==B10)
        {s1=textField.getText();
            s2=s1+"9";
            textField.setText(s2);
        }
        else if(e.getSource()==B11)
        {s1=textField.getText();
            s2=s1+"+";
            textField.setText(s2);
        }
        else if(e.getSource()==B12)
        {s1=textField.getText();
            s2=s1+"-";
            textField.setText(s2);
        }
        else if(e.getSource()==B13)
        {s1=textField.getText();
            s2=s1+"*";
            textField.setText(s2);
        }
        else if(e.getSource()==B14)
        {s1=textField.getText();
            s2=s1+"/";
            textField.setText(s2);
        }
        else if(e.getSource()==B15)
        {
            s1=textField.getText();
            s2=evaluate(s1);
            textField.setText(s2);
        }
        else if(e.getSource()==B16)
        {
            s2="";
            textField.setText(s2);
        }
    }
    public static void main(String args[])
    {
        
        Calculator t=new Calculator();
    }
}