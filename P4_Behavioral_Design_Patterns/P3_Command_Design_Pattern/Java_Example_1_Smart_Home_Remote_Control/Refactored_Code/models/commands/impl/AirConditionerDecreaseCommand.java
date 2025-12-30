package P4_Behavioral_Design_Patterns.P3_Command_Design_Pattern.Java_Example_1_Smart_Home_Remote_Control.Refactored_Code.models.commands.impl;

import P4_Behavioral_Design_Patterns.P3_Command_Design_Pattern.Java_Example_1_Smart_Home_Remote_Control.Refactored_Code.models.AirConditioner;
import P4_Behavioral_Design_Patterns.P3_Command_Design_Pattern.Java_Example_1_Smart_Home_Remote_Control.Refactored_Code.models.commands.ICommand;

public class AirConditionerDecreaseCommand implements ICommand {
    AirConditioner ac;

    public AirConditionerDecreaseCommand(AirConditioner ac) {
        this.ac = ac;
    }

    @Override
    public void execute() {
        ac.decreaseTemp();
    }

    @Override
    public void undo() {
        ac.turnOff();
    }
}
