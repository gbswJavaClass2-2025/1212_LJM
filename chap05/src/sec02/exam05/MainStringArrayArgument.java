package sec02.exam05;

public class MainStringArrayArgument {

	public static void main(String[] args) {
		if(args.length < 2) {
			System.out.println("값의 수가 부족합니다.");
			System.exit(0);
		}
		if(args.length == 2) {
			String strNum1 = args[0];
			String strNum2 = args[1];
			
			int num1 = Integer.parseInt(strNum1);
			int num2 = Integer.parseInt(strNum2);
			
			int result = num1 + num2;
			System.out.println(num1 + " + " + num2 + " = " + result);
		}
		else {
			int sum = 0;
			for(int i = 0; i <args.length; i++) {
				sum += Integer.parseInt(args[i]);
			}
			System.out.println("모든 수의 합 : "+sum);
		}
	}

}
