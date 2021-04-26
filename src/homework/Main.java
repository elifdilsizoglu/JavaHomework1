package homework;

public class Main {

	public static void main(String[] args) {

		Course course1 = new Course(1, "java", 1, true);
		Course course2 = new Course();
		course2.setId(2);
		course2.setName("c#");
		course2.setTrainerId(2);
		course2.setStatus(true);

		Trainer trainer1 = new Trainer(1, "rahim", 1, true);
		Trainer trainer2 = new Trainer(2, "elif", 2, false);
		Trainer trainer3 = new Trainer();
		trainer3.setId(3);
		trainer3.setName("gözde");
		trainer3.setDepartmentId(3);
		trainer3.setStatus(true);

		Course[] courses = { course1, course2 };

		Trainer[] trainers = { trainer1, trainer2, trainer3 };

		TrainerManager trainerManager = new TrainerManager();
		trainerManager.add(trainer3);
		trainerManager.list(trainers);

		CourseManager courseManager = new CourseManager();
		courseManager.add(course1);
		courseManager.list(courses);

	}

}
