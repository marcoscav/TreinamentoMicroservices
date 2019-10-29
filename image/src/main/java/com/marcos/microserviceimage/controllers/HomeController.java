package com.marcos.microserviceimage.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marcos.microserviceimage.entities.Image;

@RestController
@RequestMapping("/")
public class HomeController {

	@RequestMapping("/images")
	public List<Image> getImages() {
		return Arrays.asList(
				new Image(1L, "Treehouse of Horror V", "https://www.imdb.com/title/tt0096697/mediaviewer/rm3842005760"),
				new Image(2L, "The Town", "https://www.imdb.com/title/tt0096697/mediaviewer/rm3698134272"), new Image(
						3L, "The Last Traction Hero", "https://www.imdb.com/title/tt0096697/mediaviewer/rm1445594112"));
	}
}
