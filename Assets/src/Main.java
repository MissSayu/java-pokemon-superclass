import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ElectricPokemon Electabuzz = new ElectricPokemon("Zappy", 20, 2,"Thundershock");
        FirePokemon Ponyta = new FirePokemon("Ruby", 17, true, "orange");
        WaterPokemon Horsea = new WaterPokemon("Bubbles", 37, false, 9000);
        GrassPokemon Oddish = new GrassPokemon("Riko", 9, false, 1.5f);

        Electabuzz.ElectroBall();
        Ponyta.flamewheel();
        Horsea.hydroPump();
        Oddish.grassKnot();


        List<Pokemon> pokemonList = new ArrayList<>();
        pokemonList.add(Electabuzz);
        pokemonList.add(Ponyta);
        pokemonList.add(Horsea);
        pokemonList.add(Oddish);

        for (Pokemon p: pokemonList){
            p.eats();
            p.move();
            p.speaks();
        }
    }


}