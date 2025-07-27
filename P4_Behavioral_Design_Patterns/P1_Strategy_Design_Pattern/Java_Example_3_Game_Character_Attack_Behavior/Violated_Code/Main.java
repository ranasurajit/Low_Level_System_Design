package P4_Behavioral_Design_Patterns.P1_Strategy_Design_Pattern.Java_Example_3_Game_Character_Attack_Behavior.Violated_Code;

public class Main {
    public static void main(String[] args) {
        Character knight = new Knight();
        knight.attack();

        Character archer = new Archer();
        archer.attack();

        Character mage = new Mage();
        mage.attack();
    }
}
