package exceptionHandeling;

public class ThrowKeyword {
    public static void main(String[] args) {
        double bankBalance = 5000;
        double withdrawlAmount = 6000;
        try{
               if(bankBalance < withdrawlAmount){
                   throw new ArithmeticException("Insufficient bank balance.");
               }else{
                   bankBalance = bankBalance - withdrawlAmount;
                   System.out.println("Withdrawl money successfully");
               }
            }catch (Exception e){
            System.out.println(e.getMessage());
            }
    }
}
