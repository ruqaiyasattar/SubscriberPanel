package ha.ecz.com.subscriberpanel.Utils;

import android.util.Log;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLEncoder;
import java.sql.Connection;
import java.util.HashMap;
import java.util.Map;

public class Parser {
    public static String Get(String uri){

        BufferedReader reader = null;

        try {

            HttpURLConnection con = GetConnection(uri,"GET");
            InputStreamReader streamReader = new InputStreamReader(con.getInputStream());
            reader = new BufferedReader(streamReader);
            StringBuilder sb = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null){
                sb.append(line+"\n");
            }
            return sb.toString();

        }catch (Exception e){
            e.printStackTrace();
            return null;
        }finally {
            if (reader != null){
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                    return null;
                }
            }
        }

    }
    public static String Post(String URL, HashMap<String, Object> map) {
        String response = "";
        try {
            HttpURLConnection con = GetConnection(URL,"POST");
            OutputStream output = con.getOutputStream();
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(output, "UTF-8"));
            String postDataString = JsonFormatter(map);
            writer.write(postDataString);
            writer.flush();
            writer.close();
            output.close();

            // int responseCode = conn.getResponseCode();
            //if (responseCode == HttpsURLConnection.HTTP_OK) {
            //if(responseMsg !=null){
            String line;
            BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
            while ((line = br.readLine()) != null) {
                response += line;
            }
//            } else {
//                response = "";
//            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return response;
    }
    private static String JsonFormatter(HashMap<String, Object> params) throws UnsupportedEncodingException {
        StringBuilder result = new StringBuilder();
        boolean first = true;
        for (Map.Entry<String, Object> entry : params.entrySet()) {
            if (first)
                first = false;
            else
                result.append("&");

            result.append(URLEncoder.encode(entry.getKey(), "UTF-8"));
            result.append("=");
            result.append(URLEncoder.encode(String.valueOf(entry.getValue()), "UTF-8"));
        }

        return result.toString();
    }
    private static HttpURLConnection GetConnection(String uri,String type){
        URL url = null;
        HttpURLConnection conn = null;
        try {
            url = new URL(uri);
            conn = (HttpURLConnection) url.openConnection();
            if(type == "POST") {
                conn.setRequestMethod(type);
                conn.setDoInput(true);
                conn.setDoOutput(true);
            }
//            conn.setReadTimeout(15000);
//        conn.setConnectTimeout(15000);

            conn.connect();
        }
         catch (IOException e) {
            e.printStackTrace();
        }
        return  conn;
    }
}
