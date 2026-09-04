package qb;

import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.opengl.GLES20;
import android.opengl.Matrix;
import com.google.android.exoplayer2.util.GlUtil;
import com.google.android.exoplayer2.v0;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import ob.m0;
import ob.u;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class i implements pb.k, a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f50573i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private SurfaceTexture f50574j;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private byte[] f50577m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f50565a = new AtomicBoolean();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f50566b = new AtomicBoolean(true);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final g f50567c = new g();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c f50568d = new c();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final m0 f50569e = new m0();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final m0 f50570f = new m0();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final float[] f50571g = new float[16];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final float[] f50572h = new float[16];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private volatile int f50575k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f50576l = -1;

    private void h(byte[] bArr, int i10, long j10) {
        byte[] bArr2 = this.f50577m;
        int i11 = this.f50576l;
        this.f50577m = bArr;
        if (i10 == -1) {
            i10 = this.f50575k;
        }
        this.f50576l = i10;
        if (i11 == i10 && Arrays.equals(bArr2, this.f50577m)) {
            return;
        }
        byte[] bArr3 = this.f50577m;
        e eVarA = bArr3 != null ? f.a(bArr3, this.f50576l) : null;
        if (eVarA == null || !g.c(eVarA)) {
            eVarA = e.b(this.f50576l);
        }
        this.f50570f.a(j10, eVarA);
    }

    @Override // qb.a
    public void a(long j10, float[] fArr) {
        this.f50568d.e(j10, fArr);
    }

    @Override // pb.k
    public void b(long j10, long j11, v0 v0Var, MediaFormat mediaFormat) {
        this.f50569e.a(j11, Long.valueOf(j10));
        h(v0Var.f18878v, v0Var.f18879w, j11);
    }

    @Override // qb.a
    public void c() {
        this.f50569e.c();
        this.f50568d.d();
        this.f50566b.set(true);
    }

    public void e(float[] fArr, boolean z10) {
        GLES20.glClear(16384);
        try {
            GlUtil.b();
        } catch (GlUtil.GlException e10) {
            u.d("SceneRenderer", "Failed to draw a frame", e10);
        }
        if (this.f50565a.compareAndSet(true, false)) {
            ((SurfaceTexture) ob.a.e(this.f50574j)).updateTexImage();
            try {
                GlUtil.b();
            } catch (GlUtil.GlException e11) {
                u.d("SceneRenderer", "Failed to draw a frame", e11);
            }
            if (this.f50566b.compareAndSet(true, false)) {
                GlUtil.j(this.f50571g);
            }
            long timestamp = this.f50574j.getTimestamp();
            Long l10 = (Long) this.f50569e.g(timestamp);
            if (l10 != null) {
                this.f50568d.c(this.f50571g, l10.longValue());
            }
            e eVar = (e) this.f50570f.j(timestamp);
            if (eVar != null) {
                this.f50567c.d(eVar);
            }
        }
        Matrix.multiplyMM(this.f50572h, 0, fArr, 0, this.f50571g, 0);
        this.f50567c.a(this.f50573i, this.f50572h, z10);
    }

    public SurfaceTexture f() {
        try {
            GLES20.glClearColor(0.5f, 0.5f, 0.5f, 1.0f);
            GlUtil.b();
            this.f50567c.b();
            GlUtil.b();
            this.f50573i = GlUtil.f();
        } catch (GlUtil.GlException e10) {
            u.d("SceneRenderer", "Failed to initialize the renderer", e10);
        }
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f50573i);
        this.f50574j = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: qb.h
            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                this.f50564a.f50565a.set(true);
            }
        });
        return this.f50574j;
    }

    public void g(int i10) {
        this.f50575k = i10;
    }
}
