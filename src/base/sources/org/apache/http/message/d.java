package org.apache.http.message;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public class d implements co.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final co.g f49381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final r f49382b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private co.e f49383c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ip.c f49384d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private u f49385e;

    public d(co.g gVar, r rVar) {
        this.f49383c = null;
        this.f49384d = null;
        this.f49385e = null;
        this.f49381a = (co.g) ip.a.h(gVar, "Header iterator");
        this.f49382b = (r) ip.a.h(rVar, "Parser");
    }

    private void a() {
        this.f49385e = null;
        this.f49384d = null;
        while (this.f49381a.hasNext()) {
            co.d dVarK = this.f49381a.k();
            if (dVarK instanceof co.c) {
                co.c cVar = (co.c) dVarK;
                ip.c cVarU = cVar.u();
                this.f49384d = cVarU;
                u uVar = new u(0, cVarU.length());
                this.f49385e = uVar;
                uVar.d(cVar.v());
                return;
            }
            String value = dVarK.getValue();
            if (value != null) {
                ip.c cVar2 = new ip.c(value.length());
                this.f49384d = cVar2;
                cVar2.b(value);
                this.f49385e = new u(0, this.f49384d.length());
                return;
            }
        }
    }

    private void b() {
        while (true) {
            if (!this.f49381a.hasNext() && this.f49385e == null) {
                return;
            }
            u uVar = this.f49385e;
            if (uVar == null || uVar.a()) {
                a();
            }
            if (this.f49385e != null) {
                while (!this.f49385e.a()) {
                    co.e eVarA = this.f49382b.a(this.f49384d, this.f49385e);
                    if (!eVarA.getName().isEmpty() || eVarA.getValue() != null) {
                        this.f49383c = eVarA;
                        return;
                    }
                }
                if (this.f49385e.a()) {
                    this.f49385e = null;
                    this.f49384d = null;
                }
            }
        }
    }

    @Override // co.f, java.util.Iterator
    public boolean hasNext() {
        if (this.f49383c == null) {
            b();
        }
        return this.f49383c != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        return nextElement();
    }

    @Override // co.f
    public co.e nextElement() {
        if (this.f49383c == null) {
            b();
        }
        co.e eVar = this.f49383c;
        if (eVar == null) {
            throw new NoSuchElementException("No more header elements available");
        }
        this.f49383c = null;
        return eVar;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }

    public d(co.g gVar) {
        this(gVar, g.f49392c);
    }
}
