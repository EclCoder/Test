package com.mbridge.msdk.click;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.mbridge.msdk.click.entity.JumpLoaderResult;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.u0;
import java.net.URI;
import java.util.concurrent.Semaphore;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class l extends com.mbridge.msdk.foundation.same.task.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f28402b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f28403c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f28404d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f28405e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final CampaignEx f28406f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f28407g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f28408h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f28409i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f28410j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private com.mbridge.msdk.click.entity.a f28411k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private JumpLoaderResult f28412l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private g f28413m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private k f28414n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Semaphore f28401a = new Semaphore(0);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final o.f f28415o = new a();

    public l(com.mbridge.msdk.click.entity.b bVar) {
        this.f28402b = bVar.c();
        this.f28403c = bVar.e();
        this.f28404d = bVar.b();
        this.f28405e = bVar.d();
        this.f28406f = bVar.a();
        this.f28407g = bVar.g();
        this.f28408h = bVar.i();
        this.f28409i = bVar.f();
        this.f28410j = bVar.h();
    }

    @Override // com.mbridge.msdk.foundation.same.task.a
    public void runTask() {
        JumpLoaderResult jumpLoaderResult;
        g gVar = this.f28413m;
        if (gVar != null) {
            gVar.b(null);
        }
        JumpLoaderResult jumpLoaderResult2 = new JumpLoaderResult();
        this.f28412l = jumpLoaderResult2;
        jumpLoaderResult2.setUrl(this.f28403c);
        JumpLoaderResult jumpLoaderResultC = c(this.f28403c);
        this.f28412l = jumpLoaderResultC;
        if (jumpLoaderResultC != null && !TextUtils.isEmpty(jumpLoaderResultC.getExceptionMsg())) {
            this.f28412l.setSuccess(true);
        }
        if (this.mState != com.mbridge.msdk.foundation.same.task.a.b.RUNNING) {
            k kVar = this.f28414n;
            if (kVar != null) {
                kVar.a(this.f28412l);
                return;
            }
            return;
        }
        JumpLoaderResult jumpLoaderResult3 = this.f28412l;
        if (jumpLoaderResult3 != null && !jumpLoaderResult3.isSuccess()) {
            k kVar2 = this.f28414n;
            if (kVar2 != null) {
                kVar2.a(this.f28412l);
                return;
            }
            return;
        }
        com.mbridge.msdk.click.entity.a aVar = this.f28411k;
        if (aVar != null && (jumpLoaderResult = this.f28412l) != null) {
            jumpLoaderResult.setStatusCode(aVar.f28378f);
        }
        m.a(this.f28406f, this.f28412l, this.f28411k, this.f28404d, this.f28405e, this.f28402b, this.f28415o, this.f28414n, this.f28401a);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements o.f {
        a() {
        }

        @Override // com.mbridge.msdk.click.o.f
        public boolean a(String str) {
            boolean zB = l.this.b(str);
            if (zB) {
                a();
            }
            return zB;
        }

        @Override // com.mbridge.msdk.click.o.f
        public boolean b(String str) {
            return false;
        }

        @Override // com.mbridge.msdk.click.o.f
        public boolean c(String str) {
            boolean zB = l.this.b(str);
            if (zB) {
                a();
            }
            return zB;
        }

        @Override // com.mbridge.msdk.click.o.f
        public void a(String str, boolean z10, String str2) {
            l.this.b(str);
            l.this.f28412l.setContent(str2);
            a();
        }

        private void a() {
            synchronized (this) {
                try {
                    l.this.f28412l.setSuccess(true);
                    if (l.this.f28414n != null) {
                        l.this.f28414n.a(l.this.f28412l);
                    }
                    l.this.a();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // com.mbridge.msdk.click.o.f
        public void a(int i10, String str, String str2, String str3) {
            if (!TextUtils.isEmpty(str2)) {
                l.this.f28412l.setExceptionMsg(str2);
            }
            if (!TextUtils.isEmpty(str3)) {
                l.this.f28412l.setContent(str3);
            }
            l.this.b(str);
            a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(String str) {
        return m.a(str, this.f28406f, this.f28412l);
    }

    /* JADX WARN: Code duplicated, block: B:65:0x0163 A[LOOP:0: B:15:0x003e->B:65:0x0163, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:81:0x015c A[SYNTHETIC] */
    private JumpLoaderResult c(String str) {
        String scheme;
        String str2;
        int i10;
        String strA = a(str);
        JumpLoaderResult jumpLoaderResult = new JumpLoaderResult();
        n nVar = new n();
        i iVar = new i();
        String host = "";
        try {
            if (URLUtil.isNetworkUrl(strA)) {
                URI uriCreate = URI.create(strA);
                scheme = uriCreate.getScheme();
                try {
                    host = uriCreate.getHost();
                } catch (Exception e10) {
                    e = e10;
                    q0.b("SocketRequestTask", e.getMessage());
                }
                str2 = host;
                host = scheme;
            } else {
                str2 = "";
            }
        } catch (Exception e11) {
            e = e11;
            scheme = "";
        }
        String strA2 = strA;
        for (int i11 = 0; i11 < 10; i11++) {
            if (this.mState != com.mbridge.msdk.foundation.same.task.a.b.RUNNING) {
                return null;
            }
            if (strA2.startsWith("tcp")) {
                this.f28411k = nVar.a(strA2, this.f28406f, this.f28407g, this.f28408h);
                i10 = 3;
            } else {
                this.f28411k = iVar.a(strA2, this.f28407g, this.f28408h, this.f28406f);
                i10 = 1;
            }
            com.mbridge.msdk.click.entity.a aVar = this.f28411k;
            if (aVar == null) {
                jumpLoaderResult.setUrl(strA2);
                jumpLoaderResult.setSuccess(false);
                break;
            }
            if (!TextUtils.isEmpty(aVar.f28380h)) {
                jumpLoaderResult.setUrl(strA2);
                jumpLoaderResult.setExceptionMsg(this.f28411k.f28380h);
                jumpLoaderResult.setType(i10);
                jumpLoaderResult.setHeader(this.f28411k.a());
                jumpLoaderResult.setSuccess(false);
                if (i11 != 0) {
                    break;
                }
                com.mbridge.msdk.click.retry.a.b().a(strA2, this.f28411k.f28380h, this.f28406f, this.f28405e, this.f28407g, this.f28408h, this.f28409i);
                break;
            }
            int i12 = this.f28411k.f28378f;
            if (i12 == 200) {
                jumpLoaderResult.setjumpDone(true);
                jumpLoaderResult.setUrl(strA2);
                jumpLoaderResult.setSuccess(true);
                String str3 = this.f28411k.f28379g;
                jumpLoaderResult.setContent(str3 != null ? str3 : null);
                break;
            }
            if (i12 != 301 && i12 != 302 && i12 != 307) {
                jumpLoaderResult.setjumpDone(false);
                jumpLoaderResult.setUrl(strA2);
                if (i11 != 0) {
                    break;
                }
                com.mbridge.msdk.click.retry.a.b().a(strA2, this.f28411k.f28380h, this.f28406f, this.f28405e, this.f28407g, this.f28408h, this.f28409i);
                break;
            }
            jumpLoaderResult.setSuccess(true);
            jumpLoaderResult.setIs302Jump(true);
            if (TextUtils.isEmpty(this.f28411k.f28373a)) {
                jumpLoaderResult.setjumpDone(true);
                jumpLoaderResult.setUrl(strA2);
                break;
            }
            String str4 = this.f28411k.f28373a;
            if (str4.startsWith("http")) {
                if (u0.a.b(str4)) {
                    jumpLoaderResult.setjumpDone(true);
                    jumpLoaderResult.setUrl(str4);
                    break;
                }
                strA2 = a(str4);
            } else {
                if (!str4.startsWith("/") || TextUtils.isEmpty(host) || TextUtils.isEmpty(str2)) {
                    jumpLoaderResult.setjumpDone(true);
                    jumpLoaderResult.setUrl(str4);
                    break;
                }
                str4 = host + "://" + str2 + str4;
                str2 = null;
                host = null;
                if (u0.a.b(str4)) {
                    jumpLoaderResult.setjumpDone(true);
                    jumpLoaderResult.setUrl(str4);
                    break;
                }
                strA2 = a(str4);
            }
        }
        return jumpLoaderResult;
    }

    public void a(g gVar) {
        this.f28413m = gVar;
    }

    public void a(k kVar) {
        this.f28414n = kVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        this.f28401a.release();
    }

    private String a(String str) {
        if (this.f28410j) {
            String strA = com.mbridge.msdk.setting.b.a(this.f28402b, str);
            if (!TextUtils.isEmpty(strA)) {
                str = str + strA;
            }
        }
        return com.mbridge.msdk.util.b.a() ? m.a(this.f28406f, str) : str;
    }

    @Override // com.mbridge.msdk.foundation.same.task.a
    public void cancelTask() {
    }

    @Override // com.mbridge.msdk.foundation.same.task.a
    public void pauseTask(boolean z10) {
    }
}
