package com.inmobi.media;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class Tb {
    public static ArrayList a() {
        CopyOnWriteArrayList copyOnWriteArrayList = Ub.f25828a;
        ArrayList arrayList = new ArrayList();
        try {
            Iterator it = Ub.f25828a.iterator();
            while (it.hasNext()) {
                Ph ph2 = (Ph) ((WeakReference) it.next()).get();
                if (ph2 != null) {
                    arrayList.add(ph2);
                }
            }
        } catch (Exception e10) {
            fl.k kVar = W9.f25935a;
            AbstractC3219p9.a(e10);
        }
        CopyOnWriteArrayList copyOnWriteArrayList2 = Ub.f25828a;
        arrayList.toString();
        return arrayList;
    }

    public static void b(Ph logger) {
        kotlin.jvm.internal.s.h(logger, "logger");
        CopyOnWriteArrayList copyOnWriteArrayList = Ub.f25828a;
        Objects.toString(logger);
        Ub.f25828a.add(new WeakReference(logger));
    }

    public static boolean a(String fileName) {
        kotlin.jvm.internal.s.h(fileName, "fileName");
        CopyOnWriteArrayList copyOnWriteArrayList = Ub.f25828a;
        try {
            Iterator it = Ub.f25828a.iterator();
            while (it.hasNext()) {
                Ph ph2 = (Ph) ((WeakReference) it.next()).get();
                if (kotlin.jvm.internal.s.c(ph2 != null ? ph2.f25503j : null, fileName)) {
                    return true;
                }
            }
            return false;
        } catch (Exception e10) {
            fl.k kVar = W9.f25935a;
            AbstractC3219p9.a(e10);
            return false;
        }
    }

    public static void a(Ph ph2) {
        CopyOnWriteArrayList copyOnWriteArrayList = Ub.f25828a;
        Objects.toString(ph2);
        if (ph2 == null) {
            return;
        }
        try {
            Iterator it = Ub.f25828a.iterator();
            kotlin.jvm.internal.s.g(it, "iterator(...)");
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                if (weakReference.get() == null || kotlin.jvm.internal.s.c(weakReference.get(), ph2)) {
                    Ub.f25828a.remove(weakReference);
                }
            }
        } catch (Exception e10) {
            fl.k kVar = W9.f25935a;
            AbstractC3219p9.a(e10);
        }
    }
}
