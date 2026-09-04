package com.facebook.internal;

import android.app.Activity;
import android.content.Intent;
import androidx.fragment.app.Fragment;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Fragment f15213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private android.app.Fragment f15214b;

    public f0(Fragment fragment) {
        kotlin.jvm.internal.s.h(fragment, "fragment");
        this.f15213a = fragment;
    }

    public final Activity a() {
        Fragment fragment = this.f15213a;
        if (fragment != null) {
            if (fragment != null) {
                return fragment.getActivity();
            }
            return null;
        }
        android.app.Fragment fragment2 = this.f15214b;
        if (fragment2 != null) {
            return fragment2.getActivity();
        }
        return null;
    }

    public final android.app.Fragment b() {
        return this.f15214b;
    }

    public final Fragment c() {
        return this.f15213a;
    }

    public final void d(Intent intent, int i10) {
        Fragment fragment = this.f15213a;
        if (fragment != null) {
            if (fragment != null) {
                fragment.startActivityForResult(intent, i10);
            }
        } else {
            android.app.Fragment fragment2 = this.f15214b;
            if (fragment2 != null) {
                fragment2.startActivityForResult(intent, i10);
            }
        }
    }

    public f0(android.app.Fragment fragment) {
        kotlin.jvm.internal.s.h(fragment, "fragment");
        this.f15214b = fragment;
    }
}
