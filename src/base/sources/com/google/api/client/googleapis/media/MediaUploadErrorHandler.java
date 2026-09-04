package com.google.api.client.googleapis.media;

import com.google.api.client.http.HttpIOExceptionHandler;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpResponse;
import com.google.api.client.http.HttpUnsuccessfulResponseHandler;
import com.google.api.client.util.Preconditions;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
class MediaUploadErrorHandler implements HttpUnsuccessfulResponseHandler, HttpIOExceptionHandler {
    static final Logger LOGGER = Logger.getLogger(MediaUploadErrorHandler.class.getName());
    private final HttpIOExceptionHandler originalIOExceptionHandler;
    private final HttpUnsuccessfulResponseHandler originalUnsuccessfulHandler;
    private final MediaHttpUploader uploader;

    public MediaUploadErrorHandler(MediaHttpUploader mediaHttpUploader, HttpRequest httpRequest) {
        this.uploader = (MediaHttpUploader) Preconditions.checkNotNull(mediaHttpUploader);
        this.originalIOExceptionHandler = httpRequest.getIOExceptionHandler();
        this.originalUnsuccessfulHandler = httpRequest.getUnsuccessfulResponseHandler();
        httpRequest.setIOExceptionHandler(this);
        httpRequest.setUnsuccessfulResponseHandler(this);
    }

    @Override // com.google.api.client.http.HttpIOExceptionHandler
    public boolean handleIOException(HttpRequest httpRequest, boolean z10) {
        HttpIOExceptionHandler httpIOExceptionHandler = this.originalIOExceptionHandler;
        boolean z11 = httpIOExceptionHandler != null && httpIOExceptionHandler.handleIOException(httpRequest, z10);
        if (z11) {
            try {
                this.uploader.serverErrorCallback();
                return z11;
            } catch (IOException e10) {
                LOGGER.log(Level.WARNING, "exception thrown while calling server callback", (Throwable) e10);
            }
        }
        return z11;
    }

    @Override // com.google.api.client.http.HttpUnsuccessfulResponseHandler
    public boolean handleResponse(HttpRequest httpRequest, HttpResponse httpResponse, boolean z10) {
        HttpUnsuccessfulResponseHandler httpUnsuccessfulResponseHandler = this.originalUnsuccessfulHandler;
        boolean z11 = httpUnsuccessfulResponseHandler != null && httpUnsuccessfulResponseHandler.handleResponse(httpRequest, httpResponse, z10);
        if (z11 && z10 && httpResponse.getStatusCode() / 100 == 5) {
            try {
                this.uploader.serverErrorCallback();
                return z11;
            } catch (IOException e10) {
                LOGGER.log(Level.WARNING, "exception thrown while calling server callback", (Throwable) e10);
            }
        }
        return z11;
    }
}
