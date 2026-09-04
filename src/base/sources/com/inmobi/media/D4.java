package com.inmobi.media;

import com.inmobi.media.ads.network.common.model.Trackers;
import com.inmobi.media.ads.network.common.model.TrackersV2;
import com.inmobi.media.ads.network.common.model.TrackingInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class D4 {
    public static final ArrayList a(G g10, String type) {
        kotlin.jvm.internal.s.h(g10, "<this>");
        kotlin.jvm.internal.s.h(type, "type");
        List list = g10.f24816f;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
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
        return arrayList2.isEmpty() ? a(type, g10.f24817g) : arrayList2;
    }

    public static final ArrayList a(String type, List list) {
        kotlin.jvm.internal.s.h(list, "<this>");
        kotlin.jvm.internal.s.h(type, "type");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            TrackingInfo trackingInfo = (TrackingInfo) it.next();
            List<TrackersV2> trackers = trackingInfo.getTrackers();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : trackers) {
                if (kotlin.jvm.internal.s.c(((TrackersV2) obj).getType(), type)) {
                    arrayList2.add(obj);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            int size = arrayList2.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj2 = arrayList2.get(i10);
                i10++;
                TrackersV2 trackersV2 = (TrackersV2) obj2;
                List<String> url = trackersV2.getUrl();
                List<String> imExts = trackersV2.getImExts();
                ArrayList arrayList4 = new ArrayList(gl.r.v(imExts, 10));
                for (String str : imExts) {
                    arrayList4.add(trackingInfo.getImBaseUrl() + str);
                }
                gl.r.z(arrayList3, gl.r.s0(url, arrayList4));
            }
            gl.r.z(arrayList, arrayList3);
        }
        return arrayList;
    }
}
