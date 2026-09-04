package ek;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private el.a f37951a;

    public static void a(el.a aVar, el.a aVar2) {
        e.a(aVar2);
        a aVar3 = (a) aVar;
        if (aVar3.f37951a != null) {
            throw new IllegalStateException();
        }
        aVar3.f37951a = aVar2;
    }

    @Override // el.a
    public Object get() {
        el.a aVar = this.f37951a;
        if (aVar != null) {
            return aVar.get();
        }
        throw new IllegalStateException();
    }
}
