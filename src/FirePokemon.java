public class FirePokemon extends Pokemon{

    private boolean HasVisibleFlame;
    private String color;
    public FirePokemon(String name, int level) {
        super(name, level);
    }


    @Override
    public void speaks(){
        System.out.println("I'm an Fire Pokemon");
    }

    public void Firepunch(){
        System.out.println(getName() + "used Fire Punch");
    }

    public void Ember(){
        System.out.println(getName() + "used Ember");
    }
}
