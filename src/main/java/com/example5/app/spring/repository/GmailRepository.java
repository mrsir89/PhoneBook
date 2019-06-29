package com.example5.app.spring.repository;

import com.example5.app.spring.entity.GmailContact;

import java.util.List;

public class GmailRepository implements BaseRepository<GmailContact>{

    @Override
    public List<GmailContact> getConteacts() {
        return null;
    }

    @Override
    public GmailContact getContactById(String id) {
        return null;
    }

    @Override
    public void addContact(GmailContact contact) {

    }

    @Override
    public GmailContact deleteByid(String id) {
        return null;
    }
}
