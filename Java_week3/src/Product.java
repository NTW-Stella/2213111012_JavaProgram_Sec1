
public class Product {
		private String id;
		private int unit;
		private double price;
		
		public void setId(String ID) {
			id = ID;
		}
		public String getId() {
			return id;
		}
		public void setUnit(int UNIT) {
			unit = UNIT;
		}
		public int getUnit() {
			return unit;
		}
		public void setPrice(double PRICE) {
			price = PRICE;
		}
		public double getPrice() {
			return price;
		}
		public double calculate() {
			double calculate = unit * price;
			return calculate;
		}
		public String checkStock(int getUnit) {
			if (unit < 5) {
				return "LOW";
			}else if (unit >=5 && unit <50) {
				return "NORMAL";
			}else {
				return "HIGH";
			}
		}	
	}
