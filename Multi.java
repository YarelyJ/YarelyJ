
import javax.swing.JOptionPane;

public class Multi {
    public static void main(String[] args) {
        int x,y,c,v,mult;
        byte matriz[][] = new byte[3][3];
        byte matriz2[][] = new byte[3][3];
        for (x=0;x<3;x++){
            System.out.println();
            for (y=0;y<3;y++){
                matriz[x][y]=Byte.parseByte(JOptionPane.showInputDialog("Ingresa los valores de la matriz 1"));
                System.out.print(matriz[x][y] + "   ");
            }
        }
        for (x=0;x<3;x++){
            System.out.println();
            for (y=0;y<3;y++){
                matriz2[x][y]=Byte.parseByte(JOptionPane.showInputDialog("Ingresa los valores de la matriz 2"));
                System.out.print(matriz2[x][y] + "  ");
            }
        }
        for (x=0;x<3;x++){
            for (y=0;y<3;y++){
                System.out.println();
                for (c=0;c<3;c++){
                    System.out.println();
                    for (v=0;v<3;v++){
                        mult=matriz[x][y] * matriz2[c][v];
                        System.out.print(mult + "   ");
                    }
                }
            }
        }
    }
}
