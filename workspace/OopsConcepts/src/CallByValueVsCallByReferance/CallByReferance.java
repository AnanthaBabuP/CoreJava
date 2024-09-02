package CallByValueVsCallByReferance;

public class CallByReferance {
	int a = 20;
	int change(CallByReferance b){
		++b.a;
		return b.a;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CallByReferance obj = new CallByReferance();
		int x = obj.change(obj);
		
		System.out.println("Check With befor a value: "+obj.a);
		System.out.println("Check With After x value: "+x);
	}

}
