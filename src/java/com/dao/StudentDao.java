package com.dao;

import org.springframework.stereotype.Repository;

/**
 * Created by Administrator on 2018/7/8
 */
@Repository
public interface StudentDao {
   String getName(String id);
}
