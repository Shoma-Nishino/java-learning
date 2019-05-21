public class HelloWorld {
	public static void main(String[] args) {
		count(10);
	}
	
	public static void count(int num) {
		for(int i = 0; i < num; i++) {
			if(i == 5) {
				//5回目はスキップする
				continue;
				
				//breakにすると4回目で処理が終了する
			}
			System.out.println(i);
		}
	}
}
