package lesson8;

public class Child extends Parent {

    public Child() {
        super();
        System.out.println("this is my child constructor");
        System.out.println(super.value);
    }

    @Override
    public String getName() {
        System.out.println(super.getName());
        System.out.println(getName());
        return "this is cool child";
    }
}