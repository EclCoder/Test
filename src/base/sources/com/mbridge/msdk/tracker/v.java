package com.mbridge.msdk.tracker;

import com.google.api.client.http.UrlEncodedParser;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.HashMap;
import java.util.Map;
import re.xQrM.UoyZyZEcGYBpIg;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public class v<T> extends com.mbridge.msdk.tracker.network.t<T> {
    private com.mbridge.msdk.tracker.network.e A;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private Map<String, String> f33943w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private com.mbridge.msdk.tracker.network.t.a f33944x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private com.mbridge.msdk.tracker.network.v.b<T> f33945y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private w f33946z;

    public v(String str, int i10) {
        super(i10, str);
    }

    public com.mbridge.msdk.tracker.network.v.b<T> C() {
        return this.f33945y;
    }

    @Override // com.mbridge.msdk.tracker.network.t
    public boolean a() {
        return false;
    }

    @Override // com.mbridge.msdk.tracker.network.t
    protected Map<String, String> i() {
        return this.f33943w;
    }

    @Override // com.mbridge.msdk.tracker.network.t
    public com.mbridge.msdk.tracker.network.t.a l() {
        return this.f33944x;
    }

    @Override // com.mbridge.msdk.tracker.network.t
    public com.mbridge.msdk.tracker.network.x o() {
        if (y.b(this.A)) {
            this.A = new com.mbridge.msdk.tracker.network.e(30000, 0);
        }
        return this.A;
    }

    public v(String str, int i10, int i11) {
        super(i10, str, i11);
    }

    public void a(w wVar) {
        this.f33946z = wVar;
    }

    @Override // com.mbridge.msdk.tracker.network.t
    public Map<String, String> f() {
        HashMap map = new HashMap();
        map.put(UoyZyZEcGYBpIg.qgAmcEn, UrlEncodedParser.CONTENT_TYPE);
        map.put("Charset", C.UTF8_NAME);
        return map;
    }

    public void a(com.mbridge.msdk.tracker.network.t.a aVar) {
        this.f33944x = aVar;
    }

    public void a(Map<String, String> map) {
        this.f33943w = map;
    }

    public void a(com.mbridge.msdk.tracker.network.v.b<T> bVar) {
        this.f33945y = bVar;
    }

    @Override // com.mbridge.msdk.tracker.network.t
    protected com.mbridge.msdk.tracker.network.v<T> a(com.mbridge.msdk.tracker.network.q qVar) {
        return this.f33946z.a(qVar);
    }

    @Override // com.mbridge.msdk.tracker.network.t
    protected void a(T t10) {
        com.mbridge.msdk.tracker.network.v.b<T> bVarC = C();
        this.f33945y = bVarC;
        if (bVarC != null) {
            bVarC.a(t10);
        }
    }
}
