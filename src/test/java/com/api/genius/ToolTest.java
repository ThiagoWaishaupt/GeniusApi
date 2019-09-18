package com.api.genius;

import static org.junit.Assert.assertNotNull;

import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.junit.Test;

public class ToolTest {

    @Test
    public void testGetTopMusics() throws IOException, ParseException {
        assertNotNull(Tool.getTopMusics("ChrisBrown"));
    }

}
