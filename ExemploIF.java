//java.lang padrao
import javax.swing.JOptionPane;
public class ExemploIF{
    static public  void main(String [] args){
        //declarção de variaveis 
        //entrada
        double nota =  
            Double.parseDouble(JOptionPane.showInputDialog
            ("Digite a nota"));
        //processamento
        //saida
        if (nota >= 70){
            JOptionPane.showMessageDialog(null, "Aprovado");
        }
    }
}