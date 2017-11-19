import java.util.Scanner;
public class Main {
 public static void main(String args[]) {
  
  Scanner keyboard = new Scanner(System.in);
  System.out.println("Welcome to Sabeet's Employee database.");
  System.out.println("Please enter the number of Employees that you'd like to register(Must be less than 100): ");
  
  int empCap = keyboard.nextInt();
  while(empCap > 100 ) {
   System.out.println(" Number has to be less than 100. Try again: ");
   empCap = keyboard.nextInt();
 }
  Person[] people=new Person[empCap];
  System.out.println("Alright, so we have " + empCap + " people employed. \nLet's register each and every one.");
  
  for(int i=0; i<empCap; i++) {
   
   int employeeIdNum, salary, social;
   String fullName, depto;
   System.out.println("Please enter Employee's Full name: ");
   Scanner scanner = new Scanner(System.in);
   fullName = scanner.nextLine();
   System.out.println("Please enter Employee's ID: ");
   employeeIdNum = keyboard.nextInt();
   System.out.println("Please enter Employee's Salary: ");
   salary = keyboard.nextInt();
   System.out.println("Please enter Employee's Social Security number: ");
   social = keyboard.nextInt();
   System.out.println("Please enter Employee's Department of occupation: ");
   depto = keyboard.next();
   
   
   people[i] = new Employee(fullName, employeeIdNum, salary, social, depto);
   System.out.println(people[i]+"\n");
   
  }
  
  /*for(int j=1; j<empCap; j++) {
   System.out.println(people[j]+"\n");
  }
  
  */
  
  
  
  /* Person[] people=new Person[2];
  people[0] = new Employee("Cow Bull", 025, 23000, 980909877, "Life");
  people[1] = new Employee("Nancy Cookies", 385 , 55000 , 897456321 , "Death");
  System.out.println(people[0]);
  System.out.println(people[1]);
  */
 }
}

