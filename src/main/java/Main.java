import java.util.Scanner;

public class Main {
    private String name;

    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.getHello());
        System.out.println("What is your name ?");
        String s = new Scanner(System.in).nextLine();
        main.setName(s);
        System.out.println(main.getHello());
    }

    Main() {
        name = "";
    }

    public Main(String name) {
        this.name = name;
    }

    String getHello() {
        return String.format("Hello%s%s!", (!name.equals("")) ? " " : "", name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
