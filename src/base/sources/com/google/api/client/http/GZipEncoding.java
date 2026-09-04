package com.google.api.client.http;

import com.google.api.client.util.StreamingContent;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class GZipEncoding implements HttpEncoding {
    @Override // com.google.api.client.http.HttpEncoding
    public void encode(StreamingContent streamingContent, OutputStream outputStream) throws IOException {
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(new BufferedOutputStream(outputStream) { // from class: com.google.api.client.http.GZipEncoding.1
            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                try {
                    flush();
                } catch (IOException unused) {
                }
            }
        });
        streamingContent.writeTo(gZIPOutputStream);
        gZIPOutputStream.close();
    }

    @Override // com.google.api.client.http.HttpEncoding
    public String getName() {
        return "gzip";
    }
}
