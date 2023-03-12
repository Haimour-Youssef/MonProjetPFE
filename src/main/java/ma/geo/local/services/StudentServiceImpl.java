package ma.geo.local.services;

import ma.geo.local.dtos.StudentDtos;
import ma.geo.local.entities.StudentEntity;
import ma.geo.local.repositories.StudentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;


import java.util.List;


@Service
    public class StudentServiceImpl implements StudentService {
    private final static Logger LOG = LoggerFactory.getLogger(StudentService.class);
    private StudentRepository repository;

    public StudentServiceImpl(StudentRepository repository) {
        this.repository = repository;
    }

    @Override
    public Long create(StudentDtos dto) {
        LOG.debug("Debut methode create");
        long reslt = repository.create(null);
        return reslt;
    }

    @Override
    public boolean update(StudentDtos dto) {
        LOG.debug("Debut methode update");
        boolean res = repository.update(null);
        return res;
    }

    @Override
    public boolean delete(Long id) {
        LOG.debug("Debut methode delete");
        return repository.delete(id);
    }

    @Override
    public List<StudentDtos> readAll(){ LOG.debug("Debut methode list");
        return null;
    }


}
