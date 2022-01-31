public class Palindrom {

    public static void main(String[] args) {
        String text = " ";
        int count = 0;

        for (int i = 10000; i <= 99999; i++) {

            text = String.valueOf(i);
            if ((text.charAt(0) == text.charAt(1) && text.charAt(0) == text.charAt(3) && text.charAt(0) == text.charAt(4))
                    || (text.charAt(0) == text.charAt(4) && text.charAt(1) == text.charAt(3))
                    || (text.charAt(0) == text.charAt(1) && text.charAt(0) == text.charAt(2) && text.charAt(0) == text.charAt(3) && text.charAt(0) == text.charAt(4))) {
                count++;
                System.out.println(text);
            }
        }
        System.out.println(count);
    }

}
