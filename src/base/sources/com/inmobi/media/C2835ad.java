package com.inmobi.media;

import android.webkit.URLUtil;
import com.iab.omid.library.inmobi.adsession.media.InteractionType;
import com.inmobi.media.ads.network.inmobiJson.model.MainLink;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.inmobi.media.ad, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C2835ad {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3274rd f26177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC2825a3 f26178b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final H4 f26179c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Vc f26180d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Zc f26181e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final InterfaceC3322t9 f26182f;

    public C2835ad(C3274rd nativeLandingPageHandler, InterfaceC2825a3 clickSession, H4 contextualDataHandler, Vc nativeBeaconProcessor, Zc nativeClickModel, InterfaceC3322t9 interfaceC3322t9) {
        kotlin.jvm.internal.s.h(nativeLandingPageHandler, "nativeLandingPageHandler");
        kotlin.jvm.internal.s.h(clickSession, "clickSession");
        kotlin.jvm.internal.s.h(contextualDataHandler, "contextualDataHandler");
        kotlin.jvm.internal.s.h(nativeBeaconProcessor, "nativeBeaconProcessor");
        kotlin.jvm.internal.s.h(nativeClickModel, "nativeClickModel");
        this.f26177a = nativeLandingPageHandler;
        this.f26178b = clickSession;
        this.f26179c = contextualDataHandler;
        this.f26180d = nativeBeaconProcessor;
        this.f26181e = nativeClickModel;
        this.f26182f = interfaceC3322t9;
    }

    public final void a(short s10) {
        InterfaceC3322t9 interfaceC3322t9 = this.f26182f;
        if (interfaceC3322t9 != null) {
            ((C3348u9) interfaceC3322t9).a("NativeClickProcessor", "onAssetClickEvent: assetType=" + ((int) s10));
        }
        if (s10 == 7) {
            InterfaceC3322t9 interfaceC3322t10 = this.f26182f;
            if (interfaceC3322t10 != null) {
                ((C3348u9) interfaceC3322t10).a("NativeClickProcessor", "Processing AD_CHOICE asset click");
            }
            a();
            return;
        }
        InterfaceC3322t9 interfaceC3322t11 = this.f26182f;
        if (interfaceC3322t11 != null) {
            ((C3348u9) interfaceC3322t11).a("NativeClickProcessor", "Processing native asset click, tracking user interaction");
        }
        this.f26179c.f();
        ((AbstractC2926e1) this.f26178b).a(InteractionType.CLICK);
        b(s10);
    }

    public final void b(short s10) {
        List list;
        Zc zc2 = this.f26181e;
        Cl cl2 = zc2.f26138a;
        ArrayList arrayListA = null;
        String str = cl2 != null ? cl2.f24625a : null;
        List listA = Yc.a(zc2);
        InterfaceC3322t9 interfaceC3322t9 = this.f26182f;
        if (interfaceC3322t9 != null) {
            ((C3348u9) interfaceC3322t9).a("NativeClickProcessor", "processNativeAssetClick: assetId=" + ((int) s10) + ", VAST clickThroughUrl=" + str + ", VAST trackers count=" + listA.size());
        }
        if (!K3.a(str)) {
            InterfaceC3322t9 interfaceC3322t10 = this.f26182f;
            if (interfaceC3322t10 != null) {
                ((C3348u9) interfaceC3322t10).a("NativeClickProcessor", "VAST URL is not a network URL, using response asset click URL");
            }
            Zc zc3 = this.f26181e;
            kotlin.jvm.internal.s.h(zc3, "<this>");
            Sc sc2 = (Sc) zc3.f26139b.f25126a.get(Short.valueOf(s10));
            String str2 = sc2 != null ? sc2.f25686a : null;
            Zc zc4 = this.f26181e;
            kotlin.jvm.internal.s.h(zc4, "<this>");
            Sc sc3 = (Sc) zc4.f26139b.f25126a.get(Short.valueOf(s10));
            if (sc3 != null && (list = sc3.f25687b) != null) {
                arrayListA = D4.a(CampaignEx.JSON_NATIVE_VIDEO_CLICK, list);
            }
            List listL = arrayListA == null ? gl.r.l() : arrayListA;
            InterfaceC3322t9 interfaceC3322t11 = this.f26182f;
            if (interfaceC3322t11 != null) {
                ((C3348u9) interfaceC3322t11).a("NativeClickProcessor", "Response asset URL=" + str2 + ", trackers count=" + listL.size());
            }
            str = str2;
            listA = listL;
        }
        a((short) 0, str, listA);
    }

    public final void a(AbstractC3066jc mediaEvent) {
        kotlin.jvm.internal.s.h(mediaEvent, "mediaEvent");
        InterfaceC3322t9 interfaceC3322t9 = this.f26182f;
        if (interfaceC3322t9 != null) {
            String strK = kotlin.jvm.internal.l0.b(mediaEvent.getClass()).k();
            kotlin.jvm.internal.s.h(mediaEvent, "<this>");
            ((C3348u9) interfaceC3322t9).a("NativeClickProcessor", "processIfMediaClickEvent: mediaEvent type=" + strK + ", isClickEvent=" + ((mediaEvent instanceof C3486zj) || (mediaEvent instanceof C2973fm) || (mediaEvent instanceof U3)));
        }
        kotlin.jvm.internal.s.h(mediaEvent, "<this>");
        boolean z10 = mediaEvent instanceof C3486zj;
        if (z10 || (mediaEvent instanceof C2973fm) || (mediaEvent instanceof U3)) {
            InterfaceC3322t9 interfaceC3322t10 = this.f26182f;
            if (interfaceC3322t10 != null) {
                ((C3348u9) interfaceC3322t10).a("NativeClickProcessor", "Media click event detected, tracking user interaction");
            }
            this.f26179c.f();
            ((AbstractC2926e1) this.f26178b).a(InteractionType.CLICK);
            if (z10) {
                InterfaceC3322t9 interfaceC3322t11 = this.f26182f;
                if (interfaceC3322t11 != null) {
                    ((C3348u9) interfaceC3322t11).a("NativeClickProcessor", "Processing StaticClick event");
                }
                a((C3486zj) mediaEvent);
                return;
            }
            if (mediaEvent instanceof C2973fm) {
                InterfaceC3322t9 interfaceC3322t12 = this.f26182f;
                if (interfaceC3322t12 != null) {
                    ((C3348u9) interfaceC3322t12).a("NativeClickProcessor", "Processing VideoClick event");
                }
                b();
                return;
            }
            if (mediaEvent instanceof U3) {
                InterfaceC3322t9 interfaceC3322t13 = this.f26182f;
                if (interfaceC3322t13 != null) {
                    ((C3348u9) interfaceC3322t13).a("NativeClickProcessor", "Processing CompanionClick event");
                }
                a((U3) mediaEvent);
                return;
            }
            InterfaceC3322t9 interfaceC3322t14 = this.f26182f;
            if (interfaceC3322t14 != null) {
                ((C3348u9) interfaceC3322t14).a("NativeClickProcessor", "Unknown media event type, ignoring");
            }
        }
    }

    public final void b() {
        Zc zc2 = this.f26181e;
        Cl cl2 = zc2.f26138a;
        String str = cl2 != null ? cl2.f24625a : null;
        List listA = Yc.a(zc2);
        InterfaceC3322t9 interfaceC3322t9 = this.f26182f;
        if (interfaceC3322t9 != null) {
            ((C3348u9) interfaceC3322t9).a("NativeClickProcessor", "processVideoClickEvent: VAST clickThroughUrl=" + str + ", trackers count=" + listA.size());
        }
        a((short) 0, str, listA);
    }

    public final void a() {
        Zc zc2 = this.f26181e;
        kotlin.jvm.internal.s.h(zc2, "<this>");
        Sc sc2 = (Sc) zc2.f26139b.f25126a.get((short) 7);
        String str = sc2 != null ? sc2.f25686a : null;
        InterfaceC3322t9 interfaceC3322t9 = this.f26182f;
        if (interfaceC3322t9 != null) {
            ((C3348u9) interfaceC3322t9).a("NativeClickProcessor", "processAdChoiceAssetClick: url=" + str + ", isNetworkUrl=" + (str != null ? Boolean.valueOf(URLUtil.isNetworkUrl(str)) : null));
        }
        if (str != null && URLUtil.isNetworkUrl(str)) {
            this.f26177a.b(str, null);
            return;
        }
        InterfaceC3322t9 interfaceC3322t10 = this.f26182f;
        if (interfaceC3322t10 != null) {
            ((C3348u9) interfaceC3322t10).a("NativeClickProcessor", "AdChoice URL is null or not a network URL, skipping");
        }
    }

    public final void a(C3486zj c3486zj) {
        Zc zc2 = this.f26181e;
        Cl cl2 = zc2.f26138a;
        String str = cl2 != null ? cl2.f24625a : null;
        List listA = Yc.a(zc2);
        InterfaceC3322t9 interfaceC3322t9 = this.f26182f;
        if (interfaceC3322t9 != null) {
            ((C3348u9) interfaceC3322t9).a("NativeClickProcessor", "processStaticClickEvent: VAST clickThroughUrl=" + str);
        }
        List list = listA;
        if (!K3.a(str)) {
            InterfaceC3322t9 interfaceC3322t10 = this.f26182f;
            if (interfaceC3322t10 != null) {
                ((C3348u9) interfaceC3322t10).a("NativeClickProcessor", "VAST URL is not a network URL, using static click URL");
            }
            str = c3486zj.f28031a;
            ArrayList arrayList = c3486zj.f28032b;
            InterfaceC3322t9 interfaceC3322t11 = this.f26182f;
            list = arrayList;
            if (interfaceC3322t11 != null) {
                ((C3348u9) interfaceC3322t11).a("NativeClickProcessor", "Static click URL=" + str + ", trackers count=" + arrayList.size());
                list = arrayList;
            }
        }
        a((short) 0, str, list);
    }

    public final void a(U3 u10) {
        Cl cl2 = this.f26181e.f26138a;
        String str = cl2 != null ? cl2.f24625a : null;
        ArrayList arrayList = u10.f25804a;
        boolean zIsEmpty = arrayList.isEmpty();
        List listA = arrayList;
        if (zIsEmpty) {
            listA = Yc.a(this.f26181e);
        }
        InterfaceC3322t9 interfaceC3322t9 = this.f26182f;
        if (interfaceC3322t9 != null) {
            ((C3348u9) interfaceC3322t9).a("NativeClickProcessor", "processCompanionClick: VAST clickThroughUrl=" + str + ", companion trackers count=" + u10.f25804a.size() + ", using VAST trackers=" + u10.f25804a.isEmpty());
        }
        a((short) 1, str, listA);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void a(short s10, String str, List list) {
        List list2;
        InterfaceC3322t9 interfaceC3322t9 = this.f26182f;
        if (interfaceC3322t9 != null) {
            ((C3348u9) interfaceC3322t9).a("NativeClickProcessor", "processAssetData: assetType=" + ((int) s10) + ", url=" + str + ", assetTrackers count=" + list.size());
        }
        Zc zc2 = this.f26181e;
        kotlin.jvm.internal.s.h(zc2, "<this>");
        ArrayList arrayListA = D4.a(CampaignEx.JSON_NATIVE_VIDEO_CLICK, zc2.f26139b.f25128c);
        List listS0 = gl.r.s0(list, arrayListA);
        InterfaceC3322t9 interfaceC3322t10 = this.f26182f;
        if (interfaceC3322t10 != null) {
            ((C3348u9) interfaceC3322t10).a("NativeClickProcessor", "Response click trackers count=" + arrayListA.size() + ", combined trackers count=" + listS0.size());
        }
        String fallbackUrl = null;
        if (K3.a(str)) {
            list2 = listS0;
        } else {
            InterfaceC3322t9 interfaceC3322t11 = this.f26182f;
            if (interfaceC3322t11 != null) {
                ((C3348u9) interfaceC3322t11).a("NativeClickProcessor", "URL is not a network URL, using main link from response");
            }
            MainLink mainLink = this.f26181e.f26139b.f25127b;
            str = mainLink != null ? mainLink.getUrl() : null;
            MainLink mainLink2 = this.f26181e.f26139b.f25127b;
            fallbackUrl = mainLink2 != null ? mainLink2.getFallbackUrl() : null;
            InterfaceC3322t9 interfaceC3322t12 = this.f26182f;
            list2 = arrayListA;
            if (interfaceC3322t12 != null) {
                ((C3348u9) interfaceC3322t12).a("NativeClickProcessor", "Main link URL=" + str + ", fallbackUrl=" + fallbackUrl);
            }
        }
        if (str == null) {
            InterfaceC3322t9 interfaceC3322t13 = this.f26182f;
            if (interfaceC3322t13 == null) {
                list2 = arrayListA;
                return;
            } else {
                list2 = arrayListA;
                ((C3348u9) interfaceC3322t13).a("NativeClickProcessor", "Final URL is null, skipping click processing");
                return;
            }
        }
        InterfaceC3322t9 interfaceC3322t14 = this.f26182f;
        if (interfaceC3322t14 != null) {
            list2 = arrayListA;
            ((C3348u9) interfaceC3322t14).a("NativeClickProcessor", "Handling click: finalUrl=" + str + ", fallbackUrl=" + fallbackUrl + ", firing " + list2.size() + " beacons");
        }
        list2 = arrayListA;
        this.f26177a.b(str, fallbackUrl);
        this.f26180d.a(s10, list2);
    }
}
