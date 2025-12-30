package P4_Behavioral_Design_Patterns.P3_Command_Design_Pattern.Java_Example_1_Smart_Home_Remote_Control.Violated_Code.models;

public class AirConditioner {
    private int temperature = 24;

    public void increaseTemp() {
        temperature++;
        System.out.println("AC temperature increased to " + temperature);
    }

    public void decreaseTemp() {
        temperature--;
        System.out.println("AC temperature decreased to " + temperature);
    }
}
