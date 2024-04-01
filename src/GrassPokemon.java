public class GrassPokemon extends Pokemon{
    public GrassPokemon(String name, int level) {
        super(name, level);
    }

    @Override
    public void speaks(){
        System.out.println("I'm a Grass Pokemon");
    }

    public void GrassKnot(){
        System.out.println(getName() + "used Grass Knot");
    }

    public void Vinewhip(){
        System.out.println(getName() + "used Vinewhip");
    }
}
