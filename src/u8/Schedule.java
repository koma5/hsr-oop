package u8;
import java.util.TreeSet;

public class Schedule {

	private TreeSet<Module> modules = new TreeSet<>();

	
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
		return new Module("Shit Happens");
	}
	
	public void printModules() {
		for(Module mod : modules) {
			System.out.println(mod);
		}
	}
}
