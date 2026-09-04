package com.mbridge.msdk.config.component.log;

import com.mbridge.msdk.foundation.same.report.d;
import com.mbridge.msdk.foundation.same.report.m;
import com.mbridge.msdk.foundation.same.report.n;
import com.mbridge.msdk.tracker.e;
import com.mbridge.msdk.tracker.f;
import com.mbridge.msdk.tracker.network.toolbox.h;
import com.mbridge.msdk.tracker.p;
import com.mbridge.msdk.tracker.x;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class LogCpt extends com.mbridge.msdk.config.component.base.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private com.mbridge.msdk.config.component.log.model.a f28961h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    x f28962i;

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean a(e eVar) {
        return true;
    }

    @Override // com.mbridge.msdk.config.component.base.a
    protected void b(Map<String, Object> map) {
        super.b(map);
        this.f28523f = "913001";
        this.f28961h = new com.mbridge.msdk.config.component.log.model.a(map);
        this.f28962i = new x.b().a(this.f28961h.k()).b(this.f28961h.d()).d(this.f28961h.g()).c(this.f28961h.b()).e(this.f28961h.a()).a(new d()).a(new f() { // from class: com.mbridge.msdk.config.component.log.a
            @Override // com.mbridge.msdk.tracker.f
            public final boolean a(e eVar) {
                return LogCpt.a(eVar);
            }
        }).a(new n()).a(this.f28961h.f(), a(this.f28961h.f())).a();
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void d() {
        super.d();
        com.mbridge.msdk.config.component.common.metrics.a.a().a(this.f28962i);
        if (this.f28961h.h() != null) {
            com.mbridge.msdk.config.component.common.metrics.a.a().b(this.f28961h.h());
        }
        if (this.f28961h.e() == 1) {
            com.mbridge.msdk.config.component.common.metrics.a.a().d();
        }
        a("913002", (HashMap<String, Object>) null);
    }

    private p a(int i10) {
        return i10 == 1 ? new p(new m((byte) 2), this.f28961h.i(), this.f28961h.j()) : new p(new h(), this.f28961h.c(), 0);
    }
}
