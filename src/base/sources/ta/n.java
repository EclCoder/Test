package ta;

import com.google.android.exoplayer2.v0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class n extends f {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f53262j;

    public n(nb.j jVar, com.google.android.exoplayer2.upstream.a aVar, v0 v0Var, int i10, Object obj, long j10, long j11, long j12) {
        super(jVar, aVar, 1, v0Var, i10, obj, j10, j11);
        ob.a.e(v0Var);
        this.f53262j = j12;
    }

    public long e() {
        long j10 = this.f53262j;
        if (j10 != -1) {
            return j10 + 1;
        }
        return -1L;
    }

    public abstract boolean f();
}
