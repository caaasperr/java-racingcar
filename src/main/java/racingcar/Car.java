package racingcar;

import camp.nextstep.edu.missionutils.Randoms;

public class Car {
    String name;
    int point;

    public Car(String name, int point) {
        this.name = name;
        this.point = 0;
    }

    public void run(int count) {
        for (int i = 0; i < count; i++) {
            int num = Randoms.pickNumberInRange(0, 9);
            if (num < 5) { this.point++; }
        }
    }
}
