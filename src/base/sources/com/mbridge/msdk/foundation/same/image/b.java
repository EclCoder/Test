package com.mbridge.msdk.foundation.same.image;

import android.content.Context;
import android.graphics.Bitmap;
import com.mbridge.msdk.foundation.tools.v0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static b f30549a;

    protected b(Context context) {
    }

    public void a() {
    }

    public void b() {
    }

    public boolean c(String str) {
        if (v0.k(str)) {
            return false;
        }
        return d.a().d(str);
    }

    public void a(String str) {
    }

    public Bitmap b(String str) {
        if (v0.k(str)) {
            return null;
        }
        return d.a().c(str);
    }

    public static b a(Context context) {
        if (f30549a == null) {
            f30549a = new b(context);
        }
        return f30549a;
    }

    public void a(String str, c cVar) {
        d.a().b(str, null, cVar);
    }
}
