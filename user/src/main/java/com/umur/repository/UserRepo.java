package com.umur.repository;

import com.umur.domain.Users;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo  extends CrudRepository<Users,Long> {
}
