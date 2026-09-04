package com.google.api.client.http;

import com.google.api.client.util.StreamingContent;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public interface HttpEncoding {
    void encode(StreamingContent streamingContent, OutputStream outputStream);

    String getName();
}
