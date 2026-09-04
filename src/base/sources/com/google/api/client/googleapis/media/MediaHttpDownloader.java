package com.google.api.client.googleapis.media;

import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpHeaders;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestFactory;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.http.HttpResponse;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.util.Preconditions;
import java.io.IOException;
import java.io.OutputStream;
import sc.j;
import vc.a;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class MediaHttpDownloader {
    public static final int MAXIMUM_CHUNK_SIZE = 33554432;
    private long bytesDownloaded;
    private long mediaContentLength;
    private MediaHttpDownloaderProgressListener progressListener;
    private final HttpRequestFactory requestFactory;
    private final HttpTransport transport;
    private boolean directDownloadEnabled = false;
    private int chunkSize = MAXIMUM_CHUNK_SIZE;
    private DownloadState downloadState = DownloadState.NOT_STARTED;
    private long lastBytePos = -1;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public enum DownloadState {
        NOT_STARTED,
        MEDIA_IN_PROGRESS,
        MEDIA_COMPLETE
    }

    public MediaHttpDownloader(HttpTransport httpTransport, HttpRequestInitializer httpRequestInitializer) {
        this.transport = (HttpTransport) Preconditions.checkNotNull(httpTransport);
        this.requestFactory = httpRequestInitializer == null ? httpTransport.createRequestFactory() : httpTransport.createRequestFactory(httpRequestInitializer);
    }

    private HttpResponse executeCurrentRequest(long j10, GenericUrl genericUrl, HttpHeaders httpHeaders, OutputStream outputStream) throws IOException {
        HttpRequest httpRequestBuildGetRequest = this.requestFactory.buildGetRequest(genericUrl);
        if (httpHeaders != null) {
            httpRequestBuildGetRequest.getHeaders().putAll(httpHeaders);
        }
        if (this.bytesDownloaded != 0 || j10 != -1) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("bytes=");
            sb2.append(this.bytesDownloaded);
            sb2.append("-");
            if (j10 != -1) {
                sb2.append(j10);
            }
            httpRequestBuildGetRequest.getHeaders().setRange(sb2.toString());
        }
        HttpResponse httpResponseExecute = httpRequestBuildGetRequest.execute();
        try {
            a.b(httpResponseExecute.getContent(), outputStream);
            return httpResponseExecute;
        } finally {
            httpResponseExecute.disconnect();
        }
    }

    private long getNextByteIndex(String str) {
        if (str == null) {
            return 0L;
        }
        return Long.parseLong(str.substring(str.indexOf(45) + 1, str.indexOf(47))) + 1;
    }

    private void setMediaContentLength(String str) {
        if (str != null && this.mediaContentLength == 0) {
            this.mediaContentLength = Long.parseLong(str.substring(str.indexOf(47) + 1));
        }
    }

    private void updateStateAndNotifyListener(DownloadState downloadState) {
        this.downloadState = downloadState;
        MediaHttpDownloaderProgressListener mediaHttpDownloaderProgressListener = this.progressListener;
        if (mediaHttpDownloaderProgressListener != null) {
            mediaHttpDownloaderProgressListener.progressChanged(this);
        }
    }

    public void download(GenericUrl genericUrl, OutputStream outputStream) {
        download(genericUrl, null, outputStream);
    }

    public int getChunkSize() {
        return this.chunkSize;
    }

    public DownloadState getDownloadState() {
        return this.downloadState;
    }

    public long getLastBytePosition() {
        return this.lastBytePos;
    }

    public long getNumBytesDownloaded() {
        return this.bytesDownloaded;
    }

    public double getProgress() {
        long j10 = this.mediaContentLength;
        if (j10 == 0) {
            return 0.0d;
        }
        return this.bytesDownloaded / j10;
    }

    public MediaHttpDownloaderProgressListener getProgressListener() {
        return this.progressListener;
    }

    public HttpTransport getTransport() {
        return this.transport;
    }

    public boolean isDirectDownloadEnabled() {
        return this.directDownloadEnabled;
    }

    public MediaHttpDownloader setBytesDownloaded(long j10) {
        Preconditions.checkArgument(j10 >= 0);
        this.bytesDownloaded = j10;
        return this;
    }

    public MediaHttpDownloader setChunkSize(int i10) {
        Preconditions.checkArgument(i10 > 0 && i10 <= 33554432);
        this.chunkSize = i10;
        return this;
    }

    public MediaHttpDownloader setContentRange(long j10, long j11) {
        Preconditions.checkArgument(j11 >= j10);
        setBytesDownloaded(j10);
        this.lastBytePos = j11;
        return this;
    }

    public MediaHttpDownloader setDirectDownloadEnabled(boolean z10) {
        this.directDownloadEnabled = z10;
        return this;
    }

    public MediaHttpDownloader setProgressListener(MediaHttpDownloaderProgressListener mediaHttpDownloaderProgressListener) {
        this.progressListener = mediaHttpDownloaderProgressListener;
        return this;
    }

    public void download(GenericUrl genericUrl, HttpHeaders httpHeaders, OutputStream outputStream) {
        Preconditions.checkArgument(this.downloadState == DownloadState.NOT_STARTED);
        genericUrl.put("alt", "media");
        if (this.directDownloadEnabled) {
            updateStateAndNotifyListener(DownloadState.MEDIA_IN_PROGRESS);
            long jLongValue = ((Long) j.a(executeCurrentRequest(this.lastBytePos, genericUrl, httpHeaders, outputStream).getHeaders().getContentLength(), Long.valueOf(this.mediaContentLength))).longValue();
            this.mediaContentLength = jLongValue;
            this.bytesDownloaded = jLongValue;
            updateStateAndNotifyListener(DownloadState.MEDIA_COMPLETE);
            return;
        }
        while (true) {
            long jMin = (this.bytesDownloaded + ((long) this.chunkSize)) - 1;
            long j10 = this.lastBytePos;
            if (j10 != -1) {
                jMin = Math.min(j10, jMin);
            }
            String contentRange = executeCurrentRequest(jMin, genericUrl, httpHeaders, outputStream).getHeaders().getContentRange();
            long nextByteIndex = getNextByteIndex(contentRange);
            setMediaContentLength(contentRange);
            long j11 = this.lastBytePos;
            if (j11 != -1 && j11 <= nextByteIndex) {
                this.bytesDownloaded = j11;
                updateStateAndNotifyListener(DownloadState.MEDIA_COMPLETE);
                return;
            }
            long j12 = this.mediaContentLength;
            if (j12 <= nextByteIndex) {
                this.bytesDownloaded = j12;
                updateStateAndNotifyListener(DownloadState.MEDIA_COMPLETE);
                return;
            } else {
                this.bytesDownloaded = nextByteIndex;
                updateStateAndNotifyListener(DownloadState.MEDIA_IN_PROGRESS);
            }
        }
    }

    @Deprecated
    public MediaHttpDownloader setContentRange(long j10, int i10) {
        return setContentRange(j10, i10);
    }
}
