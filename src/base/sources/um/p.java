package um;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class p extends o {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p f54801c = new p();

    private p() {
    }

    public final void c(char[] array) {
        kotlin.jvm.internal.s.h(array, "array");
        if (array.length == 16384) {
            a(array);
            return;
        }
        throw new IllegalArgumentException(("Inconsistent internal invariant: unexpected array size " + array.length).toString());
    }

    public final char[] d() {
        return super.b(16384);
    }
}
