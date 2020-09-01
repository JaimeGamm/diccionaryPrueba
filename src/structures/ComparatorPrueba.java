package structures;

import java.util.Comparator;


public class ComparatorPrueba implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
//		System.out.println(o1.getName()+" " +o2.getName()+ " "+o1.getName().compareTo(o2.getName()));
		return o1.getName().compareTo(o2.getName());
	}

}
