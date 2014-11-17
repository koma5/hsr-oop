package u8;
import java.util.ArrayList;
import java.util.TreeSet;

public class Schedule {

	private TreeSet<Module> modules = new TreeSet<>();
	ModuleComparator comparator = new ModuleComparator();
	
	public Module addModule(Module module) {
		if(modules.add(module)) {
			return module;
		}
		else {
			for(Module mod : modules) {
				if(mod.equals(module)) {
					return mod;
				}
			}
		}
		//ToDo
		return new Module("Shit Happens...");
	}
	
	public void removeFromPrerequisites(Module module) {
		modules.remove(module);
		for (Module mod : modules) {
			mod.removePrerequisite(module);
		}
	}
	
	public ArrayList<Module> getSortetModules() {
		ArrayList<Module> sortedModules = new ArrayList<>();
		sortedModules.addAll(modules);
		sortedModules.sort(comparator);
		return sortedModules;
	}
	
	public void printModules() {
		for(Module mod : getSortetModules()) {
			System.out.println(mod);
		}
	}
	
	private void printWithEmptyPrerequisites() {
		ArrayList<Module> sortedModules = getSortetModules();
		ArrayList<Module> toDelete = new ArrayList<>();
		for (Module mod : sortedModules) {
			if(mod.getPrerequisitesCount() == 0) {
				System.out.print(mod.name + " ");
				toDelete.add(mod);
			}
		}
		System.out.println();
		for (Module d : toDelete) {
			removeFromPrerequisites(d);
		}
	}
	
	public void print() {
		System.out.print("Semester 1: ");
		printWithEmptyPrerequisites();
		System.out.print("Semester 2: ");
		printWithEmptyPrerequisites();
		System.out.print("Semester 3: ");
		printWithEmptyPrerequisites();
		System.out.print("Semester 4: ");
		printWithEmptyPrerequisites();
		System.out.print("Semester 5: ");
		printWithEmptyPrerequisites();
	}
}
