package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.v0;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import o9.j0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class s implements o, o.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o[] f18132a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ra.d f18134c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private o.a f18137f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ra.x f18138g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private d0 f18140i;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ArrayList f18135d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final HashMap f18136e = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final IdentityHashMap f18133b = new IdentityHashMap();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private o[] f18139h = new o[0];

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class a implements lb.r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final lb.r f18141a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ra.v f18142b;

        public a(lb.r rVar, ra.v vVar) {
            this.f18141a = rVar;
            this.f18142b = vVar;
        }

        @Override // lb.r
        public void a() {
            this.f18141a.a();
        }

        @Override // lb.r
        public void b(boolean z10) {
            this.f18141a.b(z10);
        }

        @Override // lb.r
        public void c() {
            this.f18141a.c();
        }

        @Override // lb.r
        public boolean d(int i10, long j10) {
            return this.f18141a.d(i10, j10);
        }

        @Override // lb.r
        public void disable() {
            this.f18141a.disable();
        }

        @Override // lb.r
        public void e(long j10, long j11, long j12, List list, ta.o[] oVarArr) {
            this.f18141a.e(j10, j11, j12, list, oVarArr);
        }

        @Override // lb.r
        public void enable() {
            this.f18141a.enable();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f18141a.equals(aVar.f18141a) && this.f18142b.equals(aVar.f18142b);
        }

        @Override // lb.r
        public int evaluateQueueSize(long j10, List list) {
            return this.f18141a.evaluateQueueSize(j10, list);
        }

        @Override // lb.r
        public boolean f(int i10, long j10) {
            return this.f18141a.f(i10, j10);
        }

        @Override // lb.r
        public boolean g(long j10, ta.f fVar, List list) {
            return this.f18141a.g(j10, fVar, list);
        }

        @Override // lb.u
        public v0 getFormat(int i10) {
            return this.f18141a.getFormat(i10);
        }

        @Override // lb.u
        public int getIndexInTrackGroup(int i10) {
            return this.f18141a.getIndexInTrackGroup(i10);
        }

        @Override // lb.r
        public v0 getSelectedFormat() {
            return this.f18141a.getSelectedFormat();
        }

        @Override // lb.r
        public int getSelectedIndex() {
            return this.f18141a.getSelectedIndex();
        }

        @Override // lb.r
        public int getSelectedIndexInTrackGroup() {
            return this.f18141a.getSelectedIndexInTrackGroup();
        }

        @Override // lb.r
        public Object getSelectionData() {
            return this.f18141a.getSelectionData();
        }

        @Override // lb.r
        public int getSelectionReason() {
            return this.f18141a.getSelectionReason();
        }

        @Override // lb.u
        public ra.v getTrackGroup() {
            return this.f18142b;
        }

        @Override // lb.u
        public int h(v0 v0Var) {
            return this.f18141a.h(v0Var);
        }

        public int hashCode() {
            return ((527 + this.f18142b.hashCode()) * 31) + this.f18141a.hashCode();
        }

        @Override // lb.u
        public int indexOf(int i10) {
            return this.f18141a.indexOf(i10);
        }

        @Override // lb.u
        public int length() {
            return this.f18141a.length();
        }

        @Override // lb.r
        public void onPlaybackSpeed(float f10) {
            this.f18141a.onPlaybackSpeed(f10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class b implements o, o.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final o f18143a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f18144b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private o.a f18145c;

        public b(o oVar, long j10) {
            this.f18143a = oVar;
            this.f18144b = j10;
        }

        @Override // com.google.android.exoplayer2.source.o
        public long b(long j10, j0 j0Var) {
            return this.f18143a.b(j10 - this.f18144b, j0Var) + this.f18144b;
        }

        @Override // com.google.android.exoplayer2.source.o, com.google.android.exoplayer2.source.d0
        public boolean continueLoading(long j10) {
            return this.f18143a.continueLoading(j10 - this.f18144b);
        }

        @Override // com.google.android.exoplayer2.source.o
        public void d(o.a aVar, long j10) {
            this.f18145c = aVar;
            this.f18143a.d(this, j10 - this.f18144b);
        }

        @Override // com.google.android.exoplayer2.source.o
        public void discardBuffer(long j10, boolean z10) {
            this.f18143a.discardBuffer(j10 - this.f18144b, z10);
        }

        @Override // com.google.android.exoplayer2.source.o
        public long f(lb.r[] rVarArr, boolean[] zArr, ra.s[] sVarArr, boolean[] zArr2, long j10) {
            ra.s[] sVarArr2 = new ra.s[sVarArr.length];
            int i10 = 0;
            while (true) {
                ra.s sVarB = null;
                if (i10 >= sVarArr.length) {
                    break;
                }
                c cVar = (c) sVarArr[i10];
                if (cVar != null) {
                    sVarB = cVar.b();
                }
                sVarArr2[i10] = sVarB;
                i10++;
            }
            long jF = this.f18143a.f(rVarArr, zArr, sVarArr2, zArr2, j10 - this.f18144b);
            for (int i11 = 0; i11 < sVarArr.length; i11++) {
                ra.s sVar = sVarArr2[i11];
                if (sVar == null) {
                    sVarArr[i11] = null;
                } else {
                    ra.s sVar2 = sVarArr[i11];
                    if (sVar2 == null || ((c) sVar2).b() != sVar) {
                        sVarArr[i11] = new c(sVar, this.f18144b);
                    }
                }
            }
            return jF + this.f18144b;
        }

        @Override // com.google.android.exoplayer2.source.o.a
        public void g(o oVar) {
            ((o.a) ob.a.e(this.f18145c)).g(this);
        }

        @Override // com.google.android.exoplayer2.source.o, com.google.android.exoplayer2.source.d0
        public long getBufferedPositionUs() {
            long bufferedPositionUs = this.f18143a.getBufferedPositionUs();
            if (bufferedPositionUs == Long.MIN_VALUE) {
                return Long.MIN_VALUE;
            }
            return bufferedPositionUs + this.f18144b;
        }

        @Override // com.google.android.exoplayer2.source.o, com.google.android.exoplayer2.source.d0
        public long getNextLoadPositionUs() {
            long nextLoadPositionUs = this.f18143a.getNextLoadPositionUs();
            if (nextLoadPositionUs == Long.MIN_VALUE) {
                return Long.MIN_VALUE;
            }
            return nextLoadPositionUs + this.f18144b;
        }

        @Override // com.google.android.exoplayer2.source.o
        public ra.x getTrackGroups() {
            return this.f18143a.getTrackGroups();
        }

        @Override // com.google.android.exoplayer2.source.d0.a
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public void c(o oVar) {
            ((o.a) ob.a.e(this.f18145c)).c(this);
        }

        @Override // com.google.android.exoplayer2.source.o, com.google.android.exoplayer2.source.d0
        public boolean isLoading() {
            return this.f18143a.isLoading();
        }

        @Override // com.google.android.exoplayer2.source.o
        public void maybeThrowPrepareError() {
            this.f18143a.maybeThrowPrepareError();
        }

        @Override // com.google.android.exoplayer2.source.o
        public long readDiscontinuity() {
            long discontinuity = this.f18143a.readDiscontinuity();
            return discontinuity == C.TIME_UNSET ? C.TIME_UNSET : discontinuity + this.f18144b;
        }

        @Override // com.google.android.exoplayer2.source.o, com.google.android.exoplayer2.source.d0
        public void reevaluateBuffer(long j10) {
            this.f18143a.reevaluateBuffer(j10 - this.f18144b);
        }

        @Override // com.google.android.exoplayer2.source.o
        public long seekToUs(long j10) {
            return this.f18143a.seekToUs(j10 - this.f18144b) + this.f18144b;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class c implements ra.s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ra.s f18146a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f18147b;

        public c(ra.s sVar, long j10) {
            this.f18146a = sVar;
            this.f18147b = j10;
        }

        @Override // ra.s
        public int a(o9.p pVar, DecoderInputBuffer decoderInputBuffer, int i10) {
            int iA = this.f18146a.a(pVar, decoderInputBuffer, i10);
            if (iA == -4) {
                decoderInputBuffer.f16756e = Math.max(0L, decoderInputBuffer.f16756e + this.f18147b);
            }
            return iA;
        }

        public ra.s b() {
            return this.f18146a;
        }

        @Override // ra.s
        public boolean isReady() {
            return this.f18146a.isReady();
        }

        @Override // ra.s
        public void maybeThrowError() {
            this.f18146a.maybeThrowError();
        }

        @Override // ra.s
        public int skipData(long j10) {
            return this.f18146a.skipData(j10 - this.f18147b);
        }
    }

    public s(ra.d dVar, long[] jArr, o... oVarArr) {
        this.f18134c = dVar;
        this.f18132a = oVarArr;
        this.f18140i = dVar.a(new d0[0]);
        for (int i10 = 0; i10 < oVarArr.length; i10++) {
            long j10 = jArr[i10];
            if (j10 != 0) {
                this.f18132a[i10] = new b(oVarArr[i10], j10);
            }
        }
    }

    public o a(int i10) {
        o oVar = this.f18132a[i10];
        return oVar instanceof b ? ((b) oVar).f18143a : oVar;
    }

    @Override // com.google.android.exoplayer2.source.o
    public long b(long j10, j0 j0Var) {
        o[] oVarArr = this.f18139h;
        return (oVarArr.length > 0 ? oVarArr[0] : this.f18132a[0]).b(j10, j0Var);
    }

    @Override // com.google.android.exoplayer2.source.o, com.google.android.exoplayer2.source.d0
    public boolean continueLoading(long j10) {
        if (this.f18135d.isEmpty()) {
            return this.f18140i.continueLoading(j10);
        }
        int size = this.f18135d.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((o) this.f18135d.get(i10)).continueLoading(j10);
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.source.o
    public void d(o.a aVar, long j10) {
        this.f18137f = aVar;
        Collections.addAll(this.f18135d, this.f18132a);
        for (o oVar : this.f18132a) {
            oVar.d(this, j10);
        }
    }

    @Override // com.google.android.exoplayer2.source.o
    public void discardBuffer(long j10, boolean z10) {
        for (o oVar : this.f18139h) {
            oVar.discardBuffer(j10, z10);
        }
    }

    @Override // com.google.android.exoplayer2.source.o
    public long f(lb.r[] rVarArr, boolean[] zArr, ra.s[] sVarArr, boolean[] zArr2, long j10) {
        int[] iArr = new int[rVarArr.length];
        int[] iArr2 = new int[rVarArr.length];
        int i10 = 0;
        for (int i11 = 0; i11 < rVarArr.length; i11++) {
            ra.s sVar = sVarArr[i11];
            Integer num = sVar == null ? null : (Integer) this.f18133b.get(sVar);
            iArr[i11] = num == null ? -1 : num.intValue();
            lb.r rVar = rVarArr[i11];
            if (rVar != null) {
                String str = rVar.getTrackGroup().f51249b;
                iArr2[i11] = Integer.parseInt(str.substring(0, str.indexOf(":")));
            } else {
                iArr2[i11] = -1;
            }
        }
        this.f18133b.clear();
        int length = rVarArr.length;
        ra.s[] sVarArr2 = new ra.s[length];
        ra.s[] sVarArr3 = new ra.s[rVarArr.length];
        lb.r[] rVarArr2 = new lb.r[rVarArr.length];
        ArrayList arrayList = new ArrayList(this.f18132a.length);
        long j11 = j10;
        int i12 = 0;
        while (i12 < this.f18132a.length) {
            for (int i13 = i10; i13 < rVarArr.length; i13++) {
                sVarArr3[i13] = iArr[i13] == i12 ? sVarArr[i13] : null;
                if (iArr2[i13] == i12) {
                    lb.r rVar2 = (lb.r) ob.a.e(rVarArr[i13]);
                    rVarArr2[i13] = new a(rVar2, (ra.v) ob.a.e((ra.v) this.f18136e.get(rVar2.getTrackGroup())));
                } else {
                    rVarArr2[i13] = null;
                }
            }
            int i14 = i12;
            long jF = this.f18132a[i12].f(rVarArr2, zArr, sVarArr3, zArr2, j11);
            if (i14 == 0) {
                j11 = jF;
            } else if (jF != j11) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z10 = false;
            for (int i15 = 0; i15 < rVarArr.length; i15++) {
                if (iArr2[i15] == i14) {
                    ra.s sVar2 = (ra.s) ob.a.e(sVarArr3[i15]);
                    sVarArr2[i15] = sVarArr3[i15];
                    this.f18133b.put(sVar2, Integer.valueOf(i14));
                    z10 = true;
                } else if (iArr[i15] == i14) {
                    ob.a.g(sVarArr3[i15] == null);
                }
            }
            if (z10) {
                arrayList.add(this.f18132a[i14]);
            }
            i12 = i14 + 1;
            i10 = 0;
        }
        int i16 = i10;
        System.arraycopy(sVarArr2, i16, sVarArr, i16, length);
        o[] oVarArr = (o[]) arrayList.toArray(new o[i16]);
        this.f18139h = oVarArr;
        this.f18140i = this.f18134c.a(oVarArr);
        return j11;
    }

    @Override // com.google.android.exoplayer2.source.o.a
    public void g(o oVar) {
        this.f18135d.remove(oVar);
        if (!this.f18135d.isEmpty()) {
            return;
        }
        int i10 = 0;
        for (o oVar2 : this.f18132a) {
            i10 += oVar2.getTrackGroups().f51256a;
        }
        ra.v[] vVarArr = new ra.v[i10];
        int i11 = 0;
        int i12 = 0;
        while (true) {
            o[] oVarArr = this.f18132a;
            if (i11 >= oVarArr.length) {
                this.f18138g = new ra.x(vVarArr);
                ((o.a) ob.a.e(this.f18137f)).g(this);
                return;
            }
            ra.x trackGroups = oVarArr[i11].getTrackGroups();
            int i13 = trackGroups.f51256a;
            int i14 = 0;
            while (i14 < i13) {
                ra.v vVarB = trackGroups.b(i14);
                ra.v vVarB2 = vVarB.b(i11 + ":" + vVarB.f51249b);
                this.f18136e.put(vVarB2, vVarB);
                vVarArr[i12] = vVarB2;
                i14++;
                i12++;
            }
            i11++;
        }
    }

    @Override // com.google.android.exoplayer2.source.o, com.google.android.exoplayer2.source.d0
    public long getBufferedPositionUs() {
        return this.f18140i.getBufferedPositionUs();
    }

    @Override // com.google.android.exoplayer2.source.o, com.google.android.exoplayer2.source.d0
    public long getNextLoadPositionUs() {
        return this.f18140i.getNextLoadPositionUs();
    }

    @Override // com.google.android.exoplayer2.source.o
    public ra.x getTrackGroups() {
        return (ra.x) ob.a.e(this.f18138g);
    }

    @Override // com.google.android.exoplayer2.source.d0.a
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void c(o oVar) {
        ((o.a) ob.a.e(this.f18137f)).c(this);
    }

    @Override // com.google.android.exoplayer2.source.o, com.google.android.exoplayer2.source.d0
    public boolean isLoading() {
        return this.f18140i.isLoading();
    }

    @Override // com.google.android.exoplayer2.source.o
    public void maybeThrowPrepareError() {
        for (o oVar : this.f18132a) {
            oVar.maybeThrowPrepareError();
        }
    }

    @Override // com.google.android.exoplayer2.source.o
    public long readDiscontinuity() {
        long j10 = -9223372036854775807L;
        for (o oVar : this.f18139h) {
            long discontinuity = oVar.readDiscontinuity();
            if (discontinuity == C.TIME_UNSET) {
                if (j10 != C.TIME_UNSET && oVar.seekToUs(j10) != j10) {
                    throw new IllegalStateException("Unexpected child seekToUs result.");
                }
            } else if (j10 == C.TIME_UNSET) {
                for (o oVar2 : this.f18139h) {
                    if (oVar2 == oVar) {
                        break;
                    }
                    if (oVar2.seekToUs(discontinuity) != discontinuity) {
                        throw new IllegalStateException("Unexpected child seekToUs result.");
                    }
                }
                j10 = discontinuity;
            } else if (discontinuity != j10) {
                throw new IllegalStateException("Conflicting discontinuities.");
            }
        }
        return j10;
    }

    @Override // com.google.android.exoplayer2.source.o, com.google.android.exoplayer2.source.d0
    public void reevaluateBuffer(long j10) {
        this.f18140i.reevaluateBuffer(j10);
    }

    @Override // com.google.android.exoplayer2.source.o
    public long seekToUs(long j10) {
        long jSeekToUs = this.f18139h[0].seekToUs(j10);
        int i10 = 1;
        while (true) {
            o[] oVarArr = this.f18139h;
            if (i10 >= oVarArr.length) {
                return jSeekToUs;
            }
            if (oVarArr[i10].seekToUs(jSeekToUs) != jSeekToUs) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i10++;
        }
    }
}
