package questionattempt;
import java.util.Scanner;
public class Questionprompt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner =new Scanner(System.in);
		String[] questions = {"what is your name?", "How old are you?", "where do you work from?"};
		String[] answers = new String[questions.length];
		
		for(int d=0; d<questions.length; d++) {
			 while(true) {
				System.out.println(questions[d]);
				answers[d] =scanner.nextLine();
				   if 
				(!answers[d].trim().isEmpty()){
					break;
				}   else {
			System.out.println("Please provide an answer to the question");
				
				}
				   }
			 }
		System.out.println("Thank you for answering all the questions");
		scanner.close();
	}

}
