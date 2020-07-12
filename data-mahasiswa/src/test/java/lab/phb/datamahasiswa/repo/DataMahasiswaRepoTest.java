package lab.phb.datamahasiswa.repo;

import lab.phb.datamahasiswa.entity.DataMahasiswa;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import java.util.List;

@SpringBootTest
public class DataMahasiswaRepoTest {
    @Autowired
    private DataMahasiswaRepo repo;

    private Logger logger = LoggerFactory.getLogger(DataMahasiswaRepoTest.class);

    @Test
    public void findAllTest() {
        List<DataMahasiswa> result = repo.findAll();
        logger.info("Jumlah data : " + result.size());
        Assert.notEmpty(result);
    }
}
