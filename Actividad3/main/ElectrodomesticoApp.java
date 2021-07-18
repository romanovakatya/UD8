package main;

import models.Electrodomestico;

public class ElectrodomesticoApp {

	public static void main(String[] args) {
		// declaración de las variables,

		Electrodomestico frigorifico = new Electrodomestico();
		Electrodomestico portatil = new Electrodomestico(1000, 2);
		Electrodomestico cepilloElectrico = new Electrodomestico(49, "Rojo", 'D', 0);
		Electrodomestico aireCondicionado = new Electrodomestico(500, "Blue", 'Y', 80);

		// creamos un array de 10 Objetos de tipo electrodomestico,
		Electrodomestico[] electrodomesticos = new Electrodomestico[10];

		// Asigna a cada posición un objeto,
		electrodomesticos[0] = frigorifico;
		electrodomesticos[1] = portatil;
		electrodomesticos[2] = cepilloElectrico;
		electrodomesticos[3] = aireCondicionado;

		System.out.println(frigorifico.toString());
		System.out.println(portatil.toString());
		System.out.println(cepilloElectrico.toString());
		System.out.println(aireCondicionado.toString());

	}
}
