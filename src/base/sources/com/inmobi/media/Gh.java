package com.inmobi.media;

import com.inmobi.media.core.config.models.RootConfig;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Gh extends kotlin.coroutines.jvm.internal.m implements tl.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f24867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f24868b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Kh f24869c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f24870d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ RootConfig f24871e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gm.s f24872f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Gh(List list, Kh kh2, String str, RootConfig rootConfig, gm.s sVar, kl.f fVar) {
        super(2, fVar);
        this.f24868b = list;
        this.f24869c = kh2;
        this.f24870d = str;
        this.f24871e = rootConfig;
        this.f24872f = sVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        Gh gh2 = new Gh(this.f24868b, this.f24869c, this.f24870d, this.f24871e, this.f24872f, fVar);
        gh2.f24867a = obj;
        return gh2;
    }

    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        return ((Gh) create((em.o0) obj, (kl.f) obj2)).invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ll.b.f();
        fl.s.b(obj);
        em.o0 o0Var = (em.o0) this.f24867a;
        List list = this.f24868b;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj2 : list) {
            String str = ((C3240q4) obj2).f27310a;
            Object arrayList = linkedHashMap.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(str, arrayList);
            }
            ((List) arrayList).add(obj2);
        }
        Kh kh2 = this.f24869c;
        String str2 = this.f24870d;
        RootConfig rootConfig = this.f24871e;
        gm.s sVar = this.f24872f;
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            em.k.d(o0Var, null, null, new Fh(kh2, (String) entry.getKey(), str2, rootConfig, (List) entry.getValue(), sVar, null), 3, null);
        }
        return fl.g0.f38750a;
    }
}
