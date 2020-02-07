package Clase17;

public class Ejer1 {

		private String animal;
		private String animalVolador;
		private String animalTerreste;
		private String animalAcuatico;
		
		Ejer1 (String animalVolador, String animalTerreste, String animalAcuatico){
			this.animalVolador = animalVolador;
			this.animalTerreste = animalTerreste;
			this.animalAcuatico = animalAcuatico;
			
		}

		public String getAnimal() {
			return animal;
		}

		public void setAnimal(String animal) {
			this.animal = animal;
		}

		public String getAnimalVolador() {
			return animalVolador;
		}

		public void setAnimalVolador(String animalVolador) {
			this.animalVolador = animalVolador;
		}

		public String getAnimalTerreste() {
			return animalTerreste;
		}

		public void setAnimalTerreste(String animalTerreste) {
			this.animalTerreste = animalTerreste;
		}

		public String getAnimalAcuatico() {
			return animalAcuatico;
		}

		public void setAnimalAcuatico(String animalAcuatico) {
			this.animalAcuatico = animalAcuatico;
		}
		
		

}
