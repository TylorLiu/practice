package org.tylor.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tylor.common.ClientException;
import org.tylor.dao.UserInfoDao;
import org.tylor.dto.UserDto;
import org.tylor.pojo.UserInfo;
import org.tylor.service.UserService;
import org.tylor.util.PwdUtil;

/**
 * @author liubin10  2018/3/20
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserInfoDao userInfoDao;

    @Override
    public void register(UserDto dto) {
        this.userInfoDao.findByUserName(dto.getUserName()).ifPresent(x -> {
            throw new ClientException("用户名已存在");
        });
        UserInfo userInfo = new UserInfo();
        BeanUtils.copyProperties(dto, userInfo);
        userInfo.setPassword(PwdUtil.encrypt(dto.getPassword()));
        this.userInfoDao.save(userInfo);
//        if (dto.getUserName().endsWith("6")){
//            throw  new ServerException(ResponseCode.FAIL);
//        }
    }

    @Override
    public boolean checkUserPassword(String userName, String ticket) {
        return PwdUtil.encrypt(ticket).equals(
            this.userInfoDao.findByUserName(userName).orElseGet(UserInfo::new)
                .getPassword());
    }

    @Override
    public void deleteAll() {
        this.userInfoDao.deleteAll();
    }
}
