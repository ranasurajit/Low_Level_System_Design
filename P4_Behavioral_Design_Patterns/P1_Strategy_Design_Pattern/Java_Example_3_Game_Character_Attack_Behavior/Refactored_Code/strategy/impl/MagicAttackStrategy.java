package P4_Behavioral_Design_Patterns.P1_Strategy_Design_Pattern.Java_Example_3_Game_Character_Attack_Behavior.Refactored_Code.strategy.impl;

import P4_Behavioral_Design_Patterns.P1_Strategy_Design_Pattern.Java_Example_3_Game_Character_Attack_Behavior.Refactored_Code.strategy.AttackStrategy;

public class MagicAttackStrategy implements AttackStrategy {
    @Override
    public void attack() {
        System.out.println("Casting a fireball!");
    }
}
