package pk;

import java.util.*; 
public class student
{ 
private String name; 
private int age; 
private String address; 
private String email; 
private String gender;
private float percentage;

public student()
{} 
public student(String name, int age, String address, String email, String gender, float percentage)
{ 
this.name = name; 
this.age = age;
this.address = address; 
this.email = email; 
this.gender = gender;
this.percentage= percentage;
} 
public void setName(String newName)
{ 
name = newName; 
} 
public void setAge(int newAge)
{ 
age = newAge; 
} 
public void setAddress(String newAddress)
{ 
address = newAddress; 
} 
public void setEmail(String newEmail)
{ 
email = newEmail; 
} 
public void setGender(String newGender)
{ 
gender = newGender; 
} 
public void setPercentage(float newPercentage)
{ 
percentage = newPercentage; 
} 
public String getName()
{ 
return name; 
} 
public int getAge()
{ 
return age; 
} 
public String getAddress()
{ 
return address; 
} 
public String getEmail()
{ 
return email; 
} 
public String getGender()
{ 
return gender; 
} 
public float getPercentage()
{ 
return percentage; 
} 
public String toString() 
{ 
return "Name: " + name + ", Age: " + age + ", Address: " + address + ", Email: " + email + ",Gender: " + gender + ",percentage: " + percentage; 
} 
public static void main(String[] args)
{ 
try (Scanner sc = new Scanner(System.in)) {
	System.out.print("Name: ");
	sc.nextLine(); 
	System.out.print("Age: "); 
	sc.nextInt(); 
	System.out.print("Address: "); 
	sc.nextLine();
	System.out.print("Email: "); 
	sc.nextLine(); 
	System.out.print("Gender: "); 
	sc.nextLine(); 
	System.out.print("Percentage: "); 
	sc.nextLine(); 
	@SuppressWarnings("unused")
	float percentage = sc.nextFloat();
} 
}
}