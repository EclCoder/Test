package com.facebook.internal;

import java.util.EnumSet;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public enum y0 {
    None(0),
    Enabled(1),
    RequireConfirm(2);


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f15472b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final EnumSet f15473c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f15478a;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final EnumSet a(long j10) {
            EnumSet result = EnumSet.noneOf(y0.class);
            for (y0 y0Var : y0.f15473c) {
                if ((y0Var.h() & j10) != 0) {
                    result.add(y0Var);
                }
            }
            kotlin.jvm.internal.s.g(result, "result");
            return result;
        }

        private a() {
        }
    }

    static {
        EnumSet enumSetAllOf = EnumSet.allOf(y0.class);
        kotlin.jvm.internal.s.g(enumSetAllOf, "allOf(SmartLoginOption::class.java)");
        f15473c = enumSetAllOf;
    }

    y0(long j10) {
        this.f15478a = j10;
    }

    public final long h() {
        return this.f15478a;
    }
}
