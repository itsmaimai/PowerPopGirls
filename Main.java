/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
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
