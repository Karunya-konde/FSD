package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Album;

public interface AlbumRepository extends JpaRepository<Album,Integer>{

}