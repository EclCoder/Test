package ta;

import com.google.android.exoplayer2.source.c0;
import ob.u;
import u9.b0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class c implements g.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int[] f53191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c0[] f53192b;

    public c(int[] iArr, c0[] c0VarArr) {
        this.f53191a = iArr;
        this.f53192b = c0VarArr;
    }

    public int[] a() {
        int[] iArr = new int[this.f53192b.length];
        int i10 = 0;
        while (true) {
            c0[] c0VarArr = this.f53192b;
            if (i10 >= c0VarArr.length) {
                return iArr;
            }
            iArr[i10] = c0VarArr[i10].G();
            i10++;
        }
    }

    public void b(long j10) {
        for (c0 c0Var : this.f53192b) {
            c0Var.Z(j10);
        }
    }

    @Override // ta.g.b
    public b0 track(int i10, int i11) {
        int i12 = 0;
        while (true) {
            int[] iArr = this.f53191a;
            if (i12 >= iArr.length) {
                u.c("BaseMediaChunkOutput", "Unmatched track of type: " + i11);
                return new u9.j();
            }
            if (i11 == iArr[i12]) {
                return this.f53192b[i12];
            }
            i12++;
        }
    }
}
