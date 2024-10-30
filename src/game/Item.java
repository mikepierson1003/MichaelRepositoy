package game;

public class Item {

		private String name; // Item's name
		private String desc; // Description of the item
		
		public Item(String n, String d) {
			name = n;
			desc = d;
		}
		
		public String getName(String n) {
			return name;
		}
		
		public String getDesc(String d) {
			return desc;
		}
		
}
