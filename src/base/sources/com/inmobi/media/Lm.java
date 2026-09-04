package com.inmobi.media;

import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Lm implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        fl.q qVar = (fl.q) obj;
        System.out.println((Object) (((Gl) qVar.h()).f24882c + " " + qVar.i()));
        Double d10 = (Double) qVar.i();
        fl.q qVar2 = (fl.q) obj2;
        System.out.println((Object) (((Gl) qVar2.h()).f24882c + " " + qVar2.i()));
        return jl.a.a(d10, (Double) qVar2.i());
    }
}
