package inputTaking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BufferReader {

	public static void main(String[] args) throws IOException {
        
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine().trim());
        String str = bf.readLine();
        
        int [] arr = Arrays.stream(bf.readLine().replaceAll(" ", "").split(" ")).
            mapToInt(Integer::parseInt).toArray();
   
        bf.close();
        
        System.out.println(n + "\n" + str);
        
        }
}
