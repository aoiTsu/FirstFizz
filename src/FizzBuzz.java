
public class FizzBuzz {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int num = 1;
		
		while (num <= 100) {
			String res = "";
			if ((num % 3 == 0) && (num % 5 == 0)) {
				res = "FizzBuzz";
			} else if (num % 3 == 0) {
				res = "Fizz";
			} else if (num % 5 == 0) {
				res = "Buzz";
			}
			System.out.println(num + " " + res);
			num++;
		}
		
		
	}

}
