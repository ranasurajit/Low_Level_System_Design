package P4_Behavioral_Design_Patterns.P1_Strategy_Design_Pattern.Java_Example_3_Game_Character_Attack_Behavior.Refactored_Code;

import P4_Behavioral_Design_Patterns.P1_Strategy_Design_Pattern.Java_Example_3_Game_Character_Attack_Behavior.Refactored_Code.strategy.impl.BowAttackStrategy;
import P4_Behavioral_Design_Patterns.P1_Strategy_Design_Pattern.Java_Example_3_Game_Character_Attack_Behavior.Refactored_Code.strategy.impl.MagicAttackStrategy;
import P4_Behavioral_Design_Patterns.P1_Strategy_Design_Pattern.Java_Example_3_Game_Character_Attack_Behavior.Refactored_Code.strategy.impl.SwordAttackStrategy;

public class Main {
    public static void main(String[] args) {
        GameCharacter knight = new GameCharacter(new SwordAttackStrategy());
        knight.performAction();

        GameCharacter archer = new GameCharacter(new BowAttackStrategy());
        archer.performAction();

        GameCharacter mage = new GameCharacter(new MagicAttackStrategy());
        mage.performAction();
    }
}
