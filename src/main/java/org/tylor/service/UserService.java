package org.tylor.service;

import org.tylor.dto.UserDto;

/**
 * @author liubin10  2018/3/20
 */
public interface UserService {

    void register(UserDto dto);


    void deleteAll();

    boolean checkUserPassword(String userName, String ticket);
}
