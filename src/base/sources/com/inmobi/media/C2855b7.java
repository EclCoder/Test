package com.inmobi.media;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.util.Objects;

/* JADX INFO: renamed from: com.inmobi.media.b7, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C2855b7 implements gn.z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2855b7 f26249a = new C2855b7();

    @Override // gn.z
    public final gn.f0 intercept(gn.z.a chain) {
        kotlin.jvm.internal.s.h(chain, "chain");
        AbstractC2829a7.a();
        Objects.toString(chain.e());
        if (AbstractC2829a7.a()) {
            gn.f0 f0VarC = chain.c(chain.e());
            kotlin.jvm.internal.s.e(f0VarC);
            return f0VarC;
        }
        gn.f0.a aVarO = new gn.f0.a().q(chain.e()).o(gn.c0.HTTP_1_1);
        C2880c6 c2880c6 = EnumC2931e6.f26451b;
        gn.f0 f0VarC2 = aVarO.f(PsExtractor.AUDIO_STREAM).l("GDPR_COMPLIANCE_ENFORCED").b(gn.g0.create((gn.a0) null, "")).c();
        kotlin.jvm.internal.s.e(f0VarC2);
        return f0VarC2;
    }
}
