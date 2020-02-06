package HZ;

import java.util.Scanner;

public class hz {
	public static void main(String[] args) {
		int zs=0;
		String a = null;
		String[] f = null;
		String[] d = null;
		String[] x = null;
		for(int b = 1;b>0;b++) {
			Scanner sc = new Scanner(System.in);
			String s = sc.nextLine();
			x = s.split(" ");
			if(x[0].equals("整数")) {
				a = x[1];
				if(x[2].equals("等于")){
					switch(x[3]){
						case "一":
							zs=1;
							break;
						case "二":
							zs=2;
							break;
						case "三":
							zs=3;
							break;
						case "四":
							zs=4;
							break;
						case "五":
							zs=5;
							break;
						case "六":
							zs=6;
							break;
						case "七":
							zs=7;
							break;
						case "八":
							zs=8;
							break;
						case "九":
							zs=9;
							break;
						case "十":
							zs=10;
							break;
						case "零":
							zs=0;
							break;
					}
				}
			}
			else if(x[0].equals("如果")) {
				if(a.equals(x[1])) {
					if(x[2].equals("大于")) {
						switch(x[3]) {
							case "一":
								if(zs>1) {
									if(x[4].equals("则")) {
										if(x[5].equals("看看")) {
											f=x[6].split("“");
											d=f[1].split("”");
											System.out.println(x[6]);
										}
									}
								}
								else if(x.length>7&&x[7].equals("否则")&&zs<=1) {
									if(x[8].equals("看看")) {
										f=x[9].split("“");
										d=f[1].split("”");
										System.out.println(x[9]);
									}
								}
								break;
							case "二":
								if(zs>2) {
									if(x[4].equals("则")) {
										if(x[5].equals("看看")) {
											f=x[6].split("“");
											d=f[1].split("”");
											System.out.println(d[0]);
										}
									}
								}
								else if(x.length>7&&x[7].equals("否则")&&zs<=2) {
									if(x[8].equals("看看")) {
										f=x[9].split("“");
										d=f[1].split("”");
										System.out.println(d[0]);
									}
								}
								break;
							case "三":
								if(zs>3) {
									if(x[4].equals("则")) {
										if(x[5].equals("看看")) {
											f=x[6].split("“");
											d=f[1].split("”");
											System.out.println(x[6]);
										}
									}
								}
								else if(x.length>7&&x[7].equals("否则")&&zs<=3) {
									if(x[8].equals("看看")) {
										f=x[9].split("“");
										d=f[1].split("”");
										System.out.println(x[9]);
									}
								}
								break;
							case "四":
								if(zs>4) {
									if(x[4].equals("则")) {
										if(x[5].equals("看看")) {
											f=x[6].split("“");
											d=f[1].split("”");
											System.out.println(x[6]);
										}
									}
								}
								else if(x.length>7&&x[7].equals("否则")&&zs<=4) {
									if(x[8].equals("看看")) {
										f=x[9].split("“");
										d=f[1].split("”");
										System.out.println(x[9]);
									}
								}
								break;
							case "五":
								if(zs>5) {
									if(x[4].equals("则")) {
										if(x[5].equals("看看")) {
											f=x[6].split("“");
											d=f[1].split("”");
											System.out.println(x[6]);
										}
									}
								}
								else if(x.length>7&&x[7].equals("否则")&&zs<=5) {
									if(x[8].equals("看看")) {
										f=x[9].split("“");
										d=f[1].split("”");
										System.out.println(x[9]);
									}
								}
								break;
							case "六":
								if(zs>6) {
									if(x[4].equals("则")) {
									if(x[5].equals("看看")) {
										f=x[6].split("“");
										d=f[1].split("”");
										System.out.println(x[6]);
										}
									}
								}
								else if(x.length>7&&x[7].equals("否则")&&zs<=6) {
									if(x[8].equals("看看")) {
										f=x[9].split("“");
										d=f[1].split("”");
										System.out.println(x[9]);
									}
								}
								break;
							case "七":
								if(zs>7) {
									if(x[4].equals("则")) {
									if(x[5].equals("看看")) {
										f=x[6].split("“");
										d=f[1].split("”");
										System.out.println(x[6]);
										}
									}
								}
								else if(x.length>7&&x[7].equals("否则")&&zs<=7) {
									if(x[8].equals("看看")) {
										f=x[9].split("“");
										d=f[1].split("”");
										System.out.println(x[9]);
									}
								}
								break;
							case "八":
								if(zs>8) {
									if(x[4].equals("则")) {
										if(x[5].equals("看看")) {
											f=x[6].split("“");
											d=f[1].split("”");
											System.out.println(x[6]);
											}
										}
									}
								else if(x.length>7&&x[7].equals("否则")&&zs<=8) {
									if(x[8].equals("看看")) {
										f=x[9].split("“");
										d=f[1].split("”");
										System.out.println(x[9]);
									}
								}
								break;
							case "九":
								if(zs>9) {
									if(x[4].equals("则")) {
										if(x[5].equals("看看")) {
											f=x[6].split("“");
											d=f[1].split("”");
											System.out.println(x[6]);
										}
									}
								}
								else if(x.length>7&&x[7].equals("否则")&&zs<=9) {
									if(x[8].equals("看看")) {
										f=x[9].split("“");
										d=f[1].split("”");
										System.out.println(x[9]);
									}
								}
								break;
							case "十":
								if(zs>10) {
									if(x[4].equals("则")) {
										if(x[5].equals("看看")) {
											f=x[6].split("“");
											d=f[1].split("”");
											System.out.println(x[6]);
										}
									}
								}
								else if(x.length>7&&x[7].equals("否则")&&zs<=10) {
									if(x[8].equals("看看")) {
										f=x[9].split("“");
										d=f[1].split("”");
										System.out.println(x[9]);
									}
								}
								break;
							case "零":
								if(zs>0) {
									if(x[4].equals("则")) {
										if(x[5].equals("看看")) {
											f=x[6].split("“");
											d=f[1].split("”");
											System.out.println(x[6]);
										}
									}
								}
								else if(x.length>7&&x[7].equals("否则")&&zs<=0) {
									if(x[8].equals("看看")) {
										f=x[9].split("“");
										d=f[1].split("”");
										System.out.println(x[9]);
									}
								}
								break;
							}
						}
					else if(x[2].equals("小于")) {
							switch(x[3]) {
								case "一":
									if(zs<1) {
										if(x[4].equals("则")) {
											if(x[5].equals("看看")) {
												f=x[6].split("“");
												d=f[1].split("”");
												System.out.println(x[6]);
											}
										}
									}
									else if(x.length>7&&x[7].equals("否则")&&zs>=1) {
										if(x[8].equals("看看")) {
											f=x[9].split("“");
											d=f[1].split("”");
											System.out.println(x[9]);
										}
									}
									break;
								case "二":
									if(zs<2) {
										if(x[4].equals("则")) {
											if(x[5].equals("看看")) {
												f=x[6].split("“");
												d=f[1].split("”");
												System.out.println(x[6]);
											}
										}
									}
									else if(x.length>7&&x[7].equals("否则")&&zs>=2) {
										if(x[8].equals("看看")) {
											f=x[9].split("“");
											d=f[1].split("”");
											System.out.println(x[9]);
										}
									}
									break;
								case "三":
									if(zs<3) {
										if(x[4].equals("则")) {
											if(x[5].equals("看看")) {
												f=x[6].split("“");
												d=f[1].split("”");
												System.out.println(x[6]);
											}
										}
									}
									else if(x.length>7&&x[7].equals("否则")&&zs>=3) {
										if(x[8].equals("看看")) {
											f=x[9].split("“");
											d=f[1].split("”");
											System.out.println(x[9]);
										}
									}
									break;
								case "四":
									if(zs<4) {
										if(x[4].equals("则")) {
											if(x[5].equals("看看")) {
												f=x[6].split("“");
												d=f[1].split("”");
												System.out.println(x[6]);
											}
										}
									}
									else if(x.length>7&&x[7].equals("否则")&&zs>=4) {
										if(x[8].equals("看看")) {
											f=x[9].split("“");
											d=f[1].split("”");
											System.out.println(x[9]);
										}
									}
									break;
								case "五":
									if(zs<5) {
										if(x[4].equals("则")) {
											if(x[5].equals("看看")) {
												f=x[6].split("“");
												d=f[1].split("”");
												System.out.println(x[6]);
											}
										}
									}
									else if(x.length>7&&x[7].equals("否则")&&zs>=5) {
										if(x[8].equals("看看")) {
											f=x[9].split("“");
											d=f[1].split("”");
											System.out.println(x[9]);
										}
									}
									break;
								case "六":
									if(zs<6) {
										if(x[4].equals("则")) {
										if(x[5].equals("看看")) {
											f=x[6].split("“");
											d=f[1].split("”");
											System.out.println(x[6]);
											}
										}
									}
									else if(x.length>7&&x[7].equals("否则")&&zs>=6) {
										if(x[8].equals("看看")) {
											f=x[9].split("“");
											d=f[1].split("”");
											System.out.println(x[9]);
										}
									}
									break;
								case "七":
									if(zs<7) {
										if(x[4].equals("则")) {
											if(x[5].equals("看看")) {
												f=x[6].split("“");
												d=f[1].split("”");
												System.out.println(x[6]);
											}
										}
									}
									else if(x.length>7&&x[7].equals("否则")&&zs>=7) {
										if(x[8].equals("看看")) {
											f=x[9].split("“");
											d=f[1].split("”");
											System.out.println(x[9]);
										}
									}
									break;
								case "八":
									if(zs<8) {if(x[4].equals("则")) {
										if(x[5].equals("看看")) {
											f=x[6].split("“");
											d=f[1].split("”");
											System.out.println(x[6]);
											}
										}
									}
									else if(x.length>7&&x[7].equals("否则")&&zs>=8) {
										if(x[8].equals("看看")) {
											f=x[9].split("“");
											d=f[1].split("”");
											System.out.println(x[9]);
										}
									}
									break;
								case "九":
									if(zs<9) {
										if(x[4].equals("则")) {
											if(x[5].equals("看看")) {
												f=x[6].split("“");
												d=f[1].split("”");
												System.out.println(x[6]);
											}
										}
									}
									else if(x.length>7&&x[7].equals("否则")&&zs>=9) {
										if(x[8].equals("看看")) {
											f=x[9].split("“");
											d=f[1].split("”");
											System.out.println(x[9]);
										}
									}
									break;
								case "十":
									if(zs<10) {
										if(x[4].equals("则")) {
											if(x[5].equals("看看")) {
												f=x[6].split("“");
												d=f[1].split("”");
												System.out.println(x[6]);
											}
										}
									}
									else if(x.length>7&&x[7].equals("否则")&&zs>=10) {
										if(x[8].equals("看看")) {
											f=x[9].split("“");
											d=f[1].split("”");
											System.out.println(x[9]);
										}
									}
									break;
								case "零":
									if(zs<0) {
										if(x[4].equals("则")) {
											if(x[5].equals("看看")) {
												f=x[6].split("“");
												d=f[1].split("”");
												System.out.println(x[6]);											}
										}
									}
									else if(x.length>7&&x[7].equals("否则")&&zs>=0) {
										if(x[8].equals("看看")) {
											f=x[9].split("“");
											d=f[1].split("”");
											System.out.println(x[9]);
										}
									}
									break;
								}
							
					}
					else if(x[2].equals("等于")) {
						{
							switch(x[3]) {
								case "一":
									if(zs==1) {
										if(x[4].equals("则")) {
											if(x[5].equals("看看")) {
												f=x[6].split("“");
												d=f[1].split("”");
												System.out.println(x[6]);											}
										}
									}
									else if(x.length>7&&x[7].equals("否则")&&zs!=1) {
										if(x[8].equals("看看")) {
											f=x[9].split("“");
											d=f[1].split("”");
											System.out.println(x[9]);
										}
									}
									break;
								case "二":
									if(zs==2) {
										if(x[4].equals("则")) {
											if(x[5].equals("看看")) {
												f=x[6].split("“");
												d=f[1].split("”");
												System.out.println(x[6]);											}
										}
									}
									else if(x.length>7&&x[7].equals("否则")&&zs!=2) {
										if(x[8].equals("看看")) {
											f=x[9].split("“");
											d=f[1].split("”");
											System.out.println(x[9]);
										}
									}
									break;
								case "三":
									if(zs==3) {
										if(x[4].equals("则")) {
											if(x[5].equals("看看")) {
												f=x[6].split("“");
												d=f[1].split("”");
												System.out.println(x[6]);											}
										}
									}
									else if(x.length>7&&x[7].equals("否则")&&zs!=3) {
										if(x[8].equals("看看")) {
											f=x[9].split("“");
											d=f[1].split("”");
											System.out.println(x[9]);										}
									}
									break;
								case "四":
									if(zs==4) {
										if(x[4].equals("则")) {
											if(x[5].equals("看看")) {
												f=x[6].split("“");
												d=f[1].split("”");
												System.out.println(x[6]);											}
										}
									}
									else if(x.length>7&&x[7].equals("否则")&&zs!=4) {
										if(x[8].equals("看看")) {
											f=x[9].split("“");
											d=f[1].split("”");
											System.out.println(x[9]);										}
									}
									break;
								case "五":
									if(zs==5) {
										if(x[4].equals("则")) {
											if(x[5].equals("看看")) {
												f=x[6].split("“");
												d=f[1].split("”");
												System.out.println(x[6]);											}
										}
									}
									else if(x.length>7&&x[7].equals("否则")&&zs!=5) {
										if(x[8].equals("看看")) {
											f=x[9].split("“");
											d=f[1].split("”");
											System.out.println(x[9]);										}
									}
									break;
								case "六":
									if(zs==6) {
										if(x[4].equals("则")) {
										if(x[5].equals("看看")) {
											f=x[6].split("“");
											d=f[1].split("”");
											System.out.println(x[6]);											}
										}
									}
									else if(x.length>7&&x[7].equals("否则")&&zs!=6) {
										if(x[8].equals("看看")) {
											f=x[9].split("“");
											d=f[1].split("”");
											System.out.println(x[9]);										}
									}
									break;
								case "七":
									if(zs==7) {
										if(x[4].equals("则")) {
										if(x[5].equals("看看")) {
											f=x[6].split("“");
											d=f[1].split("”");
											System.out.println(x[6]);											}
										}
									}
									else if(x.length>7&&x[7].equals("否则")&&zs!=7) {
										if(x[8].equals("看看")) {
											f=x[9].split("“");
											d=f[1].split("”");
											System.out.println(x[9]);										}
									}
									break;
								case "八":
									if(zs==8) {if(x[4].equals("则")) {
										if(x[5].equals("看看")) {
											f=x[6].split("“");
											d=f[1].split("”");
											System.out.println(x[6]);											}
										}
									}
									else if(x.length>7&&x[7].equals("否则")&&zs!=8) {
										if(x[8].equals("看看")) {
											f=x[9].split("“");
											d=f[1].split("”");
											System.out.println(x[9]);										}
									}
									break;
								case "九":
									if(zs==9) {
										if(x[4].equals("则")) {
											if(x[5].equals("看看")) {
												f=x[6].split("“");
												d=f[1].split("”");
												System.out.println(x[6]);											}
										}
									}
									else if(x.length>7&&x[7].equals("否则")&&zs!=9) {
										if(x[8].equals("看看")) {
											f=x[9].split("“");
											d=f[1].split("”");
											System.out.println(x[9]);										}
									}
									break;
								case "十":
									if(zs==10) {
										if(x[4].equals("则")) {
											if(x[5].equals("看看")) {
												f=x[6].split("“");
												d=f[1].split("”");
												System.out.println(x[6]);											}
										}
									}
									else if(x.length>7&&x[7].equals("否则")&&zs!=10) {
										if(x[8].equals("看看")) {
											f=x[9].split("“");
											d=f[1].split("”");
											System.out.println(x[9]);										}
									}
									break;
								case "零":
									if(zs==0) {
										if(x[4].equals("则")) {
											if(x[5].equals("看看")) {
												f=x[6].split("“");
												d=f[1].split("”");
												System.out.println(x[6]);											}
										}
									}
									else if(x.length>7&&x[7].equals("否则")&&zs!=0) {
										if(x[8].equals("看看")) {
											f=x[9].split("“");
											d=f[1].split("”");
											System.out.println(x[9]);										}
									}
									break;
								}
							}
					}
				}
			}
			else if(x[0].equals("看看")) {
				if(a.equals(x[1])){
					switch(zs) {
					case 1:
						System.out.println("一");
						break;
					case 2:
						System.out.println("二");
						break;
					case 3:
						System.out.println("三");
						break;
					case 4:
						System.out.println("四");
						break;
					case 5:
						System.out.println("五");
						break;
					case 6:
						System.out.println("六");
						break;
					case 7:
						System.out.println("七");
						break;
					case 8:
						System.out.println("八");
						break;
					case 9:
						System.out.println("九");
						break;
					case 10:
						System.out.println("十");
						break;
					case 0:
						System.out.println("零");
						break;
					}
				}
			}
			else if(a.equals(x[0])) {
				if(x[1].equals("增加")) {
					switch(x[2]){
					case "一":
						zs=zs+1;
						break;
					case "二":
						zs=zs+2;
						break;
					case "三":
						zs=zs+3;
						break;
					case "四":
						zs=zs+4;
						break;
					case "五":
						zs=zs+5;
						break;
					case "六":
						zs=zs+6;
						break;
					case "七":
						zs=zs+7;
						break;
					case "八":
						zs=zs+8;
						break;
					case "九":
						zs=zs+9;
						break;
					case "十":
						zs=zs+10;
						break;
					case "零":
						zs=zs+0;
						break;
				}
				}
				else if(x[1].equals("减少")) {
					switch(x[2]){
					case "一":
						zs=zs-1;
						break;
					case "二":
						zs=zs-2;
						break;
					case "三":
						zs=zs-3;
						break;
					case "四":
						zs=zs-4;
						break;
					case "五":
						zs=zs-5;
						break;
					case "六":
						zs=zs-6;
						break;
					case "七":
						zs=zs-7;
						break;
					case "八":
						zs=zs-8;
						break;
					case "九":
						zs=zs-9;
						break;
					case "十":
						zs=zs-10;
						break;
					case "零":
						zs=zs-0;
						break;
					}
				}
			}
		}
	}
}
