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
		System.out.println("������ѧ��");
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
				System.out.println("ѧ���ظ�������������ѧ��");
			}
			else{
				break;
			}
		}
		
		System.out.println("����������");
		String name=sc.nextLine();
		System.out.println("����������");
		String age=sc.nextLine();
		System.out.println("�������ַ");
		String adr=sc.nextLine();
		Student s=new Student();
		s.setId(id);
		s.setName(name);
		s.setAge(age);
		s.setAdr(adr);
		arr.add(s);
		WriteData.writeData(path,arr);
		System.out.println("��ӳɹ�");
	}
}
