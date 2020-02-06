public class Boss {
	String name; //declare the name
	int hp; //declare the HP
	void attacked() {
		this.hp -= 10;
		System.out.println("勇者の攻撃！");
		System.out.println(this.name + " に 10 のダメージ!");
	}
	void end() {
		System.out.println(this.name + " を倒した！");
		System.out.println("フグ「ぐぬぬ...」");
		System.out.println("フグ「まさかこの私が破れるとは....」");
		System.out.println("フグ「悔しいが、この世界を侵略するのはひとまず諦めてやろう」");
		System.out.println("フグ「ふん！いつかは私が必ずやこの世界の覇者となるのだ！！」");
		System.out.println("---------------------------------------------");
	}
}
