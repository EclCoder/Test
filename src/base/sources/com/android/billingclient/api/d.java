package com.android.billingclient.api;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList f10260a;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Set f10261a = new HashSet();

        public a a(int i10) {
            this.f10261a.add(Integer.valueOf(i10));
            return this;
        }

        public d b() {
            return new d(this.f10261a, null);
        }
    }

    /* synthetic */ d(Set set, l5.z zVar) {
        this.f10260a = new ArrayList(Collections.unmodifiableList(new ArrayList(set)));
    }

    public static a a() {
        return new a();
    }

    final ArrayList b() {
        return this.f10260a;
    }
}
