package InterviewQuestions;

public class ReverseString {
    public static void main(String[] args) {
        String a = "Hello World";

        StringBuffer sb = new StringBuffer(a);
        System.out.println(sb.reverse());

        //without using reverse function
        String toReverse = "Hello world";
        String reversed = "";
        for(int i = toReverse.length() - 1; i>=0;i--)

        {
            reversed = reversed + toReverse.charAt(i);


        }
        System.out.println("Reversed String is: " + reversed);

       /* String reverse="";
        char[]array = toReverse.toCharArray();
        for (int i = array.length-1; i>=0; i--) {
            reversed=reversed+array[i];
        }
        System.out.println("Reversed String is: " +reversed); */

    }

}
