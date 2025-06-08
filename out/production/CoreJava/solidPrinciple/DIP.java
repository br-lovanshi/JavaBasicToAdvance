package solidPrinciple;

// Bad example
class DebitCard1{
    void pay(){
        System.out.println("Debit card");
    }
}
class ZaraShopping{
    DebitCard1 debitCard = new DebitCard1(); // tightly coupled
}

// Applied Dependency Inversion Principle
interface Card{
    void pay();
}

class DebitCard implements Card{

    @Override
    public void pay() {
        System.out.println("Debit card");
    }
}

class CreditCard implements Card{

    @Override
    public void pay() {
        System.out.println("Credit card");
    }
}

class Shopping{
    Card card;
    Shopping(Card card){
        this.card = card;
    }

    void pay(){
        card.pay();
    }
}

// Dependency Inversion Principle
public class DIP {
    public static void main(String[] args) {
        Card credit = new CreditCard();
        Shopping shopping = new Shopping(credit);
        shopping.pay();
    }
}

// High-level classes should depend on abstractions, not concrete classes.

