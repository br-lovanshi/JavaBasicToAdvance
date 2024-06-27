public class ReverseString {
    public static void main(String[] args) {
        String string = "Brajesh";
        String reverseString = "";
        for(int i = string.length() - 1; i >= 0; i--){
            reverseString += string.charAt(i);
        }
        // System.out.println(reverseString);

        StringBuilder sb = new StringBuilder();
        sb.append("Vicky");
        sb.length();
        sb.isEmpty();
        sb.substring(3);
        System.out.println(sb.delete(0, 1));
        System.out.println(sb.equals("icky"));
        sb.reverse();
        sb.toString();
        System.out.println(sb.toString());
    }
}
