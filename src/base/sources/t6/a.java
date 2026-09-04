package t6;

import com.bytedance.sdk.component.hn.hnj.bug;
import com.bytedance.sdk.component.hn.hnj.dnm;
import com.bytedance.sdk.component.hn.hnj.fc;
import com.bytedance.sdk.component.hn.hnj.hn;
import com.bytedance.sdk.component.hn.hnj.mjg;
import com.bytedance.sdk.component.hn.hnj.qor;
import com.bytedance.sdk.component.utils.apu;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.net.SocketTimeoutException;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f53135a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private File f53138d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private File f53139e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f53140f;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private RandomAccessFile f53145k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final com.bykv.vk.openvk.hnj.hnj.hnj.qor.c f53146l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private volatile long f53147m;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile long f53136b = -2147483648L;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f53137c = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private volatile long f53141g = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile int f53142h = -100;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private volatile boolean f53143i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private volatile boolean f53144j = false;

    /* JADX INFO: renamed from: t6.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class C0810a implements qor {
        C0810a() {
        }

        @Override // com.bytedance.sdk.component.hn.hnj.qor
        public void hnj(hn hnVar, IOException iOException) {
            a.this.k(30000, iOException.getMessage());
        }

        /* JADX WARN: Code duplicated, block: B:85:0x01cc A[Catch: all -> 0x01f3, TryCatch #0 {all -> 0x01f3, blocks: (B:83:0x01c7, B:85:0x01cc, B:86:0x01cf, B:88:0x01da, B:90:0x01ee), top: B:96:0x01c7 }] */
        @Override // com.bytedance.sdk.component.hn.hnj.qor
        public void hnj(hn hnVar, mjg mjgVar) {
            fc fcVarDkl;
            if (mjgVar == null) {
                a.this.k(Sdk$SDKError.b.AD_INTERNAL_INTEGRATION_ERROR_VALUE, "response is empty");
                return;
            }
            InputStream inputStreamQor = null;
            try {
                try {
                    a.this.f53144j = mjgVar.gjv();
                    if (a.this.f53144j) {
                        fcVarDkl = mjgVar.dkl();
                        try {
                            if (a.this.f53144j && fcVarDkl != null) {
                                a.this.f53136b = fcVarDkl.hnj() + a.this.f53140f;
                                inputStreamQor = fcVarDkl.qor();
                            }
                            if (inputStreamQor == null) {
                                a.this.k(Sdk$SDKError.b.CONFIG_NOT_FOUND_ERROR_VALUE, "input_stream is empty");
                                if (inputStreamQor != null) {
                                    inputStreamQor.close();
                                }
                                if (fcVarDkl != null) {
                                    fcVarDkl.close();
                                }
                                mjgVar.close();
                                if (!a.this.f53144j || a.this.f53138d.length() != a.this.f53136b) {
                                    return;
                                }
                            } else {
                                int iB = o6.a.b();
                                byte[] bArr = new byte[iB];
                                long j10 = a.this.f53140f;
                                long unused = a.this.f53136b;
                                long unused2 = a.this.f53140f;
                                a.this.f53146l.jip();
                                long j11 = 0;
                                long j12 = 0;
                                int i10 = 0;
                                while (true) {
                                    int i11 = inputStreamQor.read(bArr, i10, iB - i10);
                                    if (i11 == -1) {
                                        break;
                                    }
                                    i10 += i11;
                                    j12 += (long) i11;
                                    boolean z10 = j12 % ((long) iB) == j11 || j12 == a.this.f53136b - a.this.f53140f;
                                    long unused3 = a.this.f53136b;
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append(j12);
                                    sb2.append(", waitingAtPost=");
                                    long unused4 = a.this.f53147m;
                                    if (z10) {
                                        synchronized (a.this.f53137c) {
                                            try {
                                                p6.a.c(a.this.f53145k, bArr, Long.valueOf(j10).intValue(), i10, a.this.f53146l.uua());
                                                if (a.this.f53135a && a.this.f53147m > -1 && a.this.f53140f + j12 >= a.this.f53147m) {
                                                    a.this.f53137c.notify();
                                                }
                                            } catch (Throwable th2) {
                                                throw th2;
                                            }
                                        }
                                        j10 += (long) i10;
                                        i10 = 0;
                                    }
                                    j11 = 0;
                                }
                                long unused5 = a.this.f53140f;
                                long unused6 = a.this.f53136b;
                                long unused7 = a.this.f53136b;
                                long unused8 = a.this.f53140f;
                            }
                            a.this.d();
                        } catch (Throwable th3) {
                            th = th3;
                            try {
                                a.this.k(Sdk$SDKError.b.AD_PUBLISHER_MISMATCH_VALUE, th.getMessage());
                                if (inputStreamQor != null) {
                                    inputStreamQor.close();
                                }
                                if (fcVarDkl != null) {
                                    fcVarDkl.close();
                                }
                                mjgVar.close();
                                if (a.this.f53144j && a.this.f53138d.length() == a.this.f53136b) {
                                    a.this.d();
                                    return;
                                }
                                return;
                            } catch (Throwable th4) {
                                if (inputStreamQor != null) {
                                    try {
                                        inputStreamQor.close();
                                        if (fcVarDkl != null) {
                                            fcVarDkl.close();
                                        }
                                        mjgVar.close();
                                        if (a.this.f53144j && a.this.f53138d.length() == a.this.f53136b) {
                                            a.this.d();
                                        }
                                    } catch (Throwable unused9) {
                                        throw th4;
                                    }
                                } else {
                                    if (fcVarDkl != null) {
                                        fcVarDkl.close();
                                    }
                                    mjgVar.close();
                                    if (a.this.f53144j) {
                                        a.this.d();
                                    }
                                }
                                throw th4;
                            }
                        }
                    }
                    a.this.k(mjgVar.qor(), mjgVar.sk());
                    fcVarDkl = null;
                    if (inputStreamQor != null) {
                        inputStreamQor.close();
                    }
                    if (fcVarDkl != null) {
                        fcVarDkl.close();
                    }
                    mjgVar.close();
                    if (!a.this.f53144j || a.this.f53138d.length() != a.this.f53136b) {
                        return;
                    }
                    a.this.d();
                } catch (Throwable unused10) {
                }
            } catch (Throwable th5) {
                th = th5;
                fcVarDkl = null;
            }
        }
    }

    public a(com.bykv.vk.openvk.hnj.hnj.hnj.qor.c cVar) {
        this.f53140f = 0L;
        this.f53145k = null;
        this.f53146l = cVar;
        try {
            String strSk = cVar.sk();
            String strUua = cVar.uua();
            this.f53138d = p6.a.a(strSk, strUua);
            this.f53139e = p6.a.d(strSk, strUua);
            if (g()) {
                this.f53145k = new RandomAccessFile(this.f53139e, CampaignEx.JSON_KEY_AD_R);
            } else {
                this.f53145k = new RandomAccessFile(this.f53138d, "rw");
            }
            if (!g()) {
                this.f53140f = this.f53138d.length();
                j();
            }
            this.f53135a = o6.a.a() == 2;
        } catch (Throwable unused) {
            cVar.jip();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        synchronized (this.f53137c) {
            if (g()) {
                this.f53146l.jip();
                this.f53146l.uua();
                return;
            }
            try {
                if (!this.f53138d.renameTo(this.f53139e)) {
                    throw new IOException("Error renaming file " + this.f53138d + " to " + this.f53139e + " for completion!");
                }
                RandomAccessFile randomAccessFile = this.f53145k;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
                this.f53145k = new RandomAccessFile(this.f53139e, "rw");
                this.f53146l.uua();
                this.f53146l.jip();
            } catch (Throwable th2) {
                th2.getMessage();
            }
        }
    }

    private boolean g() {
        return this.f53139e.exists();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k(int i10, String str) {
        JSONObject jSONObjectQor;
        this.f53144j = false;
        this.f53142h = i10;
        this.f53136b = this.f53141g;
        apu.hn("CSJ_MediaDLPlay", "handleFailResponse: ", Integer.valueOf(i10), " ", str);
        com.bykv.vk.openvk.hnj.hnj.hnj.qor.c cVar = this.f53146l;
        if (cVar == null || !cVar.hnj() || (jSONObjectQor = this.f53146l.qor()) == null) {
            return;
        }
        try {
            jSONObjectQor.put("error_real_code", i10);
            jSONObjectQor.put("error_real_msg", str);
        } catch (Throwable th2) {
            apu.hnj("CSJ_MediaDLPlay", "handleFailResponse: ", th2);
        }
    }

    private long q() {
        return g() ? this.f53139e.length() : this.f53138d.length();
    }

    @Override // t6.c
    public int a(long j10, byte[] bArr, int i10, int i11) throws IOException {
        try {
            if (j10 == this.f53136b) {
                return -1;
            }
            int i12 = 0;
            int i13 = 0;
            while (!this.f53143i) {
                synchronized (this.f53137c) {
                    try {
                        if (j10 < q()) {
                            this.f53145k.seek(j10);
                            i13 = this.f53145k.read(bArr, i10, i11);
                        } else {
                            i12 += 33;
                            this.f53147m = j10;
                            this.f53137c.wait(33L);
                            this.f53147m = -1L;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (i13 > 0) {
                    return i13;
                }
                com.bykv.vk.openvk.hnj.hnj.hnj.qor.c cVar = this.f53146l;
                if (cVar != null && cVar.hnj() && this.f53142h != -100 && (!this.f53144j || this.f53136b == this.f53141g)) {
                    throw new IOException();
                }
                if (i12 >= 20000) {
                    throw new SocketTimeoutException();
                }
            }
            return -1;
        } catch (Throwable th3) {
            if (th3 instanceof IOException) {
                throw th3;
            }
            throw new IOException();
        }
    }

    @Override // t6.c
    public void hn() {
        try {
            if (!this.f53143i) {
                this.f53145k.close();
            }
            File file = this.f53138d;
            if (file != null) {
                file.setLastModified(System.currentTimeMillis());
            }
            File file2 = this.f53139e;
            if (file2 != null) {
                file2.setLastModified(System.currentTimeMillis());
            }
        } catch (Throwable unused) {
        }
        this.f53143i = true;
    }

    public void j() {
        dnm.hnj hnjVarHn = u6.c.g() != null ? u6.c.g().hn() : new dnm.hnj("v_cache");
        long jXn = this.f53146l.xn();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        hnjVarHn.hnj(jXn, timeUnit).hn(this.f53146l.apu(), timeUnit).qor(this.f53146l.eum(), timeUnit);
        dnm dnmVarHnj = hnjVarHn.hnj();
        this.f53146l.uua();
        dnmVarHnj.hnj(new bug.hnj().hnj("RANGE", "bytes=" + this.f53140f + "-").hn(this.f53146l.jip()).hnj().hnj("videoLoadWhenPlaying").hnj(9).hn()).hnj(new C0810a());
    }

    @Override // t6.c
    public long qor() {
        if (g()) {
            this.f53136b = this.f53139e.length();
        } else {
            synchronized (this.f53137c) {
                int i10 = 0;
                while (this.f53136b == -2147483648L && !this.f53143i) {
                    try {
                        i10 += 15;
                        try {
                            this.f53137c.wait(5L);
                            if (i10 > 20000) {
                                return -1L;
                            }
                        } catch (InterruptedException unused) {
                            throw new IOException("total length InterruptException");
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }
        return this.f53136b;
    }
}
