package function;

public class Function {

    public int sum(int a, int b){
        return a+b;
    }

    private void subtraction(int a, int b){
        int output = Math.abs(a-b);
        System.out.println(output);
    }

    protected void sqrt(int n){
        double sqrt = Math.sqrt(n);

//        type casting
        int output = (int)sqrt;

        System.out.println(output);
    }

//    user defined function
    private void pow(int a, int b){

        double output = Math.pow(a,b);// pre defined function

        System.out.println(output);
    }

    static public void main(String[] args) {

        Function fun = new Function();

        System.out.println(fun.sum(10,4));

        fun.subtraction(10,40);

        fun.sqrt(8);
        fun.pow(4,4); //4^4 = 4 * 4 * 4 * 4
    }
}
