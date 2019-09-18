package com.api.genius.resource;

import java.io.IOException;
import java.util.List;

import org.json.simple.parser.ParseException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.genius.Tool;

@RestController
@RequestMapping(value = "api")
public class MusicResource {

    @GetMapping("/artist/{name}")
    public List<String> topMusics(@PathVariable(value = "name") final String name) throws IOException, ParseException {

        return Tool.getTopMusics(name);
    }

}
