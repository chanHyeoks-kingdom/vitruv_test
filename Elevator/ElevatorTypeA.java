package Elevator;

import java.util.LinkedList;
import java.util.Queue;

/**
 * A 타입의 Elevator
 * Elevator Interface를 상속받는다.
 */
public class ElevatorTypeA implements Elevator{
    Queue<Integer> reservationQueue = new LinkedList<>();
    String location;
    int nowFloor;
    boolean broken;
    boolean arrival;

    /**
     * 시간에 따른 엘리베이터의 움직임에 대한 method
     * @return 이동후 현재 층수
     */
    public int move(){
        if (this.nowFloor > reservationQueue.peek()){ nowFloor -= 1;}
        else if(this.nowFloor < reservationQueue.peek()){ nowFloor += 1;}
        else {reservationQueue.remove();}

        return this.nowFloor;
    }

    /**
     * 사용자가 요청을 보낸 층번호 (ex. 1층, 2층 ..)
     * @param callFloor
     * @return 성공적으로 reservationQueue에 사용자의 요청이 add 되었는지 여부
     */
    public boolean callReservation(int callFloor){
        if (this.brokenCheck()){return false;}
        reservationQueue.add(callFloor);

        return true;
    }

    ElevatorTypeA(String location){
        this.nowFloor = 1;
        this.broken = false;
        this.arrival = true;
        this.location = location;
    }

    /**
     * 고장 여부를 체크하는 method
     * @return 고장 여부
     */
    private boolean brokenCheck(){
        return this.broken;
    }
}
