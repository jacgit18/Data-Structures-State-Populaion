package edu.citytech.stateandpop.jc;

public class StatesRules {

//	public static boolean top5(StateAndPopulation sp){
//		  
//		  if(sp.getRank() <= 5)
//		  
//		  return true;
//		  return false;
//		  }

	public static boolean top5(StateAndPopulation sp) {

		if (sp.getCode().equals("AL") || sp.getCode().equals("MN") || sp.getCode().equals("MA")
				|| sp.getCode().equals("IL"))

			return true; // rwturning both true and false is considered boolean
		return false;
	}

	// warm States fl, ca tx, nv,hi

	public static boolean Warmstates(StateAndPopulation sp) {

		if (sp.getCode().equals("FL") || sp.getCode().equals("CA") || sp.getCode().equals("TX")
				|| sp.getCode().equals("HI"))
			return true;
		return false;

	}
	// less than 70000000

	public static boolean Smallstates(StateAndPopulation sp) {

		return sp.getPopulation() < 7_000_000;

	}

// a, e, i, o, u
	public static boolean BegWithVowels(StateAndPopulation sp) {

		String name = sp.getCode();

		if (name.startsWith("A") || name.startsWith("E") || name.startsWith("I") || name.startsWith("O")
				|| name.startsWith("U"))
			return true;
		return false;
	}

	
	/**
	 * a, e, i, o, u
	 * @param sp
	 * @return
	 */
	public static boolean isConstant(StateAndPopulation sp) {

		return !BegWithVowels(sp);

	}

}
