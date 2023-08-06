import javax.swing.*;
public class sert {
   /* Faça um programa que leia o nome, sexo, peso e altura
    de N pessoas.
• Após o cadastro, exiba o nome, o IMC e a avaliação do
    IMC de todas as pessoas.*/
    public static void main(String[] args) {
        int n;
         n = Integer.parseInt(JOptionPane.showInputDialog(null,"informe a quntidade de pessoas "));
       for (int i = 0; i < n;i++) {

            String nome = JOptionPane.showInputDialog(null, "informe o seu nome");
            char sexo = JOptionPane.showInputDialog("informe o sexo").toUpperCase().charAt(0);
            double peso = Double.parseDouble(JOptionPane.showInputDialog(null, "informe o seu peso"));
            double autura = Double.parseDouble(JOptionPane.showInputDialog(null, "informe a sua altura"));

            double imc = peso / (autura * autura);

            if (sexo == 'M'){
                if (imc < 20.7){
                    JOptionPane.showMessageDialog(null,"abaixo do peso");
                }else if ((imc >= 20.7) && (imc <= 26.4)){
                    JOptionPane.showMessageDialog(null,"peso ideal");
                }else if ((imc >= 26.5 ) && (imc <= 27.8)){
                    JOptionPane.showMessageDialog(null,"pouco acima do peso");
                }else if ((imc >= 27.9 ) && (imc <= 31.1)){
                    JOptionPane.showMessageDialog(null,"acima do peso");
                }else if (imc > 31.2 ){
                    JOptionPane.showMessageDialog(null,"obsidade");
                }

                }if (sexo == 'F'){
                  if (imc < 19.1){
                      JOptionPane.showMessageDialog(null,"abaixo do peso");
                  }else if ((imc >= 19.1) && (imc <= 25.8)){
                      JOptionPane.showMessageDialog(null,"peso ideal");
                  }else if ((imc >= 25.9) && (imc <= 27.3)){
                      JOptionPane.showMessageDialog(null,"pouco acima do peso");
                  }else if ((imc >= 27.4) && (imc <= 32.3)){
                      JOptionPane.showMessageDialog(null,"acima do peso");
                  }else if (imc >= 32.4){
                      JOptionPane.showMessageDialog(null,"obsidade");
                  }

            }JOptionPane.showMessageDialog(null," RELATORIO DA CONSUTA\n "+ " nome " + nome  +  "\npeso "+ peso + "\naltura "+ autura + "\nimc " + imc);
       }
    }
}
