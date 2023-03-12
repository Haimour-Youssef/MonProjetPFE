package ma.geo.local.conrollers;
import ma.geo.local.dtos.StudentDtos;
import ma.geo.local.repositories.StudentRepositoryIml;
import ma.geo.local.services.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.hibernate.tool.schema.SchemaToolingLogging.LOGGER;

@RestController
@RequestMapping("/student")
public class StudentController {
    private final static Logger LOG =  LoggerFactory.getLogger(StudentController.class);

    private StudentService service;
    StudentController(StudentService service){
        this.service = service;
    }

    @PostMapping ("/save")
    public StudentDtos save(@RequestBody StudentDtos dtos){
        LOGGER.debug("Debut save deto:{}");
        long id = service.create(dtos);
        LOG.debug("Fin methode create");
        return dtos;
    }

    @PutMapping
    public boolean update(@RequestBody StudentDtos dtos){
        LOGGER.debug("Debut methode update");
        boolean id = service.update(dtos);
        LOG.debug("Fin methode update");
        return service.update(dtos);
    }

    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable("id") long id){
        LOGGER.debug("Debut methode delete");
        LOGGER.debug("Fin methode delete");
        return service.delete(id);
    }

    @GetMapping
    public List<StudentDtos> readAll(){
        LOG.debug("Debut methode update");
        LOG.debug("Fin methode update");
        return service.readAll();
    }


}
