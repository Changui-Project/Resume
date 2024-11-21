package dev.portfolio.portfolio.controller;

import dev.portfolio.portfolio.service.ImageService;
import java.io.IOException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/img")
public class ImageController {

    private final ImageService imageService;

    public ImageController(
            @Autowired ImageService imageService
    ) {
        this.imageService = imageService;
    }


    @GetMapping(value = "/{path}", produces = {MediaType.IMAGE_PNG_VALUE, MediaType.IMAGE_JPEG_VALUE})
    public ResponseEntity<byte[]> getImage(
            @PathVariable("path") String path
    ) throws IOException {
        return ResponseEntity.status(HttpStatus.OK).body(imageService.downloadImage(path));
    }
}
