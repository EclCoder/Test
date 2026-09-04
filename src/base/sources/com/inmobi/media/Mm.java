package com.inmobi.media;

import com.inmobi.media.core.config.models.AdConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Mm extends kotlin.coroutines.jvm.internal.m implements tl.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f25290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f25291b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f25292c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ double f25293d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AdConfig.VastVideoConfig f25294e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Mm(ArrayList arrayList, double d10, AdConfig.VastVideoConfig vastVideoConfig, kl.f fVar) {
        super(2, fVar);
        this.f25292c = arrayList;
        this.f25293d = d10;
        this.f25294e = vastVideoConfig;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        Mm mm2 = new Mm(this.f25292c, this.f25293d, this.f25294e, fVar);
        mm2.f25291b = obj;
        return mm2;
    }

    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        return ((Mm) create((em.o0) obj, (kl.f) obj2)).invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objA;
        Object objF = ll.b.f();
        int i10 = this.f25290a;
        if (i10 == 0) {
            fl.s.b(obj);
            em.o0 o0Var = (em.o0) this.f25291b;
            if (this.f25292c.isEmpty()) {
                return gl.r.l();
            }
            int iA = C5.a();
            Xe xeA = C4.a();
            ArrayList arrayList = this.f25292c;
            double d10 = this.f25293d;
            AdConfig.VastVideoConfig vastVideoConfig = this.f25294e;
            ArrayList arrayList2 = new ArrayList(gl.r.v(arrayList, 10));
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                int i12 = i11 + 1;
                arrayList2.add(em.k.b(o0Var, null, null, new Km((Gl) arrayList.get(i11), d10, xeA, iA, vastVideoConfig, null), 3, null));
                xeA = xeA;
                vastVideoConfig = vastVideoConfig;
                i11 = i12;
                d10 = d10;
            }
            this.f25290a = 1;
            objA = em.f.a(arrayList2, this);
            if (objA == objF) {
                return objF;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fl.s.b(obj);
            objA = obj;
        }
        List listZ0 = gl.r.z0((Iterable) objA, new Lm());
        ArrayList arrayList3 = new ArrayList(gl.r.v(listZ0, 10));
        Iterator it = listZ0.iterator();
        while (it.hasNext()) {
            arrayList3.add((Gl) ((fl.q) it.next()).h());
        }
        return arrayList3;
    }
}
