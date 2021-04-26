package homework;

public class CourseManager implements ICourseService {

	@Override
	public void add(Course data) {
		System.out.println(data.getName() + " eklendi");

	}

	@Override
	public void list(Course[] data) {

		for (Course course : data) {
			System.out.println(course.getName());
		}

	}

}
