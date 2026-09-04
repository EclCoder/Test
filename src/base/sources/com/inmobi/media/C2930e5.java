package com.inmobi.media;

import android.net.Network;
import com.inmobi.media.core.config.models.AdConfig;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.inmobi.media.e5, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C2930e5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile Network f26446a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile boolean f26447b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static long f26448c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static long f26449d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final AtomicBoolean f26450e = new AtomicBoolean(false);

    public static AdConfig.CustomNetworkValidation a() {
        C3136m4 c3136m4 = AbstractC2878c4.f26300a;
        kotlin.jvm.internal.s.h(AdConfig.class, "clazz");
        return ((AdConfig) AbstractC2878c4.f26300a.a(AdConfig.class)).getCustomNwValidation();
    }
}
