package com.facebook.ads.redexgen.core;

import com.facebook.ads.redexgen.core.UL;
import com.facebook.ads.redexgen.core.UN;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class UM<T extends UN, E extends UL> {
    public final Map<Class<E>, List<WeakReference<T>>> A00 = new HashMap();
    public final Queue<E> A01 = new ArrayDeque();

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private void A00(E e10) {
        List<WeakReference<T>> list;
        if (this.A00 == null || (list = this.A00.get(e10.getClass())) == null) {
            return;
        }
        A01(list);
        if (list.isEmpty()) {
            return;
        }
        Iterator it = new ArrayList(list).iterator();
        while (it.hasNext()) {
            UN un2 = (UN) ((WeakReference) it.next()).get();
            if (un2 != null && un2.A00(e10)) {
                un2.A03(e10);
            }
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final synchronized void A02(E e10) {
        if (this.A01.isEmpty()) {
            this.A01.add(e10);
            while (!this.A01.isEmpty()) {
                A00(this.A01.peek());
                this.A01.remove();
            }
        } else {
            this.A01.add(e10);
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final synchronized boolean A05(T t10) {
        if (t10 == null) {
            return false;
        }
        Class<E> clsA01 = t10.A01();
        if (this.A00.get(clsA01) == null) {
            this.A00.put(clsA01, new ArrayList());
        }
        List<WeakReference<T>> list = this.A00.get(clsA01);
        A01(list);
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (list.get(i10).get() == t10) {
                return false;
            }
        }
        return list.add(new WeakReference<>(t10));
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.UM != com.facebook.ads.internal.events.EventBus<T extends com.facebook.ads.redexgen.X.UN, E extends com.facebook.ads.redexgen.X.UL> */
    private void A01(List<WeakReference<T>> subscribers) {
        if (subscribers != null) {
            int writePtr = 0;
            for (int i10 = 0; i10 < writePtr; i10++) {
                WeakReference<T> weakReference = subscribers.get(i10);
                if (weakReference.get() != null) {
                    subscribers.set(writePtr, weakReference);
                    writePtr++;
                }
            }
            int writePtr2 = subscribers.size();
            for (int writePtr3 = writePtr2 - 1; writePtr3 >= writePtr; writePtr3--) {
                subscribers.remove(writePtr3);
            }
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.UM != com.facebook.ads.internal.events.EventBus<T extends com.facebook.ads.redexgen.X.UN, E extends com.facebook.ads.redexgen.X.UL> */
    public final synchronized void A03(T... subscribers) {
        if (subscribers == null) {
            return;
        }
        for (T t10 : subscribers) {
            A05(t10);
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.UM != com.facebook.ads.internal.events.EventBus<T extends com.facebook.ads.redexgen.X.UN, E extends com.facebook.ads.redexgen.X.UL> */
    public final synchronized void A04(T... subscribers) {
        if (subscribers == null) {
            return;
        }
        for (T t10 : subscribers) {
            A06(t10);
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.UM != com.facebook.ads.internal.events.EventBus<T extends com.facebook.ads.redexgen.X.UN, E extends com.facebook.ads.redexgen.X.UL> */
    public final synchronized boolean A06(T subscriber) {
        if (subscriber == null) {
            return false;
        }
        List<WeakReference<T>> list = this.A00.get(subscriber.A01());
        if (list == null) {
            return false;
        }
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (list.get(i10).get() == subscriber) {
                list.get(i10).clear();
                return true;
            }
        }
        return false;
    }
}
