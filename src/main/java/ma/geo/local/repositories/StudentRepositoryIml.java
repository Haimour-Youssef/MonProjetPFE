package ma.geo.local.repositories;

import ma.geo.local.entities.StudentEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class StudentRepositoryIml implements StudentRepository{
    private final static Logger LOG =  LoggerFactory.getLogger(StudentRepositoryIml.class);

    StudentEntity e = new StudentEntity();

    @Override
    public long create(StudentEntity e) {
        LOG.debug("Debut methode create");
        return 10;
    }

    @Override
    public boolean update(StudentEntity e) {
        LOG.debug("Debut methode update");
        return true;
    }

    @Override
    public boolean delete(long id) {
        LOG.debug("Debut methode delete");
        return true;
    }

    @Override
    public List<StudentEntity> read() {
        LOG.debug("Debut methode update");
        LOG.debug("Debut methode delete");
        return new ArrayList<>();
    }

}
