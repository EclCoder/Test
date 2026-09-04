package org.apache.http.message;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public class b implements co.d, Cloneable, Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final co.e[] f49375c = new co.e[0];
    private static final long serialVersionUID = -5427236326487562174L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f49376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f49377b;

    public b(String str, String str2) {
        this.f49376a = (String) ip.a.h(str, "Name");
        this.f49377b = str2;
    }

    public Object clone() {
        return super.clone();
    }

    @Override // co.d
    public co.e[] g() {
        return getValue() != null ? g.e(getValue(), null) : f49375c;
    }

    @Override // co.u
    public String getName() {
        return this.f49376a;
    }

    @Override // co.u
    public String getValue() {
        return this.f49377b;
    }

    public String toString() {
        return j.f49407b.f(null, this).toString();
    }
}
