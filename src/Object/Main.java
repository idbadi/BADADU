package Object;

public class Main {
    public static void main(String[] args) {
        Human ded1 = new Human("Дед иван",false,75);
        Human ded2 = new Human("Дед игорь",false,82);

        Human baba1 = new Human("баб таня", true,73);
        Human baba2 = new Human("баб яна", true,81);

        Human mama = new Human("ира", true,45,ded1.getFather(),baba1.getMother());

        Human papa = new Human("палыч",false,45,ded2.getFather(),baba2.getMother());
        System.out.println(mama.getMother());
    }
}
