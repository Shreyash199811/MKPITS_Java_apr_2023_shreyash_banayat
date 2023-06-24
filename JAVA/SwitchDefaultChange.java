class SwitchDefaultChange{					//float and Double cannot be used for case 
								//to use float and double you have to type-cast
	public static void main(String[] args){			
		float anyFloatValue=3.0;
		System.out.println("3==>case1"+
		"3.0==>case2"+
		"3.00==>case3"+
		"3.000==>case4"+
		"3.0000==>case5"+
		"3.00000==>case6");
		
	switch(anyFloatValue){
		
		
		case 3:System.out.println("3.0");
		break;

		default:System.out.println("3");
		break;
		
		case 3.0f:System.out.println("case 2 is invocated");
		break;
		
		case 3.00f:System.out.println("3.00");
		break;
		
		case 3.000f:System.out.println("3.000");
		break;
		
		case 3.0000f:System.out.println("3.0000");
		break;
		
		case 3.00000f:System.out.println("3.00000");
		break;
	}
	}
}
