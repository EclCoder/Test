package g8;

import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final Object f38963a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected String f38964b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected String f38965c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected HashSet f38966d;

    private b(Object obj) {
        this.f38963a = obj;
    }

    public static b e(com.fasterxml.jackson.core.c cVar) {
        return new b(cVar);
    }

    public static b f(com.fasterxml.jackson.core.e eVar) {
        return new b(eVar);
    }

    public b a() {
        return new b(this.f38963a);
    }

    public Object b() {
        return this.f38963a;
    }

    public boolean c(String str) {
        String str2 = this.f38964b;
        if (str2 == null) {
            this.f38964b = str;
            return false;
        }
        if (str.equals(str2)) {
            return true;
        }
        String str3 = this.f38965c;
        if (str3 == null) {
            this.f38965c = str;
            return false;
        }
        if (str.equals(str3)) {
            return true;
        }
        if (this.f38966d == null) {
            HashSet hashSet = new HashSet(16);
            this.f38966d = hashSet;
            hashSet.add(this.f38964b);
            this.f38966d.add(this.f38965c);
        }
        return !this.f38966d.add(str);
    }

    public void d() {
        this.f38964b = null;
        this.f38965c = null;
        this.f38966d = null;
    }
}
