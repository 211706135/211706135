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
			if(x[0].equals("����")) {
				a = x[1];
				if(x[2].equals("����")){
					switch(x[3]){
						case "һ":
							zs=1;
							break;
						case "��":
							zs=2;
							break;
						case "��":
							zs=3;
							break;
						case "��":
							zs=4;
							break;
						case "��":
							zs=5;
							break;
						case "��":
							zs=6;
							break;
						case "��":
							zs=7;
							break;
						case "��":
							zs=8;
							break;
						case "��":
							zs=9;
							break;
						case "ʮ":
							zs=10;
							break;
						case "��":
							zs=0;
							break;
					}
				}
			}
			else if(x[0].equals("���")) {
				if(a.equals(x[1])) {
					if(x[2].equals("����")) {
						switch(x[3]) {
							case "һ":
								if(zs>1) {
									if(x[4].equals("��")) {
										if(x[5].equals("����")) {
											f=x[6].split("��");
											d=f[1].split("��");
											System.out.println(x[6]);
										}
									}
								}
								else if(x.length>7&&x[7].equals("����")&&zs<=1) {
									if(x[8].equals("����")) {
										f=x[9].split("��");
										d=f[1].split("��");
										System.out.println(x[9]);
									}
								}
								break;
							case "��":
								if(zs>2) {
									if(x[4].equals("��")) {
										if(x[5].equals("����")) {
											f=x[6].split("��");
											d=f[1].split("��");
											System.out.println(d[0]);
										}
									}
								}
								else if(x.length>7&&x[7].equals("����")&&zs<=2) {
									if(x[8].equals("����")) {
										f=x[9].split("��");
										d=f[1].split("��");
										System.out.println(d[0]);
									}
								}
								break;
							case "��":
								if(zs>3) {
									if(x[4].equals("��")) {
										if(x[5].equals("����")) {
											f=x[6].split("��");
											d=f[1].split("��");
											System.out.println(x[6]);
										}
									}
								}
								else if(x.length>7&&x[7].equals("����")&&zs<=3) {
									if(x[8].equals("����")) {
										f=x[9].split("��");
										d=f[1].split("��");
										System.out.println(x[9]);
									}
								}
								break;
							case "��":
								if(zs>4) {
									if(x[4].equals("��")) {
										if(x[5].equals("����")) {
											f=x[6].split("��");
											d=f[1].split("��");
											System.out.println(x[6]);
										}
									}
								}
								else if(x.length>7&&x[7].equals("����")&&zs<=4) {
									if(x[8].equals("����")) {
										f=x[9].split("��");
										d=f[1].split("��");
										System.out.println(x[9]);
									}
								}
								break;
							case "��":
								if(zs>5) {
									if(x[4].equals("��")) {
										if(x[5].equals("����")) {
											f=x[6].split("��");
											d=f[1].split("��");
											System.out.println(x[6]);
										}
									}
								}
								else if(x.length>7&&x[7].equals("����")&&zs<=5) {
									if(x[8].equals("����")) {
										f=x[9].split("��");
										d=f[1].split("��");
										System.out.println(x[9]);
									}
								}
								break;
							case "��":
								if(zs>6) {
									if(x[4].equals("��")) {
									if(x[5].equals("����")) {
										f=x[6].split("��");
										d=f[1].split("��");
										System.out.println(x[6]);
										}
									}
								}
								else if(x.length>7&&x[7].equals("����")&&zs<=6) {
									if(x[8].equals("����")) {
										f=x[9].split("��");
										d=f[1].split("��");
										System.out.println(x[9]);
									}
								}
								break;
							case "��":
								if(zs>7) {
									if(x[4].equals("��")) {
									if(x[5].equals("����")) {
										f=x[6].split("��");
										d=f[1].split("��");
										System.out.println(x[6]);
										}
									}
								}
								else if(x.length>7&&x[7].equals("����")&&zs<=7) {
									if(x[8].equals("����")) {
										f=x[9].split("��");
										d=f[1].split("��");
										System.out.println(x[9]);
									}
								}
								break;
							case "��":
								if(zs>8) {
									if(x[4].equals("��")) {
										if(x[5].equals("����")) {
											f=x[6].split("��");
											d=f[1].split("��");
											System.out.println(x[6]);
											}
										}
									}
								else if(x.length>7&&x[7].equals("����")&&zs<=8) {
									if(x[8].equals("����")) {
										f=x[9].split("��");
										d=f[1].split("��");
										System.out.println(x[9]);
									}
								}
								break;
							case "��":
								if(zs>9) {
									if(x[4].equals("��")) {
										if(x[5].equals("����")) {
											f=x[6].split("��");
											d=f[1].split("��");
											System.out.println(x[6]);
										}
									}
								}
								else if(x.length>7&&x[7].equals("����")&&zs<=9) {
									if(x[8].equals("����")) {
										f=x[9].split("��");
										d=f[1].split("��");
										System.out.println(x[9]);
									}
								}
								break;
							case "ʮ":
								if(zs>10) {
									if(x[4].equals("��")) {
										if(x[5].equals("����")) {
											f=x[6].split("��");
											d=f[1].split("��");
											System.out.println(x[6]);
										}
									}
								}
								else if(x.length>7&&x[7].equals("����")&&zs<=10) {
									if(x[8].equals("����")) {
										f=x[9].split("��");
										d=f[1].split("��");
										System.out.println(x[9]);
									}
								}
								break;
							case "��":
								if(zs>0) {
									if(x[4].equals("��")) {
										if(x[5].equals("����")) {
											f=x[6].split("��");
											d=f[1].split("��");
											System.out.println(x[6]);
										}
									}
								}
								else if(x.length>7&&x[7].equals("����")&&zs<=0) {
									if(x[8].equals("����")) {
										f=x[9].split("��");
										d=f[1].split("��");
										System.out.println(x[9]);
									}
								}
								break;
							}
						}
					else if(x[2].equals("С��")) {
							switch(x[3]) {
								case "һ":
									if(zs<1) {
										if(x[4].equals("��")) {
											if(x[5].equals("����")) {
												f=x[6].split("��");
												d=f[1].split("��");
												System.out.println(x[6]);
											}
										}
									}
									else if(x.length>7&&x[7].equals("����")&&zs>=1) {
										if(x[8].equals("����")) {
											f=x[9].split("��");
											d=f[1].split("��");
											System.out.println(x[9]);
										}
									}
									break;
								case "��":
									if(zs<2) {
										if(x[4].equals("��")) {
											if(x[5].equals("����")) {
												f=x[6].split("��");
												d=f[1].split("��");
												System.out.println(x[6]);
											}
										}
									}
									else if(x.length>7&&x[7].equals("����")&&zs>=2) {
										if(x[8].equals("����")) {
											f=x[9].split("��");
											d=f[1].split("��");
											System.out.println(x[9]);
										}
									}
									break;
								case "��":
									if(zs<3) {
										if(x[4].equals("��")) {
											if(x[5].equals("����")) {
												f=x[6].split("��");
												d=f[1].split("��");
												System.out.println(x[6]);
											}
										}
									}
									else if(x.length>7&&x[7].equals("����")&&zs>=3) {
										if(x[8].equals("����")) {
											f=x[9].split("��");
											d=f[1].split("��");
											System.out.println(x[9]);
										}
									}
									break;
								case "��":
									if(zs<4) {
										if(x[4].equals("��")) {
											if(x[5].equals("����")) {
												f=x[6].split("��");
												d=f[1].split("��");
												System.out.println(x[6]);
											}
										}
									}
									else if(x.length>7&&x[7].equals("����")&&zs>=4) {
										if(x[8].equals("����")) {
											f=x[9].split("��");
											d=f[1].split("��");
											System.out.println(x[9]);
										}
									}
									break;
								case "��":
									if(zs<5) {
										if(x[4].equals("��")) {
											if(x[5].equals("����")) {
												f=x[6].split("��");
												d=f[1].split("��");
												System.out.println(x[6]);
											}
										}
									}
									else if(x.length>7&&x[7].equals("����")&&zs>=5) {
										if(x[8].equals("����")) {
											f=x[9].split("��");
											d=f[1].split("��");
											System.out.println(x[9]);
										}
									}
									break;
								case "��":
									if(zs<6) {
										if(x[4].equals("��")) {
										if(x[5].equals("����")) {
											f=x[6].split("��");
											d=f[1].split("��");
											System.out.println(x[6]);
											}
										}
									}
									else if(x.length>7&&x[7].equals("����")&&zs>=6) {
										if(x[8].equals("����")) {
											f=x[9].split("��");
											d=f[1].split("��");
											System.out.println(x[9]);
										}
									}
									break;
								case "��":
									if(zs<7) {
										if(x[4].equals("��")) {
											if(x[5].equals("����")) {
												f=x[6].split("��");
												d=f[1].split("��");
												System.out.println(x[6]);
											}
										}
									}
									else if(x.length>7&&x[7].equals("����")&&zs>=7) {
										if(x[8].equals("����")) {
											f=x[9].split("��");
											d=f[1].split("��");
											System.out.println(x[9]);
										}
									}
									break;
								case "��":
									if(zs<8) {if(x[4].equals("��")) {
										if(x[5].equals("����")) {
											f=x[6].split("��");
											d=f[1].split("��");
											System.out.println(x[6]);
											}
										}
									}
									else if(x.length>7&&x[7].equals("����")&&zs>=8) {
										if(x[8].equals("����")) {
											f=x[9].split("��");
											d=f[1].split("��");
											System.out.println(x[9]);
										}
									}
									break;
								case "��":
									if(zs<9) {
										if(x[4].equals("��")) {
											if(x[5].equals("����")) {
												f=x[6].split("��");
												d=f[1].split("��");
												System.out.println(x[6]);
											}
										}
									}
									else if(x.length>7&&x[7].equals("����")&&zs>=9) {
										if(x[8].equals("����")) {
											f=x[9].split("��");
											d=f[1].split("��");
											System.out.println(x[9]);
										}
									}
									break;
								case "ʮ":
									if(zs<10) {
										if(x[4].equals("��")) {
											if(x[5].equals("����")) {
												f=x[6].split("��");
												d=f[1].split("��");
												System.out.println(x[6]);
											}
										}
									}
									else if(x.length>7&&x[7].equals("����")&&zs>=10) {
										if(x[8].equals("����")) {
											f=x[9].split("��");
											d=f[1].split("��");
											System.out.println(x[9]);
										}
									}
									break;
								case "��":
									if(zs<0) {
										if(x[4].equals("��")) {
											if(x[5].equals("����")) {
												f=x[6].split("��");
												d=f[1].split("��");
												System.out.println(x[6]);											}
										}
									}
									else if(x.length>7&&x[7].equals("����")&&zs>=0) {
										if(x[8].equals("����")) {
											f=x[9].split("��");
											d=f[1].split("��");
											System.out.println(x[9]);
										}
									}
									break;
								}
							
					}
					else if(x[2].equals("����")) {
						{
							switch(x[3]) {
								case "һ":
									if(zs==1) {
										if(x[4].equals("��")) {
											if(x[5].equals("����")) {
												f=x[6].split("��");
												d=f[1].split("��");
												System.out.println(x[6]);											}
										}
									}
									else if(x.length>7&&x[7].equals("����")&&zs!=1) {
										if(x[8].equals("����")) {
											f=x[9].split("��");
											d=f[1].split("��");
											System.out.println(x[9]);
										}
									}
									break;
								case "��":
									if(zs==2) {
										if(x[4].equals("��")) {
											if(x[5].equals("����")) {
												f=x[6].split("��");
												d=f[1].split("��");
												System.out.println(x[6]);											}
										}
									}
									else if(x.length>7&&x[7].equals("����")&&zs!=2) {
										if(x[8].equals("����")) {
											f=x[9].split("��");
											d=f[1].split("��");
											System.out.println(x[9]);
										}
									}
									break;
								case "��":
									if(zs==3) {
										if(x[4].equals("��")) {
											if(x[5].equals("����")) {
												f=x[6].split("��");
												d=f[1].split("��");
												System.out.println(x[6]);											}
										}
									}
									else if(x.length>7&&x[7].equals("����")&&zs!=3) {
										if(x[8].equals("����")) {
											f=x[9].split("��");
											d=f[1].split("��");
											System.out.println(x[9]);										}
									}
									break;
								case "��":
									if(zs==4) {
										if(x[4].equals("��")) {
											if(x[5].equals("����")) {
												f=x[6].split("��");
												d=f[1].split("��");
												System.out.println(x[6]);											}
										}
									}
									else if(x.length>7&&x[7].equals("����")&&zs!=4) {
										if(x[8].equals("����")) {
											f=x[9].split("��");
											d=f[1].split("��");
											System.out.println(x[9]);										}
									}
									break;
								case "��":
									if(zs==5) {
										if(x[4].equals("��")) {
											if(x[5].equals("����")) {
												f=x[6].split("��");
												d=f[1].split("��");
												System.out.println(x[6]);											}
										}
									}
									else if(x.length>7&&x[7].equals("����")&&zs!=5) {
										if(x[8].equals("����")) {
											f=x[9].split("��");
											d=f[1].split("��");
											System.out.println(x[9]);										}
									}
									break;
								case "��":
									if(zs==6) {
										if(x[4].equals("��")) {
										if(x[5].equals("����")) {
											f=x[6].split("��");
											d=f[1].split("��");
											System.out.println(x[6]);											}
										}
									}
									else if(x.length>7&&x[7].equals("����")&&zs!=6) {
										if(x[8].equals("����")) {
											f=x[9].split("��");
											d=f[1].split("��");
											System.out.println(x[9]);										}
									}
									break;
								case "��":
									if(zs==7) {
										if(x[4].equals("��")) {
										if(x[5].equals("����")) {
											f=x[6].split("��");
											d=f[1].split("��");
											System.out.println(x[6]);											}
										}
									}
									else if(x.length>7&&x[7].equals("����")&&zs!=7) {
										if(x[8].equals("����")) {
											f=x[9].split("��");
											d=f[1].split("��");
											System.out.println(x[9]);										}
									}
									break;
								case "��":
									if(zs==8) {if(x[4].equals("��")) {
										if(x[5].equals("����")) {
											f=x[6].split("��");
											d=f[1].split("��");
											System.out.println(x[6]);											}
										}
									}
									else if(x.length>7&&x[7].equals("����")&&zs!=8) {
										if(x[8].equals("����")) {
											f=x[9].split("��");
											d=f[1].split("��");
											System.out.println(x[9]);										}
									}
									break;
								case "��":
									if(zs==9) {
										if(x[4].equals("��")) {
											if(x[5].equals("����")) {
												f=x[6].split("��");
												d=f[1].split("��");
												System.out.println(x[6]);											}
										}
									}
									else if(x.length>7&&x[7].equals("����")&&zs!=9) {
										if(x[8].equals("����")) {
											f=x[9].split("��");
											d=f[1].split("��");
											System.out.println(x[9]);										}
									}
									break;
								case "ʮ":
									if(zs==10) {
										if(x[4].equals("��")) {
											if(x[5].equals("����")) {
												f=x[6].split("��");
												d=f[1].split("��");
												System.out.println(x[6]);											}
										}
									}
									else if(x.length>7&&x[7].equals("����")&&zs!=10) {
										if(x[8].equals("����")) {
											f=x[9].split("��");
											d=f[1].split("��");
											System.out.println(x[9]);										}
									}
									break;
								case "��":
									if(zs==0) {
										if(x[4].equals("��")) {
											if(x[5].equals("����")) {
												f=x[6].split("��");
												d=f[1].split("��");
												System.out.println(x[6]);											}
										}
									}
									else if(x.length>7&&x[7].equals("����")&&zs!=0) {
										if(x[8].equals("����")) {
											f=x[9].split("��");
											d=f[1].split("��");
											System.out.println(x[9]);										}
									}
									break;
								}
							}
					}
				}
			}
			else if(x[0].equals("����")) {
				if(a.equals(x[1])){
					switch(zs) {
					case 1:
						System.out.println("һ");
						break;
					case 2:
						System.out.println("��");
						break;
					case 3:
						System.out.println("��");
						break;
					case 4:
						System.out.println("��");
						break;
					case 5:
						System.out.println("��");
						break;
					case 6:
						System.out.println("��");
						break;
					case 7:
						System.out.println("��");
						break;
					case 8:
						System.out.println("��");
						break;
					case 9:
						System.out.println("��");
						break;
					case 10:
						System.out.println("ʮ");
						break;
					case 0:
						System.out.println("��");
						break;
					}
				}
			}
			else if(a.equals(x[0])) {
				if(x[1].equals("����")) {
					switch(x[2]){
					case "һ":
						zs=zs+1;
						break;
					case "��":
						zs=zs+2;
						break;
					case "��":
						zs=zs+3;
						break;
					case "��":
						zs=zs+4;
						break;
					case "��":
						zs=zs+5;
						break;
					case "��":
						zs=zs+6;
						break;
					case "��":
						zs=zs+7;
						break;
					case "��":
						zs=zs+8;
						break;
					case "��":
						zs=zs+9;
						break;
					case "ʮ":
						zs=zs+10;
						break;
					case "��":
						zs=zs+0;
						break;
				}
				}
				else if(x[1].equals("����")) {
					switch(x[2]){
					case "һ":
						zs=zs-1;
						break;
					case "��":
						zs=zs-2;
						break;
					case "��":
						zs=zs-3;
						break;
					case "��":
						zs=zs-4;
						break;
					case "��":
						zs=zs-5;
						break;
					case "��":
						zs=zs-6;
						break;
					case "��":
						zs=zs-7;
						break;
					case "��":
						zs=zs-8;
						break;
					case "��":
						zs=zs-9;
						break;
					case "ʮ":
						zs=zs-10;
						break;
					case "��":
						zs=zs-0;
						break;
					}
				}
			}
		}
	}
}
