package com.ddh.swagger.repository;

import com.ddh.swagger.bean.UserBean;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * user repository
 */
public interface UserRepository extends JpaRepository<UserBean, Long> {
}
