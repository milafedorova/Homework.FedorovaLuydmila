package homework10;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

public class okhttpDemo {
    public static void main(String[] args) throws IOException {
        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
                .url("https://google.com")
                .build();

        Response response = client.newCall(request).execute();
        System.out.println(response.code());
        System.out.println(response.body().string());

    }
}
