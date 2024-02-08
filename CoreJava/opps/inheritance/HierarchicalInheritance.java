package opps.inheritance;
// resource -> https://www.codingninjas.com/studio/guided-paths/oops-in-java/content/279840/offering/3844000?goalRedirection=true&leftPanelTabValue=NOTE&customSource=studio_nav
class Cat extends Animal{
    public void meow(){
        System.out.println("Cat is meowwing...");
    }
}
public class HierarchicalInheritance {

   public static void main(String args[]) {
        Dog dog = new Dog();
        dog.eat();
        dog.barking();
        Cat cat = new Cat();
        cat.eat();
        cat.meow();

    }
}
