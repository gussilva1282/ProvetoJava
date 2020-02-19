
package PacoteJava;
import javax.swing.*;

public class RestoDivisao {
    
    public static void main(String[] args) {
        
        double num1, num2, resto = 0;
        
        String aux = " ";
        
        aux = JOptionPane.showInputDialog(null,"Entre com o primeiro numero: ");
        num1 = Double.parseDouble(aux); 
        
          aux = JOptionPane.showInputDialog(null,"Entre com o segundo numero: ");
        num2 = Double.parseDouble(aux);
        
         resto = (num1 % num2);
        JOptionPane.showMessageDialog(null, "O resto é: "+ resto);
                
                
    }
}
