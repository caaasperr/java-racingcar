package racingcar;

import java.util.ArrayList;
import camp.nextstep.edu.missionutils.Console;

public class Application {

    public static String checkWinner(ArrayList<Car> cars) {
        int highPoint = 0;

        String winners = "";

        for (Car car : cars) {
            if (car.point >= highPoint) { highPoint = car.point; }
        }

        for (Car car : cars) {
            if (car.point == highPoint) {
                winners = winners + car.name + ", ";
            }
        }
        return winners;
    }

    public static String[] divideRawCarName(String rawCarNames) {
        String[] carNames = rawCarNames.split(",");
        return carNames;
    }

    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<Car>();
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        String rawCarNames = Console.readLine();
        String[] carNames = divideRawCarName(rawCarNames);
        for (String carName : carNames) {
            if (carName.length() > 5){
                throw new IllegalArgumentException();
            } else {
                cars.add(new Car(carName));
            }
        }
        System.out.println("시도할 회수는 몇회인가요?");
        String rawAttemptCount = Console.readLine();
        int attemptCount = Integer.parseInt(rawAttemptCount);
        for (int i = 0; i < attemptCount; i++) {
            for (Car car : cars) {
                car.run();
                car.printCurrentPoint();
            }
            System.out.println("");
        }
        String winners = checkWinner(cars);
        System.out.println("최종 우승자 : " + winners.substring(0, winners.length()-2));
    }
}
