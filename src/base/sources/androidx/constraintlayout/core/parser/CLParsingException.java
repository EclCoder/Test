package androidx.constraintlayout.core.parser;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class CLParsingException extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f1979a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f1980b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f1981c;

    public String d() {
        return this.f1979a + " (" + this.f1981c + " at line " + this.f1980b + ")";
    }

    @Override // java.lang.Throwable
    public String toString() {
        return "CLParsingException (" + hashCode() + ") : " + d();
    }
}
