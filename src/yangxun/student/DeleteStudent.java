package yangxun.student;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class DeleteStudent {
	public static void deleteStudent(String path) throws IOException{
		ArrayList<Student> arr=new ArrayList<Student>();
		ReadData.readStudent(path, arr);
		@SuppressWarnings("resource")
		Scanner sc =new Scanner(System.in);
		System.out.println("��������Ҫɾ����ѧ��ѧ��");
		while(true){
			String id=sc.nextLine();
			int index=-1;
			for(int x=0 ; x<arr.size();x++){
				Student s=arr.get(x);
				if(s.getId().equals(id)){
					index=x;
					break;
				}
			}
			if(index>=0){
				arr.remove(index);
				WriteData.writeData(path,arr);
				System.out.println("ɾ���ɹ�");
				break;
			}
			else{
				System.out.println("û�д�ѧ�ţ�����������");
			}
		}
		
		
	}
}
