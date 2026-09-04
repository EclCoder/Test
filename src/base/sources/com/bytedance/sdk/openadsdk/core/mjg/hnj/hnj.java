package com.bytedance.sdk.openadsdk.core.mjg.hnj;

import android.app.Activity;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Looper;
import android.os.Message;
import android.view.SurfaceHolder;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.component.utils.xyo;
import com.bytedance.sdk.openadsdk.core.mjg.gjv.qor;
import com.bytedance.sdk.openadsdk.core.mjg.hn.sk;
import com.bytedance.sdk.openadsdk.core.model.as;
import com.bytedance.sdk.openadsdk.core.oj;
import com.bytedance.sdk.openadsdk.core.orl.dkl;
import com.bytedance.sdk.openadsdk.core.widget.apu;
import com.bytedance.sdk.openadsdk.gjv.dse;
import com.bytedance.sdk.openadsdk.gjv.sk.hn.fc;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.mbridge.msdk.mbnative.report.RN.lkCBSIFlvmyGX;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import v6.b;
import x6.a;
import x6.c;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public abstract class hnj implements c, xyo.hnj, com.bytedance.sdk.openadsdk.core.mjg.hn.hnj {
    protected final as aq;
    protected hn as;
    protected qor dkl;
    protected final Context dnm;

    /* JADX INFO: renamed from: do, reason: not valid java name */
    protected boolean f39do;
    protected sk dse;
    protected boolean eum;
    protected SurfaceHolder gjv;

    /* JADX INFO: renamed from: gm, reason: collision with root package name */
    protected long f13835gm;
    protected boolean hqh;
    protected boolean jip;
    protected long nyv;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    protected SurfaceTexture f13838sk;
    protected WeakReference<c.b> tgn;
    protected final ViewGroup tu;

    /* JADX INFO: renamed from: ua, reason: collision with root package name */
    private long f13840ua;

    /* JADX INFO: renamed from: vf, reason: collision with root package name */
    protected dkl f13842vf;
    protected c.InterfaceC0870c xyo;
    protected String hnj = "TTAD.VideoController";

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    protected final int f13836hn = 100;
    protected final xyo qor = new xyo(Looper.getMainLooper(), this);
    protected long ojm = 0;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    protected long f13839ta = 0;
    protected final List<Runnable> bug = new ArrayList();
    protected boolean orl = false;
    protected boolean mjg = false;

    /* JADX INFO: renamed from: fc, reason: collision with root package name */
    protected boolean f13834fc = true;
    protected boolean uua = false;

    /* JADX INFO: renamed from: oj, reason: collision with root package name */
    protected boolean f13837oj = false;

    /* JADX INFO: renamed from: xn, reason: collision with root package name */
    protected boolean f13843xn = false;
    protected AtomicBoolean apu = new AtomicBoolean(false);
    protected boolean wu = true;
    protected boolean pty = false;

    /* JADX INFO: renamed from: ul, reason: collision with root package name */
    protected Runnable f13841ul = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj.1
        @Override // java.lang.Runnable
        public void run() {
            boolean z10 = hnj.this.orl;
            hnj.this.apu();
        }
    };
    private long fvt = 0;
    private boolean orp = true;
    private int sq = 1;
    private final AtomicBoolean jbd = new AtomicBoolean(false);

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj$4, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] hnj;

        static {
            int[] iArr = new int[apu.hnj.values().length];
            hnj = iArr;
            try {
                iArr[apu.hnj.PAUSE_VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                hnj[apu.hnj.RELEASE_VIDEO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                hnj[apu.hnj.START_VIDEO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public hnj(Context context, as asVar, ViewGroup viewGroup) {
        this.aq = asVar;
        this.dnm = context;
        this.tu = viewGroup;
        this.hnj += hashCode();
    }

    private boolean jip() {
        sk skVar = this.dse;
        if (skVar != null) {
            return skVar.orl() instanceof b;
        }
        return false;
    }

    private void ua() {
        sk skVar = this.dse;
        if (skVar != null) {
            skVar.gjv(0);
            this.dse.hnj(false, false);
            this.dse.qor(false);
            this.dse.sk();
            this.dse.dse();
        }
    }

    protected void apu() {
        this.qor.postAtFrontOfQueue(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj.2
            @Override // java.lang.Runnable
            public void run() {
                hnj hnjVar = hnj.this;
                if (hnjVar.dkl != null) {
                    boolean z10 = hnjVar.orl;
                    hnj.this.dkl.ta();
                }
            }
        });
    }

    @Override // x6.c
    public final int aq() {
        qor qorVar = this.dkl;
        if (qorVar == null) {
            return 0;
        }
        return qorVar.jip();
    }

    public boolean as() {
        return this.uua;
    }

    @Override // x6.c
    public long dkl() {
        return this.ojm;
    }

    @Override // x6.c
    public u6.b dnm() {
        return this.dkl;
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    public boolean m29do() {
        return this.jip;
    }

    @Override // x6.c
    public final long dse() {
        qor qorVar = this.dkl;
        if (qorVar == null) {
            return 0L;
        }
        return qorVar.fc();
    }

    @Override // x6.c
    /* JADX INFO: renamed from: eum, reason: merged with bridge method [inline-methods] */
    public final sk bug() {
        return this.dse;
    }

    @Override // x6.c
    public boolean fc() {
        return true;
    }

    @Override // x6.c
    public abstract /* synthetic */ void gjv();

    public void gjv(long j10) {
        this.f13835gm = j10;
    }

    public final long gm() {
        return dkl() + dse();
    }

    public void hn(long j10) {
        this.ojm = j10;
        this.f13839ta = Math.max(this.f13839ta, j10);
    }

    @Override // x6.c
    public abstract /* synthetic */ void hnj();

    @Override // com.bytedance.sdk.component.utils.xyo.hnj
    public void hnj(Message message) {
    }

    public abstract /* synthetic */ void hnj(a aVar, View view);

    public abstract /* synthetic */ void hnj(boolean z10, int i10);

    protected final void hqh() {
        this.pty = true;
        fc.hnj hnjVar = new fc.hnj();
        hnjVar.hn(dkl());
        hnjVar.gjv(ojm() / ((long) pty()));
        hnjVar.qor(dse());
        hnjVar.hnj(uua());
        com.bytedance.sdk.openadsdk.gjv.sk.hnj.hnj.hnj(this.dse, hnjVar);
    }

    @Override // x6.c
    public final boolean mjg() {
        return this.f39do;
    }

    protected final void nyv() {
        this.pty = true;
        com.bytedance.sdk.openadsdk.gjv.sk.hnj.hnj.hnj(this.aq, this.dse, this.as);
    }

    protected void oj() {
        if (this.dkl == null) {
            return;
        }
        if (jip()) {
            SurfaceTexture surfaceTexture = this.f13838sk;
            if (surfaceTexture == null || surfaceTexture == this.dkl.apu()) {
                return;
            }
            this.dkl.hnj(this.f13838sk);
            return;
        }
        SurfaceHolder surfaceHolder = this.gjv;
        if (surfaceHolder == null || surfaceHolder == this.dkl.xn()) {
            return;
        }
        this.dkl.hnj(this.gjv);
    }

    @Override // x6.c
    public final long ojm() {
        qor qorVar = this.dkl;
        if (qorVar == null) {
            return 0L;
        }
        return qorVar.uua();
    }

    @Override // x6.c
    public boolean orl() {
        return this.mjg;
    }

    public int pty() {
        return this.sq;
    }

    @Override // x6.c
    public abstract /* synthetic */ void qor();

    public void qor(long j10) {
        this.fvt = j10;
    }

    @Override // x6.c
    public abstract /* synthetic */ void sk();

    public void sk(boolean z10) {
        this.wu = z10;
    }

    @Override // x6.c
    public final int ta() {
        return p6.b.a(this.f13839ta, this.f13835gm);
    }

    public final boolean tgn() {
        qor qorVar = this.dkl;
        return qorVar == null || qorVar.hn();
    }

    public boolean tu() {
        return this.orp;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void ul() {
        com.bytedance.sdk.openadsdk.gjv.hnj.hn.hnj(com.bytedance.sdk.openadsdk.p000do.hnj.hnj(this.aq.tb(), true, this.aq), 5, this.aq.sp());
    }

    public long uua() {
        return this.nyv;
    }

    protected final void vf() {
        this.pty = true;
        fc.hnj hnjVar = new fc.hnj();
        hnjVar.hn(dkl());
        hnjVar.gjv(ojm() / ((long) pty()));
        hnjVar.qor(dse());
        com.bytedance.sdk.openadsdk.gjv.sk.hnj.hnj.hn(bug(), hnjVar);
    }

    public boolean wu() {
        return this.f13834fc;
    }

    protected void xn() {
        if (this.bug.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(this.bug);
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((Runnable) obj).run();
        }
        this.bug.clear();
    }

    public final boolean xyo() {
        qor qorVar = this.dkl;
        return qorVar != null && qorVar.dkl();
    }

    public final void gjv(boolean z10) {
        this.orp = z10;
    }

    @Override // x6.c
    public boolean hnj(com.bykv.vk.openvk.hnj.hnj.hnj.qor.c cVar) {
        return false;
    }

    protected void qor(boolean z10) {
        this.f13843xn = z10;
    }

    @Override // com.bytedance.sdk.openadsdk.core.mjg.hn.hnj, x6.b
    public final void sk(a aVar, View view) {
        hnj(aVar, view, false);
    }

    @Override // com.bytedance.sdk.openadsdk.core.mjg.hn.hnj
    public final void gjv(a aVar, View view) {
        if (this.f13843xn) {
            qor(false);
            sk skVar = this.dse;
            if (skVar != null) {
                skVar.hn(this.tu);
            }
            hnj(1);
            return;
        }
        hnj(true, 3);
    }

    protected void hn(Runnable runnable) {
        this.bug.add(runnable);
    }

    protected void hnj(Runnable runnable) {
        if (this.dse.wu() && this.orl) {
            runnable.run();
        } else {
            hn(runnable);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.mjg.hn.hnj
    public final void qor(a aVar, View view) {
        sk skVar = this.dse;
        if (skVar != null) {
            skVar.ojm();
        }
        hnj(true, 3);
    }

    public final void sk(long j10) {
        this.ojm = j10;
        this.f13839ta = Math.max(this.f13839ta, j10);
        sk skVar = this.dse;
        if (skVar != null) {
            skVar.hnj();
        }
        qor qorVar = this.dkl;
        if (qorVar != null) {
            qorVar.hnj(true, this.ojm, this.jip);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.mjg.hn.hnj
    public void hn(a aVar, SurfaceHolder surfaceHolder) {
        this.orl = false;
        this.gjv = null;
        qor qorVar = this.dkl;
        if (qorVar != null) {
            qorVar.hnj(false);
        }
    }

    private boolean qor(int i10) {
        return this.dse.hn(i10);
    }

    @Override // com.bytedance.sdk.openadsdk.core.mjg.hn.hnj
    public void hnj(a aVar, SurfaceHolder surfaceHolder) {
        this.orl = true;
        this.gjv = surfaceHolder;
        qor qorVar = this.dkl;
        if (qorVar == null) {
            return;
        }
        qorVar.hnj(surfaceHolder);
        xn();
    }

    @Override // com.bytedance.sdk.openadsdk.core.mjg.hn.hnj
    public void hn(a aVar, SurfaceTexture surfaceTexture) {
        this.orl = false;
        qor qorVar = this.dkl;
        if (qorVar != null) {
            qorVar.hnj(false);
        }
        this.f13838sk = null;
        xn();
    }

    @Override // com.bytedance.sdk.openadsdk.core.mjg.hn.hnj
    public void hnj(a aVar, SurfaceTexture surfaceTexture) {
        this.orl = true;
        this.f13838sk = surfaceTexture;
        qor qorVar = this.dkl;
        if (qorVar != null) {
            qorVar.hnj(surfaceTexture);
            this.dkl.hnj(this.orl);
        }
        xn();
    }

    public final void hn(boolean z10) {
        this.mjg = z10;
    }

    public void hn(com.bykv.vk.openvk.hnj.hnj.hnj.qor.c cVar) {
        hn hnVar = (hn) cVar;
        this.as = hnVar;
        this.jip = hnVar.dnm();
        cVar.gjv(String.valueOf(this.aq.atw()));
    }

    @Override // com.bytedance.sdk.openadsdk.core.mjg.hn.hnj
    public final void hn(a aVar, View view) {
        hn(aVar, view, false, false);
    }

    public void hnj(boolean z10) {
        this.f13834fc = z10;
        sk skVar = this.dse;
        if (skVar != null) {
            skVar.gjv(z10);
        }
    }

    public final void hn(a aVar, View view, boolean z10, boolean z11) {
        qor(!this.f13843xn);
        Context context = this.dnm;
        if (context != null && (context instanceof Activity)) {
            if (this.f13843xn) {
                hnj(z10 ? 8 : 0);
                sk skVar = this.dse;
                if (skVar != null) {
                    skVar.hnj(this.tu);
                    this.dse.qor(false);
                }
            } else {
                hnj(1);
                sk skVar2 = this.dse;
                if (skVar2 != null) {
                    skVar2.hn(this.tu);
                    this.dse.qor(false);
                }
            }
            WeakReference<c.b> weakReference = this.tgn;
            c.b bVar = weakReference != null ? weakReference.get() : null;
            if (bVar != null) {
                bVar.hnj(this.f13843xn);
            }
        }
    }

    @Override // x6.c
    public final void hnj(final boolean z10, String str) {
        this.jip = z10;
        qor qorVar = this.dkl;
        if (qorVar != null) {
            qorVar.hn(z10);
            com.bytedance.sdk.openadsdk.gjv.sk.hnj.hnj.hnj(this.dse, z10, str);
        }
        if (this.f13842vf != null) {
            if (q6.a.a()) {
                this.f13842vf.hnj(z10);
            } else {
                this.qor.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.mjg.hnj.hnj.3
                    @Override // java.lang.Runnable
                    public void run() {
                        hnj.this.f13842vf.hnj(z10);
                    }
                });
            }
        }
    }

    public final void hnj(c.b bVar) {
        this.tgn = new WeakReference<>(bVar);
    }

    public void hnj(a aVar, View view, boolean z10) {
    }

    public final void hnj(int i10) {
        Context context = this.dnm;
        if (context == null) {
            return;
        }
        boolean z10 = i10 == 0 || i10 == 8;
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            try {
                activity.setRequestedOrientation(i10);
            } catch (Throwable unused) {
            }
            if (!z10) {
                activity.getWindow().setFlags(UserVerificationMethods.USER_VERIFY_ALL, UserVerificationMethods.USER_VERIFY_ALL);
            } else {
                activity.getWindow().clearFlags(UserVerificationMethods.USER_VERIFY_ALL);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.mjg.hn.hnj
    public final void hn(a aVar, int i10) {
        sk skVar = this.dse;
        if (skVar != null) {
            skVar.dkl();
        }
    }

    protected final void hn(dse dseVar) {
        this.pty = true;
        fc.hnj hnjVar = new fc.hnj();
        hnjVar.hn(dkl());
        hnjVar.gjv(ojm() / ((long) pty()));
        hnjVar.qor(dse());
        hnjVar.gjv(aq());
        hnjVar.hnj(uua());
        hnjVar.qor(this.hqh);
        com.bytedance.sdk.openadsdk.gjv.sk.hnj.hnj.hn(this.dse, hnjVar, dseVar);
    }

    @Override // com.bytedance.sdk.openadsdk.core.mjg.hn.hnj
    public final void hnj(a aVar, View view, boolean z10, boolean z11) {
        if (this.f13834fc) {
            hn();
        }
        if (z10 && !this.f13834fc && !tgn()) {
            this.dse.hn(!xyo(), false);
            this.dse.hnj(z11, true, false);
        }
        qor qorVar = this.dkl;
        if (qorVar != null && qorVar.dkl()) {
            this.dse.dkl();
            this.dse.sk();
        } else {
            this.dse.dkl();
        }
    }

    public void hn(int i10) {
        this.sq = i10;
    }

    @Override // x6.c
    public final void hn() {
        qor qorVar = this.dkl;
        if (qorVar != null) {
            qorVar.dnm();
        }
        if (this.eum || !this.apu.get()) {
            return;
        }
        hqh();
    }

    @Override // com.bytedance.sdk.openadsdk.core.mjg.hn.hnj
    public final void hnj(a aVar, int i10, boolean z10) {
        if (this.dnm == null) {
            return;
        }
        long j10 = this.f13835gm;
        long j11 = (long) (((((long) i10) * j10) * 1.0f) / 100.0f);
        if (j10 > 0) {
            this.f13840ua = (int) j11;
        } else {
            this.f13840ua = 0L;
        }
        sk skVar = this.dse;
        if (skVar != null) {
            skVar.hnj(this.f13840ua);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.mjg.hn.hnj
    public final void hnj(a aVar, int i10) {
        if (this.dkl == null) {
            return;
        }
        hnj(this.f13840ua, qor(i10));
    }

    private void hnj(long j10, boolean z10) {
        if (this.dkl == null) {
            return;
        }
        if (z10) {
            ua();
        }
        this.dkl.hnj(j10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void hnj(dse dseVar) {
        boolean z10 = false;
        if (this.apu.compareAndSet(false, true)) {
            this.pty = true;
            dkl dklVar = this.f13842vf;
            if (dklVar != null) {
                dklVar.hnj(ojm(), m29do());
            }
            fc.hnj hnjVar = new fc.hnj();
            hnjVar.hnj(tu());
            hnjVar.gjv(ojm());
            qor qorVar = this.dkl;
            if (qorVar != null && qorVar.mjg()) {
                z10 = true;
            }
            hnjVar.hn(z10);
            com.bytedance.sdk.openadsdk.gjv.sk.hnj.hnj.hnj(oj.hnj(), this.dse, hnjVar, dseVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void hnj(com.bykv.vk.openvk.hnj.hnj.hnj.qor.b bVar) {
        this.pty = true;
        fc.hnj hnjVar = new fc.hnj();
        hnjVar.qor(dse());
        hnjVar.gjv(ojm() / ((long) pty()));
        hnjVar.hn(dkl());
        hnjVar.hnj(bVar);
        com.bytedance.sdk.openadsdk.gjv.sk.hnj.hnj.qor(bug(), hnjVar);
    }

    @Override // x6.c
    public final void hnj(c.InterfaceC0870c interfaceC0870c) {
        this.xyo = interfaceC0870c;
    }

    @Override // com.bytedance.sdk.openadsdk.core.mjg.hn.hnj
    public final void hnj(apu.hnj hnjVar, String str) {
        int i10 = AnonymousClass4.hnj[hnjVar.ordinal()];
        if (i10 == 1) {
            hn();
            return;
        }
        if (i10 == 2) {
            gjv();
        } else {
            if (i10 != 3) {
                return;
            }
            qor();
            this.uua = false;
            this.f13837oj = true;
        }
    }

    public void hnj(c.a aVar) {
    }

    @Override // x6.c
    public void hnj(long j10) {
        this.nyv = j10;
    }

    @Override // x6.c
    public boolean hnj(float f10) {
        qor qorVar = this.dkl;
        if (qorVar != null) {
            return qorVar.hnj(f10);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void hnj(long j10, long j11) {
        if (!this.jbd.get() && com.bytedance.sdk.openadsdk.dkl.hnj.hnj().qor() && (j10 * 1.0d) / j11 > 0.3d) {
            this.jbd.set(true);
            if (this.aq != null) {
                com.bytedance.sdk.openadsdk.dkl.hn.hnj().hnj(lkCBSIFlvmyGX.NycqUwBsKV, this.aq);
            }
        }
    }

    @Override // x6.c
    public void hnj(SurfaceTexture surfaceTexture) {
        this.hqh = true;
    }
}
