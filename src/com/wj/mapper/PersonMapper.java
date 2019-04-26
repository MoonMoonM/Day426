package com.wj.mapper;

import com.wj.po.Person;

public interface PersonMapper {
    Person findPersonById(int id);
    Person findPersonById2(int id);
}
