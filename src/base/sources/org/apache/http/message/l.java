package org.apache.http.message;

import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public class l implements co.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final List f49411a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected int f49412b = b(-1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected int f49413c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected String f49414d;

    public l(List list, String str) {
        this.f49411a = (List) ip.a.h(list, "Header list");
        this.f49414d = str;
    }

    protected boolean a(int i10) {
        if (this.f49414d == null) {
            return true;
        }
        return this.f49414d.equalsIgnoreCase(((co.d) this.f49411a.get(i10)).getName());
    }

    protected int b(int i10) {
        if (i10 < -1) {
            return -1;
        }
        int size = this.f49411a.size() - 1;
        boolean zA = false;
        while (!zA && i10 < size) {
            i10++;
            zA = a(i10);
        }
        if (zA) {
            return i10;
        }
        return -1;
    }

    @Override // co.g, java.util.Iterator
    public boolean hasNext() {
        return this.f49412b >= 0;
    }

    @Override // co.g
    public co.d k() {
        int i10 = this.f49412b;
        if (i10 < 0) {
            throw new NoSuchElementException("Iteration already finished.");
        }
        this.f49413c = i10;
        this.f49412b = b(i10);
        return (co.d) this.f49411a.get(i10);
    }

    @Override // java.util.Iterator
    public final Object next() {
        return k();
    }

    @Override // java.util.Iterator
    public void remove() {
        ip.b.a(this.f49413c >= 0, "No header to remove");
        this.f49411a.remove(this.f49413c);
        this.f49413c = -1;
        this.f49412b--;
    }
}
