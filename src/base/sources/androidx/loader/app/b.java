package androidx.loader.app;

import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import androidx.collection.v;
import androidx.lifecycle.b0;
import androidx.lifecycle.p0;
import androidx.lifecycle.p1;
import androidx.lifecycle.q0;
import androidx.lifecycle.s1;
import androidx.lifecycle.t1;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
class b extends androidx.loader.app.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static boolean f4568c = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b0 f4569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f4570b;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class a extends p0 implements androidx.loader.content.b.InterfaceC0052b {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final int f4571l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final Bundle f4572m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final androidx.loader.content.b f4573n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private b0 f4574o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private C0050b f4575p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private androidx.loader.content.b f4576q;

        a(int i10, Bundle bundle, androidx.loader.content.b bVar, androidx.loader.content.b bVar2) {
            this.f4571l = i10;
            this.f4572m = bundle;
            this.f4573n = bVar;
            this.f4576q = bVar2;
            bVar.registerListener(i10, this);
        }

        @Override // androidx.loader.content.b.InterfaceC0052b
        public void a(androidx.loader.content.b bVar, Object obj) {
            if (b.f4568c) {
                Log.v("LoaderManager", "onLoadComplete: " + this);
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                q(obj);
                return;
            }
            if (b.f4568c) {
                Log.w("LoaderManager", "onLoadComplete was incorrectly called on a background thread");
            }
            n(obj);
        }

        @Override // androidx.lifecycle.k0
        protected void l() {
            if (b.f4568c) {
                Log.v("LoaderManager", "  Starting: " + this);
            }
            this.f4573n.startLoading();
        }

        @Override // androidx.lifecycle.k0
        protected void m() {
            if (b.f4568c) {
                Log.v("LoaderManager", "  Stopping: " + this);
            }
            this.f4573n.stopLoading();
        }

        @Override // androidx.lifecycle.k0
        public void o(q0 q0Var) {
            super.o(q0Var);
            this.f4574o = null;
            this.f4575p = null;
        }

        @Override // androidx.lifecycle.p0, androidx.lifecycle.k0
        public void q(Object obj) {
            super.q(obj);
            androidx.loader.content.b bVar = this.f4576q;
            if (bVar != null) {
                bVar.reset();
                this.f4576q = null;
            }
        }

        androidx.loader.content.b r(boolean z10) {
            if (b.f4568c) {
                Log.v("LoaderManager", "  Destroying: " + this);
            }
            this.f4573n.cancelLoad();
            this.f4573n.abandon();
            C0050b c0050b = this.f4575p;
            if (c0050b != null) {
                o(c0050b);
                if (z10) {
                    c0050b.c();
                }
            }
            this.f4573n.unregisterListener(this);
            if ((c0050b == null || c0050b.b()) && !z10) {
                return this.f4573n;
            }
            this.f4573n.reset();
            return this.f4576q;
        }

