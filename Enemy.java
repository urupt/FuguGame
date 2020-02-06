public class Enemy {
	String name; //declare the name
	int hp; //declare the HP
	final int LEVEL = 10;
	void attacked() {
		this.hp -= 10;
		System.out.println("勇者の攻撃！");
		System.out.println(this.name + " に 10 のダメージ!");
	}
	void run() {
		System.out.println(this.name + " は逃げ出した！");
	}
	void end() {
		System.out.println(this.name + " を倒した！");
	}
}
