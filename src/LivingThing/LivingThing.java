package LivingThing;

public class LivingThing {
    private int age;
    private boolean alive;
    private String species;
    private String environment;


    public LivingThing(int age, String species, String environment){
        this.age = age;
        this.species = species;
        this.alive = true;
        this.environment = environment;
    }

    public boolean isAlive(){
        return alive;
    }

    public int getAge(){
        return age;
    }

    public String getSpecies(){
        return species;
    }

    public String getEnvironment() {
        return environment;
    }

    public String getHealthStatus(){
        return alive ? "Alive" : "Dead";
    }

    public void move(){
        System.out.println(species + " is moving.");
    }
}
