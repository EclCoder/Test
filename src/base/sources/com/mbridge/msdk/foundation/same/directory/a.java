package com.mbridge.msdk.foundation.same.directory;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<a> f30525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f30526b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private a f30527c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private c f30528d;

    public void a(c cVar, String str) {
        a aVar = new a();
        aVar.a(cVar);
        aVar.a(str);
        a(aVar);
    }

    public String b() {
        return this.f30526b;
    }

    public a c() {
        return this.f30527c;
    }

    public c d() {
        return this.f30528d;
    }

    public void b(a aVar) {
        this.f30527c = aVar;
    }

    public void a(a aVar) {
        if (this.f30525a == null) {
            this.f30525a = new ArrayList();
        }
        aVar.b(this);
        this.f30525a.add(aVar);
    }

    public void a(List<a> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        Iterator<a> it = list.iterator();
        while (it.hasNext()) {
            a(it.next());
        }
    }

    public List<a> a() {
        return this.f30525a;
    }

    public void a(String str) {
        this.f30526b = str;
    }

    public void a(c cVar) {
        this.f30528d = cVar;
    }
}
