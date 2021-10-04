package fontend;

import java.util.Comparator;

import entity.Department;

public class CompareToName implements Comparator<Department>{

	@Override
	public int compare(Department o1, Department o2) {
		if(o1==null) {
			return -1;
		}if(o2==null) {
			return 1;
		}
			return(o1.name.compareTo(o2.name)); 
			
		
	}

}
