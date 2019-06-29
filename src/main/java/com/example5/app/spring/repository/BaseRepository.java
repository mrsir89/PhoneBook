package com.example5.app.spring.repository;

import com.example5.app.spring.entity.BaseContact;

import java.util.List;

public interface BaseRepository <T extends BaseContact> {// basecontact에서 파생된 모든것
    List<T> getConteacts();

    T getContactById(String id);

    void addContact(T contact);

    T deleteByid(String id);




}
