package com.bykv.vk.openvk.hnj.hnj.hn.qor;

import android.graphics.SurfaceTexture;
import android.media.PlaybackParams;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseIntArray;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.bytedance.sdk.component.aq.hnj.hnj;
import com.bytedance.sdk.component.utils.apu;
import com.bytedance.sdk.component.utils.eum;
import com.bytedance.sdk.component.utils.xyo;
import com.mbridge.msdk.MBridgeConstans;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class a implements com.bykv.vk.openvk.hnj.hnj.hn.qor.d.a, com.bykv.vk.openvk.hnj.hnj.hn.qor.d.b, com.bykv.vk.openvk.hnj.hnj.hn.qor.d.c, com.bykv.vk.openvk.hnj.hnj.hn.qor.d.InterfaceC0158d, com.bykv.vk.openvk.hnj.hnj.hn.qor.d.e, com.bykv.vk.openvk.hnj.hnj.hn.qor.d.f, com.bykv.vk.openvk.hnj.hnj.hn.qor.d.g, u6.b, xyo.hnj {
    private static final SparseIntArray hnj = new SparseIntArray();
    private boolean as;
    private boolean bug;
    private SurfaceHolder dkl;

    /* JADX INFO: renamed from: do, reason: not valid java name */
    private ArrayList<Runnable> f0do;

    /* JADX INFO: renamed from: ff, reason: collision with root package name */
    private boolean f11590ff;
    private xyo jip;
    private boolean orl;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private SurfaceTexture f11594sk;

    /* JADX INFO: renamed from: ua, reason: collision with root package name */
    private volatile boolean f11596ua;
    private volatile boolean xad;
    private boolean xyo;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private final boolean f11592hn = false;
    private final List<WeakReference<u6.b.a>> qor = new CopyOnWriteArrayList();
    private final o gjv = new o();
    private int dse = 0;
    private int aq = 3;
    private boolean ojm = false;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    private volatile com.bykv.vk.openvk.hnj.hnj.hn.qor.d f11595ta = null;
    private boolean dnm = false;
    private volatile int mjg = 201;

    /* JADX INFO: renamed from: fc, reason: collision with root package name */
    private long f11589fc = -1;
    private boolean uua = false;

    /* JADX INFO: renamed from: oj, reason: collision with root package name */
    private long f11593oj = 0;

    /* JADX INFO: renamed from: xn, reason: collision with root package name */
    private long f11599xn = Long.MIN_VALUE;
    private long apu = 0;
    private long eum = 0;
    private long wu = 0;
    private int tu = 0;
    private String tgn = MBridgeConstans.ENDCARD_URL_TYPE_PL;

    /* JADX INFO: renamed from: vf, reason: collision with root package name */
    private com.bykv.vk.openvk.hnj.hnj.hnj.qor.c f11598vf = null;
    private boolean hqh = false;
    private CountDownLatch nyv = new CountDownLatch(1);
    private volatile int pty = 200;

    /* JADX INFO: renamed from: gm, reason: collision with root package name */
    private AtomicBoolean f11591gm = new AtomicBoolean(false);

    /* JADX INFO: renamed from: ul, reason: collision with root package name */
    private Surface f11597ul = null;
    private long fvt = 0;
    private long orp = 0;
    private boolean sq = false;
    private final Runnable jbd = new f();

    /* JADX INFO: renamed from: com.bykv.vk.openvk.hnj.hnj.hn.qor.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class RunnableC0157a implements Runnable {
        RunnableC0157a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (a.this.f11595ta == null) {
                try {
                    a.this.f11595ta = new com.bykv.vk.openvk.hnj.hnj.hn.qor.b();
                } catch (Throwable th2) {
                    th2.getMessage();
                }
                if (a.this.f11595ta == null) {
                    return;
                }
                com.bykv.vk.openvk.hnj.hnj.hn.qor.d unused = a.this.f11595ta;
                a.this.tgn = MBridgeConstans.ENDCARD_URL_TYPE_PL;
                a.this.f11595ta.i(a.this);
                a.this.f11595ta.j(a.this);
                a.this.f11595ta.k(a.this);
                a.this.f11595ta.g(a.this);
                a.this.f11595ta.c(a.this);
                a.this.f11595ta.e(a.this);
                a.this.f11595ta.b(a.this);
                try {
                    a.this.f11595ta.f(false);
                } catch (Throwable unused2) {
                }
                a.this.dnm = false;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!a.this.dse() || a.this.f11595ta == null) {
                return;
            }
            try {
                a.this.f11595ta.dkl();
                for (WeakReference weakReference : a.this.qor) {
                    if (weakReference != null && weakReference.get() != null) {
                        ((u6.b.a) weakReference.get()).sk(a.this);
                    }
                }
                a.this.mjg = Sdk$SDKError.b.AD_ALREADY_FAILED_VALUE;
            } catch (Throwable th2) {
                th2.getMessage();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (a.this.jip != null) {
                a.this.jip.sendEmptyMessage(101);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (a.this.jip != null) {
                a.this.jip.sendEmptyMessage(101);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (a.this.jip != null) {
                a.this.jip.sendEmptyMessage(104);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (a.this.f11595ta == null) {
                return;
            }
            long jOj = a.this.oj();
            if (jOj > 0 && a.this.dkl() && a.this.f11599xn != Long.MIN_VALUE) {
                try {
                    if (a.this.f11599xn == jOj) {
                        if (!a.this.uua && a.this.apu >= 400) {
                            a.this.d(701, 800);
                            a.this.uua = true;
                        }
                        a.this.apu += (long) a.this.pty;
                    } else {
                        if (a.this.uua) {
                            a.this.f11593oj += a.this.apu;
                            a.this.d(702, 800);
                            long unused = a.this.f11593oj;
                            int unused2 = a.this.dse;
                        }
                        a.this.apu = 0L;
                        a.this.uua = false;
                    }
                } catch (Throwable th2) {
                    th2.getMessage();
                }
            }
            if (a.this.uua() > 0) {
                if (a.this.f11599xn != jOj) {
                    if (u6.c.a()) {
                        long unused3 = a.this.f11599xn;
                    }
                    a aVar = a.this;
                    aVar.j(jOj, aVar.uua());
                }
                a.this.f11599xn = jOj;
            }
            if (a.this.hn()) {
                a aVar2 = a.this;
                aVar2.j(aVar2.uua(), a.this.uua());
            } else if (a.this.jip != null) {
                a.this.jip.postDelayed(this, a.this.pty);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class g implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f11606a;

        g(long j10) {
            this.f11606a = j10;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (a.this.jip != null) {
                a.this.jip.obtainMessage(106, Long.valueOf(this.f11606a)).sendToTarget();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class h implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ SurfaceTexture f11608a;

        h(SurfaceTexture surfaceTexture) {
            this.f11608a = surfaceTexture;
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.w();
            if (a.this.jip != null) {
                a.this.jip.obtainMessage(111, this.f11608a).sendToTarget();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class i implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ SurfaceHolder f11610a;

        i(SurfaceHolder surfaceHolder) {
            this.f11610a = surfaceHolder;
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.w();
            if (a.this.jip != null) {
                a.this.jip.obtainMessage(110, this.f11610a).sendToTarget();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class j implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.bykv.vk.openvk.hnj.hnj.hnj.qor.c f11612a;

        j(com.bykv.vk.openvk.hnj.hnj.hnj.qor.c cVar) {
            this.f11612a = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.w();
            if (a.this.jip != null) {
                a.this.jip.obtainMessage(107, this.f11612a).sendToTarget();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class k implements Runnable {
        k() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (a.this.jip == null || a.this.jip.getLooper() == null) {
                return;
            }
            try {
                hnj.hnj().hnj(a.this.jip);
                a.this.jip = null;
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class l implements Runnable {
        l() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                a.this.f11595ta.aq();
                a.this.mjg = Sdk$SDKError.b.PLACEMENT_AD_TYPE_MISMATCH_VALUE;
                a.this.f11596ua = false;
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class m implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f11616a;

        m(boolean z10) {
            this.f11616a = z10;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (a.this.aq() || a.this.f11595ta == null) {
                return;
            }
            try {
                a.this.hqh = this.f11616a;
                a.this.f11595ta.gjv(this.f11616a);
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class n implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f11618a;

        n(boolean z10) {
            this.f11618a = z10;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (a.this.f11595ta != null) {
                a.this.f11595ta.hnj(this.f11618a);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class o implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f11620a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f11621b;

        o() {
        }

        public void a(long j10) {
            this.f11620a = j10;
        }

        public void b(boolean z10) {
            this.f11621b = z10;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (a.this.f11595ta != null) {
                try {
                    if (!this.f11621b) {
                        long jTa = a.this.f11595ta.ta();
                        a.this.f11589fc = Math.max(this.f11620a, jTa);
                    }
                    long unused = a.this.f11589fc;
                } catch (Throwable th2) {
                    th2.toString();
                }
            }
            if (a.this.jip != null) {
                a.this.jip.sendEmptyMessageDelayed(100, 0L);
            }
        }
    }

    public a() {
        n("SSMediaPlayerWrapper");
    }

    private void a() {
        g(new e());
    }

    private void b() {
        if (this.f11595ta == null) {
            return;
        }
        try {
            this.f11595ta.orl();
        } catch (Throwable unused) {
        }
        this.f11595ta.j(null);
        this.f11595ta.b(null);
        this.f11595ta.g(null);
        this.f11595ta.e(null);
        this.f11595ta.k(null);
        this.f11595ta.i(null);
        this.f11595ta.c(null);
        try {
            this.f11595ta.bug();
        } catch (Throwable unused2) {
        }
    }

    private void c() {
        this.f11593oj = 0L;
        this.dse = 0;
        this.apu = 0L;
        this.uua = false;
        this.f11599xn = Long.MIN_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i10, int i11) {
        if (i10 == 701) {
            this.fvt = SystemClock.elapsedRealtime();
            this.dse++;
            for (WeakReference<u6.b.a> weakReference : this.qor) {
                if (weakReference != null && weakReference.get() != null) {
                    weakReference.get().hnj(this, Integer.MAX_VALUE, 0, 0);
                }
            }
            return;
        }
        if (i10 == 702) {
            if (this.fvt > 0) {
                this.orp += SystemClock.elapsedRealtime() - this.fvt;
                this.fvt = 0L;
            }
            for (WeakReference<u6.b.a> weakReference2 : this.qor) {
                if (weakReference2 != null && weakReference2.get() != null) {
                    weakReference2.get().hnj((u6.b) this, Integer.MAX_VALUE);
                }
            }
            return;
        }
        if (this.sq && i10 == 3) {
            q();
            x();
            hn(this.hqh);
        } else if (i10 == 805) {
            this.f11590ff = true;
        }
    }

    private void e(long j10) {
        this.gjv.a(j10);
        if (this.xyo) {
            g(this.gjv);
        } else if (i(this.f11598vf)) {
            g(this.gjv);
        } else {
            m(this.gjv);
        }
    }

    private void f(com.bykv.vk.openvk.hnj.hnj.hnj.qor.c cVar, File file) {
        try {
            String strA = w6.c.a(file);
            if (cVar.uua().equals(strA)) {
                l(file);
                return;
            }
            JSONObject jSONObjectQor = cVar.qor();
            boolean zHn = cVar.hn();
            if (jSONObjectQor != null) {
                jSONObjectQor.put("file_hash", cVar.uua());
                jSONObjectQor.put("file_real_hash", strA);
                jSONObjectQor.put("is_change_play_type", zHn ? 1 : 0);
                jSONObjectQor.put("error_real_code", Sdk$SDKError.b.ASSET_FAILED_TO_DELETE_VALUE);
                jSONObjectQor.put("error_real_msg", "md5_not_match");
            }
            if (zHn) {
                boolean zDelete = file.delete();
                if (jSONObjectQor != null) {
                    jSONObjectQor.put("delete_cache_file", zDelete ? 1 : 0);
                }
                if (zDelete) {
                    s(cVar);
                    return;
                }
            }
            l(file);
        } catch (Throwable unused) {
        }
    }

    private void g(Runnable runnable) {
        if (runnable == null || aq()) {
            return;
        }
        if (this.orl) {
            m(runnable);
        } else {
            runnable.run();
        }
    }

    private void h(String str) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(str);
        this.f11595ta.h(fileInputStream.getFD());
        fileInputStream.close();
    }

    private boolean i(com.bykv.vk.openvk.hnj.hnj.hnj.qor.c cVar) {
        return cVar != null && cVar.dse();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j(long j10, long j11) {
        long j12;
        long j13;
        if (!this.xad) {
            x();
        }
        for (WeakReference<u6.b.a> weakReference : this.qor) {
            if (weakReference == null || weakReference.get() == null) {
                j12 = j10;
                j13 = j11;
            } else {
                j12 = j10;
                j13 = j11;
                weakReference.get().hnj(this, j12, j13);
            }
            j10 = j12;
            j11 = j13;
        }
    }

    private void k(com.bykv.vk.openvk.hnj.hnj.hnj.qor.c cVar, File file) {
        if (cVar.hnj()) {
            f(cVar, file);
        } else {
            l(file);
        }
    }

    private void l(File file) {
        file.getAbsolutePath();
        try {
            if (eum.hnj(u6.c.c())) {
                this.f11595ta.hnj(file.getAbsolutePath());
            } else {
                h(file.getAbsolutePath());
            }
        } catch (Throwable unused) {
        }
    }

    private void m(Runnable runnable) {
        try {
            if (this.f0do == null) {
                this.f0do = new ArrayList<>();
            }
            this.f0do.add(runnable);
        } catch (Throwable th2) {
            th2.getMessage();
        }
    }

    private void n(String str) {
        this.tu = 0;
        this.jip = hnj.hnj().hnj(this, "csj_".concat(String.valueOf(str)));
        this.sq = true;
        w();
    }

    private boolean o(int i10, int i11) {
        boolean z10 = i10 == -1010 || i10 == -1007 || i10 == -1004 || i10 == -110 || i10 == 100 || i10 == 200;
        if (i11 == 1 || i11 == 700 || i11 == 800) {
            return true;
        }
        return z10;
    }

    private void p() {
        if (this.bug) {
            return;
        }
        this.bug = true;
        ArrayList arrayList = new ArrayList(this.f0do);
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((Runnable) obj).run();
        }
        this.f0do.clear();
        this.bug = false;
    }

    private void q() {
        ArrayList<Runnable> arrayList = this.f0do;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        p();
    }

    private void r() {
        ArrayList<Runnable> arrayList = this.f0do;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        this.f0do.clear();
    }

    private void s(com.bykv.vk.openvk.hnj.hnj.hnj.qor.c cVar) {
        cVar.jip();
        this.f11595ta.hnj(cVar);
        cVar.jip();
    }

    private void t() {
        SparseIntArray sparseIntArray = hnj;
        sparseIntArray.put(this.tu, sparseIntArray.get(this.tu) + 1);
    }

    private void u() {
        xyo xyoVar = this.jip;
        if (xyoVar == null || xyoVar.getLooper() == null) {
            return;
        }
        try {
            this.jip.post(new k());
        } catch (Throwable unused) {
        }
    }

    private void v() {
        xyo xyoVar = this.jip;
        if (xyoVar != null) {
            xyoVar.post(new l());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w() {
        xyo xyoVar = this.jip;
        if (xyoVar != null) {
            xyoVar.post(new RunnableC0157a());
        }
    }

    private void x() {
        this.xad = true;
        this.ojm = true;
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.wu;
        for (WeakReference<u6.b.a> weakReference : this.qor) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().hnj(this, jElapsedRealtime);
            }
        }
    }

    public SurfaceTexture apu() {
        return this.f11594sk;
    }

    public void bug() {
        if (aq()) {
            return;
        }
        this.orl = true;
        r();
        xyo xyoVar = this.jip;
        if (xyoVar != null) {
            try {
                xyoVar.removeCallbacksAndMessages(null);
                if (this.f11595ta != null) {
                    this.jip.sendEmptyMessage(103);
                }
                u();
            } catch (Throwable unused) {
                u();
            }
        }
    }

    public long fc() {
        if (this.uua) {
            long j10 = this.apu;
            if (j10 > 0) {
                return this.f11593oj + j10;
            }
        }
        return this.f11593oj;
    }

    public int jip() {
        return this.dse;
    }

    public boolean mjg() {
        return this.f11590ff;
    }

    public long oj() {
        if (aq()) {
            return 0L;
        }
        if (this.mjg == 206 || this.mjg == 207) {
            try {
                return this.f11595ta.ta();
            } catch (Throwable unused) {
            }
        }
        return 0L;
    }

    public boolean orl() {
        return this.mjg == 205;
    }

    public long uua() {
        long j10 = this.eum;
        if (j10 != 0) {
            return j10;
        }
        if (this.mjg == 206 || this.mjg == 207) {
            try {
                this.eum = this.f11595ta.dnm();
            } catch (Throwable unused) {
            }
        }
        return this.eum;
    }

    public SurfaceHolder xn() {
        return this.dkl;
    }

    @Override // u6.b
    public boolean aq() {
        return this.orl;
    }

    @Override // u6.b
    public boolean dkl() {
        xyo xyoVar;
        return (this.mjg == 206 || ((xyoVar = this.jip) != null && xyoVar.hasMessages(100))) && !this.f11596ua;
    }

    public void dnm() {
        xyo xyoVar;
        if (aq() || (xyoVar = this.jip) == null) {
            return;
        }
        xyoVar.removeMessages(100);
        this.f11596ua = true;
        if (this.sq) {
            if (!this.ojm && !i(this.f11598vf)) {
                m(new d());
                return;
            }
            xyo xyoVar2 = this.jip;
            if (xyoVar2 != null) {
                xyoVar2.sendEmptyMessage(101);
                return;
            }
            return;
        }
        if (!this.as && !i(this.f11598vf)) {
            m(new c());
            return;
        }
        xyo xyoVar3 = this.jip;
        if (xyoVar3 != null) {
            xyoVar3.sendEmptyMessage(101);
        }
    }

    @Override // u6.b
    public boolean dse() {
        xyo xyoVar;
        return ((this.mjg != 207 && !this.f11596ua) || (xyoVar = this.jip) == null || xyoVar.hasMessages(100)) ? false : true;
    }

    public void ojm() {
        if (aq() || this.f11595ta == null) {
            return;
        }
        this.f11591gm.set(true);
        if (this.mjg != 206) {
            c();
            this.f11596ua = false;
            this.gjv.b(true);
            e(0L);
            xyo xyoVar = this.jip;
            if (xyoVar != null) {
                xyoVar.removeCallbacks(this.jbd);
                this.jip.postDelayed(this.jbd, this.pty);
            }
        }
        this.nyv.countDown();
    }

    @Override // u6.b
    public int sk() {
        if (this.f11595ta == null || aq()) {
            return 0;
        }
        return this.f11595ta.fc();
    }

    public void ta() {
        if (aq() || this.jip == null) {
            return;
        }
        this.f11591gm.set(true);
        this.jip.post(new b());
    }

    @Override // u6.b
    public int gjv() {
        if (this.f11595ta == null || aq()) {
            return 0;
        }
        return this.f11595ta.mjg();
    }

    @Override // u6.b
    public boolean hn() {
        return this.mjg == 209;
    }

    @Override // u6.b
    public boolean qor() {
        return orl() || dkl() || dse();
    }

    @Override // com.bykv.vk.openvk.hnj.hnj.hn.qor.d.c
    public boolean hn(com.bykv.vk.openvk.hnj.hnj.hn.qor.d dVar, int i10, int i11) {
        if (this.f11595ta != dVar) {
            return false;
        }
        if (i11 == -1004) {
            com.bykv.vk.openvk.hnj.hnj.hnj.qor.b bVar = new com.bykv.vk.openvk.hnj.hnj.hnj.qor.b(i10, i11);
            for (WeakReference<u6.b.a> weakReference : this.qor) {
                if (weakReference != null && weakReference.get() != null) {
                    weakReference.get().hnj(this, bVar);
                }
            }
        }
        d(i10, i11);
        return false;
    }

    @Override // com.bykv.vk.openvk.hnj.hnj.hn.qor.d.a
    public void qor(com.bykv.vk.openvk.hnj.hnj.hn.qor.d dVar) {
        for (WeakReference<u6.b.a> weakReference : this.qor) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().hnj((u6.b) this, true);
            }
        }
    }

    public void hnj(boolean z10) {
        if (aq()) {
            return;
        }
        this.xyo = z10;
        if (this.f11595ta != null) {
            this.f11595ta.hnj(z10);
            return;
        }
        xyo xyoVar = this.jip;
        if (xyoVar != null) {
            xyoVar.post(new n(z10));
        }
    }

    @Override // com.bykv.vk.openvk.hnj.hnj.hn.qor.d.g
    public void hn(com.bykv.vk.openvk.hnj.hnj.hn.qor.d dVar) {
        if (aq()) {
            return;
        }
        this.mjg = Sdk$SDKError.b.AD_IS_PLAYING_VALUE;
        try {
            com.bykv.vk.openvk.hnj.hnj.hnj.qor.c cVar = this.f11598vf;
            if (cVar != null) {
                float fFc = cVar.fc();
                if (fFc > 0.0f) {
                    u6.a aVar = new u6.a();
                    aVar.b(fFc);
                    this.f11595ta.a(aVar);
                }
            }
        } catch (Throwable unused) {
        }
        if (this.jip != null) {
            if (this.f11596ua) {
                v();
            } else {
                xyo xyoVar = this.jip;
                xyoVar.sendMessage(xyoVar.obtainMessage(100, -1, -1));
            }
        }
        hnj.delete(this.tu);
        boolean z10 = this.sq;
        boolean z11 = this.as;
        if (!z10 && !z11) {
            x();
            this.as = true;
        }
        for (WeakReference<u6.b.a> weakReference : this.qor) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().hn(this);
            }
        }
    }

    public void hnj(boolean z10, long j10, boolean z11) {
        if (aq()) {
            return;
        }
        w();
        this.hqh = z11;
        this.f11591gm.set(true);
        this.f11596ua = false;
        hn(z11);
        if (z10) {
            this.f11589fc = j10;
            a();
        } else {
            e(j10);
        }
        xyo xyoVar = this.jip;
        if (xyoVar != null) {
            xyoVar.removeCallbacks(this.jbd);
            this.jip.postDelayed(this.jbd, this.pty);
        }
        this.nyv.countDown();
    }

    public void hn(boolean z10) {
        xyo xyoVar;
        if (aq() || (xyoVar = this.jip) == null) {
            return;
        }
        xyoVar.post(new m(z10));
    }

    public void hnj(long j10) {
        if (aq()) {
            return;
        }
        if (this.mjg == 207 || this.mjg == 206 || this.mjg == 209) {
            g(new g(j10));
        }
    }

    public void hn(int i10) {
        this.aq = i10;
    }

    @Override // u6.b
    public boolean hnj() {
        return this.ojm;
    }

    public void hnj(SurfaceTexture surfaceTexture) {
        if (aq()) {
            return;
        }
        this.f11594sk = surfaceTexture;
        hnj(true);
        g(new h(surfaceTexture));
    }

    public void hnj(SurfaceHolder surfaceHolder) {
        if (aq()) {
            return;
        }
        this.dkl = surfaceHolder;
        hnj(true);
        g(new i(surfaceHolder));
    }

    public void hnj(com.bykv.vk.openvk.hnj.hnj.hnj.qor.c cVar) {
        if (aq()) {
            return;
        }
        this.f11598vf = cVar;
        if (cVar != null) {
            this.sq = this.sq && !cVar.dse();
        }
        g(new j(cVar));
    }

    @Override // com.bytedance.sdk.component.utils.xyo.hnj
    public void hnj(Message message) {
        int i10 = this.mjg;
        int i11 = message.what;
        if (this.f11595ta != null) {
            try {
                switch (message.what) {
                    case 100:
                        if (this.mjg == 205 || this.mjg == 207 || this.mjg == 209) {
                            this.f11595ta.dkl();
                            this.wu = SystemClock.elapsedRealtime();
                            this.mjg = Sdk$SDKError.b.AD_ALREADY_FAILED_VALUE;
                            if (this.f11589fc > 0) {
                                this.f11595ta.hnj(this.f11589fc, this.aq);
                                this.f11589fc = -1L;
                            }
                            if (this.f11598vf != null) {
                                hn(this.hqh);
                                return;
                            }
                            return;
                        }
                        break;
                    case 101:
                        if (this.uua) {
                            this.f11593oj += this.apu;
                        }
                        this.uua = false;
                        this.apu = 0L;
                        this.f11599xn = Long.MIN_VALUE;
                        if (this.mjg == 206 || this.mjg == 207 || this.mjg == 209) {
                            this.f11595ta.aq();
                            this.mjg = Sdk$SDKError.b.PLACEMENT_AD_TYPE_MISMATCH_VALUE;
                            this.f11596ua = false;
                            for (WeakReference<u6.b.a> weakReference : this.qor) {
                                if (weakReference != null && weakReference.get() != null) {
                                    weakReference.get().gjv(this);
                                }
                            }
                            return;
                        }
                        break;
                    case 102:
                        this.f11595ta.orl();
                        this.mjg = 201;
                        return;
                    case 103:
                        try {
                            b();
                            break;
                        } catch (Throwable unused) {
                        }
                        for (WeakReference<u6.b.a> weakReference2 : this.qor) {
                            if (weakReference2 != null && weakReference2.get() != null) {
                                weakReference2.get().qor(this);
                            }
                        }
                        this.mjg = Sdk$SDKError.b.AD_IS_LOADING_VALUE;
                        return;
                    case 104:
                        if (this.mjg == 202 || this.mjg == 208) {
                            this.f11595ta.ojm();
                            return;
                        }
                        break;
                    case 105:
                        if (this.mjg == 205 || this.mjg == 206 || this.mjg == 208 || this.mjg == 207 || this.mjg == 209) {
                            this.f11595ta.dse();
                            this.mjg = Sdk$SDKError.b.INVALID_BID_PAYLOAD_VALUE;
                            return;
                        }
                        break;
                    case 106:
                        if (this.mjg == 206 || this.mjg == 207 || this.mjg == 209) {
                            this.f11595ta.hnj(((Long) message.obj).longValue(), this.aq);
                            return;
                        }
                        break;
                    case 107:
                        c();
                        if (this.mjg == 201 || this.mjg == 203) {
                            com.bykv.vk.openvk.hnj.hnj.hnj.qor.c cVar = (com.bykv.vk.openvk.hnj.hnj.hnj.qor.c) message.obj;
                            if (TextUtils.isEmpty(cVar.sk())) {
                                cVar.hnj(u6.c.b());
                            }
                            if (cVar.tu()) {
                                this.f11595ta.hnj(cVar.jip());
                                cVar.jip();
                            } else {
                                File file = new File(cVar.sk(), cVar.uua());
                                if (file.exists()) {
                                    k(cVar, file);
                                } else {
                                    s(cVar);
                                }
                            }
                            this.mjg = 202;
                            return;
                        }
                        break;
                    case 108:
                    case 109:
                    default:
                        return;
                    case 110:
                        this.f11595ta.hnj((SurfaceHolder) message.obj);
                        this.f11595ta.hn(true);
                        this.nyv.await(1L, TimeUnit.SECONDS);
                        q();
                        return;
                    case 111:
                        this.f11597ul = new Surface((SurfaceTexture) message.obj);
                        this.f11595ta.d(this.f11597ul);
                        this.f11595ta.hn(true);
                        this.nyv.await(1L, TimeUnit.SECONDS);
                        q();
                        return;
                }
                this.mjg = 200;
                if (this.dnm) {
                    return;
                }
                com.bykv.vk.openvk.hnj.hnj.hnj.qor.b bVar = new com.bykv.vk.openvk.hnj.hnj.hnj.qor.b(Sdk$SDKError.b.AD_WIN_NOTIFICATION_ERROR_VALUE, i11);
                bVar.c(i10 + "," + i11);
                for (WeakReference<u6.b.a> weakReference3 : this.qor) {
                    if (weakReference3 != null && weakReference3.get() != null) {
                        weakReference3.get().hnj(this, bVar);
                    }
                }
                this.dnm = true;
            } catch (Throwable unused2) {
            }
        }
    }

    @Override // com.bykv.vk.openvk.hnj.hnj.hn.qor.d.e
    public void hnj(com.bykv.vk.openvk.hnj.hnj.hn.qor.d dVar, int i10) {
        if (this.f11595ta != dVar) {
            return;
        }
        for (WeakReference<u6.b.a> weakReference : this.qor) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().hn(this, i10);
            }
        }
    }

    @Override // com.bykv.vk.openvk.hnj.hnj.hn.qor.d.InterfaceC0158d
    public void hnj(com.bykv.vk.openvk.hnj.hnj.hn.qor.d dVar) {
        this.mjg = Sdk$SDKError.b.INVALID_JSON_BID_PAYLOAD_VALUE;
        hnj.delete(this.tu);
        xyo xyoVar = this.jip;
        if (xyoVar != null) {
            xyoVar.removeCallbacks(this.jbd);
        }
        for (WeakReference<u6.b.a> weakReference : this.qor) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().hnj(this);
            }
        }
    }

    @Override // com.bykv.vk.openvk.hnj.hnj.hn.qor.d.f
    public boolean hnj(com.bykv.vk.openvk.hnj.hnj.hn.qor.d dVar, int i10, int i11) {
        t();
        this.mjg = 200;
        xyo xyoVar = this.jip;
        if (xyoVar != null) {
            xyoVar.removeCallbacks(this.jbd);
        }
        if (o(i10, i11)) {
            u();
        }
        if (!this.f11591gm.get()) {
            return true;
        }
        this.f11591gm.set(false);
        com.bykv.vk.openvk.hnj.hnj.hnj.qor.b bVar = new com.bykv.vk.openvk.hnj.hnj.hnj.qor.b(i10, i11);
        for (WeakReference<u6.b.a> weakReference : this.qor) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().hnj(this, bVar);
            }
        }
        return true;
    }

    @Override // com.bykv.vk.openvk.hnj.hnj.hn.qor.d.b
    public void hnj(com.bykv.vk.openvk.hnj.hnj.hn.qor.d dVar, int i10, int i11, int i12, int i13) {
        for (WeakReference<u6.b.a> weakReference : this.qor) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().hnj((u6.b) this, i10, i11);
            }
        }
    }

    public void hnj(u6.b.a aVar) {
        if (aVar == null) {
            return;
        }
        for (WeakReference<u6.b.a> weakReference : this.qor) {
            if (weakReference != null && weakReference.get() == aVar) {
                return;
            }
        }
        this.qor.add(new WeakReference<>(aVar));
    }

    public void hnj(int i10) {
        if (aq()) {
            return;
        }
        this.pty = i10;
    }

    public boolean hnj(float f10) {
        PlaybackParams playbackParamsSk;
        if (f10 <= 0.0f) {
            return false;
        }
        try {
            if (this.f11595ta == null || !qor()) {
                return false;
            }
            try {
                playbackParamsSk = this.f11595ta.sk();
            } catch (Throwable th2) {
                apu.qor("CSJ_VIDEO_MEDIA", "getPlaybackParams error:" + th2.getMessage());
                playbackParamsSk = null;
            }
            if ((playbackParamsSk != null ? playbackParamsSk.getSpeed() : 0.0f) == f10) {
                return true;
            }
            u6.a aVar = new u6.a();
            aVar.b(f10);
            this.f11595ta.a(aVar);
            return true;
        } catch (Throwable th3) {
            apu.hnj("CSJ_VIDEO_MEDIA", "setPlaySpeedRatio error: ", th3);
            return false;
        }
    }
}
