package com.google.api.client.http;

import com.google.api.client.util.IOUtils;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractInputStreamContent implements HttpContent {
    private boolean closeInputStream = true;
    private String type;

    public AbstractInputStreamContent(String str) {
        setType(str);
    }

    public final boolean getCloseInputStream() {
        return this.closeInputStream;
    }

    public abstract InputStream getInputStream();

    @Override // com.google.api.client.http.HttpContent
    public String getType() {
        return this.type;
    }

    public AbstractInputStreamContent setCloseInputStream(boolean z10) {
        this.closeInputStream = z10;
        return this;
    }

    public AbstractInputStreamContent setType(String str) {
        this.type = str;
        return this;
    }

    @Override // com.google.api.client.http.HttpContent, com.google.api.client.util.StreamingContent
    public void writeTo(OutputStream outputStream) throws IOException {
        IOUtils.copy(getInputStream(), outputStream, this.closeInputStream);
        outputStream.flush();
    }
}
