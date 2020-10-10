package home.projects.homecloudmongo.repository;

import home.projects.homecloudmongo.model.CloudFile;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CloudFileRepository extends MongoRepository<CloudFile, Long> {
}
