package wd;

import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f56185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f56186b;

    /* JADX INFO: renamed from: wd.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class C0859b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f56187a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Map f56188b = null;

        C0859b(String str) {
            this.f56187a = str;
        }

        public b a() {
            return new b(this.f56187a, this.f56188b == null ? Collections.EMPTY_MAP : Collections.unmodifiableMap(new HashMap(this.f56188b)));
        }

        public C0859b b(Annotation annotation) {
            if (this.f56188b == null) {
                this.f56188b = new HashMap();
            }
            this.f56188b.put(annotation.annotationType(), annotation);
            return this;
        }
    }

    public static C0859b a(String str) {
        return new C0859b(str);
    }

    public static b d(String str) {
        return new b(str, Collections.EMPTY_MAP);
    }

    public String b() {
        return this.f56185a;
    }

    public Annotation c(Class cls) {
        return (Annotation) this.f56186b.get(cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f56185a.equals(bVar.f56185a) && this.f56186b.equals(bVar.f56186b);
    }

    public int hashCode() {
        return (this.f56185a.hashCode() * 31) + this.f56186b.hashCode();
    }

    public String toString() {
        return "FieldDescriptor{name=" + this.f56185a + ", properties=" + this.f56186b.values() + "}";
    }

    private b(String str, Map map) {
        this.f56185a = str;
        this.f56186b = map;
    }
}
