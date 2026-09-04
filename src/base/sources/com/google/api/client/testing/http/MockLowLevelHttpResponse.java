package com.google.api.client.testing.http;

import com.google.api.client.http.LowLevelHttpResponse;
import com.google.api.client.testing.util.TestableByteArrayInputStream;
import com.google.api.client.util.Preconditions;
import com.google.api.client.util.StringUtils;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class MockLowLevelHttpResponse extends LowLevelHttpResponse {
    private InputStream content;
    private String contentEncoding;
    private String contentType;
    private boolean isDisconnected;
    private String reasonPhrase;
    private int statusCode = 200;
    private List<String> headerNames = new ArrayList();
    private List<String> headerValues = new ArrayList();
    private long contentLength = -1;

    public MockLowLevelHttpResponse addHeader(String str, String str2) {
        this.headerNames.add((String) Preconditions.checkNotNull(str));
        this.headerValues.add((String) Preconditions.checkNotNull(str2));
        return this;
    }

    @Override // com.google.api.client.http.LowLevelHttpResponse
    public void disconnect() {
        this.isDisconnected = true;
        super.disconnect();
    }

    @Override // com.google.api.client.http.LowLevelHttpResponse
    public InputStream getContent() {
        return this.content;
    }

    @Override // com.google.api.client.http.LowLevelHttpResponse
    public String getContentEncoding() {
        return this.contentEncoding;
    }

    @Override // com.google.api.client.http.LowLevelHttpResponse
    public long getContentLength() {
        return this.contentLength;
    }

    @Override // com.google.api.client.http.LowLevelHttpResponse
    public final String getContentType() {
        return this.contentType;
    }

    @Override // com.google.api.client.http.LowLevelHttpResponse
    public int getHeaderCount() {
        return this.headerNames.size();
    }

    @Override // com.google.api.client.http.LowLevelHttpResponse
    public String getHeaderName(int i10) {
        return this.headerNames.get(i10);
    }

    public final List<String> getHeaderNames() {
        return this.headerNames;
    }

    @Override // com.google.api.client.http.LowLevelHttpResponse
    public String getHeaderValue(int i10) {
        return this.headerValues.get(i10);
    }

    public final List<String> getHeaderValues() {
        return this.headerValues;
    }

    @Override // com.google.api.client.http.LowLevelHttpResponse
    public String getReasonPhrase() {
        return this.reasonPhrase;
    }

    @Override // com.google.api.client.http.LowLevelHttpResponse
    public int getStatusCode() {
        return this.statusCode;
    }

    @Override // com.google.api.client.http.LowLevelHttpResponse
    public String getStatusLine() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.statusCode);
        String str = this.reasonPhrase;
        if (str != null) {
            sb2.append(str);
        }
        return sb2.toString();
    }

    public boolean isDisconnected() {
        return this.isDisconnected;
    }

    public MockLowLevelHttpResponse setContent(String str) {
        return str == null ? setZeroContent() : setContent(StringUtils.getBytesUtf8(str));
    }

    public MockLowLevelHttpResponse setContentEncoding(String str) {
        this.contentEncoding = str;
        return this;
    }

    public MockLowLevelHttpResponse setContentLength(long j10) {
        this.contentLength = j10;
        Preconditions.checkArgument(j10 >= -1);
        return this;
    }

    public MockLowLevelHttpResponse setContentType(String str) {
        this.contentType = str;
        return this;
    }

    public MockLowLevelHttpResponse setHeaderNames(List<String> list) {
        this.headerNames = (List) Preconditions.checkNotNull(list);
        return this;
    }

    public MockLowLevelHttpResponse setHeaderValues(List<String> list) {
        this.headerValues = (List) Preconditions.checkNotNull(list);
        return this;
    }

    public MockLowLevelHttpResponse setReasonPhrase(String str) {
        this.reasonPhrase = str;
        return this;
    }

    public MockLowLevelHttpResponse setStatusCode(int i10) {
        this.statusCode = i10;
        return this;
    }

    public MockLowLevelHttpResponse setZeroContent() {
        this.content = null;
        setContentLength(0L);
        return this;
    }

    public MockLowLevelHttpResponse setContent(byte[] bArr) {
        if (bArr == null) {
            return setZeroContent();
        }
        this.content = new TestableByteArrayInputStream(bArr);
        setContentLength(bArr.length);
        return this;
    }

    public MockLowLevelHttpResponse setContent(InputStream inputStream) {
        this.content = inputStream;
        return this;
    }
}
