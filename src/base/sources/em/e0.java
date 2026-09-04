package em;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class e0 {
    public static final Object a(Object obj, kl.f fVar) {
        if (!(obj instanceof d0)) {
            return fl.r.b(obj);
        }
        fl.r.a aVar = fl.r.f38769b;
        return fl.r.b(fl.s.a(((d0) obj).f37973a));
    }

    public static final Object b(Object obj) {
        Throwable thE = fl.r.e(obj);
        return thE == null ? obj : new d0(thE, false, 2, null);
    }

    public static final Object c(Object obj, o oVar) {
        Throwable thE = fl.r.e(obj);
        return thE == null ? obj : new d0(thE, false, 2, null);
    }
}
