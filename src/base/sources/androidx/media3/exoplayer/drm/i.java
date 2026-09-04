package androidx.media3.exoplayer.drm;

import android.os.Looper;
import c2.x1;
import com.facebook.ads.AdError;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public interface i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f5259a = new a();

    int b(t1.o oVar);

    default b c(h.a aVar, t1.o oVar) {
        return b.f5260a;
    }

    DrmSession d(h.a aVar, t1.o oVar);

    void e(Looper looper, x1 x1Var);

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f5260a = new b() { // from class: e2.j
            @Override // androidx.media3.exoplayer.drm.i.b
            public final void release() {
                androidx.media3.exoplayer.drm.i.b.a();
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
    class a implements i {
        a() {
        }

        @Override // androidx.media3.exoplayer.drm.i
        public int b(t1.o oVar) {
            return oVar.f52761r != null ? 1 : 0;
        }

        @Override // androidx.media3.exoplayer.drm.i
        public DrmSession d(h.a aVar, t1.o oVar) {
            if (oVar.f52761r == null) {
                return null;
            }
            return new l(new DrmSession.DrmSessionException(new UnsupportedDrmException(1), AdError.MEDIAVIEW_MISSING_ERROR_CODE));
        }

        @Override // androidx.media3.exoplayer.drm.i
        public void e(Looper looper, x1 x1Var) {
        }
    }
}
