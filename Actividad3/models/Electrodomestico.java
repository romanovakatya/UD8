package models;

import java.util.Arrays;
import java.util.List;

public class Electrodomestico {

	// atributos,
	//constantes para valores por defecto,
	final private int PRICE_DEFAULT = 100;
	final private String COLOR_DEFAULT = "blanco";
	final private char CONSUMPTION_ENERGY_DEFAULT = 'F';
	final private int WEIGHT_DEFAULT = 5;

	protected int basePrice;
	protected String color;
	protected char energyConsumption;
	protected int weight;

	//colores y consumo energetico disponibles,
	private List<String> colors = Arrays.asList("negro", "rojo", "azul", "gris");
	private List<String> consumption = Arrays.asList("A", "B", "C", "D", "E");

	// constructores,
	// por defecto,
	public Electrodomestico() {
		this.basePrice = this.PRICE_DEFAULT;
		this.color = this.COLOR_DEFAULT;
		this.energyConsumption = this.CONSUMPTION_ENERGY_DEFAULT;
		this.weight = this.WEIGHT_DEFAULT;
	}

	// con el precio y peso, el resto por defecto,
	public Electrodomestico(int precio, int peso) {
		this.basePrice = precio;
		this.color = this.COLOR_DEFAULT;
		this.energyConsumption = this.CONSUMPTION_ENERGY_DEFAULT;
		this.weight = peso;
	}

	// con todos los atributos,
	public Electrodomestico(int precio, String color, char consumo_energetico, int peso) {
		this.basePrice = precio;
		this.color = color;
		this.energyConsumption = consumo_energetico;
		this.weight = peso;
	}

	// métodos,

	// los getters,
	public int getPrecio() {
		return this.basePrice;
	}

	public String getColor() {
		return this.color;
	}

	public char getConsumo_energetico() {
		return this.energyConsumption;
	}

	public int getPeso() {
		return this.weight;
	}



	//mostramos información sobre objeto,
	@Override
	public String toString() {
		return "electrodomestico [precio=" + this.basePrice + ", color=" + this.color 
				+ ", consumo_energetico=" + this.energyConsumption
				+ ", peso=" + this.weight + "]";
	}
	
	
}
