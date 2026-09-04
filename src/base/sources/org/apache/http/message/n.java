package org.apache.http.message;

import co.x;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public class n implements x, Cloneable, Serializable {
    private static final long serialVersionUID = 2810581718468737193L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final co.v f49417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f49418b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f49419c;

    public n(String str, String str2, co.v vVar) {
        this.f49418b = (String) ip.a.h(str, "Method");
        this.f49419c = (String) ip.a.h(str2, "URI");
        this.f49417a = (co.v) ip.a.h(vVar, "Version");
    }

    public Object clone() {
        return super.clone();
    }

    @Override // co.x
    public String getMethod() {
        return this.f49418b;
    }

    @Override // co.x
    public co.v getProtocolVersion() {
        return this.f49417a;
    }

    @Override // co.x
    public String getUri() {
        return this.f49419c;
    }

    public String toString() {
        return j.f49407b.g(null, this).toString();
    }
}
