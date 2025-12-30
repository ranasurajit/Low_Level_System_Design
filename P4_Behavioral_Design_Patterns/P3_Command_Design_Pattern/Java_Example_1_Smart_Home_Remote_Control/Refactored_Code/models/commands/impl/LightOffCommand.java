package P4_Behavioral_Design_Patterns.P3_Command_Design_Pattern.Java_Example_1_Smart_Home_Remote_Control.Refactored_Code.models.commands.impl;

import P4_Behavioral_Design_Patterns.P3_Command_Design_Pattern.Java_Example_1_Smart_Home_Remote_Control.Refactored_Code.models.Light;
import P4_Behavioral_Design_Patterns.P3_Command_Design_Pattern.Java_Example_1_Smart_Home_Remote_Control.Refactored_Code.models.commands.ICommand;

public class LightOffCommand implements ICommand {
    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOff();
    }

    @Override
    public void undo() {
        light.turnOff();
    }
}
