/**
 * 
 */
package com.bldea.crorepathi.package1;

/**
 * @author HP
 *
 */
import java.util.Scanner;
public class crorepathiapp {

	/**
	 * @param args
	 */

	public static void main(String[] args)throws Exception {
		System.out.println("welcome to crorepathi game");// TODO Auto-generated method stub
		System.out.println("lets welcome our first candidate");
		Scanner sc=new Scanner(System.in);
System.out.println("what is your name?");
String name=sc.next();
System.out.println("what is your age?");
int age=sc.nextInt();
System.out.println("what is your city?");
String city=sc.next();
System.out.println("what is your state?");
String state=sc.next();

candidate c1=new candidate(name,age,city,state);
System.out.println("congratulation for making till here mr/ms."+c1.getName());
System.out.println("the rules of the game:");
System.out.println("1.there will be 10 question which rewards a specific amt in"+"incremental order");
System.out.println("2.the game will be contain 3 life lines."+"audiance phone,50-50 and skip the question");
System.out.println("3.you can quit the game at any stage.");
System.out.println("please type 1 if you wish too see the reward per question."+"else type any key.");
int type_1=sc.nextInt();
if(type_1==1) {
	System.out.println("question-1:1000\n"+
"question-2:5000 \n"+
			"question-3:10000\n"+
			"question-4:20000\n"+
			"question-5:40000\n"+
			"question-6:50000\n"+
			"question-7:60000\n"+
			"question-8:70000\n"+
			"question-9:80000\n"+
			"question-10:100000\n");
	System.out.println("do you wish to continue??(type:YES/NO)");
}
else {
	System.out.println("do you wish to continue??(type:YES/NO)");
}
	String type_2=sc.next();
	if(type_2.equalsIgnoreCase("yes")==true) {
		System.out.println("lets begin the game");
		System.out.println("here is the first question.");
		boolean res1=Questions.fetchQuestion1(c1.getName());
		if(res1==true) {
		System.out.println("congratulation!! your answer is correct.\n"+"you have won Rs."+c1.getAmount());
		System.out.println("here is our next question.");
		boolean res2=Questions.fetchQuestion2(c1.getName());
		if(res2==true) {
		System.out.println("congratulation!! your answer is correct.\n"+"you have won Rs."+c1.getAmount());
		System.out.println("here is our next question.");
		boolean res3=Questions.fetchQuestion3(c1.getName());
		if(res3==true) {
		System.out.println("congratulation!! your answer is correct.\n"+"you have won Rs."+c1.getAmount());
		System.out.println("here is our next question.");
		boolean res4=Questions.fetchQuestion4(c1.getName());
		if(res4==true) {
		System.out.println("congratulation!! your answer is correct.\n"+"you have won Rs."+c1.getAmount());
		System.out.println("here is our next question.");
		boolean res5=Questions.fetchQuestion5(c1.getName());
		if(res5==true) {
		System.out.println("congratulation!! your answer is correct.\n"+"you have won Rs."+c1.getAmount());
		System.out.println("here is our next question.");
		boolean res6=Questions.fetchQuestion6(c1.getName());
		if(res6==true) {
		System.out.println("congratulation!! your answer is correct.\n"+"you have won Rs."+c1.getAmount());
		System.out.println("here is our next question.");
		boolean res7=Questions.fetchQuestion7(c1.getName());
		if(res7==true) {
		System.out.println("congratulation!! your answer is correct.\n"+"you have won Rs."+c1.getAmount());
		System.out.println("here is our next question.");
		boolean res8=Questions.fetchQuestion8(c1.getName());
		if(res8==true) {
		System.out.println("congratulation!! your answer is correct.\n"+"you have won Rs."+c1.getAmount());
		System.out.println("here is our next question.");
		boolean res9=Questions.fetchQuestion9(c1.getName());
		if(res9==true) {
		System.out.println("congratulation!! your answer is correct.\n"+"you have won Rs."+c1.getAmount());
		System.out.println("here is our next question.");
		boolean res10=Questions.fetchQuestion10(c1.getName());
		if(res10==true) {
		System.out.println("congratulation!! your answer is correct.\n"+"you have won Rs."+c1.getAmount());
		
											
										
				
										
											
										
			
	}
	else {
		System.out.println("we are sorry!! your answer is incorrect.\n"+"you have won Rs."+c1.getAmount());
	}
		}
		else {
			System.out.println("we are sorry!! your answer is incorrect.\n"+"you have won Rs."+c1.getAmount());
			
		}
	}
								else {
									System.out.println("we are sorry!! your answer is incorrect.\n"+"you have won Rs."+c1.getAmount());
									
								}
							}
							else {
								System.out.println("we are sorry!! your answer is incorrect.\n"+"you have won Rs."+c1.getAmount());
								
							}
						}
						else {
							System.out.println("we are sorry!! your answer is incorrect.\n"+"you have won Rs."+c1.getAmount());
							
						}
					}
					else {
						System.out.println("we are sorry!! your answer is incorrect.\n"+"you have won Rs."+c1.getAmount());
						
					}
				}
				else {
					System.out.println("we are sorry!! your answer is incorrect.\n"+"you have won Rs."+c1.getAmount());
					
				}
			}
			else {
				System.out.println("we are sorry!! your answer is incorrect.\n"+"you have won Rs."+c1.getAmount());
				
			}
		}
		else {
			System.out.println("we are sorry!! your answer is incorrect.\n"+"you have won Rs."+c1.getAmount());
			
		}
	}
		else {
			System.out.println("we are sorry!! your answer is incorrect.\n"+"you have won Rs."+c1.getAmount());
			
		}
	}
	else {
		System.out.println("thank you for coming. all the best!!");
	}
}	
							}








		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
