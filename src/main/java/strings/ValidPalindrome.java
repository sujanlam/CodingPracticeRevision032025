package strings;

public class ValidPalindrome {
    public static void main(String[] args) {
          String str = "eyye";
          String str1 = "lemel";
          System.out.println(isPalindrome(str));
          System.out.println(isPalindrome(str1));
      }

      public static boolean isPalindrome(String str) {
          int n = str.length();
          int left = 0;
          int right = n-1;
          while (left < right){
              if(str.charAt(left) != str.charAt(right)){
                  return false;
              }
              left++;
              right--;
          }

          return true;
      }
}
