package dog_shopping_proj.action;

public class ActionForward {
	private String path;
	private boolean Redirect;
	
	public ActionForward() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ActionForward(String path, boolean redirect) {
		super();
		this.path = path;
		this.Redirect = redirect;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public boolean isRedirect() {
		return Redirect;
	}

	public void setRedirect(boolean redirect) {
		Redirect = redirect;
	}
	
	
}
