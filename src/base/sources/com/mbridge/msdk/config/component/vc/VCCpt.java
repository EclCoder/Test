package com.mbridge.msdk.config.component.vc;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.view.ViewGroup;
import com.mbridge.msdk.config.activity.MBRewardVideoActivity;
import com.mbridge.msdk.config.component.common.util.c;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.mp3.Annu.HqKnbV;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class VCCpt extends com.mbridge.msdk.config.component.base.a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static ConcurrentHashMap<String, VCCpt> f29161l;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final String f29162h = "1200001";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final String f29163i = "1200002";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f29164j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private com.mbridge.msdk.config.component.vc.model.a f29165k;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes2.dex */
    private static class b implements com.mbridge.msdk.config.activity.lifecycle.a, Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f29166a;

        private b() {
        }

        public void a(String str) {
            this.f29166a = str;
        }

        @Override // com.mbridge.msdk.config.activity.lifecycle.a
        public void b() {
            VCCpt vCCpt;
            if (VCCpt.f29161l == null || VCCpt.f29161l.isEmpty() || (vCCpt = (VCCpt) VCCpt.f29161l.get(this.f29166a)) == null) {
                return;
            }
            vCCpt.a(vCCpt.a("902007", (Map<String, Object>) new HashMap()));
            vCCpt.c("onResume");
        }

        @Override // com.mbridge.msdk.config.activity.lifecycle.a
        public void c() {
            VCCpt vCCpt;
            if (VCCpt.f29161l == null || VCCpt.f29161l.isEmpty() || (vCCpt = (VCCpt) VCCpt.f29161l.get(this.f29166a)) == null) {
                return;
            }
            vCCpt.a(vCCpt.a("902009", (Map<String, Object>) new HashMap()));
        }

        @Override // com.mbridge.msdk.config.activity.lifecycle.a
        public void e() {
        }

        @Override // com.mbridge.msdk.config.activity.lifecycle.a
        public void f() {
        }

        @Override // com.mbridge.msdk.config.activity.lifecycle.a
        public void onStart() {
        }

        @Override // com.mbridge.msdk.config.activity.lifecycle.a
        public void a(ViewGroup viewGroup) {
            VCCpt vCCpt;
            if (VCCpt.f29161l == null || VCCpt.f29161l.isEmpty() || (vCCpt = (VCCpt) VCCpt.f29161l.get(this.f29166a)) == null) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 33) {
                vCCpt.a(viewGroup);
            }
            com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar = vCCpt.f28521d;
            String str = HqKnbV.hja;
            Object objB = aVar.b((Object) c.c(str));
            if (objB instanceof Map) {
                ((Map) objB).put(c.c("rootView"), viewGroup);
            } else {
                HashMap map = new HashMap();
                map.put(c.c("rootView"), viewGroup);
                vCCpt.f28521d.a(c.c(str), map);
            }
            vCCpt.a(vCCpt.a("902002", (Map<String, Object>) new HashMap()));
            vCCpt.a(vCCpt.a("902003", (Map<String, Object>) new HashMap()));
        }

        @Override // com.mbridge.msdk.config.activity.lifecycle.a
        public void a() {
            VCCpt vCCpt;
            if (VCCpt.f29161l == null || VCCpt.f29161l.isEmpty() || (vCCpt = (VCCpt) VCCpt.f29161l.get(this.f29166a)) == null) {
                return;
            }
            vCCpt.a(vCCpt.a("902006", (Map<String, Object>) new HashMap()));
            vCCpt.c("onStop");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String str) {
        com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar = this.f28521d;
        if (aVar == null) {
            return;
        }
        Object objB = aVar.b((Object) c.c("sdk_context"));
        try {
            if (objB instanceof Map) {
                Object obj = ((Map) objB).get("lifecycleListeners");
                if (obj instanceof List) {
                    List<com.mbridge.msdk.config.component.vc.inter.a> list = (List) obj;
                    if (list.isEmpty()) {
                        return;
                    }
                    synchronized (list) {
                        try {
                            for (com.mbridge.msdk.config.component.vc.inter.a aVar2 : list) {
                                if (aVar2 != null) {
                                    aVar2.a(str);
                                }
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
            }
        } catch (Throwable th3) {
            q0.b("VCCpt", th3.getMessage(), th3);
        }
    }

    private void h() {
        a(a("902005", (Map<String, Object>) new HashMap()));
        l();
        if (e() == null || !(e().getContext() instanceof Activity)) {
            return;
        }
        ((Activity) e().getContext()).finish();
    }

    private void i() {
        String strA = this.f29165k.a();
        try {
            if (strA.equals(c.c("319"))) {
                m();
            } else if (strA.equals(c.c("307"))) {
                h();
            }
            if (this.f29165k.f() == 1) {
                n();
            }
        } catch (Exception e10) {
            q0.b("VCCpt", "Error in doRenderTemplateAction", e10);
            a("1200002", "Root view render fail");
        }
    }

    private com.mbridge.msdk.config.activity.backdispatcher.a j() {
        try {
            com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar = this.f28521d;
            if (aVar == null) {
                return null;
            }
            Object objB = aVar.b((Object) c.c("sdk_context"));
            if (objB instanceof Map) {
                Object obj = ((Map) objB).get("backInvocationCallback");
                if (obj instanceof com.mbridge.msdk.config.activity.backdispatcher.a) {
                    return (com.mbridge.msdk.config.activity.backdispatcher.a) obj;
                }
            }
        } catch (Throwable th2) {
            q0.b("VCCpt", th2.getMessage());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k() {
        a(a("902010", (Map<String, Object>) new HashMap()));
    }

    private void l() {
        try {
            Object objB = this.f28521d.b((Object) c.c("sdk_context"));
            if (objB instanceof Map) {
                Map map = (Map) objB;
                Object obj = map.get("lifecycleListeners");
                if (obj instanceof List) {
                    ((List) obj).clear();
                }
                Object obj2 = map.get(c.c("component_cache"));
                if (obj2 instanceof Map) {
                    ((Map) obj2).clear();
                }
                if (Build.VERSION.SDK_INT >= 33) {
                    n();
                }
                map.remove("backInvocationCallback");
            }
            ConcurrentHashMap<String, VCCpt> concurrentHashMap = f29161l;
            if (concurrentHashMap != null) {
                concurrentHashMap.remove(this.f29164j);
                if (f29161l.isEmpty()) {
                    f29161l = null;
                }
            }
        } catch (Throwable th2) {
            q0.b("VCCpt", th2.getMessage(), th2);
        }
    }

    private void m() {
        Intent intent = new Intent(com.mbridge.msdk.foundation.controller.c.n().d(), (Class<?>) MBRewardVideoActivity.class);
        intent.putExtra("155", this.f29165k.c());
        intent.putExtra("154", this.f29165k.d());
        intent.putExtra("157", this.f29165k.g());
        intent.putExtra("158", this.f29165k.b());
        intent.putExtra("156", this.f29165k.e());
        b bVar = new b();
        bVar.a(this.f29164j);
        intent.putExtra("lifecycleCallbackByActivity", bVar);
        try {
            if (com.mbridge.msdk.foundation.controller.c.n() != null && com.mbridge.msdk.foundation.controller.c.n().f() != null) {
                ((Activity) com.mbridge.msdk.foundation.controller.c.n().f()).startActivity(intent);
                return;
            }
        } catch (Throwable th2) {
            q0.b("VCCpt", th2.getMessage());
        }
        intent.addFlags(268435456);
        com.mbridge.msdk.foundation.controller.c.n().d().startActivity(intent);
    }

    private void n() {
        Context context;
        com.mbridge.msdk.config.activity.backdispatcher.a aVarJ;
        if (Build.VERSION.SDK_INT >= 33) {
            try {
                ViewGroup viewGroupE = e();
                if (viewGroupE != null && (context = viewGroupE.getContext()) != null && (context instanceof Activity) && (aVarJ = j()) != null) {
                    aVarJ.a(((Activity) context).getWindow());
                }
            } catch (Throwable th2) {
                q0.b("VCCpt", th2.getMessage());
            }
        }
    }

    @Override // com.mbridge.msdk.config.component.base.a
    protected void b(Map<String, Object> map) {
        this.f28523f = "902001";
        this.f29165k = new com.mbridge.msdk.config.component.vc.model.a(map);
        this.f29164j = UUID.randomUUID().toString();
        if (f29161l == null) {
            f29161l = new ConcurrentHashMap<>();
        }
        f29161l.put(this.f29164j, this);
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void d() {
        super.d();
        i();
        a("902011", (HashMap<String, Object>) null);
    }

    private void a(String str, String str2) {
        a("902008", str, str2);
        h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(ViewGroup viewGroup) {
        com.mbridge.msdk.config.component.vc.model.a aVar;
        if (Build.VERSION.SDK_INT < 33 || viewGroup == null || (aVar = this.f29165k) == null || aVar.f() == 1) {
            return;
        }
        try {
            Context context = viewGroup.getContext();
            if (context != null && (context instanceof Activity)) {
                com.mbridge.msdk.config.activity.backdispatcher.a aVar2 = new com.mbridge.msdk.config.activity.backdispatcher.a();
                aVar2.a(((Activity) context).getWindow(), new com.mbridge.msdk.config.activity.backdispatcher.b() { // from class: com.mbridge.msdk.config.component.vc.a
                    @Override // com.mbridge.msdk.config.activity.backdispatcher.b
                    public final void a() {
                        this.f29167a.k();
                    }
                });
                a(aVar2);
            }
        } catch (Throwable th2) {
            q0.b("VCCpt", th2.getMessage());
        }
    }

    private void a(Object obj) {
        try {
            com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar = this.f28521d;
            if (aVar == null) {
                return;
            }
            Object objB = aVar.b((Object) c.c("sdk_context"));
            if (objB instanceof Map) {
                ((Map) objB).put("backInvocationCallback", obj);
            }
        } catch (Throwable th2) {
            q0.b("VCCpt", th2.getMessage());
        }
    }
}
