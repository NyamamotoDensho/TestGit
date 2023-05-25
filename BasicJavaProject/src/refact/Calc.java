package refact;

public class Calc {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int y = 2023; //西暦年
		int m = 1; // 月
		int d = MonthCheck.chkDays(y, m);


		System.out.println("その月の日数は" + d + "です");

	}

}
