package com.study.jim.user.dal.persistence;
import com.study.jim.user.dal.entity.User;
public interface UserMapper {

    /**
     *
     * @return
     */
    User getUserByUserName(String userName);

}
