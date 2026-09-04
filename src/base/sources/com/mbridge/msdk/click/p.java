package com.mbridge.msdk.click;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.mbridge.msdk.click.entity.JumpLoaderResult;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.u0;
import java.net.URI;
import java.util.concurrent.Semaphore;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class p extends f implements com.mbridge.msdk.foundation.same.task.a.InterfaceC0400a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private g f28450b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private JumpLoaderResult f28451c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f28453e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Context f28454f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private com.mbridge.msdk.foundation.same.task.b f28455g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private com.mbridge.msdk.click.entity.a f28456h;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f28452d = true;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Handler f28457i = new Handler(Looper.getMainLooper());

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements k {
        a() {
        }

        @Override // com.mbridge.msdk.click.k
        public void a(JumpLoaderResult jumpLoaderResult) {
            p.this.f28451c = jumpLoaderResult;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (p.this.f28450b != null) {
                if (p.this.f28451c.isSuccess()) {
                    p.this.f28450b.a(p.this.f28451c);
                } else {
                    p.this.f28450b.a(p.this.f28451c, p.this.f28451c.getMsg());
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private class c extends com.mbridge.msdk.foundation.same.task.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Context f28461b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f28462c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f28463d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f28464e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private CampaignEx f28465f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f28466g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f28467h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f28468i;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Semaphore f28460a = new Semaphore(0);

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private o.f f28469j = new a();

        public c(Context context, String str, String str2, String str3, CampaignEx campaignEx, boolean z10, boolean z11, int i10) {
            this.f28461b = context;
            this.f28462c = str;
            this.f28463d = str2;
            this.f28464e = str3;
            this.f28465f = campaignEx;
            this.f28466g = z10;
            this.f28467h = z11;
            this.f28468i = i10;
        }

        private boolean a(int i10) {
            return i10 == 200;
        }

        private boolean b(int i10) {
            return i10 == 301 || i10 == 302 || i10 == 307;
        }

        private boolean c(String str) {
            return str.startsWith("/");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean d(String str) {
            return q.a(str, this.f28465f, p.this.f28451c);
        }

        @Override // com.mbridge.msdk.foundation.same.task.a
        public void runTask() {
            if (p.this.f28450b != null) {
                p.this.f28450b.b(null);
            }
            p.this.f28451c = new JumpLoaderResult();
            p.this.f28451c.setUrl(this.f28462c);
            p.this.f28451c = a(this.f28462c, this.f28466g, this.f28467h, this.f28465f, this.f28468i);
            if (!TextUtils.isEmpty(p.this.f28451c.getExceptionMsg())) {
                p.this.f28451c.setSuccess(true);
            }
            if (p.this.f28452d && p.this.f28451c.isSuccess()) {
                if (p.this.f28456h != null) {
                    p.this.f28451c.setStatusCode(p.this.f28456h.f28378f);
                }
                q.a(this.f28465f, p.this.f28451c, p.this.f28456h, this.f28463d, this.f28464e, this.f28461b, this.f28469j, this.f28460a);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class a implements o.f {
            a() {
            }

            @Override // com.mbridge.msdk.click.o.f
            public boolean a(String str) {
                boolean zD = c.this.d(str);
                if (zD) {
                    a();
                }
                return zD;
            }

            @Override // com.mbridge.msdk.click.o.f
            public boolean b(String str) {
                return false;
            }

            @Override // com.mbridge.msdk.click.o.f
            public boolean c(String str) {
                boolean zD = c.this.d(str);
                if (zD) {
                    a();
                }
                return zD;
            }

            @Override // com.mbridge.msdk.click.o.f
            public void a(String str, boolean z10, String str2) {
                c.this.d(str);
                p.this.f28451c.setContent(str2);
                a();
            }

            @Override // com.mbridge.msdk.click.o.f
            public void a(int i10, String str, String str2, String str3) {
                if (!TextUtils.isEmpty(str2)) {
                    p.this.f28451c.setExceptionMsg(str2);
                }
                if (!TextUtils.isEmpty(str3)) {
                    p.this.f28451c.setContent(str3);
                }
                c.this.d(str);
                a();
            }

            private void a() {
                synchronized (p.this) {
                    p.this.f28451c.setSuccess(true);
                    c.this.a();
                }
            }
        }

        private boolean b(String str) {
            return !URLUtil.isNetworkUrl(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a() {
            this.f28460a.release();
        }

        private JumpLoaderResult a(String str, boolean z10, boolean z11, CampaignEx campaignEx, int i10) {
            String scheme;
            String str2;
            String scheme2 = "";
            if (p.this.f28453e) {
                String strA = com.mbridge.msdk.setting.b.a(this.f28461b, str);
                if (!TextUtils.isEmpty(strA)) {
                    str = str + strA;
                }
            }
            if (com.mbridge.msdk.util.b.a()) {
                str = q.a(this.f28465f, str);
            }
            JumpLoaderResult jumpLoaderResult = new JumpLoaderResult();
            i iVar = new i();
            try {
                if (b(str)) {
                    str2 = "";
                } else {
                    URI uriCreate = URI.create(str);
                    scheme = uriCreate.getScheme();
                    try {
                        scheme2 = uriCreate.getHost();
                    } catch (Exception e10) {
                        e = e10;
                        e.printStackTrace();
                    }
                    str2 = scheme2;
                    scheme2 = scheme;
                }
            } catch (Exception e11) {
                e = e11;
                scheme = "";
            }
            String strA2 = str;
            String host = str2;
            for (int i11 = 0; i11 < 10; i11++) {
                if (!p.this.f28452d) {
                    return null;
                }
                p.this.f28456h = iVar.a(strA2, z10, z11, campaignEx);
                if (p.this.f28456h != null) {
                    if (!TextUtils.isEmpty(p.this.f28456h.f28380h)) {
                        jumpLoaderResult.setUrl(strA2);
                        jumpLoaderResult.setExceptionMsg(p.this.f28456h.f28380h);
                        jumpLoaderResult.setType(1);
                        jumpLoaderResult.setHeader(p.this.f28456h.a());
                        jumpLoaderResult.setSuccess(false);
                        if (i11 != 0) {
                            break;
                        }
                        com.mbridge.msdk.click.retry.a.b().a(strA2, p.this.f28456h.f28380h, campaignEx, this.f28464e, z10, z11, i10);
                        break;
                    }
                    jumpLoaderResult.setSuccess(true);
                    if (!b(p.this.f28456h.f28378f)) {
                        if (a(p.this.f28456h.f28378f)) {
                            jumpLoaderResult.setjumpDone(true);
                            jumpLoaderResult.setUrl(strA2);
                            jumpLoaderResult.setContent(p.this.f28456h.f28379g);
                            break;
                        }
                        jumpLoaderResult.setjumpDone(false);
                        jumpLoaderResult.setUrl(strA2);
                        if (i11 != 0) {
                            break;
                        }
                        com.mbridge.msdk.click.retry.a.b().a(strA2, "error code:" + p.this.f28456h.f28378f, campaignEx, this.f28464e, z10, z11, i10);
                        break;
                    }
                    jumpLoaderResult.setIs302Jump(true);
                    if (!TextUtils.isEmpty(p.this.f28456h.f28373a)) {
                        strA2 = p.this.f28456h.f28373a;
                        if (b(strA2)) {
                            if (!c(strA2) || TextUtils.isEmpty(scheme2) || TextUtils.isEmpty(host)) {
                                jumpLoaderResult.setjumpDone(true);
                                jumpLoaderResult.setUrl(strA2);
                                break;
                            }
                            strA2 = scheme2 + "://" + host + strA2;
                            host = null;
                            scheme2 = null;
                        } else if (!b(strA2)) {
                            try {
                                URI uriCreate2 = URI.create(strA2);
                                scheme2 = uriCreate2.getScheme();
                                host = uriCreate2.getHost();
                            } catch (Exception e12) {
                                e12.printStackTrace();
                            }
                        }
                        if (!a(strA2)) {
                            if (p.this.f28453e) {
                                String strA3 = com.mbridge.msdk.setting.b.a(this.f28461b, strA2);
                                if (!TextUtils.isEmpty(strA3)) {
                                    strA2 = strA2 + strA3;
                                }
                            }
                            if (com.mbridge.msdk.util.b.a()) {
                                strA2 = q.a(this.f28465f, strA2);
                            }
                        } else {
                            jumpLoaderResult.setjumpDone(true);
                            jumpLoaderResult.setUrl(strA2);
                            break;
                        }
                    } else {
                        jumpLoaderResult.setjumpDone(true);
                        jumpLoaderResult.setUrl(strA2);
                        break;
                    }
                } else {
                    jumpLoaderResult.setUrl(strA2);
                    jumpLoaderResult.setSuccess(false);
                    jumpLoaderResult.setMsg("request url is invalided");
                    break;
                }
            }
            return jumpLoaderResult;
        }

        @Override // com.mbridge.msdk.foundation.same.task.a
        public void cancelTask() {
        }

        @Override // com.mbridge.msdk.foundation.same.task.a
        public void pauseTask(boolean z10) {
        }

        private boolean a(String str) {
            return u0.a.b(str);
        }
    }

    public p(Context context) {
        this.f28454f = context;
        this.f28455g = new com.mbridge.msdk.foundation.same.task.b(context, 2);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public void a(String str, g gVar, boolean z10, String str2, String str3, CampaignEx campaignEx, boolean z11, boolean z12, int i10) {
        com.mbridge.msdk.foundation.same.task.a cVar;
        this.f28450b = gVar;
        this.f28453e = z10;
        com.mbridge.msdk.click.entity.b bVar = new com.mbridge.msdk.click.entity.b();
        bVar.a(this.f28454f);
        bVar.c(str);
        bVar.b(z10);
        bVar.a(str2);
        bVar.b(str3);
        bVar.a(campaignEx);
        bVar.a(z11);
        bVar.c(z12);
        bVar.a(i10);
        if (str.startsWith("tcp")) {
            l lVar = new l(bVar);
            lVar.a(this.f28450b);
            lVar.a(new a());
            cVar = lVar;
        } else {
            cVar = new c(this.f28454f, str, str2, str3, campaignEx, z11, z12, i10);
        }
        this.f28455g.b(cVar, this);
    }

    @Override // com.mbridge.msdk.foundation.same.task.a.InterfaceC0400a
    public void a(com.mbridge.msdk.foundation.same.task.a.b bVar) {
        if (bVar == com.mbridge.msdk.foundation.same.task.a.b.FINISH && this.f28452d) {
            this.f28457i.post(new b());
        }
    }
}
