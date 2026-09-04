package com.facebook.login;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public enum i0 {
    FACEBOOK("facebook"),
    INSTAGRAM("instagram");


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f15621b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f15625a;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final i0 a(String str) {
            for (i0 i0Var : i0.values()) {
                if (kotlin.jvm.internal.s.c(i0Var.toString(), str)) {
                    return i0Var;
                }
            }
            return i0.FACEBOOK;
        }

        private a() {
        }
    }

    i0(String str) {
        this.f15625a = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f15625a;
    }
}
