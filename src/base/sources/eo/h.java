package eo;

import java.io.Serializable;
import java.security.Principal;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class h implements Principal, Serializable {
    private static final long serialVersionUID = -2266305184969850467L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f38109a;

    public h(String str) {
        ip.a.h(str, "User name");
        this.f38109a = str;
    }

    @Override // java.security.Principal
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && ip.f.a(this.f38109a, ((h) obj).f38109a);
    }

    @Override // java.security.Principal
    public String getName() {
        return this.f38109a;
    }

    @Override // java.security.Principal
    public int hashCode() {
        return ip.f.d(17, this.f38109a);
    }

    @Override // java.security.Principal
    public String toString() {
        return "[principal: " + this.f38109a + "]";
    }
}
