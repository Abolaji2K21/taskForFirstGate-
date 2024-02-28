package LivingThing;

public class Aves extends Vertebrate {
    public Aves(int age, String species, String environment) {
        super(age, species, environment);
    }

    @Override
    public void move(){
        System.out.println("Bird is flying.");
    }

//    public static void main(String[] args) {
//        Aves myAves = new Aves(3, "Aves" , "Sky");
//
//        myAves.move();
//        myAves.getAge();
//
//    }
}
