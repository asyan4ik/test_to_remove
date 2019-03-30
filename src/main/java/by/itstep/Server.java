package by.itstep;
import static spark.Spark.get;

public class Server {
    public static void main(String[] args){
        get("/hello", (req, res) -> "hello world");
        get("/calc", (req, res) ->{
            int a = Integer.parseInt(req.queryParams("a"));
            int b = Integer.parseInt(req.queryParams("b"));
            return String.valueOf(a+b);
        } );
    }
}
