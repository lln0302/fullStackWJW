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
				System.out.print("��ǰ ��ȣ �Է� : ");
				no = stdIn.nextInt();
			}
			
			if((sw&NAME) == NAME) {
				System.out.print("��ǰ�� �Է� : ");
				name = stdIn.next();
			}
		}
	}
	
	enum Menu{
		ADD("��ǰ ���"), REMOVE("��ǰ ����"), SEARCH("��ǰ �˻�"),PRINT("��ü ��ǰ ��ȸ"),TERMINATE("����");
		
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
			System.out.print("�޴� ���� : ");
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
				System.out.println("��ǰ ���");
				data.scanData(Data.NO | Data.NAME);
				tree.add(data.keyCode(), data);
				System.out.println();
				break;
				
			case REMOVE:
				System.out.println("��ǰ ����");
				temp.scanData(Data.NO);
				tree.remove(temp.keyCode());
				System.out.println("��ǰ ���� �Ϸ�\n");
				break;
				
			case SEARCH:
				System.out.println("��ǰ �˻�");
				temp.scanData(Data.NO);
				ptr = tree.search(temp.keyCode());
				if(ptr != null)
					System.out.println("��ǰ�� : "+ptr+"\n");
				else
					System.out.println("��ϵ� ��ǰ�� �����ϴ�.\n");
				break;
				
			case PRINT:
				tree.print();
				System.out.println();
				break;
			}
		}while (menu!=Menu.TERMINATE);    
	}
	
}

