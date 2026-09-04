package com.inmobi.media;

import com.google.firebase.installations.ktx.gUsI.dmHT;
import com.inmobi.media.ads.nativeAd.MediaView;
import com.inmobi.media.ads.network.common.model.TrackingInfo;
import com.inmobi.media.ads.network.inmobiJson.model.JsonAssetObject;
import com.inmobi.media.ads.network.inmobiJson.model.NativeMedia;
import com.inmobi.media.ads.network.inmobiJson.model.NativeVideo;
import com.inmobi.media.ads.network.inmobiJson.model.VideoExperience;
import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.inmobi.media.nm, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public final class C3180nm extends A6 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Mc f27076c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f27077d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final NativeVideo f27078e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3180nm(Mc nativeAdUnitComponent, AbstractC2926e1 adSessionManager) {
        super(nativeAdUnitComponent, adSessionManager);
        kotlin.jvm.internal.s.h(nativeAdUnitComponent, "nativeAdUnitComponent");
        kotlin.jvm.internal.s.h(adSessionManager, "adSessionManager");
        this.f27076c = nativeAdUnitComponent;
        JsonAssetObject assetsObject = nativeAdUnitComponent.f25268b.getAssetsObject();
        NativeMedia media = assetsObject != null ? assetsObject.getMedia() : null;
        this.f27077d = media != null ? media.getType() : null;
        this.f27078e = media != null ? media.getVideo() : null;
    }

    /* JADX WARN: Code duplicated, block: B:67:0x0168  */
    /* JADX WARN: Code duplicated, block: B:72:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:73:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:79:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:83:0x021d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:85:0x0175 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x0166 A[SYNTHETIC] */
    @Override // com.inmobi.media.A6
    public final Object a(kl.f fVar) {
        C3102km c3102km;
        Hl hl2;
        ArrayList arrayList;
        ArrayList arrayList2;
        int size;
        JsonAssetObject assetsObject;
        NativeMedia media;
        List<TrackingInfo> listL;
        Object objA;
        NativeVideo video;
        Object obj;
        if (fVar instanceof C3102km) {
            c3102km = (C3102km) fVar;
            int i10 = c3102km.f26871d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c3102km.f26871d = i10 - Integer.MIN_VALUE;
            } else {
                c3102km = new C3102km(this, (kotlin.coroutines.jvm.internal.d) fVar);
            }
        } else {
            c3102km = new C3102km(this, (kotlin.coroutines.jvm.internal.d) fVar);
        }
        Object objA2 = c3102km.f26869b;
        Object objF = ll.b.f();
        int i11 = c3102km.f26871d;
        int i12 = 0;
        if (i11 == 0) {
            fl.s.b(objA2);
            InterfaceC3322t9 interfaceC3322t9A = a();
            if (interfaceC3322t9A != null) {
                ((C3348u9) interfaceC3322t9A).a("VideoExperienceLoader", "load called - mediaType: " + this.f27077d);
            }
            if (!kotlin.jvm.internal.s.c(this.f27077d, MimeTypes.BASE_TYPE_VIDEO)) {
                InterfaceC3322t9 interfaceC3322t9A2 = a();
                if (interfaceC3322t9A2 != null) {
                    ((C3348u9) interfaceC3322t9A2).b("VideoExperienceLoader", "Invalid Media Type - expected VIDEO, got: " + this.f27077d);
                }
                return new F6();
            }
            NativeVideo nativeVideo = this.f27078e;
            if (nativeVideo == null) {
                InterfaceC3322t9 interfaceC3322t9A3 = a();
                if (interfaceC3322t9A3 != null) {
                    ((C3348u9) interfaceC3322t9A3).b("VideoExperienceLoader", "Invalid Native Video - nativeVideo is null");
                }
                return new D6((short) 2361);
            }
            ArrayList arrayListA = D4.a(dmHT.JkhdybJTtogoOBj, nativeVideo.getTrackers());
            String vastTag = this.f27078e.getVastTag();
            c3102km.f26871d = 1;
            objA2 = a(vastTag, arrayListA, c3102km);
            if (objA2 != objF) {
            }
            return objF;
        }
        if (i11 == 1) {
            fl.s.b(objA2);
        } else {
            if (i11 != 2) {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                fl.s.b(objA2);
                return objA2;
            }
            hl2 = c3102km.f26868a;
            fl.s.b(objA2);
        }
        String str = hl2.f24957a;
        String str2 = hl2.f24958b;
        int iA = AbstractC2844am.a(hl2.f24961e);
        arrayList = hl2.f24959c;
        arrayList2 = new ArrayList();
        size = arrayList.size();
        while (i12 < size) {
            obj = arrayList.get(i12);
            i12++;
            if (!(((De) obj) instanceof Hf)) {
                arrayList2.add(obj);
            }
        }
        Bl vastBeaconData = new Bl(str, str2, iA, arrayList2);
        String str3 = hl2.f24961e;
        ArrayList arrayList3 = hl2.f24962f;
        ArrayList arrayList4 = hl2.f24963g;
        AdConfig.VastVideoConfig vastVideo = this.f27076c.f25267a.f27823b.f24811a.f27160b.getVastVideo();
        VideoExperience experience = this.f27078e.getExperience();
        C3211p1 c3211p1 = this.f27076c.f25267a.f27823b.f24811a;
        C3026hn c3026hn = new C3026hn(c3211p1.f27159a.f25696f, experience, c3211p1.f27160b.getNative());
        Mc mc2 = this.f27076c;
        kotlin.jvm.internal.s.h(mc2, "<this>");
        kotlin.jvm.internal.s.h(vastBeaconData, "vastBeaconData");
        C2874c0 c2874c0 = mc2.f25267a.f27822a.f27106d;
        kotlin.jvm.internal.s.h(mc2, "<this>");
        assetsObject = mc2.f25268b.getAssetsObject();
        if (assetsObject != null) {
            media = assetsObject.getMedia();
        } else {
            media = null;
        }
        if (media != null || (video = media.getVideo()) == null || (listL = video.getTrackers()) == null) {
            listL = gl.r.l();
        }
        Gm gm2 = new Gm(str3, arrayList3, arrayList4, vastVideo, c3026hn, new C2922dm(vastBeaconData, c2874c0, new C3440xn(listL)), new Hn(this.f27076c.f25267a.f27823b), new Z3(this.f27076c.f25267a.f27823b));
        c3102km.f26868a = null;
        c3102km.f26871d = 3;
        objA = a(vastBeaconData, gm2, c3102km);
        if (objA != objF) {
            return objF;
        }
        return objA;
        hl2 = (Hl) objA2;
        if (hl2 == null) {
            NativeVideo nativeVideo2 = this.f27078e;
            if (!(nativeVideo2 != null ? nativeVideo2.getRequired() : false)) {
                return new F6();
            }
            InterfaceC3322t9 interfaceC3322t9A4 = a();
            if (interfaceC3322t9A4 != null) {
                ((C3348u9) interfaceC3322t9A4).b("VideoExperienceLoader", "Vast Parse Failure - Video Required");
            }
            return new D6((short) 2360);
        }
        Mc mc3 = this.f27076c;
        String str4 = hl2.f24960d;
        ArrayList arrayList5 = hl2.f24959c;
        ArrayList arrayList6 = new ArrayList();
        int size2 = arrayList5.size();
        int i13 = 0;
        while (i13 < size2) {
            Object obj2 = arrayList5.get(i13);
            i13++;
            if (kotlin.jvm.internal.s.c(((De) obj2).f24653b, CampaignEx.JSON_NATIVE_VIDEO_CLICK)) {
                arrayList6.add(obj2);
            }
        }
        mc3.f25271e = new Cl(str4, arrayList6);
        ArrayList arrayList7 = hl2.f24959c;
        ArrayList arrayList8 = new ArrayList();
        int size3 = arrayList7.size();
        int i14 = 0;
        while (i14 < size3) {
            Object obj3 = arrayList7.get(i14);
            i14++;
            if (obj3 instanceof Hf) {
                arrayList8.add(obj3);
            }
        }
        c3102km.f26868a = hl2;
        c3102km.f26871d = 2;
        if (a(arrayList8, c3102km) != objF) {
            String str5 = hl2.f24957a;
            String str6 = hl2.f24958b;
            int iA2 = AbstractC2844am.a(hl2.f24961e);
            arrayList = hl2.f24959c;
            arrayList2 = new ArrayList();
            size = arrayList.size();
            while (i12 < size) {
                obj = arrayList.get(i12);
                i12++;
                if (!(((De) obj) instanceof Hf)) {
                    arrayList2.add(obj);
                }
            }
            Bl vastBeaconData2 = new Bl(str5, str6, iA2, arrayList2);
            String str7 = hl2.f24961e;
            ArrayList arrayList9 = hl2.f24962f;
            ArrayList arrayList10 = hl2.f24963g;
            AdConfig.VastVideoConfig vastVideo2 = this.f27076c.f25267a.f27823b.f24811a.f27160b.getVastVideo();
            VideoExperience experience2 = this.f27078e.getExperience();
            C3211p1 c3211p2 = this.f27076c.f25267a.f27823b.f24811a;
            C3026hn c3026hn2 = new C3026hn(c3211p2.f27159a.f25696f, experience2, c3211p2.f27160b.getNative());
            Mc mc4 = this.f27076c;
            kotlin.jvm.internal.s.h(mc4, "<this>");
            kotlin.jvm.internal.s.h(vastBeaconData2, "vastBeaconData");
            C2874c0 c2874c1 = mc4.f25267a.f27822a.f27106d;
            kotlin.jvm.internal.s.h(mc4, "<this>");
            assetsObject = mc4.f25268b.getAssetsObject();
            if (assetsObject != null) {
                media = assetsObject.getMedia();
            } else {
                media = null;
            }
            if (media != null) {
                listL = gl.r.l();
            } else {
                listL = gl.r.l();
            }
            Gm gm3 = new Gm(str7, arrayList9, arrayList10, vastVideo2, c3026hn2, new C2922dm(vastBeaconData2, c2874c1, new C3440xn(listL)), new Hn(this.f27076c.f25267a.f27823b), new Z3(this.f27076c.f25267a.f27823b));
            c3102km.f26868a = null;
            c3102km.f26871d = 3;
            objA = a(vastBeaconData2, gm3, c3102km);
            if (objA != objF) {
                return objA;
            }
        }
        return objF;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, ArrayList arrayList, kotlin.coroutines.jvm.internal.d dVar) {
        C3154mm c3154mm;
        if (dVar instanceof C3154mm) {
            c3154mm = (C3154mm) dVar;
            int i10 = c3154mm.f27012c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c3154mm.f27012c = i10 - Integer.MIN_VALUE;
            } else {
                c3154mm = new C3154mm(this, dVar);
            }
        } else {
            c3154mm = new C3154mm(this, dVar);
        }
        Object objA = c3154mm.f27010a;
        Object objF = ll.b.f();
        int i11 = c3154mm.f27012c;
        try {
            if (i11 == 0) {
                fl.s.b(objA);
                InterfaceC3322t9 interfaceC3322t9A = a();
                if (interfaceC3322t9A != null) {
                    ((C3348u9) interfaceC3322t9A).a("VideoExperienceLoader", "parseVastTag - processing VAST tag with " + arrayList.size() + " error URLs");
                }
                Zl zl2 = Zl.f26154a;
                C3416x c3416x = this.f27076c.f25267a;
                c3154mm.f27012c = 1;
                objA = zl2.a(str, c3416x, arrayList, c3154mm);
                if (objA == objF) {
                    return objF;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                fl.s.b(objA);
            }
            return (Hl) objA;
        } catch (Kl e10) {
            InterfaceC3322t9 interfaceC3322t9A2 = a();
            if (interfaceC3322t9A2 == null) {
                return null;
            }
            ((C3348u9) interfaceC3322t9A2).b("VideoExperienceLoader", "parseVastTag - VAST parse exception: " + e10.getMessage());
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Bl bl2, Gm gm2, kotlin.coroutines.jvm.internal.d dVar) {
        C3128lm c3128lm;
        if (dVar instanceof C3128lm) {
            c3128lm = (C3128lm) dVar;
            int i10 = c3128lm.f26965d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c3128lm.f26965d = i10 - Integer.MIN_VALUE;
            } else {
                c3128lm = new C3128lm(this, dVar);
            }
        } else {
            c3128lm = new C3128lm(this, dVar);
        }
        Object objA = c3128lm.f26963b;
        Object objF = ll.b.f();
        int i11 = c3128lm.f26965d;
        try {
            if (i11 == 0) {
                fl.s.b(objA);
                C3325tc c3325tc = (C3325tc) this.f27076c.f25273g.getValue();
                InterfaceC3322t9 interfaceC3322t9A = a();
                if (interfaceC3322t9A != null) {
                    ((C3348u9) interfaceC3322t9A).a("VideoExperienceLoader", "onPrepareExperienceModelSuccess - loading video experience");
                }
                c3128lm.f26962a = bl2;
                c3128lm.f26965d = 1;
                objA = c3325tc.a(gm2, c3128lm);
                if (objA == objF) {
                    return objF;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bl2 = c3128lm.f26962a;
                fl.s.b(objA);
            }
            return new E6((MediaView) objA, bl2);
        } catch (Exception e10) {
            InterfaceC3322t9 interfaceC3322t9A2 = a();
            if (interfaceC3322t9A2 != null) {
                ((C3348u9) interfaceC3322t9A2).b("VideoExperienceLoader", "onPrepareExperienceModelSuccess - exception during media load: " + e10.getMessage());
            }
            return a(e10, bl2);
        }
    }

    public final G6 a(Exception exc, Bl bl2) {
        NativeVideo nativeVideo = this.f27078e;
        if (nativeVideo != null ? nativeVideo.getRequired() : false) {
            InterfaceC3322t9 interfaceC3322t9A = a();
            if (interfaceC3322t9A != null) {
                ((C3348u9) interfaceC3322t9A).b("VideoExperienceLoader", "Media Load Failure: " + exc);
            }
            return new D6((short) 2362);
        }
        return new F6(bl2);
    }
}
