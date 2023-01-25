package Object;

public class Human {
   private String name;
    private boolean gender;
    private int age;
    private Human father;
    private Human mother;


    public Human(String name, boolean gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.father = father;
        this.mother = mother;
    }

    public Human(String name, boolean gender, int age, Human father, Human mother) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.father = father;
        this.mother = mother;
    }

    public String getName() {
        return name;
    }


    public int getAge() {
        return age;
    }

    public Human getFather() {
        return father;
    }

    public Human getMother() {
        return mother;
    }
}
