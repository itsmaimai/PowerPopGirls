public class Plants {

    private int ID;
    private String Fruits;
    private String Vegetables;
    private String Flower;
    private String Herbs;

    public void setID(int newID) {
        ID = newID;
    }

    public int getID() {
        return ID;
    }

    public void setFruits(String newFruits) {
        Fruits = newFruits;
    }

    public String getFruits() {
        return Fruits;
    }

    public void setVegetables(String newVegetables) {
        Vegetables = newVegetables;
    }

    public String getVegetables() {
        return Vegetables;
    }

    public void setFlower(String newFlower) {
        Flower = newFlower;
    }

    public String getFlower() {
        return Flower;
    }

    public void setHerbs(String newHerbs) {
        Herbs = newHerbs;
    }

    public String getHerbs() {
        return Herbs;
    }
    public static void photosynthesis(){
        System.out.println("Getting light energy from the sun!");
    }

}
