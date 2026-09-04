package com.bykv.vk.openvk.preload.a;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class k<IN, OUT> extends d<IN, OUT> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private IN f11693d;

    @Override // com.bykv.vk.openvk.preload.a.d
    public final Object a(b<OUT> bVar, IN in2) {
        this.f11693d = in2;
        try {
            return bVar.a(a());
        } catch (i.a e10) {
            return a((b) bVar, e10.getCause());
        } catch (Throwable th2) {
            return a((b) bVar, th2);
        }
    }

    protected abstract boolean a(Throwable th2);

    protected final IN g() {
        return this.f11693d;
    }

    private Object a(b<OUT> bVar, Throwable th2) throws Throwable {
        while (a(th2)) {
            try {
                return bVar.a(a());
            } catch (i.a e10) {
                th2 = e10.getCause();
            }
        }
        throw th2;
    }

    protected OUT a() {
        return this.f11693d;
    }
}
