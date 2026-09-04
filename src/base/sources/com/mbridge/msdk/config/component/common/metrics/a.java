package com.mbridge.msdk.config.component.common.metrics;

import com.mbridge.msdk.foundation.same.report.d;
import com.mbridge.msdk.foundation.same.report.n;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.tracker.e;
import com.mbridge.msdk.tracker.f;
import com.mbridge.msdk.tracker.m;
import com.mbridge.msdk.tracker.network.toolbox.h;
import com.mbridge.msdk.tracker.p;
import com.mbridge.msdk.tracker.x;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    m f28642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    x f28643b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    JSONObject f28644c;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final a f28645a = new a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean a(e eVar) {
        return true;
    }

    private m c() {
        try {
            m mVar = this.f28642a;
            if (mVar == null) {
                m mVarB = m.b("metrics_component", com.mbridge.msdk.foundation.controller.c.n().d(), b());
                this.f28642a = mVarB;
                if (mVarB != null) {
                    JSONObject jSONObject = this.f28644c;
                    if (jSONObject != null) {
                        mVarB.a(jSONObject);
                    }
                    this.f28642a.h();
                }
            } else {
                JSONObject jSONObject2 = this.f28644c;
                if (jSONObject2 != null) {
                    mVar.a(jSONObject2);
                }
            }
        } catch (Exception e10) {
            q0.b("ComponentMetrics", e10.getMessage());
        }
        return this.f28642a;
    }

    public void d() {
        if (this.f28642a == null) {
            this.f28642a = c();
        }
        this.f28642a.a();
    }

    private a() {
    }

    public static a a() {
        return b.f28645a;
    }

    public void b(Map<String, Object> map) {
        if (map != null) {
            try {
                this.f28644c = new JSONObject(map);
            } catch (Exception e10) {
                q0.b("ComponentMetrics", e10.getMessage());
            }
        }
    }

    public void a(Map<String, Object> map) {
        if (map != null) {
            try {
                String strValueOf = String.valueOf(map.get(com.mbridge.msdk.config.component.common.util.c.c("key")));
                JSONObject jSONObject = new JSONObject(map);
                if (jSONObject.length() > 0) {
                    e eVar = new e(strValueOf);
                    eVar.a(jSONObject);
                    eVar.b(0);
                    eVar.a(0);
                    c().d(eVar);
                }
            } catch (Throwable th2) {
                q0.b("ComponentMetrics", th2.getMessage(), th2);
            }
        }
    }

    private x b() {
        if (this.f28643b == null) {
            this.f28643b = new x.b().a(604800000).b(50).d(50).c(15000).e(2).a(new d()).a(new f() { // from class: com.mbridge.msdk.config.component.common.metrics.c
                @Override // com.mbridge.msdk.tracker.f
                public final boolean a(e eVar) {
                    return a.a(eVar);
                }
            }).a(new n()).a(0, new p(new h(), com.mbridge.msdk.foundation.same.net.utils.d.h().f30618d, 0)).a();
        }
        return this.f28643b;
    }

    public void a(x xVar) {
        if (xVar != null) {
            this.f28643b = xVar;
            m mVar = this.f28642a;
            if (mVar != null) {
                mVar.a("metrics_component", com.mbridge.msdk.foundation.controller.c.n().d(), xVar);
            }
        }
    }
}
