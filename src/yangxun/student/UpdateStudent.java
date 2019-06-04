package yangxun.student;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class UpdateStudent {
	public static void updateStudent(String path) throws IOException{
		ArrayList<Student> arr=new ArrayList<Student>();
		ReadData.readStudent(path, arr);
		@SuppressWarnings("resource")
		Scanner sc =new Scanner(System.in);
		System.out.println("请输入你要修改的学生学号");
		int index=-1;
		while(true){
			String id =sc.nextLine();
			for(int x=0;x<arr.size();x++){
				Student s =arr.get(x);
				if(s.getId().equals(id)){
					index=x;
					break;
				}
			}
			if(index>=0){
				System.out.println("请输入新姓名");
				String name =sc.nextLine();
				System.out.println("请输入新年龄");
				String age =sc.nextLine();
				System.out.println("请输入新住址");
				String adr =sc.nextLine();
				Student s=new Student();
				s.setId(id);
				s.setName(name);
				s.setAge(age);
				s.setAdr(adr);
				arr.set(index, s);
				WriteData.writeData(path,arr);
				System.out.println("修改成功");
				break;
			}
			else{
				System.out.println("没有此学号，请重新输入");
			}
		}
		
	}
}
