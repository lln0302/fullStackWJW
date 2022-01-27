package algorismProject2;
import java.util.*;

public class algorismProject2 {
	
	static Scanner stdIn = new Scanner(System.in);
	
	static class Data {
		
		public static final int NO = 1;
		public static final int NAME = 2;
		
		private Integer no;
		private String name;
		
		Integer keyCode() {
			return no;
		}
		
		public String toString() {
			return name;
		}
		
		void scanData(int sw) {
					
			if((sw&NO) == NO) {
				System.out.print("상품 번호 입력 : ");
				no = stdIn.nextInt();
			}
			
			if((sw&NAME) == NAME) {
				System.out.print("상품명 입력 : ");
				name = stdIn.next();
			}
		}
	}
	
	enum Menu{
		ADD("상품 등록"), REMOVE("상품 삭제"), SEARCH("상품 검색"),PRINT("전체 상품 조회"),TERMINATE("종료");
		
		private final String message;
		
		static Menu MenuAt(int idx) {
			for (Menu m: Menu.values())
				if(m.ordinal()+1==idx)
					return m;
			return null;
		}
		
		Menu(String string){
			message = string;
		}
		
		String getMessage() {
			return message;
		}
	}
	
	static Menu SelectMenu() {
		int key;
		do {
			for (Menu m: Menu.values()) {
				System.out.printf("(%d) %s ", m.ordinal()+1, m.getMessage());
			}
			System.out.println();
			System.out.print("메뉴 선택 : ");
			key = stdIn.nextInt();
			System.out.println();
		}while (key < Menu.ADD.ordinal() || key > Menu.TERMINATE.ordinal());
		
		return Menu.MenuAt(key);
	}
	
	public static void main(String[] args) {
		Menu menu;
		Data data;
		Data ptr;
		Data temp = new Data();
		BinTree<Integer, Data> tree = new BinTree<Integer, Data>();
		
		do {
			switch (menu = SelectMenu()) {
			case ADD:
				data = new Data();
				System.out.println("상품 등록");
				data.scanData(Data.NO | Data.NAME);
				tree.add(data.keyCode(), data);
				System.out.println();
				break;
				
			case REMOVE:
				System.out.println("상품 삭제");
				temp.scanData(Data.NO);
				tree.remove(temp.keyCode());
				System.out.println("상품 삭제 완료\n");
				break;
				
			case SEARCH:
				System.out.println("상품 검색");
				temp.scanData(Data.NO);
				ptr = tree.search(temp.keyCode());
				if(ptr != null)
					System.out.println("상품명 : "+ptr+"\n");
				else
					System.out.println("등록된 상품이 없습니다.\n");
				break;
				
			case PRINT:
				tree.print();
				System.out.println();
				break;
			}
		}while (menu!=Menu.TERMINATE);    
	}
	
}

