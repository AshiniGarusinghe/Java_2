import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.*;
public class CalculatorView extends JFrame{
    private JTextField firstNumber = new JTextField(5);
    private JLabel additionLabel = new JLabel("+");
    private JTextField secondNumber = new JTextField(5);
    private JButton calculateButton = new JButton("Calculate");
    private JTextField calcSolution = new JTextField(5);
    
    public CalculatorView(){
        // Sets up the view and adds the components
        JPanel panel = new JPanel();
        
        this.setTitle("MVC Calculator");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 200);
        
        panel.setBackground(Color.GRAY);
        panel.add(firstNumber);
        panel.add(additionLabel);
        panel.add(secondNumber);
        panel.add(calculateButton);
        panel.add(calcSolution);

        this.add(panel);
    }

    public int getFirstNumber(){
        return Integer.parseInt(firstNumber.getText());
    }

    public int getSecondNumber(){
        return Integer.parseInt(secondNumber.getText());
    }

    public int getCalcSolution(){
        return Integer.parseInt(calcSolution.getText());
    }

    public void setCalcSolution(int solution){
        calcSolution.setText(Integer.toString(solution));
    }
    // If the calculateButton is clicked execute a method
    // in the Controller named actionPerformed
    void addCalculateListener(ActionListener listenForCalcButton){
        calculateButton.addActionListener(listenForCalcButton);
    }

    // Open a popup that contains the error message passed
    void displayErrorMessage(String errorMessage){
        JOptionPane.showMessageDialog(this, errorMessage);
    }
}