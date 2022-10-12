import Elevator.Elevator;
import Elevator.ElevatorCompony;
import Elevator.ElevatorComponyTypeA;


public class main{

    public static void main(String[] args) {

        ElevatorCompony elevatorCompony =  new ElevatorComponyTypeA();
        Elevator blueDragonElementarySchool = elevatorCompony.installingElevator("청룡초등학교 중앙 복도");
        Elevator CenterElementarySchool = elevatorCompony.installingElevator("중앙초등학교 중앙 복도");

        // 쓰레드 가정 //
        // 시간에 따라 동작한다고 가정 //
        blueDragonElementarySchool.move();
        blueDragonElementarySchool.move();
        CenterElementarySchool.callReservation(2);
        blueDragonElementarySchool.move();
        CenterElementarySchool.move();
        CenterElementarySchool.move();
        blueDragonElementarySchool.callReservation(3);
        blueDragonElementarySchool.move();
        blueDragonElementarySchool.move();
        blueDragonElementarySchool.callReservation(1);
    }
}