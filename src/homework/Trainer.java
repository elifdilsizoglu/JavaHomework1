package homework;

public class Trainer {

	private int id;
	private String name;
	private int departmentId;
	private boolean status;

	public Trainer() {
		// TODO Auto-generated constructor stub
	}

	public Trainer(int id, String name, int department, boolean status) {
		this.setId(id);
		this.setName(name);
		this.setDepartmentId(department);
		this.setStatus(status);

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

}
