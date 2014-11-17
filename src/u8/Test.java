package u8;

import java.util.TreeSet;

public class Test {
	public static void main(String[] args) throws Exception {
		// Sample code to illustrate how the CatalogueReader could be used:
		try (CatalogueReader reader = new CatalogueReader("StudyCatalogue.txt")) {
			String[] names;
			
			Schedule sch = new Schedule();
			
			while ((names = reader.readNexteLine()) != null) {
				Module mod1 = sch.addModule(new Module(names[0]));
				System.out.print("Module: " + names[0] + " Prerequisite: ");
				for (int i = 1; i < names.length; i++) {
					Module mod2 = sch.addModule(new Module(names[i]));
					mod1.addPrerequisite(mod2);
					System.out.print(names[i] + " ");
				}
				System.out.println();
			}
			sch.printModules();
			sch.print();
		}
	}
}
