package com.google.api.client.googleapis.batch;

import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpContent;
import com.google.api.client.http.HttpHeaders;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpResponse;
import com.google.api.client.http.HttpStatusCodes;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.HttpUnsuccessfulResponseHandler;
import com.google.api.client.http.LowLevelHttpRequest;
import com.google.api.client.http.LowLevelHttpResponse;
import com.google.api.client.testing.http.HttpTesting;
import com.google.api.client.util.ByteStreams;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class BatchUnparsedResponse {
    private final String boundary;
    private final InputStream inputStream;
    private final List<BatchRequest.RequestInfo<?, ?>> requestInfos;
    private final boolean retryAllowed;
    boolean hasNext = true;
    List<BatchRequest.RequestInfo<?, ?>> unsuccessfulRequestInfos = new ArrayList();
    private int contentId = 0;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class FakeLowLevelHttpResponse extends LowLevelHttpResponse {
        private List<String> headerNames;
        private List<String> headerValues;
        private InputStream partContent;
        private int statusCode;

        FakeLowLevelHttpResponse(InputStream inputStream, int i10, List<String> list, List<String> list2) {
            this.headerNames = new ArrayList();
            new ArrayList();
            this.partContent = inputStream;
            this.statusCode = i10;
            this.headerNames = list;
            this.headerValues = list2;
        }

        @Override // com.google.api.client.http.LowLevelHttpResponse
        public InputStream getContent() {
            return this.partContent;
        }

        @Override // com.google.api.client.http.LowLevelHttpResponse
        public String getContentEncoding() {
            return null;
        }

        @Override // com.google.api.client.http.LowLevelHttpResponse
        public long getContentLength() {
            return 0L;
        }

        @Override // com.google.api.client.http.LowLevelHttpResponse
        public String getContentType() {
            return null;
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
            return null;
        }

        @Override // com.google.api.client.http.LowLevelHttpResponse
        public int getStatusCode() {
            return this.statusCode;
        }

        @Override // com.google.api.client.http.LowLevelHttpResponse
        public String getStatusLine() {
            return null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class FakeResponseHttpTransport extends HttpTransport {
        private List<String> headerNames;
        private List<String> headerValues;
        private InputStream partContent;
        private int statusCode;

        FakeResponseHttpTransport(int i10, InputStream inputStream, List<String> list, List<String> list2) {
            this.statusCode = i10;
            this.partContent = inputStream;
            this.headerNames = list;
            this.headerValues = list2;
        }

        @Override // com.google.api.client.http.HttpTransport
        protected LowLevelHttpRequest buildRequest(String str, String str2) {
            return new FakeLowLevelHttpRequest(this.partContent, this.statusCode, this.headerNames, this.headerValues);
        }
    }

    BatchUnparsedResponse(InputStream inputStream, String str, List<BatchRequest.RequestInfo<?, ?>> list, boolean z10) throws IOException {
        this.boundary = str;
        this.requestInfos = list;
        this.retryAllowed = z10;
        this.inputStream = inputStream;
        checkForFinalBoundary(readLine());
    }

    private void checkForFinalBoundary(String str) throws IOException {
        if (str.equals(this.boundary + "--")) {
            this.hasNext = false;
            this.inputStream.close();
        }
    }

    private HttpResponse getFakeResponse(int i10, InputStream inputStream, List<String> list, List<String> list2) {
        HttpRequest httpRequestBuildPostRequest = new FakeResponseHttpTransport(i10, inputStream, list, list2).createRequestFactory().buildPostRequest(new GenericUrl(HttpTesting.SIMPLE_URL), null);
        httpRequestBuildPostRequest.setLoggingEnabled(false);
        httpRequestBuildPostRequest.setThrowExceptionOnExecuteError(false);
        return httpRequestBuildPostRequest.execute();
    }

    private <A, T, E> A getParsedDataClass(Class<A> cls, HttpResponse httpResponse, BatchRequest.RequestInfo<T, E> requestInfo) {
        if (cls == Void.class) {
            return null;
        }
        return (A) requestInfo.request.getParser().parseAndClose(httpResponse.getContent(), httpResponse.getContentCharset(), (Class) cls);
    }

    private <T, E> void parseAndCallback(BatchRequest.RequestInfo<T, E> requestInfo, int i10, HttpResponse httpResponse) {
        BatchCallback<T, E> batchCallback = requestInfo.callback;
        HttpHeaders headers = httpResponse.getHeaders();
        HttpUnsuccessfulResponseHandler unsuccessfulResponseHandler = requestInfo.request.getUnsuccessfulResponseHandler();
        if (HttpStatusCodes.isSuccess(i10)) {
            if (batchCallback == null) {
                return;
            }
            batchCallback.onSuccess((T) getParsedDataClass(requestInfo.dataClass, httpResponse, requestInfo), headers);
            return;
        }
        HttpContent content = requestInfo.request.getContent();
        boolean z10 = this.retryAllowed && (content == null || content.retrySupported());
        boolean zHandleResponse = unsuccessfulResponseHandler != null ? unsuccessfulResponseHandler.handleResponse(requestInfo.request, httpResponse, z10) : false;
        boolean z11 = !zHandleResponse && requestInfo.request.handleRedirect(httpResponse.getStatusCode(), httpResponse.getHeaders());
        if (z10 && (zHandleResponse || z11)) {
            this.unsuccessfulRequestInfos.add(requestInfo);
        } else {
            if (batchCallback == null) {
                return;
            }
            batchCallback.onFailure((E) getParsedDataClass(requestInfo.errorClass, httpResponse, requestInfo), headers);
        }
    }

    private String readLine() {
        return trimCrlf(readRawLine());
    }

    private String readRawLine() throws IOException {
        int i10 = this.inputStream.read();
        if (i10 == -1) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        while (i10 != -1) {
            sb2.append((char) i10);
            if (i10 == 10) {
                break;
            }
            i10 = this.inputStream.read();
        }
        return sb2.toString();
    }

    private static String trimCrlf(String str) {
        if (str.endsWith("\r\n")) {
            return str.substring(0, str.length() - 2);
        }
        return str.endsWith("\n") ? str.substring(0, str.length() - 1) : str;
    }

    void parseNextResponse() throws IOException {
        String line;
        String line2;
        InputStream inputStreamTrimCrlf;
        String rawLine;
        this.contentId++;
        do {
            line = readLine();
            if (line == null) {
                break;
            }
        } while (!line.equals(""));
        int i10 = Integer.parseInt(readLine().split(" ")[1]);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        long j10 = -1;
        while (true) {
            line2 = readLine();
            if (line2 == null || line2.equals("")) {
                break;
            }
            String[] strArrSplit = line2.split(": ", 2);
            String str = strArrSplit[0];
            String str2 = strArrSplit[1];
            arrayList.add(str);
            arrayList2.add(str2);
            if ("Content-Length".equalsIgnoreCase(str.trim())) {
                j10 = Long.parseLong(str2);
            }
        }
        if (j10 == -1) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            while (true) {
                rawLine = readRawLine();
                if (rawLine == null || rawLine.startsWith(this.boundary)) {
                    break;
                } else {
                    byteArrayOutputStream.write(rawLine.getBytes("ISO-8859-1"));
                }
            }
            inputStreamTrimCrlf = trimCrlf(byteArrayOutputStream.toByteArray());
            line2 = trimCrlf(rawLine);
        } else {
            inputStreamTrimCrlf = new FilterInputStream(ByteStreams.limit(this.inputStream, j10)) { // from class: com.google.api.client.googleapis.batch.BatchUnparsedResponse.1
                @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
                public void close() {
                }
            };
        }
        parseAndCallback(this.requestInfos.get(this.contentId - 1), i10, getFakeResponse(i10, inputStreamTrimCrlf, arrayList, arrayList2));
        while (true) {
            if (inputStreamTrimCrlf.skip(j10) <= 0 && inputStreamTrimCrlf.read() == -1) {
                break;
            }
        }
        if (j10 != -1) {
            line2 = readLine();
        }
        while (line2 != null && line2.length() == 0) {
            line2 = readLine();
        }
        checkForFinalBoundary(line2);
    }

    private static InputStream trimCrlf(byte[] bArr) {
        int length = bArr.length;
        if (length > 0 && bArr[length - 1] == 10) {
            length--;
        }
        if (length > 0 && bArr[length - 1] == 13) {
            length--;
        }
        return new ByteArrayInputStream(bArr, 0, length);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class FakeLowLevelHttpRequest extends LowLevelHttpRequest {
        private List<String> headerNames;
        private List<String> headerValues;
        private InputStream partContent;
        private int statusCode;

        FakeLowLevelHttpRequest(InputStream inputStream, int i10, List<String> list, List<String> list2) {
            this.partContent = inputStream;
            this.statusCode = i10;
            this.headerNames = list;
            this.headerValues = list2;
        }

        @Override // com.google.api.client.http.LowLevelHttpRequest
        public LowLevelHttpResponse execute() {
            return new FakeLowLevelHttpResponse(this.partContent, this.statusCode, this.headerNames, this.headerValues);
        }

        @Override // com.google.api.client.http.LowLevelHttpRequest
        public void addHeader(String str, String str2) {
        }
    }
}
