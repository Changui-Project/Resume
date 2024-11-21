package dev.portfolio.portfolio.parser;

import java.io.IOException;
import java.util.List;

public interface JsonParser {

    <T> T parseJsonToDTO(final Class<T> clazz, final String path) throws IOException;
    <T> List<T> parseJsonToDTOList(final Class<T> clazz, final String path) throws IOException;
}
