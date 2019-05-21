import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map.Entry;

public class task {
	public static void main(String[] args) {
		String greeting = "Hello World";
		System.out.println(greeting);

//		int sum = 0;
//		for(int i = 0; i <= 10; i++) {
//			sum += i;
//		}

		List<Integer> i = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		int sum = i.stream()
		.mapToInt(x -> x)
		.sum();
		System.out.println(sum);

		LocalDateTime date = LocalDateTime.now();
		//参考サイト：https://qiita.com/kurukurupapa@github/items/f55395758eba03d749c9
		System.out.println(date.plusYears(3).getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.JAPANESE));

		judge(1);
		judge(0);

		ArrayList<String> color = new ArrayList<>();
		color.add("赤");
		color.add("青");
		color.add("黄");

		System.out.println(color);

		HashMap<Integer, String> student = new HashMap<>();
		student.put(1, "安藤");
		student.put(2, "井上");
		student.put(3, "上田");

		for(Entry<Integer, String> entry : student.entrySet()) {
			System.out.println(entry.getKey() + "," + entry.getValue());
//			System.out.println(entry.getValue());
		}

		WorkplaceCommnunication boss = new WorkplaceCommnunication();
		boss.workplaceJudgment(true);
		boss.response("友達");
	}

	public static void judge(int number) {
		if(number == 1) {
			System.out.println("真");
		}

		else if(number == 0) {
			System.out.println("偽");
		}
	}

}
