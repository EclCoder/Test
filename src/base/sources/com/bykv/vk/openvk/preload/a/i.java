package com.bykv.vk.openvk.preload.a;

import java.util.List;
import wc.XtO.NpmRNZ;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
final class i implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected e f11688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f11689b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<h> f11690c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private d f11691d;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    static final class a extends Exception {
        a(Throwable th2) {
            super(th2);
        }
    }

    i(List<h> list, int i10, e eVar, d dVar) {
        this.f11690c = list;
        this.f11689b = i10;
        this.f11688a = eVar;
        this.f11691d = dVar;
    }

    private d c(Class cls) {
        d dVar = this.f11691d;
        while (dVar != null && dVar.getClass() != cls) {
            dVar = dVar.f11670a;
        }
        return dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bykv.vk.openvk.preload.a.b
    public final Object a(Object obj) throws a {
        d dVar = this.f11691d;
        if (dVar != null) {
            dVar.f11672c = obj;
            dVar.e();
        }
        if (this.f11689b >= this.f11690c.size()) {
            return obj;
        }
        h hVar = this.f11690c.get(this.f11689b);
        Class<? extends d> cls = hVar.f11682a;
        d dVar2 = (d) this.f11688a.a(cls);
        if (dVar2 == null) {
            throw new IllegalArgumentException("interceptor == null , index = " + obj + " , class: " + cls);
        }
        com.bykv.vk.openvk.preload.a.b.a aVarA = hVar.a();
        i iVar = new i(this.f11690c, this.f11689b + 1, this.f11688a, dVar2);
        dVar2.a(iVar, this.f11691d, obj, aVarA, hVar.b());
        dVar2.c();
        try {
            Object objA = dVar2.a(iVar, obj);
            dVar2.d();
            return objA;
        } catch (a e10) {
            dVar2.c(e10.getCause());
            throw e10;
        } catch (Throwable th2) {
            dVar2.b(th2);
            throw new a(th2);
        }
    }

    @Override // com.bykv.vk.openvk.preload.a.b
    public final Object b(Class cls) {
        d dVarC = c(cls);
        if (dVarC != null) {
            return dVarC.f11672c;
        }
        throw new IllegalArgumentException("can not find pre Interceptor , class:".concat(String.valueOf(cls)));
    }

    @Override // com.bykv.vk.openvk.preload.a.b
    public final Object a(Class cls) {
        d dVarC = c(cls);
        if (dVarC != null) {
            return dVarC.f11671b;
        }
        throw new IllegalArgumentException(NpmRNZ.vZpk.concat(String.valueOf(cls)));
    }
}
