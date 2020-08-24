package Q15;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/*12.	Assume that there is already  arraylist of members of Society Member{memberid,Wing_flatNo,name}. 
 *  Write a program which creates Map where key is Wing_FlatNo and value is List of all  names of family members [1M]*/
public class Demo15 {
	public static void main(String[] args) {
		SocietyMembers12 s1 = new SocietyMembers12(10, 101, "Shilpa");
		SocietyMembers12 s2 = new SocietyMembers12(11, 102, "Jyoti");
		SocietyMembers12 s3 = new SocietyMembers12(12, 103, "Nimo");
		SocietyMembers12 s4 = new SocietyMembers12(13, 104, "Maddy");
		SocietyMembers12 s5 = new SocietyMembers12(14, 105, "Yogi");
		SocietyMembers12 s6 = new SocietyMembers12(15, 106, "Rani");

		ArrayList<SocietyMembers12> al = new ArrayList();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		al.add(s5);
		al.add(s6);

//		System.out.println(al);

		Map<Integer, String> m = new HashMap();

		Iterator itr = al.iterator();
		while (itr.hasNext()) {
			SocietyMembers12 members = (SocietyMembers12) itr.next();
			int flatNo = members.wing_FlatNo;
			String names = members.name;
			ArrayList<String> al1 = new ArrayList();
			al1.add(names);

			if (m.get(names) == null) {
				m.put(flatNo, names);

			} else {

				al1.add(m.get(names));
				m.put(flatNo, names);

			}

		}
		System.out.println(m);
	}

}
