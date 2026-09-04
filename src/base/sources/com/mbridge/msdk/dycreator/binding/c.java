package com.mbridge.msdk.dycreator.binding;

import android.text.TextUtils;
import com.mbridge.msdk.dycreator.binding.base.BaseStrategy;
import com.mbridge.msdk.dycreator.binding.strategy.d;
import com.mbridge.msdk.dycreator.binding.strategy.e;
import com.mbridge.msdk.dycreator.binding.strategy.f;
import com.mbridge.msdk.dycreator.binding.strategy.g;
import com.vungle.ads.internal.presenter.j;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile c f29904a;

    private c() {
    }

    public static c a() {
        if (f29904a == null) {
            synchronized (c.class) {
                try {
                    if (f29904a == null) {
                        f29904a = new c();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f29904a;
    }

    public <T extends BaseStrategy> T a(String str) {
        T aVar = null;
        if (!TextUtils.isEmpty(str)) {
            if (str.equals("close")) {
                aVar = new com.mbridge.msdk.dycreator.binding.strategy.c();
            } else if (str.equals(j.DOWNLOAD)) {
                aVar = new com.mbridge.msdk.dycreator.binding.strategy.b();
            } else if (!str.equals("deeplink") && str.equals("activity")) {
                aVar = new com.mbridge.msdk.dycreator.binding.strategy.a();
            }
            if (str.equals("feedback")) {
                aVar = new d();
            }
            if (str.equals("notice")) {
                aVar = new e();
            }
            if (str.equals("permissionInfo")) {
                aVar = new f();
            }
            if (str.equals("privateAddress")) {
                return new g();
            }
        }
        return aVar;
    }
}
