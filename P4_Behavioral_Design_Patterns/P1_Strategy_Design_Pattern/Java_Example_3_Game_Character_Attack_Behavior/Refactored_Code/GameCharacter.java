package P4_Behavioral_Design_Patterns.P1_Strategy_Design_Pattern.Java_Example_3_Game_Character_Attack_Behavior.Refactored_Code;

import P4_Behavioral_Design_Patterns.P1_Strategy_Design_Pattern.Java_Example_3_Game_Character_Attack_Behavior.Refactored_Code.strategy.AttackStrategy;

public class GameCharacter {
    private AttackStrategy strategy;

    public GameCharacter(AttackStrategy strategy) {
        this.strategy = strategy;
    }

    public void performAction() {
        this.strategy.attack();
    }
}
