package dev.portfolio.portfolio.service.impl;

import dev.portfolio.portfolio.service.ImageService;
import java.io.IOException;
import java.io.InputStream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

@Service
public class ImageServiceImpl implements ImageService {

    private static final String IMAGE_PATH_FORMAT = "classpath:images/%s";
    private final ResourceLoader resourceLoader;

    public ImageServiceImpl(
            @Autowired final ResourceLoader resourceLoader
    ){
        this.resourceLoader = resourceLoader;
    }

    @Override
    public byte[] downloadImage(String path) throws IOException {
        Resource resource = resourceLoader.getResource(String.format(IMAGE_PATH_FORMAT, path));
        InputStream inputStream = resource.getInputStream();
        return inputStream.readAllBytes();
    }
}
