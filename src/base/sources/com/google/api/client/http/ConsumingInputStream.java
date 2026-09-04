package com.google.api.client.http;

import java.io.FilterInputStream;
import java.io.InputStream;
import vc.a;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class ConsumingInputStream extends FilterInputStream {
    private boolean closed;

    ConsumingInputStream(InputStream inputStream) {
        super(inputStream);
        this.closed = false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.closed || ((FilterInputStream) this).in == null) {
            return;
        }
        try {
            a.d(this);
            ((FilterInputStream) this).in.close();
        } finally {
            this.closed = true;
        }
    }
}
