package yangxun.student;

import java.io.IOException;
import java.util.ArrayList;

public class SelectStudent {
	public static void selectStudent(String path) throws IOException{
		ArrayList<Student> arr=new ArrayList<Student>();
		ReadData.readStudent(path, arr);
		if(arr.size()==0){
			System.out.println("û��ѧ������Ϣ��");
			return;
		}
		System.out.println("ѧ��\t����\t����\tסַ"); //\t��Tab������˼
		for(int x=0;x<arr.size();x++){
			Student show =arr.get(x);              
			
			System.out.println(show.getId()+"\t"+show.getName()+"\t"+show.getAge()+"\t"+show.getAdr()); 
		}
	}
}
