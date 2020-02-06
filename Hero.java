public class Hero {
	String name; //declare the name
	int hp; //declare the HP
	
	void sleep() {
		this.hp = 45;
		System.out.println(this.name + " は眠った！");
		System.out.println(this.name + " は回復した");
	}
	void sit(int sec) {
		this.hp += sec;
		System.out.println(this.name + " は " + sec + "秒座った！");
		System.out.println(this.name + "のHPが" + sec + " 回復した");
	}
	void slip() {
		this.hp -= 5;
		System.out.println(this.name + " 転んだ！");
		System.out.println("5 のダメージ！");
	}
	void attacked() {
		this.hp -= 15;
		System.out.println(this.name + " は攻撃された！");
		System.out.println("15 のダメージ!");
	}
	void next() {
		System.out.println(this.name + " は戦いに勝利した");
		System.out.println("次へ進む");
	}
	void run() {
		System.out.println(this.name + " は逃げ出した！");
		System.out.println("---------------------------------------------");
		System.out.println("GAMEOVER");
		System.out.println("最終HPは " + this.hp + " でした");
	}
	void end() {
		System.out.println(this.name + " は倒れた！");
		System.out.println("---------------------------------------------");
		System.out.println("GAMEOVER");
		System.out.println("最終HPは " + this.hp + " でした");
	}
	void comp() {
		System.out.println("こうして世界の平和は守られたのであった");
		System.out.println("王様「よくやってくれた、 " + this.name + " よ」");
		System.out.println("おじいさん「さすがワシの孫じゃ」");
		System.out.println("ヒーローインタビューをどうぞ！");
		String intv = new java.util.Scanner(System.in).nextLine();
		System.out.println("---------------------------------------------");
		System.out.println(this.name + "「" + intv + "」");
		System.out.println("---------------------------------------------");
		System.out.println("Fin.");
		System.out.println("最終HPは " + this.hp + " でした");
	}
}
