package ekam.example.api.gorestGetUser;

import lombok.Data;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


@Data
public class JsonCovertor {

    public static void main(String[] args) throws IOException, ParseException {

        JSONParser jsonParser = new JSONParser();


        Object object = jsonParser.parse(new FileReader("/Users/testvagrant/NewEkamProject/src/test/resources/api/data.json"));
        ArrayList <JSONObject> jsonObject = (ArrayList<JSONObject>) object;

        for (JSONObject obj : jsonObject) {
            System.out.println(obj.get("name"));
        }

    }
}
