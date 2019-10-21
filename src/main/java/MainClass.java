import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;
import java.util.List;

public class MainClass {

    public static void main(String[] args) throws IOException {
        System.out.println("Hello World!");
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://jsonplaceholder.typicode.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        ToDoService service = retrofit.create(ToDoService.class);
        List<TODOModel> response = service.listTODOs().execute().body();

        response.forEach(x -> {
            System.out.println(x.title);
        });


    }


}
