package Elevator;


/**
 * DIP, OCP, SRP 준수를 위한 DI class
 */
class AppCoinfig {
    public  AppCoinfig(){

    }

    public Elevator getElevator(String location){
        return new ElevatorTypeA(location);
    }
}
