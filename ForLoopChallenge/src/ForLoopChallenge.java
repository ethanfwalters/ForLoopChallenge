import java.util.Scanner;

public class ForLoopChallenge
	{

		public static void main(String[] args)
			{
				
				
				// challenge one
				

				for (int i = 0; i < 5; i++)
					{
						System.out.println("I love Doughnuts!");
					}
				;

				// challenge two

				for (int i = 0; i < 5; i++)
					{
						int value = i + 1;
						System.out.println(value);
					}

				for (int i = 0; i < 5; i++)
					{
						int value = 5 - i;
						System.out.println(value);
					}

				// challenge three

				for (int i = 0; i < 105; i = i + 5)
					{
						System.out.println(i);
					}
				;

				// challenge four

				int bigValue = 0;

				for (int i = 0; i < 105; i = i + 5)
					{

						bigValue = bigValue + i;

						if (i == 100)
							{

								System.out.println(bigValue);

							}
					}

				// challenge five
//				Scanner userInput = new Scanner(System.in);
//
//				System.out.println("Enter a lowerbound number:");
//
//				int lowerBound = userInput.nextInt();
//
//				System.out.println("Now enter a upperBound");
//
//				int upperBound = userInput.nextInt();
//
//				int outPutValue = 0;
//
//				for (int i = lowerBound; i <= upperBound; i++)
//					{
//
//						outPutValue = outPutValue + i;
//
//						if (i == upperBound)
//							{
//								System.out.println("The sum for all the values " + lowerBound + " and " + upperBound
//										+ " is " + outPutValue);
//							}
//
//					}

				// challenge six

				for( int i = 0; i < 8 ; i++){
					
					if(i <= 0){
						System.out.println("*********");
					}
					if(i >= 7){
						System.out.println("*********");
					}
					else{
						System.out.println("*       *");
					}
					
					
				}
				
				// extra credit
				
				for(int i = -5 ; i < 55 ; i = i + 5){
					
					int var = 9 + 1;
					int varOne = 19 + 1;
					int varTwo = varOne + var;
					int varThree = varTwo + var;
					int varFour = varThree + var;
					int varFive = varFour + var;
					if(i == var){
						System.out.println(var);
					};
					if(i == varOne){
						System.out.println(varOne);
					}
					if(i == varTwo){
						System.out.println(varTwo);
					}
					if(i == varThree){
						System.out.println(varThree);
					}
					if(i == varFour){
						System.out.println(varFour);
					}
					if(i == varFive){
						System.out.println(varFive);
					}
					
				};

			}

	}
