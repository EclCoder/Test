package com.mbridge.msdk.mbnative.controller;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import n0.q0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class f {
    public static View a(Context context, View view) {
        View viewA = a(context);
        return viewA != null ? viewA : a(view);
    }

    private static View a(Context context) {
        if (context != null && (context instanceof Activity)) {
            return ((Activity) context).getWindow().getDecorView().findViewById(R.id.content);
        }
        return null;
    }

    private static View a(View view) {
        if (view == null) {
            return null;
        }
        try {
            q0.S(view);
        } catch (Throwable unused) {
        }
        try {
            View rootView = view.getRootView();
            if (rootView == null) {
                return null;
            }
            View viewFindViewById = rootView.findViewById(R.id.content);
            return viewFindViewById != null ? viewFindViewById : rootView;
        } catch (Throwable unused2) {
            return null;
        }
    }
}
