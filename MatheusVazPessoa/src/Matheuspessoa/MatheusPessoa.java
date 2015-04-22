package Matheuspessoa;

import javax.swing.JOptionPane;
import modelo.Cidade;
import modelo.Pessoa;

public class MatheusPessoa {

    public static void main(String[] args) {

        Pessoa p = new Pessoa();

        while (p.getCod() == null)
        {
            try {

                p.setCod(Integer.parseInt(JOptionPane.showInputDialog("Digite o código: ")));
            } catch (Exception ex) {

                JOptionPane.showMessageDialog(null, "O Código é composto por números!");
            }
        }
            p.setNome(JOptionPane.showInputDialog("Digite o nome da pessoa: "));
            p.setSexo(JOptionPane.showInputDialog("Digite o sexo da pessoa: "));

            JOptionPane.showMessageDialog(null, 
                    "Código: "
                    + p.getCod() 
                    + "\n" + "Nome: " 
                    + p.getNome() + "\n" 
                    + "Sexo: " 
                    + p.getSexo());

        
    }
    }
