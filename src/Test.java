
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "12223555567";
		StringBuilder builder = new StringBuilder(text);
		int j = 0;
		for (int i = text.length()-1; i >=0; i--,j++) {
			if(i!=0 &j!=0 && j%3==2){
				builder.insert(i, ",");
			}
			System.out.println(i);
		}
		System.out.println(builder.toString());
	}

}
