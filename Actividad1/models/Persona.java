package models;

/**
 * @author Katia
 *
 */
public class Persona {
			
		// atributos,
		private String name;
		private int age;
		private String dni;
		private char sex;
		private double weight;
		private double height;
		
		final private char SEX = 'H';
		final private String DNI = "XXXXXXXX";

		
		//constructores,
		//por defecto,
		public Persona() {
			this.name = "";
			this.age = 0;
			this.dni = this.DNI;
			this.sex = this.SEX;
			this.weight = 0;
			this.height = 0;
					
	}

		/**
		 * con 3 atributos 
		 * @param name
		 * @param age
		 * @param sex
		 */
		public Persona(String name, int age, char sex) {

			this.name = name;
			this.age = age;
			this.dni = this.DNI;
			this.sex = sex;
			this.weight = 0;
			this.height = 0;
		}
		
		/**
		 * con todos los atributos,
		 * 
		 * @param name
		 * @param age
		 * @param dni
		 * @param sex
		 * @param weight
		 * @param height
		 */
		public Persona(String name, int age, String dni, char sex, double weight, double height) {

			this.name = name;
			this.age = age;
			this.dni = dni;
			this.sex = sex;
			this.weight = weight;
			this.height = height;
		}

		//getters y setters,

		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}


		public int getAge() {
			return age;
		}


		public void setAge(int age) {
			this.age = age;
		}


		public String getDni() {
			return dni;
		}


		public void setDni(String dni) {
			this.dni = dni;
		}


		public char getSex() {
			return sex;
		}


		public void setSex(char sex) {
			this.sex = sex;
		}


		public double getWeight() {
			return weight;
		}


		public void setWeight(double weight) {
			this.weight = weight;
		}


		public double getHeight() {
			return height;
		}


		public void setHeight(double height) {
			this.height = height;
		}
}
