package androidx.fragment.app;

import android.util.Log;
import com.android.vending.billing.fTvD.qEagQqzJZsd;
import com.mbridge.msdk.mbnative.report.RN.lkCBSIFlvmyGX;
import java.io.PrintWriter;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
final class a extends o0 implements f0.p {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final f0 f4038t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    boolean f4039u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    int f4040v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    boolean f4041w;

    a(f0 f0Var) {
        super(f0Var.x0(), f0Var.A0() != null ? f0Var.A0().f().getClassLoader() : null);
        this.f4040v = -1;
        this.f4041w = false;
        this.f4038t = f0Var;
    }

    void A() {
        for (int size = this.f4208c.size() - 1; size >= 0; size--) {
            o0.a aVar = (o0.a) this.f4208c.get(size);
            Fragment fragment = aVar.f4226b;
            if (fragment != null) {
                fragment.mBeingSaved = this.f4041w;
                fragment.setPopDirection(true);
                fragment.setNextTransition(f0.r1(this.f4213h));
                fragment.setSharedElementNames(this.f4222q, this.f4221p);
            }
            switch (aVar.f4225a) {
                case 1:
                    fragment.setAnimations(aVar.f4228d, aVar.f4229e, aVar.f4230f, aVar.f4231g);
                    this.f4038t.x1(fragment, true);
                    this.f4038t.k1(fragment);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f4225a);
                case 3:
                    fragment.setAnimations(aVar.f4228d, aVar.f4229e, aVar.f4230f, aVar.f4231g);
                    this.f4038t.j(fragment);
                    break;
                case 4:
                    fragment.setAnimations(aVar.f4228d, aVar.f4229e, aVar.f4230f, aVar.f4231g);
                    this.f4038t.D1(fragment);
                    break;
                case 5:
                    fragment.setAnimations(aVar.f4228d, aVar.f4229e, aVar.f4230f, aVar.f4231g);
                    this.f4038t.x1(fragment, true);
                    this.f4038t.K0(fragment);
                    break;
                case 6:
                    fragment.setAnimations(aVar.f4228d, aVar.f4229e, aVar.f4230f, aVar.f4231g);
                    this.f4038t.p(fragment);
                    break;
                case 7:
                    fragment.setAnimations(aVar.f4228d, aVar.f4229e, aVar.f4230f, aVar.f4231g);
                    this.f4038t.x1(fragment, true);
                    this.f4038t.z(fragment);
                    break;
                case 8:
                    this.f4038t.B1(null);
                    break;
                case 9:
                    this.f4038t.B1(fragment);
                    break;
                case 10:
                    this.f4038t.A1(fragment, aVar.f4232h);
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00b6  */
    Fragment B(ArrayList arrayList, Fragment fragment) {
        Fragment fragment2 = fragment;
        int i10 = 0;
        while (i10 < this.f4208c.size()) {
            o0.a aVar = (o0.a) this.f4208c.get(i10);
            int i11 = aVar.f4225a;
            if (i11 == 1) {
                arrayList.add(aVar.f4226b);
            } else if (i11 == 2) {
                Fragment fragment3 = aVar.f4226b;
                int i12 = fragment3.mContainerId;
                boolean z10 = false;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    Fragment fragment4 = (Fragment) arrayList.get(size);
                    if (fragment4.mContainerId == i12) {
                        if (fragment4 == fragment3) {
                            z10 = true;
                        } else {
                            if (fragment4 == fragment2) {
                                this.f4208c.add(i10, new o0.a(9, fragment4, true));
                                i10++;
                                fragment2 = null;
                            }
                            o0.a aVar2 = new o0.a(3, fragment4, true);
                            aVar2.f4228d = aVar.f4228d;
                            aVar2.f4230f = aVar.f4230f;
                            aVar2.f4229e = aVar.f4229e;
                            aVar2.f4231g = aVar.f4231g;
                            this.f4208c.add(i10, aVar2);
                            arrayList.remove(fragment4);
                            i10++;
                        }
                    }
                }
                if (z10) {
                    this.f4208c.remove(i10);
                    i10--;
                } else {
                    aVar.f4225a = 1;
                    aVar.f4227c = true;
                    arrayList.add(fragment3);
                }
            } else if (i11 == 3 || i11 == 6) {
                arrayList.remove(aVar.f4226b);
                Fragment fragment5 = aVar.f4226b;
                if (fragment5 == fragment2) {
                    this.f4208c.add(i10, new o0.a(9, fragment5));
                    i10++;
                    fragment2 = null;
                }
            } else if (i11 == 7) {
                arrayList.add(aVar.f4226b);
            } else if (i11 == 8) {
                this.f4208c.add(i10, new o0.a(9, fragment2, true));
                aVar.f4227c = true;
                i10++;
                fragment2 = aVar.f4226b;
            }
            i10++;
        }
        return fragment2;
    }

    public String C() {
        return this.f4216k;
    }

    public void D() {
        if (this.f4224s != null) {
            for (int i10 = 0; i10 < this.f4224s.size(); i10++) {
                ((Runnable) this.f4224s.get(i10)).run();
            }
            this.f4224s = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0027  */
    /* JADX WARN: Code duplicated, block: B:14:0x002d  */
    Fragment E(ArrayList arrayList, Fragment fragment) {
        for (int size = this.f4208c.size() - 1; size >= 0; size--) {
            o0.a aVar = (o0.a) this.f4208c.get(size);
            int i10 = aVar.f4225a;
            if (i10 == 1) {
                arrayList.remove(aVar.f4226b);
            } else if (i10 != 3) {
                switch (i10) {
                    case 6:
                        arrayList.add(aVar.f4226b);
                        break;
                    case 7:
                        arrayList.remove(aVar.f4226b);
                        break;
                    case 8:
                        fragment = null;
                        break;
                    case 9:
                        fragment = aVar.f4226b;
                        break;
                    case 10:
                        aVar.f4233i = aVar.f4232h;
                        break;
                }
            } else {
                arrayList.add(aVar.f4226b);
            }
        }
        return fragment;
    }

    @Override // androidx.fragment.app.f0.p
    public boolean a(ArrayList arrayList, ArrayList arrayList2) {
        if (f0.N0(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f4214i) {
            return true;
        }
        this.f4038t.i(this);
        return true;
    }

    @Override // androidx.fragment.app.o0
    public int g() {
        return w(false);
    }

    @Override // androidx.fragment.app.o0
    public int h() {
        return w(true);
    }

    @Override // androidx.fragment.app.o0
    public void i() {
        k();
        this.f4038t.e0(this, false);
    }

    @Override // androidx.fragment.app.o0
    public void j() {
        k();
        this.f4038t.e0(this, true);
    }

    @Override // androidx.fragment.app.o0
    void l(int i10, Fragment fragment, String str, int i11) {
        super.l(i10, fragment, str, i11);
        fragment.mFragmentManager = this.f4038t;
    }

    @Override // androidx.fragment.app.o0
    public boolean m() {
        return this.f4208c.isEmpty();
    }

    @Override // androidx.fragment.app.o0
    public o0 n(Fragment fragment) {
        f0 f0Var = fragment.mFragmentManager;
        if (f0Var == null || f0Var == this.f4038t) {
            return super.n(fragment);
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    @Override // androidx.fragment.app.o0
    public o0 r(Fragment fragment, androidx.lifecycle.s.b bVar) {
        if (fragment.mFragmentManager != this.f4038t) {
            throw new IllegalArgumentException("Cannot setMaxLifecycle for Fragment not attached to FragmentManager " + this.f4038t);
        }
        if (bVar == androidx.lifecycle.s.b.INITIALIZED && fragment.mState > -1) {
            throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + bVar + " after the Fragment has been created");
        }
        if (bVar != androidx.lifecycle.s.b.DESTROYED) {
            return super.r(fragment, bVar);
        }
        throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + bVar + ". Use remove() to remove the fragment from the FragmentManager and trigger its destruction.");
    }

    @Override // androidx.fragment.app.o0
    public o0 s(Fragment fragment) {
        f0 f0Var;
        if (fragment == null || (f0Var = fragment.mFragmentManager) == null || f0Var == this.f4038t) {
            return super.s(fragment);
        }
        throw new IllegalStateException("Cannot setPrimaryNavigation for Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("BackStackEntry{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f4040v >= 0) {
            sb2.append(" #");
            sb2.append(this.f4040v);
        }
        if (this.f4216k != null) {
            sb2.append(" ");
            sb2.append(this.f4216k);
        }
        sb2.append("}");
        return sb2.toString();
    }

    void u(int i10) {
        if (this.f4214i) {
            if (f0.N0(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i10);
            }
            int size = this.f4208c.size();
            for (int i11 = 0; i11 < size; i11++) {
                o0.a aVar = (o0.a) this.f4208c.get(i11);
                Fragment fragment = aVar.f4226b;
                if (fragment != null) {
                    fragment.mBackStackNesting += i10;
                    if (f0.N0(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + aVar.f4226b + " to " + aVar.f4226b.mBackStackNesting);
                    }
                }
            }
        }
    }

    void v() {
        int size = this.f4208c.size() - 1;
        while (size >= 0) {
            o0.a aVar = (o0.a) this.f4208c.get(size);
            if (aVar.f4227c) {
                if (aVar.f4225a == 8) {
                    aVar.f4227c = false;
                    this.f4208c.remove(size - 1);
                    size--;
                } else {
                    int i10 = aVar.f4226b.mContainerId;
                    aVar.f4225a = 2;
                    aVar.f4227c = false;
                    for (int i11 = size - 1; i11 >= 0; i11--) {
                        o0.a aVar2 = (o0.a) this.f4208c.get(i11);
                        if (aVar2.f4227c && aVar2.f4226b.mContainerId == i10) {
                            this.f4208c.remove(i11);
                            size--;
                        }
                    }
                }
            }
            size--;
        }
    }

    int w(boolean z10) {
        if (this.f4039u) {
            throw new IllegalStateException("commit already called");
        }
        if (f0.N0(2)) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new u0("FragmentManager"));
            x("  ", printWriter);
            printWriter.close();
        }
        this.f4039u = true;
        if (this.f4214i) {
            this.f4040v = this.f4038t.n();
        } else {
            this.f4040v = -1;
        }
        this.f4038t.b0(this, z10);
        return this.f4040v;
    }

    public void x(String str, PrintWriter printWriter) {
        y(str, printWriter, true);
    }

    void z() {
        int size = this.f4208c.size();
        for (int i10 = 0; i10 < size; i10++) {
            o0.a aVar = (o0.a) this.f4208c.get(i10);
            Fragment fragment = aVar.f4226b;
            if (fragment != null) {
                fragment.mBeingSaved = this.f4041w;
                fragment.setPopDirection(false);
                fragment.setNextTransition(this.f4213h);
                fragment.setSharedElementNames(this.f4221p, this.f4222q);
            }
            switch (aVar.f4225a) {
                case 1:
                    fragment.setAnimations(aVar.f4228d, aVar.f4229e, aVar.f4230f, aVar.f4231g);
                    this.f4038t.x1(fragment, false);
                    this.f4038t.j(fragment);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f4225a);
                case 3:
                    fragment.setAnimations(aVar.f4228d, aVar.f4229e, aVar.f4230f, aVar.f4231g);
                    this.f4038t.k1(fragment);
                    break;
                case 4:
                    fragment.setAnimations(aVar.f4228d, aVar.f4229e, aVar.f4230f, aVar.f4231g);
                    this.f4038t.K0(fragment);
                    break;
                case 5:
                    fragment.setAnimations(aVar.f4228d, aVar.f4229e, aVar.f4230f, aVar.f4231g);
                    this.f4038t.x1(fragment, false);
                    this.f4038t.D1(fragment);
                    break;
                case 6:
                    fragment.setAnimations(aVar.f4228d, aVar.f4229e, aVar.f4230f, aVar.f4231g);
                    this.f4038t.z(fragment);
                    break;
                case 7:
                    fragment.setAnimations(aVar.f4228d, aVar.f4229e, aVar.f4230f, aVar.f4231g);
                    this.f4038t.x1(fragment, false);
                    this.f4038t.p(fragment);
                    break;
                case 8:
                    this.f4038t.B1(fragment);
                    break;
                case 9:
                    this.f4038t.B1(null);
                    break;
                case 10:
                    this.f4038t.A1(fragment, aVar.f4233i);
                    break;
            }
        }
    }

    public void y(String str, PrintWriter printWriter, boolean z10) {
        String str2;
        if (z10) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f4216k);
            printWriter.print(" mIndex=");
            printWriter.print(this.f4040v);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f4039u);
            if (this.f4213h != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f4213h));
            }
            if (this.f4209d != 0 || this.f4210e != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f4209d));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f4210e));
            }
            if (this.f4211f != 0 || this.f4212g != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f4211f));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f4212g));
            }
            if (this.f4217l != 0 || this.f4218m != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f4217l));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f4218m);
            }
            if (this.f4219n != 0 || this.f4220o != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f4219n));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f4220o);
            }
        }
        if (this.f4208c.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = this.f4208c.size();
        for (int i10 = 0; i10 < size; i10++) {
            o0.a aVar = (o0.a) this.f4208c.get(i10);
            switch (aVar.f4225a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + aVar.f4225a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i10);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(aVar.f4226b);
            if (z10) {
                if (aVar.f4228d != 0 || aVar.f4229e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f4228d));
                    printWriter.print(qEagQqzJZsd.FbrxoEEjmNdGoE);
                    printWriter.println(Integer.toHexString(aVar.f4229e));
                }
                if (aVar.f4230f != 0 || aVar.f4231g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f4230f));
                    printWriter.print(lkCBSIFlvmyGX.oLRKFYscEyp);
                    printWriter.println(Integer.toHexString(aVar.f4231g));
                }
            }
        }
    }

    a(a aVar) {
        super(aVar.f4038t.x0(), aVar.f4038t.A0() != null ? aVar.f4038t.A0().f().getClassLoader() : null, aVar);
        this.f4040v = -1;
        this.f4041w = false;
        this.f4038t = aVar.f4038t;
        this.f4039u = aVar.f4039u;
        this.f4040v = aVar.f4040v;
        this.f4041w = aVar.f4041w;
    }
}
