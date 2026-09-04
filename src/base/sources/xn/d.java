package xn;

import java.io.EOFException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class d implements o0 {
    @Override // xn.o0
    public void W(e source, long j10) throws EOFException {
        kotlin.jvm.internal.s.h(source, "source");
        source.skip(j10);
    }

    @Override // xn.o0
    public r0 timeout() {
        return r0.f56980e;
    }

    @Override // xn.o0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // xn.o0, java.io.Flushable
    public void flush() {
    }
}
