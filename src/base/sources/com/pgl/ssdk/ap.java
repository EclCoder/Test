package com.pgl.ssdk;

import android.content.Context;
import com.vungle.ads.internal.protos.Sdk$SDKError;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class ap extends am {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Context f35342n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final int f35343o;

    public ap(Context context, int i10) {
        super(context);
        this.f35342n = context;
        this.f35343o = i10;
    }

    @Override // com.pgl.ssdk.am
    public String a() {
        int i10 = this.f35343o;
        if (i10 == 222) {
            return "/ssdk/v2/r?os=0&ver=7.9.0.0.overseas-rc.2&mode=1&app_ver=" + ab.h(this.f35342n) + "&region=" + ad.a() + "&did=" + com.pgl.ssdk.ces.b.b() + "&aid=" + com.pgl.ssdk.ces.b.a();
        }
        if (i10 != 301) {
            return null;
        }
        return "/ssdk/sd/token?os=android&app_id=" + com.pgl.ssdk.ces.b.a() + "&did=" + com.pgl.ssdk.ces.b.b() + "&app_ver=" + ab.h(this.f35342n) + "&platform=android&ver=7.9.0.0.overseas-rc.2&mode=1";
    }

    @Override // com.pgl.ssdk.am
    public void a(int i10, byte[] bArr) {
        try {
            if (i10 == 200) {
                int i11 = this.f35343o;
                if (i11 == 222) {
                    ((Integer) com.pgl.ssdk.ces.a.meta(Sdk$SDKError.b.STALE_CACHED_RESPONSE_VALUE, null, bArr)).getClass();
                    return;
                }
                if (i11 == 301) {
                    Object objA = a5.a(bArr);
                    au.b("write token result = ".concat(String.valueOf(objA)));
                    if ((objA instanceof Integer) && ((Integer) objA).intValue() == 0) {
                        au.b("write token succ");
                        a5.f35275a = 200;
                        return;
                    } else {
                        if (objA instanceof String) {
                            a5.f35277c = (String) objA;
                            a5.f35275a = 200;
                            return;
                        }
                        return;
                    }
                }
                return;
            }
            an.b(this.f35342n);
        } catch (Throwable unused) {
        }
    }
}
