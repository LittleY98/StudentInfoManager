package yangxun.student;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReadData {
	public static void readStudent(String path,ArrayList<Student> arr) throws IOException {
		BufferedReader br=new BufferedReader(new FileReader(path));
		String line;
		while((line=br.readLine())!=null){
			String[] s=line.split(",");
			Student stu=new Student();
			stu.setId(s[0]);
			stu.setName(s[1]);
			stu.setAge(s[2]);
			stu.setAdr(s[3]);
			arr.add(stu);
		}
		br.close();
	}
}
