package com.Interface;

public class InterfaceTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shap s1 = new Circle(13);
		s1.shap_radious();
		
		Shap2 s2 = new Circle(14);
		s2.shap_Valume();
		
		s1= new Rectangle(2, 3);
		s1.shap_radious();
		
		s2= new Rectangle(2, 3,13);
		s2.shap_Valume();
		
		s1 = new Square(12);
		s1.shap_radious();
		
		s2 = new Square(12);
		s2.shap_Valume();
	}

}
