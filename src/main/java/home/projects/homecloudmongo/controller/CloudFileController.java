package home.projects.homecloudmongo.controller;

import home.projects.homecloudmongo.model.CloudFile;
import home.projects.homecloudmongo.repository.CloudFileRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v2/")
public class CloudFileController {

    private final CloudFileRepository cloudFileRepository;

    @GetMapping("/files")
    public List<String> getFiles(){
        List<CloudFile> files = cloudFileRepository.findAll();
        return files.stream()
                .map(CloudFile::getFileName)
                .collect(Collectors.toList());
    }

//    @PostMapping("/file")
//    public ResponseEntity addFile(@RequestParam("fileName") String filename, )
}
