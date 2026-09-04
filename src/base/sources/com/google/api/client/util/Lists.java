package com.google.api.client.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class Lists {
    private Lists() {
    }

    public static <E> ArrayList<E> newArrayList() {
        return new ArrayList<>();
    }

    public static <E> ArrayList<E> newArrayListWithCapacity(int i10) {
        return new ArrayList<>(i10);
    }

    public static <E> ArrayList<E> newArrayList(Iterable<? extends E> iterable) {
        return iterable instanceof Collection ? new ArrayList<>(Collections2.cast(iterable)) : newArrayList(iterable.iterator());
    }

    public static <E> ArrayList<E> newArrayList(Iterator<? extends E> it) {
        ArrayList<E> arrayListNewArrayList = newArrayList();
        while (it.hasNext()) {
            arrayListNewArrayList.add(it.next());
        }
        return arrayListNewArrayList;
    }
}
