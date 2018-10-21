package com.example.demo.dao;

import com.example.demo.entity.Album;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AlbumRepository extends CrudRepository<Album, Integer> {

    @Query("select a from Album a order by a.collectionNumber desc ")
    List<Album> findHotAlbue();

}
