package stack_05;

public class Bracket_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OptExp opt = new OptExp();
		String exp = "(3*5)-(6/2)";
		
		System.out.println(exp);
		
		if(opt.testPair(exp)) {
			System.out.println("괄호 맞음!");
		}
		else {
			System.out.println("괄호 틀림!!");
		}

	}

}
