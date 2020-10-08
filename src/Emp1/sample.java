package Emp1;

import java.io.*;

class Employee{
	  
	   String name,designation;
	   int age,code;
	   double basic,da,hra,ca,ea,gp;
	   double g,pf,esic,d,np,t,a;
	   
	   Employee(String name,int age,int code,String designation){
		   this.name=name;
		   this.age=age;
		   this.code=code;
		   this.designation=designation;
		   }
	   Employee(double basic,double da,double hra,double ca,double ea,double gp,double g,double pf,double esic,double d,double np,double t,double a){
		   this.basic=basic;
		   this.da=da;		   
		   this.hra=hra;
		   this.ca=ca;
		   this.ea=ea;
		   this.gp=gp;
		   this.g=g;
		   this.pf=pf;
		   this.esic=esic;
		   this.d=d;
		   this.np=np;
		   this.t=t;
		   this.a=a;
	   }
	   public void display(){
		   System.out.println("************************************************");
		   System.out.println("Name                   :" + name);
		   System.out.println("Age                    :" + age);
		   System.out.println("COde                   :" + code);
		   System.out.println("Designation            :"+ designation);
	   }  
	   
	   public void display_b(){
		   System.out.println("Basic Pay              :"+ basic);
		   System.out.println("************************************************");
		   System.out.println("Dearness Allowance     :"+ da);
		   System.out.println("House Rent Allowance   :"+ hra);
		   System.out.println("Conveyance Allowance   :"+ ca);
		   System.out.println("Entertainment Allowance:"+ ea);
		   System.out.println("Gross Pay              :"+ gp);
		   System.out.println("************************************************");
		   System.out.println("Grautity               :"+ g);
		   System.out.println("Provident Fund         :"+ pf);
		   System.out.println("ESIC                   :"+ esic);
		   System.out.println("Deduction              :"+ d);
		   System.out.println("************************************************");
		   System.out.println("Monthly Net Pay        :"+ np);
		   System.out.println("Tax                    :"+ t);
		   System.out.println("Annual Income          :"+ a);
		   System.out.println("************************************************");
	   }
	   
}

public class sample {

	public static void main(String[] args) throws Exception{
		
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Enter the Employee Name       : ");
		String name=br.readLine();
		
		System.out.print("Enter the Employee's Age      : ");
		int age=Integer.parseInt(br.readLine());
		
		System.out.print("Enter the Employee code       : ");
		int code=Integer.parseInt(br.readLine());
		
		System.out.print("Enter the Employee Designation: ");
		String designation=br.readLine();
		
		double basic,da,hra,ca,ea,gp;
		double g,pf,esic,d,np,t,ai,a;
		
		System.out.print("Enter the Basic PAy           : ");
		basic=Double.parseDouble(br.readLine());
		
		da=basic*20/100;
		hra=basic*15/100;
		ca=basic*7/100;
		ea=basic*3/100;
		
		gp=basic+da+hra+ca+ea;
		
		g=basic*2/100;
		pf=basic*10/100;
		esic=basic*3/100;
		
		d=pf+g+esic;
		
		np=gp-d;
		
		ai=np*12;
		
		if(ai<250_000){
			t=0;
			a=ai;
		}
			else{
				t=ai*5/100;
				a= ai-t;
			}
			
		Employee e=new Employee(name,age,code,designation);
		Employee b=new Employee(basic,da,hra,ca,ea,gp,g,pf,esic,d,np,t,a);
		e.display();
		b.display_b();
		}
     }
		
	
		
		
		
		
		
		

	


