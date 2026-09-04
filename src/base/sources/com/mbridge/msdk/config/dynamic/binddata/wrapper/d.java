package com.mbridge.msdk.config.dynamic.binddata.wrapper;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class d implements b<String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f29438a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f29439b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private View f29440c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f29441d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private AtomicBoolean f29442e = new AtomicBoolean(false);

    public d(String str, String str2, View view, int i10) {
        this.f29440c = view;
        this.f29438a = str;
        this.f29439b = str2;
        this.f29441d = i10;
    }

    private boolean b(String str) {
        if (TextUtils.isEmpty(str) || str.startsWith("mbridge_")) {
            return false;
        }
        try {
            com.mbridge.msdk.config.dynamic.utils.c.valueOf(str);
            return true;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    public View a() {
        return this.f29440c;
    }

    @Override // com.mbridge.msdk.config.dynamic.binddata.wrapper.b
    public void a(String str, Object obj) {
        if (b(this.f29438a)) {
            a(String.valueOf(obj));
        } else {
            b(str, obj);
        }
    }

    private void b(String str, Object obj) {
        KeyEvent.Callback callback = this.f29440c;
        if (callback instanceof com.mbridge.msdk.config.dynamic.baseview.inter.a) {
            ((com.mbridge.msdk.config.dynamic.baseview.inter.a) callback).updateBindData(str, obj);
        }
    }

    private void a(String str) {
        View view;
        if (this.f29442e.get() || (view = this.f29440c) == null) {
            return;
        }
        try {
            com.mbridge.msdk.config.dynamic.utils.a.a(view, this.f29438a, this.f29439b, str);
        } catch (Exception e10) {
            q0.b("ViewObserverImpl", e10.getMessage());
        }
    }
}
