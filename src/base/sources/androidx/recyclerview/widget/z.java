package androidx.recyclerview.widget;

import android.view.View;
import com.vungle.ads.internal.protos.Sdk$SDKError;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final b f7069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    a f7070b = new a();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f7071a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f7072b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f7073c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f7074d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f7075e;

        a() {
        }

        void a(int i10) {
            this.f7071a = i10 | this.f7071a;
        }

        boolean b() {
            int i10 = this.f7071a;
            if ((i10 & 7) != 0 && (i10 & c(this.f7074d, this.f7072b)) == 0) {
                return false;
            }
            int i11 = this.f7071a;
            if ((i11 & Sdk$SDKError.b.ASSET_REQUEST_ERROR_VALUE) != 0 && (i11 & (c(this.f7074d, this.f7073c) << 4)) == 0) {
                return false;
            }
            int i12 = this.f7071a;
            if ((i12 & 1792) != 0 && (i12 & (c(this.f7075e, this.f7072b) << 8)) == 0) {
                return false;
            }
            int i13 = this.f7071a;
            return (i13 & 28672) == 0 || (i13 & (c(this.f7075e, this.f7073c) << 12)) != 0;
        }

        int c(int i10, int i11) {
            if (i10 > i11) {
                return 1;
            }
            return i10 == i11 ? 2 : 4;
        }

        void d() {
            this.f7071a = 0;
        }

        void e(int i10, int i11, int i12, int i13) {
            this.f7072b = i10;
            this.f7073c = i11;
            this.f7074d = i12;
            this.f7075e = i13;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    interface b {
        View a(int i10);

        int b(View view);

        int c();

        int d();

        int e(View view);
    }

    z(b bVar) {
        this.f7069a = bVar;
    }

    View a(int i10, int i11, int i12, int i13) {
        int iC = this.f7069a.c();
        int iD = this.f7069a.d();
        int i14 = i11 > i10 ? 1 : -1;
        View view = null;
        while (i10 != i11) {
            View viewA = this.f7069a.a(i10);
            this.f7070b.e(iC, iD, this.f7069a.b(viewA), this.f7069a.e(viewA));
            if (i12 != 0) {
                this.f7070b.d();
                this.f7070b.a(i12);
                if (this.f7070b.b()) {
                    return viewA;
                }
            }
            if (i13 != 0) {
                this.f7070b.d();
                this.f7070b.a(i13);
                if (this.f7070b.b()) {
                    view = viewA;
                }
            }
            i10 += i14;
        }
        return view;
    }

    boolean b(View view, int i10) {
        this.f7070b.e(this.f7069a.c(), this.f7069a.d(), this.f7069a.b(view), this.f7069a.e(view));
        if (i10 == 0) {
            return false;
        }
        this.f7070b.d();
        this.f7070b.a(i10);
        return this.f7070b.b();
    }
}
