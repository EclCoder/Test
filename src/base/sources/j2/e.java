package j2;

import com.google.common.collect.c0;
import com.google.common.collect.w0;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
final class e implements a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final w0 f41914b = w0.d().h(new sc.g() { // from class: j2.c
        @Override // sc.g
        public final Object apply(Object obj) {
            return Long.valueOf(((l3.e) obj).f43847b);
        }
    }).a(w0.d().i().h(new sc.g() { // from class: j2.d
        @Override // sc.g
        public final Object apply(Object obj) {
            return Long.valueOf(((l3.e) obj).f43848c);
        }
    }));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f41915a = new ArrayList();

    @Override // j2.a
    public c0 a(long j10) {
        if (!this.f41915a.isEmpty()) {
            if (j10 >= ((l3.e) this.f41915a.get(0)).f43847b) {
                ArrayList arrayList = new ArrayList();
                for (int i10 = 0; i10 < this.f41915a.size(); i10++) {
                    l3.e eVar = (l3.e) this.f41915a.get(i10);
                    if (j10 >= eVar.f43847b && j10 < eVar.f43849d) {
                        arrayList.add(eVar);
                    }
                    if (j10 < eVar.f43847b) {
                        break;
                    }
                }
                c0 c0VarK = c0.K(f41914b, arrayList);
                c0.a aVarR = c0.r();
                for (int i11 = 0; i11 < c0VarK.size(); i11++) {
                    aVarR.k(((l3.e) c0VarK.get(i11)).f43846a);
                }
                return aVarR.m();
            }
        }
        return c0.C();
    }

    @Override // j2.a
    public long b(long j10) {
        if (this.f41915a.isEmpty()) {
            return C.TIME_UNSET;
        }
        if (j10 < ((l3.e) this.f41915a.get(0)).f43847b) {
            return C.TIME_UNSET;
        }
        long jMax = ((l3.e) this.f41915a.get(0)).f43847b;
        for (int i10 = 0; i10 < this.f41915a.size(); i10++) {
            long j11 = ((l3.e) this.f41915a.get(i10)).f43847b;
            long j12 = ((l3.e) this.f41915a.get(i10)).f43849d;
            if (j12 > j10) {
                if (j11 > j10) {
                    break;
                }
                jMax = Math.max(jMax, j11);
            } else {
                jMax = Math.max(jMax, j12);
            }
        }
        return jMax;
    }

    @Override // j2.a
    public boolean c(l3.e eVar, long j10) {
        w1.a.a(eVar.f43847b != C.TIME_UNSET);
        w1.a.a(eVar.f43848c != C.TIME_UNSET);
        boolean z10 = eVar.f43847b <= j10 && j10 < eVar.f43849d;
        for (int size = this.f41915a.size() - 1; size >= 0; size--) {
            if (eVar.f43847b >= ((l3.e) this.f41915a.get(size)).f43847b) {
                this.f41915a.add(size + 1, eVar);
                return z10;
            }
        }
        this.f41915a.add(0, eVar);
        return z10;
    }

    @Override // j2.a
    public void clear() {
        this.f41915a.clear();
    }

    @Override // j2.a
    public long d(long j10) {
        long jMin = -9223372036854775807L;
        for (int i10 = 0; i10 < this.f41915a.size(); i10++) {
            long j11 = ((l3.e) this.f41915a.get(i10)).f43847b;
            long j12 = ((l3.e) this.f41915a.get(i10)).f43849d;
            if (j10 < j11) {
                if (jMin != C.TIME_UNSET) {
                    jMin = Math.min(jMin, j11);
                    break;
                }
                jMin = j11;
                break;
            }
            if (j10 < j12) {
                jMin = jMin == C.TIME_UNSET ? j12 : Math.min(jMin, j12);
            }
        }
        if (jMin != C.TIME_UNSET) {
            return jMin;
        }
        return Long.MIN_VALUE;
    }

    @Override // j2.a
    public void e(long j10) {
        int i10 = 0;
        while (i10 < this.f41915a.size()) {
            long j11 = ((l3.e) this.f41915a.get(i10)).f43847b;
            if (j10 > j11 && j10 > ((l3.e) this.f41915a.get(i10)).f43849d) {
                this.f41915a.remove(i10);
                i10--;
            } else if (j10 < j11) {
                return;
            }
            i10++;
        }
    }
}
