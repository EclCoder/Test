package com.google.api.client.http;

import com.google.api.client.util.Data;
import com.google.api.client.util.FieldInfo;
import com.google.api.client.util.Preconditions;
import com.google.api.client.util.Types;
import com.google.api.client.util.escape.CharEscapers;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class UrlEncodedContent extends AbstractHttpContent {
    private Object data;
    private boolean uriPathEncodingFlag;

    public UrlEncodedContent(Object obj) {
        super(UrlEncodedParser.MEDIA_TYPE);
        setData(obj);
        this.uriPathEncodingFlag = false;
    }

    private static boolean appendParam(boolean z10, Writer writer, String str, Object obj, boolean z11) throws IOException {
        if (obj != null && !Data.isNull(obj)) {
            if (z10) {
                z10 = false;
            } else {
                writer.write("&");
            }
            writer.write(str);
            String name = obj instanceof Enum ? FieldInfo.of((Enum<?>) obj).getName() : obj.toString();
            String strEscapeUriPath = z11 ? CharEscapers.escapeUriPath(name) : CharEscapers.escapeUri(name);
            if (strEscapeUriPath.length() != 0) {
                writer.write("=");
                writer.write(strEscapeUriPath);
            }
        }
        return z10;
    }

    public static UrlEncodedContent getContent(HttpRequest httpRequest) {
        HttpContent content = httpRequest.getContent();
        if (content != null) {
            return (UrlEncodedContent) content;
        }
        UrlEncodedContent urlEncodedContent = new UrlEncodedContent(new HashMap());
        httpRequest.setContent(urlEncodedContent);
        return urlEncodedContent;
    }

    public final Object getData() {
        return this.data;
    }

    public UrlEncodedContent setData(Object obj) {
        this.data = Preconditions.checkNotNull(obj);
        return this;
    }

    @Override // com.google.api.client.http.HttpContent, com.google.api.client.util.StreamingContent
    public void writeTo(OutputStream outputStream) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, getCharset()));
        boolean zAppendParam = true;
        for (Map.Entry<String, Object> entry : Data.mapOf(this.data).entrySet()) {
            Object value = entry.getValue();
            if (value != null) {
                String strEscapeUri = CharEscapers.escapeUri(entry.getKey());
                Class<?> cls = value.getClass();
                if ((value instanceof Iterable) || cls.isArray()) {
                    Iterator it = Types.iterableOf(value).iterator();
                    while (it.hasNext()) {
                        zAppendParam = appendParam(zAppendParam, bufferedWriter, strEscapeUri, it.next(), this.uriPathEncodingFlag);
                    }
                } else {
                    zAppendParam = appendParam(zAppendParam, bufferedWriter, strEscapeUri, value, this.uriPathEncodingFlag);
                }
            }
        }
        bufferedWriter.flush();
    }

    @Override // com.google.api.client.http.AbstractHttpContent
    public UrlEncodedContent setMediaType(HttpMediaType httpMediaType) {
        super.setMediaType(httpMediaType);
        return this;
    }

    public UrlEncodedContent(Object obj, boolean z10) {
        super(UrlEncodedParser.MEDIA_TYPE);
        setData(obj);
        this.uriPathEncodingFlag = z10;
    }
}
