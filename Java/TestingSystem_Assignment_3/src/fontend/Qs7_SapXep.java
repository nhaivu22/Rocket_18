package fontend;

import java.util.Comparator;

import entity.Department;

public class Qs7_SapXep implements Comparator<Department>{

	@Override
	public int compare(Department o1, Department o2) {
		// lấy ra khoảng trắng cuối cùng
		int lIndex1=o1.name.lastIndexOf(" ");
		String lWorld1=o1.name.substring(lIndex1+1);
		int lIndex2=o1.name.lastIndexOf(" ");
		String lWorld2=o2.name.substring(lIndex2+1);
		return lWorld1.compareTo(lWorld2);
	}

}
