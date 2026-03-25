package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import entity.Feedback;

public interface FeedbackRepository extends JpaRepository<Feedback, Integer> {

}
