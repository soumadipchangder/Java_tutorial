package ColleectionFramework;

import java.util.Comparator;

public class SortEmployeebyId implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.id-o2.id;//asc
		//return o2.id-o1.id;//dsc
		//return o1.name.compareTo(o2.name);
	}
	
}
