package com.mbridge.msdk.foundation.cache;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static int f30125i = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static int f30126j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int f30127k = 3;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static int f30128l = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private CopyOnWriteArrayList<CampaignEx> f30129a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f30130b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f30131c = 21;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f30132d = f30126j;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ArrayList<String> f30133e = new ArrayList<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private List<String> f30134f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private List<String> f30135g = new ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private List<String> f30136h = new ArrayList();

    public void a(CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList) {
        this.f30129a = copyOnWriteArrayList;
    }

    public String b() {
        List<String> list = this.f30136h;
        return list == null ? "" : list.toString();
    }

    public CopyOnWriteArrayList<CampaignEx> c() {
        return this.f30129a;
    }

    public String d() {
        List<String> list = this.f30135g;
        return list == null ? "" : list.toString();
    }

    public String e() {
        return this.f30130b;
    }

    public String f() {
        List<String> list = this.f30134f;
        return list == null ? "" : list.toString();
    }

    public int g() {
        return this.f30132d;
    }

    public String a() {
        ArrayList<String> arrayList = this.f30133e;
        return arrayList == null ? "" : arrayList.toString();
    }

    public void c(String str) {
        try {
            List<String> list = this.f30134f;
            if (list != null) {
                list.add(str);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void b(String str) {
        try {
            List<String> list = this.f30135g;
            if (list != null) {
                list.add(str);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void d(String str) {
        this.f30130b = str;
    }

    public void a(String str) {
        try {
            ArrayList<String> arrayList = this.f30133e;
            if (arrayList != null) {
                arrayList.add(str);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void a(int i10) {
        this.f30132d = i10;
    }
}
