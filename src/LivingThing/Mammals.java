package LivingThing;

public class Mammals extends Vertebrate {
    public Mammals(int age, String species, String environment) {
        super(age, species, environment);
    }



   @Override
   public void move(){
       System.out.println(getSpecies() + " walking on land");
   }

    public static void main(String[] args) {
        Mammals myMammals = new Mammals(3, "Mammal", "Land");

        myMammals.move();

    }
}
