package org.apache.http.message;

import co.y;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public class o implements y, Cloneable, Serializable {
    private static final long serialVersionUID = -2443303766890459269L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final co.v f49420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f49421b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f49422c;

    public o(co.v vVar, int i10, String str) {
        this.f49420a = (co.v) ip.a.h(vVar, "Version");
        this.f49421b = ip.a.g(i10, "Status code");
        this.f49422c = str;
    }

    public Object clone() {
        return super.clone();
    }

    @Override // co.y
    public String g() {
        return this.f49422c;
    }

    @Override // co.y
    public co.v getProtocolVersion() {
        return this.f49420a;
    }

    @Override // co.y
    public int getStatusCode() {
        return this.f49421b;
    }

    public String toString() {
        return j.f49407b.h(null, this).toString();
    }
}
