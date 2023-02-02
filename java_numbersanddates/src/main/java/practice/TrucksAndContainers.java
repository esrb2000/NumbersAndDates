package practice;

import java.util.Scanner;

public class TrucksAndContainers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //получение количество коробок от пользователя
        int boxes = scanner.nextInt();

        int boxesInContainer = 27;
        int containerInTrack = 12;


        int containerCount = boxes / boxesInContainer + (boxes % boxesInContainer == 0 ? 0 : 1);
        int trackCount = containerCount / containerInTrack + (containerCount % containerInTrack == 0 ? 0 : 1);
        int boxesNumber = 0;
        int containerNumber = 0;

        for (int i = 1; i <= trackCount; i++) {
            System.out.println("Грузовик: " + i);
            for (int j = 1; j <= containerInTrack; j++) {
                if (boxesNumber>=boxes && containerNumber >= containerCount) {
                    break;
                }
                containerNumber = containerNumber + 1;
                System.out.println('\t' + "Контейнер: " + containerNumber);
                for (int k = 1; k <= boxesInContainer; k++) {
                    boxesNumber = boxesNumber + 1;
                    if (boxesNumber <= boxes) {
                        System.out.println("\t" + "\t" + "Ящик: " + (boxesNumber));
                    }
                }
            }
        }

        System.out.println("Необходимо:" + System.lineSeparator() + "грузовиков - " + trackCount + " шт." + System.lineSeparator() + "контейнеров - " + containerCount + " шт.");

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

