package solidPrinciple.SOLID;

// Bad example
class InvoicePrinter{
    void generateInvoice(){};
    void print(){};
    void saveInvoice(){};
}

// Single Responsible Principle say's one class should be responsible for single unit of work.

class Print{
    void printInvoice(){};
}

class Persistence{
    void saveInvoice(){};
}

class Invoice{
    void generateInvoice(){};
}

public class SingleResponsibility {
    public static void main(String[] args) {
        Invoice invoice = new Invoice();
        invoice.generateInvoice(); // generate invoice
        Print printInvoice = new Print();
        printInvoice.printInvoice(); // print invoice
        Persistence persistence = new Persistence();
        persistence.saveInvoice(); // save invoice

    }
}
