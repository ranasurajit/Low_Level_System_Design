package P4_Behavioral_Design_Patterns.P1_Strategy_Design_Pattern.Java_Example_3_Game_Character_Attack_Behavior.Violated_Code;

public class Knight extends Character {
    @Override
    public void attack() {
        System.out.println("Knight slashes with a sword!");
    }
}
