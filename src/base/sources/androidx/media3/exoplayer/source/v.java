package androidx.media3.exoplayer.source;

import androidx.media3.exoplayer.i1;
import androidx.media3.exoplayer.j2;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
final class v implements q, q.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q[] f6066a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final i2.e f6068c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private q.a f6071f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private i2.v f6072g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private g0 f6074i;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ArrayList f6069d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final HashMap f6070e = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final IdentityHashMap f6067b = new IdentityHashMap();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private q[] f6073h = new q[0];

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class a implements k2.q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final k2.q f6075a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final t1.b0 f6076b;

        public a(k2.q qVar, t1.b0 b0Var) {
            this.f6075a = qVar;
            this.f6076b = b0Var;
        }

        @Override // k2.q
        public void a() {
            this.f6075a.a();
        }

        @Override // k2.q
        public void b(boolean z10) {
            this.f6075a.b(z10);
        }

        @Override // k2.q
        public void c() {
            this.f6075a.c();
        }

        @Override // k2.q
        public void disable() {
            this.f6075a.disable();
        }

        @Override // k2.q
        public void enable() {
            this.f6075a.enable();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f6075a.equals(aVar.f6075a) && this.f6076b.equals(aVar.f6076b);
        }

        @Override // k2.t
        public t1.o getFormat(int i10) {
            return this.f6076b.a(this.f6075a.getIndexInTrackGroup(i10));
        }

        @Override // k2.t
        public int getIndexInTrackGroup(int i10) {
            return this.f6075a.getIndexInTrackGroup(i10);
        }

        @Override // k2.q
        public t1.o getSelectedFormat() {
            return this.f6076b.a(this.f6075a.getSelectedIndexInTrackGroup());
        }

        @Override // k2.q
        public int getSelectedIndexInTrackGroup() {
            return this.f6075a.getSelectedIndexInTrackGroup();
        }

        @Override // k2.t
        public t1.b0 getTrackGroup() {
            return this.f6076b;
        }

        public int hashCode() {
            return ((527 + this.f6076b.hashCode()) * 31) + this.f6075a.hashCode();
        }

        @Override // k2.t
        public int indexOf(int i10) {
            return this.f6075a.indexOf(i10);
        }

        @Override // k2.t
        public int length() {
            return this.f6075a.length();
        }

        @Override // k2.q
        public void onPlaybackSpeed(float f10) {
            this.f6075a.onPlaybackSpeed(f10);
        }
    }

    public v(i2.e eVar, long[] jArr, q... qVarArr) {
        this.f6068c = eVar;
        this.f6066a = qVarArr;
        this.f6074i = eVar.empty();
        for (int i10 = 0; i10 < qVarArr.length; i10++) {
            long j10 = jArr[i10];
            if (j10 != 0) {
                this.f6066a[i10] = new k0(qVarArr[i10], j10);
            }
        }
    }

    @Override // androidx.media3.exoplayer.source.q, androidx.media3.exoplayer.source.g0
    public boolean a(i1 i1Var) {
        if (this.f6069d.isEmpty()) {
            return this.f6074i.a(i1Var);
        }
        int size = this.f6069d.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((q) this.f6069d.get(i10)).a(i1Var);
        }
        return false;
    }

    @Override // androidx.media3.exoplayer.source.q
    public long c(long j10, j2 j2Var) {
        q[] qVarArr = this.f6073h;
        return (qVarArr.length > 0 ? qVarArr[0] : this.f6066a[0]).c(j10, j2Var);
    }

    @Override // androidx.media3.exoplayer.source.q.a
    public void d(q qVar) {
        this.f6069d.remove(qVar);
        if (!this.f6069d.isEmpty()) {
            return;
        }
        int i10 = 0;
        for (q qVar2 : this.f6066a) {
            i10 += qVar2.getTrackGroups().f40818a;
        }
        t1.b0[] b0VarArr = new t1.b0[i10];
        int i11 = 0;
        int i12 = 0;
        while (true) {
            q[] qVarArr = this.f6066a;
            if (i11 >= qVarArr.length) {
                this.f6072g = new i2.v(b0VarArr);
                ((q.a) w1.a.e(this.f6071f)).d(this);
                return;
            }
            i2.v trackGroups = qVarArr[i11].getTrackGroups();
            int i13 = trackGroups.f40818a;
            int i14 = 0;
            while (i14 < i13) {
                t1.b0 b0VarB = trackGroups.b(i14);
                t1.o[] oVarArr = new t1.o[b0VarB.f52572a];
                for (int i15 = 0; i15 < b0VarB.f52572a; i15++) {
                    t1.o oVarA = b0VarB.a(i15);
                    t1.o.b bVarA = oVarA.a();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i11);
                    sb2.append(":");
                    String str = oVarA.f52744a;
                    if (str == null) {
                        str = "";
                    }
                    sb2.append(str);
                    oVarArr[i15] = bVarA.a0(sb2.toString()).K();
                }
                t1.b0 b0Var = new t1.b0(i11 + ":" + b0VarB.f52573b, oVarArr);
                this.f6070e.put(b0Var, b0VarB);
                b0VarArr[i12] = b0Var;
                i14++;
                i12++;
            }
            i11++;
        }
    }

    @Override // androidx.media3.exoplayer.source.q
    public void discardBuffer(long j10, boolean z10) {
        for (q qVar : this.f6073h) {
            qVar.discardBuffer(j10, z10);
        }
    }

    @Override // androidx.media3.exoplayer.source.q
    public long f(k2.q[] qVarArr, boolean[] zArr, i2.q[] qVarArr2, boolean[] zArr2, long j10) {
        int[] iArr = new int[qVarArr.length];
        int[] iArr2 = new int[qVarArr.length];
        int i10 = 0;
        for (int i11 = 0; i11 < qVarArr.length; i11++) {
            i2.q qVar = qVarArr2[i11];
            Integer num = qVar == null ? null : (Integer) this.f6067b.get(qVar);
            iArr[i11] = num == null ? -1 : num.intValue();
            k2.q qVar2 = qVarArr[i11];
            if (qVar2 != null) {
                String str = qVar2.getTrackGroup().f52573b;
                iArr2[i11] = Integer.parseInt(str.substring(0, str.indexOf(":")));
            } else {
                iArr2[i11] = -1;
            }
        }
        this.f6067b.clear();
        int length = qVarArr.length;
        i2.q[] qVarArr3 = new i2.q[length];
        i2.q[] qVarArr4 = new i2.q[qVarArr.length];
        k2.q[] qVarArr5 = new k2.q[qVarArr.length];
        ArrayList arrayList = new ArrayList(this.f6066a.length);
        long j11 = j10;
        int i12 = 0;
        while (i12 < this.f6066a.length) {
            for (int i13 = i10; i13 < qVarArr.length; i13++) {
                qVarArr4[i13] = iArr[i13] == i12 ? qVarArr2[i13] : null;
                if (iArr2[i13] == i12) {
                    k2.q qVar3 = (k2.q) w1.a.e(qVarArr[i13]);
                    qVarArr5[i13] = new a(qVar3, (t1.b0) w1.a.e((t1.b0) this.f6070e.get(qVar3.getTrackGroup())));
                } else {
                    qVarArr5[i13] = null;
                }
            }
            int i14 = i12;
            long jF = this.f6066a[i12].f(qVarArr5, zArr, qVarArr4, zArr2, j11);
            if (i14 == 0) {
                j11 = jF;
            } else if (jF != j11) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z10 = false;
            for (int i15 = 0; i15 < qVarArr.length; i15++) {
                if (iArr2[i15] == i14) {
                    i2.q qVar4 = (i2.q) w1.a.e(qVarArr4[i15]);
                    qVarArr3[i15] = qVarArr4[i15];
                    this.f6067b.put(qVar4, Integer.valueOf(i14));
                    z10 = true;
                } else if (iArr[i15] == i14) {
                    w1.a.g(qVarArr4[i15] == null);
                }
            }
            if (z10) {
                arrayList.add(this.f6066a[i14]);
            }
            i12 = i14 + 1;
            i10 = 0;
        }
        int i16 = i10;
        System.arraycopy(qVarArr3, i16, qVarArr2, i16, length);
        this.f6073h = (q[]) arrayList.toArray(new q[i16]);
        this.f6074i = this.f6068c.a(arrayList, com.google.common.collect.l0.m(arrayList, new sc.g() { // from class: androidx.media3.exoplayer.source.u
            @Override // sc.g
            public final Object apply(Object obj) {
                return ((q) obj).getTrackGroups().c();
            }
        }));
        return j11;
    }

    @Override // androidx.media3.exoplayer.source.q
    public void g(q.a aVar, long j10) {
        this.f6071f = aVar;
        Collections.addAll(this.f6069d, this.f6066a);
        for (q qVar : this.f6066a) {
            qVar.g(this, j10);
        }
    }

    @Override // androidx.media3.exoplayer.source.q, androidx.media3.exoplayer.source.g0
    public long getBufferedPositionUs() {
        return this.f6074i.getBufferedPositionUs();
    }

    @Override // androidx.media3.exoplayer.source.q, androidx.media3.exoplayer.source.g0
    public long getNextLoadPositionUs() {
        return this.f6074i.getNextLoadPositionUs();
    }

    @Override // androidx.media3.exoplayer.source.q
    public i2.v getTrackGroups() {
        return (i2.v) w1.a.e(this.f6072g);
    }

    public q h(int i10) {
        q qVar = this.f6066a[i10];
        return qVar instanceof k0 ? ((k0) qVar).b() : qVar;
    }

    @Override // androidx.media3.exoplayer.source.g0.a
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void e(q qVar) {
        ((q.a) w1.a.e(this.f6071f)).e(this);
    }

    @Override // androidx.media3.exoplayer.source.q, androidx.media3.exoplayer.source.g0
    public boolean isLoading() {
        return this.f6074i.isLoading();
    }

    @Override // androidx.media3.exoplayer.source.q
    public void maybeThrowPrepareError() {
        for (q qVar : this.f6066a) {
            qVar.maybeThrowPrepareError();
        }
    }

    @Override // androidx.media3.exoplayer.source.q
    public long readDiscontinuity() {
        long j10 = -9223372036854775807L;
        for (q qVar : this.f6073h) {
            long discontinuity = qVar.readDiscontinuity();
            if (discontinuity == C.TIME_UNSET) {
                if (j10 != C.TIME_UNSET && qVar.seekToUs(j10) != j10) {
                    throw new IllegalStateException("Unexpected child seekToUs result.");
                }
            } else if (j10 == C.TIME_UNSET) {
                for (q qVar2 : this.f6073h) {
                    if (qVar2 == qVar) {
                        break;
                    }
                    if (qVar2.seekToUs(discontinuity) != discontinuity) {
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

    @Override // androidx.media3.exoplayer.source.q, androidx.media3.exoplayer.source.g0
    public void reevaluateBuffer(long j10) {
        this.f6074i.reevaluateBuffer(j10);
    }

    @Override // androidx.media3.exoplayer.source.q
    public long seekToUs(long j10) {
        long jSeekToUs = this.f6073h[0].seekToUs(j10);
        int i10 = 1;
        while (true) {
            q[] qVarArr = this.f6073h;
            if (i10 >= qVarArr.length) {
                return jSeekToUs;
            }
            if (qVarArr[i10].seekToUs(jSeekToUs) != jSeekToUs) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i10++;
        }
    }
}
