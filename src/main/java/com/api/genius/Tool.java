package com.api.genius;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.parser.ParseException;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonPrimitive;

public class Tool {

    public static List<String> getTopMusics(final String artist) throws IOException, ParseException {

        final List<String> musicList = new ArrayList<String>();

        // URL
        final String url_str = "https://api.genius.com/search?q=" + artist + "&page=1&per_page=10&access_token=_71vymn8WxMe80K5rEytKgjE2wsTuYYiuRu6yLfXt3YsslJi6DLBVy6NDqI2aIu3";
        final URL url = new URL(url_str);
        final HttpURLConnection request = (HttpURLConnection) url.openConnection();
        request.connect();

        // Conversor para Json
        final JsonParser jp = new JsonParser();
        final JsonElement root = jp.parse(new InputStreamReader((InputStream) request.getContent()));
        final JsonObject jsonobj = root.getAsJsonObject();
        final JsonObject response = (JsonObject) jsonobj.get("response");
        final JsonArray hits = (JsonArray) response.get("hits");

        for (int i = 0; i < 10; i++) {
            final JsonObject highlights = (JsonObject) hits.get(i);
            final JsonObject result = (JsonObject) highlights.get("result");
            final JsonPrimitive full_title = (JsonPrimitive) result.get("full_title");

            musicList.add(full_title.toString());
        }

        return musicList;

    }

}
