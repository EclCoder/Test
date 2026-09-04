package androidx.media3.exoplayer.upstream;

import i2.i;
import i2.j;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public interface b {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final i f6111a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final j f6112b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final IOException f6113c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f6114d;

        public a(i iVar, j jVar, IOException iOException, int i10) {
            this.f6111a = iVar;
            this.f6112b = jVar;
            this.f6113c = iOException;
            this.f6114d = i10;
        }
    }

    int a(int i10);

    long c(a aVar);

    default void b(long j10) {
    }
}
