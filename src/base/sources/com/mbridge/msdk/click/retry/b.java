package com.mbridge.msdk.click.retry;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class b {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int f28491k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static int f28492l = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f28493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f28494b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashSet<String> f28495c = new HashSet<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f28496d = System.currentTimeMillis();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private CampaignEx f28497e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f28498f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f28499g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f28500h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f28501i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f28502j;

    public b(String str, String str2) {
        this.f28493a = str;
        a(str2);
    }

    public void a(boolean z10) {
        this.f28500h = z10;
    }

    public void b(boolean z10) {
        this.f28501i = z10;
    }

    public long c() {
        return this.f28496d;
    }

    public int d() {
        return this.f28502j;
    }

    public int e() {
        return this.f28494b;
    }

    public String f() {
        return this.f28498f;
    }

    public String g() {
        return this.f28493a;
    }

    public int h() {
        return this.f28499g;
    }

    public boolean i() {
        return this.f28500h;
    }

    public boolean j() {
        return this.f28501i;
    }

    public void a(int i10) {
        this.f28502j = i10;
    }

    public void b(int i10) {
        this.f28499g = i10;
    }

    public CampaignEx a() {
        return this.f28497e;
    }

    public void b(String str) {
        this.f28498f = str;
    }

    public void a(CampaignEx campaignEx) {
        this.f28497e = campaignEx;
    }

    public HashSet<String> b() {
        return this.f28495c;
    }

    public void a(String str) {
        this.f28494b++;
        this.f28495c.add(str);
    }
}
