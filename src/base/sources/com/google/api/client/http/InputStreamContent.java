package com.google.api.client.http;

import com.google.api.client.util.Preconditions;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class InputStreamContent extends AbstractInputStreamContent {
    private final InputStream inputStream;
    private long length;
    private boolean retrySupported;

    public InputStreamContent(String str, InputStream inputStream) {
        super(str);
        this.length = -1L;
        this.inputStream = (InputStream) Preconditions.checkNotNull(inputStream);
    }

    @Override // com.google.api.client.http.AbstractInputStreamContent
    public InputStream getInputStream() {
        return this.inputStream;
    }

    @Override // com.google.api.client.http.HttpContent
    public long getLength() {
        return this.length;
    }

    @Override // com.google.api.client.http.HttpContent
    public boolean retrySupported() {
        return this.retrySupported;
    }

    public InputStreamContent setLength(long j10) {
        this.length = j10;
        return this;
    }

    public InputStreamContent setRetrySupported(boolean z10) {
        this.retrySupported = z10;
        return this;
    }

    @Override // com.google.api.client.http.AbstractInputStreamContent
    public InputStreamContent setCloseInputStream(boolean z10) {
        return (InputStreamContent) super.setCloseInputStream(z10);
    }

    @Override // com.google.api.client.http.AbstractInputStreamContent
    public InputStreamContent setType(String str) {
        return (InputStreamContent) super.setType(str);
    }
}
