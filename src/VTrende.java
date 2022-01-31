public class VTrende {
    public static void main(String[] args) {
        String text1 = " ";
        int count = 0;

        for (int i = 1000; i <= 9999; i++) {
            text1 = String.valueOf(i);
            if (text1.charAt(0) % 2 != 0 && text1.charAt(1) % 2 != 0  && text1.charAt(2) % 2 != 0 && text1.charAt(3) % 2 != 0) {
                System.out.println(text1);
                count++;
            }

        }
        System.out.println(count);
    }

}
