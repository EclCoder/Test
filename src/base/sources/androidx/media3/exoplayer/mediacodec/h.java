package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public interface h {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final j f5611a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final MediaFormat f5612b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final t1.o f5613c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Surface f5614d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final MediaCrypto f5615e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f5616f;

        private a(j jVar, MediaFormat mediaFormat, t1.o oVar, Surface surface, MediaCrypto mediaCrypto, int i10) {
            this.f5611a = jVar;
            this.f5612b = mediaFormat;
            this.f5613c = oVar;
            this.f5614d = surface;
            this.f5615e = mediaCrypto;
            this.f5616f = i10;
        }

        public static a a(j jVar, MediaFormat mediaFormat, t1.o oVar, MediaCrypto mediaCrypto) {
            return new a(jVar, mediaFormat, oVar, null, mediaCrypto, 0);
        }

        public static a b(j jVar, MediaFormat mediaFormat, t1.o oVar, Surface surface, MediaCrypto mediaCrypto) {
            return new a(jVar, mediaFormat, oVar, surface, mediaCrypto, 0);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface b {
        h a(a aVar);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface c {
        void a();

        void b();
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface d {
        void a(h hVar, long j10, long j11);
    }

    void a(int i10, int i11, int i12, long j10, int i13);

    void b(Bundle bundle);

    MediaFormat c();

    ByteBuffer d(int i10);

    void e(Surface surface);

    boolean f();

    void flush();

    void g(int i10, long j10);

    int h();

    int i(MediaCodec.BufferInfo bufferInfo);

    void j(int i10, int i11, b2.c cVar, long j10, int i12);

    void k(int i10, boolean z10);

    ByteBuffer l(int i10);

    default boolean m(c cVar) {
        return false;
    }

    void n(d dVar, Handler handler);

    void release();

    void setVideoScalingMode(int i10);
}
