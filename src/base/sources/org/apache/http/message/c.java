package org.apache.http.message;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public class c implements co.e, Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f49378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f49379b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final co.u[] f49380c;

    public c(String str, String str2, co.u[] uVarArr) {
        this.f49378a = (String) ip.a.h(str, "Name");
        this.f49379b = str2;
        if (uVarArr != null) {
            this.f49380c = uVarArr;
        } else {
            this.f49380c = new co.u[0];
        }
    }

    @Override // co.e
    public co.u b(String str) {
        ip.a.h(str, "Name");
        for (co.u uVar : this.f49380c) {
            if (uVar.getName().equalsIgnoreCase(str)) {
                return uVar;
            }
        }
        return null;
    }

    public Object clone() {
        return super.clone();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof co.e) {
            c cVar = (c) obj;
            if (this.f49378a.equals(cVar.f49378a) && ip.f.a(this.f49379b, cVar.f49379b) && ip.f.b(this.f49380c, cVar.f49380c)) {
                return true;
            }
        }
        return false;
    }

    @Override // co.e
    public String getName() {
        return this.f49378a;
    }

    @Override // co.e
    public co.u[] getParameters() {
        return (co.u[]) this.f49380c.clone();
    }

    @Override // co.e
    public String getValue() {
        return this.f49379b;
    }

    public int hashCode() {
        int iD = ip.f.d(ip.f.d(17, this.f49378a), this.f49379b);
        for (co.u uVar : this.f49380c) {
            iD = ip.f.d(iD, uVar);
        }
        return iD;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f49378a);
        if (this.f49379b != null) {
            sb2.append("=");
            sb2.append(this.f49379b);
        }
        for (co.u uVar : this.f49380c) {
            sb2.append("; ");
            sb2.append(uVar);
        }
        return sb2.toString();
    }
}
