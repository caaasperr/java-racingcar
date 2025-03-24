package racingcar;

import java.util.ArrayList;

public class Application {

    public ArrayList<Car> checkWinner(ArrayList<Car> cars) {
        int highPoint = 0;

        ArrayList<Car> winners = new ArrayList<Car>();

        for (Car car : cars) {
            if (car.point >= highPoint) { highPoint = car.point; }
        }

        for (Car car : cars) {
            if (car.point == highPoint) { winners.add(car); }
        }
        return winners;
    }

    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<Car>();
    }
}
