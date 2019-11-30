package edu.citytech.stateandpop.jc;

import java.util.List;



public class _DriverStateAndPopulationDAO {
	
	/*
	 * Predicate = takes in one parameter and returns a boolean
	 * This and line 32 is the same thing as line 30
	 */
//	public static boolean top5(StateAndPopulation sp){
//		  
//		  if(sp.getRank() <= 5)
//		  
//		  return true;
//		  return false;
//		  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub		  return false;


		StateAndPopulationDAO dao = new StateAndPopulationDAO();

//			dao.FindAll().forEach(System.out::println);

		List<StateAndPopulation> list = dao.FindAll();
		
//		list.stream().filter(e -> e.getRank() <=10)

//		list.stream().filter(_DriverStateAndPopulationDAO::top5)
//		.forEach(System.out::println);
		
//		list.stream().filter(StatesRules::top5)
//		.forEach(System.out::println);
//		
//		System.out.println("     ");
//		
//		list.stream().filter(StatesRules::Warmstates)
//		.forEach(System.out::println);
		
//		list.stream().filter(StatesRules::Smallstates)
//		.forEach(System.out::println);
		
		list.stream().filter(StatesRules::BegWithVowels)
		.forEach(System.out::println);
		
		
//		list.stream().filter(StatesRules::isConstant)
//		.forEach(System.out::println);
		
	
	}
	
	
	

}
