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
		System.out.println("请输入你要删除的学生学号");
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
				System.out.println("删除成功");
				break;
			}
			else{
				System.out.println("没有此学号，请重新输入");
			}
		}
		
		
	}
}
