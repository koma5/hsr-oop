package u8;
import java.util.Comparator;

public class ModuleComparator implements Comparator<Module> {

	public int compare(Module thisOne, Module thatOne) {
		if(thisOne.getPrerequisites().size() < thatOne.getPrerequisites().size()) {
			return -1;
		}
		else if (thisOne.getPrerequisites().size() > thatOne.getPrerequisites().size()){
			return 1;
		}
		else {
			return 0;
		}
	}

}
