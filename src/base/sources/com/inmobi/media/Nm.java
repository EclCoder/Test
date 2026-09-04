package com.inmobi.media;

import com.inmobi.media.core.config.models.AdConfig;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class Nm {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(Gl gl2, double d10, Xe xe2, int i10, AdConfig.VastVideoConfig vastVideoConfig, kotlin.coroutines.jvm.internal.d dVar) {
        Hm hm2;
        double d11;
        if (dVar instanceof Hm) {
            hm2 = (Hm) dVar;
            int i11 = hm2.f24968e;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                hm2.f24968e = i11 - Integer.MIN_VALUE;
            } else {
                hm2 = new Hm(dVar);
            }
        } else {
            hm2 = new Hm(dVar);
        }
        Object objA = hm2.f24967d;
        Object objF = ll.b.f();
        int i12 = hm2.f24968e;
        if (i12 == 0) {
            fl.s.b(objA);
            hm2.f24964a = gl2;
            hm2.f24965b = xe2;
            hm2.f24966c = i10;
            hm2.f24968e = 1;
            objA = a(gl2, d10, vastVideoConfig, hm2);
            if (objA == objF) {
                return objF;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i10 = hm2.f24966c;
            xe2 = hm2.f24965b;
            gl2 = hm2.f24964a;
            fl.s.b(objA);
        }
        double dDoubleValue = ((Number) objA).doubleValue();
        if (dDoubleValue == Double.MAX_VALUE) {
            return kotlin.coroutines.jvm.internal.b.b(Double.MAX_VALUE);
        }
        double dAbs = Math.abs((gl2.f24880a * gl2.f24881b) - i10);
        int iOrdinal = xe2.ordinal();
        if (iOrdinal != 2) {
            d11 = iOrdinal != 3 ? 0.5d : 1.5d;
        } else {
            d11 = 1.0d;
        }
        return kotlin.coroutines.jvm.internal.b.b((dAbs * d11) / Math.exp(dDoubleValue / 3.145728E7d));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(Gl gl2, double d10, AdConfig.VastVideoConfig vastVideoConfig, kotlin.coroutines.jvm.internal.d dVar) {
        Im im2;
        double dDoubleValue;
        if (dVar instanceof Im) {
            im2 = (Im) dVar;
            int i10 = im2.f25035c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                im2.f25035c = i10 - Integer.MIN_VALUE;
            } else {
                im2 = new Im(dVar);
            }
        } else {
            im2 = new Im(dVar);
        }
        Object objA = im2.f25034b;
        Object objF = ll.b.f();
        int i11 = im2.f25035c;
        double d11 = Double.MAX_VALUE;
        if (i11 == 0) {
            fl.s.b(objA);
            dDoubleValue = ((double) gl2.f24883d) * d10;
            if (dDoubleValue <= 0.0d && !vastVideoConfig.getBitRate().getFetchFromHead()) {
                return kotlin.coroutines.jvm.internal.b.b(Double.MAX_VALUE);
            }
            if (dDoubleValue <= 0.0d) {
                im2.f25033a = vastVideoConfig;
                im2.f25035c = 1;
                objA = a(gl2, vastVideoConfig, im2);
                if (objA == objF) {
                    return objF;
                }
            }
            if (dDoubleValue > 0.0d && dDoubleValue <= vastVideoConfig.getVastMaxAssetSize()) {
                d11 = dDoubleValue;
            }
            return kotlin.coroutines.jvm.internal.b.b(d11);
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        vastVideoConfig = im2.f25033a;
        fl.s.b(objA);
        dDoubleValue = ((Number) objA).doubleValue();
        if (dDoubleValue > 0.0d) {
            d11 = dDoubleValue;
        }
        return kotlin.coroutines.jvm.internal.b.b(d11);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(Gl gl2, AdConfig.VastVideoConfig vastVideoConfig, kotlin.coroutines.jvm.internal.d dVar) {
        Jm jm2;
        Ve ve2;
        if (dVar instanceof Jm) {
            jm2 = (Jm) dVar;
            int i10 = jm2.f25089b;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                jm2.f25089b = i10 - Integer.MIN_VALUE;
            } else {
                jm2 = new Jm(dVar);
            }
        } else {
            jm2 = new Jm(dVar);
        }
        Object objA = jm2.f25088a;
        Object objF = ll.b.f();
        int i11 = jm2.f25089b;
        try {
            if (i11 == 0) {
                fl.s.b(objA);
                Se se2 = new Se(gl2.f24882c, new Gk(vastVideoConfig.getBitRate().getHeaderTimeout(), vastVideoConfig.getBitRate().getHeaderTimeout(), vastVideoConfig.getBitRate().getHeaderTimeout()));
                B9 b10 = (B9) Pe.f25486c.getValue();
                jm2.f25089b = 1;
                objA = b10.f24525a.a(se2, jm2);
                if (objA == objF) {
                    return objF;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                fl.s.b(objA);
            }
            ve2 = (Ve) objA;
        } catch (Exception unused) {
            ve2 = null;
        }
        if (ve2 != null && ve2.c() == 200) {
            return kotlin.coroutines.jvm.internal.b.b(ve2.b().f25559c);
        }
        return kotlin.coroutines.jvm.internal.b.b(Double.MAX_VALUE);
    }
}
