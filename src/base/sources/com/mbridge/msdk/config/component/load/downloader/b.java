package com.mbridge.msdk.config.component.load.downloader;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.q0;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Object f28804a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f28805b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f28806c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Map<String, Object> f28807d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f28808e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f28809f = "";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f28810g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f28811h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f28812i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f28813j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f28814k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f28815l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f28816m;

    public b(Object obj, String str, String str2, String str3, int i10) {
        this.f28804a = obj;
        this.f28810g = str3;
        this.f28805b = i10;
        this.f28806c = str;
        this.f28814k = str2;
        try {
            if (TextUtils.isEmpty(str2)) {
                URL url = new URL(str);
                this.f28814k = url.getProtocol() + "://" + url.getHost() + url.getPath();
            }
        } catch (MalformedURLException e10) {
            q0.b("DownloadMessage", e10.getMessage(), e10);
        }
    }

    public void a(String str, Object obj) {
        if (this.f28807d == null) {
            this.f28807d = new HashMap(4);
        }
        this.f28807d.put(str, obj);
    }

    public void b(String str) {
        this.f28809f = str;
    }

    public long c() {
        return this.f28812i;
    }

    public int d() {
        return this.f28813j;
    }

    public int e() {
        return this.f28805b;
    }

    public String f() {
        return this.f28806c;
    }

    public long g() {
        return this.f28816m;
    }

    public String h() {
        return this.f28810g;
    }

    public String i() {
        return this.f28809f;
    }

    public boolean j() {
        return this.f28811h;
    }

    public String b() {
        return this.f28814k;
    }

    public void b(long j10) {
        this.f28816m = j10;
    }

    public void a(boolean z10) {
        this.f28811h = z10;
    }

    public void a(long j10) {
        this.f28812i = j10;
    }

    public void a(int i10) {
        this.f28813j = i10;
    }

    public String a() {
        return this.f28815l;
    }

    public void a(String str) {
        this.f28815l = str;
    }
}
