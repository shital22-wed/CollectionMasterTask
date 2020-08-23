package master_assignment_5Q;

import java.util.Map.Entry;
import java.util.*;

public class TestAcademy {
	public static void main(String[] args) {
	
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
		
	//===show poor performing students (marks <40%) across all tests for a course id.
HashMap<Integer, List<TestResult>> test_map = new HashMap<Integer, List<TestResult>>();

			


	}
}
