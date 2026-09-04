package com.inmobi.media;

import com.inmobi.media.Fc;
import com.inmobi.media.J2;
import com.mbridge.msdk.dycreator.binding.vREM.mTFeqtajA;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public final class Fc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f24770a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ExecutorService f24771b;

    public Fc() {
        kotlin.jvm.internal.s.h("MultiEventBus", "name");
        this.f24771b = Executors.newSingleThreadExecutor(new I9("MultiEventBus", false));
    }

    public static final void a(J2 j10, Fc fc2) {
        int i10 = j10.f25043a;
        fc2.a(j10);
    }

    public final void b(final J2 event) {
        kotlin.jvm.internal.s.h(event, "event");
        try {
            this.f24771b.execute(new Runnable() { // from class: yh.m1
                @Override // java.lang.Runnable
                public final void run() {
                    Fc.a(event, this);
                }
            });
        } catch (InternalError unused) {
            int i10 = event.f25043a;
            a(event);
        }
    }

    public static final boolean a(int[] iArr, J2 event) {
        kotlin.jvm.internal.s.h(event, "event");
        return gl.j.N(iArr, event.f25043a);
    }

    public final void a(final int[] eventIds, Function1 function1) {
        kotlin.jvm.internal.s.h(eventIds, "eventIds");
        kotlin.jvm.internal.s.h(function1, mTFeqtajA.NDmiByH);
        this.f24770a.put(new Function1() { // from class: yh.n1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(Fc.a(eventIds, (J2) obj));
            }
        }, new WeakReference(function1));
    }

    public final void a(Function1 subscriber) {
        kotlin.jvm.internal.s.h(subscriber, "subscriber");
        Iterator it = this.f24770a.entrySet().iterator();
        while (it.hasNext()) {
            if (kotlin.jvm.internal.s.c(((WeakReference) ((Map.Entry) it.next()).getValue()).get(), subscriber)) {
                it.remove();
            }
        }
    }

    public final void a(J2 j10) {
        Function1 function1;
        Set<Map.Entry> setEntrySet = this.f24770a.entrySet();
        kotlin.jvm.internal.s.g(setEntrySet, "<get-entries>(...)");
        for (Map.Entry entry : setEntrySet) {
            if (((WeakReference) entry.getValue()).get() == null) {
                this.f24770a.remove(entry.getKey());
            }
        }
        Set<Map.Entry> setEntrySet2 = this.f24770a.entrySet();
        kotlin.jvm.internal.s.g(setEntrySet2, "<get-entries>(...)");
        for (Map.Entry entry2 : setEntrySet2) {
            kotlin.jvm.internal.s.e(entry2);
            Object key = entry2.getKey();
            kotlin.jvm.internal.s.g(key, "component1(...)");
            Function1 function2 = (Function1) key;
            Object value = entry2.getValue();
            kotlin.jvm.internal.s.g(value, "component2(...)");
            WeakReference weakReference = (WeakReference) value;
            try {
                if (((Boolean) function2.invoke(j10)).booleanValue() && (function1 = (Function1) weakReference.get()) != null) {
                    function1.invoke(j10);
                }
            } catch (Exception e10) {
                fl.k kVar = W9.f25935a;
                AbstractC3219p9.a(e10);
            }
        }
    }
}
