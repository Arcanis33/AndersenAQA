package school.lesson3;

public class HomeworkThird {
    public static void main(String[] args) {
        Person[] persArray = new Person[5];
        persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 50);
        persArray[1] = new Person("Sergeyev Sergey", "QA junior", "sergey@mailbox.com", "89999999", 20000, 50);
        persArray[2] = new Person("Dmitriev Dmitry", "AQA Senior", "dmitry@mailbox.com", "88888888", 100000, 25);
        persArray[3] = new Person("Antonov Anton", "Manager", "anton@mailbox.com", "877777777", 70000, 55);
        persArray[4] = new Person("Artyomov Artyom", "Driver", "artyom@mailbox.com", "86666666", 50000, 25);
        for (Person cycleResult : persArray)
            if (cycleResult.getAge()>40)
                System.out.println(cycleResult);

    }
}
class Person {
    private String name;
    private String position;
    private String email;
    private String phoneNumber;
    private int salary;
    private int age;

    public Person(String name, String position, String email, String phoneNumber, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    public String toString() {
        return ("Имя работника - " + name + ", Должность - " + position + ", Адрес электронной почты - " + email +
                ", Номер телефона - " + phoneNumber + ", Зарплата - " + salary + ", Возраст - " + age);
    }
}