
public class DemoInheritance implements OnAddListener{

	public static void main(String[] args) {
		new DemoInheritance().start();
		System.out.println("HANAGA");
		//add row 1 comment
		//add row 2 comment (local)
		//add row 3 on local
	}
	
	private void start() {
		MyMath math = new MyMath(this);
		//math.add(1, 2);
//		try {
//			Thread.sleep(3000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		math.add(0, 2);
	}

	public void onSuccess(int result) {
		System.out.println(result);
	}

	public void onFailure() {
		System.out.println("Somethings error");		
	}
}

interface OnAddListener{
	void onSuccess(int result);
	void onFailure();
}

class MyMath{
	private OnAddListener onAddListener;
	public MyMath(OnAddListener onAddListener) {
		this.onAddListener = onAddListener;
	}
	public void add(int a, int b) {
		if(a==0)
			this.onAddListener.onFailure();
		else
			this.onAddListener.onSuccess(a+b);
	}

}

