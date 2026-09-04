package xn;

import java.io.Closeable;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public interface q0 extends Closeable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    long read(e eVar, long j10);

    r0 timeout();
}
