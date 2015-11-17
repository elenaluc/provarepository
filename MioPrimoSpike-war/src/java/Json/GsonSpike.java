/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Json;

import java.io.IOException;
import java.io.Writer;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

/**
 *
 * @author giovanna
 */
public class GsonSpike {

    public static void main(String[] args) throws IOException {
        try (Writer writer = new OutputStreamWriter(new FileOutputStream("Output.json"), "UTF-8")) {
            Gson gson = new GsonBuilder().create();
            gson.toJson("Hello gio", writer);
            gson.toJson(123, writer);
        }

    }

}
