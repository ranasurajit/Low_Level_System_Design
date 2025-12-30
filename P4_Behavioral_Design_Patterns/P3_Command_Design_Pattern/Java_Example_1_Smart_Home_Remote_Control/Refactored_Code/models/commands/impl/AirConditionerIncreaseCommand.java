package P4_Behavioral_Design_Patterns.P3_Command_Design_Pattern.Java_Example_1_Smart_Home_Remote_Control.Refactored_Code.models.commands.impl;

import P4_Behavioral_Design_Patterns.P3_Command_Design_Pattern.Java_Example_1_Smart_Home_Remote_Control.Refactored_Code.models.AirConditioner;
import P4_Behavioral_Design_Patterns.P3_Command_Design_Pattern.Java_Example_1_Smart_Home_Remote_Control.Refactored_Code.models.commands.ICommand;

public class AirConditionerIncreaseCommand implements ICommand {
    AirConditioner ac;

    public AirConditionerIncreaseCommand(AirConditioner ac) {
        this.ac = ac;
    }

    @Override
    public void execute() {
        ac.increaseTemp();
    }

    @Override
    public void undo() {
        ac.turnOff();
    }
}
