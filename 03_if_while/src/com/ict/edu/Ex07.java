package com.ict.edu;

public class Ex07 {
	public static void main(String[] args) {
		// while �� :  for ���� ���� �ݺ���
		// ����1 : 
		//		�ʱ��
		//		while(���ǽ�){
		//			���ǽ��� ���϶� ���� ;
		//		   ������;
		// 		}
		// 	 while�� ���� ������ ������ ���ǽ����� ����
		
		// ����2 :
		//		�ʱ��
		//		while(true){
		//			if(�������� ����) break;
		//			���ǽ��� ���϶� ���� ;
		//		   ������;
		// 		}
		// 	 while�� ���� ������ ������ ���ǽ����� ����

		// 0-10 ���� ���
		for (int i = 0; i < 11; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		int k1 = 0 ;
		while (k1 < 11) {
			System.out.print(k1 + " ");
			k1++;
		}
		System.out.println();
		
		int k2 = 0 ;
		while (true) {
			if (k2 >= 11) break;
			System.out.print(k2 + " ");
			k2++;
		}
		System.out.println();
	
		// 0 - 10 ���� ¦���� ���
		 int k3 = 0 ;		
		 while ( k3 < 11) {
			 if (k3 % 2 == 0) {
					System.out.print(k3 + " ");
				}		
			k3++ ;
		}
		
		 System.out.println(); 
		
		// 0 - 10 ���� Ȧ���� ���
		 int k4 = 0 ;
		 while (k4 < 11) {
			 if (k4 % 2 == 1) {
					System.out.print(k4 + " ");
				}		
			 k4++;
		}				
		
		// 0 - 50 ���� 7�� ��� ���
		int k5 = 0;
		while (k5 < 51) {
			if (k5 % 7 ==0) {
				System.out.print(k5 + " ");
			}
			k5++;
		}
		
		System.out.println();
		
		// a - g ���� ���
		char k6 = 'a';
		while (k6 < 'h') {
			System.out.print(k6 + " ");
			k6++;
		}
		
		System.out.println(); 
		
		// 5�� ���
		int k7 = 1 ;
		while (k7 < 10) {
			System.out.println("5 *" + k7 + "=" + (5*k7));
			k7++;
		}
				
		System.out.println(); 
		
		// 0 0 0 0
		// 0 0 0 0
		// 0 0 0 0
		// 0 0 0 0
		 int k8 = 1 ;
		 while (k8 < 5) {
			System.out.println("0 0 0 0");
			k8++;		
		}
		 System.out.println();
		 
		 int k9 = 1 ;
		 while (k9 < 17) {
			System.out.print("0 ");
			if (k9 % 4 == 0) {
				System.out.println();
			}
			k9++;		
		}
		 
		 //����
		 // Ex05�� �ִ� ������ Ȧ���հ� ¦���հ� �� ����
		 
		
	}
}