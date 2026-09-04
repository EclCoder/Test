package o9;

import com.google.android.exoplayer2.b2;
import com.google.android.exoplayer2.h2;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultLoadControl;
import ob.r0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class c implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final nb.m f48267a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f48268b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f48269c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f48270d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f48271e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f48272f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f48273g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final long f48274h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f48275i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f48276j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f48277k;

    public c() {
        this(new nb.m(true, C.DEFAULT_BUFFER_SEGMENT_SIZE), DefaultLoadControl.DEFAULT_MAX_BUFFER_MS, DefaultLoadControl.DEFAULT_MAX_BUFFER_MS, DefaultLoadControl.DEFAULT_BUFFER_FOR_PLAYBACK_MS, 5000, -1, false, 0, false);
    }

    private static void d(int i10, int i11, String str, String str2) {
        ob.a.b(i10 >= i11, str + " cannot be less than " + str2);
    }

    private static int f(int i10) {
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

    private void g(boolean z10) {
        int i10 = this.f48272f;
        if (i10 == -1) {
            i10 = C.DEFAULT_VIDEO_BUFFER_SIZE;
        }
        this.f48276j = i10;
        this.f48277k = false;
        if (z10) {
            this.f48267a.d();
        }
    }

    @Override // o9.r
    public boolean a(h2 h2Var, ra.k kVar, long j10, float f10, boolean z10, long j11) {
        long jI0 = r0.i0(j10, f10);
        long jMin = z10 ? this.f48271e : this.f48270d;
        if (j11 != C.TIME_UNSET) {
            jMin = Math.min(j11 / 2, jMin);
        }
        if (jMin <= 0 || jI0 >= jMin) {
            return true;
        }
        return !this.f48273g && this.f48267a.c() >= this.f48276j;
    }

    @Override // o9.r
    public void b(h2 h2Var, ra.k kVar, b2[] b2VarArr, ra.x xVar, lb.r[] rVarArr) {
        int iE = this.f48272f;
        if (iE == -1) {
            iE = e(b2VarArr, rVarArr);
        }
        this.f48276j = iE;
        this.f48267a.e(iE);
    }

    @Override // o9.r
    public boolean c(long j10, long j11, float f10) {
        boolean z10 = true;
        boolean z11 = this.f48267a.c() >= this.f48276j;
        long jMin = this.f48268b;
        if (f10 > 1.0f) {
            jMin = Math.min(r0.d0(jMin, f10), this.f48269c);
        }
        if (j11 < Math.max(jMin, 500000L)) {
            if (!this.f48273g && z11) {
                z10 = false;
            }
            this.f48277k = z10;
            if (!z10 && j11 < 500000) {
                ob.u.i("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j11 >= this.f48269c || z11) {
            this.f48277k = false;
        }
        return this.f48277k;
    }

    protected int e(b2[] b2VarArr, lb.r[] rVarArr) {
        int iF = 0;
        for (int i10 = 0; i10 < b2VarArr.length; i10++) {
            if (rVarArr[i10] != null) {
                iF += f(b2VarArr[i10].getTrackType());
            }
        }
        return Math.max(C.DEFAULT_VIDEO_BUFFER_SIZE, iF);
    }

    @Override // o9.r
    public nb.b getAllocator() {
        return this.f48267a;
    }

    @Override // o9.r
    public long getBackBufferDurationUs() {
        return this.f48274h;
    }

    @Override // o9.r
    public void onPrepared() {
        g(false);
    }

    @Override // o9.r
    public void onReleased() {
        g(true);
    }

    @Override // o9.r
    public void onStopped() {
        g(true);
    }

    @Override // o9.r
    public boolean retainBackBufferFromKeyframe() {
        return this.f48275i;
    }

    protected c(nb.m mVar, int i10, int i11, int i12, int i13, int i14, boolean z10, int i15, boolean z11) {
        d(i12, 0, "bufferForPlaybackMs", MBridgeConstans.ENDCARD_URL_TYPE_PL);
        d(i13, 0, "bufferForPlaybackAfterRebufferMs", MBridgeConstans.ENDCARD_URL_TYPE_PL);
        d(i10, i12, "minBufferMs", "bufferForPlaybackMs");
        d(i10, i13, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        d(i11, i10, "maxBufferMs", "minBufferMs");
        d(i15, 0, "backBufferDurationMs", MBridgeConstans.ENDCARD_URL_TYPE_PL);
        this.f48267a = mVar;
        this.f48268b = r0.H0(i10);
        this.f48269c = r0.H0(i11);
        this.f48270d = r0.H0(i12);
        this.f48271e = r0.H0(i13);
        this.f48272f = i14;
        this.f48276j = i14 == -1 ? C.DEFAULT_VIDEO_BUFFER_SIZE : i14;
        this.f48273g = z10;
        this.f48274h = r0.H0(i15);
        this.f48275i = z11;
    }
}
