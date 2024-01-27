package InterviewQuestions;

public class PrimeNumber {public static void main (String[] args){
    int number =17;
   boolean isPrime=true;
   if(number>1){
       for (int i=2; i<number;i++){
           if (number%i==0){
               isPrime=false;
               break;
           }
       }
   }else{
       isPrime=false;
   }
    System.out.println("Given number"+number+" is prime? "+isPrime);

}
}
