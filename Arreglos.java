import javax.swing.JOptionPane;
public class Arreglos {
    public static void main (String []args){
        byte calculo [] = new byte [5];
        int x,sumatoria = 0,prom;
        String titulos []={"U1","U2","U3","U4","U5","Prom"};
        for (x=0;x<5;x++){
            calculo [x]=Byte.parseByte(JOptionPane.showInputDialog("Ingresa la calificacion de la unidad" +(x+1)));
         sumatoria+=calculo[x];
        }
        //primer codigo de arrgloes
        for(x=0;x<6;x++){
            System.out.print (titulos[x]+"\t");
        } 
        System.out.println(" ");
         for(x=0;x<5;x++){
        System.out.print (calculo[x]+"\t");
        
         }
         prom=sumatoria/x;
        System.out.print (prom);  
    }
}
