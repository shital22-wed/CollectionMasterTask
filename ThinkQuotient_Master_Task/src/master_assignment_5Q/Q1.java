package master_assignment_5Q;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//show most favoured course based on number of students enrolled.
				//(Course with maximum students)
		HashMap<Integer, List<Student>> studentMap = new HashMap<Integer,List<Student>>();

		int courceid = 0;
		int studid = 0;

				Set ss = studentMap.entrySet();
				Iterator itr = ss.iterator();
				while (itr.hasNext()) 
				{
					Map.Entry mapentry =  (Entry) itr.next();
					Integer cid = (Integer) mapentry.getKey();
					ArrayList<Student> al = (ArrayList<Student>) mapentry.getValue();
					int cnt = 0;
					for (int i = 0; i < al.size(); i++) {
						cnt++;
					}
					
				if (cnt > courceid) {
						courceid = cnt;
						studid = cid;
					}
				}
				ArrayList<Course> courseList = new ArrayList<Course>();
				Iterator it=courseList.iterator();
				while(it.hasNext())
				{
					Course tmp=(Course) it.next();
					if(studid==tmp.courseId)
							System.out.println(tmp.course_name);			
			
	}

}
}
