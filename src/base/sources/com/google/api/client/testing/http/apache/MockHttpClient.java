package com.google.api.client.testing.http.apache;

import co.a;
import co.o;
import co.q;
import co.t;
import com.google.api.client.util.Preconditions;
import fo.i;
import fo.l;
import fo.n;
import gp.f;
import gp.h;
import gp.j;
import oo.b;
import oo.e;
import org.apache.http.impl.client.m;
import qo.d;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class MockHttpClient extends m {
    int responseCode;

    protected l createClientRequestDirector(j jVar, b bVar, a aVar, e eVar, d dVar, h hVar, i iVar, fo.j jVar2, fo.b bVar2, fo.b bVar3, n nVar, ep.d dVar2) {
        return new l() { // from class: com.google.api.client.testing.http.apache.MockHttpClient.1
            @Override // fo.l
            public q execute(co.l lVar, o oVar, f fVar) {
                return new org.apache.http.message.i(t.f10164f, MockHttpClient.this.responseCode, null);
            }
        };
    }

    public final int getResponseCode() {
        return this.responseCode;
    }

    public MockHttpClient setResponseCode(int i10) {
        Preconditions.checkArgument(i10 >= 0);
        this.responseCode = i10;
        return this;
    }
}
