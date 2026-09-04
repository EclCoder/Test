package com.inmobi.media;

import com.inmobi.media.ads.network.common.model.Trackers;
import com.inmobi.media.ads.network.common.model.TrackersV2;
import com.inmobi.media.ads.network.common.model.TrackingInfo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class Li {
    public static final List a(com.inmobi.media.ads.network.common.model.Ad ad2, String type) {
        kotlin.jvm.internal.s.h(ad2, "<this>");
        kotlin.jvm.internal.s.h(type, "type");
        List<Trackers> trackers$media_release = ad2.getTrackers$media_release();
        ArrayList arrayList = new ArrayList();
        for (Object obj : trackers$media_release) {
            if (kotlin.jvm.internal.s.c(((Trackers) obj).getType(), type)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj2 = arrayList.get(i10);
            i10++;
            gl.r.z(arrayList2, ((Trackers) obj2).getUrl());
        }
        List<TrackingInfo> trackingInfo$media_release = ad2.getTrackingInfo$media_release();
        Collection arrayList3 = new ArrayList();
        for (TrackingInfo trackingInfo : trackingInfo$media_release) {
            List<TrackersV2> trackers = trackingInfo.getTrackers();
            ArrayList arrayList4 = new ArrayList();
            for (Object obj3 : trackers) {
                if (kotlin.jvm.internal.s.c(((TrackersV2) obj3).getType(), type)) {
                    arrayList4.add(obj3);
                }
            }
            ArrayList arrayList5 = new ArrayList();
            int size2 = arrayList4.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj4 = arrayList4.get(i11);
                i11++;
                TrackersV2 trackersV2 = (TrackersV2) obj4;
                List<String> url = trackersV2.getUrl();
                List<String> imExts = trackersV2.getImExts();
                ArrayList arrayList6 = new ArrayList(gl.r.v(imExts, 10));
                for (String str : imExts) {
                    arrayList6.add(trackingInfo.getImBaseUrl() + str);
                }
                gl.r.z(arrayList5, gl.r.s0(url, arrayList6));
            }
            gl.r.z(arrayList3, arrayList5);
        }
        if (arrayList3.isEmpty()) {
            arrayList3 = gl.r.l();
        }
        return gl.r.s0(arrayList3, arrayList2);
    }
}
