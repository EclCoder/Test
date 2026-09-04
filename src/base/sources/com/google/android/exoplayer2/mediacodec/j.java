package com.google.android.exoplayer2.mediacodec;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import com.google.android.exoplayer2.v0;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public interface j {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final k f17287a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final MediaFormat f17288b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final v0 f17289c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Surface f17290d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final MediaCrypto f17291e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f17292f;

        private a(k kVar, MediaFormat mediaFormat, v0 v0Var, Surface surface, MediaCrypto mediaCrypto, int i10) {
            this.f17287a = kVar;
            this.f17288b = mediaFormat;
            this.f17289c = v0Var;
            this.f17290d = surface;
            this.f17291e = mediaCrypto;
            this.f17292f = i10;
        }

        public static a a(k kVar, MediaFormat mediaFormat, v0 v0Var, MediaCrypto mediaCrypto) {
            return new a(kVar, mediaFormat, v0Var, null, mediaCrypto, 0);
        }

        public static a b(k kVar, MediaFormat mediaFormat, v0 v0Var, Surface surface, MediaCrypto mediaCrypto) {
            return new a(kVar, mediaFormat, v0Var, surface, mediaCrypto, 0);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface b {
        j a(a aVar);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface c {
        void a(j jVar, long j10, long j11);
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

    void j(c cVar, Handler handler);

    void k(int i10, boolean z10);

    ByteBuffer l(int i10);

    void m(int i10, int i11, s9.c cVar, long j10, int i12);

    void release();

    void setVideoScalingMode(int i10);
}
