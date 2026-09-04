package co;

import java.io.Closeable;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public interface i extends Closeable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    void g(int i10);

    boolean isOpen();

    void shutdown();
}
