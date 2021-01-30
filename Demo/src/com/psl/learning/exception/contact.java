package com.psl.learning.exception;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

class Stack {
    int top;
    static final int max=10;
    contact a[] = new contact[10]; 
 
    boolean isEmpty()
    {
        return (top < 0);
    }
    Stack()
    {
        top = -1;
    }

 
    boolean push(contact x) throws InvalidException
    {
    	
        if (top >= (max - 1)) {
            System.out.println("Stack Overflow");
            throw new InvalidException("Stack Overflow");
        }
        else {
            a[++top] = x;
            System.out.println(" pushed");
            
            return true;
        }
    }
 
    void pop() throws InvalidException
    {
        if (top < 0) {
            System.out.println("Stack Underflow");
            throw new InvalidException("Stack Underflow"); 
            
        }
        else {
            contact x = a[top--];
            System.out.println("popped");
            x.display();
        }
    }
 
    void peek()
    {
        if (top < 0) {
            System.out.println("Stack Underflow");
        }
        else {
            contact x = a[top];
            x.display();
        }
    }
}
@SuppressWarnings("serial")
class InvalidException extends Exception{  
	 InvalidException(String s){  
	  super(s);  
	 }  
	}  

public class contact {
	DateFormat df = new SimpleDateFormat("MM-dd-yyyy");
	Date dob;
	Date anni;
	String fname,mname,lname,address,area,city,state,country,tnumber,mnumber,email,website,date1;
	int zip;

	contact(String fname, String mname, String lname, String dob, String anii, String address, String area, String city, int zip, String state, String country, String tnumber, String mnumber, String email, String website){
		this.fname = fname;
		this.mname = mname;
		this.lname = lname;
		this.address = address;
		try {
		this.dob = df.parse(dob);
		this.anni = df.parse(anii);}
		catch(java.text.ParseException e){
			e.printStackTrace();
		}
		this.date1 = dob;
		this.area = area;
		this.city = city;
		this.zip = zip;
		this.state = state;
		this.country = country;
		this.tnumber = tnumber;
		this.mnumber = mnumber;
		this.email = email;
		this.website = website;
		
	}
	
	public void display() {
		// TODO Auto-generated method stub
		System.out.println(fname + " " + lname + " " + dob + " " + anni);
		
	}

	void validate() throws InvalidException {
		String regex = "^[\\w-\\.+]*[\\w-\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
		if(this.fname!="" && this.lname!="" && this.email!="" && this.date1 != "" && this.email.matches(regex) && (this.tnumber!="" || this.mnumber !="")) {
			System.out.println("Validated");
		}
		else {
			throw new InvalidException("not valid");  
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		contact obj = new contact("Mou","Vuyyuru","Reddy","17-10-1998","17-10-1998","Santhaya","Nunna","Vijayawada",521212,"AP","India","123456","123456","moukthika777@gmail.com","mou.com");
		try {
			obj.validate();
		}catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("---------");
		Stack s = new Stack();

		try {
			s.push(obj);
		}catch(Exception e) {
			System.out.println(e);
		}
		try {
		s.pop();
	}catch(Exception e) {
		System.out.println( e);
	}
		s.peek();
	}

}
