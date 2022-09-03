package practise;
class Parents {
public void habit() {
System.out.println("Height:5.6");
}
}
class Child extends Parents {
public void greeting() {
System.out.println("Habit of making others happy");
}
}
class program6and7_3{
public static void main(String[] args) {
Parents parents1 = new Parents();
Child child1 = new Child();
parents1.habit();
child1.habit();
}
}