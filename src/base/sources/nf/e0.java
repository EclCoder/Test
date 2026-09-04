package nf;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q f47573a;

    public e0(q language) {
        kotlin.jvm.internal.s.h(language, "language");
        this.f47573a = language;
    }

    public final q a() {
        return this.f47573a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e0) && kotlin.jvm.internal.s.c(this.f47573a, ((e0) obj).f47573a);
    }

    public int hashCode() {
        return this.f47573a.hashCode();
    }

    public String toString() {
        return "LanguageRow(language=" + this.f47573a + ')';
    }
}
