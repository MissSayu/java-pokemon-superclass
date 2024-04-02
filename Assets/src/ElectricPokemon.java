public class ElectricPokemon extends Pokemon{

    private int knownElectricAtks;
    private String faveElcAttack;


    public ElectricPokemon(String name, int level, int knownElectricAtks,String faveElcAttack) {
        super(name, level);
        this.knownElectricAtks = knownElectricAtks;
        this.faveElcAttack = faveElcAttack;
    }

    @Override
    public void speaks(){
        System.out.println("I'm an electric pokemon");
    }
    @Override
    public void move(){
        System.out.println(getName() + " is fast!");
    }

    public void thunderPunch(){
        System.out.println(getName() + " used Thunder Punch!");
    }
    public void ElectroBall(){
        System.out.println(getName() + " used Electro Ball!");
    }

    public int getKnownElectricAtks() {
        return knownElectricAtks;
    }

    public void setKnownElectricAtks(int knownElectricAtks) {
        this.knownElectricAtks = knownElectricAtks;
    }

    public String getFaveElcAttack() {
        return faveElcAttack;
    }

    public void setFaveElcAttack(String faveElcAttack) {
        this.faveElcAttack = faveElcAttack;
    }
}