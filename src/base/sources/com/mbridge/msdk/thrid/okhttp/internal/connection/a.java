package com.mbridge.msdk.thrid.okhttp.internal.connection;

import com.google.api.client.http.HttpMethods;
import com.mbridge.msdk.thrid.okhttp.a0;
import com.mbridge.msdk.thrid.okhttp.t;
import com.mbridge.msdk.thrid.okhttp.v;
import com.mbridge.msdk.thrid.okhttp.y;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class a implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f33142a;

    public a(v vVar) {
        this.f33142a = vVar;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.t
    public a0 a(t.a aVar) {
        com.mbridge.msdk.thrid.okhttp.internal.http.g gVar = (com.mbridge.msdk.thrid.okhttp.internal.http.g) aVar;
        y yVarD = gVar.d();
        g gVarI = gVar.i();
        return gVar.a(yVarD, gVarI, gVarI.a(this.f33142a, aVar, !yVarD.e().equals(HttpMethods.GET)), gVarI.c());
    }
}
