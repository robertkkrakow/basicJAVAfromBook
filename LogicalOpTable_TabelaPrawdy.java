package jpdp.zadania;

public class LogicalOpTable_TabelaPrawdy {
	
	 public static void main(String args[]) {    
		 
		    boolean p, q;
		 	int a = 1, b = 0;
		 
		    System.out.println("P\tQ\tAND\tOR\tXOR\tNOT"); 
		 
		    p = true; q = true; 
		    //if(p + "\t" + q +"\t") {
		    	System.out.print(a + "\t" + b + "\t");
		    //}
		    	if(p&q == true) {
		    		System.out.print(a);
		    	}
		    		else {
		    			System.out.print(b);
		    		}
		    	
		    	
		    System.out.println((p^q) + "\t" + (!p)); 
		 /*
		    p = true; q = false; 
		    System.out.print(p + "\t" + q +"\t"); 
		    System.out.print((p&q) + "\t" + (p|q) + "\t"); 
		    System.out.println((p^q) + "\t" + (!p)); 
		 
		    p = false; q = true; 
		    System.out.print(p + "\t" + q +"\t"); 
		    System.out.print((p&q) + "\t" + (p|q) + "\t"); 
		    System.out.println((p^q) + "\t" + (!p)); 
		 
		    p = false; q = false; 
		    System.out.print(p + "\t" + q +"\t"); 
		    System.out.print((p&q) + "\t" + (p|q) + "\t"); 
		    System.out.println((p^q) + "\t" + (!p)); 
	 */
	 }    

}
