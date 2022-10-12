# vitruv_test
Applying OOP to Elevator Process


### 1. 기능 명세

```
public interface Elevator {
    public int move();
    public boolean callReservation(int callFloor);
}
```
```
public interface ElevatorCompony {
    public Elevator installingElevator(String location);
}
```


### 2. 클라이언트 환경에서의 동작
```
// Main

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
```


### 3. DI(Dependency Injection)

```
class AppCoinfig {
    public  AppCoinfig(){

    }

    public Elevator getElevator(String location){
        return new ElevatorTypeA(location);
    }
}

+  어떤 ElevatorComony를 선택할 것인지는 외부 환경이 결정하는 것이기 때문에 main서의 ElevatorCompony객체 생성은 DI를 적용하지 않음.
   다만 혹시 모를 확장성 떄문에 interface를 분리함.
 
```
