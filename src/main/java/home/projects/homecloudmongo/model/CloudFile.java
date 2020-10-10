package home.projects.homecloudmongo.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.bson.conversions.Bson;
import org.bson.types.Binary;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "files")
@Getter
@AllArgsConstructor
@Setter
public class CloudFile {

    @Id
    private Long id;
    private String fileName;
    private Binary file;
}
