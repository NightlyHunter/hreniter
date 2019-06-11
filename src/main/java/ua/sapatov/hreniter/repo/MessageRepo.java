package ua.sapatov.hreniter.repo;

import org.springframework.data.repository.CrudRepository;
import ua.sapatov.hreniter.domain.Message;

public interface MessageRepo extends CrudRepository<Message, Long> {
}
