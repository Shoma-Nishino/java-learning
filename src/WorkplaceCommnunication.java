
public class WorkplaceCommnunication implements Communication {
	public void greet() {
		System.out.println("こんにちは");
	}

	@Override
	public void greet(String hello) {
		if(hello == "hello") {
			System.out.println("hello");
		}
	}

	@Override
	public void workplaceJudgment(boolean newWorkplace) {
		//trueのときだけ挨拶を返す
		if(workplace == newWorkplace){
			System.out.println("こんにちは");
		}
	}

	@Override
	public void response(String opponent) {
		try {
			if(opponent == "友達") {
				throw new myException("友達に挨拶は不要です");
			}
			System.out.println(opponent + "さんお疲れ様です");
		}

		catch(myException e) {
			System.err.println(e.getMessage());
		}
	}
}

interface Communication{
	 boolean workplace = true;

	public void greet(String hello);

	public void workplaceJudgment(boolean newWorkplace);

	public void response(String opponent);
}

class myException extends Exception{
	public myException(String message) {
		super(message);
	}
}
