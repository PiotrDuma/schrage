
import java.io.*;
import java.io.File;
import java.util.*;

public class schragePodzial {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		Queue<object> structureN = new PriorityQueue<object>(new comparatorN());// zadania nieuszeregowane
		Queue<object> structureG = new PriorityQueue<object>(new comparatorG());// zadania gotowe do realizacji
		Queue<object> permut = new LinkedList<>(); // lista permutacji;
		int t = 0; // chwila czasowa
		int Cmax = 0; // czas trwania
		object e;
		object l = new object();

		File plik = new File("SCHRAGE4.DAT");
		Scanner input = new Scanner(plik);

		int length = input.nextInt();// wczytanie pierwszego elemetu;
//		System.out.println(length+"\n");

		while (input.hasNextInt() == true) {
			object buff = new object(input.nextInt(), input.nextInt(), input.nextInt());
			structureN.add(buff);
		}
		input.close();

		while (!structureN.isEmpty() || !structureG.isEmpty()) {
			while (!structureN.isEmpty() && structureN.element().objectGetR() <= t) {
				e = structureN.poll();
				structureG.add(e);
				if (e.objectGetQ() > l.objectGetQ()) {
					l.objectSetP(t - e.objectGetR());
					t = e.objectGetR();
					if (l.objectGetP() > 0) {
						structureG.add(l);
					}
				}

			}
			if (structureG.isEmpty()) {
				t = structureN.element().objectGetR();
			} else {
				e = structureG.poll();
				t += e.objectGetP();
				l = e;
				permut.add(e);

				Cmax = Math.max(Cmax, t + e.objectGetQ());
			}
		}
		System.out.println("Cmax =  " + Cmax);
		System.out.println("Permutacja:");
		while (!permut.isEmpty()) {
			permut.peek().objectShow();
			permut.poll();
		}
	}
}
