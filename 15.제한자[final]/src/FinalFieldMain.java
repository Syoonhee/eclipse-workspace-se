
public class FinalFieldMain {

	public static void main(String[] args) {
		FinalField ff1 = new FinalField();
		//한 번 상수는 영원한 상수
		/* <<The final field FinalField.INCENTIVE_RATE cannot be assigned>>
		 * ff1.INCENTIVE_RATE = 0.5;
		 * ff1.PORT_NUMBER = 8000;
		 */
		
		/* <<The final field FinalField.EAST cannot be assigned>>
		FinalField.EAST = 90;
		FinalField.WEST = 90;
		*/
		
		ff1.move(FinalField.NOTRH);
		ff1.move(FinalField.NOTRH);
		ff1.move(FinalField.SOUTH);
		ff1.move(FinalField.EAST);
		ff1.move(FinalField.WEST);
	}

}
