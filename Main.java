
public class Main
{
	public static void main(String[] args) {
		Plants plants = new Plants();
		Tree tree = new Tree();
        plants.setID(100);
        plants.setFlower("Rose");
        plants.setFruits("Apple");
        plants.setHerbs("Cilantro");
        plants.setVegetables("Squash");
        
        System.out.println("Hi! you inputted the ID Number of "+plants.getID()+" and inside of this ID, there are "+plants.getFlower()+", "+plants.getFruits()+", "+plants.getHerbs()+", and "+plants.getVegetables()+".");
        tree.photosynthesis();
    }
}
