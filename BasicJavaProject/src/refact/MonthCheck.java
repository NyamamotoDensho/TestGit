package refact;

public class MonthCheck {

	static int chkDays(int y, int m) {
		int d =1; // 日

		if(m == 1 || m==3 ||m==5 || m==7 || m==8 || m==10 || m==12) {
			// 31日の月か
			d= 31;
		} else if(m==2) {
			d = MonthCheck.leapyear(y);

		} else if(m==4 || m==6 || m==9 || m==11) {
			//30日の月か
			d=30;
		} else {
			System.out.println("該当する月がありません");
		}
		return d;
	}

	static int leapyear(int y) {
		int d;
		// 2月か,うるう年か
		if((y%4) == 0 && (y%100 !=0) || y%400 ==0) d=29;
			else d =28;
		return d;
	}

}
