/**
 *
 * @author Lindsay Gen10
 */
public class PokemonCard {
    String pokemonName;
    int attack;
    int defense;
    int specialBar;
    //constructor
    public PokemonCard(String name, int att, int def)
    {
        pokemonName = name;
        attack = att;
        defense = def;
        specialBar = 0;
    }
    //get methods
    public String getName()
    {
        return pokemonName;
    }
    public int getAttack()
    {
        return attack;
    }
    public int getDefense()
    {
        return defense;
    }
    public int getSpecialBar()
    {
        return specialBar;
    }
    //some other methods...
    public double basicAttack()
    {
        double attackValue = attack;
        if(specialBar >= (attack + defense)/4)
        {
            System.out.println(pokemonName + " has a SPECIAL ATTACK!");
            attackValue = specialAttack();
            specialBar = 0;
        } 
        return attackValue;
    }
    public double criticalAttack()
    {
        double attackValue = attack * 1.25;
        return attackValue;
    }
    public double specialAttack()
    {
        double attackValue = attack*1.50;
        return attackValue;
    }
    public void fillSpecialBar(int plus)
    {
        specialBar += plus;
        
    }
    public void readStats()
    {
        System.out.println("-----------------------------------------");
        System.out.println("Name: " + pokemonName);
        System.out.println("Attack: " + attack);
        System.out.println("Defense: " + defense);
        System.out.println("Current Special Bar Value: " + specialBar);
        System.out.println("-----------------------------------------");
    }
    
}
