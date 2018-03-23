package org.tylor.dao;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.tylor.pojo.UserInfo;

/**
 * @author liubin10  2018/3/20
 */
@Repository
public interface UserInfoDao extends JpaRepository<UserInfo, Long> {
    Optional<UserInfo> findByUserName(String username);
}
