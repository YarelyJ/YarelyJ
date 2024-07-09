package Sem_2;

import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Calificaciones implements ActionListener{
    private JComboBox semes, carre;
    private JButton limp, canc, guar, prom;
    private JFrame a;
    String sem,carr;
    int f = 85,g,h,j,i,c;
    double average;
    public Calificaciones(){
        a= new JFrame();
	a.setLayout(null);
        a.setTitle("Rregistro de Calificacones");
        a.setLocationRelativeTo(null);
        a.setResizable(false);
        a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        a.setSize(450,500); 
        a.setVisible(true);
                
        JLabel carrera = new JLabel("Carrera");
        carrera.setBounds(30, 22, 200, 20);
        a.add(carrera);
        
        carre = new JComboBox();
        carre.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent ie) {
               carr=carre.getSelectedItem().toString();
               if (carr.equals("Ing. Sistemas")){
                   c=03;
               }
            }
        });
        carre.setBounds(150, 20, 200, 27);
        carre.addItem("Ing. Logistica");
        carre.addItem("Ing. Mecatronica");
        carre.addItem("Ing. Sistemas");
        carre.addItem("Ing. TIC's");
        carre.addItem("Ing. Civil");
        carre.addItem("Ing. Quimica");
        carre.addItem("Ing. Electrica");
        carre.addItem("Administración");
        a.add(carre);
        
        JLabel semest = new JLabel("Semestre");
        semest.setBounds(30, 62, 200, 20);
        a.add(semest);
        
        semes = new JComboBox();
        semes.setBounds(150, 60, 100, 27);
        semes.addItem("1er Sem"); 
        semes.addItem("2do Sem");
        semes.addItem("3er Sem");
        semes.addItem("4to Sem");
        semes.addItem("5to Sem");
        semes.addItem("6to Sem");
        semes.addItem("7mo Sem");
        semes.addItem("8vo Sem");
        semes.addItem("9no Sem");
        a.add(semes);
        semes.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
               if(c==03){
                mostrarSeme();
                f=85;
               }
            }
        });
        
        JLabel uni = new JLabel("U1");
        uni.setBounds(150, 90, 50, 20);
        a.add(uni);
        
        JLabel uni1 = new JLabel("U2");
        uni1.setBounds(190, 90, 50, 20);
        a.add(uni1);
        
        JLabel uni2 = new JLabel("U3");
        uni2.setBounds(230, 90, 50, 20);
        a.add(uni2);
        
        JLabel uni3 = new JLabel("U4");
        uni3.setBounds(270, 90, 50, 20);
        a.add(uni3);
        
        JLabel uni4 = new JLabel("U5");
        uni4.setBounds(310, 90, 50, 20);
        a.add(uni4);
        
       limp = new JButton("Limpiar");
       limp.setBounds(30,390,100,25);
       a.add(limp);
       limp.addActionListener(new ActionListener() {
       public void actionPerformed(ActionEvent e) {
        Component[] components = a.getComponents();
        for (Component component : components) {
            if (component instanceof JTextField) {
                ((JTextField) component).setText("");
            }
        }
    }
});
    canc = new JButton("Cancelar");
    canc.setBounds(300,390,100,25);
    a.add(canc);
    canc.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            a.dispose();
        }
    });
       
       guar = new JButton("Guardar");
       guar.setBounds(170,390,100,25);
       a.add(guar);
       guar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
       
   }
    private void mostrarSeme(){
        sem = semes.getSelectedItem().toString();
        if (sem.equals("1er Sem")){
            primerSem();
        }else if (sem.equals("2do Sem")){
            segundoSem();
        }else if (sem.equals("3er Sem")){
            tercerSem();    
        }else if (sem.equals("4to Sem")){
            cuartoSem();        
        }else if (sem.equals("5to Sem")){
            quintoSem();   
        }else if (sem.equals("6to Sem")){
            sextoSem();    
        }else if (sem.equals("7mo Sem")){
            septimoSem();
        }else if (sem.equals("8vo Sem")){
            octavoSem();    
        }else if (sem.equals("9no Sem")){
            novenoSem();
        }
    }
    public void primerSem(){
    JLabel[] labels = new JLabel[] {
        new JLabel("Cal. Dif."),
        new JLabel("Quimica"),
        new JLabel("Fund. Pro."),
        new JLabel("Mat. Disc."),
        new JLabel("Desa. Sust."),
        new JLabel("Fund. Inv.")
    };
    JTextField[][] textFields = new JTextField[labels.length][5];
    for (int i = 0; i < labels.length; i++) {
        labels[i].setBounds(30, 110 + i * 30, 200, 25);
        a.add(labels[i]);
        for (int j = 0; j < 5; j++) {
            textFields[i][j] = new JTextField();
            textFields[i][j].setBounds(150 + j * 40, 110 + i * 30, 20, 20);
            a.add(textFields[i][j]);
        }
    }
    JButton calculateButton = new JButton("Promedio");
    calculateButton.setBounds(170, 340, 100, 25);
    a.add(calculateButton);
    calculateButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            int sum = 0;
            for (JTextField[] row : textFields) {
                for (JTextField textField : row) {
                    sum += Integer.parseInt(textField.getText());
                }
            }
            double average = (double) sum / 30;
            JOptionPane.showMessageDialog(a, "Tu promedio es de: " + average);
        }
    });
}
    public void segundoSem() {
    JLabel[] labels = {
        new JLabel("Calc. Int."),
        new JLabel("Tutorias"),
        new JLabel("Fisica"),
        new JLabel("P.O.O"),
        new JLabel("Prob. Y Est."),
        new JLabel("T. Admin."),
        new JLabel("Algebra L.")
    };
    JTextField[][] textFields = new JTextField[labels.length][5];
    for (int i = 0; i < labels.length; i++) {
        labels[i].setBounds(30, 110 + i * 30, 200, 25);
        a.add(labels[i]);
        for (int j = 0; j < 5; j++) {
            textFields[i][j] = new JTextField();
            textFields[i][j].setBounds(150 + j * 40, 110 + i * 30, 20, 20);
            a.add(textFields[i][j]);
        }
    }
    JButton calculateButton = new JButton("Promedio");
    calculateButton.setBounds(170, 340, 100, 25);
    a.add(calculateButton);
    calculateButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            int sum = 0;
            for (JTextField[] row : textFields) {
                for (JTextField textField : row) {
                    sum += Integer.parseInt(textField.getText());
                }
            }
            double average = (double) sum / 35;
            JOptionPane.showMessageDialog(a, "Tu promedio es de : " + average);
        }
    });
}
    public void tercerSem(){
        JLabel[] labels = {
        new JLabel("Calc. Vect."),
        new JLabel("Est. Datos"),
        new JLabel("Fun. Telec."),
        new JLabel("Inv Opera."),
        new JLabel("Sis. Opera."),
        new JLabel("Prin. Elec."),
    };
    JTextField[][] textFields = new JTextField[labels.length][5];
    for (int i = 0; i < labels.length; i++) {
        labels[i].setBounds(30, 110 + i * 30, 200, 25);
        a.add(labels[i]);
        for (int j = 0; j < 5; j++) {
            textFields[i][j] = new JTextField();
            textFields[i][j].setBounds(150 + j * 40, 110 + i * 30, 20, 20);
            a.add(textFields[i][j]);
        }
    }
    JButton calculateButton = new JButton("Promedio");
    calculateButton.setBounds(170, 300, 100, 25);
    a.add(calculateButton);
    calculateButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            int sum = 0;
            for (JTextField[] row : textFields) {
                for (JTextField textField : row) {
                    sum += Integer.parseInt(textField.getText());
                }
            }
            double average = (double) sum / 30;
            JOptionPane.showMessageDialog(a, "Tu promedio es de: " + average);
        }
    });
}
    public void cuartoSem(){
        JLabel[] labels = {
        new JLabel("Ecua. Dif."),
        new JLabel("Met. Num."),
        new JLabel("T.A.P"),
        new JLabel("Fba. Datos"),
        new JLabel("Tsiste. OP."),
        new JLabel("Ar. Com."),
        new JLabel("T. Etica")
    };
    JTextField[][] textFields = new JTextField[labels.length][5];
    for (int i = 0; i < labels.length; i++) {
        labels[i].setBounds(30, 110 + i * 30, 200, 25);
        a.add(labels[i]);
        for (int j = 0; j < 5; j++) {
            textFields[i][j] = new JTextField();
            textFields[i][j].setBounds(150 + j * 40, 110 + i * 30, 20, 20);
            a.add(textFields[i][j]);
        }
    }
    JButton calculateButton = new JButton("Promedio");
    calculateButton.setBounds(170, 340, 100, 25);
    a.add(calculateButton);
    calculateButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            int sum = 0;
            for (JTextField[] row : textFields) {
                for (JTextField textField : row) {
                    sum += Integer.parseInt(textField.getText());
                }
            }
            double average = (double) sum / 35;
            JOptionPane.showMessageDialog(a, "Tu promedio es de: " + average);
        }
    });
}
    public void quintoSem(){
      JLabel[] labels = {
        new JLabel("Leng. Auto."),
        new JLabel("Redes Com."),
        new JLabel("T. Base D."),
        new JLabel("Simulacion"),
        new JLabel("F.I.S"),
        new JLabel("C. Financiera"),
    };
    JTextField[][] textFields = new JTextField[labels.length][5];
    for (int i = 0; i < labels.length; i++) {
        labels[i].setBounds(30, 110 + i * 30, 200, 25);
        a.add(labels[i]);
        for (int j = 0; j < 5; j++) {
            textFields[i][j] = new JTextField();
            textFields[i][j].setBounds(150 + j * 40, 110 + i * 30, 20, 20);
            a.add(textFields[i][j]);
        }
    }
    JButton calculateButton = new JButton("Promedio");
    calculateButton.setBounds(170, 300, 100, 25);
    a.add(calculateButton);
    calculateButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            int sum = 0;
            for (JTextField[] row : textFields) {
                for (JTextField textField : row) {
                    sum += Integer.parseInt(textField.getText());
                }
            }
            double average = (double) sum / 30;
            JOptionPane.showMessageDialog(a, "Tu promedio es de: " + average);
        }
    });  
}
    public void sextoSem(){
        JLabel[] labels = {
        new JLabel("Leng. Auto."),
        new JLabel("A. Base.D"),
        new JLabel("Pro. Web"),
        new JLabel("Admi. Redes"),
        new JLabel("Ing. Software"),
        new JLabel("Sis. Prog."),
    };
    JTextField[][] textFields = new JTextField[labels.length][5];
    for (int i = 0; i < labels.length; i++) {
        labels[i].setBounds(30, 110 + i * 30, 200, 25);
        a.add(labels[i]);
        for (int j = 0; j < 5; j++) {
            textFields[i][j] = new JTextField();
            textFields[i][j].setBounds(150 + j * 40, 110 + i * 30, 20, 20);
            a.add(textFields[i][j]);
        }
    }
    JButton calculateButton = new JButton("Promedio");
    calculateButton.setBounds(170, 300, 100, 25);
    a.add(calculateButton);
    calculateButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            int sum = 0;
            for (JTextField[] row : textFields) {
                for (JTextField textField : row) {
                    sum += Integer.parseInt(textField.getText());
                }
            }
            double average = (double) sum / 30;
            JOptionPane.showMessageDialog(a, "Tu promedio es de: " + average);
        }
    });  
}
    public void septimoSem(){
        JLabel[] labels = {
        new JLabel("P.L.F."),
        new JLabel("Conmutacion"),
        new JLabel("Tinv."),
        new JLabel("Des. App"),
        new JLabel("Ges. Soft."),
        new JLabel("Incosas."),
        new JLabel("Graficacion")
    };
    JTextField[][] textFields = new JTextField[labels.length][5];
    for (int i = 0; i < labels.length; i++) {
        labels[i].setBounds(30, 110 + i * 30, 200, 25);
        a.add(labels[i]);
        for (int j = 0; j < 5; j++) {
            textFields[i][j] = new JTextField();
            textFields[i][j].setBounds(150 + j * 40, 110 + i * 30, 20, 20);
            a.add(textFields[i][j]);
        }
    }
    JButton calculateButton = new JButton("Promedio");
    calculateButton.setBounds(170, 340, 100, 25);
    a.add(calculateButton);
    calculateButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            int sum = 0;
            for (JTextField[] row : textFields) {
                for (JTextField textField : row) {
                    sum += Integer.parseInt(textField.getText());
                }
            }
            double average = (double) sum / 35;
            JOptionPane.showMessageDialog(a, "Tu promedio es de: " + average);
        }
    });
}
    public void octavoSem(){
        JLabel[] labels = {
        new JLabel("IA"),
        new JLabel("Ciberseg."),
        new JLabel("T. Inve."),
        new JLabel("Preactiva"),
        new JLabel("Si. Distri."),
        new JLabel("C. Empresa"),
    };
    JTextField[][] textFields = new JTextField[labels.length][5];
    for (int i = 0; i < labels.length; i++) {
        labels[i].setBounds(30, 110 + i * 30, 200, 25);
        a.add(labels[i]);
        for (int j = 0; j < 5; j++) {
            textFields[i][j] = new JTextField();
            textFields[i][j].setBounds(150 + j * 40, 110 + i * 30, 20, 20);
            a.add(textFields[i][j]);
        }
    }
    JButton calculateButton = new JButton("Promedio");
    calculateButton.setBounds(170, 300, 100, 25);
    a.add(calculateButton);
    calculateButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            int sum = 0;
            for (JTextField[] row : textFields) {
                for (JTextField textField : row) {
                    sum += Integer.parseInt(textField.getText());
                }
            }
            double average = (double) sum / 30;
            JOptionPane.showMessageDialog(a, "Tu promedio es de: " + average);
        }
    });
}
    public void novenoSem() {
    JLabel[] labels = {
        new JLabel("Re.Pro.")
    };
    JTextField[][] textFields = new JTextField[labels.length][5];
    for (int i = 0; i < labels.length; i++) {
        labels[i].setBounds(30, 110 + i * 30, 200, 25);
        a.add(labels[i]);
        for (int j = 0; j < 5; j++) {
            textFields[i][j] = new JTextField();
            textFields[i][j].setBounds(150 + j * 40, 110 + i * 30, 20, 20);
            a.add(textFields[i][j]);
        }
    }
    JButton calculateButton = new JButton("Promedio");
    calculateButton.setBounds(170, 300, 100, 25);
    a.add(calculateButton);
    calculateButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            int sum = 0;
            for (JTextField[] row : textFields) {
                for (JTextField textField : row) {
                    sum += Integer.parseInt(textField.getText());
                }
            }
            double average = (double) sum / 5;
            JOptionPane.showMessageDialog(a, "Tu promedio es de: " + average);
        }
    });
}   
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}