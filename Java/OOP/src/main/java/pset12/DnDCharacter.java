package pset12;

import java.util.Random;
public class DnDCharacter {
    int strength = ability();
    int dexterity = ability();
    int constitution = ability();
    int intelligence = ability();
    int wisdom = ability();
    int charisma = ability();

    // Random generator
    int ability() {
        Random rand = new Random();
        int ability = 0;
        int max = 7;
        // Generate 4 random numbers from 1-7
        for (int i = 0; i < 4; i++) {
            int temp = 1 + rand.nextInt(6);

            // Finding the min number
            if (temp < max){
                max = temp;
            }

            ability += temp;
        }

        return ability - max;

    }

    int modifier(double n) {
        // You find your character's constitution modifier by subtracting 10 from your character's constitution,
        // divide by 2 and round down.
        return (int) Math.floor((n - 10) / 2);
    }

    public int getStrength() {
        return strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public int getConstitution() {
        return constitution;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getCharisma() {
        return charisma;
    }

    public int getHitpoints(){
        // Your character's initial hitpoints are 10 + your character's constitution modifier.
        return 10 + modifier(getConstitution());
    }
}
