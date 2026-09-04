package com.inmobi.media;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class La {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ConcurrentHashMap f25197b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferences f25198a;

    public La(Context context, String str) {
        this.f25198a = context.getSharedPreferences(str, 0);
    }

    public static void a(La la2, String key, boolean z10) {
        kotlin.jvm.internal.s.h(key, "key");
        SharedPreferences.Editor editorEdit = la2.f25198a.edit();
        editorEdit.putBoolean(key, z10);
        editorEdit.apply();
    }

    public final boolean a(String key) {
        kotlin.jvm.internal.s.h(key, "key");
        kotlin.jvm.internal.s.h(key, "key");
        if (!this.f25198a.contains(key)) {
            return false;
        }
        SharedPreferences.Editor editorEdit = this.f25198a.edit();
        editorEdit.remove(key);
        editorEdit.apply();
        return true;
    }

    public final void a(String key, String str, boolean z10) {
        kotlin.jvm.internal.s.h(key, "key");
        SharedPreferences.Editor editorEdit = this.f25198a.edit();
        editorEdit.putString(key, str);
        if (z10) {
            editorEdit.commit();
        } else {
            editorEdit.apply();
        }
    }

    public final void a(String key, int i10, boolean z10) {
        kotlin.jvm.internal.s.h(key, "key");
        SharedPreferences.Editor editorEdit = this.f25198a.edit();
        editorEdit.putInt(key, i10);
        if (z10) {
            editorEdit.commit();
        } else {
            editorEdit.apply();
        }
    }

    public final void a(String key, long j10, boolean z10) {
        kotlin.jvm.internal.s.h(key, "key");
        SharedPreferences.Editor editorEdit = this.f25198a.edit();
        editorEdit.putLong(key, j10);
        if (z10) {
            editorEdit.commit();
        } else {
            editorEdit.apply();
        }
    }
}
