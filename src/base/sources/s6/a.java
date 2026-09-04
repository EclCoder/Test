package s6;

import android.content.Context;
import com.bytedance.sdk.component.hn.hnj.bug;
import com.bytedance.sdk.component.hn.hnj.dnm;
import com.bytedance.sdk.component.hn.hnj.fc;
import com.bytedance.sdk.component.hn.hnj.hn;
import com.bytedance.sdk.component.hn.hnj.mjg;
import com.bytedance.sdk.component.hn.hnj.qor;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f51489a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.bykv.vk.openvk.hnj.hnj.hnj.qor.c f51490b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private File f51492d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private File f51493e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile boolean f51491c = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List f51494f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private volatile boolean f51495g = false;

    public a(Context context, com.bykv.vk.openvk.hnj.hnj.hnj.qor.c cVar) {
        this.f51492d = null;
        this.f51493e = null;
        this.f51489a = context;
        this.f51490b = cVar;
        this.f51492d = p6.a.a(cVar.sk(), cVar.uua());
        this.f51493e = p6.a.d(cVar.sk(), cVar.uua());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        try {
            this.f51493e.delete();
            this.f51492d.delete();
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(com.bykv.vk.openvk.hnj.hnj.hnj.qor.c cVar, int i10) {
        synchronized (a7.b.a.class) {
            try {
                for (a7.b.a aVar : this.f51494f) {
                    if (aVar != null) {
                        aVar.hn(cVar, i10);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private boolean f() {
        if (this.f51493e.exists()) {
            return true;
        }
        if (!this.f51490b.orl()) {
            if (this.f51492d.length() >= this.f51490b.dkl()) {
                return true;
            }
            if (this.f51490b.gjv() > 0 && this.f51492d.length() >= this.f51490b.gjv()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j(com.bykv.vk.openvk.hnj.hnj.hnj.qor.c cVar, int i10) {
        synchronized (a7.b.a.class) {
            try {
                for (a7.b.a aVar : this.f51494f) {
                    if (aVar != null) {
                        aVar.hnj(cVar, i10);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k(com.bykv.vk.openvk.hnj.hnj.hnj.qor.c cVar, int i10, String str) {
        synchronized (a7.b.a.class) {
            try {
                for (a7.b.a aVar : this.f51494f) {
                    if (aVar != null) {
                        aVar.hnj(cVar, i10, str);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception unused) {
            }
        }
    }

    private void q() {
        dnm.hnj hnjVarHn = u6.c.g() != null ? u6.c.g().hn() : new dnm.hnj("v_preload");
        long jXn = this.f51490b.xn();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        hnjVarHn.hnj(jXn, timeUnit).hn(this.f51490b.apu(), timeUnit).qor(this.f51490b.eum(), timeUnit);
        dnm dnmVarHnj = hnjVarHn.hnj();
        bug.hnj hnjVar = new bug.hnj();
        long length = this.f51492d.length();
        int iDkl = this.f51490b.dkl();
        boolean zOrl = this.f51490b.orl();
        int iGjv = this.f51490b.gjv();
        if (iGjv > 0) {
            if (iGjv >= this.f51490b.bug()) {
                zOrl = true;
            } else {
                iDkl = iGjv;
            }
        }
        hnjVar.hnj("videoPreload").hnj(6);
        if (zOrl) {
            hnjVar.hnj("RANGE", "bytes=" + length + "-").hn(this.f51490b.jip()).hnj().hn();
        } else {
            hnjVar.hnj("RANGE", "bytes=" + length + "-" + iDkl).hn(this.f51490b.jip()).hnj().hn();
        }
        dnmVarHnj.hnj(hnjVar.hn()).hnj(new C0797a(length));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s() {
        try {
            if (this.f51492d.renameTo(this.f51493e)) {
                return;
            }
            throw new IOException("Error renaming file " + this.f51492d + " to " + this.f51493e + " for completion!");
        } catch (Throwable th2) {
            th2.getMessage();
        }
    }

    public com.bykv.vk.openvk.hnj.hnj.hnj.qor.c g() {
        return this.f51490b;
    }

    public void i(a7.b.a aVar) {
        if (this.f51495g) {
            synchronized (a7.b.a.class) {
                this.f51494f.add(aVar);
            }
            return;
        }
        this.f51494f.add(aVar);
        if (f()) {
            this.f51490b.aq(1);
            j(this.f51490b, 200);
            c.b(this.f51490b);
        } else {
            this.f51495g = true;
            this.f51490b.aq(0);
            q();
        }
    }

    public void p(boolean z10) {
        this.f51491c = z10;
    }

    /* JADX INFO: renamed from: s6.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class C0797a implements qor {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f51496a;

        C0797a(long j10) {
            this.f51496a = j10;
        }

        @Override // com.bytedance.sdk.component.hn.hnj.qor
        public void hnj(hn hnVar, IOException iOException) {
            a aVar = a.this;
            aVar.k(aVar.f51490b, Sdk$SDKError.b.NATIVE_VIDEO_PLAYBACK_ERROR_VALUE, iOException.getMessage());
            c.b(a.this.f51490b);
        }

        @Override // com.bytedance.sdk.component.hn.hnj.qor
        public void hnj(hn hnVar, mjg mjgVar) {
            InputStream inputStreamQor;
            RandomAccessFile randomAccessFile;
            fc fcVarDkl;
            long jHnj;
            long j10 = this.f51496a;
            int iQor = Sdk$SDKError.b.NATIVE_VIDEO_PLAYBACK_ERROR_VALUE;
            fc fcVar = null;
            fcVar = null;
            randomAccessFile = null;
            randomAccessFile = null;
            RandomAccessFile randomAccessFile2 = null;
            try {
                if (mjgVar != null) {
                    boolean zGjv = mjgVar.gjv();
                    if (!zGjv) {
                        a aVar = a.this;
                        aVar.k(aVar.f51490b, mjgVar.qor(), mjgVar.sk());
                        a.this.l(null);
                        a.this.l(null);
                        a.this.l(fcVar);
                    }
                    fcVarDkl = mjgVar.dkl();
                    try {
                        fcVarDkl = mjgVar.dkl();
                        if (!zGjv || fcVarDkl == null) {
                            inputStreamQor = null;
                            jHnj = 0;
                        } else {
                            jHnj = this.f51496a + fcVarDkl.hnj();
                            inputStreamQor = fcVarDkl.qor();
                        }
                        try {
                            if (inputStreamQor == null) {
                                a aVar2 = a.this;
                                aVar2.k(aVar2.f51490b, mjgVar.qor(), mjgVar.sk());
                            } else {
                                randomAccessFile = new RandomAccessFile(a.this.f51492d, "rw");
                                try {
                                    int iB = o6.a.b();
                                    byte[] bArr = new byte[iB];
                                    int i10 = 0;
                                    long j11 = 0;
                                    while (true) {
                                        int i11 = inputStreamQor.read(bArr, i10, iB - i10);
                                        if (i11 != -1) {
                                            if (a.this.f51491c) {
                                                a aVar3 = a.this;
                                                aVar3.d(aVar3.f51490b, mjgVar.qor());
                                                a.this.l(randomAccessFile);
                                            } else {
                                                i10 += i11;
                                                j11 += (long) i11;
                                                if (j11 % ((long) iB) == 0 || j11 == jHnj - this.f51496a) {
                                                    p6.a.c(randomAccessFile, bArr, Long.valueOf(j10).intValue(), i10, a.this.f51490b.uua());
                                                    j10 += (long) i10;
                                                    i10 = 0;
                                                }
                                            }
                                        } else {
                                            if (a.this.f51490b.orl() && jHnj == a.this.f51492d.length()) {
                                                a.this.s();
                                            }
                                            a aVar4 = a.this;
                                            aVar4.j(aVar4.f51490b, mjgVar.qor());
                                            randomAccessFile2 = randomAccessFile;
                                        }
                                        a.this.l(inputStreamQor);
                                        a.this.l(fcVarDkl);
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    fcVar = fcVarDkl;
                                    try {
                                        a.this.a();
                                        a aVar5 = a.this;
                                        com.bykv.vk.openvk.hnj.hnj.hnj.qor.c cVar = aVar5.f51490b;
                                        if (mjgVar != null) {
                                            iQor = mjgVar.qor();
                                        }
                                        aVar5.k(cVar, iQor, th.getMessage());
                                        a.this.l(randomAccessFile);
                                        a.this.l(inputStreamQor);
                                        a.this.l(fcVar);
                                    } finally {
                                        a.this.l(randomAccessFile);
                                        a.this.l(inputStreamQor);
                                        a.this.l(fcVar);
                                        a.this.l(mjgVar);
                                        a.this.f51490b.jip();
                                        a.this.f51490b.dkl();
                                        c.b(a.this.f51490b);
                                    }
                                }
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            randomAccessFile = randomAccessFile2;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        inputStreamQor = null;
                        randomAccessFile = null;
                    }
                } else {
                    a aVar6 = a.this;
                    aVar6.k(aVar6.f51490b, Sdk$SDKError.b.NATIVE_VIDEO_PLAYBACK_ERROR_VALUE, "Network link failed.");
                    fcVarDkl = null;
                    inputStreamQor = null;
                }
                a.this.l(randomAccessFile2);
                a.this.l(inputStreamQor);
                a.this.l(fcVarDkl);
            } catch (Throwable th5) {
                th = th5;
                inputStreamQor = null;
                randomAccessFile = null;
            }
        }
    }
}
