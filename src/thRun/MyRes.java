package thRun;

public class MyRes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st = "woshizhangsan";
		System.out.println(((int)st.charAt(1)));
		char[] ch = new char[256]; // ����256���ַ����������ַ�Ԥ���ռ�
		for (int i = 0; i < st.length(); i++) {
			ch[st.charAt(i)]++;// ͳ��ÿ���ַ����ִ���
								// ��st.charAt(i)���ַ������±꣬ch[st.charAt(i)]��Ϊ���ִ���
		}
		System.out.println(st.charAt(0));
		System.out.println(ch[111]==1);
		char c=111;
		System.out.println((char)111);
		/*for (char c : ch) {
			System.out.println(c);
		}
		for(int i=0;i<st.length();i++){
			if(ch[st.charAt(i)]==1){  //�����Ӧ���ַ�ֻ����һ�Σ������������ѭ��
				System.out.println(st.charAt(i));
				break;
			}
			if(ch[st.charAt(i)]!=1 && i==st.length()-1 ){ //���û�г���ֻ��һ�ε��ַ������ .
				System.out.println("."); //�������� . �ᱨ���ϸ�Ҫ��
			}
		}*/
	}

}
