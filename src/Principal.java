import java.util.Scanner;

import javax.swing.JOptionPane;


public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int x1,y1,x2,y2,x3,y3;
		
		
		Punto pT1;
		Punto pT2;
		Punto pT3;
		
		x1=Integer.parseInt(JOptionPane.showInputDialog("ingrese la cordenada x del punto 1"));
		y1=Integer.parseInt(JOptionPane.showInputDialog("ingrese la cordenada y del punto 1"));
		x2=Integer.parseInt(JOptionPane.showInputDialog("ingrese la cordenada x del punto 2"));
		y2=Integer.parseInt(JOptionPane.showInputDialog("ingrese la cordenada y del punto 2"));
		x3=Integer.parseInt(JOptionPane.showInputDialog("ingrese la cordenada x del punto 3"));
		y3=Integer.parseInt(JOptionPane.showInputDialog("ingrese la cordenada y del punto 3"));
		
	
		
		pT1 = new Punto(x1,y1);
		pT2 = new Punto(x2,y2);
		pT3 = new Punto(x3,y3);
		
		Triangulo triangulo = new Triangulo(pT1,pT2,pT3);
		
		System.out.println(triangulo.toString());
		
		System.out.println(triangulo.HallarPerimetro());
		
		System.out.println(triangulo.TipoTriangulo());
	}

}
