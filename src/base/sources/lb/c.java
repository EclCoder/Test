package lb;

import android.os.SystemClock;
import com.google.android.exoplayer2.v0;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import ob.r0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class c implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final ra.v f44111a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final int f44112b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final int[] f44113c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f44114d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final v0[] f44115e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long[] f44116f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f44117g;

    public c(ra.v vVar, int... iArr) {
        this(vVar, iArr, 0);
    }

    public static /* synthetic */ int i(v0 v0Var, v0 v0Var2) {
        return v0Var2.f18864h - v0Var.f18864h;
    }

    @Override // lb.r
    public boolean d(int i10, long j10) {
        return this.f44116f[i10] > j10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            c cVar = (c) obj;
            if (this.f44111a == cVar.f44111a && Arrays.equals(this.f44113c, cVar.f44113c)) {
                return true;
            }
        }
        return false;
    }

    @Override // lb.r
    public int evaluateQueueSize(long j10, List list) {
        return list.size();
    }

    @Override // lb.r
    public boolean f(int i10, long j10) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean zD = d(i10, jElapsedRealtime);
        int i11 = 0;
        while (i11 < this.f44112b && !zD) {
            zD = (i11 == i10 || d(i11, jElapsedRealtime)) ? false : true;
            i11++;
        }
        if (!zD) {
            return false;
        }
        long[] jArr = this.f44116f;
        jArr[i10] = Math.max(jArr[i10], r0.b(jElapsedRealtime, j10, Long.MAX_VALUE));
        return true;
    }

    @Override // lb.u
    public final v0 getFormat(int i10) {
        return this.f44115e[i10];
    }

    @Override // lb.u
    public final int getIndexInTrackGroup(int i10) {
        return this.f44113c[i10];
    }

    @Override // lb.r
    public final v0 getSelectedFormat() {
        return this.f44115e[getSelectedIndex()];
    }

    @Override // lb.r
    public final int getSelectedIndexInTrackGroup() {
        return this.f44113c[getSelectedIndex()];
    }

    @Override // lb.u
    public final ra.v getTrackGroup() {
        return this.f44111a;
    }

    @Override // lb.u
    public final int h(v0 v0Var) {
        for (int i10 = 0; i10 < this.f44112b; i10++) {
            if (this.f44115e[i10] == v0Var) {
                return i10;
            }
        }
        return -1;
    }

    public int hashCode() {
        if (this.f44117g == 0) {
            this.f44117g = (System.identityHashCode(this.f44111a) * 31) + Arrays.hashCode(this.f44113c);
        }
        return this.f44117g;
    }

    @Override // lb.u
    public final int indexOf(int i10) {
        for (int i11 = 0; i11 < this.f44112b; i11++) {
            if (this.f44113c[i11] == i10) {
                return i11;
            }
        }
        return -1;
    }

    @Override // lb.u
    public final int length() {
        return this.f44113c.length;
    }

    public c(ra.v vVar, int[] iArr, int i10) {
        int i11 = 0;
        ob.a.g(iArr.length > 0);
        this.f44114d = i10;
        this.f44111a = (ra.v) ob.a.e(vVar);
        int length = iArr.length;
        this.f44112b = length;
        this.f44115e = new v0[length];
        for (int i12 = 0; i12 < iArr.length; i12++) {
            this.f44115e[i12] = vVar.c(iArr[i12]);
        }
        Arrays.sort(this.f44115e, new Comparator() { // from class: lb.b
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return c.i((v0) obj, (v0) obj2);
            }
        });
        this.f44113c = new int[this.f44112b];
        while (true) {
            int i13 = this.f44112b;
            if (i11 >= i13) {
                this.f44116f = new long[i13];
                return;
            } else {
                this.f44113c[i11] = vVar.d(this.f44115e[i11]);
                i11++;
            }
        }
    }

    @Override // lb.r
    public void disable() {
    }

    @Override // lb.r
    public void enable() {
    }

    @Override // lb.r
    public void onPlaybackSpeed(float f10) {
    }
}
