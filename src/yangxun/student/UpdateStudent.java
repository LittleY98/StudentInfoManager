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
		System.out.println("��������Ҫ�޸ĵ�ѧ��ѧ��");
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
				System.out.println("������������");
				String name =sc.nextLine();
				System.out.println("������������");
				String age =sc.nextLine();
				System.out.println("��������סַ");
				String adr =sc.nextLine();
				Student s=new Student();
				s.setId(id);
				s.setName(name);
				s.setAge(age);
				s.setAdr(adr);
				arr.set(index, s);
				WriteData.writeData(path,arr);
				System.out.println("�޸ĳɹ�");
				break;
			}
			else{
				System.out.println("û�д�ѧ�ţ�����������");
			}
		}
		
	}
}
