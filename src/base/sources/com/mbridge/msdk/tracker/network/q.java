package com.mbridge.msdk.tracker.network;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f33822a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f33823b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<String, String> f33824c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<g> f33825d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f33826e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f33827f;

    public q(int i10, byte[] bArr, boolean z10, long j10, List<g> list) {
        this(i10, bArr, a(list), list, z10, j10);
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

    private q(int i10, byte[] bArr, Map<String, String> map, List<g> list, boolean z10, long j10) {
        this.f33822a = i10;
        this.f33823b = bArr;
        this.f33824c = map;
        if (list == null) {
            this.f33825d = null;
        } else {
            this.f33825d = Collections.unmodifiableList(list);
        }
        this.f33826e = z10;
        this.f33827f = j10;
    }
}
