package androidx.media3.exoplayer;

import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultLoadControl;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class l implements h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l2.e f5461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f5462b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f5463c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f5464d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f5465e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f5466f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f5467g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final long f5468h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f5469i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final HashMap f5470j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f5471k;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f5472a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f5473b;

        private b() {
        }
    }

    public l() {
        this(new l2.e(true, C.DEFAULT_BUFFER_SEGMENT_SIZE), DefaultLoadControl.DEFAULT_MAX_BUFFER_MS, DefaultLoadControl.DEFAULT_MAX_BUFFER_MS, DefaultLoadControl.DEFAULT_BUFFER_FOR_PLAYBACK_MS, 5000, -1, false, 0, false);
    }

    private static void i(int i10, int i11, String str, String str2) {
        w1.a.b(i10 >= i11, str + " cannot be less than " + str2);
    }

    private static int l(int i10) {
        switch (i10) {
            case -2:
                return 0;
            case -1:
            default:
                throw new IllegalArgumentException();
            case 0:
                return 144310272;
            case 1:
                return C.DEFAULT_VIDEO_BUFFER_SIZE;
            case 2:
                return 131072000;
            case 3:
            case 4:
            case 5:
            case 6:
                return 131072;
        }
    }

    private void m(c2.x1 x1Var) {
        if (this.f5470j.remove(x1Var) != null) {
            o();
        }
    }

    private void n(c2.x1 x1Var) {
        b bVar = (b) w1.a.e((b) this.f5470j.get(x1Var));
        int i10 = this.f5466f;
        if (i10 == -1) {
            i10 = C.DEFAULT_VIDEO_BUFFER_SIZE;
        }
        bVar.f5473b = i10;
        bVar.f5472a = false;
    }

    private void o() {
        if (this.f5470j.isEmpty()) {
            this.f5461a.d();
        } else {
            this.f5461a.e(k());
        }
    }

    @Override // androidx.media3.exoplayer.h1
    public boolean a(h1.a aVar) {
        long jE0 = w1.c0.e0(aVar.f5374e, aVar.f5375f);
        long jMin = aVar.f5377h ? this.f5465e : this.f5464d;
        long j10 = aVar.f5378i;
        if (j10 != C.TIME_UNSET) {
            jMin = Math.min(j10 / 2, jMin);
        }
        if (jMin <= 0 || jE0 >= jMin) {
            return true;
        }
        return !this.f5467g && this.f5461a.c() >= k();
    }

    @Override // androidx.media3.exoplayer.h1
    public boolean b(c2.x1 x1Var) {
        return this.f5469i;
    }

    @Override // androidx.media3.exoplayer.h1
    public void c(c2.x1 x1Var) {
        long id2 = Thread.currentThread().getId();
        long j10 = this.f5471k;
        w1.a.h(j10 == -1 || j10 == id2, "Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).");
        this.f5471k = id2;
        if (!this.f5470j.containsKey(x1Var)) {
            this.f5470j.put(x1Var, new b());
        }
        n(x1Var);
    }

    @Override // androidx.media3.exoplayer.h1
    public long d(c2.x1 x1Var) {
        return this.f5468h;
    }

    @Override // androidx.media3.exoplayer.h1
    public void e(c2.x1 x1Var, t1.a0 a0Var, androidx.media3.exoplayer.source.r.b bVar, f2[] f2VarArr, i2.v vVar, k2.q[] qVarArr) {
        b bVar2 = (b) w1.a.e((b) this.f5470j.get(x1Var));
        int iJ = this.f5466f;
        if (iJ == -1) {
            iJ = j(f2VarArr, qVarArr);
        }
        bVar2.f5473b = iJ;
        o();
    }

    @Override // androidx.media3.exoplayer.h1
    public boolean f(h1.a aVar) {
        b bVar = (b) w1.a.e((b) this.f5470j.get(aVar.f5370a));
        boolean z10 = true;
        boolean z11 = this.f5461a.c() >= k();
        long jMin = this.f5462b;
        float f10 = aVar.f5375f;
        if (f10 > 1.0f) {
            jMin = Math.min(w1.c0.Z(jMin, f10), this.f5463c);
        }
        long jMax = Math.max(jMin, 500000L);
        long j10 = aVar.f5374e;
        if (j10 < jMax) {
            if (!this.f5467g && z11) {
                z10 = false;
            }
            bVar.f5472a = z10;
            if (!z10 && j10 < 500000) {
                w1.n.h("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j10 >= this.f5463c || z11) {
            bVar.f5472a = false;
        }
        return bVar.f5472a;
    }

    @Override // androidx.media3.exoplayer.h1
    public void g(c2.x1 x1Var) {
        m(x1Var);
    }

    @Override // androidx.media3.exoplayer.h1
    public l2.b getAllocator() {
        return this.f5461a;
    }

    @Override // androidx.media3.exoplayer.h1
    public void h(c2.x1 x1Var) {
        m(x1Var);
        if (this.f5470j.isEmpty()) {
            this.f5471k = -1L;
        }
    }

    protected int j(f2[] f2VarArr, k2.q[] qVarArr) {
        int iL = 0;
        for (int i10 = 0; i10 < f2VarArr.length; i10++) {
            if (qVarArr[i10] != null) {
                iL += l(f2VarArr[i10].getTrackType());
            }
        }
        return Math.max(C.DEFAULT_VIDEO_BUFFER_SIZE, iL);
    }

    int k() {
        Iterator it = this.f5470j.values().iterator();
        int i10 = 0;
        while (it.hasNext()) {
            i10 += ((b) it.next()).f5473b;
        }
        return i10;
    }

    protected l(l2.e eVar, int i10, int i11, int i12, int i13, int i14, boolean z10, int i15, boolean z11) {
        i(i12, 0, "bufferForPlaybackMs", MBridgeConstans.ENDCARD_URL_TYPE_PL);
        i(i13, 0, "bufferForPlaybackAfterRebufferMs", MBridgeConstans.ENDCARD_URL_TYPE_PL);
        i(i10, i12, "minBufferMs", "bufferForPlaybackMs");
        i(i10, i13, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        i(i11, i10, "maxBufferMs", "minBufferMs");
        i(i15, 0, "backBufferDurationMs", MBridgeConstans.ENDCARD_URL_TYPE_PL);
        this.f5461a = eVar;
        this.f5462b = w1.c0.E0(i10);
        this.f5463c = w1.c0.E0(i11);
        this.f5464d = w1.c0.E0(i12);
        this.f5465e = w1.c0.E0(i13);
        this.f5466f = i14;
        this.f5467g = z10;
        this.f5468h = w1.c0.E0(i15);
        this.f5469i = z11;
        this.f5470j = new HashMap();
        this.f5471k = -1L;
    }
}
