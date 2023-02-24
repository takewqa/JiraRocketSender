package uz.takewqa.rocket.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class ValidationServiceImpl implements ValidationService{
    private final Logger log = LoggerFactory.getLogger(ValidationServiceImpl.class);
    private final SenderManager senderManager;

    @Inject
    public ValidationServiceImpl(SenderManager senderManager) {
        this.senderManager = senderManager;
    }

    public boolean validate() {
        return senderManager.isValid();
    }
}
