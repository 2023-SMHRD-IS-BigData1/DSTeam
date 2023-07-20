package screen;

import java.util.ArrayList;
import java.util.Scanner;

import main.Sleep;

public class Store {

	Scanner sc = new Scanner(System.in);
	String VegitableShop;
	String fruitShop;
	String BucherShop;
	Sleep time = new Sleep();
	ArrayList<String> list = new ArrayList<String>();

	public int bs(int bs) {

		System.out.println(" 짱구야 뭘 사러 왔니? 물건은 한 번에 하나씩만 살 수 있단다~  ");
		time.sleep(2000);
		int cnt = 0;
		while (true) {
			System.out.println("===================================");
			System.out.println(" [1]소고기 [2]돼지고기 [3]닭고기 [4]양고기 ");
			System.out.println("===================================");
			System.out.print(">> ");
			int input = sc.nextInt();

			if (input == 1) {
				cnt = 1;
				System.out.println("잘 가렴~");
				break;
			} else if (input == 2) {
				cnt = 2;
				System.out.println("잘 가렴~");
				break;
			} else if (input == 3) {
				cnt = 3;
				System.out.println("잘 가렴~");
				break;
			} else if (input == 4) {
				cnt = 4;
				System.out.println("잘 가렴~");
				break;
			} else
				System.out.println("어머~ 그런 물건은 없단다. 다시 골라보겠니?");
		}
		return cnt;
	}


	public int vs(int vs) {

		System.out.println("    짱구야 뭘 사러 왔니? 물건은 한 번에 하나씩만 살 수 있단다~    ");
		time.sleep(2000);
		int cnt = 0;
		while (true) {
			System.out.println("===============================");
			System.out.println(" [1]당근 [2]양배추 [3]피망 [4]버섯 ");
			System.out.println("===============================");
			System.out.print(">> ");
			int input = sc.nextInt();

			if (input == 1) {
				cnt = 1;
				System.out.println("잘 가렴~");
				break;
			} else if (input == 2) {
				cnt = 2;
				System.out.println("잘 가렴~");
				break;
			} else if (input == 3) {
				cnt = 3;
				System.out.println("잘 가렴~");
				break;
			} else if (input == 4) {
				cnt = 4;
				System.out.println("잘 가렴~");
				break;
			} else
				System.out.println("어머~ 그런 물건은 없단다. 다시 골라보겠니?");
		}
		return cnt;
	}
	
	public int fs(int fs) {

		System.out.println("    짱구야 뭘 사러 왔니? 물건은 한 번에 하나씩만 살 수 있단다~    ");
		time.sleep(2000);
		int cnt = 0;
		while (true) {
			System.out.println("===============================");
			System.out.println(" [1]사과 [2]귤 [3]바나나 [4]수박 ");
			System.out.println("===============================");
			System.out.print(">> ");
			int input = sc.nextInt();

			if (input == 1) {
				cnt = 1;
				System.out.println("잘 가렴~");
				break;
			} else if (input == 2) {
				cnt = 2;
				System.out.println("잘 가렴~");
				break;
			} else if (input == 3) {
				cnt = 3;
				System.out.println("잘 가렴~");
				break;
			} else if (input == 4) {
				cnt = 4;
				System.out.println("잘 가렴~");
				break;
			} else
				System.out.println("어머~ 그런 물건은 없단다. 다시 골라보겠니?");
		}
		return cnt;
	
	
	
	
	}
//	// 야채가게 함수 호출
//			int cnt = store.vs(0);
//			
//			// 인벤토리에 야채 담기
//			if(cnt == 1) {
//				list.add("당근");
//			}else if(cnt == 2) {
//				list.add("양배추");
//			}else if(cnt == 3) {
//				list.add("피망");
//			}else if(cnt == 4) {
//				list.add("버섯");
//			}
//			
//			// 고기가게 함수 호출
//			cnt = store.bs(cnt);
//			// 인벤토리에 고기 담기
//			if(cnt == 1) {
//				list.add("소고기");
//			}else if(cnt == 2) {
//				list.add("돼지고기");
//			}else if(cnt == 3) {
//				list.add("닭고기");
//			}else if(cnt == 4) {
//				list.add("양고기");
//			}
//			
//			// 과일가게 함수 호출
//			cnt = store.fs(cnt);
//			
//			if(cnt == 1) {
//				list.add("사과");
//			}else if(cnt == 2) {
//				list.add("귤");
//			}else if(cnt == 3) {
//				list.add("바나나");
//			}else if(cnt == 4) {
//				list.add("수박");
//			}
//			
//			// ArrayList 인덱스 값 확인용
//			for(int i = 0; i < list.size(); i++) {
//				System.out.println(list.get(i));
//			}

	
	
	
	
}
