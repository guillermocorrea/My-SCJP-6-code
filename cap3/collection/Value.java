package collection;

public class Value {
    private String value;

    public Value() {}

    public Value(String value) {
	this.setValue(value);
    }

    public void setValue(String value) {
	this.value = value;
    }

    public String getValue() {
	return value;
    }
}