package yangxun.student;

import java.io.IOException;
import java.util.Scanner;

public class StudentDemo {
	public static void main(String[] args) throws IOException{
		@SuppressWarnings("unused")
		String path ="studentinfo.txt";
		while(true){
			System.out.println("-----欢迎来到学生管理系统-----");
			System.out.println("1、查看所有学生信息");
			System.out.println("2、添加学生信息");
			System.out.println("3、删除学生信息");
			System.out.println("4、修改学生信息");
			System.out.println("5、退出系统");
			System.out.println("");
			System.out.println("请输入你的选择");
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
				System.out.println("谢谢您的使用！");
				System.exit(0);
			}
		}
	}

}
