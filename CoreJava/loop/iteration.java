package loop;

public class iteration {
    public static void main(String[] args) {
        int n = 10;
        int m = 5;

        for (int i = 0; i < n / 2; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(j);
            }
        }
        int k = 5;
        while (k > 0) {
            System.out.println(k);
            k--;
        }
        int p = 1;
         do{
            System.out.println("Hello");
            p--;
        }while(p>1);

        int i = 0;
        for(System.out.println("Hi"); i<5; i++){
            System.out.println("Brajesh Lovanshi");
        }

        int[] arr = {1,3,5,3,3};

        for(int num : arr){
            System.out.println(num);
        }

    }
}