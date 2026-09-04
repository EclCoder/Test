package wi;

import android.content.Context;
import android.content.Intent;
import android.hardware.display.VirtualDisplay;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.media.projection.MediaProjection;
import android.media.projection.MediaProjectionManager;
import android.view.Surface;
import android.view.SurfaceView;
import bj.k;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.nio.ByteBuffer;
import ji.m;
import li.e;
import ni.g;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private bj.b f56279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private MediaProjection f56280b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final MediaProjectionManager f56281c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected vi.c f56282d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ni.e f56283e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private mi.a f56284f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected SurfaceView f56286h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private VirtualDisplay f56287i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Intent f56290l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected xi.a f56292n;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final mi.c f56297s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final vi.b f56298t;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f56285g = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f56288j = Sdk$SDKError.b.WEBVIEW_ERROR_VALUE;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f56289k = -1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private MediaProjection.Callback f56291m = new a();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final zi.b f56293o = new zi.b();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f56294p = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f56295q = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final ni.c f56296r = new ni.c() { // from class: wi.a
        @Override // ni.c
        public final void a(e eVar) {
            this.f56278a.h(eVar);
        }
    };

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a extends MediaProjection.Callback {
        a() {
        }
    }

    /* JADX INFO: renamed from: wi.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class C0860b extends MediaProjection.Callback {
        C0860b() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class c extends VirtualDisplay.Callback {
        c() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class d implements mi.c {
        d() {
        }

        @Override // mi.c
        public void a(MediaFormat mediaFormat) {
            b.this.f56292n.i(mediaFormat);
        }

        @Override // mi.c
        public void b(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
            b.this.f56292n.b(byteBuffer, bufferInfo);
            if (b.this.f56285g) {
                b.this.e(byteBuffer, bufferInfo);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class e implements vi.b {
        e() {
        }

        @Override // vi.b
        public void a(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
            b.this.f56293o.a();
            b.this.f56292n.a(byteBuffer, bufferInfo);
            if (b.this.f56285g) {
                b.this.f(byteBuffer, bufferInfo);
            }
        }

        @Override // vi.b
        public void b(MediaFormat mediaFormat) {
            b bVar = b.this;
            bVar.f56292n.e(mediaFormat, !bVar.f56295q);
        }

        @Override // vi.b
        public void c(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3) {
            b.this.j(byteBuffer.duplicate(), byteBuffer2 != null ? byteBuffer2.duplicate() : null, byteBuffer3 != null ? byteBuffer3.duplicate() : null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static /* synthetic */ class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f56304a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f56305b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f56306c;

        static {
            int[] iArr = new int[ji.a.values().length];
            f56306c = iArr;
            try {
                iArr[ji.a.G711.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f56306c[ji.a.AAC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f56306c[ji.a.OPUS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[m.values().length];
            f56305b = iArr2;
            try {
                iArr2[m.H264.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f56305b[m.H265.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f56305b[m.AV1.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr3 = new int[g.values().length];
            f56304a = iArr3;
            try {
                iArr3[g.SYNC.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f56304a[g.ASYNC.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public b(Context context, boolean z10) {
        d dVar = new d();
        this.f56297s = dVar;
        e eVar = new e();
        this.f56298t = eVar;
        if (z10) {
            this.f56279a = new k(context);
        }
        this.f56281c = (MediaProjectionManager) context.getSystemService("media_projection");
        this.f56286h = null;
        this.f56282d = new vi.c(eVar);
        this.f56284f = new mi.a(dVar);
        t(g.SYNC);
        this.f56292n = new zi.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h(li.e eVar) {
        this.f56284f.a(eVar);
    }

    private void u(int i10, Intent intent, MediaProjection.Callback callback) {
        if (intent == null) {
            throw new RuntimeException("You need send intent data before startRecord or startStream");
        }
        long jNanoTime = System.nanoTime() / 1000;
        this.f56282d.y(jNanoTime);
        if (this.f56295q) {
            this.f56284f.y(jNanoTime);
        }
        bj.b bVar = this.f56279a;
        if (bVar != null) {
            bVar.start();
            this.f56279a.b(this.f56282d.K());
        }
        bj.b bVar2 = this.f56279a;
        Surface surface = bVar2 != null ? bVar2.getSurface() : this.f56282d.K();
        if (this.f56280b == null) {
            this.f56280b = this.f56281c.getMediaProjection(i10, intent);
        }
        this.f56280b.registerCallback(callback, null);
        c cVar = new c();
        if ((this.f56279a == null || this.f56282d.L() != 90) && this.f56282d.L() != 270) {
            this.f56287i = this.f56280b.createVirtualDisplay("Stream Display", this.f56282d.M(), this.f56282d.J(), this.f56288j, 0, surface, cVar, null);
        } else {
            this.f56287i = this.f56280b.createVirtualDisplay("Stream Display", this.f56282d.J(), this.f56282d.M(), this.f56288j, 0, surface, cVar, null);
        }
        if (this.f56295q) {
            this.f56283e.h();
        }
    }

    protected abstract void e(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo);

    protected abstract void f(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo);

    public boolean g() {
        return this.f56285g;
    }

    protected abstract void i(boolean z10, int i10);

    protected abstract void j(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3);

    public boolean k() {
        return m(C.DEFAULT_BUFFER_SEGMENT_SIZE, 32000, true, false, false);
    }

    public boolean l(int i10, int i11, int i12, boolean z10, boolean z11, boolean z12) {
        if (!this.f56283e.c(i10, i12, z10, z11, z12)) {
            return false;
        }
        i(z10, i12);
        boolean zE = this.f56284f.E(i11, i12, z10);
        this.f56295q = zE;
        return zE;
    }

    public boolean m(int i10, int i11, boolean z10, boolean z11, boolean z12) {
        return l(0, i10, i11, z10, z11, z12);
    }

    public boolean n(int i10, int i11, int i12, int i13, int i14, int i15) {
        return o(i10, i11, i12, i13, i14, i15, -1, -1, 2);
    }

    public boolean o(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        int i19;
        boolean z10;
        int i20;
        this.f56288j = i15;
        this.f56294p = this.f56282d.N(i10, i11, i12, i13, i14, i18, vi.a.SURFACE, i16, i17);
        bj.b bVar = this.f56279a;
        if (bVar != null) {
            if (i14 == 90 || i14 == 270) {
                i19 = i10;
                z10 = true;
                i20 = i11;
            } else {
                i19 = i11;
                z10 = false;
                i20 = i10;
            }
            bVar.a(i20, i19);
            bj.b bVar2 = this.f56279a;
            if (bVar2 instanceof k) {
                k kVar = (k) bVar2;
                kVar.t(i20, i19);
                kVar.s(z10);
            }
        }
        return this.f56294p;
    }

    public void p() {
        if (this.f56282d.n()) {
            this.f56282d.O();
        }
    }

    public Intent q() {
        return this.f56281c.createScreenCaptureIntent();
    }

    public void r(int i10, Intent intent) {
        this.f56289k = i10;
        this.f56290l = intent;
    }

    public void s(MediaProjection.Callback callback) {
        if (this.f56294p || this.f56295q) {
            throw new RuntimeException("You need to set MediaProjection callback before prepareVideo and prepareAudio");
        }
        if (callback == null) {
            callback = new C0860b();
        }
        this.f56291m = callback;
    }

    public void t(g gVar) {
        int i10 = f.f56304a[gVar.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                return;
            }
            this.f56283e = new ni.e(this.f56296r);
            this.f56284f = new mi.a(this.f56297s);
            return;
        }
        this.f56283e = new ni.f();
        mi.a aVar = new mi.a(this.f56297s);
        this.f56284f = aVar;
        aVar.F(((ni.f) this.f56283e).j());
    }

    public void v(String str) {
        this.f56285g = true;
        if (this.f56292n.h()) {
            p();
        } else {
            u(this.f56289k, this.f56290l, this.f56291m);
        }
        w(str);
    }

    protected abstract void w(String str);

    public void x() {
        if (this.f56285g) {
            this.f56285g = false;
            y();
        }
        if (this.f56292n.g()) {
            return;
        }
        if (this.f56295q) {
            this.f56283e.i();
        }
        MediaProjection mediaProjection = this.f56280b;
        if (mediaProjection != null) {
            mediaProjection.stop();
            this.f56280b = null;
        }
        bj.b bVar = this.f56279a;
        if (bVar != null) {
            bVar.c();
            this.f56279a.stop();
        }
        VirtualDisplay virtualDisplay = this.f56287i;
        if (virtualDisplay != null) {
            virtualDisplay.release();
        }
        this.f56282d.A();
        this.f56284f.A();
        this.f56290l = null;
        this.f56292n.d();
    }

    protected abstract void y();
}
