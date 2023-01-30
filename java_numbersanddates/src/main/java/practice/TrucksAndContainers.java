package practice;

import java.util.Scanner;

public class TrucksAndContainers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //получение количество коробок от пользователя
        System.out.println("Введите колличество ящиков: ");
        int boxes = scanner.nextInt();

        int boxesInContainer = 27;
        int containerInTrack = 12;

        int сontainerCount = boxes/boxesInContainer + (boxes % boxesInContainer == 0 ? 0 : 1);
        int trackCount = сontainerCount/containerInTrack + (сontainerCount % containerInTrack == 0 ? 0 : 1);
        System.out.println("Контейнеров всего: " + сontainerCount);
        System.out.println("Грузовиков всего: " + trackCount);
        int cotainerNumber=0;

        for (int i = 1; i <= trackCount; i++) {
            System.out.println("Грузовик: " + i);
            for (int j = 1; j <= containerInTrack; j++) {
                cotainerNumber = cotainerNumber + 1;
                if (cotainerNumber <= сontainerCount) {
                    System.out.println("Контейнер: " + (cotainerNumber));
                } else {
                    return;
                }
            }
        }



/*            for (int j = 1; j <= 10; j++) {
                System.out.println("Контейнер: " + j);
                for (int k = 1; k <= 27; k++) {
                    System.out.println("Ящик: " + k);
                }
            }*/



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
