package com.yadayada1z2a.firstWebApp;

import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface AlbumRepository extends CrudRepository<Album, Long> {

    public List<Album> findByTitle(String title);
}
