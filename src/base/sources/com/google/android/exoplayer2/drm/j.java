package com.google.android.exoplayer2.drm;

import android.os.Looper;
import com.facebook.ads.AdError;
import com.google.android.exoplayer2.v0;
import p9.s1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public interface j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f16868a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j f16869b;

    static {
        a aVar = new a();
        f16868a = aVar;
        f16869b = aVar;
    }

    int b(v0 v0Var);

    DrmSession c(i.a aVar, v0 v0Var);

    default b d(i.a aVar, v0 v0Var) {
        return b.f16870a;
    }

    void e(Looper looper, s1 s1Var);

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f16870a = new b() { // from class: t9.j
            @Override // com.google.android.exoplayer2.drm.j.b
            public final void release() {
                com.google.android.exoplayer2.drm.j.b.a();
            }
        };

        void release();

        static /* synthetic */ void a() {
        }
    }

    default void a() {
    }

    default void release() {
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements j {
        a() {
        }

        @Override // com.google.android.exoplayer2.drm.j
        public int b(v0 v0Var) {
            return v0Var.f18871o != null ? 1 : 0;
        }

        @Override // com.google.android.exoplayer2.drm.j
        public DrmSession c(i.a aVar, v0 v0Var) {
            if (v0Var.f18871o == null) {
                return null;
            }
            return new m(new DrmSession.DrmSessionException(new UnsupportedDrmException(1), AdError.MEDIAVIEW_MISSING_ERROR_CODE));
        }

        @Override // com.google.android.exoplayer2.drm.j
        public void e(Looper looper, s1 s1Var) {
        }
    }
}
