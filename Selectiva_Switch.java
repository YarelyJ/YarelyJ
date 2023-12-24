
import javax.swing.JOptionPane;

public class Selectiva_Switch {
    public static void main(String[] args) {
        byte x,a;
        a=Byte.parseByte(JOptionPane.showInputDialog("Dime el precio de la compra"));
        x=Byte.parseByte(JOptionPane.showInputDialog("Coloca 1 si no eres cliente frecuente y 2 si eres cliente frecuente"));
        switch (x){
            case 1:
                a+=a*0.10;
            break;
            case 2:
                a-=a*0.10;
            break;
            default:
                System.out.println("Dato incorrecto");
        }
        System.out.println("El total es: " +a);
        JOptionPane.showMessageDialog(null, "El total es: " +a);
    }
}
