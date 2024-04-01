public class WaterPokemon extends Pokemon {
    public WaterPokemon(String name, int level) {
        super(name, level);
    }

    @Override
    public void speaks(){
        System.out.println("I'm a Water Pokemon");
    }

    public void Watergun(){
        System.out.println(getName() + "used Watergun");
    }

    public void Surf(){
        System.out.println(getName() + "used Surf");
    }
}
