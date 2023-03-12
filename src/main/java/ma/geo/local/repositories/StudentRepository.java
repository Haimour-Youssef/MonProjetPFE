package ma.geo.local.repositories;
import ma.geo.local.entities.StudentEntity;
import java.util.List;

public interface StudentRepository {

    long create(StudentEntity e);
    boolean update(StudentEntity e);
    boolean delete(long id);
    List<StudentEntity> read();
}

