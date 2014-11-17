package u8;
import java.util.TreeSet;


public class Module implements Comparable<Module>{

	public final String name;
	private TreeSet<Module> prerequisites = new TreeSet<Module>();
	
	Module(String name) {
		this.name = name;
	}
	
	public boolean equals(Module other) {
		if(name.equals(other.name)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public int compareTo(Module other) {
		return name.compareTo(other.name);
	}
	
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
	
	public TreeSet<Module> getPrerequisites() {
		return prerequisites;
	}
}
