import java.util.Scanner;

public class Calc {

	
	
	 public static void main(String[] args) throws Exception  {                                                     

		 Stacklinked<Integer> cal = new Stacklinked<Integer>();
		 
		 
		Scanner sc= new Scanner(System.in);
    
	int op1,op2,ans;	 				 
	String str="";		
	
	while(!str.equals("E")) {
		str=sc.nextLine();
	
		
		if(str.equals("+"))  {
		try {
			op1=cal.pop();
		
		op2=cal.pop();
		ans=op1+op2;
		cal.push(ans);}
		catch (Exception e) {
			System.out.println("Error");
		}
}
	
else if (str.equals("-")) {
		op1=cal.pop();
		op2=cal.pop();
		ans=op1-op2;
		cal.push(ans);}

else if (str.equals("*")) {
		try {
			op1=cal.pop();
		
		op2=cal.pop();
		ans=op1*op2;
		cal.push(ans);}
		catch (Exception e) {
			System.out.println("Error");
		}
}
		
else if (str.equals("/")) {
	try {
		op1=cal.pop();
	
	op2=cal.pop();
	ans=op1/op2;
	cal.push(ans);}
	catch (Exception e) {
		System.out.println("Error");
	}
} 
 else if (str.equals("S"))
 {
		cal.showStack();}
	
 else if (str.equals("P"))	 {
	 	 
	 try {
		
		 System.out.println(cal.pop());
	} catch (Exception e) {
		// TODO Auto-generated catch block
		System.out.println("Error");
	}}
 else if (str.equals("E"))	 {
		System.exit(0);
	}
	
 else 
	
	 try {
		  
	 cal.push(Integer.valueOf(str));
		
	 }
	catch(Exception e) {
	System.out.println("CANNOT DO IT");
	
	}
}
	}}