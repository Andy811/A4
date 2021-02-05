package test;

public interface MyInterface {

    public void publicMethod(String a);

    public int a= 1;

    default void defMethod() {
        System.out.println("default method");
    }


}
