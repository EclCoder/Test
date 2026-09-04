package com.mbridge.msdk.config.component.common.network;

import com.mbridge.msdk.foundation.tools.q0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.mbridge.msdk.config.component.common.network.a f28646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.mbridge.msdk.config.component.common.network.result.a f28647b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.mbridge.msdk.config.component.nori.model.a f28648c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.mbridge.msdk.config.component.nori.monitor.b f28649d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f28650e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f28651f = "HTTP";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private com.mbridge.msdk.config.component.common.network.connect.socket.a f28652g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private com.mbridge.msdk.config.component.common.network.connect.okhttp.a f28653h = null;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements com.mbridge.msdk.config.component.common.network.b {
        a() {
        }

        @Override // com.mbridge.msdk.config.component.common.network.b
        public void a() {
            if (c.this.f28652g != null) {
                c.this.f28652g.a();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b implements com.mbridge.msdk.config.component.common.network.b {
        b() {
        }

        @Override // com.mbridge.msdk.config.component.common.network.b
        public void a() {
            if (c.this.f28653h != null) {
                c.this.f28653h.a();
            }
        }
    }

    public c(com.mbridge.msdk.config.component.nori.model.a aVar, com.mbridge.msdk.config.component.common.network.result.a aVar2) {
        this.f28648c = aVar;
        this.f28647b = aVar2;
        this.f28649d = aVar2.a();
    }

    private void c() {
        try {
            com.mbridge.msdk.config.component.common.network.connect.socket.a aVar = new com.mbridge.msdk.config.component.common.network.connect.socket.a(this.f28648c, this.f28647b, this.f28646a);
            this.f28652g = aVar;
            aVar.a(this.f28650e);
            this.f28649d.a(new a());
        } catch (Exception e10) {
            q0.b("NetworkRequestTask", e10.getMessage(), e10);
        }
    }

    public void a(String str, com.mbridge.msdk.config.component.common.network.a aVar) {
        this.f28650e = str;
        this.f28646a = aVar;
        this.f28651f = this.f28648c.i();
    }

    public void b() {
        com.mbridge.msdk.config.component.common.network.a aVar = this.f28646a;
        if (aVar != null) {
            aVar.a(this.f28647b);
        }
        if (this.f28651f.equals("TCP")) {
            c();
        } else {
            a();
        }
    }

    private void a() {
        try {
            com.mbridge.msdk.config.component.common.network.connect.okhttp.a aVar = new com.mbridge.msdk.config.component.common.network.connect.okhttp.a(this.f28648c, this.f28647b, this.f28646a);
            this.f28653h = aVar;
            aVar.a(this.f28650e);
            this.f28649d.a(new b());
        } catch (Exception e10) {
            q0.b("NetworkRequestTask", e10.getMessage(), e10);
        }
    }
}
