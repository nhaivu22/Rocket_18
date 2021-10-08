package fontend;

public class Qs1 {
	public static void main(String[] args) {
	try {
			float result=divide(7,0);
			System.out.println(result);
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("cannot divide 0");
		}finally {
			System.out.println("divide completed");
		}
	}

	private static float divide(int a, int b) {
		// TODO Auto-generated method stub
		
		return a/b;
	}

}
