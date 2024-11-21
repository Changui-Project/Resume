package dev.portfolio.portfolio.parser.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import dev.portfolio.portfolio.parser.JsonParser;
import java.io.IOException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;

@Component
public class JsonParserImpl implements JsonParser {

    private static final String JSON_PATH_FORMAT = "classpath:data/%s";
    private final ObjectMapper objectMapper;
    private final ResourceLoader resourceLoader;

    public JsonParserImpl(
            @Autowired ObjectMapper objectMapper,
            @Autowired ResourceLoader resourceLoader
    ) {
        this.objectMapper = objectMapper;
        this.resourceLoader = resourceLoader;
    }

    @Override
    public <T> T parseJsonToDTO(final Class<T> clazz, final String path) throws IOException {
        Resource resource = resourceLoader.getResource(String.format(JSON_PATH_FORMAT, path));
        return objectMapper.readValue(resource.getFile(), clazz);
    }

    @Override
    public <T> List<T> parseJsonToDTOList(final Class<T> clazz, final String path) throws IOException {
        Resource resource = resourceLoader.getResource(String.format(JSON_PATH_FORMAT, path));
        return objectMapper.readValue(resource.getInputStream(),
                objectMapper.getTypeFactory().constructCollectionType(List.class, clazz));
    }
}
