package P4_Behavioral_Design_Patterns.P3_Command_Design_Pattern.Java_Example_1_Smart_Home_Remote_Control.Violated_Code.models;

public class SmartRemote {

    private Light light = new Light();
    private Fan fan = new Fan();
    private AirConditioner ac = new AirConditioner();

    public void pressButton(String button) {
        if (button.equals("LIGHT_ON")) {
            light.turnOn();

        } else if (button.equals("LIGHT_OFF")) {
            light.turnOff();

        } else if (button.equals("FAN_ON")) {
            fan.start();

        } else if (button.equals("FAN_OFF")) {
            fan.stop();

        } else if (button.equals("AC_TEMP_UP")) {
            ac.increaseTemp();

        } else if (button.equals("AC_TEMP_DOWN")) {
            ac.decreaseTemp();
        }
    }
}
