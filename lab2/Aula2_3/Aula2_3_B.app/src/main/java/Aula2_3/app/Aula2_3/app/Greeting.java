package Aula2_3.app.Aula2_3.app;

public class Greeting {

	private final long id;
	private final String content;

	public Greeting(long id, String content) {
		this.id = id;
		this.content = content;
	}

	public long getId() {
		return id;
	}

	public String getContent() {
		return content;
	}

	public String toString() {
		return "{ \"id\":\"" + this.id + "\",\"content\":\"" + this.content + "\"}";
	}
}
