package homework;

public class TrainerManager implements ITrainerService {

	@Override
	public void add(Trainer data) {
		System.out.println(data.getName() + " eklendi");

	}

	@Override
	public void list(Trainer[] data) {

		for (Trainer trainer : data) {
			System.out.println(trainer.getName());
		}
	}

}
