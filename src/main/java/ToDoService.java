import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

import java.util.List;

public interface ToDoService {
    @GET("TODOS")
    Call<List<TODOModel>> listTODOs();
}
