package java8programs;

public class ReverseStringWithSpecialCharacters {

	public static void main(String[] args) {
        String input = "ab&d,$c";
        String result = reverseStringWithSpecialCharacters(input);
        System.out.println(result);
	}
	
	private static String reverseStringWithSpecialCharacters(String input) {
        char[] charArray = input.toCharArray();
        int left = 0;
        int right = charArray.length - 1;

        while (left < right) {
            if (!Character.isLetter(charArray[left])) {
                left++;
            } else if (!Character.isLetter(charArray[right])) {
                right--;
            } else {
                // Swap letters
                char temp = charArray[left];
                charArray[left] = charArray[right];
                charArray[right] = temp;

                left++;
                right--;
            }
        }

        return new String(charArray);
    }

}
