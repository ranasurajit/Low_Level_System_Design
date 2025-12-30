package P4_Behavioral_Design_Patterns.P3_Command_Design_Pattern.Java_Example_1_Smart_Home_Remote_Control.Refactored_Code;

import P4_Behavioral_Design_Patterns.P3_Command_Design_Pattern.Java_Example_1_Smart_Home_Remote_Control.Refactored_Code.models.AirConditioner;
import P4_Behavioral_Design_Patterns.P3_Command_Design_Pattern.Java_Example_1_Smart_Home_Remote_Control.Refactored_Code.models.Fan;
import P4_Behavioral_Design_Patterns.P3_Command_Design_Pattern.Java_Example_1_Smart_Home_Remote_Control.Refactored_Code.models.Light;
import P4_Behavioral_Design_Patterns.P3_Command_Design_Pattern.Java_Example_1_Smart_Home_Remote_Control.Refactored_Code.models.commands.impl.AirConditionerDecreaseCommand;
import P4_Behavioral_Design_Patterns.P3_Command_Design_Pattern.Java_Example_1_Smart_Home_Remote_Control.Refactored_Code.models.commands.impl.AirConditionerIncreaseCommand;
import P4_Behavioral_Design_Patterns.P3_Command_Design_Pattern.Java_Example_1_Smart_Home_Remote_Control.Refactored_Code.models.commands.impl.FanOffCommand;
import P4_Behavioral_Design_Patterns.P3_Command_Design_Pattern.Java_Example_1_Smart_Home_Remote_Control.Refactored_Code.models.commands.impl.FanOnCommand;
import P4_Behavioral_Design_Patterns.P3_Command_Design_Pattern.Java_Example_1_Smart_Home_Remote_Control.Refactored_Code.models.commands.impl.LightOffCommand;
import P4_Behavioral_Design_Patterns.P3_Command_Design_Pattern.Java_Example_1_Smart_Home_Remote_Control.Refactored_Code.models.commands.impl.LightOnCommand;
import P4_Behavioral_Design_Patterns.P3_Command_Design_Pattern.Java_Example_1_Smart_Home_Remote_Control.Refactored_Code.models.commands.impl.SmartRemote;
import P4_Behavioral_Design_Patterns.P3_Command_Design_Pattern.Java_Example_1_Smart_Home_Remote_Control.Refactored_Code.models.enums.CommandType;

public class Main {
    public static void main(String[] args) {
        SmartRemote remote = new SmartRemote();

        // register all commands
        Light light = new Light();
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);
        remote.addControl(CommandType.LIGHT_ON, lightOnCommand);
        remote.addControl(CommandType.LIGHT_OFF, lightOffCommand);

        Fan fan = new Fan();
        FanOnCommand fanOnCommand = new FanOnCommand(fan);
        FanOffCommand fanOffCommand = new FanOffCommand(fan);
        remote.addControl(CommandType.FAN_ON, fanOnCommand);
        remote.addControl(CommandType.FAN_OFF, fanOffCommand);

        AirConditioner ac = new AirConditioner();
        AirConditionerDecreaseCommand acDownCommand = new AirConditionerDecreaseCommand(ac);
        AirConditionerIncreaseCommand acUpCommand = new AirConditionerIncreaseCommand(ac);
        remote.addControl(CommandType.AC_TEMP_DOWN, acDownCommand);
        remote.addControl(CommandType.AC_TEMP_UP, acUpCommand);

        // execute commands
        remote.pressButton(CommandType.LIGHT_ON);
        remote.pressButton(CommandType.FAN_ON);
        remote.pressButton(CommandType.AC_TEMP_DOWN);
        remote.pressButton(CommandType.FAN_OFF);
        remote.pressButton(CommandType.AC_TEMP_UP);
        remote.pressButton(CommandType.LIGHT_OFF);

        // undo all operations
        remote.undo();
    }
}
