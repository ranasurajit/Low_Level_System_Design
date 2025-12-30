package P4_Behavioral_Design_Patterns.P3_Command_Design_Pattern.Java_Example_1_Smart_Home_Remote_Control.Violated_Code;

import P4_Behavioral_Design_Patterns.P3_Command_Design_Pattern.Java_Example_1_Smart_Home_Remote_Control.Violated_Code.models.SmartRemote;

public class Main {
    public static void main(String[] args) {
        SmartRemote remote = new SmartRemote();

        remote.pressButton("LIGHT_ON");
        remote.pressButton("FAN_ON");
        remote.pressButton("AC_TEMP_UP");
        remote.pressButton("AC_TEMP_DOWN");
        remote.pressButton("LIGHT_OFF");
    }
}
