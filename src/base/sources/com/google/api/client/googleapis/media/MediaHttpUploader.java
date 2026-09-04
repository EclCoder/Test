package com.google.api.client.googleapis.media;

import com.google.api.client.googleapis.MethodOverride;
import com.google.api.client.http.AbstractInputStreamContent;
import com.google.api.client.http.ByteArrayContent;
import com.google.api.client.http.EmptyContent;
import com.google.api.client.http.GZipEncoding;
import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpContent;
import com.google.api.client.http.HttpHeaders;
import com.google.api.client.http.HttpMethods;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestFactory;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.http.HttpResponse;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.InputStreamContent;
import com.google.api.client.http.MultipartContent;
import com.google.api.client.util.ByteStreams;
import com.google.api.client.util.Preconditions;
import com.google.api.client.util.Sleeper;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class MediaHttpUploader {
    public static final String CONTENT_LENGTH_HEADER = "X-Upload-Content-Length";
    public static final String CONTENT_TYPE_HEADER = "X-Upload-Content-Type";
    public static final int DEFAULT_CHUNK_SIZE = 10485760;
    private static final int KB = 1024;
    static final int MB = 1048576;
    public static final int MINIMUM_CHUNK_SIZE = 262144;
    private Byte cachedByte;
    private InputStream contentInputStream;
    private int currentChunkLength;
    private HttpRequest currentRequest;
    private byte[] currentRequestContentBuffer;
    private boolean directUploadEnabled;
    private boolean disableGZipContent;
    private boolean isMediaContentLengthCalculated;
    private final AbstractInputStreamContent mediaContent;
    private long mediaContentLength;
    private HttpContent metadata;
    private MediaHttpUploaderProgressListener progressListener;
    private final HttpRequestFactory requestFactory;
    private long totalBytesClientSent;
    private long totalBytesServerReceived;
    private final HttpTransport transport;
    private UploadState uploadState = UploadState.NOT_STARTED;
    private String initiationRequestMethod = HttpMethods.POST;
    private HttpHeaders initiationHeaders = new HttpHeaders();
    String mediaContentLengthStr = "*";
    private int chunkSize = DEFAULT_CHUNK_SIZE;
    Sleeper sleeper = Sleeper.DEFAULT;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class ContentChunk {
        private final AbstractInputStreamContent content;
        private final String contentRange;

        ContentChunk(AbstractInputStreamContent abstractInputStreamContent, String str) {
            this.content = abstractInputStreamContent;
            this.contentRange = str;
        }

        AbstractInputStreamContent getContent() {
            return this.content;
        }

        String getContentRange() {
            return this.contentRange;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public enum UploadState {
        NOT_STARTED,
        INITIATION_STARTED,
        INITIATION_COMPLETE,
        MEDIA_IN_PROGRESS,
        MEDIA_COMPLETE
    }

    public MediaHttpUploader(AbstractInputStreamContent abstractInputStreamContent, HttpTransport httpTransport, HttpRequestInitializer httpRequestInitializer) {
        this.mediaContent = (AbstractInputStreamContent) Preconditions.checkNotNull(abstractInputStreamContent);
        this.transport = (HttpTransport) Preconditions.checkNotNull(httpTransport);
        this.requestFactory = httpRequestInitializer == null ? httpTransport.createRequestFactory() : httpTransport.createRequestFactory(httpRequestInitializer);
    }

    private ContentChunk buildContentChunk() throws IOException {
        int i10;
        int i11;
        AbstractInputStreamContent byteArrayContent;
        String str;
        int iMin = isMediaLengthKnown() ? (int) Math.min(this.chunkSize, getMediaContentLength() - this.totalBytesServerReceived) : this.chunkSize;
        if (isMediaLengthKnown()) {
            this.contentInputStream.mark(iMin);
            long j10 = iMin;
            byteArrayContent = new InputStreamContent(this.mediaContent.getType(), ByteStreams.limit(this.contentInputStream, j10)).setRetrySupported(true).setLength(j10).setCloseInputStream(false);
            this.mediaContentLengthStr = String.valueOf(getMediaContentLength());
        } else {
            byte[] bArr = this.currentRequestContentBuffer;
            if (bArr == null) {
                Byte b10 = this.cachedByte;
                i10 = b10 == null ? iMin + 1 : iMin;
                byte[] bArr2 = new byte[iMin + 1];
                this.currentRequestContentBuffer = bArr2;
                if (b10 != null) {
                    bArr2[0] = b10.byteValue();
                }
                i11 = 0;
            } else {
                int i12 = (int) (this.totalBytesClientSent - this.totalBytesServerReceived);
                System.arraycopy(bArr, this.currentChunkLength - i12, bArr, 0, i12);
                Byte b11 = this.cachedByte;
                if (b11 != null) {
                    this.currentRequestContentBuffer[i12] = b11.byteValue();
                }
                i10 = iMin - i12;
                i11 = i12;
            }
            int i13 = ByteStreams.read(this.contentInputStream, this.currentRequestContentBuffer, (iMin + 1) - i10, i10);
            if (i13 < i10) {
                int iMax = i11 + Math.max(0, i13);
                if (this.cachedByte != null) {
                    iMax++;
                    this.cachedByte = null;
                }
                iMin = iMax;
                if (this.mediaContentLengthStr.equals("*")) {
                    this.mediaContentLengthStr = String.valueOf(this.totalBytesServerReceived + ((long) iMin));
                }
            } else {
                this.cachedByte = Byte.valueOf(this.currentRequestContentBuffer[iMin]);
            }
            byteArrayContent = new ByteArrayContent(this.mediaContent.getType(), this.currentRequestContentBuffer, 0, iMin);
            this.totalBytesClientSent = this.totalBytesServerReceived + ((long) iMin);
        }
        this.currentChunkLength = iMin;
        if (iMin == 0) {
            str = "bytes */" + this.mediaContentLengthStr;
        } else {
            str = "bytes " + this.totalBytesServerReceived + "-" + ((this.totalBytesServerReceived + ((long) iMin)) - 1) + "/" + this.mediaContentLengthStr;
        }
        return new ContentChunk(byteArrayContent, str);
    }

    private HttpResponse directUpload(GenericUrl genericUrl) {
        updateStateAndNotifyListener(UploadState.MEDIA_IN_PROGRESS);
        HttpContent contentParts = this.mediaContent;
        if (this.metadata != null) {
            contentParts = new MultipartContent().setContentParts(Arrays.asList(this.metadata, this.mediaContent));
            genericUrl.put("uploadType", "multipart");
        } else {
            genericUrl.put("uploadType", "media");
        }
        HttpRequest httpRequestBuildRequest = this.requestFactory.buildRequest(this.initiationRequestMethod, genericUrl, contentParts);
        httpRequestBuildRequest.getHeaders().putAll(this.initiationHeaders);
        HttpResponse httpResponseExecuteCurrentRequest = executeCurrentRequest(httpRequestBuildRequest);
        try {
            if (isMediaLengthKnown()) {
                this.totalBytesServerReceived = getMediaContentLength();
            }
            updateStateAndNotifyListener(UploadState.MEDIA_COMPLETE);
            return httpResponseExecuteCurrentRequest;
        } catch (Throwable th2) {
            httpResponseExecuteCurrentRequest.disconnect();
            throw th2;
        }
    }

    private HttpResponse executeCurrentRequest(HttpRequest httpRequest) {
        if (!this.disableGZipContent && !(httpRequest.getContent() instanceof EmptyContent)) {
            httpRequest.setEncoding(new GZipEncoding());
        }
        return executeCurrentRequestWithoutGZip(httpRequest);
    }

    private HttpResponse executeCurrentRequestWithoutGZip(HttpRequest httpRequest) {
        new MethodOverride().intercept(httpRequest);
        httpRequest.setThrowExceptionOnExecuteError(false);
        return httpRequest.execute();
    }

    private HttpResponse executeUploadInitiation(GenericUrl genericUrl) {
        updateStateAndNotifyListener(UploadState.INITIATION_STARTED);
        genericUrl.put("uploadType", "resumable");
        HttpContent emptyContent = this.metadata;
        if (emptyContent == null) {
            emptyContent = new EmptyContent();
        }
        HttpRequest httpRequestBuildRequest = this.requestFactory.buildRequest(this.initiationRequestMethod, genericUrl, emptyContent);
        this.initiationHeaders.set(CONTENT_TYPE_HEADER, (Object) this.mediaContent.getType());
        if (isMediaLengthKnown()) {
            this.initiationHeaders.set(CONTENT_LENGTH_HEADER, (Object) Long.valueOf(getMediaContentLength()));
        }
        httpRequestBuildRequest.getHeaders().putAll(this.initiationHeaders);
        HttpResponse httpResponseExecuteCurrentRequest = executeCurrentRequest(httpRequestBuildRequest);
        try {
            updateStateAndNotifyListener(UploadState.INITIATION_COMPLETE);
            return httpResponseExecuteCurrentRequest;
        } catch (Throwable th2) {
            httpResponseExecuteCurrentRequest.disconnect();
            throw th2;
        }
    }

    private long getMediaContentLength() {
        if (!this.isMediaContentLengthCalculated) {
            this.mediaContentLength = this.mediaContent.getLength();
            this.isMediaContentLengthCalculated = true;
        }
        return this.mediaContentLength;
    }

    private long getNextByteIndex(String str) {
        if (str == null) {
            return 0L;
        }
        return Long.parseLong(str.substring(str.indexOf(45) + 1)) + 1;
    }

    private boolean isMediaLengthKnown() {
        return getMediaContentLength() >= 0;
    }

    private HttpResponse resumableUpload(GenericUrl genericUrl) throws IOException {
        HttpResponse httpResponseExecuteUploadInitiation = executeUploadInitiation(genericUrl);
        if (!httpResponseExecuteUploadInitiation.isSuccessStatusCode()) {
            return httpResponseExecuteUploadInitiation;
        }
        try {
            GenericUrl genericUrl2 = new GenericUrl(httpResponseExecuteUploadInitiation.getHeaders().getLocation());
            httpResponseExecuteUploadInitiation.disconnect();
            InputStream inputStream = this.mediaContent.getInputStream();
            this.contentInputStream = inputStream;
            if (!inputStream.markSupported() && isMediaLengthKnown()) {
                this.contentInputStream = new BufferedInputStream(this.contentInputStream);
            }
            while (true) {
                ContentChunk contentChunkBuildContentChunk = buildContentChunk();
                HttpRequest httpRequestBuildPutRequest = this.requestFactory.buildPutRequest(genericUrl2, null);
                this.currentRequest = httpRequestBuildPutRequest;
                httpRequestBuildPutRequest.setContent(contentChunkBuildContentChunk.getContent());
                this.currentRequest.getHeaders().setContentRange(contentChunkBuildContentChunk.getContentRange());
                new MediaUploadErrorHandler(this, this.currentRequest);
                HttpResponse httpResponseExecuteCurrentRequestWithoutGZip = isMediaLengthKnown() ? executeCurrentRequestWithoutGZip(this.currentRequest) : executeCurrentRequest(this.currentRequest);
                try {
                    if (httpResponseExecuteCurrentRequestWithoutGZip.isSuccessStatusCode()) {
                        this.totalBytesServerReceived = getMediaContentLength();
                        if (this.mediaContent.getCloseInputStream()) {
                            this.contentInputStream.close();
                        }
                        updateStateAndNotifyListener(UploadState.MEDIA_COMPLETE);
                        return httpResponseExecuteCurrentRequestWithoutGZip;
                    }
                    if (httpResponseExecuteCurrentRequestWithoutGZip.getStatusCode() != 308) {
                        if (this.mediaContent.getCloseInputStream()) {
                            this.contentInputStream.close();
                        }
                        return httpResponseExecuteCurrentRequestWithoutGZip;
                    }
                    String location = httpResponseExecuteCurrentRequestWithoutGZip.getHeaders().getLocation();
                    if (location != null) {
                        genericUrl2 = new GenericUrl(location);
                    }
                    long nextByteIndex = getNextByteIndex(httpResponseExecuteCurrentRequestWithoutGZip.getHeaders().getRange());
                    long j10 = nextByteIndex - this.totalBytesServerReceived;
                    Preconditions.checkState(j10 >= 0 && j10 <= ((long) this.currentChunkLength));
                    long j11 = ((long) this.currentChunkLength) - j10;
                    if (isMediaLengthKnown()) {
                        if (j11 > 0) {
                            this.contentInputStream.reset();
                            Preconditions.checkState(j10 == this.contentInputStream.skip(j10));
                        }
                    } else if (j11 == 0) {
                        this.currentRequestContentBuffer = null;
                    }
                    this.totalBytesServerReceived = nextByteIndex;
                    updateStateAndNotifyListener(UploadState.MEDIA_IN_PROGRESS);
                    httpResponseExecuteCurrentRequestWithoutGZip.disconnect();
                } catch (Throwable th2) {
                    httpResponseExecuteCurrentRequestWithoutGZip.disconnect();
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            httpResponseExecuteUploadInitiation.disconnect();
            throw th3;
        }
    }

    private void updateStateAndNotifyListener(UploadState uploadState) {
        this.uploadState = uploadState;
        MediaHttpUploaderProgressListener mediaHttpUploaderProgressListener = this.progressListener;
        if (mediaHttpUploaderProgressListener != null) {
            mediaHttpUploaderProgressListener.progressChanged(this);
        }
    }

    public int getChunkSize() {
        return this.chunkSize;
    }

    public boolean getDisableGZipContent() {
        return this.disableGZipContent;
    }

    public HttpHeaders getInitiationHeaders() {
        return this.initiationHeaders;
    }

    public String getInitiationRequestMethod() {
        return this.initiationRequestMethod;
    }

    public HttpContent getMediaContent() {
        return this.mediaContent;
    }

    public HttpContent getMetadata() {
        return this.metadata;
    }

    public long getNumBytesUploaded() {
        return this.totalBytesServerReceived;
    }

    public double getProgress() {
        Preconditions.checkArgument(isMediaLengthKnown(), "Cannot call getProgress() if the specified AbstractInputStreamContent has no content length. Use  getNumBytesUploaded() to denote progress instead.");
        if (getMediaContentLength() == 0) {
            return 0.0d;
        }
        return this.totalBytesServerReceived / getMediaContentLength();
    }

    public MediaHttpUploaderProgressListener getProgressListener() {
        return this.progressListener;
    }

    public Sleeper getSleeper() {
        return this.sleeper;
    }

    public HttpTransport getTransport() {
        return this.transport;
    }

    public UploadState getUploadState() {
        return this.uploadState;
    }

    public boolean isDirectUploadEnabled() {
        return this.directUploadEnabled;
    }

    void serverErrorCallback() {
        Preconditions.checkNotNull(this.currentRequest, "The current request should not be null");
        this.currentRequest.setContent(new EmptyContent());
        this.currentRequest.getHeaders().setContentRange("bytes */" + this.mediaContentLengthStr);
    }

    public MediaHttpUploader setChunkSize(int i10) {
        Preconditions.checkArgument(i10 > 0 && i10 % MINIMUM_CHUNK_SIZE == 0, "chunkSize must be a positive multiple of 262144.");
        this.chunkSize = i10;
        return this;
    }

    public MediaHttpUploader setDirectUploadEnabled(boolean z10) {
        this.directUploadEnabled = z10;
        return this;
    }

    public MediaHttpUploader setDisableGZipContent(boolean z10) {
        this.disableGZipContent = z10;
        return this;
    }

    public MediaHttpUploader setInitiationHeaders(HttpHeaders httpHeaders) {
        this.initiationHeaders = httpHeaders;
        return this;
    }

    public MediaHttpUploader setInitiationRequestMethod(String str) {
        Preconditions.checkArgument(str.equals(HttpMethods.POST) || str.equals(HttpMethods.PUT) || str.equals(HttpMethods.PATCH));
        this.initiationRequestMethod = str;
        return this;
    }

    public MediaHttpUploader setMetadata(HttpContent httpContent) {
        this.metadata = httpContent;
        return this;
    }

    public MediaHttpUploader setProgressListener(MediaHttpUploaderProgressListener mediaHttpUploaderProgressListener) {
        this.progressListener = mediaHttpUploaderProgressListener;
        return this;
    }

    public MediaHttpUploader setSleeper(Sleeper sleeper) {
        this.sleeper = sleeper;
        return this;
    }

    public HttpResponse upload(GenericUrl genericUrl) {
        Preconditions.checkArgument(this.uploadState == UploadState.NOT_STARTED);
        return this.directUploadEnabled ? directUpload(genericUrl) : resumableUpload(genericUrl);
    }
}
