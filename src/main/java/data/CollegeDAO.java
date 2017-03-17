package data;

import java.util.List;

public interface CollegeDAO {

	List<College> getByConference(String n);
	List<College> getByDivision(String n);
	List<College> getAll();
	College deleteCollege(String n, List<College> l);
	College nextCollege(String c, List<College> l);
	College lastCollege(String c, List<College> l);
	College getByName(String n);
	College editCollege(College c);
	College addCollege(College college);
	
}
