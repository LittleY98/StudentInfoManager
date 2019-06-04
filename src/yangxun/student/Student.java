package yangxun.student;

public class Student {
	private String id;
	//private static String id; 如果使用static的话、这个类里的所有使用这个属性的类全部共享一个值
	private String name;
	private String age;
	private String adr;
	public Student(){
		
	} 
	public Student(String id,String name,String age,String adr){
		this.id=id;
		this.name=name;
		this.age=age;
		this.adr=adr;
	}
	public void setId(String id){
		this.id=id;
	}
	public String getId(){
		return id;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	
	public void setAge(String age){
		this.age=age;
	}
	public String getAge(){
		return age;
	}
	public void setAdr(String adr){
		this.adr=adr;
	}
	public String getAdr(){
		return adr;
	}
}
