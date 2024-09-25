package Sept;

public class Sept25Lab003 {

    public static void main(String[] args) {
        int vow = 0, con = 0;
        String str = "My name is Suneetha";
        str = str.toLowerCase();
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                vow++;
            } else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                con++;
            }
        }
        System.out.println("No.of Vowels in the given string : " + vow);

        System.out.println("No.of Consonants in the given string : " + con);

    }
    }

