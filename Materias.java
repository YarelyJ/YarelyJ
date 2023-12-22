import javax.swing.JOptionPane;
public class Materias {
    public static void main (String []args){
       byte y=0,x=0,h,u=0;
       short suma=0,prom=0,bl=0,l=0,e=0;
       short matriz [][]=new short [6][5];
       String unid []={"U1","U2","U3","U4","U5","PROM"};
       String mater[]={"DES","FUI","FUP","CAL","MAD","QUI"};
       System.out.print("        ");
       for(u=0;u<=5;u++){
           System.out.print(unid[u]+ "\t");
       }
       System.out.println("");
       for(h=0;h<=5;h++){
            System.out.print(mater[h]+"\t");
            suma=0;
            for (y=0;y<=4;y++){  
            matriz [x][y]=Short.parseShort(JOptionPane.showInputDialog("Ingresa la calificacion de 1"+mater[h] + " de la unidad "+(y+1)));
            System.out.print(matriz[x][y]+"\t");         
            suma+=matriz[x][y];
            prom=  (short) (suma/5);
            bl+=matriz[x][y];
            l=(short) (bl/5);
           }     
        System.out.println(prom);
                e=(short) (l/6);        
       }
     System.out.println("PROMEDIO GENERAL");
     System.out.println(e);
    }
}
         
         
         


