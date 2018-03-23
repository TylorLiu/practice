package org.tylor.task;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.tylor.dto.UserDto;
import org.tylor.service.UserService;

/**
 * @author liubin10  2018/3/21
 */

@Async
//@Component
@Slf4j
public class ScheduledTask {
    @Autowired
    UserService userService;

//    @Transactional()
    @Scheduled(initialDelay = 1000,fixedDelay = 100*1000)
    public void register(){
        userService.deleteAll();
        for (int i = 0; i <10000 ; i++) {
            try {
                UserDto dto = new UserDto();
                dto.setUserName("user_"+i);
                dto.setPassword("password_"+i);
                userService.register(dto);
                log.info("register "+dto.getUserName());
            }catch (RuntimeException e){
                log.error("",e);
            }

        }
    }


}
