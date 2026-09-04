package i2;

import androidx.media3.exoplayer.i1;
import androidx.media3.exoplayer.source.g0;
import com.google.common.collect.c0;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class d implements g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c0 f40754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f40755b;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class a implements g0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final g0 f40756a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final c0 f40757b;

        public a(g0 g0Var, List list) {
            this.f40756a = g0Var;
            this.f40757b = c0.x(list);
        }

        @Override // androidx.media3.exoplayer.source.g0
        public boolean a(i1 i1Var) {
            return this.f40756a.a(i1Var);
        }

        public c0 b() {
            return this.f40757b;
        }

        @Override // androidx.media3.exoplayer.source.g0
        public long getBufferedPositionUs() {
            return this.f40756a.getBufferedPositionUs();
        }

        @Override // androidx.media3.exoplayer.source.g0
        public long getNextLoadPositionUs() {
            return this.f40756a.getNextLoadPositionUs();
        }

        @Override // androidx.media3.exoplayer.source.g0
        public boolean isLoading() {
            return this.f40756a.isLoading();
        }

        @Override // androidx.media3.exoplayer.source.g0
        public void reevaluateBuffer(long j10) {
            this.f40756a.reevaluateBuffer(j10);
        }
    }

    public d(List list, List list2) {
        c0.a aVarR = c0.r();
        w1.a.a(list.size() == list2.size());
        for (int i10 = 0; i10 < list.size(); i10++) {
            aVarR.a(new a((g0) list.get(i10), (List) list2.get(i10)));
        }
        this.f40754a = aVarR.m();
        this.f40755b = C.TIME_UNSET;
    }

    @Override // androidx.media3.exoplayer.source.g0
    public boolean a(i1 i1Var) {
        boolean zA;
        boolean z10 = false;
        do {
            long nextLoadPositionUs = getNextLoadPositionUs();
            if (nextLoadPositionUs == Long.MIN_VALUE) {
                return z10;
            }
            zA = false;
            for (int i10 = 0; i10 < this.f40754a.size(); i10++) {
                long nextLoadPositionUs2 = ((a) this.f40754a.get(i10)).getNextLoadPositionUs();
                boolean z11 = nextLoadPositionUs2 != Long.MIN_VALUE && nextLoadPositionUs2 <= i1Var.f5395a;
                if (nextLoadPositionUs2 == nextLoadPositionUs || z11) {
                    zA |= ((a) this.f40754a.get(i10)).a(i1Var);
                }
            }
            z10 |= zA;
        } while (zA);
        return z10;
    }

    @Override // androidx.media3.exoplayer.source.g0
    public long getBufferedPositionUs() {
        long jMin = Long.MAX_VALUE;
        long jMin2 = Long.MAX_VALUE;
        for (int i10 = 0; i10 < this.f40754a.size(); i10++) {
            a aVar = (a) this.f40754a.get(i10);
            long bufferedPositionUs = aVar.getBufferedPositionUs();
            if ((aVar.b().contains(1) || aVar.b().contains(2) || aVar.b().contains(4)) && bufferedPositionUs != Long.MIN_VALUE) {
                jMin = Math.min(jMin, bufferedPositionUs);
            }
            if (bufferedPositionUs != Long.MIN_VALUE) {
                jMin2 = Math.min(jMin2, bufferedPositionUs);
            }
        }
        if (jMin != Long.MAX_VALUE) {
            this.f40755b = jMin;
            return jMin;
        }
        if (jMin2 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        long j10 = this.f40755b;
        return j10 != C.TIME_UNSET ? j10 : jMin2;
    }

    @Override // androidx.media3.exoplayer.source.g0
    public long getNextLoadPositionUs() {
        long jMin = Long.MAX_VALUE;
        for (int i10 = 0; i10 < this.f40754a.size(); i10++) {
            long nextLoadPositionUs = ((a) this.f40754a.get(i10)).getNextLoadPositionUs();
            if (nextLoadPositionUs != Long.MIN_VALUE) {
                jMin = Math.min(jMin, nextLoadPositionUs);
            }
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // androidx.media3.exoplayer.source.g0
    public boolean isLoading() {
        for (int i10 = 0; i10 < this.f40754a.size(); i10++) {
            if (((a) this.f40754a.get(i10)).isLoading()) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.media3.exoplayer.source.g0
    public void reevaluateBuffer(long j10) {
        for (int i10 = 0; i10 < this.f40754a.size(); i10++) {
            ((a) this.f40754a.get(i10)).reevaluateBuffer(j10);
        }
    }
}
