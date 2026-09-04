package com.inmobi.media;

import android.content.Context;
import com.iab.omid.library.inmobi.Omid;

/* JADX INFO: renamed from: com.inmobi.media.sf, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC3302sf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f27467a = 0;

    static {
        kotlin.jvm.internal.s.g(AbstractC3302sf.class.getSimpleName(), "getSimpleName(...)");
    }

    public static boolean a(Context applicationContext) {
        kotlin.jvm.internal.s.h(applicationContext, "applicationContext");
        try {
            if (!Omid.isActive()) {
                Omid.activate(applicationContext);
            }
            return Omid.isActive();
        } catch (Throwable th2) {
            th2.getStackTrace();
            return false;
        }
    }
}
