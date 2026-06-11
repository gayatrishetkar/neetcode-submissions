class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder str = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(Character.isLetterOrDigit(c)){
                str.append(c);
            }
        }
        String givenString = str.toString();
        String reverseString = str.reverse().toString();

        return givenString.toLowerCase().equals(reverseString.toLowerCase());
    }
}
