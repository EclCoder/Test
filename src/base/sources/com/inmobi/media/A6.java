package com.inmobi.media;

import android.content.Context;
import com.inmobi.media.ads.network.common.model.MetaInfo;
import com.inmobi.media.ads.network.common.model.OmSdkInfo;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class A6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Mc f24455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AbstractC2926e1 f24456b;

    public A6(Mc nativeAdUnitComponent, AbstractC2926e1 adSessionManager) {
        kotlin.jvm.internal.s.h(nativeAdUnitComponent, "nativeAdUnitComponent");
        kotlin.jvm.internal.s.h(adSessionManager, "adSessionManager");
        this.f24455a = nativeAdUnitComponent;
        this.f24456b = adSessionManager;
    }

    public final InterfaceC3322t9 a() {
        return this.f24455a.f25267a.f27822a.f27105c;
    }

    public abstract Object a(kl.f fVar);

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object a(List list, kotlin.coroutines.jvm.internal.d dVar) {
        C3473z6 c3473z6;
        OmSdkInfo omSdkInfo;
        List list2;
        Map mapH;
        String customReferenceData;
        if (dVar instanceof C3473z6) {
            c3473z6 = (C3473z6) dVar;
            int i10 = c3473z6.f27982e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c3473z6.f27982e = i10 - Integer.MIN_VALUE;
            } else {
                c3473z6 = new C3473z6(this, dVar);
            }
        } else {
            c3473z6 = new C3473z6(this, dVar);
        }
        Object obj = c3473z6.f27980c;
        Object objF = ll.b.f();
        int i11 = c3473z6.f27982e;
        if (i11 == 0) {
            fl.s.b(obj);
            if (list.isEmpty()) {
                InterfaceC3322t9 interfaceC3322t9A = a();
                if (interfaceC3322t9A != null) {
                    ((C3348u9) interfaceC3322t9A).a("ExperienceLoader", "OMID trackers are empty");
                }
                return fl.g0.f38750a;
            }
            MetaInfo metaInfo = this.f24455a.f25267a.f27823b.f24814d;
            OmSdkInfo omsdkInfo = metaInfo != null ? metaInfo.getOmsdkInfo() : null;
            boolean z10 = omsdkInfo != null && omsdkInfo.getOmidEnabled();
            boolean omidEnabled = this.f24455a.f25267a.f27823b.f24811a.f27160b.getViewability().getOmidConfig().getOmidEnabled();
            if (z10 && omidEnabled) {
                C3432xf c3432xf = C3432xf.f27854a;
                c3473z6.f27978a = list;
                c3473z6.f27979b = omsdkInfo;
                c3473z6.f27982e = 1;
                Context context = Xi.f26021a;
                Object objJ = context == null ? "" : em.i.j(em.c1.b(), new C3380vf(context, null), c3473z6);
                if (objJ == objF) {
                    return objF;
                }
                omSdkInfo = omsdkInfo;
                obj = objJ;
                list2 = list;
            } else {
                InterfaceC3322t9 interfaceC3322t9A2 = a();
                if (interfaceC3322t9A2 != null) {
                    ((C3348u9) interfaceC3322t9A2).a("ExperienceLoader", "OMID is not enabled");
                }
                return fl.g0.f38750a;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            omSdkInfo = c3473z6.f27979b;
            List list3 = c3473z6.f27978a;
            fl.s.b(obj);
            list2 = list3;
        }
        String str = (String) obj;
        String str2 = this.f24455a.f25267a.f27823b.f24811a.f27159a.f25695e;
        InterfaceC3322t9 interfaceC3322t9A3 = a();
        if (interfaceC3322t9A3 != null) {
            ((C3348u9) interfaceC3322t9A3).a("ExperienceLoader", "OM-SDK Session Initialize Called");
        }
        AbstractC2926e1 abstractC2926e1 = this.f24456b;
        if (omSdkInfo == null || (mapH = omSdkInfo.getMacros()) == null) {
            mapH = gl.l0.h();
        }
        abstractC2926e1.a(str, list2, mapH, str2, (omSdkInfo == null || (customReferenceData = omSdkInfo.getCustomReferenceData()) == null) ? "" : customReferenceData, omSdkInfo != null && omSdkInfo.getIsolateVerificationScripts());
        return fl.g0.f38750a;
    }
}
