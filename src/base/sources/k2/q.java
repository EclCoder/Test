package k2;

import t1.a0;
import t1.b0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public interface q extends t {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b0 f42951a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int[] f42952b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f42953c;

        public a(b0 b0Var, int... iArr) {
            this(b0Var, iArr, 0);
        }

        public a(b0 b0Var, int[] iArr, int i10) {
            if (iArr.length == 0) {
                w1.n.d("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
            }
            this.f42951a = b0Var;
            this.f42952b = iArr;
            this.f42953c = i10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface b {
        q[] a(a[] aVarArr, l2.d dVar, androidx.media3.exoplayer.source.r.b bVar, a0 a0Var);
    }

    void disable();

    void enable();

    t1.o getSelectedFormat();

    int getSelectedIndex();

    int getSelectedIndexInTrackGroup();

    void onPlaybackSpeed(float f10);

    default void a() {
    }

    default void c() {
    }

    default void b(boolean z10) {
    }
}
