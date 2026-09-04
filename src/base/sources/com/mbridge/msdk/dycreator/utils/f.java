package com.mbridge.msdk.dycreator.utils;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile f f30040b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.mbridge.msdk.dycreator.engine.b f30041a;

    private f(Context context) {
        this.f30041a = null;
        com.mbridge.msdk.dycreator.engine.b bVarA = com.mbridge.msdk.dycreator.engine.b.a();
        this.f30041a = bVarA;
        bVarA.a(context, "");
    }

    public static f a(Context context) {
        if (f30040b == null) {
            synchronized (f.class) {
                try {
                    if (f30040b == null) {
                        f30040b = new f(context.getApplicationContext());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f30040b;
    }

    public View a(String str) {
        if (new File(str).exists()) {
            return this.f30041a.e(str);
        }
        return null;
    }

    public View a(ViewGroup viewGroup, String str) {
        if (viewGroup != null && !TextUtils.isEmpty(str)) {
            if (viewGroup.getId() == str.hashCode()) {
                return viewGroup;
            }
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if (childAt.getId() == str.hashCode()) {
                    return childAt;
                }
                if (childAt instanceof ViewGroup) {
                    a((ViewGroup) childAt, str);
                }
            }
        }
        return null;
    }
}
