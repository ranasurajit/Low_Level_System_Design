package P4_Behavioral_Design_Patterns.P3_Command_Design_Pattern.Java_Example_1_Smart_Home_Remote_Control.Refactored_Code.models.commands;

import P4_Behavioral_Design_Patterns.P3_Command_Design_Pattern.Java_Example_1_Smart_Home_Remote_Control.Refactored_Code.models.enums.CommandType;

public interface IRemote {
    public void addControl(CommandType type, ICommand command);

    public void pressButton(CommandType type);
}
