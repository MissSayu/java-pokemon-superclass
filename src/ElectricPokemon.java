public class ElectricPokemon extends Pokemon{

    public ElectricPokemon(String name, int level) {
        super(name, level);
    }

    @Override
    public void speaks(){
        System.out.println("I'm an Electric Pokemon");
    }

    public void Thunderpunch(){
        System.out.println(getName() + "used Thunder Punch");
    }

    public void ElectroBall(){
        System.out.println(getName() + "used ElectroBall");
    }
}
