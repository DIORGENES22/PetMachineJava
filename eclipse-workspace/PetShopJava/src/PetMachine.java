public class PetMachine {
	
	//Atributos
	private boolean clean = true;
	
	private int water = 30;
	
	private int shampoo = 10;
	
	private Pet pet;
	
	
	//Construtor
	public void takeAShower() {
		if(this.pet == null) {
			System.out.println("Coloque o pet na maquina para iniciar o banho");
			return;
		}
		
		this.water -= 10;
		this.shampoo -= 2;
		
		pet.setClean(true);
		System.out.println("O pet " + pet.getName() + " Está limpo");
	}	
	
	
	
	
	public void addWater(){
	 if(water == 30) {
			System.out.println("A capacidade de água da maquiana está no máximo");
			return; 
		}
		
		water += 2;
	}
	
	public void addShampoo(){
		if(shampoo == 30){
			System.out.println("A capacidade de shampoo da maquiana está no máximo");
			return; 
		}
		
		shampoo += 2;
	}
	
	public int getWater(){
		return water;
	}
	
	public int getShampoo(){
		return shampoo;
	}
	
	public boolean hasPet() {
		return pet != null;
	}
	
	
	public void setPet(Pet pet){
		if(!this.clean) {
			
		}
		if(hasPet()) {
			System.out.println("O pet " + this.pet.getName() + " está a maquiana nesse momento ");
			return;
		}
		
		   this.pet = pet;
		   System.out.println("o Pet "+ pet.getName() + " foi colocado na maquina nesse momento");
	}
	
	
	
	//metodos diretos
	
	public void removePet(){
		this.clean = this.pet.isClean();
		System.out.println("O pet "+ this.pet.getName()+ " foi tirado da máquina");
		this.pet = null;
	}
	
    


	
	public void wash(){
		this.water -= 3;
		this.shampoo -= 2;
		this.clean = true;
		System.out.println("A maquina esta limpa");
		
	
	}

	
	
}






