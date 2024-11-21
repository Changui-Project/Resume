package dev.portfolio.portfolio.service.impl;

import dev.portfolio.portfolio.dao.ImageDAO;
import dev.portfolio.portfolio.service.ImageService;
import java.io.IOException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImageServiceImpl implements ImageService {

    private final ImageDAO imageDAO;

    public ImageServiceImpl(
            @Autowired final ImageDAO imageDAO
    ) {
        this.imageDAO = imageDAO;
    }

    @Override
    public byte[] downloadImage(String path) throws IOException {
        return imageDAO.readImage(path);
    }
}
