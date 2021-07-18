package main;

import models.Persona;

public class PersonaApp {

	public static void main(String[] args) {
		Persona persona1 = new Persona();
		Persona persona2 = new Persona("Katia", 33, 'M');
		Persona persona3 = new Persona("Sergiy", 32, "R56452387Z", 'M', 90.2, 187);
		
		System.out.println("Persona 1. Name: " + persona1.getName() + ", edad: " + persona1.getAge() + 
				", DNI: " + persona1.getDni() + ", sexo: " + persona1.getSex() + ", peso: " + persona1.getWeight() + 
				", altura: " + persona1.getHeight());
		
		System.out.println("Persona 2. Name: " + persona2.getName() + ", edad: " + persona2.getAge() + 
				", DNI: " + persona2.getDni() + ", sexo: " + persona2.getSex() + ", peso: " + persona2.getWeight() + 
				", altura: " + persona2.getHeight());
		
		System.out.println("Persona 3. Name: " + persona3.getName() + ", edad: " + persona3.getAge() + 
				", DNI: " + persona3.getDni() + ", sexo: " + persona3.getSex() + ", peso: " + persona3.getWeight() + 
				", altura: " + persona3.getHeight());

	}

}
