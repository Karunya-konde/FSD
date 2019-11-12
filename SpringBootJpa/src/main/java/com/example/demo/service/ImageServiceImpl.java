package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.example.demo.dao.AlbumRepository;
import com.example.demo.dao.ImageRepository;
import com.example.demo.entity.Album;
import com.example.demo.entity.Image;
import com.example.demo.service.ImageService;
@Service
public class ImageServiceImpl implements ImageService {
	private ImageRepository imageRepository;
	
	public ImageServiceImpl(ImageRepository imageRepository) {
		super();
		this.imageRepository = imageRepository;
	}
	@Override
	@Transactional
	public void createImage(Image image) {
		imageRepository.save(image);
	}
	@Override
	@Transactional
	public List<Image> getAllImages() {
		// TODO Auto-generated method stub
		return imageRepository.findAll();
	}
	@Override
	@Transactional
	public Optional<Image> getImageById(int theId) {
		// TODO Auto-generated method stub
		Optional<Image> image=imageRepository.findById(theId);
		return image;
	}
	

}