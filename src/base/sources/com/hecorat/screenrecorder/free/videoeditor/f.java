package com.hecorat.screenrecorder.free.videoeditor;

import androidx.lifecycle.q0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class f implements kotlin.jvm.internal.m, q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Function1 f23436a;

    public f(Function1 function) {
        s.h(function, "function");
        this.f23436a = function;
    }

    @Override // kotlin.jvm.internal.m
    public final fl.g a() {
        return this.f23436a;
    }

    @Override // androidx.lifecycle.q0
    public final /* synthetic */ void d(Object obj) {
        this.f23436a.invoke(obj);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof q0) && (obj instanceof kotlin.jvm.internal.m)) {
            return s.c(a(), ((kotlin.jvm.internal.m) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return a().hashCode();
    }
}