        public void s(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.f4571l);
            printWriter.print(" mArgs=");
            printWriter.println(this.f4572m);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println(this.f4573n);
            this.f4573n.dump(str + "  ", fileDescriptor, printWriter, strArr);
            if (this.f4575p != null) {
                printWriter.print(str);
                printWriter.print("mCallbacks=");
                printWriter.println(this.f4575p);
                this.f4575p.a(str + "  ", printWriter);
            }
            printWriter.print(str);
            printWriter.print("mData=");
            printWriter.println(t().dataToString(f()));
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.println(h());
        }

        androidx.loader.content.b t() {
            return this.f4573n;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder(64);
            sb2.append("LoaderInfo{");
            sb2.append(Integer.toHexString(System.identityHashCode(this)));
            sb2.append(" #");
            sb2.append(this.f4571l);
            sb2.append(" : ");
            Class<?> cls = this.f4573n.getClass();
            sb2.append(cls.getSimpleName());
            sb2.append("{");
            sb2.append(Integer.toHexString(System.identityHashCode(cls)));
            sb2.append("}}");
            return sb2.toString();
        }

        void u() {
            b0 b0Var = this.f4574o;
            C0050b c0050b = this.f4575p;
            if (b0Var == null || c0050b == null) {
                return;
            }
            super.o(c0050b);
            j(b0Var, c0050b);
        }

        androidx.loader.content.b v(b0 b0Var, androidx.loader.app.a.InterfaceC0049a interfaceC0049a) {
            C0050b c0050b = new C0050b(this.f4573n, interfaceC0049a);
            j(b0Var, c0050b);
            q0 q0Var = this.f4575p;
            if (q0Var != null) {
                o(q0Var);
            }
            this.f4574o = b0Var;
            this.f4575p = c0050b;
            return this.f4573n;
        }
    }

    /* JADX INFO: renamed from: androidx.loader.app.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class C0050b implements q0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final androidx.loader.content.b f4577a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final androidx.loader.app.a.InterfaceC0049a f4578b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f4579c = false;

        C0050b(androidx.loader.content.b bVar, androidx.loader.app.a.InterfaceC0049a interfaceC0049a) {
            this.f4577a = bVar;
            this.f4578b = interfaceC0049a;
        }

        public void a(String str, PrintWriter printWriter) {
            printWriter.print(str);
            printWriter.print("mDeliveredData=");
            printWriter.println(this.f4579c);
        }

        boolean b() {
            return this.f4579c;
        }

        void c() {
            if (this.f4579c) {
                if (b.f4568c) {
                    Log.v("LoaderManager", "  Resetting: " + this.f4577a);
                }
                this.f4578b.onLoaderReset(this.f4577a);
            }
        }

        @Override // androidx.lifecycle.q0
        public void d(Object obj) {
            if (b.f4568c) {
                Log.v("LoaderManager", "  onLoadFinished in " + this.f4577a + ": " + this.f4577a.dataToString(obj));
            }
            this.f4579c = true;
            this.f4578b.onLoadFinished(this.f4577a, obj);
        }

        public String toString() {
            return this.f4578b.toString();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class c extends p1 {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final s1.c f4580d = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private v f4581b = new v();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f4582c = false;

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        static class a implements s1.c {
            a() {
            }

            @Override // androidx.lifecycle.s1.c
            public p1 a(Class cls) {
                return new c();
            }
        }

        c() {
        }

        static c l(t1 t1Var) {
            return (c) new s1(t1Var, f4580d).a(c.class);
        }

        @Override // androidx.lifecycle.p1
        protected void g() {
            super.g();
            int iO = this.f4581b.o();
            for (int i10 = 0; i10 < iO; i10++) {
                ((a) this.f4581b.p(i10)).r(true);
            }
            this.f4581b.c();
        }

        public void j(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.f4581b.o() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                String str2 = str + "    ";
                for (int i10 = 0; i10 < this.f4581b.o(); i10++) {
                    a aVar = (a) this.f4581b.p(i10);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(this.f4581b.k(i10));
                    printWriter.print(": ");
                    printWriter.println(aVar.toString());
                    aVar.s(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }

        void k() {
            this.f4582c = false;
        }

        a m(int i10) {
            return (a) this.f4581b.f(i10);
        }

        boolean n() {
            return this.f4582c;
        }

        void o() {
            int iO = this.f4581b.o();
            for (int i10 = 0; i10 < iO; i10++) {
                ((a) this.f4581b.p(i10)).u();
            }
        }

        void p(int i10, a aVar) {
            this.f4581b.l(i10, aVar);
        }

        void q() {
            this.f4582c = true;
        }
    }

    b(b0 b0Var, t1 t1Var) {
        this.f4569a = b0Var;
        this.f4570b = c.l(t1Var);
    }

    private androidx.loader.content.b e(int i10, Bundle bundle, androidx.loader.app.a.InterfaceC0049a interfaceC0049a, androidx.loader.content.b bVar) {
        try {
            this.f4570b.q();
            androidx.loader.content.b bVarOnCreateLoader = interfaceC0049a.onCreateLoader(i10, bundle);
            if (bVarOnCreateLoader == null) {
                throw new IllegalArgumentException("Object returned from onCreateLoader must not be null");
            }
            if (bVarOnCreateLoader.getClass().isMemberClass() && !Modifier.isStatic(bVarOnCreateLoader.getClass().getModifiers())) {
                throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + bVarOnCreateLoader);
            }
            a aVar = new a(i10, bundle, bVarOnCreateLoader, bVar);
            if (f4568c) {
                Log.v("LoaderManager", "  Created new loader " + aVar);
            }
            this.f4570b.p(i10, aVar);
            this.f4570b.k();
            return aVar.v(this.f4569a, interfaceC0049a);
        } catch (Throwable th2) {
            this.f4570b.k();
            throw th2;
        }
    }

    @Override // androidx.loader.app.a
    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f4570b.j(str, fileDescriptor, printWriter, strArr);
    }

    @Override // androidx.loader.app.a
    public androidx.loader.content.b c(int i10, Bundle bundle, androidx.loader.app.a.InterfaceC0049a interfaceC0049a) {
        if (this.f4570b.n()) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
        a aVarM = this.f4570b.m(i10);
        if (f4568c) {
            Log.v("LoaderManager", "initLoader in " + this + ": args=" + bundle);
        }
        if (aVarM == null) {
            return e(i10, bundle, interfaceC0049a, null);
        }
        if (f4568c) {
            Log.v("LoaderManager", "  Re-using existing loader " + aVarM);
        }
        return aVarM.v(this.f4569a, interfaceC0049a);
    }

    @Override // androidx.loader.app.a
    public void d() {
        this.f4570b.o();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("LoaderManager{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" in ");
        Class<?> cls = this.f4569a.getClass();
        sb2.append(cls.getSimpleName());
        sb2.append("{");
        sb2.append(Integer.toHexString(System.identityHashCode(cls)));
        sb2.append("}}");
        return sb2.toString();
    }
}
