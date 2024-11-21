package dev.portfolio.portfolio.dao.impl;

import dev.portfolio.portfolio.dao.ImageDAO;
import java.io.IOException;
import java.io.InputStream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Repository;

@Repository
public class ImageDAOImpl implements ImageDAO {
    private static final String IMAGE_PATH_FORMAT = "classpath:images/%s";
    private final ResourceLoader resourceLoader;

    public ImageDAOImpl(
            @Autowired final ResourceLoader resourceLoader
    ) {
        this.resourceLoader = resourceLoader;
    }

    @Override
    public byte[] readImage(String path) throws IOException {
        Resource resource = resourceLoader.getResource(String.format(IMAGE_PATH_FORMAT, path));
        InputStream inputStream = resource.getInputStream();
        return inputStream.readAllBytes();
    }
}
