package thRun;

public class MyRes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st = "woshizhangsan";
		System.out.println(((int)st.charAt(1)));
		char[] ch = new char[256]; // 共有256个字符，给所有字符预留空间
		for (int i = 0; i < st.length(); i++) {
			ch[st.charAt(i)]++;// 统计每个字符出现次数
								// ，st.charAt(i)即字符数组下标，ch[st.charAt(i)]即为出现次数
		}
		System.out.println(st.charAt(0));
		System.out.println(ch[111]==1);
		char c=111;
		System.out.println((char)111);
		/*for (char c : ch) {
			System.out.println(c);
		}
		for(int i=0;i<st.length();i++){
			if(ch[st.charAt(i)]==1){  //如果对应的字符只出现一次，则输出并结束循环
				System.out.println(st.charAt(i));
				break;
			}
			if(ch[st.charAt(i)]!=1 && i==st.length()-1 ){ //如果没有出现只有一次的字符，输出 .
				System.out.println("."); //如果不输出 . 会报错，严格按要求
			}
		}*/
	}

}
