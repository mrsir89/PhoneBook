package com.example5.app.spring.repository;

import com.example5.app.spring.entity.FileContact;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class FileRepository implements BaseRepository<FileContact> {

    private final String filePath;

    public FileRepository(String filePath) {
        this.filePath = filePath;
    }


    @Override
    public List<FileContact> getConteacts() {
        return null;
    }

    @Override
    public FileContact getContactById(String id) {
        return null;
    }

    @Override
    public void addContact(FileContact contact) {

    }

    @Override
    public FileContact deleteByid(String id) {
        return null;
    }

}


