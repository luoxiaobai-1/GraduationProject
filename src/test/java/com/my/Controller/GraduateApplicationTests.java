package com.my.Controller;



import com.my.Mapper.UserDAO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
@Slf4j
class GraduateApplicationTests {
    @Autowired
    UserDAO dao;

    @Test
public  void  tets(){
       dao.selectById(1);



}

}
