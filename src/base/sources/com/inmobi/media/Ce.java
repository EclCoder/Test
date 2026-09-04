package com.inmobi.media;

import android.content.Context;
import com.inmobi.media.Ce;
import com.inmobi.media.ads.network.common.model.LandingPageParam;
import com.inmobi.media.ads.network.common.model.MetaInfo;
import com.inmobi.media.ads.network.inmobiJson.model.CTA;
import com.inmobi.media.ads.network.inmobiJson.model.Description;
import com.inmobi.media.ads.network.inmobiJson.model.Icon;
import com.inmobi.media.ads.network.inmobiJson.model.Image;
import com.inmobi.media.ads.network.inmobiJson.model.InMobiJsonResponse;
import com.inmobi.media.ads.network.inmobiJson.model.JsonAssetObject;
import com.inmobi.media.ads.network.inmobiJson.model.Link;
import com.inmobi.media.ads.network.inmobiJson.model.NativeImage;
import com.inmobi.media.ads.network.inmobiJson.model.NativeMedia;
import com.inmobi.media.ads.network.inmobiJson.model.NativeVideo;
import com.inmobi.media.ads.network.inmobiJson.model.Title;
import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Ce extends AbstractC3441y {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Fi f24597b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C2865bh f24598c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final H4 f24599d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AbstractC2926e1 f24600e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Vc f24601f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Mc f24602g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final em.o0 f24603h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final fl.k f24604i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final fl.k f24605j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final fl.k f24606k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final fl.k f24607l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final fl.k f24608m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final fl.k f24609n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final fl.k f24610o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final fl.k f24611p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ce(Fi renderedStateCache, C2865bh publisherNativeViewData, H4 contextualDataHandler, AbstractC2926e1 adSessionManager, Vc nativeBeaconProcessor, Mc nativeAdUnitComponent) {
        super(nativeAdUnitComponent.f25267a);
        kotlin.jvm.internal.s.h(renderedStateCache, "renderedStateCache");
        kotlin.jvm.internal.s.h(publisherNativeViewData, "publisherNativeViewData");
        kotlin.jvm.internal.s.h(contextualDataHandler, "contextualDataHandler");
        kotlin.jvm.internal.s.h(adSessionManager, "adSessionManager");
        kotlin.jvm.internal.s.h(nativeBeaconProcessor, "nativeBeaconProcessor");
        kotlin.jvm.internal.s.h(nativeAdUnitComponent, "nativeAdUnitComponent");
        this.f24597b = renderedStateCache;
        this.f24598c = publisherNativeViewData;
        this.f24599d = contextualDataHandler;
        this.f24600e = adSessionManager;
        this.f24601f = nativeBeaconProcessor;
        this.f24602g = nativeAdUnitComponent;
        this.f24603h = T4.a(k());
        this.f24604i = fl.l.b(new tl.a() { // from class: yh.u0
            @Override // tl.a
            public final Object invoke() {
                return Ce.g(this.f57950a);
            }
        });
        this.f24605j = fl.l.b(new tl.a() { // from class: yh.v0
            @Override // tl.a
            public final Object invoke() {
                return Ce.c(this.f57965a);
            }
        });
        this.f24606k = fl.l.b(new tl.a() { // from class: yh.w0
            @Override // tl.a
            public final Object invoke() {
                return Ce.e(this.f57982a);
            }
        });
        this.f24607l = fl.l.b(new tl.a() { // from class: yh.x0
            @Override // tl.a
            public final Object invoke() {
                return Ce.h(this.f57996a);
            }
        });
        this.f24608m = fl.l.b(new tl.a() { // from class: yh.y0
            @Override // tl.a
            public final Object invoke() {
                return Ce.b(this.f58012a);
            }
        });
        this.f24609n = fl.l.b(new tl.a() { // from class: yh.z0
            @Override // tl.a
            public final Object invoke() {
                return Ce.a(this.f58034a);
            }
        });
        this.f24610o = fl.l.b(new tl.a() { // from class: yh.a1
            @Override // tl.a
            public final Object invoke() {
                return Ce.f(this.f57591a);
            }
        });
        this.f24611p = fl.l.b(new tl.a() { // from class: yh.b1
            @Override // tl.a
            public final Object invoke() {
                return Ce.d(this.f57610a);
            }
        });
    }

    public static final Ai a(Ce ce2) {
        return new Ai(ce2.f24599d, ce2.f24600e, ce2.f24602g);
    }

    public static final C2835ad b(Ce ce2) {
        Mc mc2 = ce2.f24602g;
        AbstractC2926e1 clickSession = ce2.f24600e;
        H4 contextualDataHandler = ce2.f24599d;
        Vc nativeBeaconProcessor = ce2.f24601f;
        C3274rd nativeLandingPageHandler = (C3274rd) ce2.f24611p.getValue();
        InterfaceC3322t9 interfaceC3322t9L = ce2.l();
        kotlin.jvm.internal.s.h(mc2, "<this>");
        kotlin.jvm.internal.s.h(clickSession, "clickSession");
        kotlin.jvm.internal.s.h(contextualDataHandler, "contextualDataHandler");
        kotlin.jvm.internal.s.h(nativeBeaconProcessor, "nativeBeaconProcessor");
        kotlin.jvm.internal.s.h(nativeLandingPageHandler, "nativeLandingPageHandler");
        kotlin.jvm.internal.s.h(mc2, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        JsonAssetObject assetsObject = mc2.f25268b.getAssetsObject();
        if (assetsObject != null) {
            Title title = assetsObject.getTitle();
            if (title != null) {
                Link link = title.getLink();
                linkedHashMap.put((short) 3, new Sc(link != null ? link.getUrl() : null, title.getTrackers()));
            }
            Description description = assetsObject.getDescription();
            if (description != null) {
                Link link2 = description.getLink();
                linkedHashMap.put((short) 4, new Sc(link2 != null ? link2.getUrl() : null, description.getTrackers()));
            }
            Icon icon = assetsObject.getIcon();
            if (icon != null) {
                Link link3 = icon.getLink();
                linkedHashMap.put((short) 5, new Sc(link3 != null ? link3.getUrl() : null, icon.getTrackers()));
            }
            CTA cta = assetsObject.getCta();
            if (cta != null) {
                Link link4 = cta.getLink();
                linkedHashMap.put((short) 6, new Sc(link4 != null ? link4.getUrl() : null, cta.getTrackers()));
            }
            Image adChoice = assetsObject.getAdChoice();
            if (adChoice != null) {
                Link link5 = adChoice.getLink();
                linkedHashMap.put((short) 7, new Sc(link5 != null ? link5.getUrl() : null, adChoice.getTrackers()));
            } else {
                linkedHashMap.put((short) 7, new Sc(mc2.f25267a.f27823b.f24811a.f27160b.getNative().getAdChoiceConfig().getLink(), gl.r.l()));
            }
        }
        return new C2835ad(nativeLandingPageHandler, clickSession, contextualDataHandler, nativeBeaconProcessor, new Zc(mc2.f25271e, new Ki(linkedHashMap, mc2.f25268b.getMainLink(), mc2.f25267a.f27823b.f24817g)), interfaceC3322t9L);
    }

    public static final C3171nd c(Ce ce2) {
        em.o0 o0Var = ce2.f24603h;
        Ln ln2 = (Ln) ce2.f24604i.getValue();
        Mc mc2 = ce2.f24602g;
        kotlin.jvm.internal.s.h(mc2, "<this>");
        AdConfig.NativeViewabilityConfig viewabilityConfig = mc2.f25267a.f27823b.f24811a.f27160b.getNative().getViewabilityConfig();
        F f10 = mc2.f25267a.f27823b.f24823m;
        On on2 = new On(viewabilityConfig.getImpressionConfig().getPollInterval(), f10.f24742d, AbstractC3463yl.a(viewabilityConfig.getParentMinDimension().getDimensions()), f10.f24741c);
        hm.w wVar = ((Po) ce2.f24607l.getValue()).f25518b;
        ce2.l();
        return new C3171nd(o0Var, ln2, on2, wVar);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002b  */
    public static final C3274rd d(Ce ce2) {
        boolean z10;
        String creativeType;
        String openMode;
        List<LandingPageParam> landingPageParams;
        LandingPageParam landingPageParam;
        List<LandingPageParam> landingPageParams2;
        LandingPageParam landingPageParam2;
        Context context = ce2.f24602g.f25267a.f27822a.f27104b;
        G g10 = ce2.f27890a.f27823b;
        MetaInfo metaInfo = g10.f24814d;
        if (metaInfo != null && (landingPageParams2 = metaInfo.getLandingPageParams()) != null && (landingPageParam2 = (LandingPageParam) gl.r.e0(landingPageParams2, 0)) != null) {
            z10 = landingPageParam2.getSupportLockScreen();
        }
        G g11 = ce2.f27890a.f27823b;
        Sg sg2 = g11.f24811a.f27159a;
        long j10 = sg2.f25691a;
        String str = g11.f24823m.f24740b;
        String str2 = sg2.f25697g;
        String str3 = g11.f24813c;
        MetaInfo metaInfo2 = g11.f24814d;
        if (metaInfo2 == null || (creativeType = metaInfo2.getCreativeType()) == null) {
            creativeType = "unknown";
        }
        String str4 = creativeType;
        String str5 = ce2.f24602g.f25267a.f27823b.f24819i;
        if (str5 == null) {
            str5 = "";
        }
        String str6 = str5;
        G g12 = ce2.f27890a.f27823b;
        boolean z11 = g12.f24812b.f24631a;
        MetaInfo metaInfo3 = g12.f24814d;
        if (metaInfo3 == null || (landingPageParams = metaInfo3.getLandingPageParams()) == null || (landingPageParam = (LandingPageParam) gl.r.e0(landingPageParams, 0)) == null || (openMode = landingPageParam.getOpenMode()) == null) {
            openMode = "DEFAULT";
        }
        return new C3274rd(new C3300sd(context, g10, z10, new C3014hb(j10, str, str2, "native", str3, str4, str6, z11, openMode), (Lc) ce2.f24602g.f25272f.getValue(), ce2.f24602g.f25269c, ce2.l()));
    }

    public static final Nd e(Ce ce2) {
        AbstractC2912dc o10;
        NativeMedia media;
        NativeVideo video;
        em.o0 o0Var = ce2.f24603h;
        Mc mc2 = ce2.f24602g;
        Ln viewHolderConfig = (Ln) ce2.f24604i.getValue();
        kotlin.jvm.internal.s.h(mc2, "<this>");
        kotlin.jvm.internal.s.h(viewHolderConfig, "viewHolderConfig");
        E e10 = mc2.f25267a.f27823b.f24824n;
        InMobiJsonResponse inMobiJsonResponse = mc2.f25268b;
        kotlin.jvm.internal.s.h(inMobiJsonResponse, "<this>");
        JsonAssetObject assetsObject = inMobiJsonResponse.getAssetsObject();
        if ((assetsObject == null || (media = assetsObject.getMedia()) == null || (video = media.getVideo()) == null) ? false : video.getRequired()) {
            o10 = new C2948en(((C3325tc) mc2.f25273g.getValue()).f27545e, e10.f24681a);
        } else {
            AdConfig.NativeViewabilityConfig viewabilityConfig = mc2.f25267a.f27823b.f24811a.f27160b.getNative().getViewabilityConfig();
            o10 = new O5(viewHolderConfig, new On(viewabilityConfig.getImpressionConfig().getPollInterval(), e10.f24682b, AbstractC3463yl.a(viewabilityConfig.getParentMinDimension().getDimensions()), e10.f24681a));
        }
        return new Nd(o0Var, o10, ((Po) ce2.f24607l.getValue()).f25518b);
    }

    public static final C2917dh f(Ce ce2) {
        ce2.getClass();
        return new C2917dh();
    }

    public static final Ln g(Ce ce2) {
        NativeMedia media;
        NativeImage image;
        Icon icon;
        NativeMedia media2;
        NativeVideo video;
        NativeMedia media3;
        NativeMedia media4;
        Mc mc2 = ce2.f24602g;
        C2865bh publisherNativeViewData = ce2.f24598c;
        kotlin.jvm.internal.s.h(mc2, "<this>");
        kotlin.jvm.internal.s.h(publisherNativeViewData, "publisherNativeViewData");
        AdConfig.NativeConfig nativeConfig = mc2.f25267a.f27823b.f24811a.f27160b.getNative();
        JsonAssetObject assetsObject = mc2.f25268b.getAssetsObject();
        Boolean boolValueOf = null;
        String type = (assetsObject == null || (media4 = assetsObject.getMedia()) == null) ? null : media4.getType();
        InMobiJsonResponse inMobiJsonResponse = mc2.f25268b;
        kotlin.jvm.internal.s.h(inMobiJsonResponse, "<this>");
        JsonAssetObject assetsObject2 = inMobiJsonResponse.getAssetsObject();
        if (kotlin.jvm.internal.s.c((assetsObject2 == null || (media3 = assetsObject2.getMedia()) == null) ? null : media3.getType(), MimeTypes.BASE_TYPE_VIDEO)) {
            JsonAssetObject assetsObject3 = inMobiJsonResponse.getAssetsObject();
            if (assetsObject3 != null && (media2 = assetsObject3.getMedia()) != null && (video = media2.getVideo()) != null) {
                boolValueOf = Boolean.valueOf(video.getRequired());
            }
        } else {
            JsonAssetObject assetsObject4 = inMobiJsonResponse.getAssetsObject();
            if (assetsObject4 != null && (media = assetsObject4.getMedia()) != null && (image = media.getImage()) != null) {
                boolValueOf = Boolean.valueOf(image.getRequired());
            }
        }
        boolean required = false;
        boolean zBooleanValue = boolValueOf != null ? boolValueOf.booleanValue() : false;
        if (kotlin.jvm.internal.s.c(type, MimeTypes.BASE_TYPE_VIDEO)) {
            if (!zBooleanValue) {
                required = true;
            }
        } else if (assetsObject != null && (icon = assetsObject.getIcon()) != null) {
            required = icon.getRequired();
        }
        return new Ln(required, zBooleanValue, AbstractC3463yl.a(nativeConfig.getViewabilityConfig().getIconMinDimension().getDimensions()), AbstractC3463yl.a(nativeConfig.getViewabilityConfig().getMediaMinDimension().getDimensions()), publisherNativeViewData);
    }

    public static final Po h(Ce ce2) {
        return new Po(ce2.f27890a.f27823b.f24811a.f27160b.getViewability().getWindowPollingInterval(), ce2.f24603h, ce2.f24598c.f26265a.getParentView(), ce2.l());
    }
}
