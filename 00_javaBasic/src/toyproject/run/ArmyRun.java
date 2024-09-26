package toyproject.run;

import toyproject.model.dto.Army;
import toyproject.model.service.ArmyService;

public class ArmyRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArmyService army = new ArmyService();
		army.Army();
		army.displayMenu();
	}

}
