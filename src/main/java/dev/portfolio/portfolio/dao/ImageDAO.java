package dev.portfolio.portfolio.dao;

import java.io.IOException;

public interface ImageDAO {
    byte[] readImage(final String path) throws IOException;
}
