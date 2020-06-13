package ge.edu.btu.giorgi.gordiashvili.currency;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ChatBotService {
    public static String answer(String title){
        String result = "";
        String url = "http://localhost:8080/giorgi_gordiashvili_davaleba_1_war_exploded/api/currency/";
        System.out.println(1);
        if (title.equals("all")){
            result = getCurrency( "http://localhost:8080/giorgi_gordiashvili_davaleba_1_war_exploded/api/currencies");
        }else{
            result = getCurrency(url + title);
        }
        return result;
    }

    public static String getCurrency(String endpoint){
        String result = "";

        try {
            URL url = new URL(endpoint);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("accept", "application/json");
            if (conn.getResponseCode() != 200) {
                throw new RuntimeException("Failed http error code" + conn.getResponseCode());
            }
            BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));
            String output;
            System.out.println("Output from server \n");
            while ((output = br.readLine()) != null) {
                result = output;
                System.out.println(output);
            }
            conn.disconnect();
        }catch (Exception n) {
            System.out.println(n);
        }
        return result;



    }
}

