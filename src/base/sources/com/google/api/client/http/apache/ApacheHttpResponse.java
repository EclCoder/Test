package com.google.api.client.http.apache;

import co.d;
import co.j;
import co.q;
import co.y;
import com.google.api.client.http.LowLevelHttpResponse;
import io.n;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class ApacheHttpResponse extends LowLevelHttpResponse {
    private final d[] allHeaders;
    private final n request;
    private final q response;

    ApacheHttpResponse(n nVar, q qVar) {
        this.request = nVar;
        this.response = qVar;
        this.allHeaders = qVar.getAllHeaders();
    }

    @Override // com.google.api.client.http.LowLevelHttpResponse
    public void disconnect() {
        this.request.abort();
    }

    @Override // com.google.api.client.http.LowLevelHttpResponse
    public InputStream getContent() {
        j entity = this.response.getEntity();
        if (entity == null) {
            return null;
        }
        return entity.getContent();
    }

    @Override // com.google.api.client.http.LowLevelHttpResponse
    public String getContentEncoding() {
        d contentEncoding;
        j entity = this.response.getEntity();
        if (entity == null || (contentEncoding = entity.getContentEncoding()) == null) {
            return null;
        }
        return contentEncoding.getValue();
    }

    @Override // com.google.api.client.http.LowLevelHttpResponse
    public long getContentLength() {
        j entity = this.response.getEntity();
        if (entity == null) {
            return -1L;
        }
        return entity.getContentLength();
    }

    @Override // com.google.api.client.http.LowLevelHttpResponse
    public String getContentType() {
        d contentType;
        j entity = this.response.getEntity();
        if (entity == null || (contentType = entity.getContentType()) == null) {
            return null;
        }
        return contentType.getValue();
    }

    @Override // com.google.api.client.http.LowLevelHttpResponse
    public int getHeaderCount() {
        return this.allHeaders.length;
    }

    @Override // com.google.api.client.http.LowLevelHttpResponse
    public String getHeaderName(int i10) {
        return this.allHeaders[i10].getName();
    }

    public String getHeaderValue(String str) {
        return this.response.getLastHeader(str).getValue();
    }

    @Override // com.google.api.client.http.LowLevelHttpResponse
    public String getReasonPhrase() {
        y yVarB = this.response.b();
        if (yVarB == null) {
            return null;
        }
        return yVarB.g();
    }

    @Override // com.google.api.client.http.LowLevelHttpResponse
    public int getStatusCode() {
        y yVarB = this.response.b();
        if (yVarB == null) {
            return 0;
        }
        return yVarB.getStatusCode();
    }

    @Override // com.google.api.client.http.LowLevelHttpResponse
    public String getStatusLine() {
        y yVarB = this.response.b();
        if (yVarB == null) {
            return null;
        }
        return yVarB.toString();
    }

    @Override // com.google.api.client.http.LowLevelHttpResponse
    public String getHeaderValue(int i10) {
        return this.allHeaders[i10].getValue();
    }
}
