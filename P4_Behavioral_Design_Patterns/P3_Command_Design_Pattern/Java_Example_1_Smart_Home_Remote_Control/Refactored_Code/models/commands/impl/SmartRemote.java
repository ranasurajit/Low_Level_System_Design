package P4_Behavioral_Design_Patterns.P3_Command_Design_Pattern.Java_Example_1_Smart_Home_Remote_Control.Refactored_Code.models.commands.impl;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

import P4_Behavioral_Design_Patterns.P3_Command_Design_Pattern.Java_Example_1_Smart_Home_Remote_Control.Refactored_Code.models.commands.ICommand;
import P4_Behavioral_Design_Patterns.P3_Command_Design_Pattern.Java_Example_1_Smart_Home_Remote_Control.Refactored_Code.models.commands.IRemote;
import P4_Behavioral_Design_Patterns.P3_Command_Design_Pattern.Java_Example_1_Smart_Home_Remote_Control.Refactored_Code.models.enums.CommandType;

public class SmartRemote implements IRemote {
    Map<CommandType, ICommand> controlMap;
    Stack<ICommand> commandHistory;

    public SmartRemote() {
        this.controlMap = new HashMap<CommandType, ICommand>();
        this.commandHistory = new Stack<ICommand>();
    }

    @Override
    public void addControl(CommandType type, ICommand command) {
        controlMap.put(type, command);
    }

    @Override
    public void pressButton(CommandType type) {
        ICommand control = controlMap.get(type);
        control.execute();
        commandHistory.push(control);
    }

    public void undo() {
        while (!commandHistory.isEmpty()) {
            ICommand control = commandHistory.pop();
            control.undo();
        }
    }
}
