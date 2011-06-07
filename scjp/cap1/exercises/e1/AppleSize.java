enum AppleSize{

    SMALL(5, new Apple()), MEDIUM(10), BIG(15){ 
	public Apple getApple() {
	    return null;
	}
    };

    private int diameter;
    private Apple apple;

    AppleSize(int diameter) {
	this.diameter = diameter;
    }

    AppleSize(int diameter, Apple apple) {
	this.diameter = diameter;
	this.apple = apple;
    }

    public int getDiameter() {
	return diameter;
    }

    public Apple getApple() {
	return apple;
    }
}