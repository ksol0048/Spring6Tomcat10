package kroryi.spring6tomcat10.sample;


import kroryi.spring6tomcat10.mapper.TimeMapper;
import kroryi.spring6tomcat10.mapper.TimeMapper2;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.sql.DataSource;
import java.sql.Connection;

@Log4j2
@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations = "file:src/main/webapp/WEB-INF/root-context.xml")
public class SampleTests {

    @Autowired
    private SampleService sampleService;

    @Autowired
    private DataSource dataSource;

    @Autowired(required = false)
    private TimeMapper timeMapper;

    @Autowired(required = false)
    private TimeMapper2 timeMapper2;

    @Test
    public void testService() throws Exception {
        log.info(sampleService.toString());
        Assertions.assertNotNull(sampleService);
    }

    @Test
    public void testConnection() throws Exception {
        Connection connection = dataSource.getConnection();
        log.info(connection);
        Assertions.assertNotNull(connection);

        connection.close();
    }

    @Test
    public void testTimeMapper() {
        log.info(timeMapper.getTime());
    }

    @Test
    public void testTimeMapper2() {
        log.info(timeMapper2.getNow());
    }
}
