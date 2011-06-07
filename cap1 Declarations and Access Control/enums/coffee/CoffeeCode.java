package coffee;
enum CoffeeCode {
    A("A"),
    B("B"); // the semicolon is REQUIRED when more code follows

    // Constructor
    CoffeeCode(String code) {
	this.code = code;
    }

    private String code;
    
    public String getCode() {
	return code;
    }

}