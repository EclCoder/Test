package androidx.fragment.app;

import android.view.ViewGroup;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w f4206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ClassLoader f4207b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    ArrayList f4208c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f4209d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f4210e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f4211f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f4212g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    int f4213h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    boolean f4214i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    boolean f4215j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    String f4216k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    int f4217l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    CharSequence f4218m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f4219n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    CharSequence f4220o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    ArrayList f4221p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    ArrayList f4222q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    boolean f4223r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    ArrayList f4224s;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f4225a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Fragment f4226b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f4227c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f4228d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f4229e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f4230f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f4231g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        androidx.lifecycle.s.b f4232h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        androidx.lifecycle.s.b f4233i;

        a() {
        }

        a(int i10, Fragment fragment) {
            this.f4225a = i10;
            this.f4226b = fragment;
            this.f4227c = false;
            androidx.lifecycle.s.b bVar = androidx.lifecycle.s.b.RESUMED;
            this.f4232h = bVar;
            this.f4233i = bVar;
        }

        a(int i10, Fragment fragment, boolean z10) {
            this.f4225a = i10;
            this.f4226b = fragment;
            this.f4227c = z10;
            androidx.lifecycle.s.b bVar = androidx.lifecycle.s.b.RESUMED;
            this.f4232h = bVar;
            this.f4233i = bVar;
        }

        a(int i10, Fragment fragment, androidx.lifecycle.s.b bVar) {
            this.f4225a = i10;
            this.f4226b = fragment;
            this.f4227c = false;
            this.f4232h = fragment.mMaxState;
            this.f4233i = bVar;
        }

        a(a aVar) {
            this.f4225a = aVar.f4225a;
            this.f4226b = aVar.f4226b;
            this.f4227c = aVar.f4227c;
            this.f4228d = aVar.f4228d;
            this.f4229e = aVar.f4229e;
            this.f4230f = aVar.f4230f;
            this.f4231g = aVar.f4231g;
            this.f4232h = aVar.f4232h;
            this.f4233i = aVar.f4233i;
        }
    }

    o0(w wVar, ClassLoader classLoader) {
        this.f4208c = new ArrayList();
        this.f4215j = true;
        this.f4223r = false;
        this.f4206a = wVar;
        this.f4207b = classLoader;
    }

    public o0 b(int i10, Fragment fragment, String str) {
        l(i10, fragment, str, 1);
        return this;
    }

    o0 c(ViewGroup viewGroup, Fragment fragment, String str) {
        fragment.mContainer = viewGroup;
        return b(viewGroup.getId(), fragment, str);
    }

    public o0 d(Fragment fragment, String str) {
        l(0, fragment, str, 1);
        return this;
    }

    void e(a aVar) {
        this.f4208c.add(aVar);
        aVar.f4228d = this.f4209d;
        aVar.f4229e = this.f4210e;
        aVar.f4230f = this.f4211f;
        aVar.f4231g = this.f4212g;
    }

    public o0 f(String str) {
        if (!this.f4215j) {
            throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
        }
        this.f4214i = true;
        this.f4216k = str;
        return this;
    }

    public abstract int g();

    public abstract int h();

    public abstract void i();

    public abstract void j();

    public o0 k() {
        if (this.f4214i) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        this.f4215j = false;
        return this;
    }

    void l(int i10, Fragment fragment, String str, int i11) {
        String str2 = fragment.mPreviousWho;
        if (str2 != null) {
            j1.b.f(fragment, str2);
        }
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str3 = fragment.mTag;
            if (str3 != null && !str.equals(str3)) {
                throw new IllegalStateException("Can't change tag of fragment " + fragment + ": was " + fragment.mTag + " now " + str);
            }
            fragment.mTag = str;
        }
        if (i10 != 0) {
            if (i10 == -1) {
                throw new IllegalArgumentException("Can't add fragment " + fragment + " with tag " + str + " to container view with no id");
            }
            int i12 = fragment.mFragmentId;
            if (i12 != 0 && i12 != i10) {
                throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.mFragmentId + " now " + i10);
            }
            fragment.mFragmentId = i10;
            fragment.mContainerId = i10;
        }
        e(new a(i11, fragment));
    }

    public abstract boolean m();

    public o0 n(Fragment fragment) {
        e(new a(3, fragment));
        return this;
    }

    public o0 o(int i10, Fragment fragment) {
        return p(i10, fragment, null);
    }

    public o0 p(int i10, Fragment fragment, String str) {
        if (i10 == 0) {
            throw new IllegalArgumentException("Must use non-zero containerViewId");
        }
        l(i10, fragment, str, 2);
        return this;
    }

    public o0 q(int i10, int i11, int i12, int i13) {
        this.f4209d = i10;
        this.f4210e = i11;
        this.f4211f = i12;
        this.f4212g = i13;
        return this;
    }

    public o0 r(Fragment fragment, androidx.lifecycle.s.b bVar) {
        e(new a(10, fragment, bVar));
        return this;
    }

    public o0 s(Fragment fragment) {
        e(new a(8, fragment));
        return this;
    }

    public o0 t(boolean z10) {
        this.f4223r = z10;
        return this;
    }

    o0(w wVar, ClassLoader classLoader, o0 o0Var) {
        this(wVar, classLoader);
        ArrayList arrayList = o0Var.f4208c;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            this.f4208c.add(new a((a) obj));
        }
        this.f4209d = o0Var.f4209d;
        this.f4210e = o0Var.f4210e;
        this.f4211f = o0Var.f4211f;
        this.f4212g = o0Var.f4212g;
        this.f4213h = o0Var.f4213h;
        this.f4214i = o0Var.f4214i;
        this.f4215j = o0Var.f4215j;
        this.f4216k = o0Var.f4216k;
        this.f4219n = o0Var.f4219n;
        this.f4220o = o0Var.f4220o;
        this.f4217l = o0Var.f4217l;
        this.f4218m = o0Var.f4218m;
        if (o0Var.f4221p != null) {
            ArrayList arrayList2 = new ArrayList();
            this.f4221p = arrayList2;
            arrayList2.addAll(o0Var.f4221p);
        }
        if (o0Var.f4222q != null) {
            ArrayList arrayList3 = new ArrayList();
            this.f4222q = arrayList3;
            arrayList3.addAll(o0Var.f4222q);
        }
        this.f4223r = o0Var.f4223r;
    }
}
