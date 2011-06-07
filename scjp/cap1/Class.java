class Identifiersf {
	int a = 1;
	int _a = 2;
	int $a = 3;
	int $ = 4;
	int a5 = 5;

	public void print() {
		System.out.println(a);
		System.out.println(_a);
		System.out.println($a);
		System.out.println($);
		System.out.println(a5);
	}

	public void loop() {
		int i = 0;
		int j = 1;
		for (int x = 0; x < 10; i++, j++) {
			System.out.println("i: " + i + " j: " + j);
			x += 5;
		}
	}


	public static void main(String[] args) {
		System.out.println("Hello Identifiers");
		Identifiers i = new Identifiers();
		i.print();
		i.loop();
	}
}