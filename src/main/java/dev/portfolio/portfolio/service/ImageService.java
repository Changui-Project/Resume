package dev.portfolio.portfolio.service;

import java.io.IOException;

public interface ImageService {
    byte[] downloadImage(String path) throws IOException;
}
