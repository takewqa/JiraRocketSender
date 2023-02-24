package uz.takewqa.rocket.service.http;

import uz.takewqa.rocket.auth.LoginResult;
import uz.takewqa.rocket.request.RequestBody;
import uz.takewqa.rocket.response.ResponseBody;

import java.io.IOException;

public interface HttpService {
    LoginResult login() throws IOException, InterruptedException;

    ResponseBody send(RequestBody requestBody) throws IOException, InterruptedException;
}
