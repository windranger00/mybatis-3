package org.apache.ibatis.mysql.dao;

import org.apache.ibatis.mysql.po.Activity;

public interface IActivityDao {

    Activity queryActivityById(Activity activity);

}