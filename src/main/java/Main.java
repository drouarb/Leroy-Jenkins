public class Main {
    private String name;

    public static void main() {
        new Main().getHello();
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
