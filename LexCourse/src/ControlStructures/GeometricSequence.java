package ControlStructures;

public class GeometricSequence {

	public static void main(String[] args) {
		
		int num = 8;
		int seqNo = 0;
		
		int i = 1;
		while( i <= num ) {
			if( i == 1 ) {
				seqNo = 1;
				System.out.print(seqNo + " ");
				i++;
				continue;
			}
			seqNo = seqNo * 2;
			System.out.print(seqNo + " ");
			i++;
		}

	}

}
