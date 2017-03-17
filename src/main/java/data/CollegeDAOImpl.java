package data;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import javax.annotation.PostConstruct;
import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.WebApplicationContext;

public class CollegeDAOImpl implements CollegeDAO {
	private static final String filename = "WEB-INF/file.txt";
	private ServletContext servletContext;
	private Map<String, College> collegeMap = new TreeMap<>();

	@Autowired
	private WebApplicationContext wac;
//	public CollegeDAOImpl(){System.out.println("CollegeDAOImpl() ctor");}

	@PostConstruct
	private void init() {
		System.out.println("in init");
		try {
			InputStream is = wac.getServletContext().getResourceAsStream(filename);
			BufferedReader buf = new BufferedReader(new InputStreamReader(is));

			String line;
			while ((line = buf.readLine()) != null) {
				System.out.println(line);
				String[] stuff = line.split("/ ");
				String college = stuff[0];
				String conference = stuff[1];
				String division = stuff[2];
				String coach = stuff[3];
				String mascot = stuff[4];
				String stadium = stuff[5];
				String pic = stuff[6];

				College c = new College(college, conference, division, coach, mascot, stadium, pic);
				System.out.println(c);
				collegeMap.put(college, c);
			}
		}
		catch (Exception e) {
			System.err.println(e);
		}
	}

	@Override
	public List<College> getAll() {
		List<College> cList = new ArrayList<>();
		Set<String> keys = collegeMap.keySet();
		for (String k : keys) {
			cList.add(collegeMap.get(k));
		}
		return cList;
	}

	@Override
	public List<College> getByDivision(String n) {
		List<College> cList = new ArrayList<>();

		Set<String> keys = collegeMap.keySet();
		for (String k : keys) {
			if (collegeMap.get(k).getDivision().equals(n)) {
				cList.add(collegeMap.get(k));
			}
		}
		return cList;
	}

	@Override
	public List<College> getByConference(String n) {
		List<College> cList = new ArrayList<>();

		Set<String> keys = collegeMap.keySet();
		for (String k : keys) {
			if (collegeMap.get(k).getConference().equals(n)) {
				cList.add(collegeMap.get(k));
			}
		}
		return cList;
	}

	@Override
	public College getByName(String n) {
		College c = new College();

		Set<String> keys = collegeMap.keySet();
		for (String k : keys) {
			if (collegeMap.get(k).getName().equals(n)) {
				c = collegeMap.get(k);
				break;
			}
		}
		return c;
	}

	@Override
	public College addCollege(College college) {
		collegeMap.put(college.getName(), college);
		return college;
	}

	@Override
	public College deleteCollege(String n, List<College> l) {
		Set<String> keys = collegeMap.keySet();
		int i = 0;
		String s = null;
		for (String k : keys) {
			if (collegeMap.get(k).getName().equals(n)) {
//				i++;
				s = k;
				for (College c : l) {
					if(c.getName().equals(k)){
						i = l.indexOf(c);
					}
					
				}
				break;
			}
//			i++;
		}
		l.remove(i);
		collegeMap.remove(s);
//		if (i < 0) {
//			i = l.size();
//		}
//		else if (i > (l.size() -1)){
//			i = 0;
//		}
		return l.get(i);
	}

	@Override
	public College editCollege(College college) {
		collegeMap.put(college.getName(), college);
		return college;
	}

	@Override
	public College nextCollege(String c, List<College> l) {
		College c2 = new College();
		int i = 0;
		for (College c1: l) {
			if (c1.getName().equals(c)) {
				i++;
				break;
			}
			i++;
		}
		if (i > (l.size() - 1)) {
			i = 0;
		}
		return l.get(i);
	}
	
	@Override
	public College lastCollege(String c, List<College> l) {
		College c2 = new College();
		int i = 0;
		for (College c1: l) {
			if (c1.getName().equals(c)) {
				i--;
				break;
			}
			i--;
		}
		if (i < 0) {
			i = l.size();
		}
		return l.get(i);
	}
}