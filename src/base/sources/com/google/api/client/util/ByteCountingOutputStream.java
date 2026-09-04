package com.google.api.client.util;

import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class ByteCountingOutputStream extends OutputStream {
    long count;

    ByteCountingOutputStream() {
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) {
        this.count += (long) i11;
    }

    @Override // java.io.OutputStream
    public void write(int i10) {
        this.count++;
    }
}
