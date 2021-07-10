package lesson5.homework;

public class HomeWork5 {


    //* Добавить геттер isRetired() который возвращает булево значение, является ли сотрудник пенсионером,
// в зависимости от пола и возраста, НЕ ДЕЛАТЬ ТАКОГО ПОЛЯ В КЛАССЕ
    public static void main(String[] args) {

        //Создать массив из 5 сотрудников
        Worker[] workers = {
                new Worker("Левин Георгий Сергеевич", "cashier of the second category", "geo.levin@gmail.com", 2354650, 45000, 27),
                new Worker("Ларионов Богдан Константинович", "cashier of the first category", "larion@gmail.com", 2359090, 50000, 23),
                new Worker("Чернецкий Олег Сергеевич", "cashier-administrator of the second category", "stripstake@gmail.com", 7779065, 53500, 35),
                new Worker("Сержантов Олег Владимирович", "manager", "oleoleg@gmail.com", 9991515, 64700, 41),
                new Worker("Шевцов Кирилл Андреевич", "cashier of the third category", "kirill@gmail.com", 2502535, 40000, 19)
        };

        //* Добавить подсчет созданных сотрудников
        int numberOfWorkers = 0;
        for (int i = 0; i < workers.length; i++) {
            numberOfWorkers++;
            System.out.printf("Number of workers is: %d\n", numberOfWorkers);
        }

        //С помощью цикла вывести информацию только о сотрудниках старше 40 лет
        for (int i = 0; i < workers.length; i++) {
            if (workers[i].getAge() >= 40) workers[i].printInfo();
        }
    }
}
