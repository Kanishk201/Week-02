class PalindromeChecker {

String text;

public PalindromeChecker(String text) {
this.text = text;
}

//Method to check text is palindrome or not
public boolean isPalindrome() {
int i = 0, j = text.length()-1;

while (i < j) {
if (text.charAt(i) != text.charAt(j)) {
return false;
}
i++;
j--;
}

return true;
}

public void displayResult() {
boolean result = isPalindrome();

if (result) {
System.out.println("String " + text + " is Palindrome");
} else {
System.out.println("String " + text + " is not Palindrome");
}
}

public static void main(String[] args) {

PalindromeChecker p1 = new PalindromeChecker("racecar");

p1.displayResult();
}
}