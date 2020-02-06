public class FuguGame{
	public static void main(String[] args) {
		System.out.println("---------------------------------------------");
		System.out.println("RPG:FuguGame");
		System.out.println("Ver.1.0 by Ayano Igarashi & Kirika Ishikawa");
		System.out.println("---------------------------------------------");
		
		System.out.println("名前を入力してください");
		String name = new java.util.Scanner(System.in).nextLine();
		System.out.println("ようこそ、 " + name + " ！");
		
		System.out.println("---------------------------------------------");
		System.out.println("始めるには\"1\"を押してください");
		int selected = new java.util.Scanner(System.in).nextInt();
		switch(selected) {
			case 1:
				//Generate the hero
				Hero h = new Hero();
				//Set the default value in the field
				h.name = name;
				h.hp = 45;
				System.out.println("---------------------------------------------");
				System.out.println("勇者 " + name + " を生成しました！");
				System.out.println("ここから " + name + " の冒険が幕を開ける。");
				System.out.println("---------------------------------------------");
				System.out.println("おじいさん「 " + name +" ！！！」");
				System.out.println("おじいさん「何時間ワシを待たせたつもりじゃ！」");
				System.out.println("---------------------------------------------");
				System.out.println("1か0を選んでください。");
				System.out.println("1:「えっ？なんの話？」");
				System.out.println("0:「ごめんなさい」");
				int talk = new java.util.Scanner(System.in).nextInt();
				if (talk == 1) {
					System.out.println("---------------------------------------------");
					System.out.println(name + "「えっ？なんの話？」");
					System.out.println("おじいさん「とぼけるんじゃない！」");
					System.out.println("おじいさん「お前はこれから旅に出るのじゃ！」");
					System.out.println("おじいさん「とにかく早く支度をせい！王様が待っておられるのじゃ！」");
					System.out.println("おじいさん「あっ待て待て、お前にこれを託すのを忘れておった。」");
					System.out.println(name + "「...これは...？」");
					System.out.println("おじいさん「これは、伝説の剣じゃ。」");
					System.out.println("おじいさん「この剣さえあればお前はきっと大丈夫じゃ。」");
					System.out.println("おじいさん「健闘を祈っておるぞ。」");
				}else
				if (talk == 0) {
					System.out.println("---------------------------------------------");
					System.out.println(name + "「ごめんなさい」");
					System.out.println("おじいさん「まったく、一刻を争う大変な事態が起こっとるというのに！」");
					System.out.println("おじいさん「お前はこれから旅に出るのじゃ！」");
					System.out.println("おじいさん「とにかく早く支度をせい！王様が待っておられるのじゃ！」");
					System.out.println("おじいさん「あっ待て待て、お前にこれを託すのを忘れておった。」");
					System.out.println(name + "「...これは...？」");
					System.out.println("おじいさん「これは、伝説の剣じゃ。」");
					System.out.println("おじいさん「この剣さえあればお前はきっと大丈夫じゃ。」");
					System.out.println("おじいさん「健闘を祈っておるぞ。」");
				}else {
					System.out.println("---------------------------------------------");
					System.out.println("おじいさん「押したキーが間違っておったぞ！」");
					System.out.println("おじいさん「黙ってないでなんか言うんじゃ！」");
					System.out.println("なんか言ってください。");
					String nanka = new java.util.Scanner(System.in).nextLine();
					System.out.println("おじいさん「...『" + nanka + "』...じゃと...？」");
					System.out.println("おじいさん「ええい、お前の言い訳なんかにかまってる場合じゃないのじゃ！！」");
					System.out.println("おじいさん「お前はこれから旅に出るのじゃ！」");
					System.out.println("おじいさん「とにかく早く支度をせい！王様が待っておられるのじゃ！」");
					System.out.println("おじいさん「あっ待て待て、お前にこれを託すのを忘れておった。」");
					System.out.println(name + "「...これは...？」");
					System.out.println("おじいさん「これは、伝説の剣じゃ。」");
					System.out.println("おじいさん「この剣さえあればお前はきっと大丈夫じゃ。」");
					System.out.println("おじいさん「健闘を祈っておるぞ。」");
				}
				System.out.println("---------------------------------------------");
				System.out.println(name + " は城に到着した！");
				System.out.println("王様「勇者よ」");
				System.out.println("王様「この世界はフグに侵略されておる」");
				System.out.println("王様「フグを倒してくれ」");
				System.out.println("---------------------------------------------");
				System.out.println(name + " はそこらへんの港に向かった！");
				System.out.println(name + "(いきなりフグを倒せって言われても...)");
				System.out.println("1か0を選んでください。");
				System.out.println("1:「悩んでいても仕方がない。よし、行くぞ！」");
				System.out.println("0:「だるいしねむいしちょっと休んでから行こうかな〜」");
				int talk2 = new java.util.Scanner(System.in).nextInt();
				if (talk2 == 1) {
					System.out.println(name + "「悩んでいても仕方がない。よし、行くぞ！」");
					System.out.println("？？？「ふふふ。もう準備はできたかしら？」");
					System.out.println(name + "「えっ？」");
					System.out.println("カメ「私よ！あんたの足元にいるカメ！」");
					System.out.println("カメ「あんた勇者でしょ？よかったら海の中案内してあげるけど？」");
					System.out.println(name + " はカメの背中に乗って海の中へと出発した！");
				}else
				if (talk2 == 0) {
					System.out.println(name + "「だるいしねむいしちょっと休んでから行こうかな〜」");
					System.out.println("？？？「何言ってんのよ、あんた勇者でしょ？」");
					System.out.println(name + "「えっ？」");
					System.out.println("カメ「私よ！あんたの足元にいるカメ！」");
					System.out.println("カメ「よかったら海の中案内してあげるけど？」");
					System.out.println(name + "「いや、ちょっと休んでから..」");
					System.out.println("カメ「うるせえ、勇者に休んでる暇なんてないのよ！早く乗んなさい！」");
					System.out.println(name + " (なんてこった)");
					System.out.println(name + " はカメの背中に乗って海の中へと出発した！");
				}else {
					System.out.println(name + "「ていうか世界がフグに侵略されるってどんな状況だよwww」");
					System.out.println("？？？「それな〜www」");
					System.out.println(name + "「えっ？」");
					System.out.println("カメ「私よ！あんたの足元にいるカメ！」");
					System.out.println("カメ「よかったら海の中案内してあげるけど？」");
					System.out.println(name + "「いや、そういう気分じゃないんで」");
					System.out.println("カメ「まじ卍なんだけど。まあとりあえずあんた勇者らしいし強制的に連行するけど。」");
					System.out.println(name + "「ええ〜」");
					System.out.println(name + " はカメの背中に乗って海の中へと出発した！");
				}
				System.out.println("---------------------------------------------");
				System.out.println(name + "「はあ〜やっと着いた」");
				System.out.println("カメ「頑張りなさいよ、勇者。」");
				System.out.println(name + "「ところで、どうして勇者だとわかったの？」");
				System.out.println("カメ「え？知らないの？？あんたの持ってるその剣が過去に世界を救ったのよ？？」");
				System.out.println(name + "「どういうこと？」");
				System.out.println("カメ「あんたのおじいさんは昔この世界を救った伝説の勇者なのよ！」");
				System.out.println(name + "「おじいさんが..伝説の勇者？！？！」");
				
				//Generate the enemy
				Enemy e1 = new Enemy();
				e1.hp = 10;
				e1.name = "ヒョウモンダコ";
				
				Enemy e2 = new Enemy();
				e2.hp = 20;
				e2.name = "スベスベマンジュウガニ";
				
				//Stage 1
				System.out.println("---------------------------------------------");
				System.out.println("ステータス: " + name + "(HP: " + h.hp + " 攻撃力: 10)");
				System.out.println(e1.name + "(HP: " + e1.hp + " 攻撃力: 15) があらわれた！");
				System.out.println(e1.name + " に関する次の問題に答えよ。");
				System.out.println("テトロドトキシンはフグ毒として有名である。");
				System.out.println("正しければ１、誤りであれば０を選択してください。");
				int i;
				for (i = 0; i < 3; i++) {
					int ans = new java.util.Scanner(System.in).nextInt();
					if (ans == 1) {
						System.out.println("正解です！");
						System.out.println("解説：フグ毒といえばテトロドトキシンですね！！でもテトロドトキシンを持たないフグもいるんですよ");
						System.out.println("---------------------------------------------");
						e1.attacked();
						break;
					}else 
					if (ans == 0){
							System.out.println("残念、不正解です");
							System.out.println("解説：フグ毒といえばテトロドトキシンですね！！でもテトロドトキシンを持たないフグもいるんですよ");
							System.out.println("---------------------------------------------");
							h.attacked();
							break;
					}else {
						System.out.println("もう一度選択してください。");
						System.out.println("正しければ１、誤りであれば０を選択してください。");
					}
				
				}	if (e1.hp == 0) {
							e1.end();
							h.next();
						}else {
							
							System.out.println("---------------------------------------------");
							System.out.println("ステータス: " + name + "(HP: " + h.hp + " 攻撃力: 10)");
							System.out.println(e1.name + "(HP: " + e1.hp + " 攻撃力: 15)");
							System.out.println(e1.name + " に関する次の問題に答えよ。");
							System.out.println("フグは自分で毒を作れる。");
							System.out.println("正しければ１、誤りであれば０を選択してください。");
							int ii;
							for (ii = 0; ii < 3; ii++) {
								int ans = new java.util.Scanner(System.in).nextInt();
								if (ans == 0) {
									System.out.println("正解です！");
									System.out.println("解説：フグは自分で毒を作ることはできません。海洋細菌がテトロドトキシンを作り、生き物を経由してフグの体の中に取り込まれます");
									System.out.println("---------------------------------------------");
									e1.attacked();
									break;
								}else 
								if (ans == 1){
									System.out.println("残念、不正解です。");
									System.out.println("解説：フグは自分で毒を作ることはできません。海洋細菌がテトロドトキシンを作り、生き物を経由してフグの体の中に取り込まれます");
									System.out.println("---------------------------------------------");
									h.attacked();
									break;
								}else {
									System.out.println("もう一度選択してください。");
									System.out.println("正しければ１、誤りであれば０を選択してください。");
								}
							}		if (e1.hp == 0) {
										e1.end();
										h.next();
									}else {
								
										System.out.println("---------------------------------------------");
										System.out.println("ステータス: " + name + "(HP: " + h.hp + " 攻撃力: 10)");
										System.out.println(e1.name + "(HP: " + e1.hp + " 攻撃力: 15)");
										System.out.println(e1.name + " に関する次の問題に答えよ。");
										System.out.println("フグ毒は神経毒である。");
										System.out.println("正しければ１、誤りであれば０を選択してください。");
										int iii;
										for (iii = 0; iii < 3; iii++) {
											int ans = new java.util.Scanner(System.in).nextInt();
											if (ans == 1) {
												System.out.println("正解です！");
												System.out.println("解説：フグ毒は神経毒です。誤って取り込んでしまうと痺れが起こり呼吸困難により死にます");
												System.out.println("---------------------------------------------");
												e1.attacked();
												break;
											}else 
											if (ans == 0){
												System.out.println("残念、不正解です。");
												System.out.println("解説：フグ毒は神経毒です。誤って取り込んでしまうと痺れが起こり呼吸困難により死にます");
												System.out.println("---------------------------------------------");
												h.attacked();
												break;
											}else {
												System.out.println("もう一度選択してください。");
												System.out.println("正しければ１、誤りであれば０を選択してください。");
											}
										}		if (e1.hp == 0) {
													e1.end();
													h.next();
												}else {
													h.end();
													break;
												}
									}
						}
					//Stage 2
					System.out.println("---------------------------------------------");
					System.out.println("ステータス: " + name + "(HP: " + h.hp + " 攻撃力: 10)");
					System.out.println(e2.name + "(HP: " + e2.hp + " 攻撃力: 15) があらわれた！");
					System.out.println(e2.name + " に関する次の問題に答えよ。");
					System.out.println("テトロドトキシンはイモリ、カエルなどの生物にも見られる。");
					System.out.println("正しければ１、誤りであれば０を選択してください。");
					int j;
					for (j = 0; j < 3; j++) {
						int ans = new java.util.Scanner(System.in).nextInt();
						if (ans == 1) {
							System.out.println("正解です！");
							System.out.println("解説：テトロドトキシンはアカハライモリや Atelopus 属のカエルなども持っています");
							System.out.println("---------------------------------------------");
							e2.attacked();
							break;
						}else 
						if (ans == 0){
							System.out.println("残念、不正解です");
							System.out.println("解説：テトロドトキシンはアカハライモリや Atelopus 属のカエルなども持っています");
							System.out.println("---------------------------------------------");
							h.attacked();
							break;
						}else {
							System.out.println("もう一度選択してください。");
							System.out.println("正しければ１、誤りであれば０を選択してください。");
						}
					}		if (h.hp == 0) {
								h.end();
							}else
							if(e2.hp >= 10){
	
								System.out.println("---------------------------------------------");
								System.out.println("ステータス: " + name + "(HP: " + h.hp + " 攻撃力: 10)");
								System.out.println(e2.name + "(HP: " + e2.hp + " 攻撃力: 15)");
								System.out.println(e2.name + " に関する次の問題に答えよ。");
								System.out.println("テトロドトキシンの化学式は C11H17N3O8 である。");
								System.out.println("正しければ１、誤りであれば０を選択してください。");
								int jj;
								for (jj = 0; jj < 3; jj++) {
									int ans = new java.util.Scanner(System.in).nextInt();
									if (ans == 1) {
										System.out.println("正解です！");
										System.out.println("解説：１８８７年から構造の研究が始まり、１９７０年に最終的な構造が決定しました。");
										System.out.println("---------------------------------------------");
										e2.attacked();
										break;
									}else 
									if (ans == 0){
										System.out.println("残念、不正解です");
										System.out.println("解説：１８８７年から構造の研究が始まり、１９７０年に最終的な構造が決定しました。");
										System.out.println("---------------------------------------------");
										h.attacked();
										break;
									}else {
										System.out.println("もう一度選択してください。");
										System.out.println("正しければ１、誤りであれば０を選択してください。");
									}
								}		if (h.hp == 0) {
											h.end();
										}else
										if(e2.hp == 0) {
											e2.end();
										}else 
										if(e2.hp >= 10){
										
											System.out.println("---------------------------------------------");
											System.out.println("ステータス: " + name + "(HP: " + h.hp + " 攻撃力: 10)");
											System.out.println(e2.name + "(HP: " + e2.hp + " 攻撃力: 15)");
											System.out.println(e2.name + " に関する次の問題に答えよ。");
											System.out.println("テトロドトキシンの解毒剤は発見されていない。");
											System.out.println("正しければ１、誤りであれば０を選択してください。");
											int jjj;
											for (jjj = 0; jjj < 3; jjj++) {
												int ans = new java.util.Scanner(System.in).nextInt();
												if (ans == 1) {
													System.out.println("正解です！");
													System.out.println("解説：残念ながら有効な解毒剤は見つかっていません");
													System.out.println("---------------------------------------------");
													e2.attacked();
													break;
												}else 
												if (ans == 0){
													System.out.println("残念、不正解です。");
													System.out.println("解説：残念ながら有効な解毒剤は見つかっていません");
													System.out.println("---------------------------------------------");
													h.attacked();
													break;
												}else {
													System.out.println("もう一度選択してください。");
													System.out.println("正しければ１、誤りであれば０を選択してください。");
												}
											}		if (h.hp == 0) {
														h.end();
													}else
													if(e2.hp == 0) {
														e2.end();
													}else
													if(e2.hp >= 10) {
												
														System.out.println("---------------------------------------------");
														System.out.println("ステータス: " + name + "(HP: " + h.hp + " 攻撃力: 10)");
														System.out.println(e2.name + "(HP: " + e2.hp + " 攻撃力: 15)");
														System.out.println(e2.name + " に関する次の問題に答えよ。");
														System.out.println("テトロドトキシンは青酸カリよりも強い。");
														System.out.println("正しければ１、誤りであれば０を選択してください。");
														int jjjj;
														for (jjjj = 0; jjjj < 3; jjjj++) {
															int ans = new java.util.Scanner(System.in).nextInt();
															if (ans == 1) {
																System.out.println("正解です！");
																System.out.println("解説：テトロドトキシンの毒性は青酸カリの500〜1000倍とも言われています。ヒトの致死量は2〜3ミリリットルです");
																System.out.println("---------------------------------------------");
																e2.attacked();
																break;
															}else 
															if (ans == 0){
																System.out.println("残念、不正解です。");
																System.out.println("解説：テトロドトキシンの毒性は青酸カリの500〜1000倍とも言われています。ヒトの致死量は2〜3ミリリットルです");
																System.out.println("---------------------------------------------");
																h.attacked();
																break;
															}else {
																System.out.println("もう一度選択してください。");
																System.out.println("正しければ１、誤りであれば０を選択してください。");
															}
														}	if (h.hp == 0) {
																h.end();
															}else
															if(e2.hp == 0) {
																e2.end();
															}else
															if(e2.hp == 10) {	
															}
													}
												}
										}
						//Generate the enemy
						Boss b = new Boss();
						b.hp = 70;
						b.name = "トラフグ";					
											
						//Stage 3
						System.out.println("---------------------------------------------");
						System.out.println("ステータス: " + name + "(HP: " + h.hp + " 攻撃力: 10)");
						System.out.println(b.name + "(HP: " + b.hp + " 攻撃力: 15) があらわれた！");
						System.out.println("フグ「よく来たな勇者よ。」");
						System.out.println("フグ「ここがお前の墓場だ！！！」");
						System.out.println(b.name + " に関する次の問題に答えよ。");
						System.out.println("フグは縄文時代から親しまれている。");
						System.out.println("正しければ１、誤りであれば０を選択してください。");
						int k;
						for (k = 0; k < 3; k++) {
							int ans = new java.util.Scanner(System.in).nextInt();
							if (ans == 1) {
								System.out.println("正解です！");
								System.out.println("解説：貝塚からフグの骨が発見されています");
								System.out.println("---------------------------------------------");
								b.attacked();
								break;
							}else 
							if (ans == 0){
								System.out.println("残念、不正解です。");
								System.out.println("解説：貝塚からフグの骨が発見されています");
								System.out.println("---------------------------------------------");
								h.attacked();
								break;
							}else {
								System.out.println("もう一度選択してください。");
								System.out.println("正しければ１、誤りであれば０を選択してください。");
							}
						}		if (h.hp == 0) {
								h.end();
								}else
								if(b.hp >= 10) {	
									
									System.out.println("---------------------------------------------");
									System.out.println("ステータス: " + name + "(HP: " + h.hp + " 攻撃力: 10)");
									System.out.println(b.name + "(HP: " + b.hp + " 攻撃力: 15)");
									System.out.println(b.name + " に関する次の問題に答えよ。");
									System.out.println("フグの卵巣のぬか漬けが存在する。");
									System.out.println("正しければ１、誤りであれば０を選択してください。");
									int kk;
									for (kk = 0; kk < 3; kk++) {
										int ans = new java.util.Scanner(System.in).nextInt();
										if (ans == 1) {
											System.out.println("正解です！");
											System.out.println("解説：存在します。石川県の郷土料理のひとつで珍味で酒のつまみに最適だそうです");
											System.out.println("---------------------------------------------");
											b.attacked();
											break;
										}else 
										if (ans == 0){
											System.out.println("残念、不正解です。");
											System.out.println("解説：存在します。石川県の郷土料理のひとつで珍味で酒のつまみに最適だそうです");
											System.out.println("---------------------------------------------");
											h.attacked();
											break;
										}else {
											System.out.println("もう一度選択してください。");
											System.out.println("正しければ１、誤りであれば０を選択してください。");
										}
									}		if (h.hp == 0) {
												h.end();
											}else 
											if(b.hp >=10){
												
												System.out.println("---------------------------------------------");
												System.out.println("ステータス: " + name + "(HP: " + h.hp + " 攻撃力: 10)");
												System.out.println(b.name + "(HP: " + b.hp + " 攻撃力: 15)");
												System.out.println(b.name + " に関する次の問題に答えよ。");
												System.out.println("フグ毒患者への対処として有効なのは人工呼吸である。");
												System.out.println("正しければ１、誤りであれば０を選択してください。");
												int kkk;
												for (kkk = 0; kkk < 3; kkk++) {
													int ans = new java.util.Scanner(System.in).nextInt();
													if (ans == 1) {
														System.out.println("正解です！");
														System.out.println("解説：ほかにも胃洗浄などが有効とされています");
														System.out.println("---------------------------------------------");
														b.attacked();
														break;
													}else 
													if (ans == 0){
														System.out.println("残念、不正解です。");
														System.out.println("解説：ほかにも胃洗浄などが有効とされています");
														System.out.println("---------------------------------------------");
														h.attacked();
														break;
													}else {
														System.out.println("もう一度選択してください。");
														System.out.println("正しければ１、誤りであれば０を選択してください。");
													}
												}		if (h.hp == 0) {
															h.end();
														}else 
														if(b.hp >=10){
															
															System.out.println("---------------------------------------------");
															System.out.println("ステータス: " + name + "(HP: " + h.hp + " 攻撃力: 10)");
															System.out.println(b.name + "(HP: " + b.hp + " 攻撃力: 15)");
															System.out.println(b.name + " に関する次の問題に答えよ。");
															System.out.println("フグ毒による中毒症状は臨床的に３段階に分けられる。");
															System.out.println("正しければ１、誤りであれば０を選択してください。");
															int kkkk;
															for (kkkk = 0; kkkk < 3; kkkk++) {
																int ans = new java.util.Scanner(System.in).nextInt();
																if (ans == 0) {
																	System.out.println("正解です！");
																	System.out.println("解説：厚生労働省により４段階と規定されています");
																	System.out.println("---------------------------------------------");
																	b.attacked();
																	break;
																}else 
																if (ans == 1){
																	System.out.println("残念、不正解です。");
																	System.out.println("解説：厚生労働省により４段階と規定されています");
																	System.out.println("---------------------------------------------");
																	h.attacked();
																	break;
																}else {
																	System.out.println("もう一度選択してください。");
																	System.out.println("正しければ１、誤りであれば０を選択してください。");
																}
															}		if (h.hp == 0) {
																		h.end();
																	}else 
																	if(b.hp >=10){
																		
																		System.out.println("---------------------------------------------");
																		System.out.println("ステータス: " + name + "(HP: " + h.hp + " 攻撃力: 10)");
																		System.out.println(b.name + "(HP: " + b.hp + " 攻撃力: 15)");
																		System.out.println(b.name + " に関する次の問題に答えよ。");
																		System.out.println("テトロドトキシンはグアニジン基を持っている");
																		System.out.println("正しければ１、誤りであれば０を選択してください。");
																		int kkkkk;
																		for (kkkkk = 0; kkkkk < 3; kkkkk++) {
																			int ans = new java.util.Scanner(System.in).nextInt();
																			if (ans == 1) {
																				System.out.println("正解です！");
																				System.out.println("解説：このグアニジン基以外は大きくてチャネルを通り抜けることができません");
																				System.out.println("---------------------------------------------");
																				b.attacked();
																				break;
																			}else 
																			if (ans == 0){
																				System.out.println("残念、不正解です。");
																				System.out.println("解説：このグアニジン基以外は大きくてチャネルを通り抜けることができません");
																				System.out.println("---------------------------------------------");
																				h.attacked();
																				break;
																			}else {
																				System.out.println("もう一度選択してください。");
																				System.out.println("正しければ１、誤りであれば０を選択してください。");
																			}
																		}		if (h.hp == 0) {
																					h.end();
																				}else 
																				if(b.hp >=10){
																					System.out.println("---------------------------------------------");
																					System.out.println("ステータス: " + name + "(HP: " + h.hp + " 攻撃力: 10)");
																					System.out.println(b.name + "(HP: " + b.hp + " 攻撃力: 15)");
																					System.out.println(b.name + " に関する次の問題に答えよ。");
																					System.out.println("テトロドトキシンはビブリア属などの真正細菌によって作られる。");
																					System.out.println("正しければ１、誤りであれば０を選択してください。");
																					int l;
																					for (l = 0; l < 3; l++) {
																						int ans = new java.util.Scanner(System.in).nextInt();
																						if (ans == 1) {
																							System.out.println("正解です！");
																							System.out.println("解説：真正細菌によって作られたテトロドトキシンが食物連鎖の過程を経てフグに取り込まれます");
																							System.out.println("---------------------------------------------");
																							b.attacked();
																							break;
																						}else 
																						if (ans == 0){
																							System.out.println("残念、不正解です。");
																							System.out.println("解説：真正細菌によって作られたテトロドトキシンが食物連鎖の過程を経てフグに取り込まれます");
																							System.out.println("---------------------------------------------");
																							h.attacked();
																							break;
																						}else {
																							System.out.println("もう一度選択してください。");
																							System.out.println("正しければ１、誤りであれば０を選択してください。");
																						}
																					}		if (h.hp == 0) {
																								h.end();
																							}else 
																							if(b.hp >=10){
																								System.out.println("---------------------------------------------");
																								System.out.println("ステータス: " + name + "(HP: " + h.hp + " 攻撃力: 10)");
																								System.out.println(b.name + "(HP: " + b.hp + " 攻撃力: 15)");
																								System.out.println(b.name + " に関する次の問題に答えよ。");
																								System.out.println("テトロドトキシンはアルカロイド（窒素を含む塩基性化合物）ではない。");
																								System.out.println("正しければ１、誤りであれば０を選択してください。");
																								int ll;
																								for (ll = 0; ll < 3; ll++) {
																									int ans = new java.util.Scanner(System.in).nextInt();
																									if (ans == 0) {
																										System.out.println("正解です！");
																										System.out.println("解説：テトロドトキシンは窒素を含む塩基性化合物です");
																										System.out.println("---------------------------------------------");
																										b.attacked();
																										break;
																									}else 
																									if (ans == 1){
																										System.out.println("残念、不正解です。");
																										System.out.println("解説：テトロドトキシンは窒素を含む塩基性化合物です");
																										System.out.println("---------------------------------------------");
																										h.attacked();
																										break;
																									}else {
																										System.out.println("もう一度選択してください。");
																										System.out.println("正しければ１、誤りであれば０を選択してください。");
																									}
																								}		if (h.hp == 0) {
																											h.end();
																										}else
																										if(b.hp == 0) {
																											b.end();
																											h.comp();
																										}else 
																										if(b.hp >=10){
																											System.out.println("---------------------------------------------");
																											System.out.println("ステータス: " + name + "(HP: " + h.hp + " 攻撃力: 10)");
																											System.out.println(b.name + "(HP: " + b.hp + " 攻撃力: 15)");
																											System.out.println(b.name + " に関する次の問題に答えよ。");
																											System.out.println("テトロドトキシンは電位依存性ナトリウムチャネルを阻害する。");
																											System.out.println("正しければ１、誤りであれば０を選択してください。");
																											int lll;
																											for (lll = 0; lll < 3; lll++) {
																												int ans = new java.util.Scanner(System.in).nextInt();
																												if (ans == 1) {
																													System.out.println("正解です！");
																													System.out.println("解説：ナトリウムチャネルを阻害する特徴を活かして臨床に役立てる試みがなされています");
																													System.out.println("---------------------------------------------");
																													b.attacked();
																													break;
																												}else 
																												if (ans == 0){
																													System.out.println("残念、不正解です。");
																													System.out.println("解説：ナトリウムチャネルを阻害する特徴を活かして臨床に役立てる試みがなされています");
																													System.out.println("---------------------------------------------");
																													h.attacked();
																													break;
																												}else {
																													System.out.println("もう一度選択してください。");
																													System.out.println("正しければ１、誤りであれば０を選択してください。");
																												}
																											}		if (h.hp == 0) {
																														h.end();
																													}else
																													if(b.hp == 0) {
																														b.end();
																														h.comp();
																													}else 
																													if(b.hp >=10){
																														System.out.println("---------------------------------------------");
																														System.out.println("ステータス: " + name + "(HP: " + h.hp + " 攻撃力: 10)");
																														System.out.println(b.name + "(HP: " + b.hp + " 攻撃力: 15)");
																														System.out.println(b.name + " に関する次の問題に答えよ。");
																														System.out.println("フグ鍋はおいしいものである。");
																														System.out.println("正しければ１、誤りであれば０を選択してください。");
																														int llll;
																														for (llll = 0; llll < 3; llll++) {
																															int ans = new java.util.Scanner(System.in).nextInt();
																															if (ans == 1) {
																																System.out.println("正解です！");
																																System.out.println("解説：「河豚は食いたし命は惜しし」ということわざがあるくらいです。美味しいのでしょう。");
																																System.out.println("---------------------------------------------");
																																b.attacked();
																																break;
																															}else 
																															if (ans == 0){
																																System.out.println("残念、不正解です。");
																																System.out.println("解説：「河豚は食いたし命は惜しし」ということわざがあるくらいです。美味しいのでしょう。");
																																System.out.println("---------------------------------------------");
																																h.attacked();
																																break;
																															}else {
																																System.out.println("もう一度選択してください。");
																																System.out.println("正しければ１、誤りであれば０を選択してください。");
																															}
																														}		if (h.hp == 0) {
																																	h.end();
																																}else
																																if(b.hp == 0) {
																																	b.end();
																																	h.comp();
																																}
																													}
																										}
																							}
																				}
																	}
														}
											}
						}
						
				break;
			case 2:
				System.out.println("またね！");
				break;
			default:
				System.out.println("キーを間違えて押したみたいですね");
		}
		System.out.println("ゲームを終了します");
	}
}