
public class PattanakanBranch extends Product100B {
	
	private int payUnit() {
		return super.getUnit() /2;
	}
	private int freeUnit() {
		return super.getUnit() - this.payUnit();
	}
	@Override
	public int getTotalPrice () {
		return this.payUnit() * 100;
	}
	@Override
	public String toString() {
		return "You buy "+ payUnit()+" units, get free "+freeUnit()+" units("+getTotalPrice()+")";
	}
}
