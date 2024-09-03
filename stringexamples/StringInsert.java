package stringexamples;

public class StringInsert {

	public static void main(String[] args) {
          String s1 = "object programming";
          int pos = s1.indexOf("programming");
          
          StringBuffer sb = new StringBuffer(s1);
          
          sb.insert(pos, "oriented ");
          
          sb.append(" improves security");
          
          s1 = sb.toString();
          
          System.out.println(s1);
        		 
	}

}
