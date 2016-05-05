package forLoopExamples;

public class NestedForLoopWithBreakExamples {

	public static void main(String[] args) {

		//Prints the multiplication table.
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.print(i * j + "\t");
			}
			System.out.println();
		}

		System.out.println();


		for (int i = 1; i <= 10; i++) {
			//A break with the labe 'lbl' within this loop (or within the nested loop within it) will
			//terminate this loop that is labelled with 'lbl' and the loops nested within it.
			lbl:for (int j = 1; j <= 10; j++) {
				//If j=5, breaks the nested loop (with the label 'lbl') and continues to the next iteration of the PARENT loop.
				if (j == 5) {
					break lbl;
				}

				System.out.print(i * j + "\t");
			}

		System.out.println();
		}

		System.out.println();

		lbl:for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				//If j=5, breaks the PARENT loop (with the label 'lbl') as well as the nested loop.
				if (j == 5) {
					break lbl;
				}

				System.out.print(i * j + "\t");
			}

			System.out.println();
		}

	}
}
