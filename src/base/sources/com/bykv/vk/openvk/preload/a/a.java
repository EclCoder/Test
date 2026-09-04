package com.bykv.vk.openvk.preload.a;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class a<IN, OUT> extends l<IN, OUT> {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bykv.vk.openvk.preload.a.d
    public final Object a(b<OUT> bVar, IN in2) {
        new m(bVar);
        String strA = a(in2);
        l.a aVar = a().get(strA);
        if (aVar == null) {
            throw new IllegalArgumentException("can not found branch, branch name is：".concat(String.valueOf(strA)));
        }
        List<h> list = aVar.f11695a;
        Object objA = c.a(list, ((i) bVar).f11688a, this).a(in2);
        return !l.a(list) ? objA : bVar.a(objA);
    }

    protected abstract String a(IN in2);
}
