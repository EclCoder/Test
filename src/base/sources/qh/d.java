package qh;

import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f50817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f50818b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f50819c;

    public d(int i10, String label, String description) {
        s.h(label, "label");
        s.h(description, "description");
        this.f50817a = i10;
        this.f50818b = label;
        this.f50819c = description;
    }

    public final String a() {
        return this.f50819c;
    }

    public final String b() {
        return this.f50818b;
    }

    public final int c() {
        return this.f50817a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f50817a == dVar.f50817a && s.c(this.f50818b, dVar.f50818b) && s.c(this.f50819c, dVar.f50819c);
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f50817a) * 31) + this.f50818b.hashCode()) * 31) + this.f50819c.hashCode();
    }

    public String toString() {
        return "GifResolutionItem(resolution=" + this.f50817a + ", label=" + this.f50818b + ", description=" + this.f50819c + ')';
    }
}
