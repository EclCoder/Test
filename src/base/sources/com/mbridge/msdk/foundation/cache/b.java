package com.mbridge.msdk.foundation.cache;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.k0;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private CopyOnWriteArrayList<CampaignEx> f30115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private double f30116b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f30117c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f30118d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f30119e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f30120f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f30121g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f30122h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f30123i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f30124j;

    public void a(long j10) {
        this.f30124j = j10;
    }

    public double b() {
        return this.f30116b;
    }

    public long c() {
        return this.f30124j;
    }

    public String d() {
        return this.f30117c;
    }

    public String e() {
        return this.f30118d;
    }

    public int f() {
        return this.f30119e;
    }

    public int g() {
        return this.f30121g;
    }

    public long h() {
        return this.f30122h;
    }

    public CopyOnWriteArrayList<CampaignEx> a() {
        return this.f30115a;
    }

    public void b(String str) {
        this.f30117c = str;
    }

    public void c(String str) {
        this.f30118d = str;
    }

    public void d(String str) {
        this.f30123i = str;
    }

    public void a(CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList) {
        this.f30115a = copyOnWriteArrayList;
    }

    public void b(int i10) {
        this.f30121g = i10;
    }

    public void c(long j10) {
        this.f30122h = j10;
    }

    public void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String strA = k0.a(str);
        if (TextUtils.isEmpty(strA)) {
            return;
        }
        try {
            double d10 = Double.parseDouble(strA);
            if (d10 <= 0.0d) {
                return;
            }
            this.f30116b = d10;
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void b(long j10) {
        this.f30120f = j10;
    }

    public void a(int i10) {
        this.f30119e = i10;
    }
}
