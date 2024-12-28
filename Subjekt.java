
public interface Subjekt {
	public void registriereObserver();
	public void entferneObserver();
	public void benachrichtigeObserver(Antrag antrag, String action);
}
