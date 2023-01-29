package practice;

import java.util.Scanner;

public class TrucksAndContainers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //получение количество коробок от пользователя
        int boxes = scanner.nextInt();
// мой код
        private int requiredContainer = 0;
        private int requiredTrack = 0;

        public int getRequiredContainer() {
            requiredContainer = count/27;
            return requiredContainer;
        }

        public int getRequiredTruck() {
            requiredTrack = requiredContainer/12;
            return requiredTrack;
        }
// мой код
        // TODO: вывести в консоль коробки разложенные по грузовикам и контейнерам
        // пример вывода при вводе 2
        // для отступа используйте табуляцию - \t

        /*
        Грузовик: 1
            Контейнер: 1
                Ящик: 1
                Ящик: 2
        Необходимо:
        грузовиков - 1 шт.
        контейнеров - 1 шт.
        */
    }

}
