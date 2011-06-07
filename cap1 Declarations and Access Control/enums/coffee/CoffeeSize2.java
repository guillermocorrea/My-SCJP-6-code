package coffee;
enum CoffeeSize2 {
    BIG(8, CoffeeCode.A),
    HUGE(10),
    OVERWHELMING(16) { 
	// start a code block that defines the "body" for this constant
	public String getLidCode() { // override the method defined in CoffeeSize
	    return "A";
	}
    }; // the semicolon is REQUIRED when more code follows

    // Constructor
    CoffeeSize2(int ounces) {
	this.ounces = ounces;
    }

    CoffeeSize2(int ounces, CoffeeCode cc) {
	this.ounces = ounces;
	this.coffeeCode = cc;
    }

    private CoffeeCode coffeeCode;

    public CoffeeCode getCoffeeCode() {
	return coffeeCode;
    }

    private int ounces;
    
    public int getOunces() {
	return ounces;
    }

    public String getLidCode() { // this method is overridden by the OVERWHELMING constant
	return "B"; // the default value we want to return for CoffeeSize constants
    }
}