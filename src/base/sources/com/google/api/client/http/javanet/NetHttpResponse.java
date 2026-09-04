package com.google.api.client.http.javanet;

import com.google.api.client.http.LowLevelHttpResponse;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class NetHttpResponse extends LowLevelHttpResponse {
    private final HttpURLConnection connection;
    private final ArrayList<String> headerNames;
    private final ArrayList<String> headerValues;
    private final int responseCode;
    private final String responseMessage;

    NetHttpResponse(HttpURLConnection httpURLConnection) throws IOException {
        ArrayList<String> arrayList = new ArrayList<>();
        this.headerNames = arrayList;
        ArrayList<String> arrayList2 = new ArrayList<>();
        this.headerValues = arrayList2;
        this.connection = httpURLConnection;
        int responseCode = httpURLConnection.getResponseCode();
        this.responseCode = responseCode == -1 ? 0 : responseCode;
        this.responseMessage = httpURLConnection.getResponseMessage();
        for (Map.Entry<String, List<String>> entry : httpURLConnection.getHeaderFields().entrySet()) {
            String key = entry.getKey();
            if (key != null) {
                for (String str : entry.getValue()) {
                    if (str != null) {
                        arrayList.add(key);
                        arrayList2.add(str);
                    }
                }
            }
        }
    }

    @Override // com.google.api.client.http.LowLevelHttpResponse
    public void disconnect() {
        this.connection.disconnect();
    }

    @Override // com.google.api.client.http.LowLevelHttpResponse
    public InputStream getContent() {
        InputStream errorStream;
        try {
            errorStream = this.connection.getInputStream();
        } catch (IOException unused) {
            errorStream = this.connection.getErrorStream();
        }
        if (errorStream == null) {
            return null;
        }
        return new SizeValidatingInputStream(errorStream);
    }

    @Override // com.google.api.client.http.LowLevelHttpResponse
    public String getContentEncoding() {
        return this.connection.getContentEncoding();
    }

    @Override // com.google.api.client.http.LowLevelHttpResponse
    public long getContentLength() {
        String headerField = this.connection.getHeaderField("Content-Length");
        if (headerField == null) {
            return -1L;
        }
        return Long.parseLong(headerField);
    }

    @Override // com.google.api.client.http.LowLevelHttpResponse
    public String getContentType() {
        return this.connection.getHeaderField("Content-Type");
    }

    @Override // com.google.api.client.http.LowLevelHttpResponse
    public int getHeaderCount() {
        return this.headerNames.size();
    }

    @Override // com.google.api.client.http.LowLevelHttpResponse
    public String getHeaderName(int i10) {
        return this.headerNames.get(i10);
    }

    @Override // com.google.api.client.http.LowLevelHttpResponse
    public String getHeaderValue(int i10) {
        return this.headerValues.get(i10);
    }

    @Override // com.google.api.client.http.LowLevelHttpResponse
    public String getReasonPhrase() {
        return this.responseMessage;
    }

    @Override // com.google.api.client.http.LowLevelHttpResponse
    public int getStatusCode() {
        return this.responseCode;
    }

    @Override // com.google.api.client.http.LowLevelHttpResponse
    public String getStatusLine() {
        String headerField = this.connection.getHeaderField(0);
        if (headerField == null || !headerField.startsWith("HTTP/1.")) {
            return null;
        }
        return headerField;
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private final class SizeValidatingInputStream extends FilterInputStream {
        private long bytesRead;

        public SizeValidatingInputStream(InputStream inputStream) {
            super(inputStream);
            this.bytesRead = 0L;
        }

        private void throwIfFalseEOF() throws IOException {
            long contentLength = NetHttpResponse.this.getContentLength();
            if (contentLength == -1) {
                return;
            }
            long j10 = this.bytesRead;
            if (j10 == 0 || j10 >= contentLength) {
                return;
            }
            throw new IOException("Connection closed prematurely: bytesRead = " + this.bytesRead + ", Content-Length = " + contentLength);
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr, int i10, int i11) throws IOException {
            int i12 = ((FilterInputStream) this).in.read(bArr, i10, i11);
            if (i12 == -1) {
                throwIfFalseEOF();
                return i12;
            }
            this.bytesRead += (long) i12;
            return i12;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public long skip(long j10) throws IOException {
            long jSkip = ((FilterInputStream) this).in.skip(j10);
            this.bytesRead += jSkip;
            return jSkip;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read() throws IOException {
            int i10 = ((FilterInputStream) this).in.read();
            if (i10 == -1) {
                throwIfFalseEOF();
                return i10;
            }
            this.bytesRead++;
            return i10;
        }
    }
}
