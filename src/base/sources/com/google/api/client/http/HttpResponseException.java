package com.google.api.client.http;

import com.google.api.client.util.Preconditions;
import com.google.api.client.util.StringUtils;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class HttpResponseException extends IOException {
    private static final long serialVersionUID = -1875819453475890043L;
    private final String content;
    private final transient HttpHeaders headers;
    private final int statusCode;
    private final String statusMessage;

    public HttpResponseException(HttpResponse httpResponse) {
        this(new Builder(httpResponse));
    }

    public static StringBuilder computeMessageBuffer(HttpResponse httpResponse) {
        StringBuilder sb2 = new StringBuilder();
        int statusCode = httpResponse.getStatusCode();
        if (statusCode != 0) {
            sb2.append(statusCode);
        }
        String statusMessage = httpResponse.getStatusMessage();
        if (statusMessage != null) {
            if (statusCode != 0) {
                sb2.append(' ');
            }
            sb2.append(statusMessage);
        }
        HttpRequest request = httpResponse.getRequest();
        if (request != null) {
            if (sb2.length() > 0) {
                sb2.append('\n');
            }
            String requestMethod = request.getRequestMethod();
            if (requestMethod != null) {
                sb2.append(requestMethod);
                sb2.append(' ');
            }
            sb2.append(request.getUrl());
        }
        return sb2;
    }

    public final String getContent() {
        return this.content;
    }

    public HttpHeaders getHeaders() {
        return this.headers;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public final String getStatusMessage() {
        return this.statusMessage;
    }

    public final boolean isSuccessStatusCode() {
        return HttpStatusCodes.isSuccess(this.statusCode);
    }

    protected HttpResponseException(Builder builder) {
        super(builder.message);
        this.statusCode = builder.statusCode;
        this.statusMessage = builder.statusMessage;
        this.headers = builder.headers;
        this.content = builder.content;
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class Builder {
        String content;
        HttpHeaders headers;
        String message;
        int statusCode;
        String statusMessage;

        public Builder(int i10, String str, HttpHeaders httpHeaders) {
            setStatusCode(i10);
            setStatusMessage(str);
            setHeaders(httpHeaders);
        }

        public HttpResponseException build() {
            return new HttpResponseException(this);
        }

        public final String getContent() {
            return this.content;
        }

        public HttpHeaders getHeaders() {
            return this.headers;
        }

        public final String getMessage() {
            return this.message;
        }

        public final int getStatusCode() {
            return this.statusCode;
        }

        public final String getStatusMessage() {
            return this.statusMessage;
        }

        public Builder setContent(String str) {
            this.content = str;
            return this;
        }

        public Builder setHeaders(HttpHeaders httpHeaders) {
            this.headers = (HttpHeaders) Preconditions.checkNotNull(httpHeaders);
            return this;
        }

        public Builder setMessage(String str) {
            this.message = str;
            return this;
        }

        public Builder setStatusCode(int i10) {
            Preconditions.checkArgument(i10 >= 0);
            this.statusCode = i10;
            return this;
        }

        public Builder setStatusMessage(String str) {
            this.statusMessage = str;
            return this;
        }

        public Builder(HttpResponse httpResponse) {
            this(httpResponse.getStatusCode(), httpResponse.getStatusMessage(), httpResponse.getHeaders());
            try {
                String asString = httpResponse.parseAsString();
                this.content = asString;
                if (asString.length() == 0) {
                    this.content = null;
                }
            } catch (IOException e10) {
                e10.printStackTrace();
            } catch (IllegalArgumentException e11) {
                e11.printStackTrace();
            }
            StringBuilder sbComputeMessageBuffer = HttpResponseException.computeMessageBuffer(httpResponse);
            if (this.content != null) {
                sbComputeMessageBuffer.append(StringUtils.LINE_SEPARATOR);
                sbComputeMessageBuffer.append(this.content);
            }
            this.message = sbComputeMessageBuffer.toString();
        }
    }
}
