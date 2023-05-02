package day23_encapsulation_inheritance;

public class C06_Parent {

    private int toplamSatisTutari;
    String strDefault="Parent class strDefault";
    protected String strProtected="Parent class strProtected";
    public String strPublic="Parent class strPublic";


    private void privateMethod(){
        System.out.println("Parent class private method");
    }

    void defaultMethod(){
        System.out.println("Parent class default method");
    }

    protected void protectedMethod(){
        System.out.println("Parent class protected method");
    }

    public void publicMethod(){
        System.out.println("Parent class public method");
    }
}
