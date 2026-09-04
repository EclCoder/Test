package com.inmobi.media;

import com.inmobi.media.ads.network.inmobiJson.model.JsonAssetObject;
import com.inmobi.media.ads.network.inmobiJson.model.NativeImage;
import com.inmobi.media.ads.network.inmobiJson.model.NativeMedia;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Gj extends A6 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Mc f24874c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f24875d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final NativeImage f24876e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Gj(Mc nativeAdUnitComponent, AbstractC2926e1 adSessionManager) {
        NativeMedia media;
        NativeMedia media2;
        super(nativeAdUnitComponent, adSessionManager);
        kotlin.jvm.internal.s.h(nativeAdUnitComponent, "nativeAdUnitComponent");
        kotlin.jvm.internal.s.h(adSessionManager, "adSessionManager");
        this.f24874c = nativeAdUnitComponent;
        JsonAssetObject assetsObject = nativeAdUnitComponent.f25268b.getAssetsObject();
        NativeImage image = null;
        this.f24875d = (assetsObject == null || (media2 = assetsObject.getMedia()) == null) ? null : media2.getType();
        JsonAssetObject assetsObject2 = nativeAdUnitComponent.f25268b.getAssetsObject();
        if (assetsObject2 != null && (media = assetsObject2.getMedia()) != null) {
            image = media.getImage();
        }
        this.f24876e = image;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x013c, code lost:
    
        if (r11 == r1) goto L61;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.util.ArrayList] */
    @Override // com.inmobi.media.A6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(kl.f r11) {
        /*
            Method dump skipped, instruction units count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Gj.a(kl.f):java.lang.Object");
    }

    public final G6 a(Exception exc) {
        NativeImage nativeImage = this.f24876e;
        if (nativeImage != null && nativeImage.getRequired()) {
            InterfaceC3322t9 interfaceC3322t9A = a();
            if (interfaceC3322t9A != null) {
                ((C3348u9) interfaceC3322t9A).b("StaticExperienceLoader", "Static Load Failure: " + exc);
            }
            return new D6((short) 2362);
        }
        return new F6();
    }
}
