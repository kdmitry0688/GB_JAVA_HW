class Reader {
    private String firstName;
    private String lastName;
    private int id;
    private String faculty;
    private String dataOfBirth;
    private String telephone;

    public Reader(String firstName, String lastName, int id, String faculty, String dataOfBirth, String telephone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.faculty = faculty;
        this.dataOfBirth = dataOfBirth;
        this.telephone = telephone;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getDataOfBirth() {
        return dataOfBirth;
    }

    public void setDataOfBirth(String dataOfBirth) {
        this.dataOfBirth = dataOfBirth;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public void returnBook(int count) {
        System.out.printf(this.lastName + " " + this.firstName + " вернул %d книги\n", count);
    }

    public void returnBook(String... nameBooks) {
        System.out.println(this.lastName + " " + this.firstName + " вернул книги:");
        for (int i = 0; i < nameBooks.length - 1; i++) {
            System.out.print(nameBooks[i] + ", ");
        }
        System.out.print(nameBooks[nameBooks.length - 1] + ".\n");
    }

    public void returnBook(Book... nameBooks) {
        System.out.println(this.lastName + " " + this.firstName + " вернул книги:");
        for (int i = 0; i < nameBooks.length - 1; i++) {
            System.out.print(nameBooks[i].getName() + ", ");
        }
        System.out.print(nameBooks[nameBooks.length - 1].getName() + ".\n");
    }

    public void takeBook(int count) {
        System.out.printf(this.lastName + " " + this.firstName + " взял %d книги\n", count);
    }

    public void takeBook(String... nameBooks) {
        System.out.println(this.lastName + " " + this.firstName + " взял книги:");
        for (int i = 0; i < nameBooks.length - 1; i++) {
            System.out.print(nameBooks[i] + ", ");
        }
        System.out.print(nameBooks[nameBooks.length - 1] + ".\n");
    }

    public void takeBook(Book... nameBooks) {
        System.out.println(this.lastName + " " + this.firstName + " взял книги:");
        for (int i = 0; i < nameBooks.length - 1; i++) {
            System.out.print(nameBooks[i].getName() + ", ");
        }
        System.out.print(nameBooks[nameBooks.length - 1].getName() + ".\n");
    }

}

public class Task1 {
    public static void main(String[] args) {

        Reader reader = new Reader("Петров", "Владимир",
                293822, "Экономический",
                "25.01.2003", "+7(922)-442-44-22");

        Book book1 = new Book("Приключения", "Беляев");
        Book book2 = new Book("Словарь", "Иванов");
        Book book3 = new Book("Энциклопедия", "Новиков");

        reader.takeBook(3);
        reader.takeBook("Приключения", "Словарь", "Энциклопедия");
        reader.takeBook(book1, book2, book3);

        reader.returnBook(3);
        reader.returnBook("Приключения", "Словарь", "Энциклопедия");
        reader.returnBook(book1, book2, book3);
    }
}