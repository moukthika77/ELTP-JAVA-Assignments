package com.psl.learning.demo;

interface IPerson{
	final String name="String";
	int age=0;

	
	public void displayDetail();
}
class Person implements IPerson{
	String name;
	int age;
	void setname(String name,int age) {
		this.name = name;
		this.age=age;
		
	}
	
	public void displayDetail() {
		System.out.println(name + age);
		
	}
}

class Student extends Person{
	int id;
	void setid(int id) {
		this.id=id;
	}
	
}

class Undergrad extends Student{
	
}

class Grad extends Student{
	
}
interface Temporary{
	
}
interface Salaried{
	
}


class Faculty extends Person{
	String dept;
	void setDept(String dept) {
		this.dept = dept;
		
	}
}


class UnderGradFaculty extends Faculty{
	
}
class TUnderGradFaculty extends UnderGradFaculty implements Temporary{
	
}
class SUnderGradFaculty extends UnderGradFaculty implements Salaried{
	
}

class GradFaculty extends Faculty{
	
}

class TGradFaculty extends UnderGradFaculty implements Temporary{
	
}
class SGradFaculty extends UnderGradFaculty implements Salaried{
	
}
