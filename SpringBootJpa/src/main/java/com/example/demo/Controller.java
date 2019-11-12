package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Album;
import com.example.demo.entity.Image;
import com.example.demo.service.AlbumService;
import com.example.demo.service.ImageService;
import com.example.demo.entity.Album;
@RestController
@RequestMapping("/api")
public class Controller {

	private ImageService imageService;
	public Controller() {
		super();
	}
	private AlbumService albumService;
	@Autowired
	public Controller(ImageService imageService,AlbumService albumService) {
		super();
		this.imageService = imageService;
		this.albumService = albumService;
	}
	@GetMapping("/images")
	public List<Image> list()

	{
		return imageService.getAllImages();
	}
	@PostMapping("/images")
	public void save(@RequestBody Image image){
		imageService.createImage(image);
		
	}
	@GetMapping("/images/{id}")
	public Optional<Image> find(@PathVariable int id)
	{
		return imageService.getImageById(id);
	}
	@PostMapping("/album")
	public void saveAlbum(@RequestBody Album album){
		albumService.createAlbum(album);
		
	}
	@GetMapping("/album")
	public List<Album> listAlbum()

	{
		return albumService.getAllAlbums();
	}
}