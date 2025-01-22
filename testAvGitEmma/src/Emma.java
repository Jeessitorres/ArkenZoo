public class Emma {

    String name;
    int age;
    String interest;

    public Emma (String name, int age, String interest){
        this.name = name;
        this.age = age;
        this.interest = interest;
    }

    public void displayEmma(){
        System.out.println("Mitt namn är " + this.name + " och jag är " + this.age + " år gammal, mitt intresse är " + this.interest);
    }
}