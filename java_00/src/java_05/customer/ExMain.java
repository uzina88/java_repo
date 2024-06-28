package java_05.customer;

public class ExMain {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 일반 고객
		Customer customerLee = new Customer();
		customerLee.setCustomerId("mem_lee");
		customerLee.setCustomerName("lee");
		
		System.out.println(customerLee.customerInfo());
		System.out.println(customerLee.calcRatio(10000));
		
		
		// VIP 고객
		VIPCustomer customerKim = new VIPCustomer();
		customerKim.setCustomerId("mem_kim");
		customerKim.setCustomerName("kim");
		
		System.out.println(customerKim.customerInfo());
		
		// VIP 고객
		// 부모 클래스 - 생성명 = 인스턴스 생성 : new 현재 클래스
		// 하위 클래스는 부모 클래스로 생성이 가능하다.
		Customer customerPark = new VIPCustomer();
		customerPark.setCustomerId("mem_park");
		customerPark.setCustomerName("park");
		
		System.out.println(customerPark.customerInfo());
	}
	
}
