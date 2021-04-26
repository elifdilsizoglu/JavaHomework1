package homework;

public class Course {

	private int id;
	private String name;
	private int trainerId;
	private String code;
	private boolean status;

	public Course() {
		//System.out.println("course çaðýrýldý");

	}

	public Course(int id, String name, int trainerId, boolean status) {
		//this(); // sýnýfý çaðýr 
		this.setId(id);
		this.setName(name);
		this.setTrainerId(trainerId);
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

	public int getTrainerId() {
		return trainerId;
	}

	public void setTrainerId(int trainerId) {
		this.trainerId = trainerId;
	}

	public String getCode() {
		this.code = getName() + String.valueOf(getId());
		return code;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

}
