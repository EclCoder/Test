package k2;

import java.util.Arrays;
import java.util.Comparator;
import t1.b0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class c implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final b0 f42852a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final int f42853b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final int[] f42854c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f42855d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final t1.o[] f42856e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long[] f42857f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f42858g;

    public c(b0 b0Var, int[] iArr, int i10) {
        int i11 = 0;
        w1.a.g(iArr.length > 0);
        this.f42855d = i10;
        this.f42852a = (b0) w1.a.e(b0Var);
        int length = iArr.length;
        this.f42853b = length;
        this.f42856e = new t1.o[length];
        for (int i12 = 0; i12 < iArr.length; i12++) {
            this.f42856e[i12] = b0Var.a(iArr[i12]);
        }
        Arrays.sort(this.f42856e, new Comparator() { // from class: k2.b
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return c.d((t1.o) obj, (t1.o) obj2);
            }
        });
        this.f42854c = new int[this.f42853b];
        while (true) {
            int i13 = this.f42853b;
            if (i11 >= i13) {
                this.f42857f = new long[i13];
                return;
            } else {
                this.f42854c[i11] = b0Var.b(this.f42856e[i11]);
                i11++;
            }
        }
    }

    public static /* synthetic */ int d(t1.o oVar, t1.o oVar2) {
        return oVar2.f52752i - oVar.f52752i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            c cVar = (c) obj;
            if (this.f42852a.equals(cVar.f42852a) && Arrays.equals(this.f42854c, cVar.f42854c)) {
                return true;
            }
        }
        return false;
    }

    @Override // k2.t
    public final t1.o getFormat(int i10) {
        return this.f42856e[i10];
    }

    @Override // k2.t
    public final int getIndexInTrackGroup(int i10) {
        return this.f42854c[i10];
    }

    @Override // k2.q
    public final t1.o getSelectedFormat() {
        return this.f42856e[getSelectedIndex()];
    }

    @Override // k2.q
    public final int getSelectedIndexInTrackGroup() {
        return this.f42854c[getSelectedIndex()];
    }

    @Override // k2.t
    public final b0 getTrackGroup() {
        return this.f42852a;
    }

    public int hashCode() {
        if (this.f42858g == 0) {
            this.f42858g = (System.identityHashCode(this.f42852a) * 31) + Arrays.hashCode(this.f42854c);
        }
        return this.f42858g;
    }

    @Override // k2.t
    public final int indexOf(int i10) {
        for (int i11 = 0; i11 < this.f42853b; i11++) {
            if (this.f42854c[i11] == i10) {
                return i11;
            }
        }
        return -1;
    }

    @Override // k2.t
    public final int length() {
        return this.f42854c.length;
    }

    @Override // k2.q
    public void disable() {
    }

    @Override // k2.q
    public void enable() {
    }

    @Override // k2.q
    public void onPlaybackSpeed(float f10) {
    }
}
