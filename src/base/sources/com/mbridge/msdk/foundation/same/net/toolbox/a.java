package com.mbridge.msdk.foundation.same.net.toolbox;

import com.mbridge.msdk.tracker.network.g;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f30599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<g> f30600b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<String, String> f30601c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f30602d;

    public a(int i10, byte[] bArr, List<g> list) {
        this(i10, bArr, a(list), list);
    }

    private static Map<String, String> a(List<g> list) {
        if (list == null) {
            return null;
        }
        if (list.isEmpty()) {
            return Collections.EMPTY_MAP;
        }
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (g gVar : list) {
            treeMap.put(gVar.a(), gVar.b());
        }
        return treeMap;
    }

    private a(int i10, byte[] bArr, Map<String, String> map, List<g> list) {
        this.f30602d = i10;
        this.f30599a = bArr;
        this.f30601c = map;
        if (list == null) {
            this.f30600b = null;
        } else {
            this.f30600b = Collections.unmodifiableList(list);
        }
    }
}
