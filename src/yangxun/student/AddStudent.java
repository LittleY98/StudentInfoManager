package yangxun.student;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class AddStudent {
	public static void addStudent(String path) throws IOException{
		ArrayList<Student> arr=new ArrayList<Student>();
		ReadData.readStudent(path, arr);
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		String id;
		boolean flag=false;
		System.out.println("请输入学号");
		while(true){
			id=sc.nextLine();
			for(int x=0;x<arr.size();x++){
				if(arr.get(x).getId().equals(id)){
					flag=true;
					break;
				}
				else{
					flag=false;
				}
			}
			if(flag){
				System.out.println("学号重复，请重新输入学号");
			}
			else{
				break;
			}
		}
		
		System.out.println("请输入姓名");
		String name=sc.nextLine();
		System.out.println("请输入年龄");
		String age=sc.nextLine();
		System.out.println("请输入地址");
		String adr=sc.nextLine();
		Student s=new Student();
		s.setId(id);
		s.setName(name);
		s.setAge(age);
		s.setAdr(adr);
		arr.add(s);
		WriteData.writeData(path,arr);
		System.out.println("添加成功");
	}
}
