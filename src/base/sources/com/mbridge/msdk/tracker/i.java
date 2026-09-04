package com.mbridge.msdk.tracker;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class i implements Serializable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static String f33723i = "CREATE TABLE IF NOT EXISTS %s (id INTEGER PRIMARY KEY,uuid TEXT,name TEXT,type INTEGER,time_stamp INTEGER,duration INTEGER,properties TEXT,priority INTEGER,state INTEGER,invalid_time INTEGER,ignore_max_timeout INTEGER,ignore_max_retry_times INTEGER,report_error_message TEXT,report_count INTEGER)";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static String f33724j = "DROP TABLE IF EXISTS %s";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f33725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f33726b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f33727c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f33728d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f33729e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f33730f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f33731g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f33732h;

    public i(e eVar) {
        this.f33725a = eVar;
        this.f33728d = eVar.n();
    }

    public void a(boolean z10) {
        this.f33731g = z10;
    }

    public void b(boolean z10) {
        this.f33730f = z10;
    }

    public e d() {
        return this.f33725a;
    }

    public long g() {
        return this.f33729e;
    }

    public int h() {
        return this.f33726b;
    }

    public String i() {
        return this.f33732h;
    }

    public int j() {
        return this.f33727c;
    }

    public String k() {
        return this.f33728d;
    }

    public boolean l() {
        return this.f33731g;
    }

    public boolean m() {
        return this.f33730f;
    }

    public void a(int i10) {
        this.f33726b = i10;
    }

    public void b(int i10) {
        this.f33727c = i10;
    }

    public void a(long j10) {
        this.f33729e = j10;
    }

    public void a(String str) {
        this.f33732h = str;
    }
}
