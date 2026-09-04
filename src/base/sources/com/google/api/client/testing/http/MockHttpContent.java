package com.google.api.client.testing.http;

import com.google.api.client.http.HttpContent;
import com.google.api.client.util.Preconditions;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class MockHttpContent implements HttpContent {
    private String type;
    private long length = -1;
    private byte[] content = new byte[0];

    public final byte[] getContent() {
        return this.content;
    }

    @Override // com.google.api.client.http.HttpContent
    public long getLength() {
        return this.length;
    }

    @Override // com.google.api.client.http.HttpContent
    public String getType() {
        return this.type;
    }

    @Override // com.google.api.client.http.HttpContent
    public boolean retrySupported() {
        return true;
    }

    public MockHttpContent setContent(byte[] bArr) {
        this.content = (byte[]) Preconditions.checkNotNull(bArr);
        return this;
    }

    public MockHttpContent setLength(long j10) {
        Preconditions.checkArgument(j10 >= -1);
        this.length = j10;
        return this;
    }

    public MockHttpContent setType(String str) {
        this.type = str;
        return this;
    }

    @Override // com.google.api.client.http.HttpContent, com.google.api.client.util.StreamingContent
    public void writeTo(OutputStream outputStream) throws IOException {
        outputStream.write(this.content);
        outputStream.flush();
    }
}
