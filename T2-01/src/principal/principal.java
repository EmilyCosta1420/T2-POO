package principal;
import javax.swing.JOptionPane;
public class principal {

	public static void main(String[] args) {
			//faça um programa que receba um número inteiro e verifique se é par ou impar;
   int n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro e descubra se ele é par ou ímpar!"));
	float r = n%2;
	if(r == 0) {
	System.out.println("Seu número é par!");
	}
      else {
    System.out.println("Seu número é ímpar!");
					}
			}
		

	}


