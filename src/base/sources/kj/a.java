package kj;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f43412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f43413b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f43414c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f43415d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f43416e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f43417f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f43418g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f43419h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f43420i;

    public final int a() {
        return this.f43420i;
    }

    public final int b() {
        return this.f43419h;
    }

    public final int c() {
        return this.f43418g;
    }

    public final long d() {
        return this.f43416e;
    }

    public final int e() {
        return this.f43417f;
    }

    public final int f() {
        return this.f43415d;
    }

    public final int g() {
        return this.f43414c;
    }

    public final int h() {
        return this.f43412a;
    }

    public final int i() {
        return this.f43413b;
    }

    public final void j(ByteBuffer sps) {
        s.h(sps, "sps");
        tj.b bVar = new tj.b(tj.b.f53429d.a(sps, 2));
        bVar.f(16);
        bVar.a(4);
        byte bA = bVar.a(3);
        bVar.a(1);
        this.f43412a = bVar.a(2);
        this.f43413b = bVar.c() ? 1 : 0;
        this.f43414c = bVar.g(5);
        this.f43415d = bVar.e(32);
        this.f43416e = bVar.f(48);
        this.f43417f = bVar.a(8);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < bA; i10++) {
            arrayList.add(Boolean.valueOf(bVar.c()));
            arrayList2.add(Boolean.valueOf(bVar.c()));
        }
        if (bA > 0) {
            for (int i11 = bA; i11 < 9; i11++) {
                bVar.f(2);
            }
        }
        for (int i12 = 0; i12 < bA; i12++) {
            if (((Boolean) arrayList.get(i12)).booleanValue()) {
                bVar.f(32);
                bVar.f(32);
                bVar.f(24);
            }
            if (((Boolean) arrayList2.get(i12)).booleanValue()) {
                bVar.f(8);
            }
        }
        bVar.h();
        int iH = bVar.h();
        this.f43418g = iH;
        if (iH == 3) {
            bVar.c();
        }
        bVar.h();
        bVar.h();
        if (bVar.c()) {
            bVar.h();
            bVar.h();
            bVar.h();
            bVar.h();
        }
        this.f43419h = bVar.h();
        this.f43420i = bVar.h();
    }

    public final void k(byte[] sps) {
        s.h(sps, "sps");
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(sps);
        s.g(byteBufferWrap, "wrap(...)");
        j(byteBufferWrap);
    }
}
