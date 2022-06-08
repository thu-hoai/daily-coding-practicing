package org.example.loggerAOP;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

@ExtendWith(SpringExtension.class)
class LoggerAOPTest {

    @InjectMocks
    private NameRepository nameRepository;

    @Test
    void test() {
        System.out.println("Test");
      List<String> names = nameRepository.getNames();
      System.out.println(names);
    }
}
