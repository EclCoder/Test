package lg;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class y implements ek.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final el.a f44552a;

    public y(el.a aVar) {
        this.f44552a = aVar;
    }

    public static y a(el.a aVar) {
        return new y(aVar);
    }

    public static x c(a aVar) {
        return new x(aVar);
    }

    @Override // el.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public x get() {
        return c((a) this.f44552a.get());
    }
}
