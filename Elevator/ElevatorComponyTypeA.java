package Elevator;


/**
 * Elevator 객체 주입 역할 (AppConfig)
 */
public class ElevatorComponyTypeA implements ElevatorCompony{
    AppCoinfig appCoinfig = new AppCoinfig();
    void elevatorComponyTypeA(){}

    public Elevator installingElevator(String location){
        return appCoinfig.getElevator(location);
    }
}
