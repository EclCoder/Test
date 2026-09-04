package com.mbridge.msdk.tracker;

import java.io.Serializable;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class e implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f33708a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private JSONObject f33711d;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private h f33716i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f33709b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f33710c = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f33714g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f33715h = 604800000;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f33717j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f33718k = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f33713f = System.currentTimeMillis();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f33712e = UUID.randomUUID().toString();

    public e(String str) {
        this.f33708a = str;
    }

    public void a(int i10) {
        this.f33710c = i10;
    }

    public void b(int i10) {
        this.f33709b = i10;
    }

    public void c(long j10) {
        this.f33713f = j10;
    }

    public long d() {
        return this.f33714g;
    }

    public String g() {
        return this.f33708a;
    }

    public int h() {
        return this.f33710c;
    }

    public JSONObject i() {
        JSONObject jSONObject = this.f33711d;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObject2 = new JSONObject();
        this.f33711d = jSONObject2;
        return jSONObject2;
    }

    public h j() {
        return this.f33716i;
    }

    public long k() {
        return this.f33715h;
    }

    public long l() {
        return this.f33713f;
    }

    public int m() {
        return this.f33709b;
    }

    public String n() {
        return this.f33712e;
    }

    public boolean o() {
        return this.f33718k;
    }

    public boolean p() {
        return this.f33717j;
    }

    public void a(JSONObject jSONObject) {
        this.f33711d = jSONObject;
    }

    void b(long j10) {
        this.f33715h = j10;
    }

    void a(String str) {
        this.f33712e = str;
    }

    public void a(long j10) {
        this.f33714g = j10;
    }

    public void a(h hVar) {
        this.f33716i = hVar;
    }

    public void a(boolean z10) {
        this.f33718k = z10;
    }
}
