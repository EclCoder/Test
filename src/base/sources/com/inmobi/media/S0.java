package com.inmobi.media;

import android.webkit.URLUtil;
import com.inmobi.media.ads.network.common.model.AdResponse;
import com.inmobi.media.ads.network.common.model.AdSet;
import com.inmobi.media.ads.network.common.model.MRC50Params;
import com.inmobi.media.ads.network.common.model.MetaInfo;
import com.inmobi.media.ads.network.common.model.Trackers;
import com.inmobi.media.ads.network.common.model.TrackingInfo;
import com.inmobi.media.ads.network.common.model.Viewability;
import com.inmobi.media.ads.network.common.model.ViewabilityParams;
import com.inmobi.media.ads.network.inmobiJson.model.Icon;
import com.inmobi.media.ads.network.inmobiJson.model.InMobiJsonResponse;
import com.inmobi.media.ads.network.inmobiJson.model.JsonAssetObject;
import com.inmobi.media.ads.network.inmobiJson.model.NativeImage;
import com.inmobi.media.ads.network.inmobiJson.model.NativeMedia;
import com.inmobi.media.ads.network.inmobiJson.model.NativeVideo;
import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class S0 {
    /* JADX WARN: Code duplicated, block: B:119:0x0325  */
    /* JADX WARN: Code duplicated, block: B:144:0x0376  */
    /* JADX WARN: Code duplicated, block: B:156:0x03a9  */
    /* JADX WARN: Code duplicated, block: B:158:0x03b3  */
    /* JADX WARN: Code duplicated, block: B:160:0x03b9  */
    /* JADX WARN: Code duplicated, block: B:161:0x03bc  */
    /* JADX WARN: Code duplicated, block: B:166:0x03d7  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v31 */
    public static final void a(C3185o1 adManagerComponent, AdResponse adResponse, tl.o onSuccess, Function1 onFailure) {
        List listL;
        String creativeType;
        short s10;
        F f10;
        E e10;
        String creativeType2;
        E e11;
        MRC50Params mrc50;
        String creativeType3;
        ViewabilityParams inmobi;
        long millis;
        NativeVideo video;
        boolean required;
        ?? r10;
        short s11;
        String str;
        boolean required2;
        LinkedList<com.inmobi.media.ads.network.common.model.Ad> ads;
        com.inmobi.media.ads.network.common.model.Ad ad2;
        Pg pubContent;
        kotlin.jvm.internal.s.h(adManagerComponent, "adManagerComponent");
        kotlin.jvm.internal.s.h(adResponse, "adResponse");
        kotlin.jvm.internal.s.h(onSuccess, "onSuccess");
        kotlin.jvm.internal.s.h(onFailure, "onFailure");
        C3211p1 adManagerContext = adManagerComponent.f27103a;
        kotlin.jvm.internal.s.h(adResponse, "adResponse");
        kotlin.jvm.internal.s.h(adManagerContext, "adManagerContext");
        AdSet adSet = (AdSet) gl.r.d0(adResponse.getAdSets());
        int i10 = 10;
        String str2 = "native";
        String str3 = MimeTypes.BASE_TYPE_VIDEO;
        short s12 = 0;
        if (adSet == null) {
            listL = gl.r.l();
        } else {
            AdConfig adConfig = adManagerContext.f27160b;
            adSet.getIsPod();
            D d10 = new D(adSet.getAdSetId(), adResponse.getRequestId(), adSet.getIsRewarded());
            LinkedList<com.inmobi.media.ads.network.common.model.Ad> ads2 = adSet.getAds();
            ArrayList arrayList = new ArrayList(gl.r.v(ads2, 10));
            Iterator it = ads2.iterator();
            int i11 = 0;
            while (it.hasNext()) {
                Object next = it.next();
                int i12 = i11 + 1;
                if (i11 < 0) {
                    gl.r.u();
                }
                com.inmobi.media.ads.network.common.model.Ad ad3 = (com.inmobi.media.ads.network.common.model.Ad) next;
                MetaInfo metaInfo = ad3.getMetaInfo();
                String str4 = "unknown";
                if (metaInfo == null || (creativeType = metaInfo.getCreativeType()) == null) {
                    creativeType = "unknown";
                }
                Viewability viewability = (Viewability) gl.r.e0(ad3.getViewability(), s12);
                if (viewability == null || (inmobi = viewability.getInmobi()) == null) {
                    s10 = 0;
                    f10 = new F(adConfig.getNative().getViewabilityConfig().getImpressionConfig().getImpressionType(), ad3.getImpressionId(), H.b(creativeType, str2, adConfig), H.a(creativeType, str2, adConfig), new int[0]);
                } else {
                    int iA = H.a(inmobi.getTime());
                    int iA2 = H.a(inmobi.getView());
                    H.a(inmobi.getPixel());
                    if (iA == -1) {
                        iA = H.b(creativeType, str2, adConfig);
                    }
                    int i13 = iA;
                    if (iA2 == -1) {
                        iA2 = H.a(creativeType, str2, adConfig);
                    }
                    f10 = new F(inmobi.getType(), ad3.getImpressionId(), i13, iA2, inmobi.getFrame());
                    s10 = 0;
                }
                Viewability viewability2 = (Viewability) gl.r.e0(ad3.getViewability(), s10);
                if (viewability2 == null || (mrc50 = viewability2.getMrc50()) == null) {
                    MetaInfo metaInfo2 = ad3.getMetaInfo();
                    if (metaInfo2 != null && (creativeType2 = metaInfo2.getCreativeType()) != null) {
                        str4 = creativeType2;
                    }
                    e10 = new E(kotlin.jvm.internal.s.c(str4, str3) ? adConfig.getNative().getViewabilityConfig().getMrc50Config().getVideoMinTimeViewed() : adConfig.getNative().getViewabilityConfig().getMrc50Config().getMinTimeViewed(), 50);
                } else {
                    int iA3 = H.a(mrc50.getTime());
                    int iA4 = H.a(mrc50.getView());
                    if (iA3 == -1 || iA4 == -1) {
                        MetaInfo metaInfo3 = ad3.getMetaInfo();
                        if (metaInfo3 != null && (creativeType3 = metaInfo3.getCreativeType()) != null) {
                            str4 = creativeType3;
                        }
                        e10 = new E(kotlin.jvm.internal.s.c(str4, str3) ? adConfig.getNative().getViewabilityConfig().getMrc50Config().getVideoMinTimeViewed() : adConfig.getNative().getViewabilityConfig().getMrc50Config().getMinTimeViewed(), 50);
                    } else {
                        e11 = new E(iA3, iA4);
                    }
                    String str5 = str3;
                    String markupType = ad3.getMarkupType();
                    MetaInfo metaInfo4 = ad3.getMetaInfo();
                    AdConfig adConfig2 = adConfig;
                    String creativeId = ad3.getCreativeId();
                    String str6 = str2;
                    D d11 = d10;
                    String tracking = ad3.getTracking();
                    ArrayList arrayList2 = arrayList;
                    List<Trackers> trackers$media_release = ad3.getTrackers$media_release();
                    List<TrackingInfo> trackingInfo$media_release = ad3.getTrackingInfo$media_release();
                    ad3.getAllowAutoRedirection();
                    C3211p1 c3211p1 = adManagerContext;
                    arrayList2.add(new G(d11, markupType, metaInfo4, creativeId, tracking, trackers$media_release, trackingInfo$media_release, ad3.getContextData(), ad3.getTelemetryMetadataBlob(), ad3.getInsertionTimestampInMillis(), ad3.getExpiryTimestampInMillis(), ad3.getTransaction(), f10, e11, c3211p1));
                    s12 = s10;
                    arrayList = arrayList2;
                    i10 = 10;
                    d10 = d11;
                    adManagerContext = c3211p1;
                    i11 = i12;
                    it = it;
                    adConfig = adConfig2;
                    str2 = str6;
                    str3 = str5;
                }
                e11 = e10;
                String str7 = str3;
                String markupType2 = ad3.getMarkupType();
                MetaInfo metaInfo5 = ad3.getMetaInfo();
                AdConfig adConfig3 = adConfig;
                String creativeId2 = ad3.getCreativeId();
                String str8 = str2;
                D d12 = d10;
                String tracking2 = ad3.getTracking();
                ArrayList arrayList3 = arrayList;
                List<Trackers> trackers$media_release2 = ad3.getTrackers$media_release();
                List<TrackingInfo> trackingInfo$media_release2 = ad3.getTrackingInfo$media_release();
                ad3.getAllowAutoRedirection();
                C3211p1 c3211p2 = adManagerContext;
                arrayList3.add(new G(d12, markupType2, metaInfo5, creativeId2, tracking2, trackers$media_release2, trackingInfo$media_release2, ad3.getContextData(), ad3.getTelemetryMetadataBlob(), ad3.getInsertionTimestampInMillis(), ad3.getExpiryTimestampInMillis(), ad3.getTransaction(), f10, e11, c3211p2));
                s12 = s10;
                arrayList = arrayList3;
                i10 = 10;
                d10 = d12;
                adManagerContext = c3211p2;
                i11 = i12;
                it = it;
                adConfig = adConfig3;
                str2 = str8;
                str3 = str7;
            }
            listL = arrayList;
        }
        String str9 = str2;
        String str10 = str3;
        short s13 = s12;
        ArrayList arrayList4 = new ArrayList(gl.r.v(listL, i10));
        Iterator it2 = listL.iterator();
        while (it2.hasNext()) {
            arrayList4.add(new C3416x(adManagerComponent, (G) it2.next()));
        }
        C3416x c3416x = (C3416x) gl.r.d0(arrayList4);
        AdSet adSet2 = (AdSet) gl.r.d0(adResponse.getAdSets());
        Object objB = (adSet2 == null || (ads = adSet2.getAds()) == null || (ad2 = (com.inmobi.media.ads.network.common.model.Ad) gl.r.e0(ads, s13)) == null || (pubContent = ad2.getPubContent()) == null) ? null : pubContent.b();
        C2874c0 c2874c0 = adManagerComponent.f27106d;
        G g10 = (G) gl.r.d0(listL);
        if (g10 != null) {
            kotlin.jvm.internal.s.h(g10, "<this>");
            long timeToLive = g10.f24811a.f27160b.getCacheConfig(str9).getTimeToLive();
            millis = g10.f24821k;
            if (millis == -1) {
                millis = g10.f24820j + TimeUnit.SECONDS.toMillis(timeToLive);
            }
        } else {
            millis = 0;
        }
        c2874c0.f26294h = millis;
        if (c3416x == null) {
            onFailure.invoke((short) 55);
            return;
        }
        if (!(objB instanceof InMobiJsonResponse)) {
            onFailure.invoke((short) 56);
            return;
        }
        InMobiJsonResponse inMobiJsonResponse = (InMobiJsonResponse) objB;
        JsonAssetObject assetsObject = inMobiJsonResponse.getAssetsObject();
        if (assetsObject == null) {
            s11 = 2300;
        } else {
            JsonAssetObject assetsObject2 = inMobiJsonResponse.getAssetsObject();
            if (assetsObject2.getIcon() == null && assetsObject2.getMedia() == null) {
                s11 = 2301;
            } else {
                JsonAssetObject assetsObject3 = inMobiJsonResponse.getAssetsObject();
                Icon icon = assetsObject3.getIcon();
                ?? required3 = icon != null ? icon.getRequired() : s13;
                NativeMedia media = assetsObject3.getMedia();
                if (kotlin.jvm.internal.s.c(media != null ? media.getType() : null, "static")) {
                    NativeImage image = assetsObject3.getMedia().getImage();
                    if (image != null) {
                        required2 = image.getRequired();
                    } else {
                        r10 = s13;
                    }
                } else {
                    NativeMedia media2 = assetsObject3.getMedia();
                    if (media2 == null || (video = media2.getVideo()) == null) {
                        r10 = s13;
                    } else {
                        required = video.getRequired();
                    }
                }
                if (required3 == 0 && r10 == 0) {
                    s11 = 2302;
                } else {
                    r10 = required;
                    r10 = required2;
                    Icon icon2 = assetsObject.getIcon();
                    if (icon2 == null || !icon2.getRequired() || URLUtil.isNetworkUrl(icon2.getUrl())) {
                        NativeMedia media3 = assetsObject.getMedia();
                        if (media3 == null) {
                            s11 = s13;
                        } else if (media3.getType().length() != 0) {
                            if (bm.r.A(media3.getType(), "static", true)) {
                                str = str10;
                            } else {
                                str = str10;
                                if (!bm.r.A(media3.getType(), str, true)) {
                                    s11 = 2306;
                                }
                            }
                            if (bm.r.A(media3.getType(), "static", true)) {
                                if (media3.getImage() == null) {
                                    s11 = 2304;
                                } else if (media3.getImage().getRequired() && media3.getImage().getAssets().isEmpty()) {
                                    s11 = 2307;
                                } else if (!bm.r.A(media3.getType(), str, true)) {
                                    s11 = s13;
                                } else if (media3.getVideo() == null) {
                                    s11 = 2305;
                                } else if (media3.getVideo().getRequired()) {
                                    s11 = s13;
                                } else {
                                    s11 = s13;
                                }
                            } else if (!bm.r.A(media3.getType(), str, true)) {
                                s11 = s13;
                            } else if (media3.getVideo() == null) {
                                s11 = 2305;
                            } else if (media3.getVideo().getRequired() || media3.getVideo().getVastTag().length() != 0) {
                                s11 = s13;
                            } else {
                                s11 = 2308;
                            }
                        } else {
                            s11 = 2306;
                        }
                    } else {
                        s11 = 2303;
                    }
                }
            }
        }
        if (s11 != 0) {
            onFailure.invoke(Short.valueOf(s11));
        } else {
            onSuccess.invoke(c3416x, objB);
        }
    }
}
