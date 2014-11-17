package u8;
import java.util.TreeSet;


public class Module implements Comparable<Module>{

	public final String name;
	private TreeSet<Module> prerequisites = new TreeSet<Module>();
	
	Module(String name) {
		this.name = name;
	}
	
	public boolean equals(Module other) {
		return name.equals(other.name);
	}
	
	public int compareTo(Module other) {
		return name.compareTo(other.name);
	}
	
	/*
	public int compareTo(Module other) {
		int nameCompare = name.compareTo(other.name);
		if(nameCompare == 0) {
			return 0;
		}
		else if (prerequisites.size() > other.prerequisites.size()) {
			return 1;
		}
		else {
			return -1;
		}
	}*/
	
	@Override
	public String toString() {
		String x = "";
		for(Module pre : prerequisites) {
			x += " " + pre.name; 
		}
		return name + x;
	}
	
	public boolean addPrerequisite(Module module) {
		return prerequisites.add(module);
	}
	
	public boolean removePrerequisite(Module module) {
		return prerequisites.remove(module);
	}
	
	public int getPrerequisitesCount() {
		return prerequisites.size();
	}
	
	public TreeSet<Module> getPrerequisites() {
		return prerequisites;
	}
}
