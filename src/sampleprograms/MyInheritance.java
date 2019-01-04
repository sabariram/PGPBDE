package sampleprograms;

class Student{
	//Store name, ANo, STD
	String name;
	int admissionNo;
	int std;
	
	Student(String name, int admissionNo, int std)
	{
		this.name = name;
		this.admissionNo = admissionNo;
		this.std = std;
	}
	
	Student()
	{
		this.name = null;
		this.admissionNo = 0;
		this.std = 0;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getAdmissionNo()
	{
		return admissionNo;
	}
	
	public int getStd()
	{
		return std;
	}
	
}

class Report extends Student{
	//Store ptage and pass and also the attributes of student class(super keyword)
	int percentage;
	String result;
	
	Report(String name, int admissionNo, int std)
	{
		super(name, admissionNo, std);
	}
	
	Report()
	{
		this.percentage = 0;
		this.result = null;
	}
	
	public int getPercentage()
	{
		return percentage;
	}
	
	public String getResult()
	{
		return result;
	}
	
	public void setPercentage(int percentage)
	{
		this.percentage = percentage;
	}
	
	public void setResult(String result)
	{
		this.result = result;
	}
	
}

class Bus extends Student {
	//Store route and BG and also the attributes of student class(super keyword)
		
	int route;
	String bloodGroup;
	
	Bus(String name, int admissionNo, int std)
	{
		super(name, admissionNo, std);
	}
	
	Bus()
	{
		this.route = 0;
		this.bloodGroup = null;
	}
	
	public int getRoute()
	{
		return route;
	}
	
	public String getbloodGroup()
	{
		return bloodGroup;
	}
	
	public void setRoute(int route )
	{
		this.route = route;
	}
	
	public void setbloodGroup(String bloodGroup)
	{
		this.bloodGroup = bloodGroup;
	}
}

public class MyInheritance{
    
	public static void main(String[] args) {
    	   	
    	int adNo;
    	
    	String[] strNums1 = {"A", "1", "9", "99", "yes", "27", "B+"};
    	String[] strNums2 = {"B", "2", "10", "88", "no", "28", "A+"};
    	adNo = 1;
    	
    	/*Store these details by making objects of both classes and then with the help of if-else, return the correct output.*/
    	
    	Student student1 = new Student(strNums1[0], Integer.parseInt(strNums1[1]), Integer.parseInt(strNums1[2]));
    	Report report1 = new Report();
    	report1.setPercentage(Integer.parseInt(strNums1[3]));
    	report1.setResult(strNums1[4]);
    	Bus bus1 = new Bus();
    	bus1.setRoute(Integer.parseInt(strNums1[5]));
    	bus1.setbloodGroup(strNums1[6]);
    	
    	Student student2 = new Student(strNums2[0], Integer.parseInt(strNums2[1]), Integer.parseInt(strNums2[2]));
    	Report report2 = new Report();
    	report2.setPercentage(Integer.parseInt(strNums2[3]));
    	report2.setResult(strNums2[4]);
    	Bus bus2 = new Bus();
    	bus2.setRoute(Integer.parseInt(strNums2[5]));
    	bus2.setbloodGroup(strNums2[6]);
    	
    	if((adNo != student1.getAdmissionNo()) && (adNo != student2.getAdmissionNo()))
    	{
    		System.out.println("No entry found!");
    	} 
    	else
    	{
    		if (adNo == student1.getAdmissionNo())
    		{
    			System.out.printf("%s %d %d",student1.getName(),report1.getPercentage(),bus1.getRoute());
    		}
    		
    		if (adNo == student2.getAdmissionNo())
    		{
    			System.out.printf("%s %d %d",student2.getName(),report2.getPercentage(),bus2.getRoute());
    		}
    	}
    	
    	
    	}
    }

