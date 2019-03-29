class Animal{
public Animal(){
System.out.println("ANimal is ");
}
}

class Dog extends Animal{
Dog() {
super();
System.out.println("dog");

}
}

class Test{
public static void main(String args[])
{
Dog d= new Dog();
}
}