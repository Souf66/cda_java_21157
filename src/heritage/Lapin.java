package heritage;

public class Lapin extends Animal {

	public String identifier()
	{
        return super.identifier() +"Je suis un chat";
    }
	public String bondi() {
		return identifier();
	}
}
