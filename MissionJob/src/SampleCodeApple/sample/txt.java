package SampleCodeApple.sample;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class txt {

    public static void getValuesGET() throws IOException, InterruptedException {

        String fileName = "/Users/niteshnayak/IdeaProjects/MissionJob/src/SampleCodeApple/sample/sample.txt";
        BufferedReader reader = null;
        BufferedReader in = null;
        String readLine = null;
        String ids = null;

        try {
            reader = new BufferedReader(new FileReader(fileName));
            while ((ids = reader.readLine()) != null) {

                System.out.println("For request : " + "https://jsonplaceholder.typicode.com/posts/" + ids);
                URL urlForGetRequest = new URL("https://jsonplaceholder.typicode.com/posts/" + ids);

                HttpURLConnection connection = (HttpURLConnection) urlForGetRequest.openConnection();
                connection.setRequestMethod("GET");
                connection.setRequestProperty("userId", ids); // set userId its a sample here

                int responseCode = 0;
                responseCode = connection.getResponseCode();

                if (responseCode == HttpURLConnection.HTTP_OK) {
                    in = new BufferedReader(
                            new InputStreamReader(connection.getInputStream()));
                    StringBuffer response = new StringBuffer();

                    while ((readLine = in.readLine()) != null) {
                        response.append(readLine);
                    }
                    // print result
                    System.out.println("JSON String Result " + response.toString());
                    //GetAndPost.POSTRequest(response.toString());
                } else {

                    System.out.println("GET NOT WORKED");
                }
            }
        } catch (Exception e) {
            System.out.println("In here");
            if (in != null) {
                in.close();
            }

            if (reader != null) {
                reader.close();
            }
        }

    }

    public static void putRequest() throws IOException{

        String fileName = "/Users/niteshnayak/IdeaProjects/MissionJob/src/SampleCodeApple/sample/sample.txt";
        BufferedReader reader = null;
        BufferedReader in = null;
        String readLine = null;
        String ids = null;

        try {
            reader = new BufferedReader(new FileReader(fileName));
            while ((ids = reader.readLine()) != null) {

                System.out.println("For request : " + "https://jsonplaceholder.typicode.com/posts/23");
                URL urlForGetRequest = new URL("https://jsonplaceholder.typicode.com/posts/23");

                HttpURLConnection connection = (HttpURLConnection) urlForGetRequest.openConnection();
                connection.setRequestMethod("PUT");
                connection.setDoOutput(true);
                connection.setRequestProperty("Content-Type", "application/json");
                connection.setRequestProperty("Accept", "application/json");
                OutputStreamWriter osw = new OutputStreamWriter(connection.getOutputStream());
                osw.write(String.format("{\"pos\":{\"userId\":3,\"id\":23,\"title\":test title,\"body\":test body text}}"));
                osw.flush();
                osw.close(); // set userId its a sample here

                int responseCode = 0;
                responseCode = connection.getResponseCode();
                System.out.println(responseCode);

                if (responseCode == HttpURLConnection.HTTP_OK) {
                    in = new BufferedReader(
                            new InputStreamReader(connection.getInputStream()));
                    StringBuffer response = new StringBuffer();

                    while ((readLine = in.readLine()) != null) {
                        response.append(readLine);
                    }
                    // print result
                    System.out.println("JSON String Result " + response.toString());
                    //GetAndPost.POSTRequest(response.toString());
                } else {

                    System.out.println("GET NOT WORKED");
                }
            }
        } catch (Exception e) {
            System.out.println("In here");
            if (in != null) {
                in.close();
            }

            if (reader != null) {
                reader.close();
            }
        }
    }

    public static void main(String[] args) throws IOException, InterruptedException {
       // getValuesGET();
        putRequest();

    }
}

