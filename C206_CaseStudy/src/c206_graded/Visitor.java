package c206_graded;

public class Visitor extends Item {
	private int hpno;
	private String email;
	private boolean isAvailable;
	
	public Visitor(String id, String name, int hpno, String email, boolean isAvailable) {
		super(id, name);
		this.hpno = hpno;
		this.email = email;
		this.isAvailable = isAvailable;
	}

	public int getHpno() {
		return hpno;
	}

	public void setHpno(int hpno) {
		this.hpno = hpno;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
}