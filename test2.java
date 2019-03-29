import java.util.StringTokenizer;
public class test2 {
public static void main(String[] args) {
String str = "http://www.java.com/strings";
StringTokenizer st = new StringTokenizer(str, "://");
for (int i = 0; st.hasMoreTokens(); i++) System.out.println("#" + i + ": " +
st.nextToken());
String[] split1 = str.split("://");
for (int i = 0; i < split1.length; i++) System.out.println("#" + i + ": " + split1[i]);
String[] split2 = str.split(":|//|/");
for (int i = 0; i < split2.length; i++) System.out.println("#" + i + ": " + split2[i]);
}
}