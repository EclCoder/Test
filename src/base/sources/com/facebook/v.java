package com.facebook;

import android.content.ContentProvider;
import java.util.Arrays;
import java.util.UUID;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class v extends ContentProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f16074a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f16075b = v.class.getName();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a(String str, UUID callId, String str2) {
            kotlin.jvm.internal.s.h(callId, "callId");
            kotlin.jvm.internal.o0 o0Var = kotlin.jvm.internal.o0.f43602a;
            String str3 = String.format("%s%s/%s/%s", Arrays.copyOf(new Object[]{"content://com.facebook.app.FacebookContentProvider", str, callId.toString(), str2}, 4));
            kotlin.jvm.internal.s.g(str3, "format(format, *args)");
            return str3;
        }

        public a() {
        }
    }
}
