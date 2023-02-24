package uz.takewqa.rocket.service;

import com.atlassian.plugin.spring.scanner.annotation.export.ExportAsService;
import uz.takewqa.rocket.request.RequestBody;
import uz.takewqa.rocket.response.ResponseBody;

import javax.annotation.Nonnull;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.IOException;

@Named
@ExportAsService(RocketSender.class)
public class RocketSender {
    private final SenderManager senderManager;

    @Inject
    public RocketSender(SenderManager senderManager) {
        this.senderManager = senderManager;
    }

    public ResponseBody sendMessage(@Nonnull RequestBody requestBody) throws IOException, InterruptedException {
        return senderManager.sendMessage(requestBody);
    }
}
