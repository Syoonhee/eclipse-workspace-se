import java.util.HashMap;

public class HashMapMain {

	public static void main(String[] args) {
		HashMap carMap =new HashMap();
		System.out.println("map size:" + carMap.size());
		System.out.println("-----------1.put------------------");
		Car c1 = new Car("1111", 12);
		carMap.put("1111", c1);
		carMap.put("2222", new Car("2222",13));
		carMap.put("3333", new Car("3333",15));
		carMap.put("4444", new Car("4444",17));
		carMap.put("5555", new Car("5555",20));
		System.out.println("map size:"+carMap.size());
		System.out.println(carMap);
		/*
		 * 동일한 (equals) 키 값은 존재하지 않음
		 * 키 객체가 동일하면(equals) 값 객체가 바뀐다
		 */
		
		carMap.put(new String ("3333"), new Car("삼삼삼", 23)); //
		System.out.println("map size:" + carMap.size());
		System.out.println(carMap);
		System.out.println("----------2.get---------------");
		Car getCar = (Car) carMap.get("3333"); //get은 Object로 반환
		getCar.print();
		System.out.println("------------3.remove-----------");
		Car removeCar = (Car) carMap.remove("3333");
		removeCar.print();
		System.out.println("map size:" + carMap.size());
		
		
		
		
		
		
	}

}
