public class Main5 {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";

        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        s = s.toLowerCase();

        while (left <= right) {

            char getAtl = s.charAt(left);
            char getAtr = s.charAt(right);

            if (!Character.isLetterOrDigit(getAtl)) {
                left++;
            } else if (!Character.isLetterOrDigit(getAtr)) {
                right--;
            } else if (Character.toLowerCase(getAtl) != Character.toLowerCase(getAtr)) {
                return false;
            } else {
                left++;
                right--;
            }

        }
        return true;

    }
}