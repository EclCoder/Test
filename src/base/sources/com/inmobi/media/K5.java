package com.inmobi.media;

import java.io.Closeable;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class K5 implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InputStream[] f25102a;

    public K5(InputStream[] inputStreamArr) {
        this.f25102a = inputStreamArr;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        for (InputStream inputStream : this.f25102a) {
            AbstractC3308sl.a(inputStream);
        }
    }
}
