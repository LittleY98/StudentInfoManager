package yangxun.student;

import java.io.IOException;
import java.util.Scanner;

public class StudentDemo {
	public static void main(String[] args) throws IOException{
		@SuppressWarnings("unused")
		String path ="studentinfo.txt";
		while(true){
			System.out.println("-----��ӭ����ѧ������ϵͳ-----");
			System.out.println("1���鿴����ѧ����Ϣ");
			System.out.println("2�����ѧ����Ϣ");
			System.out.println("3��ɾ��ѧ����Ϣ");
			System.out.println("4���޸�ѧ����Ϣ");
			System.out.println("5���˳�ϵͳ");
			System.out.println("");
			System.out.println("���������ѡ��");
			@SuppressWarnings("resource")
			Scanner s=new Scanner(System.in);
			String choice=s.nextLine();
		
			switch(choice){
			case "1":
				SelectStudent.selectStudent("studentinfo.txt");
				break;
			case "2":
				AddStudent.addStudent("studentinfo.txt");
				SelectStudent.selectStudent("studentinfo.txt");
				break;
			case "3":
				DeleteStudent.deleteStudent("studentinfo.txt");
				SelectStudent.selectStudent("studentinfo.txt");
				break;
			case "4":
				UpdateStudent.updateStudent("studentinfo.txt");
				SelectStudent.selectStudent("studentinfo.txt");
				break;
			case "5":
				
			default:
				System.out.println("лл����ʹ�ã�");
				System.exit(0);
			}
		}
	}

}
