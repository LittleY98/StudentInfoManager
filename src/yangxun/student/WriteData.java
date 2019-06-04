package yangxun.student;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class WriteData {
	public static void writeData(String path,ArrayList<Student> arr) throws IOException{
		BufferedWriter bw=new BufferedWriter(new FileWriter(path));
		for(int x=0;x<arr.size();x++){
			Student s=arr.get(x);
			StringBuilder sb=new StringBuilder();
			sb.append(s.getId()+","+s.getName()+","+s.getAge()+","+s.getAdr());
			bw.write(sb.toString());
			bw.newLine();
			bw.flush();
		}
		bw.close();
	}
}
