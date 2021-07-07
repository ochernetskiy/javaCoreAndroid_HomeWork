package lesson5.homework;

//Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
public class Worker {
    private String fullName;
    private String position;
    private String email;
    private int phoneNumber;
    private double salary;
    private int age;

    //Конструктор класса должен заполнять эти поля при создании объекта.
    public Worker(String fullName, String position, String email, int phoneNumber, double salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    //Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
    public void printInfo() {
        System.out.printf("Worker: %s, his position: %s, his email: %s, his phoneNumber: %d, his salary: %d, his age: %d\n", this.fullName, this.position, this.email, this.phoneNumber, this.salary, this.age);
    }
}
