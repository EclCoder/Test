package com.google.api.client.util;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class ByteArrayStreamingContent implements StreamingContent {
    private final byte[] byteArray;
    private final int length;
    private final int offset;

    public ByteArrayStreamingContent(byte[] bArr) {
        this(bArr, 0, bArr.length);
    }

    @Override // com.google.api.client.util.StreamingContent
    public void writeTo(OutputStream outputStream) throws IOException {
        outputStream.write(this.byteArray, this.offset, this.length);
        outputStream.flush();
    }

    public ByteArrayStreamingContent(byte[] bArr, int i10, int i11) {
        this.byteArray = (byte[]) Preconditions.checkNotNull(bArr);
        Preconditions.checkArgument(i10 >= 0 && i11 >= 0 && i10 + i11 <= bArr.length);
        this.offset = i10;
        this.length = i11;
    }
}
