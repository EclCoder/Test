package com.google.api.client.util;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class Maps {
    private Maps() {
    }

    public static <K, V> HashMap<K, V> newHashMap() {
        return new HashMap<>();
    }

    public static <K, V> LinkedHashMap<K, V> newLinkedHashMap() {
        return new LinkedHashMap<>();
    }

    public static <K extends Comparable<?>, V> TreeMap<K, V> newTreeMap() {
        return new TreeMap<>();
    }
}
