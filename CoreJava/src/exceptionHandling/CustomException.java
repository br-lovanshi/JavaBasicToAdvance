package exceptionHandling;

public class CustomException {
    public boolean validatePinCode(String pinCode) throws InvalidPinCodeException{
        if(pinCode.length() > 7 || pinCode.length() < 6){
            throw new InvalidPinCodeException("Pincode is invalid.");
        }
        return true;
    }
    public static void main(String[] args){
        CustomException obj = new CustomException();

        try{
            boolean isValid = obj.validatePinCode("0117");
            if(isValid)
                System.out.println("Pincode is valid.");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}

class InvalidPinCodeException extends Exception{

    public InvalidPinCodeException(String s){
        super(s);
    }
}