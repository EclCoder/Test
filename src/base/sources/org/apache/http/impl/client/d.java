package org.apache.http.impl.client;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
abstract class d implements fo.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final List f49274c = Collections.unmodifiableList(Arrays.asList("Negotiate", "Kerberos", "NTLM", "CredSSP", "Digest", "Basic"));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f49275a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f49276b;

    d(int i10, String str) {
        zn.h.k(getClass());
        this.f49275a = i10;
        this.f49276b = str;
    }

    @Override // fo.c
    public boolean a(co.l lVar, co.q qVar, gp.f fVar) {
        ip.a.h(qVar, "HTTP response");
        return qVar.b().getStatusCode() == this.f49275a;
    }
}
