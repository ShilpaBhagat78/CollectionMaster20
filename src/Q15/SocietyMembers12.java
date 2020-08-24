package Q15;
/*15.	Assume that there is already  arraylist of members of Society Member{memberid,Wing_flatNo,name}.
 *   Write a program which creates Map where key is Wing_FlatNo and value is List of all  names of family members [1M]*/
public class SocietyMembers12 {
	int memberid;
	int wing_FlatNo;
	String name;
	
	public SocietyMembers12(int memberid,int wing_FlatNo,String name)
	{
		this.memberid = memberid;
		this.wing_FlatNo = wing_FlatNo;
		this.name = name;
	}

	public int getMemberid()
	{
		return memberid;
	}
	
	public int getWing_Flatno()
	{
		return wing_FlatNo;
	}
	
	public String getName()
	{
		return name;
	}

	@Override
	public String toString() {
		return "SocietyMembers12 [memberid=" + memberid + ", wing_FlatNo=" + wing_FlatNo + ", name=" + name + "]";
	}
	

}
