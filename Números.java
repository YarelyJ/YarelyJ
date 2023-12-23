
import javax.swing.JOptionPane;
public class Números {
    public static void main(String[] args) {
              long suma;
        int valor, x;
        valor=Integer.parseInt(JOptionPane.showInputDialog("Ingresa un valor entero"));
        suma=valor;
        for(x=valor-2;x>=0;x=x-2){
            suma+=x;
            System.out.println("Suma"+suma);
            suma=suma*(x+1);
            System.out.println("Multiplicación"+suma);
        }
    }
    
}
