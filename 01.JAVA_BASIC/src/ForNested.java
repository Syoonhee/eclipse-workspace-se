
public class ForNested {

	public static void main(String[] args) {
		/*
		 ★★★★★\n
		 ★★★★★\n
		 ★★★★★\n
		 ★★★★★\n
		 ★★★★★\n
		 */
		/*
		int i=0;
		while(i<5) {
			
			int j=0;
			while(j<5) {
				System.out.print("★");
				j++;
			}
			System.out.print("\n");
			
			i++;
		}
		*/
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				System.out.printf("%s[%d,%d]","★",i,j);
			} 
			System.out.print("\n");
		}
		

	}

}
