interface Printable{
void print();
default void show()
{
System.out.println("Within Show"); }
}

class trial implements Printable {
public void print()
{
System.out.println("Within Print"); }
}

public class test2{

	public static void main(String[] args) {
trial t = new trial(); t.print();
t.show();
}
}
   