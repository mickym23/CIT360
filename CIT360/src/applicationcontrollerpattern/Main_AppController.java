package applicationcontrollerpattern;
import java.util.Scanner;
public class Main_AppController {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter (Suits, TWD, Lost, or NCIS) for their reviews: ");
		AppController app = new AppController();
		app.dispatchReq(input.next());
		input.close();
	}

}
