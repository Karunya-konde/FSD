package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.AlbumRepository;
import com.example.demo.entity.Album;
import com.fasterxml.jackson.annotation.JsonIgnore;
@Service
public class AlbumServiceImpl implements AlbumService {
	@Autowired
	private AlbumRepository albumRepository;
	@Override
	@Transactional
	
	public List<Album> getAllAlbums() {
		// TODO Auto-generated method stub
		return albumRepository.findAll();
	}
	@Transactional
	@Override
	public void createAlbum(Album album) {
		albumRepository.save(album);

	}
	@Transactional
	@Override

	public Optional<Album> getAlbumById(int theId) {
		// TODO Auto-generated method stub
		Optional<Album> album=albumRepository.findById(theId);
		return album;
	}

}