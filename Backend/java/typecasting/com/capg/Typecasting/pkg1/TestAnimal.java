package com.capg.Typecasting.pkg1;

public class TestAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a1=new Animal();
		a1.eat();
		
		Animal a2=new Dog();
		a2.eat();
		
		Animal a3=new Lion();
		a3.eat();
		
		Dog d1=(Dog)a2;
		d1.eat();
        d1.walk();
		 Lion l1=(Lion)a3;
		 l1.eat();
		 l1.run();
	}

}
