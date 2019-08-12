package duck;

public class woodDuck extends Duck {
    public woodDuck(){
        this.setFlyBehavior(new FlyNoway());
    }

}
