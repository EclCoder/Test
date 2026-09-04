package l3;

import com.google.common.collect.c0;
import com.google.common.collect.i0;
import com.google.common.collect.w0;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class g implements k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final w0 f43850c = w0.d().h(new sc.g() { // from class: l3.f
        @Override // sc.g
        public final Object apply(Object obj) {
            return Long.valueOf(g.c(((e) obj).f43847b));
        }
    });

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c0 f43851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long[] f43852b;

    /* JADX WARN: Code duplicated, block: B:24:0x00b0  */
    public g(List list) {
        if (list.size() == 1) {
            e eVar = (e) i0.g(list);
            long jC = c(eVar.f43847b);
            if (eVar.f43848c == C.TIME_UNSET) {
                this.f43851a = c0.D(eVar.f43846a);
                this.f43852b = new long[]{jC};
                return;
            } else {
                this.f43851a = c0.E(eVar.f43846a, c0.C());
                this.f43852b = new long[]{jC, eVar.f43848c + jC};
                return;
            }
        }
        long[] jArr = new long[list.size() * 2];
        this.f43852b = jArr;
        Arrays.fill(jArr, Long.MAX_VALUE);
        ArrayList arrayList = new ArrayList();
        c0 c0VarK = c0.K(f43850c, list);
        int i10 = 0;
        for (int i11 = 0; i11 < c0VarK.size(); i11++) {
            e eVar2 = (e) c0VarK.get(i11);
            long jC2 = c(eVar2.f43847b);
            long j10 = eVar2.f43848c + jC2;
            if (i10 != 0) {
                int i12 = i10 - 1;
                long j11 = this.f43852b[i12];
                if (j11 < jC2) {
                    this.f43852b[i10] = jC2;
                    arrayList.add(eVar2.f43846a);
                    i10++;
                } else if (j11 == jC2 && ((c0) arrayList.get(i12)).isEmpty()) {
                    arrayList.set(i12, eVar2.f43846a);
                } else {
                    w1.n.h("CuesWithTimingSubtitle", "Truncating unsupported overlapping cues.");
                    this.f43852b[i12] = jC2;
                    arrayList.set(i12, eVar2.f43846a);
                }
            } else {
                this.f43852b[i10] = jC2;
                arrayList.add(eVar2.f43846a);
                i10++;
            }
            if (eVar2.f43848c != C.TIME_UNSET) {
                this.f43852b[i10] = j10;
                arrayList.add(c0.C());
                i10++;
            }
        }
        this.f43851a = c0.x(arrayList);
    }

    private static long c(long j10) {
        if (j10 == C.TIME_UNSET) {
            return 0L;
        }
        return j10;
    }

    @Override // l3.k
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public c0 getCues(long j10) {
        int iG = w1.c0.g(this.f43852b, j10, true, false);
        return iG == -1 ? c0.C() : (c0) this.f43851a.get(iG);
    }

    @Override // l3.k
    public long getEventTime(int i10) {
        w1.a.a(i10 < this.f43851a.size());
        return this.f43852b[i10];
    }

    @Override // l3.k
    public int getEventTimeCount() {
        return this.f43851a.size();
    }

    @Override // l3.k
    public int getNextEventTimeIndex(long j10) {
        int iD = w1.c0.d(this.f43852b, j10, false, false);
        if (iD < this.f43851a.size()) {
            return iD;
        }
        return -1;
    }
}
