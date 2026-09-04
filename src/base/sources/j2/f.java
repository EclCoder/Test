package j2;

import com.google.common.collect.c0;
import com.google.common.collect.i0;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
final class f implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList f41916a = new ArrayList();

    private int f(long j10) {
        for (int i10 = 0; i10 < this.f41916a.size(); i10++) {
            if (j10 < ((l3.e) this.f41916a.get(i10)).f43847b) {
                return i10;
            }
        }
        return this.f41916a.size();
    }

    @Override // j2.a
    public c0 a(long j10) {
        int iF = f(j10);
        if (iF == 0) {
            return c0.C();
        }
        l3.e eVar = (l3.e) this.f41916a.get(iF - 1);
        long j11 = eVar.f43849d;
        return (j11 == C.TIME_UNSET || j10 < j11) ? eVar.f43846a : c0.C();
    }

    @Override // j2.a
    public long b(long j10) {
        if (this.f41916a.isEmpty() || j10 < ((l3.e) this.f41916a.get(0)).f43847b) {
            return C.TIME_UNSET;
        }
        for (int i10 = 1; i10 < this.f41916a.size(); i10++) {
            long j11 = ((l3.e) this.f41916a.get(i10)).f43847b;
            if (j10 == j11) {
                return j11;
            }
            if (j10 < j11) {
                l3.e eVar = (l3.e) this.f41916a.get(i10 - 1);
                long j12 = eVar.f43849d;
                return (j12 == C.TIME_UNSET || j12 > j10) ? eVar.f43847b : j12;
            }
        }
        l3.e eVar2 = (l3.e) i0.d(this.f41916a);
        long j13 = eVar2.f43849d;
        return (j13 == C.TIME_UNSET || j10 < j13) ? eVar2.f43847b : j13;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0025  */
    @Override // j2.a
    public boolean c(l3.e eVar, long j10) {
        boolean z10;
        w1.a.a(eVar.f43847b != C.TIME_UNSET);
        if (eVar.f43847b <= j10) {
            long j11 = eVar.f43849d;
            if (j11 == C.TIME_UNSET || j10 < j11) {
                z10 = true;
            } else {
                z10 = false;
            }
        } else {
            z10 = false;
        }
        for (int size = this.f41916a.size() - 1; size >= 0; size--) {
            if (eVar.f43847b >= ((l3.e) this.f41916a.get(size)).f43847b) {
                this.f41916a.add(size + 1, eVar);
                return z10;
            }
            if (((l3.e) this.f41916a.get(size)).f43847b <= j10) {
                z10 = false;
            }
        }
        this.f41916a.add(0, eVar);
        return z10;
    }

    @Override // j2.a
    public void clear() {
        this.f41916a.clear();
    }

    @Override // j2.a
    public long d(long j10) {
        if (this.f41916a.isEmpty()) {
            return Long.MIN_VALUE;
        }
        if (j10 < ((l3.e) this.f41916a.get(0)).f43847b) {
            return ((l3.e) this.f41916a.get(0)).f43847b;
        }
        for (int i10 = 1; i10 < this.f41916a.size(); i10++) {
            l3.e eVar = (l3.e) this.f41916a.get(i10);
            if (j10 < eVar.f43847b) {
                long j11 = ((l3.e) this.f41916a.get(i10 - 1)).f43849d;
                return (j11 == C.TIME_UNSET || j11 <= j10 || j11 >= eVar.f43847b) ? eVar.f43847b : j11;
            }
        }
        long j12 = ((l3.e) i0.d(this.f41916a)).f43849d;
        if (j12 == C.TIME_UNSET || j10 >= j12) {
            return Long.MIN_VALUE;
        }
        return j12;
    }

    @Override // j2.a
    public void e(long j10) {
        int iF = f(j10);
        if (iF > 0) {
            this.f41916a.subList(0, iF).clear();
        }
    }
}
