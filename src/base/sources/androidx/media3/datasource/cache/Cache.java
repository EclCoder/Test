package androidx.media3.datasource.cache;

import java.io.File;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public interface Cache {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class CacheException extends IOException {
        public CacheException(String str) {
            super(str);
        }

        public CacheException(Throwable th2) {
            super(th2);
        }

        public CacheException(String str, Throwable th2) {
            super(str, th2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface a {
        void a(Cache cache, a2.c cVar, a2.c cVar2);

        void b(Cache cache, a2.c cVar);

        void c(Cache cache, a2.c cVar);
    }

    void a(a2.c cVar);

    a2.c b(String str, long j10, long j11);

    void c(a2.c cVar);

    void d(String str, a2.e eVar);

    a2.c e(String str, long j10, long j11);

    void f(File file, long j10);

    a2.d getContentMetadata(String str);

    File startFile(String str, long j10, long j11);
}
