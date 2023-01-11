//Создайте класс Phone, который содержит переменные number, model и weight.
//        2. Создайте три экземпляра этого класса.
//        3. Выведите на консоль значения их переменных.
//        4. Добавить в класс Phone методы: receiveCall, имеет один параметр
//        – имя звонящего. Выводит на консоль сообщение “Звонит {name}”. Метод
//        5. getNumber – возвращает номер телефона. Вызвать эти методы для каждого из объектов.
//        6. Добавить конструктор в класс Phone, который принимает на вход три параметра
//        для инициализации переменных класса - number, model и weight.
//        7. Добавить конструктор, который принимает на вход два параметра для инициализации
//        переменных класса - number, model.
//        8.Добавить конструктор без параметров.
//        9. Вызвать из конструктора с тремя параметрами конструктор с двумя.
//        10. Добавьте перегруженный метод receiveCall, который принимает два параметра -
//        имя звонящего и номер телефона звонящего. Вызвать этот метод.
//        11. Создать метод sendMessage с аргументами переменной длины.
//        Данный метод принимает на вход номера телефонов, которым будет отправлено сообщение.
//        Метод выводит на консоль номера этих телефонов.
class Phone {
    String number;
    String model;
    double weight;

    public Phone() {
        this.number = "000";
        this.model = "aaa";
        this.weight = 0.1;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone(String number, String model, double weight) {
        this(number, model);
        this.weight = weight;
    }

    public String getNumber() {
        return this.number;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number='" + number + '\'' +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                '}';
    }

    public void receiveCall(String call) {
        System.out.printf("Вам звонил телефон с номером %s, сообщение: %s\n", this.model, call);
    }

    public void receiveCall(String name, String number) {
        System.out.printf("Звонил %s, Номер: %s\n", name, number);
    }

    public void send(String message, String... numbers) {
        System.out.printf("С телефона %s, отправляется сообщение: %s\n", this.number, message);
        for (String number : numbers) {
            System.out.printf("На номер телефона: %s\n", number);
        }
    }
}

public class Work1 {
    public static void main(String[] args) {
        Phone samsung = new Phone("a12", "292382", 24.2);
        Phone mi = new Phone("mi22", "293843", 25.2);
        Phone apple = new Phone("a14", "38339", 22.3);

        samsung.receiveCall("да да");
        mi.receiveCall("Alexey", "3928293");
        apple.send("l3939", new String[]{"3939339", "393388", "885559"});
    }
}